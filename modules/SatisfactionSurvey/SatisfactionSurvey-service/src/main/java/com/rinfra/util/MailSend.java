package com.rinfra.util;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailSend {
	public String to = new String();
	public String from = new String();
	public String cc = new String();
	public String bcc = new String();
	public String subject = new String();
	public String Text = new String();
	public String File1 = new String();
	public String File2 = new String();
	public static final String PORTALPROPERTIES = "com.video.Portal";
	public static String smtpserver = "10.8.55.80";
	public static String complaintmailmsg = "Reliance Infrastructure";

	public boolean sendMail(String Subject, String message, String tomailid, String frommailid) {
		boolean flag = false;
		try {
			this.to = tomailid;
			this.bcc = "Sebastin.Raja@relianceada.com";
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
		} catch (Exception e) {
			System.out.println("Exception ...." + e);
		}
		return flag;
	}

	public boolean complaintmail_one(String Subject, String message, String tomailid, String frommailid) {
		boolean flag = false;
		try {
			smtpserver = "10.8.55.80";

			System.out.println("smtpserver chittaRanzn::>> " + smtpserver);
			String Address = tomailid;
			InternetAddress[] to = InternetAddress.parse(Address, false);
			this.from = frommailid;

			this.cc = "";
			this.bcc = "";
			this.subject = Subject;
			this.Text = message;
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			msg.setRecipients(Message.RecipientType.TO, to);
			msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(this.cc, false));
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(this.bcc, false));
			msg.setSubject(this.subject);
			msg.setSentDate(new Date());

			Multipart mp = new MimeMultipart();
			MimeBodyPart mbpl = new MimeBodyPart();

			mp.addBodyPart(mbpl);
			msg.setContent(this.Text, "text/html");

			Transport.send(msg);
			flag = true;
		} catch (Exception e) {
			System.out.println("Exception ...." + e);
		}
		return flag;
	}

	public boolean complaintmail(String Subject, String message, String tomailid, String frommailid) {
		boolean flag = false;
		try {
			smtpserver = "10.8.55.80";

			System.out.println("smtpserver " + smtpserver);
			this.to = tomailid;
			this.from = frommailid;

			this.cc = "";
			this.bcc = "";
			this.subject = Subject;
			this.Text = message;
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.to, false));
			msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(this.cc, false));
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(this.bcc, false));
			msg.setSubject(this.subject);
			msg.setSentDate(new Date());

			Multipart mp = new MimeMultipart();
			MimeBodyPart mbpl = new MimeBodyPart();

			mp.addBodyPart(mbpl);
			msg.setContent(this.Text, "text/html");

			Transport.send(msg);
			flag = true;
		} catch (Exception e) {
			System.out.println("Exception ...." + e);
		}
		return flag;
	}

	public boolean contactusmail(String Subject, String message, String tomailid, String ccmailid, String bccmailid,
			String frommailid) {
		boolean flag = false;
		try {
			this.to = tomailid;
			this.from = frommailid;
			this.cc = ccmailid;
			this.bcc = bccmailid;
			this.subject = Subject;
			this.Text = message;

			smtpserver = "10.8.55.80";

			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);

			Session session = Session.getInstance(props, null);
			session.setDebug(false);

			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			System.out.println("from>>>>" + this.from);
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.to, false));
			System.out.println("to >>>>>>" + this.to);
			msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(this.cc, false));
			System.out.println("cc >>>>" + this.cc);
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(this.bcc, false));
			System.out.println("bcc>>>> " + this.bcc);
			msg.setSubject(this.subject);

			msg.setSentDate(new Date());

			msg.setContent(this.Text, "text/html");
			Transport.send(msg);

			flag = true;
		} catch (Exception e) {
			System.out.println("Exception ...." + e);
		}
		return flag;
	}

	public boolean clientmail(String Subject, String message1, String tomailid, String frommailid) {
		boolean flag = false;
		try {
			System.out.println("cliens mail==" + smtpserver);
			this.to = frommailid;
			this.from = tomailid;

			this.cc = "";
			this.bcc = "";
			this.subject = Subject;
			this.Text = message1;
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.to, false));
			msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(this.cc, false));
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(this.bcc, false));
			msg.setSubject(this.subject);
			msg.setSentDate(new Date());

			Multipart mp = new MimeMultipart();
			MimeBodyPart mbpl = new MimeBodyPart();
			mbpl.setText(this.Text);
			mp.addBodyPart(mbpl);

			msg.setContent(mp);
			Transport.send(msg);
			flag = true;
			System.out.println("cliens mail" + flag);
		} catch (Exception e) {
			System.out.println("Exception ...." + e);
		}
		return flag;
	}

	public boolean mailtoxml(String email, String filename1, String filename2, String fromid) {
		boolean flag = false;
		try {
			this.to = email;
			if (!fromid.equals(null)) {
				this.from = fromid;
			} else {
				this.from = "notgiven";
			}
			this.cc = "";
			this.bcc = "";
			this.subject = "Complaint";
			this.Text = complaintmailmsg;
			this.File1 = filename1;
			this.File2 = filename2;
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.to, false));
			msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(this.cc, false));
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(this.bcc, false));
			msg.setSubject(this.subject);
			msg.setSentDate(new Date());

			Multipart mp = new MimeMultipart();
			MimeBodyPart mbpl = new MimeBodyPart();
			mbpl.setText(this.Text);
			mp.addBodyPart(mbpl);
			if (this.File1.trim().compareTo("") != 0) {
				MimeBodyPart mbp2 = new MimeBodyPart();
				FileDataSource fds1 = new FileDataSource(this.File1);

				DataHandler dh1 = new DataHandler(fds1);
				mbp2.setDataHandler(dh1);
				mbp2.setFileName(fds1.getName());
				mp.addBodyPart(mbp2);
			}
			if (this.File1.trim().compareTo("") != 0) {
				MimeBodyPart mbp3 = new MimeBodyPart();
				FileDataSource fds2 = new FileDataSource(this.File2);
				DataHandler dh2 = new DataHandler(fds2);
				mbp3.setDataHandler(dh2);
				mbp3.setFileName(fds2.getName());
				mp.addBodyPart(mbp3);
			}
			msg.setContent(mp);
			Transport.send(msg);
			flag = true;
		} catch (Exception e) {
			System.out.println("Exception ...." + e);
		}
		return flag;
	}

	public boolean sendBulkmail(String Subject, String message, String frommailid, String tomailid) {
		boolean flag = false;
		try {
			this.to = tomailid;
			this.from = frommailid;

			this.subject = Subject;
			this.Text = message;
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(this.to, false));
			msg.setSubject(this.subject);
			msg.setSentDate(new Date());

			msg.setContent(this.Text, "text/html");
			Transport.send(msg);
			flag = true;
		} catch (Exception e) {
			System.out.println("Exception ....kapil" + e);
		}
		return flag;
	}

	public boolean mailWithAttachment(String subject, String messageText, String to, String from, String filename) {
		boolean result = false;
		try {
			smtpserver = "10.8.55.80";
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(subject);
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText(messageText);
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);

			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			Transport.send(message);
			result = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public boolean contactusmail1(String Subject, String message, String tomailid, String ccmailid, String bccmailid,
			String frommailid) {
		boolean flag = false;
		try {
			if (bccmailid.equals("")) {
				this.bcc = "";
			} else {
				this.bcc = bccmailid;
				System.out.println("bccmailid " + this.bcc);
			}
			String to = tomailid;

			smtpserver = "10.8.55.80";
			this.from = frommailid;
			this.cc = ccmailid;

			String Address = this.cc;

			InternetAddress[] cc1 = InternetAddress.parse(Address, false);

			this.subject = Subject;
			this.Text = message;
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(this.from));
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to, false));
			msg.setRecipients(Message.RecipientType.CC, cc1);
			msg.setRecipients(Message.RecipientType.BCC, InternetAddress.parse(this.bcc, false));
			msg.setSubject(this.subject);
			msg.setSentDate(new Date());
			msg.setContent(this.Text, "text/html");
			Transport.send(msg);
			flag = true;
		} catch (Exception e) {
			System.out.println("Exception ...." + e.toString());
		}
		return flag;
	}

	public boolean mailWithAttachment11(String subject, String messageText, String to, String from, String filename) {
		boolean result = false;
		try {
			smtpserver = "10.8.55.80";

			Properties props = new Properties();
			props.put("mail.smtp.host", smtpserver);
			Session session = Session.getInstance(props, null);
			session.setDebug(false);

			Message message = new MimeMessage(session);

			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject(subject);

			MimeBodyPart messageBodyPart = new MimeBodyPart();

			messageBodyPart.setText(messageText);
			messageBodyPart.setContent(messageText, "text/html");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);
			messageBodyPart = new MimeBodyPart();
			DataSource source = new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			message.setContent(multipart);
			message.saveChanges();
			Transport.send(message);

			result = true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
