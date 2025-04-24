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

package com.reliance.reality.service.impl;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.mail.util.MailSend;
import com.reliance.reality.model.RelianceReality;
import com.reliance.reality.service.RelianceRealityLocalServiceUtil;
import com.reliance.reality.service.base.RelianceRealityLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the reliance reality local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.reliance.reality.service.RelianceRealityLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RelianceRealityLocalServiceBaseImpl
 * @see com.reliance.reality.service.RelianceRealityLocalServiceUtil
 */
@ProviderType
public class RelianceRealityLocalServiceImpl extends RelianceRealityLocalServiceBaseImpl {

	private static Log log = LogFactoryUtil.getLog(RelianceRealityLocalServiceImpl.class);

	public void saveRelianceRealityForm(RelianceReality relianceReality) {

		RelianceRealityLocalServiceUtil.addRelianceReality(relianceReality);
		

	}

	public List<RelianceReality> getExistRecord(String empCode, String propertyId) {
		return relianceRealityFinder.getExistRecord(empCode, propertyId);
	}

	public boolean sendMail(String msg, String frommailid, String tomailid, String subject) {
		/*---------------------------Mail send code-------------------------------------------*/
		boolean mailsendStatus = false;

		StringBuffer sb;

		sb = new StringBuffer();

		try {
			MailSend mailsend = new MailSend();

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
			log.info("Subject >> " + subject);
			log.info("message >> " + message);

			mailsendStatus = mailsend.sendMail(subject, message, tomailid, frommailid);
		} catch (Exception e) {
			log.error(e);
		}
		return mailsendStatus;

	}

}