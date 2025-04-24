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

package com.redlatm.form.service.impl;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rdelatm.util.MailSend;
import com.redlatm.form.model.CandidateForm;
import com.redlatm.form.service.CandidateFormLocalServiceUtil;
import com.redlatm.form.service.base.CandidateFormLocalServiceBaseImpl;
import com.redlatm.form.service.persistence.CandidateFormUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the candidate form local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.redlatm.form.service.CandidateFormLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Mukesh,Vipin
 * @see CandidateFormLocalServiceBaseImpl
 * @see com.redlatm.form.service.CandidateFormLocalServiceUtil
 */
@ProviderType
public class CandidateFormLocalServiceImpl
	extends CandidateFormLocalServiceBaseImpl {
	
	
	private static Log log = LogFactoryUtil.getLog(CandidateFormLocalServiceImpl.class);

	public CandidateFormLocalServiceImpl(){
		System.out.println("CandidateFormLocalServiceImpl.CandidateFormLocalServiceImpl()::constructor");
	}
	public Long saveCandidateForm(Long caId,String name, String surname, String fatherOrSpouse, String AadharNo, String panNumber,
			String BankAcNo, String EmpExResgnNo, String dob, String NativeLoc, String motherTongue,
			String identificationMark, String domicile, String languagesKnown, String Company, String location,
			String Role, String fromEx, String toEx, String reasonLeaving, String ph_State, String religion,
			String caste, String subCast, String mrtOption, String ableToJoin, String npMonth, String npDays,
			String Address, String city, String InState, String pinNumber, String emailId, String AlEmailId,
			String mobNumberber, String AlMobNumberber, String ALPersonName, String mainQualification,
			String specialization, String trade, String totalExp, String skillLevel, String scFrom, String ScvalidTill,
			String docName, String docAddres, String docRegnNo, String mFvalidTill, String CEaddress, String cCompany,
			String workingSince, String designation, String ctcFixed, String ctcVariable, String ctcTotal, String role,
			String Location, String npDuration, String f_company_name_1, String f_from_1, String f_to_1,
			String f_location_1, String f_designation_1, String f_ctc_fixed_1, String f_ctc_variable_1,
			String f_ctc_total_1, String f_remark_1, String f_company_name_2, String f_from_2, String f_to_2,
			String f_location_2, String f_designation_2, String f_ctc_fixed_2, String f_ctc_variable_2,
			String f_ctc_total_2, String f_remark_2, String f_company_name_3, String f_from_3, String f_to_3,
			String f_location_3, String f_designation_3, String f_ctc_fixed_3, String f_ctc_variable_3,
			String f_ctc_total_3, String f_remark_3, String f_company_name_4, String f_from_4, String f_to_4,
			String f_location_4, String f_designation_4, String f_ctc_fixed_4, String f_ctc_variable_4,
			String f_ctc_total_4, String f_remark_4, String f_company_name_5, String f_from_5, String f_to_5,
			String f_location_5, String f_designation_5, String f_ctc_fixed_5, String f_ctc_variable_5,
			String f_ctc_total_5, String f_remark_5, String f_qualification_1, String f_Institute_1, String f_year_1,
			String f_grade_1, String f_qualification_2, String f_Institute_2, String f_year_2, String f_grade_2,
			String f_qualification_3, String f_Institute_3, String f_year_3, String f_grade_3, String f_qualification_4,
			String f_Institute_4, String f_year_4, String f_grade_4, String f_qualification_5, String f_Institute_5,
			String f_year_5, String f_grade_5, String f_qualification_10, String f_Institute_10, String f_year_10,
			String f_grade_10, String f_qualification_7, String f_Institute_7, String f_year_7, String f_grade_7,
			String f_qualification_8, String f_Institute_8, String f_year_8, String f_grade_8,String fileName) throws PortalException

	{
		log.info("CandidateApplicationFormLocalServiceImpl.saveCandidateForm()");

		//Long caId = CounterLocalServiceUtil.increment();
		CandidateForm applicationForm = CandidateFormLocalServiceUtil.getCandidateForm(caId);  
		//applicationForm = createCandidateApplicationForm(caId);

		//applicationForm.setCaId(caId);
		log.info(" Candidate CaId : "+caId);
		applicationForm.setFirstName(name);
		applicationForm.setSurname(surname);
		applicationForm.setFather_SpouseName(fatherOrSpouse);
		applicationForm.setAadharCardNo(AadharNo);
		applicationForm.setPanCardNo(panNumber);
		applicationForm.setBankAccountNo(BankAcNo);
		applicationForm.setEmploymentExRegnNo(EmpExResgnNo);
		applicationForm.setDateOfBirth(dob);
		applicationForm.setNativeLocation(NativeLoc);
		applicationForm.setMotherTongue(motherTongue);
		applicationForm.setIdentificationMark(identificationMark);
		applicationForm.setDomicile(domicile);
		applicationForm.setLanguagesKnown(languagesKnown);
		applicationForm.setRelCompany(Company);
		applicationForm.setRelLocation(location);
		applicationForm.setRelRole(Role);
		applicationForm.setRelFromDate(fromEx);
		applicationForm.setRelToDate(toEx);
		applicationForm.setRelLeavingReason(reasonLeaving);
		applicationForm.setHandicapDetail(ph_State);
		applicationForm.setReligion(religion);
		applicationForm.setCaste(caste);
		applicationForm.setSubCaste(subCast);
		applicationForm.setMaritalStatus(mrtOption);
		applicationForm.setAbleToJoin(ableToJoin);
		applicationForm.setAbleToDays(npDays);
		applicationForm.setAbleToMonth(npMonth);
		// step 2
		applicationForm.setAddress(Address);
		applicationForm.setCity(city);
		applicationForm.setState(InState);
		applicationForm.setPin(pinNumber);
		applicationForm.setEmailAddress(emailId);
		applicationForm.setAlternateEmailID(AlEmailId);
		applicationForm.setMobile(mobNumberber);
		applicationForm.setAlternateMobile(AlMobNumberber);
		applicationForm.setPersonAlternateNoGiven(ALPersonName);
		// step 3
		applicationForm.setMainQualification(mainQualification);
		applicationForm.setSpecialization(specialization);
		applicationForm.setTrade(trade);
		applicationForm.setTotalYrExperience(totalExp);
		applicationForm.setSkill_Proficiency(skillLevel);
		applicationForm.setSECURITYCLEARFROM(scFrom);
		applicationForm.setSECURITYCLEARTILL(ScvalidTill);
		applicationForm.setMEDICALFITDOCNAME(docName);
		applicationForm.setMEDICALFITDOCADDR(docAddres);
		applicationForm.setMEDICALFITDOCREGNNO(docRegnNo);
		applicationForm.setMEDICALFITDOCTILL(mFvalidTill);
		// step 4
		applicationForm.setCurrentCompanyName(cCompany);
		applicationForm.setCurrentCompanyAddress(CEaddress);
		applicationForm.setWorkingSinceDate(workingSince);
		applicationForm.setDesignation(designation);
		applicationForm.setCTCFixed(ctcFixed);
		applicationForm.setCTCVariable(ctcVariable);
		applicationForm.setCTCTotal(ctcTotal);
		applicationForm.setRole(role);
		applicationForm.setLocation(Location);
		applicationForm.setNoticePeriod(npDuration);
		// step 5
		applicationForm.setFirstCompanyName(f_company_name_1);
		applicationForm.setFirstFromDate(f_to_1);
		applicationForm.setFirstToDate(f_from_1);
		applicationForm.setFirstCLocation(f_location_1);
		applicationForm.setFirstCDesignation(f_designation_1);
		applicationForm.setFirstFixedCTC(f_ctc_fixed_1);
		applicationForm.setFirstVariableCTC(f_ctc_variable_1);
		applicationForm.setFirstTotalCTC(f_ctc_total_1);
		applicationForm.setFirstRemarkIfAny(f_remark_1);
		applicationForm.setSecoundCompanyName(f_company_name_2);
		applicationForm.setSecoundFromDate(f_to_2);
		applicationForm.setSecoundToDate(f_from_2);
		applicationForm.setSecoundCLocation(f_location_2);
		applicationForm.setSecoundCDesignation(f_designation_2);
		applicationForm.setSecoundFixedCTC(f_ctc_fixed_2);
		applicationForm.setSecoundVariableCTC(f_ctc_variable_2);
		applicationForm.setSecoundTotalCTC(f_ctc_total_2);
		applicationForm.setSecoundRemarkIfAny(f_remark_2);
		applicationForm.setThirdCompanyName(f_company_name_3);
		applicationForm.setThirdFromDate(f_to_3);
		applicationForm.setThirdToDate(f_from_3);
		applicationForm.setThirdCLocation(f_location_3);
		applicationForm.setThirdCDesignation(f_designation_3);
		applicationForm.setThirdFixedCTC(f_ctc_fixed_3);
		applicationForm.setThirdVariableCTC(f_ctc_variable_3);
		applicationForm.setThirdTotalCTC(f_ctc_total_3);
		applicationForm.setThirdRemarkIfAny(f_remark_3);
		applicationForm.setForthCompanyName(f_company_name_4);
		applicationForm.setForthFromDate(f_to_4);
		applicationForm.setForthToDate(f_from_4);
		applicationForm.setForthCLocation(f_location_4);
		applicationForm.setForthCDesignation(f_designation_4);
		applicationForm.setForthFixedCTC(f_ctc_fixed_4);
		applicationForm.setForthVariableCTC(f_ctc_variable_4);
		applicationForm.setForthTotalCTC(f_ctc_total_4);
		applicationForm.setForthRemarkIfAny(f_remark_4);
		applicationForm.setFifthCompanyName(f_company_name_5);
		applicationForm.setFifthFromDate(f_to_5);
		applicationForm.setFifthToDate(f_from_5);
		applicationForm.setFifthCLocation(f_location_5);
		applicationForm.setFifthCDesignation(f_designation_5);
		applicationForm.setFifthFixedCTC(f_ctc_fixed_5);
		applicationForm.setFifthVariableCTC(f_ctc_variable_5);
		applicationForm.setFifthTotalCTC(f_ctc_total_5);
		applicationForm.setFifthRemarkIfAny(f_remark_5);
		// step 6
		applicationForm.setSSCQualification(f_qualification_1);
		applicationForm.setSSCUniversityInstitute(f_Institute_1);
		applicationForm.setSSCYearOfPassing(f_year_1);
		applicationForm.setSSCGrade(f_grade_1);
		applicationForm.setHSCUniversityInstitute(f_Institute_2);
		applicationForm.setHSCQualification(f_qualification_2);
		applicationForm.setHSCYearOfPassing(f_year_2);
		applicationForm.setHSCGrade(f_grade_2);
		applicationForm.setGradUniversityInstitute(f_Institute_3);
		applicationForm.setGradQualification(f_qualification_3);
		applicationForm.setGradYearOfPassing(f_year_3);
		applicationForm.setGradGrade(f_grade_3);
		applicationForm.setPGUniversityInstitute(f_Institute_4);
		applicationForm.setPGQualification(f_qualification_4);
		applicationForm.setPGYearOfPassing(f_year_4);
		applicationForm.setPGGrade(f_grade_4);
		applicationForm.setPhDUniversityInstitute(f_Institute_5);
		applicationForm.setPhDQualification(f_qualification_5);
		applicationForm.setPhDYearOfPassing(f_year_5);
		applicationForm.setPhDGrade(f_grade_5);
		applicationForm.setOther1UniversityInstitute(f_Institute_10);
		applicationForm.setOther1Qualification(f_qualification_10);
		applicationForm.setOther1YearOfPassing(f_year_10);
		applicationForm.setOther1Grade(f_grade_10);
		applicationForm.setOther2UniversityInstitute(f_Institute_7);
		applicationForm.setOther2Qualification(f_qualification_7);
		applicationForm.setOther2YearOfPassing(f_year_7);
		applicationForm.setOther2Grade(f_grade_7);
		applicationForm.setOther3UniversityInstitute(f_Institute_8);
		applicationForm.setOther3Qualification(f_qualification_8);
		applicationForm.setOther3YearOfPassing(f_year_8);
		applicationForm.setOther3Grade(f_grade_8);
		
		applicationForm.setUPLOADFILE(fileName);;
		log.info(fileName);
		//addCandidateApplicationForm(applicationForm);
		//updateCandidateApplicationForm(applicationForm);
		applicationForm = CandidateFormLocalServiceUtil.updateCandidateForm(applicationForm);         
		
		/*---------------------------Mail send code-------------------------------------------*/
		boolean mailsendStatus=false ;
		//String Name;
		String tomailid;
		String frommailid;
		StringBuffer sb;
		//Name = (new StringBuilder(String.valueOf(firstName))).append(" ").append(lastName).toString();
		tomailid = emailId;
		//frommailid = "rdel.careers@reliancedefence.co"; 
		frommailid = "rdel.careers@relianceada.com";
		sb = new StringBuffer();
		
		try {
		MailSend mailsend = new MailSend();
		String Subject = "RDEL - Thank You for your registration";
		Calendar calendar = new GregorianCalendar();
		String addrIP = null;
		if (addrIP != null && !addrIP.trim().equals("")) {
			addrIP = (new StringBuilder(" [IP Address : ")).append(addrIP).append("]").toString();
		} else {
			addrIP = "";
		}
		sb.append(new StringBuilder("<html><body><font face='Verdana' size='2'>Dear Sir / Madam <br><br>Thank You for your registration. We will get back to you.<br><br><br><br> Reliance Defence and Engineering Limited <br><br><br><br><br><br><br><br><br><br><br><br> This is a system generated mail. Please do not reply to this e-mail id. In case of any query, please email to Jignesh.Dhandhalya@RelianceADA.com ").toString());
			
		sb.append("</table></body></html>");
		String message = (new StringBuilder()).append(sb.toString()).toString();
		String ccmailid = "";

		log.info("Subject >> " + Subject);
		log.info("message >> " + message);
		log.info("tomailid >> " + tomailid);
		log.info("frommailid  : >> " + frommailid);

		mailsendStatus = mailsend.sendMail(Subject, message, tomailid, frommailid);
		
		} catch (Exception e) {
			log.error(e);
		}
		if (mailsendStatus) {
			log.info(" Mail send Successfull  ");
		} else {
			log.info(" Mail send failed ");
		}
		
		return caId;
	}
	
	public String saveCandidateRegistrationForm(CandidateForm candidateRegistrationForm){
		String result = "ERROR";
		boolean mailsendStatus=false ;
		String name = candidateRegistrationForm.getFirstName();
		String pass = candidateRegistrationForm.getPassword();
		try {			
			Long caId = candidateRegistrationForm.getCaId();			
			System.out.println(" candidate Id :"+caId);
				 CandidateFormLocalServiceUtil.addCandidateForm(candidateRegistrationForm); 
				 
				 System.out.println("CandidateApplicationFormLocalServiceImpl.saveCandidateRegistrationForm()::mail send block");
					/*---------------------------Mail send code-------------------------------------------*/
					String tomailid;
					String frommailid;
					StringBuffer sb;
					tomailid = candidateRegistrationForm.getEmailAddress();
					frommailid = "rdel.careers@relianceada.com";
				//	frommailid = "rdel.careers@reliancedefence.co";
					sb = new StringBuffer();
					
					try {
					MailSend mailsend = new MailSend();
					String Subject = "RDEL - Thank You for your registration";
					Calendar calendar = new GregorianCalendar();
					String addrIP = null;
					if (addrIP != null && !addrIP.trim().equals("")) {
						addrIP = (new StringBuilder(" [IP Address : ")).append(addrIP).append("]").toString();
					} else {
						addrIP = "";
					}
					sb.append(new StringBuilder("<html><body><font face='Verdana' size='2'>Dear Sir / Madam, <br><br>Thank You for registering with us.<br><br>Your login details to access the Reliance Defence Candidate portal.<br><br> User name : "+tomailid+" <br> PASSWORD : "+pass+".<br><br> Thanks <br>Reliance Defence and Engineering Limited<br><br><br><br><br>This is a system generated mail. Please do not reply to this e-mail id.<br>In case of any query, please email to Jignesh.Dhandhalya@RelianceADA.com").toString());
					sb.append("</table></body></html>");
					String message = (new StringBuilder()).append(sb.toString()).toString();
					String ccmailid = "";

					log.info("Subject >> " + Subject);
					log.info("message >> " + message);
					log.info("tomailid >> " + tomailid);
					log.info("frommailid >> " + frommailid);

					mailsendStatus = mailsend.sendMail(Subject, message, tomailid, frommailid);
					System.out.println(" mail send check flag :"+mailsendStatus);
					} catch (Exception e) {
						log.error(e);
					}
				 
				 result = "SUCCESS";
					
		} catch (Exception e) {
			e.printStackTrace();
			 result = "ERROR";
		}
		log.info(" saveCandidateRegistrationForm || Result is "+result);
		if("SUCCESS".equals(result)){
			
			if (mailsendStatus) {
				log.info(" Mail send Successfull  ");
			} else {
				log.info(" Mail send failed ");
			}
		}
		return result;
	}
	
	public List validateUserLoginService(String username,String password){
		List result=null;
		try {			
			result = candidateFormFinder.validateCandidateUserLogin(username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public List<CandidateForm> findCandidateEmailId(String emailAddress){
		System.out.println("CandidateFormLocalServiceImpl.findCandidateEmailId()::emailId : "+emailAddress);
		return CandidateFormUtil.findByemailId(emailAddress);
	}
	
	public String getCandidateEmailId(String email){
		System.out.println("CandidateForm || Local Service Impl || getCandidateEmailId() || email 1 : " +email);
		System.out.println("CandidateForm || Local Service Impl || getCandidateEmailId() || email 2 : "+ candidateFormFinder.validateCandidateEmailFinder(email));
		String emailFlag=candidateFormFinder.validateCandidateEmailFinder(email);
		System.out.println("CandidateForm || Local Service Impl || getCandidateEmailId() || emailFlag 1 : " +emailFlag);
		return emailFlag;
	}
	
	public List<CandidateForm> viewCandidateProfile(String email){
		List<CandidateForm> viewProfile =  candidateFormFinder.validateCandidateEmailFinderPersitence(email);
		return viewProfile;
	}
	
	public List<CandidateForm> getValidateCandidateEmailServiceImpl(String email){
		System.out.println("CandidateApplicationFormLocalServiceImpl.getValidateCandidateEmailServiceImpl()");
		String name = null;
		String pass = null;
		List<CandidateForm> getCandidateList =  candidateFormFinder.validateCandidateEmailFinderPersitence(email);
		if(getCandidateList.isEmpty()){
			System.out.println(" CandidateList is Empty ");
		}else{
			for(CandidateForm form : getCandidateList){
				name = form.getFirstName();
				pass = form.getPassword();
				System.out.println(" CandidateApplicationFormLocalServiceImpl.getValidateCandidateEmailServiceImpl() || Candidate Name : "+name);
				System.out.println(" CandidateApplicationFormLocalServiceImpl.getValidateCandidateEmailServiceImpl() || Pass : "+pass);
			}
			/*---------------------------Mail send code-------------------------------------------*/
			boolean mailsendStatus=false ;
			//String Name;
			String tomailid;
			String frommailid;
			StringBuffer sb;
			tomailid = email;
			//frommailid = "rdel.careers@reliancedefence.co";
			frommailid = "rdel.careers@relianceada.com";
			sb = new StringBuffer();
			
			try {
			MailSend mailsend = new MailSend();
			String Subject = "RDEL - Thank You for your registration";
			Calendar calendar = new GregorianCalendar();
			String addrIP = null;
			if (addrIP != null && !addrIP.trim().equals("")) {
				addrIP = (new StringBuilder(" [IP Address : ")).append(addrIP).append("]").toString();
			} else {
				addrIP = "";
			}
			sb.append(new StringBuilder("<html><body><font face='Verdana' size='2'> Dear "+name+",<br> Kindly note your PASSWORD : "+pass+". <br><br><br><br><br>This is a system generated mail. Please do not reply to this e-mail id.").toString());
				
			sb.append("</table></body></html>");
			String message = (new StringBuilder()).append(sb.toString()).toString();
			String ccmailid = "";

			log.info("Subject >> " + Subject);
			log.info("message >> " + message);
			log.info("tomailid >> " + tomailid);
			log.info("frommailid >> " + frommailid);

			mailsendStatus = mailsend.sendMail(Subject, message, tomailid, frommailid);
			
			} catch (Exception e) {
				log.error(e);
			}
			if (mailsendStatus) {
				log.info(" Mail send Successfull  ");
			} else {
				log.info(" Mail send failed ");
			}
			
		}
		return getCandidateList;
	}
	
	public String setCandidatePasswordServiceImpl(String oldpassword,String password,String emailId){
		String result="";
		try {							
			List<CandidateForm> getEmailImpl =  candidateFormFinder.validateCandidateEmailFinderPersitence(emailId);			
			for (CandidateForm candidateApplicationForm : getEmailImpl) {
				String oldPwd= candidateApplicationForm.getPassword();						
				if(!(oldpassword.equals(oldPwd))){
					result = "ERROR";				
				}else{
					result = candidateFormFinder.setCandidatePasswordFinderImpl(password, emailId);					
				}
			}						
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public void test(){
		System.out.println("CandidateApplicationFormLocalServiceImpl.test()");
		
	}
	
	/*public  List<CandidateForm> findByemailId(
			java.lang.String emailAddress) {
			return getPersistence().findByemailId(emailAddress);
		}*/
	
}