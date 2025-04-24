package com.relianceada.energy.portal.email.service;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;

import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.relianceada.energy.portal.email.api.EmailApi;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

@Component(
	immediate = true,
	property = {
	},
	service = EmailApi.class
)
public class EmailServiceImpl implements EmailApi {

	private static final Log log = LogFactoryUtil.getLog(EmailServiceImpl.class);
	private static final String ERROR_MESSAGE = "EmailServiceImpl : Error in sendEmail method.";
	@Override
	public void sendEmail(String from, String to, String subject, String body) {
		if(log.isDebugEnabled()){
			log.debug("Sending an email...FROM="+ from +" TO="+to);
		}
		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			mailMessage.setSubject(subject);
			mailMessage.setBody(body);
			mailMessage.setHTMLFormat(true);
			log.info("EmailServiceImpl.sendEmail() - "+mailMessage.getSMTPAccount().getPort()+" | "+mailMessage.getSMTPAccount().getHost());
			
			MailServiceUtil.sendEmail(mailMessage);	
		} catch (Exception e) {
			log.error(ERROR_MESSAGE +e);	
		}
		
	}
	
	@Override
	public boolean sendEmailForForgotUser(String from, String to, String subject, String body) {
		log.info("EmailServiceImpl.sendEmailForForgotUser()");
		boolean emailSend = false;
		if(log.isDebugEnabled()){
			log.debug("Sending an email...FROM="+ from +" TO="+to);
		}
		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			mailMessage.setSubject(subject);
			mailMessage.setBody(body);
			mailMessage.setHTMLFormat(true);
			log.info("EmailServiceImpl.sendEmail() - "+mailMessage.getSMTPAccount().getPort()+" | "+mailMessage.getSMTPAccount().getHost());
			MailServiceUtil.sendEmail(mailMessage);	
			emailSend = true;
		} catch (Exception e) {
			log.error(ERROR_MESSAGE +e);	
		}
		return emailSend;
		
	}

	@Override
	public void sendEmail(String from, String to, String subject, String body, File fileName) {
		
		
		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			mailMessage.setSubject(subject);
			mailMessage.setBody(body);
			mailMessage.setHTMLFormat(true);
			//File Attachement
		    if (Validator.isNotNull(fileName)) {
		    	mailMessage.addFileAttachment(fileName);
			}
			MailServiceUtil.sendEmail(mailMessage);	
			
		} catch (Exception e) {
			log.error("EmailServiceImpl: sendEmail method sending with file Attachement."+e);	
		}
	}

	@Override
	public void sendEmailWithTemplate(String from, String to, String subject, Writer out) {
		if(log.isDebugEnabled()){
			log.debug("sendEmailWithHtml an email FROM="+ from +" TO="+to);
		}
		String bcc="sumit.panjiyar@relianceada.com";
		String cc="mukesh.patidar@relianceada.com";
		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			mailMessage.setBCC(new InternetAddress(bcc));
			mailMessage.setCC(new InternetAddress(cc));
			mailMessage.setSubject(subject);
			mailMessage.setBody(out.toString());
			mailMessage.setHTMLFormat(true);
			MailServiceUtil.sendEmail(mailMessage);	
			
		} catch (Exception e) {
			log.error(ERROR_MESSAGE +e);	
		}
		
	}

	@Override
	public void sendEmailWithTemplateAndAttachement(String from, String to, String subject, Writer out, File fileName) {
		if(log.isDebugEnabled()){
			log.debug("sendEmailWithHtml an email..FROM="+ from +" TO="+to);
		}
		//String bcc="mukesh.patidar@relianceada.com";
		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			//mailMessage.setBCC(new InternetAddress(bcc));
			mailMessage.setSubject(subject);
			mailMessage.setBody(out.toString());
			mailMessage.setHTMLFormat(true);
			//File Attachement
		    if (Validator.isNotNull(fileName)) {
		    	mailMessage.addFileAttachment(fileName);
			}
			MailServiceUtil.sendEmail(mailMessage);	
			log.info("sendEmailWithHtml an email...FROM="+ from +" TO="+to);
		} catch (Exception e) {
			log.error(ERROR_MESSAGE +e);	
		}
		
	}
	
	@Override
	public void reportSendEmailWithTemplateAndAttachement(String from, String to, String bcc, String subject, Writer out, File fileName) {
		if(log.isDebugEnabled()){
			log.debug("sendEmailWithHtml an email..FROM="+ from +" TO="+to);
		}
		MailMessage mailMessage = new MailMessage();
		try {
			mailMessage.setTo(new InternetAddress(to));
			mailMessage.setFrom(new InternetAddress(from));
			mailMessage.setBCC(new InternetAddress(bcc));
			mailMessage.setSubject(subject);
			mailMessage.setBody(out.toString());
			mailMessage.setHTMLFormat(true);
			//File Attachement
		    if (Validator.isNotNull(fileName)) {
		    	mailMessage.addFileAttachment(fileName);
			}
			MailServiceUtil.sendEmail(mailMessage);	
			log.info("sendEmailWithHtml an email...FROM="+ from +" TO="+to);
		} catch (Exception e) {
			log.error(ERROR_MESSAGE +e);	
		}
		
	}

	
	/**
	 * This method return Writer Object to used in Email template
	 * @author alok.pal
	 * @return
	 */
	
	public StringWriter getWriterObject(String templateName, Map<String,Object> hashMap) {
		// freemarker stuff.
		StringWriter out = new StringWriter();
		try {
			Configuration cfg = new Configuration();
			cfg.setClassForTemplateLoading(EmailApi.class, "/templates");
			cfg.setObjectWrapper(new DefaultObjectWrapper());
			Template temp = cfg.getTemplate(templateName);
			temp.process(hashMap, out);
			// freemarker stuff ends.
		} catch (Exception e) {
			log.error("Error occured in getWriterObject method "+e);
		}
		return out;
	}
}