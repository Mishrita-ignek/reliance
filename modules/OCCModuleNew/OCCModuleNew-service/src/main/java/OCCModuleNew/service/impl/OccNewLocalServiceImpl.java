/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package OCCModuleNew.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.occ.mail.util.MailSend;
import com.occ.mail.util.SmsSendUtil;

import OCCModuleNew.model.OccNew;
import OCCModuleNew.service.base.OccNewLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the occ new local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link OCCModuleNew.service.OccNewLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Harshal Gadkari
 * @see OccNewLocalServiceBaseImpl
 * @see OCCModuleNew.service.OccNewLocalServiceUtil
 */
@ProviderType
public class OccNewLocalServiceImpl extends OccNewLocalServiceBaseImpl {
	
	private static Log log = LogFactoryUtil.getLog(OccNewLocalServiceImpl.class);
	boolean smsSendStatus=false ;
	public int sendMail(String msg, String listName){
		int result = 0;
		log.info("OccLocalServiceImpl.sendMail()");
		List<String> emailList = new ArrayList<String>(); 
		List<Long> mobilelList = new ArrayList<Long>(); 
		//List<OccNew> list = occFinder.getList(listName);
		List<OccNew> list =occNewFinder.getList1(listName);
		int length = msg.length();
		String subject;
		if(length <=20){
			subject = msg.substring(0, length);
		}else{
			subject = msg.substring(0, 20);
		}
		
		if(list != null){
			for (OccNew occ : list) {
				String emailId = occ.getEmail().toString();
				Long mobile = occ.getMobileNo();
				emailList.add(emailId);
				mobilelList.add(mobile);
			}
		}
		
		String emails = String.join(",", emailList);
		log.info("String :: "+emails);
		/*---------------------------Mail send code-------------------------------------------*/
		boolean mailsendStatus=false ;
		//String Name;
		String tomailid;
		String frommailid;
		StringBuffer sb;
		tomailid = emails;
		frommailid = "depot.occ@reliancemumbaimetro.com";          //  occ@reliancemumbaimetro.com 
		sb = new StringBuffer();
		
		try {
		MailSend mailsend = new MailSend();
		String Subject = subject;      // staging
		//String Subject = subject;   // live
		Calendar calendar = new GregorianCalendar();
		String addrIP = null;
		if (addrIP != null && !addrIP.trim().equals("")) {
			addrIP = (new StringBuilder(" [IP Address : ")).append(addrIP).append("]").toString();
		} else {
			addrIP = "";
		}
		sb.append("<html><body><font face='Verdana' size='2'><table><tr><td>");
		sb.append(msg).toString();	
		sb.append("</tr></td></table></body></html>");
		String message = (new StringBuilder()).append(sb.toString()).toString();
		String ccmailid = "";

		log.info("tomailid >> " + tomailid);
		log.info("frommailid  : >> " + frommailid);
		log.info("Subject >> " + Subject);
		log.info("message >> " + message);
		
		mailsendStatus = mailsend.sendMail(Subject, message, tomailid, frommailid);
		
		
		} catch (Exception e) {
			log.error(e);
		}
		SmsSendUtil smsSendUtil = new SmsSendUtil();
		smsSendStatus = smsSendUtil.smsSend(mobilelList, msg);
		if (mailsendStatus) {
			result = 1;
		} else {
			result = 0;
		}
		if (smsSendStatus) {
			System.out.println(" Message Send Successfull ");
		} else {
			System.out.println(" Message send failed ");
		}
		return result;
	}
	
	public List<OccNew> getList(String listName){
		System.out.println("OccLocalServiceImpl.getList()");
		List<OccNew> emailList = occNewFinder.getList1(listName);
		return emailList;
	}
}