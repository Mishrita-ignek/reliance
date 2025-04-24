package com.relianceada.energy.portal.email.api;

import java.io.File;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

public interface EmailApi {
	/**
	 * @author alok.pal
	 * @param from
	 * @param to
	 * @param subject
	 * @param body
	 */
	void sendEmail(String from, String to, String subject, String body);
	/**
	 * @author alok.pal
	 * @param from
	 * @param to
	 * @param subject
	 * @param out  here out is writer object in which hashMap is added to pass in ftl file
	 */
	void sendEmailWithTemplate(String from, String to, String subject, Writer out);
	
	void sendEmail(String from, String to, String subject, String body,File fileName);
	
	void sendEmailWithTemplateAndAttachement(String from, String to, String subject, Writer out, File file);
	
	public StringWriter getWriterObject(String templateName, Map<String,Object> hashMap);
	
	boolean sendEmailForForgotUser(String from, String to, String subject, String body);
	
	void reportSendEmailWithTemplateAndAttachement(String from, String to, String bcc, String subject, Writer out, File fileName);
}