package com.occ.mail.util;

import java.io.IOException;
import java.util.List;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;




public class SmsSendUtil {
	private static Log log=LogFactoryUtil.getLog(SmsSendUtil.class);
	
	public boolean smsSend(List<Long> mobList, String msg){
			boolean status = true;
			int count =1;
			log.info("Mobile No : "+mobList);
			for (Long mobile : mobList) {
				msg = msg.replaceAll(" ", "%20");
				String url="http://10.8.62.48:8080/occSendSmsService/sendOCCSMS?mobileNo="+mobile+"&msg="+msg;
				//String url="http://10.8.49.195:8080/occSendSmsService/sendOCCSMS?mobileNo="+mobile+"&msg="+msg;
				log.info(count+" || OCC SMS URL = " + url);
				count++;
				HttpClient client = new HttpClient();
				log.info("client :: "+client);
				GetMethod method = new GetMethod(url);
				method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,new DefaultHttpMethodRetryHandler(3,false));
				log.info(method.getParams().toString());
				
				try {
					int statusCode = client.executeMethod(method);
					log.info("statusCode ::" +statusCode);
					if (statusCode != HttpStatus.SC_OK) {
						log.info("Method failed: " + method.getStatusLine());
						status = false;
					}
					byte[] responseBody = method.getResponseBody();
					log.info(new String(responseBody));
				} catch (HttpException e) {
					log.info("Fatal protocol violation: "+ e.getMessage());
					e.printStackTrace();
					status = false;
				} catch (IOException e) {
					log.info("Fatal transport error: "+ e.getMessage());
					e.printStackTrace();
					status = false;
				} finally {
					log.info("SmsSendUtil.smsSend():: finally block");
					method.releaseConnection();
				}
			}
		return status;
	}
}
