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

package com.rinfra.satisfactionsurvey.service.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rinfra.satisfactionsurvey.model.Shareholders;
import com.rinfra.satisfactionsurvey.model.impl.ShareholdersImpl;
import com.rinfra.satisfactionsurvey.service.base.ShareholdersLocalServiceBaseImpl;
import com.rinfra.util.MailSend;

/**
 * The implementation of the shareholders local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.rinfra.satisfactionsurvey.service.ShareholdersLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Mukesh
 * @see ShareholdersLocalServiceBaseImpl
 * @see com.rinfra.satisfactionsurvey.service.ShareholdersLocalServiceUtil
 */
@ProviderType
public class ShareholdersLocalServiceImpl extends ShareholdersLocalServiceBaseImpl {

	private static Log log = LogFactoryUtil.getLog(ShareholdersLocalServiceImpl.class);

	public int saveShareholdersSurvey(Long ShareholdersId, String soleName, Long actualId, Long clientIdNo,
			Long mobileNo, Long telephoneNo, String emailId, String responce, String responce1, String responce2,
			String responce3, String GRIEVANCE, String description, String comments) {

		boolean flag = false;
		String tomailid = "mis.radag@karvy.com";
		String fromMailId;

		log.info("ShareholdersLocalServiceImpl.saveShareholdersSurvey()");
		/*Shareholders shareholders = new ShareholdersImpl();
		shareholders.setSOLE_NAME(soleName);
		shareholders.setSOLE_ID(actualId);
		shareholders.setID_NUMBER(clientIdNo);
		shareholders.setMOBILE(mobileNo);
		shareholders.setTELEPHONE(telephoneNo);
		shareholders.setEMAIL(emailId);
		shareholders.setQUERY_RESPONSE(responce);
		shareholders.setOVERALL_RATING(responce1);
		shareholders.setCOMP_INFORMATION(responce2);
		shareholders.setQUALITY_REPORT(responce3);
		shareholders.setDESCRIPTION(description);
		shareholders.setCOMMENTS(comments);
		shareholders.setGRIEVANCE(GRIEVANCE);*/

		try {
			//updateShareholders(shareholders);
			//addShareholders(shareholders);

			/*------------- mail send code---------------*/
			String message = "<html><body><h3><center><strong>Shareholders Satisfaction Survey 2017 - Response</strong> </center></h3>  <table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\"><tr><td bgcolor=\"#CCCCCC\"><table width=\"600\" border=\"0\" cellspacing=\"1\" cellpadding=\"4\"><tr bgcolor=\"#FFFFFF\"><td width=\"40%\">Name of sole / first holder</td><td>"
					+ soleName + "</td></tr><tr bgcolor=\"#FFFFFF\"><td >" + "Folio Number / DP ID No.</td><td>"
					+ actualId + "</td></tr><tr bgcolor=\"#FFFFFF\">" + "<td >Client ID No</td><td>" + clientIdNo
					+ "</td></tr><tr bgcolor=\"#FFFFFF\"> <td >" + "Mobile No.</td><td>" + mobileNo + "</td>"
					+ "</tr><tr bgcolor=\"#FFFFFF\"><td >Telephone No.</td><td>" + telephoneNo
					+ "</td> </tr><tr bgcolor=\"#FFFFFF\">" + "<td >e-mail</td><td>" + emailId
					+ "</td> </tr><tr bgcolor=\"#FFFFFF\">"
					+ "<td colspan = 2><b>Rating of Services</b></td></tr><tr bgcolor=\"#FFFFFF\"> <td >Responses to queries/complaints</td><td>"
					+ responce + "</td></tr>" + "<tr bgcolor=\"#FFFFFF\"> <td >"
					+ "Your Overall rating of our investor service</td><td>" + responce1
					+ "</td> </tr><tr bgcolor=\"#FFFFFF\"> <td >Presentation of information on Company’s </td>" + "<td>"
					+ responce2 + "</td> </tr><tr bgcolor=\"#FFFFFF\">"
					+ "<td >Quality & Contents of Annual Report (2015-16)</td><td>" + responce3
					+ "</td> </tr><tr bgcolor=\"#FFFFFF\"> <td >Do you have any grievance which has not been addressed so far</td>"
					+ "<td>" + description + "</td>" + "</tr><tr bgcolor=\"#FFFFFF\"> <td >Suggestions / Comments</td>"
					+ "<td>" + comments + "</td> </tr></table></td></tr></table></body></html> ";

			if ((emailId != null) && (emailId.length() > 0)) {
				fromMailId = emailId;
			} else {
				fromMailId = "rinfra.investors@relianceada.com";
			}
			log.info(message);
			flag = new MailSend().sendMail("Rinfra - Shareholders Satisfaction Survey 2017 - Response Form", message,
					tomailid, fromMailId);
			log.info("Mail status " + flag);
			if (flag) {
				log.info(" Mail send Successfull  ");
			} else {
				log.info(" Mail send failed ");
			}
		} catch (Exception e) {
			log.error(e);
		}
		return 1;
	}

}