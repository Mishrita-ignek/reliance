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

package com.redlatm.form.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.redlatm.form.model.CandidateForm;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing CandidateForm in entity cache.
 *
 * @author Mukesh,Vipin
 * @see CandidateForm
 * @generated
 */
@ProviderType
public class CandidateFormCacheModel implements CacheModel<CandidateForm>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateFormCacheModel)) {
			return false;
		}

		CandidateFormCacheModel candidateFormCacheModel = (CandidateFormCacheModel)obj;

		if (CaId == candidateFormCacheModel.CaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, CaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(275);

		sb.append("{CaId=");
		sb.append(CaId);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", surname=");
		sb.append(surname);
		sb.append(", password=");
		sb.append(password);
		sb.append(", father_SpouseName=");
		sb.append(father_SpouseName);
		sb.append(", aadharCardNo=");
		sb.append(aadharCardNo);
		sb.append(", panCardNo=");
		sb.append(panCardNo);
		sb.append(", bankAccountNo=");
		sb.append(bankAccountNo);
		sb.append(", employmentExRegnNo=");
		sb.append(employmentExRegnNo);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", nativeLocation=");
		sb.append(nativeLocation);
		sb.append(", motherTongue=");
		sb.append(motherTongue);
		sb.append(", identificationMark=");
		sb.append(identificationMark);
		sb.append(", domicile=");
		sb.append(domicile);
		sb.append(", languagesKnown=");
		sb.append(languagesKnown);
		sb.append(", relCompany=");
		sb.append(relCompany);
		sb.append(", relLocation=");
		sb.append(relLocation);
		sb.append(", relRole=");
		sb.append(relRole);
		sb.append(", relFromDate=");
		sb.append(relFromDate);
		sb.append(", relToDate=");
		sb.append(relToDate);
		sb.append(", relLeavingReason=");
		sb.append(relLeavingReason);
		sb.append(", handicapDetail=");
		sb.append(handicapDetail);
		sb.append(", religion=");
		sb.append(religion);
		sb.append(", caste=");
		sb.append(caste);
		sb.append(", subCaste=");
		sb.append(subCaste);
		sb.append(", maritalStatus=");
		sb.append(maritalStatus);
		sb.append(", ableToJoin=");
		sb.append(ableToJoin);
		sb.append(", ableToDays=");
		sb.append(ableToDays);
		sb.append(", ableToMonth=");
		sb.append(ableToMonth);
		sb.append(", address=");
		sb.append(address);
		sb.append(", city=");
		sb.append(city);
		sb.append(", state=");
		sb.append(state);
		sb.append(", pin=");
		sb.append(pin);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", alternateEmailID=");
		sb.append(alternateEmailID);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", alternateMobile=");
		sb.append(alternateMobile);
		sb.append(", personAlternateNoGiven=");
		sb.append(personAlternateNoGiven);
		sb.append(", mainQualification=");
		sb.append(mainQualification);
		sb.append(", specialization=");
		sb.append(specialization);
		sb.append(", trade=");
		sb.append(trade);
		sb.append(", totalYrExperience=");
		sb.append(totalYrExperience);
		sb.append(", skill_Proficiency=");
		sb.append(skill_Proficiency);
		sb.append(", SECURITYCLEARFROM=");
		sb.append(SECURITYCLEARFROM);
		sb.append(", SECURITYCLEARTILL=");
		sb.append(SECURITYCLEARTILL);
		sb.append(", MEDICALFITDOCNAME=");
		sb.append(MEDICALFITDOCNAME);
		sb.append(", MEDICALFITDOCADDR=");
		sb.append(MEDICALFITDOCADDR);
		sb.append(", MEDICALFITDOCREGNNO=");
		sb.append(MEDICALFITDOCREGNNO);
		sb.append(", MEDICALFITDOCTILL=");
		sb.append(MEDICALFITDOCTILL);
		sb.append(", currentCompanyName=");
		sb.append(currentCompanyName);
		sb.append(", currentCompanyAddress=");
		sb.append(currentCompanyAddress);
		sb.append(", workingSinceDate=");
		sb.append(workingSinceDate);
		sb.append(", designation=");
		sb.append(designation);
		sb.append(", CTCFixed=");
		sb.append(CTCFixed);
		sb.append(", CTCVariable=");
		sb.append(CTCVariable);
		sb.append(", CTCTotal=");
		sb.append(CTCTotal);
		sb.append(", role=");
		sb.append(role);
		sb.append(", location=");
		sb.append(location);
		sb.append(", noticePeriod=");
		sb.append(noticePeriod);
		sb.append(", firstCompanyName=");
		sb.append(firstCompanyName);
		sb.append(", firstFromDate=");
		sb.append(firstFromDate);
		sb.append(", firstToDate=");
		sb.append(firstToDate);
		sb.append(", firstCLocation=");
		sb.append(firstCLocation);
		sb.append(", firstCDesignation=");
		sb.append(firstCDesignation);
		sb.append(", firstFixedCTC=");
		sb.append(firstFixedCTC);
		sb.append(", firstVariableCTC=");
		sb.append(firstVariableCTC);
		sb.append(", firstTotalCTC=");
		sb.append(firstTotalCTC);
		sb.append(", firstRemarkIfAny=");
		sb.append(firstRemarkIfAny);
		sb.append(", secoundCompanyName=");
		sb.append(secoundCompanyName);
		sb.append(", secoundFromDate=");
		sb.append(secoundFromDate);
		sb.append(", secoundToDate=");
		sb.append(secoundToDate);
		sb.append(", secoundCLocation=");
		sb.append(secoundCLocation);
		sb.append(", secoundCDesignation=");
		sb.append(secoundCDesignation);
		sb.append(", secoundFixedCTC=");
		sb.append(secoundFixedCTC);
		sb.append(", secoundVariableCTC=");
		sb.append(secoundVariableCTC);
		sb.append(", secoundTotalCTC=");
		sb.append(secoundTotalCTC);
		sb.append(", secoundRemarkIfAny=");
		sb.append(secoundRemarkIfAny);
		sb.append(", thirdCompanyName=");
		sb.append(thirdCompanyName);
		sb.append(", thirdFromDate=");
		sb.append(thirdFromDate);
		sb.append(", thirdToDate=");
		sb.append(thirdToDate);
		sb.append(", thirdCLocation=");
		sb.append(thirdCLocation);
		sb.append(", thirdCDesignation=");
		sb.append(thirdCDesignation);
		sb.append(", thirdFixedCTC=");
		sb.append(thirdFixedCTC);
		sb.append(", thirdVariableCTC=");
		sb.append(thirdVariableCTC);
		sb.append(", thirdTotalCTC=");
		sb.append(thirdTotalCTC);
		sb.append(", thirdRemarkIfAny=");
		sb.append(thirdRemarkIfAny);
		sb.append(", forthCompanyName=");
		sb.append(forthCompanyName);
		sb.append(", forthFromDate=");
		sb.append(forthFromDate);
		sb.append(", forthToDate=");
		sb.append(forthToDate);
		sb.append(", forthCLocation=");
		sb.append(forthCLocation);
		sb.append(", forthCDesignation=");
		sb.append(forthCDesignation);
		sb.append(", forthFixedCTC=");
		sb.append(forthFixedCTC);
		sb.append(", forthVariableCTC=");
		sb.append(forthVariableCTC);
		sb.append(", forthTotalCTC=");
		sb.append(forthTotalCTC);
		sb.append(", forthRemarkIfAny=");
		sb.append(forthRemarkIfAny);
		sb.append(", fifthCompanyName=");
		sb.append(fifthCompanyName);
		sb.append(", fifthFromDate=");
		sb.append(fifthFromDate);
		sb.append(", fifthToDate=");
		sb.append(fifthToDate);
		sb.append(", fifthCLocation=");
		sb.append(fifthCLocation);
		sb.append(", fifthCDesignation=");
		sb.append(fifthCDesignation);
		sb.append(", fifthFixedCTC=");
		sb.append(fifthFixedCTC);
		sb.append(", fifthVariableCTC=");
		sb.append(fifthVariableCTC);
		sb.append(", fifthTotalCTC=");
		sb.append(fifthTotalCTC);
		sb.append(", fifthRemarkIfAny=");
		sb.append(fifthRemarkIfAny);
		sb.append(", SSCQualification=");
		sb.append(SSCQualification);
		sb.append(", SSCUniversityInstitute=");
		sb.append(SSCUniversityInstitute);
		sb.append(", SSCYearOfPassing=");
		sb.append(SSCYearOfPassing);
		sb.append(", SSCGrade=");
		sb.append(SSCGrade);
		sb.append(", HSCUniversityInstitute=");
		sb.append(HSCUniversityInstitute);
		sb.append(", HSCQualification=");
		sb.append(HSCQualification);
		sb.append(", HSCYearOfPassing=");
		sb.append(HSCYearOfPassing);
		sb.append(", HSCGrade=");
		sb.append(HSCGrade);
		sb.append(", GradUniversityInstitute=");
		sb.append(GradUniversityInstitute);
		sb.append(", GradQualification=");
		sb.append(GradQualification);
		sb.append(", GradYearOfPassing=");
		sb.append(GradYearOfPassing);
		sb.append(", GradGrade=");
		sb.append(GradGrade);
		sb.append(", PGUniversityInstitute=");
		sb.append(PGUniversityInstitute);
		sb.append(", PGQualification=");
		sb.append(PGQualification);
		sb.append(", PGYearOfPassing=");
		sb.append(PGYearOfPassing);
		sb.append(", PGGrade=");
		sb.append(PGGrade);
		sb.append(", PhDUniversityInstitute=");
		sb.append(PhDUniversityInstitute);
		sb.append(", PhDQualification=");
		sb.append(PhDQualification);
		sb.append(", PhDYearOfPassing=");
		sb.append(PhDYearOfPassing);
		sb.append(", PhDGrade=");
		sb.append(PhDGrade);
		sb.append(", other1UniversityInstitute=");
		sb.append(other1UniversityInstitute);
		sb.append(", other1Qualification=");
		sb.append(other1Qualification);
		sb.append(", other1YearOfPassing=");
		sb.append(other1YearOfPassing);
		sb.append(", other1Grade=");
		sb.append(other1Grade);
		sb.append(", other2UniversityInstitute=");
		sb.append(other2UniversityInstitute);
		sb.append(", other2Qualification=");
		sb.append(other2Qualification);
		sb.append(", other2YearOfPassing=");
		sb.append(other2YearOfPassing);
		sb.append(", other2Grade=");
		sb.append(other2Grade);
		sb.append(", other3UniversityInstitute=");
		sb.append(other3UniversityInstitute);
		sb.append(", other3Qualification=");
		sb.append(other3Qualification);
		sb.append(", other3YearOfPassing=");
		sb.append(other3YearOfPassing);
		sb.append(", other3Grade=");
		sb.append(other3Grade);
		sb.append(", UPLOADFILE=");
		sb.append(UPLOADFILE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CandidateForm toEntityModel() {
		CandidateFormImpl candidateFormImpl = new CandidateFormImpl();

		candidateFormImpl.setCaId(CaId);

		if (firstName == null) {
			candidateFormImpl.setFirstName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstName(firstName);
		}

		if (surname == null) {
			candidateFormImpl.setSurname(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSurname(surname);
		}

		if (password == null) {
			candidateFormImpl.setPassword(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPassword(password);
		}

		if (father_SpouseName == null) {
			candidateFormImpl.setFather_SpouseName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFather_SpouseName(father_SpouseName);
		}

		if (aadharCardNo == null) {
			candidateFormImpl.setAadharCardNo(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setAadharCardNo(aadharCardNo);
		}

		if (panCardNo == null) {
			candidateFormImpl.setPanCardNo(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPanCardNo(panCardNo);
		}

		if (bankAccountNo == null) {
			candidateFormImpl.setBankAccountNo(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setBankAccountNo(bankAccountNo);
		}

		if (employmentExRegnNo == null) {
			candidateFormImpl.setEmploymentExRegnNo(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setEmploymentExRegnNo(employmentExRegnNo);
		}

		if (dateOfBirth == null) {
			candidateFormImpl.setDateOfBirth(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setDateOfBirth(dateOfBirth);
		}

		if (nativeLocation == null) {
			candidateFormImpl.setNativeLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setNativeLocation(nativeLocation);
		}

		if (motherTongue == null) {
			candidateFormImpl.setMotherTongue(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMotherTongue(motherTongue);
		}

		if (identificationMark == null) {
			candidateFormImpl.setIdentificationMark(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setIdentificationMark(identificationMark);
		}

		if (domicile == null) {
			candidateFormImpl.setDomicile(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setDomicile(domicile);
		}

		if (languagesKnown == null) {
			candidateFormImpl.setLanguagesKnown(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setLanguagesKnown(languagesKnown);
		}

		if (relCompany == null) {
			candidateFormImpl.setRelCompany(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setRelCompany(relCompany);
		}

		if (relLocation == null) {
			candidateFormImpl.setRelLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setRelLocation(relLocation);
		}

		if (relRole == null) {
			candidateFormImpl.setRelRole(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setRelRole(relRole);
		}

		if (relFromDate == null) {
			candidateFormImpl.setRelFromDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setRelFromDate(relFromDate);
		}

		if (relToDate == null) {
			candidateFormImpl.setRelToDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setRelToDate(relToDate);
		}

		if (relLeavingReason == null) {
			candidateFormImpl.setRelLeavingReason(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setRelLeavingReason(relLeavingReason);
		}

		if (handicapDetail == null) {
			candidateFormImpl.setHandicapDetail(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setHandicapDetail(handicapDetail);
		}

		if (religion == null) {
			candidateFormImpl.setReligion(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setReligion(religion);
		}

		if (caste == null) {
			candidateFormImpl.setCaste(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setCaste(caste);
		}

		if (subCaste == null) {
			candidateFormImpl.setSubCaste(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSubCaste(subCaste);
		}

		if (maritalStatus == null) {
			candidateFormImpl.setMaritalStatus(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMaritalStatus(maritalStatus);
		}

		if (ableToJoin == null) {
			candidateFormImpl.setAbleToJoin(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setAbleToJoin(ableToJoin);
		}

		if (ableToDays == null) {
			candidateFormImpl.setAbleToDays(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setAbleToDays(ableToDays);
		}

		if (ableToMonth == null) {
			candidateFormImpl.setAbleToMonth(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setAbleToMonth(ableToMonth);
		}

		if (address == null) {
			candidateFormImpl.setAddress(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setAddress(address);
		}

		if (city == null) {
			candidateFormImpl.setCity(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setCity(city);
		}

		if (state == null) {
			candidateFormImpl.setState(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setState(state);
		}

		if (pin == null) {
			candidateFormImpl.setPin(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPin(pin);
		}

		if (emailAddress == null) {
			candidateFormImpl.setEmailAddress(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setEmailAddress(emailAddress);
		}

		if (alternateEmailID == null) {
			candidateFormImpl.setAlternateEmailID(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setAlternateEmailID(alternateEmailID);
		}

		if (mobile == null) {
			candidateFormImpl.setMobile(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMobile(mobile);
		}

		if (alternateMobile == null) {
			candidateFormImpl.setAlternateMobile(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setAlternateMobile(alternateMobile);
		}

		if (personAlternateNoGiven == null) {
			candidateFormImpl.setPersonAlternateNoGiven(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPersonAlternateNoGiven(personAlternateNoGiven);
		}

		if (mainQualification == null) {
			candidateFormImpl.setMainQualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMainQualification(mainQualification);
		}

		if (specialization == null) {
			candidateFormImpl.setSpecialization(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSpecialization(specialization);
		}

		if (trade == null) {
			candidateFormImpl.setTrade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setTrade(trade);
		}

		if (totalYrExperience == null) {
			candidateFormImpl.setTotalYrExperience(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setTotalYrExperience(totalYrExperience);
		}

		if (skill_Proficiency == null) {
			candidateFormImpl.setSkill_Proficiency(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSkill_Proficiency(skill_Proficiency);
		}

		if (SECURITYCLEARFROM == null) {
			candidateFormImpl.setSECURITYCLEARFROM(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSECURITYCLEARFROM(SECURITYCLEARFROM);
		}

		if (SECURITYCLEARTILL == null) {
			candidateFormImpl.setSECURITYCLEARTILL(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSECURITYCLEARTILL(SECURITYCLEARTILL);
		}

		if (MEDICALFITDOCNAME == null) {
			candidateFormImpl.setMEDICALFITDOCNAME(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMEDICALFITDOCNAME(MEDICALFITDOCNAME);
		}

		if (MEDICALFITDOCADDR == null) {
			candidateFormImpl.setMEDICALFITDOCADDR(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMEDICALFITDOCADDR(MEDICALFITDOCADDR);
		}

		if (MEDICALFITDOCREGNNO == null) {
			candidateFormImpl.setMEDICALFITDOCREGNNO(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMEDICALFITDOCREGNNO(MEDICALFITDOCREGNNO);
		}

		if (MEDICALFITDOCTILL == null) {
			candidateFormImpl.setMEDICALFITDOCTILL(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setMEDICALFITDOCTILL(MEDICALFITDOCTILL);
		}

		if (currentCompanyName == null) {
			candidateFormImpl.setCurrentCompanyName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setCurrentCompanyName(currentCompanyName);
		}

		if (currentCompanyAddress == null) {
			candidateFormImpl.setCurrentCompanyAddress(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setCurrentCompanyAddress(currentCompanyAddress);
		}

		if (workingSinceDate == null) {
			candidateFormImpl.setWorkingSinceDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setWorkingSinceDate(workingSinceDate);
		}

		if (designation == null) {
			candidateFormImpl.setDesignation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setDesignation(designation);
		}

		if (CTCFixed == null) {
			candidateFormImpl.setCTCFixed(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setCTCFixed(CTCFixed);
		}

		if (CTCVariable == null) {
			candidateFormImpl.setCTCVariable(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setCTCVariable(CTCVariable);
		}

		if (CTCTotal == null) {
			candidateFormImpl.setCTCTotal(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setCTCTotal(CTCTotal);
		}

		if (role == null) {
			candidateFormImpl.setRole(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setRole(role);
		}

		if (location == null) {
			candidateFormImpl.setLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setLocation(location);
		}

		if (noticePeriod == null) {
			candidateFormImpl.setNoticePeriod(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setNoticePeriod(noticePeriod);
		}

		if (firstCompanyName == null) {
			candidateFormImpl.setFirstCompanyName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstCompanyName(firstCompanyName);
		}

		if (firstFromDate == null) {
			candidateFormImpl.setFirstFromDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstFromDate(firstFromDate);
		}

		if (firstToDate == null) {
			candidateFormImpl.setFirstToDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstToDate(firstToDate);
		}

		if (firstCLocation == null) {
			candidateFormImpl.setFirstCLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstCLocation(firstCLocation);
		}

		if (firstCDesignation == null) {
			candidateFormImpl.setFirstCDesignation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstCDesignation(firstCDesignation);
		}

		if (firstFixedCTC == null) {
			candidateFormImpl.setFirstFixedCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstFixedCTC(firstFixedCTC);
		}

		if (firstVariableCTC == null) {
			candidateFormImpl.setFirstVariableCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstVariableCTC(firstVariableCTC);
		}

		if (firstTotalCTC == null) {
			candidateFormImpl.setFirstTotalCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstTotalCTC(firstTotalCTC);
		}

		if (firstRemarkIfAny == null) {
			candidateFormImpl.setFirstRemarkIfAny(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFirstRemarkIfAny(firstRemarkIfAny);
		}

		if (secoundCompanyName == null) {
			candidateFormImpl.setSecoundCompanyName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundCompanyName(secoundCompanyName);
		}

		if (secoundFromDate == null) {
			candidateFormImpl.setSecoundFromDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundFromDate(secoundFromDate);
		}

		if (secoundToDate == null) {
			candidateFormImpl.setSecoundToDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundToDate(secoundToDate);
		}

		if (secoundCLocation == null) {
			candidateFormImpl.setSecoundCLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundCLocation(secoundCLocation);
		}

		if (secoundCDesignation == null) {
			candidateFormImpl.setSecoundCDesignation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundCDesignation(secoundCDesignation);
		}

		if (secoundFixedCTC == null) {
			candidateFormImpl.setSecoundFixedCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundFixedCTC(secoundFixedCTC);
		}

		if (secoundVariableCTC == null) {
			candidateFormImpl.setSecoundVariableCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundVariableCTC(secoundVariableCTC);
		}

		if (secoundTotalCTC == null) {
			candidateFormImpl.setSecoundTotalCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundTotalCTC(secoundTotalCTC);
		}

		if (secoundRemarkIfAny == null) {
			candidateFormImpl.setSecoundRemarkIfAny(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSecoundRemarkIfAny(secoundRemarkIfAny);
		}

		if (thirdCompanyName == null) {
			candidateFormImpl.setThirdCompanyName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdCompanyName(thirdCompanyName);
		}

		if (thirdFromDate == null) {
			candidateFormImpl.setThirdFromDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdFromDate(thirdFromDate);
		}

		if (thirdToDate == null) {
			candidateFormImpl.setThirdToDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdToDate(thirdToDate);
		}

		if (thirdCLocation == null) {
			candidateFormImpl.setThirdCLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdCLocation(thirdCLocation);
		}

		if (thirdCDesignation == null) {
			candidateFormImpl.setThirdCDesignation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdCDesignation(thirdCDesignation);
		}

		if (thirdFixedCTC == null) {
			candidateFormImpl.setThirdFixedCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdFixedCTC(thirdFixedCTC);
		}

		if (thirdVariableCTC == null) {
			candidateFormImpl.setThirdVariableCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdVariableCTC(thirdVariableCTC);
		}

		if (thirdTotalCTC == null) {
			candidateFormImpl.setThirdTotalCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdTotalCTC(thirdTotalCTC);
		}

		if (thirdRemarkIfAny == null) {
			candidateFormImpl.setThirdRemarkIfAny(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setThirdRemarkIfAny(thirdRemarkIfAny);
		}

		if (forthCompanyName == null) {
			candidateFormImpl.setForthCompanyName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthCompanyName(forthCompanyName);
		}

		if (forthFromDate == null) {
			candidateFormImpl.setForthFromDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthFromDate(forthFromDate);
		}

		if (forthToDate == null) {
			candidateFormImpl.setForthToDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthToDate(forthToDate);
		}

		if (forthCLocation == null) {
			candidateFormImpl.setForthCLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthCLocation(forthCLocation);
		}

		if (forthCDesignation == null) {
			candidateFormImpl.setForthCDesignation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthCDesignation(forthCDesignation);
		}

		if (forthFixedCTC == null) {
			candidateFormImpl.setForthFixedCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthFixedCTC(forthFixedCTC);
		}

		if (forthVariableCTC == null) {
			candidateFormImpl.setForthVariableCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthVariableCTC(forthVariableCTC);
		}

		if (forthTotalCTC == null) {
			candidateFormImpl.setForthTotalCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthTotalCTC(forthTotalCTC);
		}

		if (forthRemarkIfAny == null) {
			candidateFormImpl.setForthRemarkIfAny(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setForthRemarkIfAny(forthRemarkIfAny);
		}

		if (fifthCompanyName == null) {
			candidateFormImpl.setFifthCompanyName(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthCompanyName(fifthCompanyName);
		}

		if (fifthFromDate == null) {
			candidateFormImpl.setFifthFromDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthFromDate(fifthFromDate);
		}

		if (fifthToDate == null) {
			candidateFormImpl.setFifthToDate(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthToDate(fifthToDate);
		}

		if (fifthCLocation == null) {
			candidateFormImpl.setFifthCLocation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthCLocation(fifthCLocation);
		}

		if (fifthCDesignation == null) {
			candidateFormImpl.setFifthCDesignation(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthCDesignation(fifthCDesignation);
		}

		if (fifthFixedCTC == null) {
			candidateFormImpl.setFifthFixedCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthFixedCTC(fifthFixedCTC);
		}

		if (fifthVariableCTC == null) {
			candidateFormImpl.setFifthVariableCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthVariableCTC(fifthVariableCTC);
		}

		if (fifthTotalCTC == null) {
			candidateFormImpl.setFifthTotalCTC(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthTotalCTC(fifthTotalCTC);
		}

		if (fifthRemarkIfAny == null) {
			candidateFormImpl.setFifthRemarkIfAny(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setFifthRemarkIfAny(fifthRemarkIfAny);
		}

		if (SSCQualification == null) {
			candidateFormImpl.setSSCQualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSSCQualification(SSCQualification);
		}

		if (SSCUniversityInstitute == null) {
			candidateFormImpl.setSSCUniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSSCUniversityInstitute(SSCUniversityInstitute);
		}

		if (SSCYearOfPassing == null) {
			candidateFormImpl.setSSCYearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSSCYearOfPassing(SSCYearOfPassing);
		}

		if (SSCGrade == null) {
			candidateFormImpl.setSSCGrade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setSSCGrade(SSCGrade);
		}

		if (HSCUniversityInstitute == null) {
			candidateFormImpl.setHSCUniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setHSCUniversityInstitute(HSCUniversityInstitute);
		}

		if (HSCQualification == null) {
			candidateFormImpl.setHSCQualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setHSCQualification(HSCQualification);
		}

		if (HSCYearOfPassing == null) {
			candidateFormImpl.setHSCYearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setHSCYearOfPassing(HSCYearOfPassing);
		}

		if (HSCGrade == null) {
			candidateFormImpl.setHSCGrade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setHSCGrade(HSCGrade);
		}

		if (GradUniversityInstitute == null) {
			candidateFormImpl.setGradUniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setGradUniversityInstitute(GradUniversityInstitute);
		}

		if (GradQualification == null) {
			candidateFormImpl.setGradQualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setGradQualification(GradQualification);
		}

		if (GradYearOfPassing == null) {
			candidateFormImpl.setGradYearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setGradYearOfPassing(GradYearOfPassing);
		}

		if (GradGrade == null) {
			candidateFormImpl.setGradGrade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setGradGrade(GradGrade);
		}

		if (PGUniversityInstitute == null) {
			candidateFormImpl.setPGUniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPGUniversityInstitute(PGUniversityInstitute);
		}

		if (PGQualification == null) {
			candidateFormImpl.setPGQualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPGQualification(PGQualification);
		}

		if (PGYearOfPassing == null) {
			candidateFormImpl.setPGYearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPGYearOfPassing(PGYearOfPassing);
		}

		if (PGGrade == null) {
			candidateFormImpl.setPGGrade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPGGrade(PGGrade);
		}

		if (PhDUniversityInstitute == null) {
			candidateFormImpl.setPhDUniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPhDUniversityInstitute(PhDUniversityInstitute);
		}

		if (PhDQualification == null) {
			candidateFormImpl.setPhDQualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPhDQualification(PhDQualification);
		}

		if (PhDYearOfPassing == null) {
			candidateFormImpl.setPhDYearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPhDYearOfPassing(PhDYearOfPassing);
		}

		if (PhDGrade == null) {
			candidateFormImpl.setPhDGrade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setPhDGrade(PhDGrade);
		}

		if (other1UniversityInstitute == null) {
			candidateFormImpl.setOther1UniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther1UniversityInstitute(other1UniversityInstitute);
		}

		if (other1Qualification == null) {
			candidateFormImpl.setOther1Qualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther1Qualification(other1Qualification);
		}

		if (other1YearOfPassing == null) {
			candidateFormImpl.setOther1YearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther1YearOfPassing(other1YearOfPassing);
		}

		if (other1Grade == null) {
			candidateFormImpl.setOther1Grade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther1Grade(other1Grade);
		}

		if (other2UniversityInstitute == null) {
			candidateFormImpl.setOther2UniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther2UniversityInstitute(other2UniversityInstitute);
		}

		if (other2Qualification == null) {
			candidateFormImpl.setOther2Qualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther2Qualification(other2Qualification);
		}

		if (other2YearOfPassing == null) {
			candidateFormImpl.setOther2YearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther2YearOfPassing(other2YearOfPassing);
		}

		if (other2Grade == null) {
			candidateFormImpl.setOther2Grade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther2Grade(other2Grade);
		}

		if (other3UniversityInstitute == null) {
			candidateFormImpl.setOther3UniversityInstitute(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther3UniversityInstitute(other3UniversityInstitute);
		}

		if (other3Qualification == null) {
			candidateFormImpl.setOther3Qualification(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther3Qualification(other3Qualification);
		}

		if (other3YearOfPassing == null) {
			candidateFormImpl.setOther3YearOfPassing(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther3YearOfPassing(other3YearOfPassing);
		}

		if (other3Grade == null) {
			candidateFormImpl.setOther3Grade(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setOther3Grade(other3Grade);
		}

		if (UPLOADFILE == null) {
			candidateFormImpl.setUPLOADFILE(StringPool.BLANK);
		}
		else {
			candidateFormImpl.setUPLOADFILE(UPLOADFILE);
		}

		candidateFormImpl.resetOriginalValues();

		return candidateFormImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		CaId = objectInput.readLong();
		firstName = objectInput.readUTF();
		surname = objectInput.readUTF();
		password = objectInput.readUTF();
		father_SpouseName = objectInput.readUTF();
		aadharCardNo = objectInput.readUTF();
		panCardNo = objectInput.readUTF();
		bankAccountNo = objectInput.readUTF();
		employmentExRegnNo = objectInput.readUTF();
		dateOfBirth = objectInput.readUTF();
		nativeLocation = objectInput.readUTF();
		motherTongue = objectInput.readUTF();
		identificationMark = objectInput.readUTF();
		domicile = objectInput.readUTF();
		languagesKnown = objectInput.readUTF();
		relCompany = objectInput.readUTF();
		relLocation = objectInput.readUTF();
		relRole = objectInput.readUTF();
		relFromDate = objectInput.readUTF();
		relToDate = objectInput.readUTF();
		relLeavingReason = objectInput.readUTF();
		handicapDetail = objectInput.readUTF();
		religion = objectInput.readUTF();
		caste = objectInput.readUTF();
		subCaste = objectInput.readUTF();
		maritalStatus = objectInput.readUTF();
		ableToJoin = objectInput.readUTF();
		ableToDays = objectInput.readUTF();
		ableToMonth = objectInput.readUTF();
		address = objectInput.readUTF();
		city = objectInput.readUTF();
		state = objectInput.readUTF();
		pin = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		alternateEmailID = objectInput.readUTF();
		mobile = objectInput.readUTF();
		alternateMobile = objectInput.readUTF();
		personAlternateNoGiven = objectInput.readUTF();
		mainQualification = objectInput.readUTF();
		specialization = objectInput.readUTF();
		trade = objectInput.readUTF();
		totalYrExperience = objectInput.readUTF();
		skill_Proficiency = objectInput.readUTF();
		SECURITYCLEARFROM = objectInput.readUTF();
		SECURITYCLEARTILL = objectInput.readUTF();
		MEDICALFITDOCNAME = objectInput.readUTF();
		MEDICALFITDOCADDR = objectInput.readUTF();
		MEDICALFITDOCREGNNO = objectInput.readUTF();
		MEDICALFITDOCTILL = objectInput.readUTF();
		currentCompanyName = objectInput.readUTF();
		currentCompanyAddress = objectInput.readUTF();
		workingSinceDate = objectInput.readUTF();
		designation = objectInput.readUTF();
		CTCFixed = objectInput.readUTF();
		CTCVariable = objectInput.readUTF();
		CTCTotal = objectInput.readUTF();
		role = objectInput.readUTF();
		location = objectInput.readUTF();
		noticePeriod = objectInput.readUTF();
		firstCompanyName = objectInput.readUTF();
		firstFromDate = objectInput.readUTF();
		firstToDate = objectInput.readUTF();
		firstCLocation = objectInput.readUTF();
		firstCDesignation = objectInput.readUTF();
		firstFixedCTC = objectInput.readUTF();
		firstVariableCTC = objectInput.readUTF();
		firstTotalCTC = objectInput.readUTF();
		firstRemarkIfAny = objectInput.readUTF();
		secoundCompanyName = objectInput.readUTF();
		secoundFromDate = objectInput.readUTF();
		secoundToDate = objectInput.readUTF();
		secoundCLocation = objectInput.readUTF();
		secoundCDesignation = objectInput.readUTF();
		secoundFixedCTC = objectInput.readUTF();
		secoundVariableCTC = objectInput.readUTF();
		secoundTotalCTC = objectInput.readUTF();
		secoundRemarkIfAny = objectInput.readUTF();
		thirdCompanyName = objectInput.readUTF();
		thirdFromDate = objectInput.readUTF();
		thirdToDate = objectInput.readUTF();
		thirdCLocation = objectInput.readUTF();
		thirdCDesignation = objectInput.readUTF();
		thirdFixedCTC = objectInput.readUTF();
		thirdVariableCTC = objectInput.readUTF();
		thirdTotalCTC = objectInput.readUTF();
		thirdRemarkIfAny = objectInput.readUTF();
		forthCompanyName = objectInput.readUTF();
		forthFromDate = objectInput.readUTF();
		forthToDate = objectInput.readUTF();
		forthCLocation = objectInput.readUTF();
		forthCDesignation = objectInput.readUTF();
		forthFixedCTC = objectInput.readUTF();
		forthVariableCTC = objectInput.readUTF();
		forthTotalCTC = objectInput.readUTF();
		forthRemarkIfAny = objectInput.readUTF();
		fifthCompanyName = objectInput.readUTF();
		fifthFromDate = objectInput.readUTF();
		fifthToDate = objectInput.readUTF();
		fifthCLocation = objectInput.readUTF();
		fifthCDesignation = objectInput.readUTF();
		fifthFixedCTC = objectInput.readUTF();
		fifthVariableCTC = objectInput.readUTF();
		fifthTotalCTC = objectInput.readUTF();
		fifthRemarkIfAny = objectInput.readUTF();
		SSCQualification = objectInput.readUTF();
		SSCUniversityInstitute = objectInput.readUTF();
		SSCYearOfPassing = objectInput.readUTF();
		SSCGrade = objectInput.readUTF();
		HSCUniversityInstitute = objectInput.readUTF();
		HSCQualification = objectInput.readUTF();
		HSCYearOfPassing = objectInput.readUTF();
		HSCGrade = objectInput.readUTF();
		GradUniversityInstitute = objectInput.readUTF();
		GradQualification = objectInput.readUTF();
		GradYearOfPassing = objectInput.readUTF();
		GradGrade = objectInput.readUTF();
		PGUniversityInstitute = objectInput.readUTF();
		PGQualification = objectInput.readUTF();
		PGYearOfPassing = objectInput.readUTF();
		PGGrade = objectInput.readUTF();
		PhDUniversityInstitute = objectInput.readUTF();
		PhDQualification = objectInput.readUTF();
		PhDYearOfPassing = objectInput.readUTF();
		PhDGrade = objectInput.readUTF();
		other1UniversityInstitute = objectInput.readUTF();
		other1Qualification = objectInput.readUTF();
		other1YearOfPassing = objectInput.readUTF();
		other1Grade = objectInput.readUTF();
		other2UniversityInstitute = objectInput.readUTF();
		other2Qualification = objectInput.readUTF();
		other2YearOfPassing = objectInput.readUTF();
		other2Grade = objectInput.readUTF();
		other3UniversityInstitute = objectInput.readUTF();
		other3Qualification = objectInput.readUTF();
		other3YearOfPassing = objectInput.readUTF();
		other3Grade = objectInput.readUTF();
		UPLOADFILE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(CaId);

		if (firstName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (surname == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(surname);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		if (father_SpouseName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(father_SpouseName);
		}

		if (aadharCardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(aadharCardNo);
		}

		if (panCardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(panCardNo);
		}

		if (bankAccountNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(bankAccountNo);
		}

		if (employmentExRegnNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employmentExRegnNo);
		}

		if (dateOfBirth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(dateOfBirth);
		}

		if (nativeLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nativeLocation);
		}

		if (motherTongue == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(motherTongue);
		}

		if (identificationMark == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(identificationMark);
		}

		if (domicile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(domicile);
		}

		if (languagesKnown == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(languagesKnown);
		}

		if (relCompany == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relCompany);
		}

		if (relLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relLocation);
		}

		if (relRole == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relRole);
		}

		if (relFromDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relFromDate);
		}

		if (relToDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relToDate);
		}

		if (relLeavingReason == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(relLeavingReason);
		}

		if (handicapDetail == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(handicapDetail);
		}

		if (religion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(religion);
		}

		if (caste == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(caste);
		}

		if (subCaste == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subCaste);
		}

		if (maritalStatus == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(maritalStatus);
		}

		if (ableToJoin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ableToJoin);
		}

		if (ableToDays == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ableToDays);
		}

		if (ableToMonth == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ableToMonth);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}

		if (pin == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(pin);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (alternateEmailID == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alternateEmailID);
		}

		if (mobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (alternateMobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(alternateMobile);
		}

		if (personAlternateNoGiven == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(personAlternateNoGiven);
		}

		if (mainQualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mainQualification);
		}

		if (specialization == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(specialization);
		}

		if (trade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(trade);
		}

		if (totalYrExperience == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(totalYrExperience);
		}

		if (skill_Proficiency == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(skill_Proficiency);
		}

		if (SECURITYCLEARFROM == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SECURITYCLEARFROM);
		}

		if (SECURITYCLEARTILL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SECURITYCLEARTILL);
		}

		if (MEDICALFITDOCNAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MEDICALFITDOCNAME);
		}

		if (MEDICALFITDOCADDR == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MEDICALFITDOCADDR);
		}

		if (MEDICALFITDOCREGNNO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MEDICALFITDOCREGNNO);
		}

		if (MEDICALFITDOCTILL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MEDICALFITDOCTILL);
		}

		if (currentCompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currentCompanyName);
		}

		if (currentCompanyAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(currentCompanyAddress);
		}

		if (workingSinceDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(workingSinceDate);
		}

		if (designation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(designation);
		}

		if (CTCFixed == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CTCFixed);
		}

		if (CTCVariable == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CTCVariable);
		}

		if (CTCTotal == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(CTCTotal);
		}

		if (role == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(role);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (noticePeriod == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(noticePeriod);
		}

		if (firstCompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstCompanyName);
		}

		if (firstFromDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstFromDate);
		}

		if (firstToDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstToDate);
		}

		if (firstCLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstCLocation);
		}

		if (firstCDesignation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstCDesignation);
		}

		if (firstFixedCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstFixedCTC);
		}

		if (firstVariableCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstVariableCTC);
		}

		if (firstTotalCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstTotalCTC);
		}

		if (firstRemarkIfAny == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(firstRemarkIfAny);
		}

		if (secoundCompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundCompanyName);
		}

		if (secoundFromDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundFromDate);
		}

		if (secoundToDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundToDate);
		}

		if (secoundCLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundCLocation);
		}

		if (secoundCDesignation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundCDesignation);
		}

		if (secoundFixedCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundFixedCTC);
		}

		if (secoundVariableCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundVariableCTC);
		}

		if (secoundTotalCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundTotalCTC);
		}

		if (secoundRemarkIfAny == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(secoundRemarkIfAny);
		}

		if (thirdCompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdCompanyName);
		}

		if (thirdFromDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdFromDate);
		}

		if (thirdToDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdToDate);
		}

		if (thirdCLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdCLocation);
		}

		if (thirdCDesignation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdCDesignation);
		}

		if (thirdFixedCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdFixedCTC);
		}

		if (thirdVariableCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdVariableCTC);
		}

		if (thirdTotalCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdTotalCTC);
		}

		if (thirdRemarkIfAny == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(thirdRemarkIfAny);
		}

		if (forthCompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthCompanyName);
		}

		if (forthFromDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthFromDate);
		}

		if (forthToDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthToDate);
		}

		if (forthCLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthCLocation);
		}

		if (forthCDesignation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthCDesignation);
		}

		if (forthFixedCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthFixedCTC);
		}

		if (forthVariableCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthVariableCTC);
		}

		if (forthTotalCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthTotalCTC);
		}

		if (forthRemarkIfAny == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(forthRemarkIfAny);
		}

		if (fifthCompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthCompanyName);
		}

		if (fifthFromDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthFromDate);
		}

		if (fifthToDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthToDate);
		}

		if (fifthCLocation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthCLocation);
		}

		if (fifthCDesignation == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthCDesignation);
		}

		if (fifthFixedCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthFixedCTC);
		}

		if (fifthVariableCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthVariableCTC);
		}

		if (fifthTotalCTC == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthTotalCTC);
		}

		if (fifthRemarkIfAny == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fifthRemarkIfAny);
		}

		if (SSCQualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SSCQualification);
		}

		if (SSCUniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SSCUniversityInstitute);
		}

		if (SSCYearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SSCYearOfPassing);
		}

		if (SSCGrade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SSCGrade);
		}

		if (HSCUniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(HSCUniversityInstitute);
		}

		if (HSCQualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(HSCQualification);
		}

		if (HSCYearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(HSCYearOfPassing);
		}

		if (HSCGrade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(HSCGrade);
		}

		if (GradUniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GradUniversityInstitute);
		}

		if (GradQualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GradQualification);
		}

		if (GradYearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GradYearOfPassing);
		}

		if (GradGrade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GradGrade);
		}

		if (PGUniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PGUniversityInstitute);
		}

		if (PGQualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PGQualification);
		}

		if (PGYearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PGYearOfPassing);
		}

		if (PGGrade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PGGrade);
		}

		if (PhDUniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PhDUniversityInstitute);
		}

		if (PhDQualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PhDQualification);
		}

		if (PhDYearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PhDYearOfPassing);
		}

		if (PhDGrade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(PhDGrade);
		}

		if (other1UniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other1UniversityInstitute);
		}

		if (other1Qualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other1Qualification);
		}

		if (other1YearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other1YearOfPassing);
		}

		if (other1Grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other1Grade);
		}

		if (other2UniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other2UniversityInstitute);
		}

		if (other2Qualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other2Qualification);
		}

		if (other2YearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other2YearOfPassing);
		}

		if (other2Grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other2Grade);
		}

		if (other3UniversityInstitute == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other3UniversityInstitute);
		}

		if (other3Qualification == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other3Qualification);
		}

		if (other3YearOfPassing == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other3YearOfPassing);
		}

		if (other3Grade == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(other3Grade);
		}

		if (UPLOADFILE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(UPLOADFILE);
		}
	}

	public long CaId;
	public String firstName;
	public String surname;
	public String password;
	public String father_SpouseName;
	public String aadharCardNo;
	public String panCardNo;
	public String bankAccountNo;
	public String employmentExRegnNo;
	public String dateOfBirth;
	public String nativeLocation;
	public String motherTongue;
	public String identificationMark;
	public String domicile;
	public String languagesKnown;
	public String relCompany;
	public String relLocation;
	public String relRole;
	public String relFromDate;
	public String relToDate;
	public String relLeavingReason;
	public String handicapDetail;
	public String religion;
	public String caste;
	public String subCaste;
	public String maritalStatus;
	public String ableToJoin;
	public String ableToDays;
	public String ableToMonth;
	public String address;
	public String city;
	public String state;
	public String pin;
	public String emailAddress;
	public String alternateEmailID;
	public String mobile;
	public String alternateMobile;
	public String personAlternateNoGiven;
	public String mainQualification;
	public String specialization;
	public String trade;
	public String totalYrExperience;
	public String skill_Proficiency;
	public String SECURITYCLEARFROM;
	public String SECURITYCLEARTILL;
	public String MEDICALFITDOCNAME;
	public String MEDICALFITDOCADDR;
	public String MEDICALFITDOCREGNNO;
	public String MEDICALFITDOCTILL;
	public String currentCompanyName;
	public String currentCompanyAddress;
	public String workingSinceDate;
	public String designation;
	public String CTCFixed;
	public String CTCVariable;
	public String CTCTotal;
	public String role;
	public String location;
	public String noticePeriod;
	public String firstCompanyName;
	public String firstFromDate;
	public String firstToDate;
	public String firstCLocation;
	public String firstCDesignation;
	public String firstFixedCTC;
	public String firstVariableCTC;
	public String firstTotalCTC;
	public String firstRemarkIfAny;
	public String secoundCompanyName;
	public String secoundFromDate;
	public String secoundToDate;
	public String secoundCLocation;
	public String secoundCDesignation;
	public String secoundFixedCTC;
	public String secoundVariableCTC;
	public String secoundTotalCTC;
	public String secoundRemarkIfAny;
	public String thirdCompanyName;
	public String thirdFromDate;
	public String thirdToDate;
	public String thirdCLocation;
	public String thirdCDesignation;
	public String thirdFixedCTC;
	public String thirdVariableCTC;
	public String thirdTotalCTC;
	public String thirdRemarkIfAny;
	public String forthCompanyName;
	public String forthFromDate;
	public String forthToDate;
	public String forthCLocation;
	public String forthCDesignation;
	public String forthFixedCTC;
	public String forthVariableCTC;
	public String forthTotalCTC;
	public String forthRemarkIfAny;
	public String fifthCompanyName;
	public String fifthFromDate;
	public String fifthToDate;
	public String fifthCLocation;
	public String fifthCDesignation;
	public String fifthFixedCTC;
	public String fifthVariableCTC;
	public String fifthTotalCTC;
	public String fifthRemarkIfAny;
	public String SSCQualification;
	public String SSCUniversityInstitute;
	public String SSCYearOfPassing;
	public String SSCGrade;
	public String HSCUniversityInstitute;
	public String HSCQualification;
	public String HSCYearOfPassing;
	public String HSCGrade;
	public String GradUniversityInstitute;
	public String GradQualification;
	public String GradYearOfPassing;
	public String GradGrade;
	public String PGUniversityInstitute;
	public String PGQualification;
	public String PGYearOfPassing;
	public String PGGrade;
	public String PhDUniversityInstitute;
	public String PhDQualification;
	public String PhDYearOfPassing;
	public String PhDGrade;
	public String other1UniversityInstitute;
	public String other1Qualification;
	public String other1YearOfPassing;
	public String other1Grade;
	public String other2UniversityInstitute;
	public String other2Qualification;
	public String other2YearOfPassing;
	public String other2Grade;
	public String other3UniversityInstitute;
	public String other3Qualification;
	public String other3YearOfPassing;
	public String other3Grade;
	public String UPLOADFILE;
}