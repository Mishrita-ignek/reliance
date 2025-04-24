package com.mail.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSend {
	public String to = new String();
	public String from = new String();
	public String cc = new String();
	public String bcc = new String();
	public String subject = new String();
	public String Text = new String();
	public String File1 = new String();
	public String File2 = new String();

	// public static String smtpserver="10.8.55.80"; /*Production Server*/
	public static String smtpserver = "10.8.53.82"; /* QA Server */

	public static String complaintmailmsg = "Reliance Infrastructure";

	public boolean sendMail(String Subject, String message, String tomailid, String frommailid) {
		boolean flag = false;
		try {
			this.to = tomailid;
			// this.bcc = "Mukesh.Patidar@relianceada.com"; // QA
			this.bcc = "";
			this.from = frommailid;
			this.subject = Subject;
			this.Text = message;

			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			System.out.println("SMTP Server " + smtpserver);
			System.out.println("to " + this.to);
			System.out.println("from " + this.from);

			Session session = Session.getInstance(props, null);
			session.setDebug(false);

			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.to, false));
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(this.bcc, false));
			msg.setSubject(this.subject);
			msg.setContent(this.Text, "text/html");
			msg.setSentDate(new Date());

			Transport.send(msg);
			flag = true;
			System.out.println("mail send method execute");
		} catch (Exception e) {
			System.out.println("Exception ...." + e);
		}
		return flag;
	}

}