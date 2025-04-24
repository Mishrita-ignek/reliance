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

package com.redlatm.form.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CandidateForm}.
 * </p>
 *
 * @author Mukesh,Vipin
 * @see CandidateForm
 * @generated
 */
@ProviderType
public class CandidateFormWrapper implements CandidateForm,
	ModelWrapper<CandidateForm> {
	public CandidateFormWrapper(CandidateForm candidateForm) {
		_candidateForm = candidateForm;
	}

	@Override
	public Class<?> getModelClass() {
		return CandidateForm.class;
	}

	@Override
	public String getModelClassName() {
		return CandidateForm.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("CaId", getCaId());
		attributes.put("firstName", getFirstName());
		attributes.put("surname", getSurname());
		attributes.put("password", getPassword());
		attributes.put("father_SpouseName", getFather_SpouseName());
		attributes.put("aadharCardNo", getAadharCardNo());
		attributes.put("panCardNo", getPanCardNo());
		attributes.put("bankAccountNo", getBankAccountNo());
		attributes.put("employmentExRegnNo", getEmploymentExRegnNo());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("nativeLocation", getNativeLocation());
		attributes.put("motherTongue", getMotherTongue());
		attributes.put("identificationMark", getIdentificationMark());
		attributes.put("domicile", getDomicile());
		attributes.put("languagesKnown", getLanguagesKnown());
		attributes.put("relCompany", getRelCompany());
		attributes.put("relLocation", getRelLocation());
		attributes.put("relRole", getRelRole());
		attributes.put("relFromDate", getRelFromDate());
		attributes.put("relToDate", getRelToDate());
		attributes.put("relLeavingReason", getRelLeavingReason());
		attributes.put("handicapDetail", getHandicapDetail());
		attributes.put("religion", getReligion());
		attributes.put("caste", getCaste());
		attributes.put("subCaste", getSubCaste());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("ableToJoin", getAbleToJoin());
		attributes.put("ableToDays", getAbleToDays());
		attributes.put("ableToMonth", getAbleToMonth());
		attributes.put("address", getAddress());
		attributes.put("city", getCity());
		attributes.put("state", getState());
		attributes.put("pin", getPin());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("alternateEmailID", getAlternateEmailID());
		attributes.put("mobile", getMobile());
		attributes.put("alternateMobile", getAlternateMobile());
		attributes.put("personAlternateNoGiven", getPersonAlternateNoGiven());
		attributes.put("mainQualification", getMainQualification());
		attributes.put("specialization", getSpecialization());
		attributes.put("trade", getTrade());
		attributes.put("totalYrExperience", getTotalYrExperience());
		attributes.put("skill_Proficiency", getSkill_Proficiency());
		attributes.put("SECURITYCLEARFROM", getSECURITYCLEARFROM());
		attributes.put("SECURITYCLEARTILL", getSECURITYCLEARTILL());
		attributes.put("MEDICALFITDOCNAME", getMEDICALFITDOCNAME());
		attributes.put("MEDICALFITDOCADDR", getMEDICALFITDOCADDR());
		attributes.put("MEDICALFITDOCREGNNO", getMEDICALFITDOCREGNNO());
		attributes.put("MEDICALFITDOCTILL", getMEDICALFITDOCTILL());
		attributes.put("currentCompanyName", getCurrentCompanyName());
		attributes.put("currentCompanyAddress", getCurrentCompanyAddress());
		attributes.put("workingSinceDate", getWorkingSinceDate());
		attributes.put("designation", getDesignation());
		attributes.put("CTCFixed", getCTCFixed());
		attributes.put("CTCVariable", getCTCVariable());
		attributes.put("CTCTotal", getCTCTotal());
		attributes.put("role", getRole());
		attributes.put("location", getLocation());
		attributes.put("noticePeriod", getNoticePeriod());
		attributes.put("firstCompanyName", getFirstCompanyName());
		attributes.put("firstFromDate", getFirstFromDate());
		attributes.put("firstToDate", getFirstToDate());
		attributes.put("firstCLocation", getFirstCLocation());
		attributes.put("firstCDesignation", getFirstCDesignation());
		attributes.put("firstFixedCTC", getFirstFixedCTC());
		attributes.put("firstVariableCTC", getFirstVariableCTC());
		attributes.put("firstTotalCTC", getFirstTotalCTC());
		attributes.put("firstRemarkIfAny", getFirstRemarkIfAny());
		attributes.put("secoundCompanyName", getSecoundCompanyName());
		attributes.put("secoundFromDate", getSecoundFromDate());
		attributes.put("secoundToDate", getSecoundToDate());
		attributes.put("secoundCLocation", getSecoundCLocation());
		attributes.put("secoundCDesignation", getSecoundCDesignation());
		attributes.put("secoundFixedCTC", getSecoundFixedCTC());
		attributes.put("secoundVariableCTC", getSecoundVariableCTC());
		attributes.put("secoundTotalCTC", getSecoundTotalCTC());
		attributes.put("secoundRemarkIfAny", getSecoundRemarkIfAny());
		attributes.put("thirdCompanyName", getThirdCompanyName());
		attributes.put("thirdFromDate", getThirdFromDate());
		attributes.put("thirdToDate", getThirdToDate());
		attributes.put("thirdCLocation", getThirdCLocation());
		attributes.put("thirdCDesignation", getThirdCDesignation());
		attributes.put("thirdFixedCTC", getThirdFixedCTC());
		attributes.put("thirdVariableCTC", getThirdVariableCTC());
		attributes.put("thirdTotalCTC", getThirdTotalCTC());
		attributes.put("thirdRemarkIfAny", getThirdRemarkIfAny());
		attributes.put("forthCompanyName", getForthCompanyName());
		attributes.put("forthFromDate", getForthFromDate());
		attributes.put("forthToDate", getForthToDate());
		attributes.put("forthCLocation", getForthCLocation());
		attributes.put("forthCDesignation", getForthCDesignation());
		attributes.put("forthFixedCTC", getForthFixedCTC());
		attributes.put("forthVariableCTC", getForthVariableCTC());
		attributes.put("forthTotalCTC", getForthTotalCTC());
		attributes.put("forthRemarkIfAny", getForthRemarkIfAny());
		attributes.put("fifthCompanyName", getFifthCompanyName());
		attributes.put("fifthFromDate", getFifthFromDate());
		attributes.put("fifthToDate", getFifthToDate());
		attributes.put("fifthCLocation", getFifthCLocation());
		attributes.put("fifthCDesignation", getFifthCDesignation());
		attributes.put("fifthFixedCTC", getFifthFixedCTC());
		attributes.put("fifthVariableCTC", getFifthVariableCTC());
		attributes.put("fifthTotalCTC", getFifthTotalCTC());
		attributes.put("fifthRemarkIfAny", getFifthRemarkIfAny());
		attributes.put("SSCQualification", getSSCQualification());
		attributes.put("SSCUniversityInstitute", getSSCUniversityInstitute());
		attributes.put("SSCYearOfPassing", getSSCYearOfPassing());
		attributes.put("SSCGrade", getSSCGrade());
		attributes.put("HSCUniversityInstitute", getHSCUniversityInstitute());
		attributes.put("HSCQualification", getHSCQualification());
		attributes.put("HSCYearOfPassing", getHSCYearOfPassing());
		attributes.put("HSCGrade", getHSCGrade());
		attributes.put("GradUniversityInstitute", getGradUniversityInstitute());
		attributes.put("GradQualification", getGradQualification());
		attributes.put("GradYearOfPassing", getGradYearOfPassing());
		attributes.put("GradGrade", getGradGrade());
		attributes.put("PGUniversityInstitute", getPGUniversityInstitute());
		attributes.put("PGQualification", getPGQualification());
		attributes.put("PGYearOfPassing", getPGYearOfPassing());
		attributes.put("PGGrade", getPGGrade());
		attributes.put("PhDUniversityInstitute", getPhDUniversityInstitute());
		attributes.put("PhDQualification", getPhDQualification());
		attributes.put("PhDYearOfPassing", getPhDYearOfPassing());
		attributes.put("PhDGrade", getPhDGrade());
		attributes.put("other1UniversityInstitute",
			getOther1UniversityInstitute());
		attributes.put("other1Qualification", getOther1Qualification());
		attributes.put("other1YearOfPassing", getOther1YearOfPassing());
		attributes.put("other1Grade", getOther1Grade());
		attributes.put("other2UniversityInstitute",
			getOther2UniversityInstitute());
		attributes.put("other2Qualification", getOther2Qualification());
		attributes.put("other2YearOfPassing", getOther2YearOfPassing());
		attributes.put("other2Grade", getOther2Grade());
		attributes.put("other3UniversityInstitute",
			getOther3UniversityInstitute());
		attributes.put("other3Qualification", getOther3Qualification());
		attributes.put("other3YearOfPassing", getOther3YearOfPassing());
		attributes.put("other3Grade", getOther3Grade());
		attributes.put("UPLOADFILE", getUPLOADFILE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long CaId = (Long)attributes.get("CaId");

		if (CaId != null) {
			setCaId(CaId);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String surname = (String)attributes.get("surname");

		if (surname != null) {
			setSurname(surname);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		String father_SpouseName = (String)attributes.get("father_SpouseName");

		if (father_SpouseName != null) {
			setFather_SpouseName(father_SpouseName);
		}

		String aadharCardNo = (String)attributes.get("aadharCardNo");

		if (aadharCardNo != null) {
			setAadharCardNo(aadharCardNo);
		}

		String panCardNo = (String)attributes.get("panCardNo");

		if (panCardNo != null) {
			setPanCardNo(panCardNo);
		}

		String bankAccountNo = (String)attributes.get("bankAccountNo");

		if (bankAccountNo != null) {
			setBankAccountNo(bankAccountNo);
		}

		String employmentExRegnNo = (String)attributes.get("employmentExRegnNo");

		if (employmentExRegnNo != null) {
			setEmploymentExRegnNo(employmentExRegnNo);
		}

		String dateOfBirth = (String)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String nativeLocation = (String)attributes.get("nativeLocation");

		if (nativeLocation != null) {
			setNativeLocation(nativeLocation);
		}

		String motherTongue = (String)attributes.get("motherTongue");

		if (motherTongue != null) {
			setMotherTongue(motherTongue);
		}

		String identificationMark = (String)attributes.get("identificationMark");

		if (identificationMark != null) {
			setIdentificationMark(identificationMark);
		}

		String domicile = (String)attributes.get("domicile");

		if (domicile != null) {
			setDomicile(domicile);
		}

		String languagesKnown = (String)attributes.get("languagesKnown");

		if (languagesKnown != null) {
			setLanguagesKnown(languagesKnown);
		}

		String relCompany = (String)attributes.get("relCompany");

		if (relCompany != null) {
			setRelCompany(relCompany);
		}

		String relLocation = (String)attributes.get("relLocation");

		if (relLocation != null) {
			setRelLocation(relLocation);
		}

		String relRole = (String)attributes.get("relRole");

		if (relRole != null) {
			setRelRole(relRole);
		}

		String relFromDate = (String)attributes.get("relFromDate");

		if (relFromDate != null) {
			setRelFromDate(relFromDate);
		}

		String relToDate = (String)attributes.get("relToDate");

		if (relToDate != null) {
			setRelToDate(relToDate);
		}

		String relLeavingReason = (String)attributes.get("relLeavingReason");

		if (relLeavingReason != null) {
			setRelLeavingReason(relLeavingReason);
		}

		String handicapDetail = (String)attributes.get("handicapDetail");

		if (handicapDetail != null) {
			setHandicapDetail(handicapDetail);
		}

		String religion = (String)attributes.get("religion");

		if (religion != null) {
			setReligion(religion);
		}

		String caste = (String)attributes.get("caste");

		if (caste != null) {
			setCaste(caste);
		}

		String subCaste = (String)attributes.get("subCaste");

		if (subCaste != null) {
			setSubCaste(subCaste);
		}

		String maritalStatus = (String)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
		}

		String ableToJoin = (String)attributes.get("ableToJoin");

		if (ableToJoin != null) {
			setAbleToJoin(ableToJoin);
		}

		String ableToDays = (String)attributes.get("ableToDays");

		if (ableToDays != null) {
			setAbleToDays(ableToDays);
		}

		String ableToMonth = (String)attributes.get("ableToMonth");

		if (ableToMonth != null) {
			setAbleToMonth(ableToMonth);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String pin = (String)attributes.get("pin");

		if (pin != null) {
			setPin(pin);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String alternateEmailID = (String)attributes.get("alternateEmailID");

		if (alternateEmailID != null) {
			setAlternateEmailID(alternateEmailID);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String alternateMobile = (String)attributes.get("alternateMobile");

		if (alternateMobile != null) {
			setAlternateMobile(alternateMobile);
		}

		String personAlternateNoGiven = (String)attributes.get(
				"personAlternateNoGiven");

		if (personAlternateNoGiven != null) {
			setPersonAlternateNoGiven(personAlternateNoGiven);
		}

		String mainQualification = (String)attributes.get("mainQualification");

		if (mainQualification != null) {
			setMainQualification(mainQualification);
		}

		String specialization = (String)attributes.get("specialization");

		if (specialization != null) {
			setSpecialization(specialization);
		}

		String trade = (String)attributes.get("trade");

		if (trade != null) {
			setTrade(trade);
		}

		String totalYrExperience = (String)attributes.get("totalYrExperience");

		if (totalYrExperience != null) {
			setTotalYrExperience(totalYrExperience);
		}

		String skill_Proficiency = (String)attributes.get("skill_Proficiency");

		if (skill_Proficiency != null) {
			setSkill_Proficiency(skill_Proficiency);
		}

		String SECURITYCLEARFROM = (String)attributes.get("SECURITYCLEARFROM");

		if (SECURITYCLEARFROM != null) {
			setSECURITYCLEARFROM(SECURITYCLEARFROM);
		}

		String SECURITYCLEARTILL = (String)attributes.get("SECURITYCLEARTILL");

		if (SECURITYCLEARTILL != null) {
			setSECURITYCLEARTILL(SECURITYCLEARTILL);
		}

		String MEDICALFITDOCNAME = (String)attributes.get("MEDICALFITDOCNAME");

		if (MEDICALFITDOCNAME != null) {
			setMEDICALFITDOCNAME(MEDICALFITDOCNAME);
		}

		String MEDICALFITDOCADDR = (String)attributes.get("MEDICALFITDOCADDR");

		if (MEDICALFITDOCADDR != null) {
			setMEDICALFITDOCADDR(MEDICALFITDOCADDR);
		}

		String MEDICALFITDOCREGNNO = (String)attributes.get(
				"MEDICALFITDOCREGNNO");

		if (MEDICALFITDOCREGNNO != null) {
			setMEDICALFITDOCREGNNO(MEDICALFITDOCREGNNO);
		}

		String MEDICALFITDOCTILL = (String)attributes.get("MEDICALFITDOCTILL");

		if (MEDICALFITDOCTILL != null) {
			setMEDICALFITDOCTILL(MEDICALFITDOCTILL);
		}

		String currentCompanyName = (String)attributes.get("currentCompanyName");

		if (currentCompanyName != null) {
			setCurrentCompanyName(currentCompanyName);
		}

		String currentCompanyAddress = (String)attributes.get(
				"currentCompanyAddress");

		if (currentCompanyAddress != null) {
			setCurrentCompanyAddress(currentCompanyAddress);
		}

		String workingSinceDate = (String)attributes.get("workingSinceDate");

		if (workingSinceDate != null) {
			setWorkingSinceDate(workingSinceDate);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		String CTCFixed = (String)attributes.get("CTCFixed");

		if (CTCFixed != null) {
			setCTCFixed(CTCFixed);
		}

		String CTCVariable = (String)attributes.get("CTCVariable");

		if (CTCVariable != null) {
			setCTCVariable(CTCVariable);
		}

		String CTCTotal = (String)attributes.get("CTCTotal");

		if (CTCTotal != null) {
			setCTCTotal(CTCTotal);
		}

		String role = (String)attributes.get("role");

		if (role != null) {
			setRole(role);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String noticePeriod = (String)attributes.get("noticePeriod");

		if (noticePeriod != null) {
			setNoticePeriod(noticePeriod);
		}

		String firstCompanyName = (String)attributes.get("firstCompanyName");

		if (firstCompanyName != null) {
			setFirstCompanyName(firstCompanyName);
		}

		String firstFromDate = (String)attributes.get("firstFromDate");

		if (firstFromDate != null) {
			setFirstFromDate(firstFromDate);
		}

		String firstToDate = (String)attributes.get("firstToDate");

		if (firstToDate != null) {
			setFirstToDate(firstToDate);
		}

		String firstCLocation = (String)attributes.get("firstCLocation");

		if (firstCLocation != null) {
			setFirstCLocation(firstCLocation);
		}

		String firstCDesignation = (String)attributes.get("firstCDesignation");

		if (firstCDesignation != null) {
			setFirstCDesignation(firstCDesignation);
		}

		String firstFixedCTC = (String)attributes.get("firstFixedCTC");

		if (firstFixedCTC != null) {
			setFirstFixedCTC(firstFixedCTC);
		}

		String firstVariableCTC = (String)attributes.get("firstVariableCTC");

		if (firstVariableCTC != null) {
			setFirstVariableCTC(firstVariableCTC);
		}

		String firstTotalCTC = (String)attributes.get("firstTotalCTC");

		if (firstTotalCTC != null) {
			setFirstTotalCTC(firstTotalCTC);
		}

		String firstRemarkIfAny = (String)attributes.get("firstRemarkIfAny");

		if (firstRemarkIfAny != null) {
			setFirstRemarkIfAny(firstRemarkIfAny);
		}

		String secoundCompanyName = (String)attributes.get("secoundCompanyName");

		if (secoundCompanyName != null) {
			setSecoundCompanyName(secoundCompanyName);
		}

		String secoundFromDate = (String)attributes.get("secoundFromDate");

		if (secoundFromDate != null) {
			setSecoundFromDate(secoundFromDate);
		}

		String secoundToDate = (String)attributes.get("secoundToDate");

		if (secoundToDate != null) {
			setSecoundToDate(secoundToDate);
		}

		String secoundCLocation = (String)attributes.get("secoundCLocation");

		if (secoundCLocation != null) {
			setSecoundCLocation(secoundCLocation);
		}

		String secoundCDesignation = (String)attributes.get(
				"secoundCDesignation");

		if (secoundCDesignation != null) {
			setSecoundCDesignation(secoundCDesignation);
		}

		String secoundFixedCTC = (String)attributes.get("secoundFixedCTC");

		if (secoundFixedCTC != null) {
			setSecoundFixedCTC(secoundFixedCTC);
		}

		String secoundVariableCTC = (String)attributes.get("secoundVariableCTC");

		if (secoundVariableCTC != null) {
			setSecoundVariableCTC(secoundVariableCTC);
		}

		String secoundTotalCTC = (String)attributes.get("secoundTotalCTC");

		if (secoundTotalCTC != null) {
			setSecoundTotalCTC(secoundTotalCTC);
		}

		String secoundRemarkIfAny = (String)attributes.get("secoundRemarkIfAny");

		if (secoundRemarkIfAny != null) {
			setSecoundRemarkIfAny(secoundRemarkIfAny);
		}

		String thirdCompanyName = (String)attributes.get("thirdCompanyName");

		if (thirdCompanyName != null) {
			setThirdCompanyName(thirdCompanyName);
		}

		String thirdFromDate = (String)attributes.get("thirdFromDate");

		if (thirdFromDate != null) {
			setThirdFromDate(thirdFromDate);
		}

		String thirdToDate = (String)attributes.get("thirdToDate");

		if (thirdToDate != null) {
			setThirdToDate(thirdToDate);
		}

		String thirdCLocation = (String)attributes.get("thirdCLocation");

		if (thirdCLocation != null) {
			setThirdCLocation(thirdCLocation);
		}

		String thirdCDesignation = (String)attributes.get("thirdCDesignation");

		if (thirdCDesignation != null) {
			setThirdCDesignation(thirdCDesignation);
		}

		String thirdFixedCTC = (String)attributes.get("thirdFixedCTC");

		if (thirdFixedCTC != null) {
			setThirdFixedCTC(thirdFixedCTC);
		}

		String thirdVariableCTC = (String)attributes.get("thirdVariableCTC");

		if (thirdVariableCTC != null) {
			setThirdVariableCTC(thirdVariableCTC);
		}

		String thirdTotalCTC = (String)attributes.get("thirdTotalCTC");

		if (thirdTotalCTC != null) {
			setThirdTotalCTC(thirdTotalCTC);
		}

		String thirdRemarkIfAny = (String)attributes.get("thirdRemarkIfAny");

		if (thirdRemarkIfAny != null) {
			setThirdRemarkIfAny(thirdRemarkIfAny);
		}

		String forthCompanyName = (String)attributes.get("forthCompanyName");

		if (forthCompanyName != null) {
			setForthCompanyName(forthCompanyName);
		}

		String forthFromDate = (String)attributes.get("forthFromDate");

		if (forthFromDate != null) {
			setForthFromDate(forthFromDate);
		}

		String forthToDate = (String)attributes.get("forthToDate");

		if (forthToDate != null) {
			setForthToDate(forthToDate);
		}

		String forthCLocation = (String)attributes.get("forthCLocation");

		if (forthCLocation != null) {
			setForthCLocation(forthCLocation);
		}

		String forthCDesignation = (String)attributes.get("forthCDesignation");

		if (forthCDesignation != null) {
			setForthCDesignation(forthCDesignation);
		}

		String forthFixedCTC = (String)attributes.get("forthFixedCTC");

		if (forthFixedCTC != null) {
			setForthFixedCTC(forthFixedCTC);
		}

		String forthVariableCTC = (String)attributes.get("forthVariableCTC");

		if (forthVariableCTC != null) {
			setForthVariableCTC(forthVariableCTC);
		}

		String forthTotalCTC = (String)attributes.get("forthTotalCTC");

		if (forthTotalCTC != null) {
			setForthTotalCTC(forthTotalCTC);
		}

		String forthRemarkIfAny = (String)attributes.get("forthRemarkIfAny");

		if (forthRemarkIfAny != null) {
			setForthRemarkIfAny(forthRemarkIfAny);
		}

		String fifthCompanyName = (String)attributes.get("fifthCompanyName");

		if (fifthCompanyName != null) {
			setFifthCompanyName(fifthCompanyName);
		}

		String fifthFromDate = (String)attributes.get("fifthFromDate");

		if (fifthFromDate != null) {
			setFifthFromDate(fifthFromDate);
		}

		String fifthToDate = (String)attributes.get("fifthToDate");

		if (fifthToDate != null) {
			setFifthToDate(fifthToDate);
		}

		String fifthCLocation = (String)attributes.get("fifthCLocation");

		if (fifthCLocation != null) {
			setFifthCLocation(fifthCLocation);
		}

		String fifthCDesignation = (String)attributes.get("fifthCDesignation");

		if (fifthCDesignation != null) {
			setFifthCDesignation(fifthCDesignation);
		}

		String fifthFixedCTC = (String)attributes.get("fifthFixedCTC");

		if (fifthFixedCTC != null) {
			setFifthFixedCTC(fifthFixedCTC);
		}

		String fifthVariableCTC = (String)attributes.get("fifthVariableCTC");

		if (fifthVariableCTC != null) {
			setFifthVariableCTC(fifthVariableCTC);
		}

		String fifthTotalCTC = (String)attributes.get("fifthTotalCTC");

		if (fifthTotalCTC != null) {
			setFifthTotalCTC(fifthTotalCTC);
		}

		String fifthRemarkIfAny = (String)attributes.get("fifthRemarkIfAny");

		if (fifthRemarkIfAny != null) {
			setFifthRemarkIfAny(fifthRemarkIfAny);
		}

		String SSCQualification = (String)attributes.get("SSCQualification");

		if (SSCQualification != null) {
			setSSCQualification(SSCQualification);
		}

		String SSCUniversityInstitute = (String)attributes.get(
				"SSCUniversityInstitute");

		if (SSCUniversityInstitute != null) {
			setSSCUniversityInstitute(SSCUniversityInstitute);
		}

		String SSCYearOfPassing = (String)attributes.get("SSCYearOfPassing");

		if (SSCYearOfPassing != null) {
			setSSCYearOfPassing(SSCYearOfPassing);
		}

		String SSCGrade = (String)attributes.get("SSCGrade");

		if (SSCGrade != null) {
			setSSCGrade(SSCGrade);
		}

		String HSCUniversityInstitute = (String)attributes.get(
				"HSCUniversityInstitute");

		if (HSCUniversityInstitute != null) {
			setHSCUniversityInstitute(HSCUniversityInstitute);
		}

		String HSCQualification = (String)attributes.get("HSCQualification");

		if (HSCQualification != null) {
			setHSCQualification(HSCQualification);
		}

		String HSCYearOfPassing = (String)attributes.get("HSCYearOfPassing");

		if (HSCYearOfPassing != null) {
			setHSCYearOfPassing(HSCYearOfPassing);
		}

		String HSCGrade = (String)attributes.get("HSCGrade");

		if (HSCGrade != null) {
			setHSCGrade(HSCGrade);
		}

		String GradUniversityInstitute = (String)attributes.get(
				"GradUniversityInstitute");

		if (GradUniversityInstitute != null) {
			setGradUniversityInstitute(GradUniversityInstitute);
		}

		String GradQualification = (String)attributes.get("GradQualification");

		if (GradQualification != null) {
			setGradQualification(GradQualification);
		}

		String GradYearOfPassing = (String)attributes.get("GradYearOfPassing");

		if (GradYearOfPassing != null) {
			setGradYearOfPassing(GradYearOfPassing);
		}

		String GradGrade = (String)attributes.get("GradGrade");

		if (GradGrade != null) {
			setGradGrade(GradGrade);
		}

		String PGUniversityInstitute = (String)attributes.get(
				"PGUniversityInstitute");

		if (PGUniversityInstitute != null) {
			setPGUniversityInstitute(PGUniversityInstitute);
		}

		String PGQualification = (String)attributes.get("PGQualification");

		if (PGQualification != null) {
			setPGQualification(PGQualification);
		}

		String PGYearOfPassing = (String)attributes.get("PGYearOfPassing");

		if (PGYearOfPassing != null) {
			setPGYearOfPassing(PGYearOfPassing);
		}

		String PGGrade = (String)attributes.get("PGGrade");

		if (PGGrade != null) {
			setPGGrade(PGGrade);
		}

		String PhDUniversityInstitute = (String)attributes.get(
				"PhDUniversityInstitute");

		if (PhDUniversityInstitute != null) {
			setPhDUniversityInstitute(PhDUniversityInstitute);
		}

		String PhDQualification = (String)attributes.get("PhDQualification");

		if (PhDQualification != null) {
			setPhDQualification(PhDQualification);
		}

		String PhDYearOfPassing = (String)attributes.get("PhDYearOfPassing");

		if (PhDYearOfPassing != null) {
			setPhDYearOfPassing(PhDYearOfPassing);
		}

		String PhDGrade = (String)attributes.get("PhDGrade");

		if (PhDGrade != null) {
			setPhDGrade(PhDGrade);
		}

		String other1UniversityInstitute = (String)attributes.get(
				"other1UniversityInstitute");

		if (other1UniversityInstitute != null) {
			setOther1UniversityInstitute(other1UniversityInstitute);
		}

		String other1Qualification = (String)attributes.get(
				"other1Qualification");

		if (other1Qualification != null) {
			setOther1Qualification(other1Qualification);
		}

		String other1YearOfPassing = (String)attributes.get(
				"other1YearOfPassing");

		if (other1YearOfPassing != null) {
			setOther1YearOfPassing(other1YearOfPassing);
		}

		String other1Grade = (String)attributes.get("other1Grade");

		if (other1Grade != null) {
			setOther1Grade(other1Grade);
		}

		String other2UniversityInstitute = (String)attributes.get(
				"other2UniversityInstitute");

		if (other2UniversityInstitute != null) {
			setOther2UniversityInstitute(other2UniversityInstitute);
		}

		String other2Qualification = (String)attributes.get(
				"other2Qualification");

		if (other2Qualification != null) {
			setOther2Qualification(other2Qualification);
		}

		String other2YearOfPassing = (String)attributes.get(
				"other2YearOfPassing");

		if (other2YearOfPassing != null) {
			setOther2YearOfPassing(other2YearOfPassing);
		}

		String other2Grade = (String)attributes.get("other2Grade");

		if (other2Grade != null) {
			setOther2Grade(other2Grade);
		}

		String other3UniversityInstitute = (String)attributes.get(
				"other3UniversityInstitute");

		if (other3UniversityInstitute != null) {
			setOther3UniversityInstitute(other3UniversityInstitute);
		}

		String other3Qualification = (String)attributes.get(
				"other3Qualification");

		if (other3Qualification != null) {
			setOther3Qualification(other3Qualification);
		}

		String other3YearOfPassing = (String)attributes.get(
				"other3YearOfPassing");

		if (other3YearOfPassing != null) {
			setOther3YearOfPassing(other3YearOfPassing);
		}

		String other3Grade = (String)attributes.get("other3Grade");

		if (other3Grade != null) {
			setOther3Grade(other3Grade);
		}

		String UPLOADFILE = (String)attributes.get("UPLOADFILE");

		if (UPLOADFILE != null) {
			setUPLOADFILE(UPLOADFILE);
		}
	}

	@Override
	public CandidateForm toEscapedModel() {
		return new CandidateFormWrapper(_candidateForm.toEscapedModel());
	}

	@Override
	public CandidateForm toUnescapedModel() {
		return new CandidateFormWrapper(_candidateForm.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _candidateForm.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _candidateForm.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _candidateForm.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _candidateForm.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CandidateForm> toCacheModel() {
		return _candidateForm.toCacheModel();
	}

	@Override
	public int compareTo(CandidateForm candidateForm) {
		return _candidateForm.compareTo(candidateForm);
	}

	@Override
	public int hashCode() {
		return _candidateForm.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidateForm.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CandidateFormWrapper((CandidateForm)_candidateForm.clone());
	}

	/**
	* Returns the aadhar card no of this candidate form.
	*
	* @return the aadhar card no of this candidate form
	*/
	@Override
	public java.lang.String getAadharCardNo() {
		return _candidateForm.getAadharCardNo();
	}

	/**
	* Returns the able to days of this candidate form.
	*
	* @return the able to days of this candidate form
	*/
	@Override
	public java.lang.String getAbleToDays() {
		return _candidateForm.getAbleToDays();
	}

	/**
	* Returns the able to join of this candidate form.
	*
	* @return the able to join of this candidate form
	*/
	@Override
	public java.lang.String getAbleToJoin() {
		return _candidateForm.getAbleToJoin();
	}

	/**
	* Returns the able to month of this candidate form.
	*
	* @return the able to month of this candidate form
	*/
	@Override
	public java.lang.String getAbleToMonth() {
		return _candidateForm.getAbleToMonth();
	}

	/**
	* Returns the address of this candidate form.
	*
	* @return the address of this candidate form
	*/
	@Override
	public java.lang.String getAddress() {
		return _candidateForm.getAddress();
	}

	/**
	* Returns the alternate email ID of this candidate form.
	*
	* @return the alternate email ID of this candidate form
	*/
	@Override
	public java.lang.String getAlternateEmailID() {
		return _candidateForm.getAlternateEmailID();
	}

	/**
	* Returns the alternate mobile of this candidate form.
	*
	* @return the alternate mobile of this candidate form
	*/
	@Override
	public java.lang.String getAlternateMobile() {
		return _candidateForm.getAlternateMobile();
	}

	/**
	* Returns the bank account no of this candidate form.
	*
	* @return the bank account no of this candidate form
	*/
	@Override
	public java.lang.String getBankAccountNo() {
		return _candidateForm.getBankAccountNo();
	}

	/**
	* Returns the ctc fixed of this candidate form.
	*
	* @return the ctc fixed of this candidate form
	*/
	@Override
	public java.lang.String getCTCFixed() {
		return _candidateForm.getCTCFixed();
	}

	/**
	* Returns the ctc total of this candidate form.
	*
	* @return the ctc total of this candidate form
	*/
	@Override
	public java.lang.String getCTCTotal() {
		return _candidateForm.getCTCTotal();
	}

	/**
	* Returns the ctc variable of this candidate form.
	*
	* @return the ctc variable of this candidate form
	*/
	@Override
	public java.lang.String getCTCVariable() {
		return _candidateForm.getCTCVariable();
	}

	/**
	* Returns the caste of this candidate form.
	*
	* @return the caste of this candidate form
	*/
	@Override
	public java.lang.String getCaste() {
		return _candidateForm.getCaste();
	}

	/**
	* Returns the city of this candidate form.
	*
	* @return the city of this candidate form
	*/
	@Override
	public java.lang.String getCity() {
		return _candidateForm.getCity();
	}

	/**
	* Returns the current company address of this candidate form.
	*
	* @return the current company address of this candidate form
	*/
	@Override
	public java.lang.String getCurrentCompanyAddress() {
		return _candidateForm.getCurrentCompanyAddress();
	}

	/**
	* Returns the current company name of this candidate form.
	*
	* @return the current company name of this candidate form
	*/
	@Override
	public java.lang.String getCurrentCompanyName() {
		return _candidateForm.getCurrentCompanyName();
	}

	/**
	* Returns the date of birth of this candidate form.
	*
	* @return the date of birth of this candidate form
	*/
	@Override
	public java.lang.String getDateOfBirth() {
		return _candidateForm.getDateOfBirth();
	}

	/**
	* Returns the designation of this candidate form.
	*
	* @return the designation of this candidate form
	*/
	@Override
	public java.lang.String getDesignation() {
		return _candidateForm.getDesignation();
	}

	/**
	* Returns the domicile of this candidate form.
	*
	* @return the domicile of this candidate form
	*/
	@Override
	public java.lang.String getDomicile() {
		return _candidateForm.getDomicile();
	}

	/**
	* Returns the email address of this candidate form.
	*
	* @return the email address of this candidate form
	*/
	@Override
	public java.lang.String getEmailAddress() {
		return _candidateForm.getEmailAddress();
	}

	/**
	* Returns the employment ex regn no of this candidate form.
	*
	* @return the employment ex regn no of this candidate form
	*/
	@Override
	public java.lang.String getEmploymentExRegnNo() {
		return _candidateForm.getEmploymentExRegnNo();
	}

	/**
	* Returns the father_ spouse name of this candidate form.
	*
	* @return the father_ spouse name of this candidate form
	*/
	@Override
	public java.lang.String getFather_SpouseName() {
		return _candidateForm.getFather_SpouseName();
	}

	/**
	* Returns the fifth c designation of this candidate form.
	*
	* @return the fifth c designation of this candidate form
	*/
	@Override
	public java.lang.String getFifthCDesignation() {
		return _candidateForm.getFifthCDesignation();
	}

	/**
	* Returns the fifth c location of this candidate form.
	*
	* @return the fifth c location of this candidate form
	*/
	@Override
	public java.lang.String getFifthCLocation() {
		return _candidateForm.getFifthCLocation();
	}

	/**
	* Returns the fifth company name of this candidate form.
	*
	* @return the fifth company name of this candidate form
	*/
	@Override
	public java.lang.String getFifthCompanyName() {
		return _candidateForm.getFifthCompanyName();
	}

	/**
	* Returns the fifth fixed ctc of this candidate form.
	*
	* @return the fifth fixed ctc of this candidate form
	*/
	@Override
	public java.lang.String getFifthFixedCTC() {
		return _candidateForm.getFifthFixedCTC();
	}

	/**
	* Returns the fifth from date of this candidate form.
	*
	* @return the fifth from date of this candidate form
	*/
	@Override
	public java.lang.String getFifthFromDate() {
		return _candidateForm.getFifthFromDate();
	}

	/**
	* Returns the fifth remark if any of this candidate form.
	*
	* @return the fifth remark if any of this candidate form
	*/
	@Override
	public java.lang.String getFifthRemarkIfAny() {
		return _candidateForm.getFifthRemarkIfAny();
	}

	/**
	* Returns the fifth to date of this candidate form.
	*
	* @return the fifth to date of this candidate form
	*/
	@Override
	public java.lang.String getFifthToDate() {
		return _candidateForm.getFifthToDate();
	}

	/**
	* Returns the fifth total ctc of this candidate form.
	*
	* @return the fifth total ctc of this candidate form
	*/
	@Override
	public java.lang.String getFifthTotalCTC() {
		return _candidateForm.getFifthTotalCTC();
	}

	/**
	* Returns the fifth variable ctc of this candidate form.
	*
	* @return the fifth variable ctc of this candidate form
	*/
	@Override
	public java.lang.String getFifthVariableCTC() {
		return _candidateForm.getFifthVariableCTC();
	}

	/**
	* Returns the first c designation of this candidate form.
	*
	* @return the first c designation of this candidate form
	*/
	@Override
	public java.lang.String getFirstCDesignation() {
		return _candidateForm.getFirstCDesignation();
	}

	/**
	* Returns the first c location of this candidate form.
	*
	* @return the first c location of this candidate form
	*/
	@Override
	public java.lang.String getFirstCLocation() {
		return _candidateForm.getFirstCLocation();
	}

	/**
	* Returns the first company name of this candidate form.
	*
	* @return the first company name of this candidate form
	*/
	@Override
	public java.lang.String getFirstCompanyName() {
		return _candidateForm.getFirstCompanyName();
	}

	/**
	* Returns the first fixed ctc of this candidate form.
	*
	* @return the first fixed ctc of this candidate form
	*/
	@Override
	public java.lang.String getFirstFixedCTC() {
		return _candidateForm.getFirstFixedCTC();
	}

	/**
	* Returns the first from date of this candidate form.
	*
	* @return the first from date of this candidate form
	*/
	@Override
	public java.lang.String getFirstFromDate() {
		return _candidateForm.getFirstFromDate();
	}

	/**
	* Returns the first name of this candidate form.
	*
	* @return the first name of this candidate form
	*/
	@Override
	public java.lang.String getFirstName() {
		return _candidateForm.getFirstName();
	}

	/**
	* Returns the first remark if any of this candidate form.
	*
	* @return the first remark if any of this candidate form
	*/
	@Override
	public java.lang.String getFirstRemarkIfAny() {
		return _candidateForm.getFirstRemarkIfAny();
	}

	/**
	* Returns the first to date of this candidate form.
	*
	* @return the first to date of this candidate form
	*/
	@Override
	public java.lang.String getFirstToDate() {
		return _candidateForm.getFirstToDate();
	}

	/**
	* Returns the first total ctc of this candidate form.
	*
	* @return the first total ctc of this candidate form
	*/
	@Override
	public java.lang.String getFirstTotalCTC() {
		return _candidateForm.getFirstTotalCTC();
	}

	/**
	* Returns the first variable ctc of this candidate form.
	*
	* @return the first variable ctc of this candidate form
	*/
	@Override
	public java.lang.String getFirstVariableCTC() {
		return _candidateForm.getFirstVariableCTC();
	}

	/**
	* Returns the forth c designation of this candidate form.
	*
	* @return the forth c designation of this candidate form
	*/
	@Override
	public java.lang.String getForthCDesignation() {
		return _candidateForm.getForthCDesignation();
	}

	/**
	* Returns the forth c location of this candidate form.
	*
	* @return the forth c location of this candidate form
	*/
	@Override
	public java.lang.String getForthCLocation() {
		return _candidateForm.getForthCLocation();
	}

	/**
	* Returns the forth company name of this candidate form.
	*
	* @return the forth company name of this candidate form
	*/
	@Override
	public java.lang.String getForthCompanyName() {
		return _candidateForm.getForthCompanyName();
	}

	/**
	* Returns the forth fixed ctc of this candidate form.
	*
	* @return the forth fixed ctc of this candidate form
	*/
	@Override
	public java.lang.String getForthFixedCTC() {
		return _candidateForm.getForthFixedCTC();
	}

	/**
	* Returns the forth from date of this candidate form.
	*
	* @return the forth from date of this candidate form
	*/
	@Override
	public java.lang.String getForthFromDate() {
		return _candidateForm.getForthFromDate();
	}

	/**
	* Returns the forth remark if any of this candidate form.
	*
	* @return the forth remark if any of this candidate form
	*/
	@Override
	public java.lang.String getForthRemarkIfAny() {
		return _candidateForm.getForthRemarkIfAny();
	}

	/**
	* Returns the forth to date of this candidate form.
	*
	* @return the forth to date of this candidate form
	*/
	@Override
	public java.lang.String getForthToDate() {
		return _candidateForm.getForthToDate();
	}

	/**
	* Returns the forth total ctc of this candidate form.
	*
	* @return the forth total ctc of this candidate form
	*/
	@Override
	public java.lang.String getForthTotalCTC() {
		return _candidateForm.getForthTotalCTC();
	}

	/**
	* Returns the forth variable ctc of this candidate form.
	*
	* @return the forth variable ctc of this candidate form
	*/
	@Override
	public java.lang.String getForthVariableCTC() {
		return _candidateForm.getForthVariableCTC();
	}

	/**
	* Returns the grad grade of this candidate form.
	*
	* @return the grad grade of this candidate form
	*/
	@Override
	public java.lang.String getGradGrade() {
		return _candidateForm.getGradGrade();
	}

	/**
	* Returns the grad qualification of this candidate form.
	*
	* @return the grad qualification of this candidate form
	*/
	@Override
	public java.lang.String getGradQualification() {
		return _candidateForm.getGradQualification();
	}

	/**
	* Returns the grad university institute of this candidate form.
	*
	* @return the grad university institute of this candidate form
	*/
	@Override
	public java.lang.String getGradUniversityInstitute() {
		return _candidateForm.getGradUniversityInstitute();
	}

	/**
	* Returns the grad year of passing of this candidate form.
	*
	* @return the grad year of passing of this candidate form
	*/
	@Override
	public java.lang.String getGradYearOfPassing() {
		return _candidateForm.getGradYearOfPassing();
	}

	/**
	* Returns the hsc grade of this candidate form.
	*
	* @return the hsc grade of this candidate form
	*/
	@Override
	public java.lang.String getHSCGrade() {
		return _candidateForm.getHSCGrade();
	}

	/**
	* Returns the hsc qualification of this candidate form.
	*
	* @return the hsc qualification of this candidate form
	*/
	@Override
	public java.lang.String getHSCQualification() {
		return _candidateForm.getHSCQualification();
	}

	/**
	* Returns the hsc university institute of this candidate form.
	*
	* @return the hsc university institute of this candidate form
	*/
	@Override
	public java.lang.String getHSCUniversityInstitute() {
		return _candidateForm.getHSCUniversityInstitute();
	}

	/**
	* Returns the hsc year of passing of this candidate form.
	*
	* @return the hsc year of passing of this candidate form
	*/
	@Override
	public java.lang.String getHSCYearOfPassing() {
		return _candidateForm.getHSCYearOfPassing();
	}

	/**
	* Returns the handicap detail of this candidate form.
	*
	* @return the handicap detail of this candidate form
	*/
	@Override
	public java.lang.String getHandicapDetail() {
		return _candidateForm.getHandicapDetail();
	}

	/**
	* Returns the identification mark of this candidate form.
	*
	* @return the identification mark of this candidate form
	*/
	@Override
	public java.lang.String getIdentificationMark() {
		return _candidateForm.getIdentificationMark();
	}

	/**
	* Returns the languages known of this candidate form.
	*
	* @return the languages known of this candidate form
	*/
	@Override
	public java.lang.String getLanguagesKnown() {
		return _candidateForm.getLanguagesKnown();
	}

	/**
	* Returns the location of this candidate form.
	*
	* @return the location of this candidate form
	*/
	@Override
	public java.lang.String getLocation() {
		return _candidateForm.getLocation();
	}

	/**
	* Returns the medicalfitdocaddr of this candidate form.
	*
	* @return the medicalfitdocaddr of this candidate form
	*/
	@Override
	public java.lang.String getMEDICALFITDOCADDR() {
		return _candidateForm.getMEDICALFITDOCADDR();
	}

	/**
	* Returns the medicalfitdocname of this candidate form.
	*
	* @return the medicalfitdocname of this candidate form
	*/
	@Override
	public java.lang.String getMEDICALFITDOCNAME() {
		return _candidateForm.getMEDICALFITDOCNAME();
	}

	/**
	* Returns the medicalfitdocregnno of this candidate form.
	*
	* @return the medicalfitdocregnno of this candidate form
	*/
	@Override
	public java.lang.String getMEDICALFITDOCREGNNO() {
		return _candidateForm.getMEDICALFITDOCREGNNO();
	}

	/**
	* Returns the medicalfitdoctill of this candidate form.
	*
	* @return the medicalfitdoctill of this candidate form
	*/
	@Override
	public java.lang.String getMEDICALFITDOCTILL() {
		return _candidateForm.getMEDICALFITDOCTILL();
	}

	/**
	* Returns the main qualification of this candidate form.
	*
	* @return the main qualification of this candidate form
	*/
	@Override
	public java.lang.String getMainQualification() {
		return _candidateForm.getMainQualification();
	}

	/**
	* Returns the marital status of this candidate form.
	*
	* @return the marital status of this candidate form
	*/
	@Override
	public java.lang.String getMaritalStatus() {
		return _candidateForm.getMaritalStatus();
	}

	/**
	* Returns the mobile of this candidate form.
	*
	* @return the mobile of this candidate form
	*/
	@Override
	public java.lang.String getMobile() {
		return _candidateForm.getMobile();
	}

	/**
	* Returns the mother tongue of this candidate form.
	*
	* @return the mother tongue of this candidate form
	*/
	@Override
	public java.lang.String getMotherTongue() {
		return _candidateForm.getMotherTongue();
	}

	/**
	* Returns the native location of this candidate form.
	*
	* @return the native location of this candidate form
	*/
	@Override
	public java.lang.String getNativeLocation() {
		return _candidateForm.getNativeLocation();
	}

	/**
	* Returns the notice period of this candidate form.
	*
	* @return the notice period of this candidate form
	*/
	@Override
	public java.lang.String getNoticePeriod() {
		return _candidateForm.getNoticePeriod();
	}

	/**
	* Returns the other1 grade of this candidate form.
	*
	* @return the other1 grade of this candidate form
	*/
	@Override
	public java.lang.String getOther1Grade() {
		return _candidateForm.getOther1Grade();
	}

	/**
	* Returns the other1 qualification of this candidate form.
	*
	* @return the other1 qualification of this candidate form
	*/
	@Override
	public java.lang.String getOther1Qualification() {
		return _candidateForm.getOther1Qualification();
	}

	/**
	* Returns the other1 university institute of this candidate form.
	*
	* @return the other1 university institute of this candidate form
	*/
	@Override
	public java.lang.String getOther1UniversityInstitute() {
		return _candidateForm.getOther1UniversityInstitute();
	}

	/**
	* Returns the other1 year of passing of this candidate form.
	*
	* @return the other1 year of passing of this candidate form
	*/
	@Override
	public java.lang.String getOther1YearOfPassing() {
		return _candidateForm.getOther1YearOfPassing();
	}

	/**
	* Returns the other2 grade of this candidate form.
	*
	* @return the other2 grade of this candidate form
	*/
	@Override
	public java.lang.String getOther2Grade() {
		return _candidateForm.getOther2Grade();
	}

	/**
	* Returns the other2 qualification of this candidate form.
	*
	* @return the other2 qualification of this candidate form
	*/
	@Override
	public java.lang.String getOther2Qualification() {
		return _candidateForm.getOther2Qualification();
	}

	/**
	* Returns the other2 university institute of this candidate form.
	*
	* @return the other2 university institute of this candidate form
	*/
	@Override
	public java.lang.String getOther2UniversityInstitute() {
		return _candidateForm.getOther2UniversityInstitute();
	}

	/**
	* Returns the other2 year of passing of this candidate form.
	*
	* @return the other2 year of passing of this candidate form
	*/
	@Override
	public java.lang.String getOther2YearOfPassing() {
		return _candidateForm.getOther2YearOfPassing();
	}

	/**
	* Returns the other3 grade of this candidate form.
	*
	* @return the other3 grade of this candidate form
	*/
	@Override
	public java.lang.String getOther3Grade() {
		return _candidateForm.getOther3Grade();
	}

	/**
	* Returns the other3 qualification of this candidate form.
	*
	* @return the other3 qualification of this candidate form
	*/
	@Override
	public java.lang.String getOther3Qualification() {
		return _candidateForm.getOther3Qualification();
	}

	/**
	* Returns the other3 university institute of this candidate form.
	*
	* @return the other3 university institute of this candidate form
	*/
	@Override
	public java.lang.String getOther3UniversityInstitute() {
		return _candidateForm.getOther3UniversityInstitute();
	}

	/**
	* Returns the other3 year of passing of this candidate form.
	*
	* @return the other3 year of passing of this candidate form
	*/
	@Override
	public java.lang.String getOther3YearOfPassing() {
		return _candidateForm.getOther3YearOfPassing();
	}

	/**
	* Returns the pg grade of this candidate form.
	*
	* @return the pg grade of this candidate form
	*/
	@Override
	public java.lang.String getPGGrade() {
		return _candidateForm.getPGGrade();
	}

	/**
	* Returns the pg qualification of this candidate form.
	*
	* @return the pg qualification of this candidate form
	*/
	@Override
	public java.lang.String getPGQualification() {
		return _candidateForm.getPGQualification();
	}

	/**
	* Returns the pg university institute of this candidate form.
	*
	* @return the pg university institute of this candidate form
	*/
	@Override
	public java.lang.String getPGUniversityInstitute() {
		return _candidateForm.getPGUniversityInstitute();
	}

	/**
	* Returns the pg year of passing of this candidate form.
	*
	* @return the pg year of passing of this candidate form
	*/
	@Override
	public java.lang.String getPGYearOfPassing() {
		return _candidateForm.getPGYearOfPassing();
	}

	/**
	* Returns the pan card no of this candidate form.
	*
	* @return the pan card no of this candidate form
	*/
	@Override
	public java.lang.String getPanCardNo() {
		return _candidateForm.getPanCardNo();
	}

	/**
	* Returns the password of this candidate form.
	*
	* @return the password of this candidate form
	*/
	@Override
	public java.lang.String getPassword() {
		return _candidateForm.getPassword();
	}

	/**
	* Returns the person alternate no given of this candidate form.
	*
	* @return the person alternate no given of this candidate form
	*/
	@Override
	public java.lang.String getPersonAlternateNoGiven() {
		return _candidateForm.getPersonAlternateNoGiven();
	}

	/**
	* Returns the ph d grade of this candidate form.
	*
	* @return the ph d grade of this candidate form
	*/
	@Override
	public java.lang.String getPhDGrade() {
		return _candidateForm.getPhDGrade();
	}

	/**
	* Returns the ph d qualification of this candidate form.
	*
	* @return the ph d qualification of this candidate form
	*/
	@Override
	public java.lang.String getPhDQualification() {
		return _candidateForm.getPhDQualification();
	}

	/**
	* Returns the ph d university institute of this candidate form.
	*
	* @return the ph d university institute of this candidate form
	*/
	@Override
	public java.lang.String getPhDUniversityInstitute() {
		return _candidateForm.getPhDUniversityInstitute();
	}

	/**
	* Returns the ph d year of passing of this candidate form.
	*
	* @return the ph d year of passing of this candidate form
	*/
	@Override
	public java.lang.String getPhDYearOfPassing() {
		return _candidateForm.getPhDYearOfPassing();
	}

	/**
	* Returns the pin of this candidate form.
	*
	* @return the pin of this candidate form
	*/
	@Override
	public java.lang.String getPin() {
		return _candidateForm.getPin();
	}

	/**
	* Returns the rel company of this candidate form.
	*
	* @return the rel company of this candidate form
	*/
	@Override
	public java.lang.String getRelCompany() {
		return _candidateForm.getRelCompany();
	}

	/**
	* Returns the rel from date of this candidate form.
	*
	* @return the rel from date of this candidate form
	*/
	@Override
	public java.lang.String getRelFromDate() {
		return _candidateForm.getRelFromDate();
	}

	/**
	* Returns the rel leaving reason of this candidate form.
	*
	* @return the rel leaving reason of this candidate form
	*/
	@Override
	public java.lang.String getRelLeavingReason() {
		return _candidateForm.getRelLeavingReason();
	}

	/**
	* Returns the rel location of this candidate form.
	*
	* @return the rel location of this candidate form
	*/
	@Override
	public java.lang.String getRelLocation() {
		return _candidateForm.getRelLocation();
	}

	/**
	* Returns the rel role of this candidate form.
	*
	* @return the rel role of this candidate form
	*/
	@Override
	public java.lang.String getRelRole() {
		return _candidateForm.getRelRole();
	}

	/**
	* Returns the rel to date of this candidate form.
	*
	* @return the rel to date of this candidate form
	*/
	@Override
	public java.lang.String getRelToDate() {
		return _candidateForm.getRelToDate();
	}

	/**
	* Returns the religion of this candidate form.
	*
	* @return the religion of this candidate form
	*/
	@Override
	public java.lang.String getReligion() {
		return _candidateForm.getReligion();
	}

	/**
	* Returns the role of this candidate form.
	*
	* @return the role of this candidate form
	*/
	@Override
	public java.lang.String getRole() {
		return _candidateForm.getRole();
	}

	/**
	* Returns the securityclearfrom of this candidate form.
	*
	* @return the securityclearfrom of this candidate form
	*/
	@Override
	public java.lang.String getSECURITYCLEARFROM() {
		return _candidateForm.getSECURITYCLEARFROM();
	}

	/**
	* Returns the securitycleartill of this candidate form.
	*
	* @return the securitycleartill of this candidate form
	*/
	@Override
	public java.lang.String getSECURITYCLEARTILL() {
		return _candidateForm.getSECURITYCLEARTILL();
	}

	/**
	* Returns the ssc grade of this candidate form.
	*
	* @return the ssc grade of this candidate form
	*/
	@Override
	public java.lang.String getSSCGrade() {
		return _candidateForm.getSSCGrade();
	}

	/**
	* Returns the ssc qualification of this candidate form.
	*
	* @return the ssc qualification of this candidate form
	*/
	@Override
	public java.lang.String getSSCQualification() {
		return _candidateForm.getSSCQualification();
	}

	/**
	* Returns the ssc university institute of this candidate form.
	*
	* @return the ssc university institute of this candidate form
	*/
	@Override
	public java.lang.String getSSCUniversityInstitute() {
		return _candidateForm.getSSCUniversityInstitute();
	}

	/**
	* Returns the ssc year of passing of this candidate form.
	*
	* @return the ssc year of passing of this candidate form
	*/
	@Override
	public java.lang.String getSSCYearOfPassing() {
		return _candidateForm.getSSCYearOfPassing();
	}

	/**
	* Returns the secound c designation of this candidate form.
	*
	* @return the secound c designation of this candidate form
	*/
	@Override
	public java.lang.String getSecoundCDesignation() {
		return _candidateForm.getSecoundCDesignation();
	}

	/**
	* Returns the secound c location of this candidate form.
	*
	* @return the secound c location of this candidate form
	*/
	@Override
	public java.lang.String getSecoundCLocation() {
		return _candidateForm.getSecoundCLocation();
	}

	/**
	* Returns the secound company name of this candidate form.
	*
	* @return the secound company name of this candidate form
	*/
	@Override
	public java.lang.String getSecoundCompanyName() {
		return _candidateForm.getSecoundCompanyName();
	}

	/**
	* Returns the secound fixed ctc of this candidate form.
	*
	* @return the secound fixed ctc of this candidate form
	*/
	@Override
	public java.lang.String getSecoundFixedCTC() {
		return _candidateForm.getSecoundFixedCTC();
	}

	/**
	* Returns the secound from date of this candidate form.
	*
	* @return the secound from date of this candidate form
	*/
	@Override
	public java.lang.String getSecoundFromDate() {
		return _candidateForm.getSecoundFromDate();
	}

	/**
	* Returns the secound remark if any of this candidate form.
	*
	* @return the secound remark if any of this candidate form
	*/
	@Override
	public java.lang.String getSecoundRemarkIfAny() {
		return _candidateForm.getSecoundRemarkIfAny();
	}

	/**
	* Returns the secound to date of this candidate form.
	*
	* @return the secound to date of this candidate form
	*/
	@Override
	public java.lang.String getSecoundToDate() {
		return _candidateForm.getSecoundToDate();
	}

	/**
	* Returns the secound total ctc of this candidate form.
	*
	* @return the secound total ctc of this candidate form
	*/
	@Override
	public java.lang.String getSecoundTotalCTC() {
		return _candidateForm.getSecoundTotalCTC();
	}

	/**
	* Returns the secound variable ctc of this candidate form.
	*
	* @return the secound variable ctc of this candidate form
	*/
	@Override
	public java.lang.String getSecoundVariableCTC() {
		return _candidateForm.getSecoundVariableCTC();
	}

	/**
	* Returns the skill_ proficiency of this candidate form.
	*
	* @return the skill_ proficiency of this candidate form
	*/
	@Override
	public java.lang.String getSkill_Proficiency() {
		return _candidateForm.getSkill_Proficiency();
	}

	/**
	* Returns the specialization of this candidate form.
	*
	* @return the specialization of this candidate form
	*/
	@Override
	public java.lang.String getSpecialization() {
		return _candidateForm.getSpecialization();
	}

	/**
	* Returns the state of this candidate form.
	*
	* @return the state of this candidate form
	*/
	@Override
	public java.lang.String getState() {
		return _candidateForm.getState();
	}

	/**
	* Returns the sub caste of this candidate form.
	*
	* @return the sub caste of this candidate form
	*/
	@Override
	public java.lang.String getSubCaste() {
		return _candidateForm.getSubCaste();
	}

	/**
	* Returns the surname of this candidate form.
	*
	* @return the surname of this candidate form
	*/
	@Override
	public java.lang.String getSurname() {
		return _candidateForm.getSurname();
	}

	/**
	* Returns the third c designation of this candidate form.
	*
	* @return the third c designation of this candidate form
	*/
	@Override
	public java.lang.String getThirdCDesignation() {
		return _candidateForm.getThirdCDesignation();
	}

	/**
	* Returns the third c location of this candidate form.
	*
	* @return the third c location of this candidate form
	*/
	@Override
	public java.lang.String getThirdCLocation() {
		return _candidateForm.getThirdCLocation();
	}

	/**
	* Returns the third company name of this candidate form.
	*
	* @return the third company name of this candidate form
	*/
	@Override
	public java.lang.String getThirdCompanyName() {
		return _candidateForm.getThirdCompanyName();
	}

	/**
	* Returns the third fixed ctc of this candidate form.
	*
	* @return the third fixed ctc of this candidate form
	*/
	@Override
	public java.lang.String getThirdFixedCTC() {
		return _candidateForm.getThirdFixedCTC();
	}

	/**
	* Returns the third from date of this candidate form.
	*
	* @return the third from date of this candidate form
	*/
	@Override
	public java.lang.String getThirdFromDate() {
		return _candidateForm.getThirdFromDate();
	}

	/**
	* Returns the third remark if any of this candidate form.
	*
	* @return the third remark if any of this candidate form
	*/
	@Override
	public java.lang.String getThirdRemarkIfAny() {
		return _candidateForm.getThirdRemarkIfAny();
	}

	/**
	* Returns the third to date of this candidate form.
	*
	* @return the third to date of this candidate form
	*/
	@Override
	public java.lang.String getThirdToDate() {
		return _candidateForm.getThirdToDate();
	}

	/**
	* Returns the third total ctc of this candidate form.
	*
	* @return the third total ctc of this candidate form
	*/
	@Override
	public java.lang.String getThirdTotalCTC() {
		return _candidateForm.getThirdTotalCTC();
	}

	/**
	* Returns the third variable ctc of this candidate form.
	*
	* @return the third variable ctc of this candidate form
	*/
	@Override
	public java.lang.String getThirdVariableCTC() {
		return _candidateForm.getThirdVariableCTC();
	}

	/**
	* Returns the total yr experience of this candidate form.
	*
	* @return the total yr experience of this candidate form
	*/
	@Override
	public java.lang.String getTotalYrExperience() {
		return _candidateForm.getTotalYrExperience();
	}

	/**
	* Returns the trade of this candidate form.
	*
	* @return the trade of this candidate form
	*/
	@Override
	public java.lang.String getTrade() {
		return _candidateForm.getTrade();
	}

	/**
	* Returns the uploadfile of this candidate form.
	*
	* @return the uploadfile of this candidate form
	*/
	@Override
	public java.lang.String getUPLOADFILE() {
		return _candidateForm.getUPLOADFILE();
	}

	/**
	* Returns the working since date of this candidate form.
	*
	* @return the working since date of this candidate form
	*/
	@Override
	public java.lang.String getWorkingSinceDate() {
		return _candidateForm.getWorkingSinceDate();
	}

	@Override
	public java.lang.String toString() {
		return _candidateForm.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _candidateForm.toXmlString();
	}

	/**
	* Returns the ca ID of this candidate form.
	*
	* @return the ca ID of this candidate form
	*/
	@Override
	public long getCaId() {
		return _candidateForm.getCaId();
	}

	/**
	* Returns the primary key of this candidate form.
	*
	* @return the primary key of this candidate form
	*/
	@Override
	public long getPrimaryKey() {
		return _candidateForm.getPrimaryKey();
	}

	@Override
	public void persist() {
		_candidateForm.persist();
	}

	/**
	* Sets the aadhar card no of this candidate form.
	*
	* @param aadharCardNo the aadhar card no of this candidate form
	*/
	@Override
	public void setAadharCardNo(java.lang.String aadharCardNo) {
		_candidateForm.setAadharCardNo(aadharCardNo);
	}

	/**
	* Sets the able to days of this candidate form.
	*
	* @param ableToDays the able to days of this candidate form
	*/
	@Override
	public void setAbleToDays(java.lang.String ableToDays) {
		_candidateForm.setAbleToDays(ableToDays);
	}

	/**
	* Sets the able to join of this candidate form.
	*
	* @param ableToJoin the able to join of this candidate form
	*/
	@Override
	public void setAbleToJoin(java.lang.String ableToJoin) {
		_candidateForm.setAbleToJoin(ableToJoin);
	}

	/**
	* Sets the able to month of this candidate form.
	*
	* @param ableToMonth the able to month of this candidate form
	*/
	@Override
	public void setAbleToMonth(java.lang.String ableToMonth) {
		_candidateForm.setAbleToMonth(ableToMonth);
	}

	/**
	* Sets the address of this candidate form.
	*
	* @param address the address of this candidate form
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_candidateForm.setAddress(address);
	}

	/**
	* Sets the alternate email ID of this candidate form.
	*
	* @param alternateEmailID the alternate email ID of this candidate form
	*/
	@Override
	public void setAlternateEmailID(java.lang.String alternateEmailID) {
		_candidateForm.setAlternateEmailID(alternateEmailID);
	}

	/**
	* Sets the alternate mobile of this candidate form.
	*
	* @param alternateMobile the alternate mobile of this candidate form
	*/
	@Override
	public void setAlternateMobile(java.lang.String alternateMobile) {
		_candidateForm.setAlternateMobile(alternateMobile);
	}

	/**
	* Sets the bank account no of this candidate form.
	*
	* @param bankAccountNo the bank account no of this candidate form
	*/
	@Override
	public void setBankAccountNo(java.lang.String bankAccountNo) {
		_candidateForm.setBankAccountNo(bankAccountNo);
	}

	/**
	* Sets the ctc fixed of this candidate form.
	*
	* @param CTCFixed the ctc fixed of this candidate form
	*/
	@Override
	public void setCTCFixed(java.lang.String CTCFixed) {
		_candidateForm.setCTCFixed(CTCFixed);
	}

	/**
	* Sets the ctc total of this candidate form.
	*
	* @param CTCTotal the ctc total of this candidate form
	*/
	@Override
	public void setCTCTotal(java.lang.String CTCTotal) {
		_candidateForm.setCTCTotal(CTCTotal);
	}

	/**
	* Sets the ctc variable of this candidate form.
	*
	* @param CTCVariable the ctc variable of this candidate form
	*/
	@Override
	public void setCTCVariable(java.lang.String CTCVariable) {
		_candidateForm.setCTCVariable(CTCVariable);
	}

	/**
	* Sets the ca ID of this candidate form.
	*
	* @param CaId the ca ID of this candidate form
	*/
	@Override
	public void setCaId(long CaId) {
		_candidateForm.setCaId(CaId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_candidateForm.setCachedModel(cachedModel);
	}

	/**
	* Sets the caste of this candidate form.
	*
	* @param caste the caste of this candidate form
	*/
	@Override
	public void setCaste(java.lang.String caste) {
		_candidateForm.setCaste(caste);
	}

	/**
	* Sets the city of this candidate form.
	*
	* @param city the city of this candidate form
	*/
	@Override
	public void setCity(java.lang.String city) {
		_candidateForm.setCity(city);
	}

	/**
	* Sets the current company address of this candidate form.
	*
	* @param currentCompanyAddress the current company address of this candidate form
	*/
	@Override
	public void setCurrentCompanyAddress(java.lang.String currentCompanyAddress) {
		_candidateForm.setCurrentCompanyAddress(currentCompanyAddress);
	}

	/**
	* Sets the current company name of this candidate form.
	*
	* @param currentCompanyName the current company name of this candidate form
	*/
	@Override
	public void setCurrentCompanyName(java.lang.String currentCompanyName) {
		_candidateForm.setCurrentCompanyName(currentCompanyName);
	}

	/**
	* Sets the date of birth of this candidate form.
	*
	* @param dateOfBirth the date of birth of this candidate form
	*/
	@Override
	public void setDateOfBirth(java.lang.String dateOfBirth) {
		_candidateForm.setDateOfBirth(dateOfBirth);
	}

	/**
	* Sets the designation of this candidate form.
	*
	* @param designation the designation of this candidate form
	*/
	@Override
	public void setDesignation(java.lang.String designation) {
		_candidateForm.setDesignation(designation);
	}

	/**
	* Sets the domicile of this candidate form.
	*
	* @param domicile the domicile of this candidate form
	*/
	@Override
	public void setDomicile(java.lang.String domicile) {
		_candidateForm.setDomicile(domicile);
	}

	/**
	* Sets the email address of this candidate form.
	*
	* @param emailAddress the email address of this candidate form
	*/
	@Override
	public void setEmailAddress(java.lang.String emailAddress) {
		_candidateForm.setEmailAddress(emailAddress);
	}

	/**
	* Sets the employment ex regn no of this candidate form.
	*
	* @param employmentExRegnNo the employment ex regn no of this candidate form
	*/
	@Override
	public void setEmploymentExRegnNo(java.lang.String employmentExRegnNo) {
		_candidateForm.setEmploymentExRegnNo(employmentExRegnNo);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_candidateForm.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_candidateForm.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_candidateForm.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the father_ spouse name of this candidate form.
	*
	* @param father_SpouseName the father_ spouse name of this candidate form
	*/
	@Override
	public void setFather_SpouseName(java.lang.String father_SpouseName) {
		_candidateForm.setFather_SpouseName(father_SpouseName);
	}

	/**
	* Sets the fifth c designation of this candidate form.
	*
	* @param fifthCDesignation the fifth c designation of this candidate form
	*/
	@Override
	public void setFifthCDesignation(java.lang.String fifthCDesignation) {
		_candidateForm.setFifthCDesignation(fifthCDesignation);
	}

	/**
	* Sets the fifth c location of this candidate form.
	*
	* @param fifthCLocation the fifth c location of this candidate form
	*/
	@Override
	public void setFifthCLocation(java.lang.String fifthCLocation) {
		_candidateForm.setFifthCLocation(fifthCLocation);
	}

	/**
	* Sets the fifth company name of this candidate form.
	*
	* @param fifthCompanyName the fifth company name of this candidate form
	*/
	@Override
	public void setFifthCompanyName(java.lang.String fifthCompanyName) {
		_candidateForm.setFifthCompanyName(fifthCompanyName);
	}

	/**
	* Sets the fifth fixed ctc of this candidate form.
	*
	* @param fifthFixedCTC the fifth fixed ctc of this candidate form
	*/
	@Override
	public void setFifthFixedCTC(java.lang.String fifthFixedCTC) {
		_candidateForm.setFifthFixedCTC(fifthFixedCTC);
	}

	/**
	* Sets the fifth from date of this candidate form.
	*
	* @param fifthFromDate the fifth from date of this candidate form
	*/
	@Override
	public void setFifthFromDate(java.lang.String fifthFromDate) {
		_candidateForm.setFifthFromDate(fifthFromDate);
	}

	/**
	* Sets the fifth remark if any of this candidate form.
	*
	* @param fifthRemarkIfAny the fifth remark if any of this candidate form
	*/
	@Override
	public void setFifthRemarkIfAny(java.lang.String fifthRemarkIfAny) {
		_candidateForm.setFifthRemarkIfAny(fifthRemarkIfAny);
	}

	/**
	* Sets the fifth to date of this candidate form.
	*
	* @param fifthToDate the fifth to date of this candidate form
	*/
	@Override
	public void setFifthToDate(java.lang.String fifthToDate) {
		_candidateForm.setFifthToDate(fifthToDate);
	}

	/**
	* Sets the fifth total ctc of this candidate form.
	*
	* @param fifthTotalCTC the fifth total ctc of this candidate form
	*/
	@Override
	public void setFifthTotalCTC(java.lang.String fifthTotalCTC) {
		_candidateForm.setFifthTotalCTC(fifthTotalCTC);
	}

	/**
	* Sets the fifth variable ctc of this candidate form.
	*
	* @param fifthVariableCTC the fifth variable ctc of this candidate form
	*/
	@Override
	public void setFifthVariableCTC(java.lang.String fifthVariableCTC) {
		_candidateForm.setFifthVariableCTC(fifthVariableCTC);
	}

	/**
	* Sets the first c designation of this candidate form.
	*
	* @param firstCDesignation the first c designation of this candidate form
	*/
	@Override
	public void setFirstCDesignation(java.lang.String firstCDesignation) {
		_candidateForm.setFirstCDesignation(firstCDesignation);
	}

	/**
	* Sets the first c location of this candidate form.
	*
	* @param firstCLocation the first c location of this candidate form
	*/
	@Override
	public void setFirstCLocation(java.lang.String firstCLocation) {
		_candidateForm.setFirstCLocation(firstCLocation);
	}

	/**
	* Sets the first company name of this candidate form.
	*
	* @param firstCompanyName the first company name of this candidate form
	*/
	@Override
	public void setFirstCompanyName(java.lang.String firstCompanyName) {
		_candidateForm.setFirstCompanyName(firstCompanyName);
	}

	/**
	* Sets the first fixed ctc of this candidate form.
	*
	* @param firstFixedCTC the first fixed ctc of this candidate form
	*/
	@Override
	public void setFirstFixedCTC(java.lang.String firstFixedCTC) {
		_candidateForm.setFirstFixedCTC(firstFixedCTC);
	}

	/**
	* Sets the first from date of this candidate form.
	*
	* @param firstFromDate the first from date of this candidate form
	*/
	@Override
	public void setFirstFromDate(java.lang.String firstFromDate) {
		_candidateForm.setFirstFromDate(firstFromDate);
	}

	/**
	* Sets the first name of this candidate form.
	*
	* @param firstName the first name of this candidate form
	*/
	@Override
	public void setFirstName(java.lang.String firstName) {
		_candidateForm.setFirstName(firstName);
	}

	/**
	* Sets the first remark if any of this candidate form.
	*
	* @param firstRemarkIfAny the first remark if any of this candidate form
	*/
	@Override
	public void setFirstRemarkIfAny(java.lang.String firstRemarkIfAny) {
		_candidateForm.setFirstRemarkIfAny(firstRemarkIfAny);
	}

	/**
	* Sets the first to date of this candidate form.
	*
	* @param firstToDate the first to date of this candidate form
	*/
	@Override
	public void setFirstToDate(java.lang.String firstToDate) {
		_candidateForm.setFirstToDate(firstToDate);
	}

	/**
	* Sets the first total ctc of this candidate form.
	*
	* @param firstTotalCTC the first total ctc of this candidate form
	*/
	@Override
	public void setFirstTotalCTC(java.lang.String firstTotalCTC) {
		_candidateForm.setFirstTotalCTC(firstTotalCTC);
	}

	/**
	* Sets the first variable ctc of this candidate form.
	*
	* @param firstVariableCTC the first variable ctc of this candidate form
	*/
	@Override
	public void setFirstVariableCTC(java.lang.String firstVariableCTC) {
		_candidateForm.setFirstVariableCTC(firstVariableCTC);
	}

	/**
	* Sets the forth c designation of this candidate form.
	*
	* @param forthCDesignation the forth c designation of this candidate form
	*/
	@Override
	public void setForthCDesignation(java.lang.String forthCDesignation) {
		_candidateForm.setForthCDesignation(forthCDesignation);
	}

	/**
	* Sets the forth c location of this candidate form.
	*
	* @param forthCLocation the forth c location of this candidate form
	*/
	@Override
	public void setForthCLocation(java.lang.String forthCLocation) {
		_candidateForm.setForthCLocation(forthCLocation);
	}

	/**
	* Sets the forth company name of this candidate form.
	*
	* @param forthCompanyName the forth company name of this candidate form
	*/
	@Override
	public void setForthCompanyName(java.lang.String forthCompanyName) {
		_candidateForm.setForthCompanyName(forthCompanyName);
	}

	/**
	* Sets the forth fixed ctc of this candidate form.
	*
	* @param forthFixedCTC the forth fixed ctc of this candidate form
	*/
	@Override
	public void setForthFixedCTC(java.lang.String forthFixedCTC) {
		_candidateForm.setForthFixedCTC(forthFixedCTC);
	}

	/**
	* Sets the forth from date of this candidate form.
	*
	* @param forthFromDate the forth from date of this candidate form
	*/
	@Override
	public void setForthFromDate(java.lang.String forthFromDate) {
		_candidateForm.setForthFromDate(forthFromDate);
	}

	/**
	* Sets the forth remark if any of this candidate form.
	*
	* @param forthRemarkIfAny the forth remark if any of this candidate form
	*/
	@Override
	public void setForthRemarkIfAny(java.lang.String forthRemarkIfAny) {
		_candidateForm.setForthRemarkIfAny(forthRemarkIfAny);
	}

	/**
	* Sets the forth to date of this candidate form.
	*
	* @param forthToDate the forth to date of this candidate form
	*/
	@Override
	public void setForthToDate(java.lang.String forthToDate) {
		_candidateForm.setForthToDate(forthToDate);
	}

	/**
	* Sets the forth total ctc of this candidate form.
	*
	* @param forthTotalCTC the forth total ctc of this candidate form
	*/
	@Override
	public void setForthTotalCTC(java.lang.String forthTotalCTC) {
		_candidateForm.setForthTotalCTC(forthTotalCTC);
	}

	/**
	* Sets the forth variable ctc of this candidate form.
	*
	* @param forthVariableCTC the forth variable ctc of this candidate form
	*/
	@Override
	public void setForthVariableCTC(java.lang.String forthVariableCTC) {
		_candidateForm.setForthVariableCTC(forthVariableCTC);
	}

	/**
	* Sets the grad grade of this candidate form.
	*
	* @param GradGrade the grad grade of this candidate form
	*/
	@Override
	public void setGradGrade(java.lang.String GradGrade) {
		_candidateForm.setGradGrade(GradGrade);
	}

	/**
	* Sets the grad qualification of this candidate form.
	*
	* @param GradQualification the grad qualification of this candidate form
	*/
	@Override
	public void setGradQualification(java.lang.String GradQualification) {
		_candidateForm.setGradQualification(GradQualification);
	}

	/**
	* Sets the grad university institute of this candidate form.
	*
	* @param GradUniversityInstitute the grad university institute of this candidate form
	*/
	@Override
	public void setGradUniversityInstitute(
		java.lang.String GradUniversityInstitute) {
		_candidateForm.setGradUniversityInstitute(GradUniversityInstitute);
	}

	/**
	* Sets the grad year of passing of this candidate form.
	*
	* @param GradYearOfPassing the grad year of passing of this candidate form
	*/
	@Override
	public void setGradYearOfPassing(java.lang.String GradYearOfPassing) {
		_candidateForm.setGradYearOfPassing(GradYearOfPassing);
	}

	/**
	* Sets the hsc grade of this candidate form.
	*
	* @param HSCGrade the hsc grade of this candidate form
	*/
	@Override
	public void setHSCGrade(java.lang.String HSCGrade) {
		_candidateForm.setHSCGrade(HSCGrade);
	}

	/**
	* Sets the hsc qualification of this candidate form.
	*
	* @param HSCQualification the hsc qualification of this candidate form
	*/
	@Override
	public void setHSCQualification(java.lang.String HSCQualification) {
		_candidateForm.setHSCQualification(HSCQualification);
	}

	/**
	* Sets the hsc university institute of this candidate form.
	*
	* @param HSCUniversityInstitute the hsc university institute of this candidate form
	*/
	@Override
	public void setHSCUniversityInstitute(
		java.lang.String HSCUniversityInstitute) {
		_candidateForm.setHSCUniversityInstitute(HSCUniversityInstitute);
	}

	/**
	* Sets the hsc year of passing of this candidate form.
	*
	* @param HSCYearOfPassing the hsc year of passing of this candidate form
	*/
	@Override
	public void setHSCYearOfPassing(java.lang.String HSCYearOfPassing) {
		_candidateForm.setHSCYearOfPassing(HSCYearOfPassing);
	}

	/**
	* Sets the handicap detail of this candidate form.
	*
	* @param handicapDetail the handicap detail of this candidate form
	*/
	@Override
	public void setHandicapDetail(java.lang.String handicapDetail) {
		_candidateForm.setHandicapDetail(handicapDetail);
	}

	/**
	* Sets the identification mark of this candidate form.
	*
	* @param identificationMark the identification mark of this candidate form
	*/
	@Override
	public void setIdentificationMark(java.lang.String identificationMark) {
		_candidateForm.setIdentificationMark(identificationMark);
	}

	/**
	* Sets the languages known of this candidate form.
	*
	* @param languagesKnown the languages known of this candidate form
	*/
	@Override
	public void setLanguagesKnown(java.lang.String languagesKnown) {
		_candidateForm.setLanguagesKnown(languagesKnown);
	}

	/**
	* Sets the location of this candidate form.
	*
	* @param location the location of this candidate form
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_candidateForm.setLocation(location);
	}

	/**
	* Sets the medicalfitdocaddr of this candidate form.
	*
	* @param MEDICALFITDOCADDR the medicalfitdocaddr of this candidate form
	*/
	@Override
	public void setMEDICALFITDOCADDR(java.lang.String MEDICALFITDOCADDR) {
		_candidateForm.setMEDICALFITDOCADDR(MEDICALFITDOCADDR);
	}

	/**
	* Sets the medicalfitdocname of this candidate form.
	*
	* @param MEDICALFITDOCNAME the medicalfitdocname of this candidate form
	*/
	@Override
	public void setMEDICALFITDOCNAME(java.lang.String MEDICALFITDOCNAME) {
		_candidateForm.setMEDICALFITDOCNAME(MEDICALFITDOCNAME);
	}

	/**
	* Sets the medicalfitdocregnno of this candidate form.
	*
	* @param MEDICALFITDOCREGNNO the medicalfitdocregnno of this candidate form
	*/
	@Override
	public void setMEDICALFITDOCREGNNO(java.lang.String MEDICALFITDOCREGNNO) {
		_candidateForm.setMEDICALFITDOCREGNNO(MEDICALFITDOCREGNNO);
	}

	/**
	* Sets the medicalfitdoctill of this candidate form.
	*
	* @param MEDICALFITDOCTILL the medicalfitdoctill of this candidate form
	*/
	@Override
	public void setMEDICALFITDOCTILL(java.lang.String MEDICALFITDOCTILL) {
		_candidateForm.setMEDICALFITDOCTILL(MEDICALFITDOCTILL);
	}

	/**
	* Sets the main qualification of this candidate form.
	*
	* @param mainQualification the main qualification of this candidate form
	*/
	@Override
	public void setMainQualification(java.lang.String mainQualification) {
		_candidateForm.setMainQualification(mainQualification);
	}

	/**
	* Sets the marital status of this candidate form.
	*
	* @param maritalStatus the marital status of this candidate form
	*/
	@Override
	public void setMaritalStatus(java.lang.String maritalStatus) {
		_candidateForm.setMaritalStatus(maritalStatus);
	}

	/**
	* Sets the mobile of this candidate form.
	*
	* @param mobile the mobile of this candidate form
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_candidateForm.setMobile(mobile);
	}

	/**
	* Sets the mother tongue of this candidate form.
	*
	* @param motherTongue the mother tongue of this candidate form
	*/
	@Override
	public void setMotherTongue(java.lang.String motherTongue) {
		_candidateForm.setMotherTongue(motherTongue);
	}

	/**
	* Sets the native location of this candidate form.
	*
	* @param nativeLocation the native location of this candidate form
	*/
	@Override
	public void setNativeLocation(java.lang.String nativeLocation) {
		_candidateForm.setNativeLocation(nativeLocation);
	}

	@Override
	public void setNew(boolean n) {
		_candidateForm.setNew(n);
	}

	/**
	* Sets the notice period of this candidate form.
	*
	* @param noticePeriod the notice period of this candidate form
	*/
	@Override
	public void setNoticePeriod(java.lang.String noticePeriod) {
		_candidateForm.setNoticePeriod(noticePeriod);
	}

	/**
	* Sets the other1 grade of this candidate form.
	*
	* @param other1Grade the other1 grade of this candidate form
	*/
	@Override
	public void setOther1Grade(java.lang.String other1Grade) {
		_candidateForm.setOther1Grade(other1Grade);
	}

	/**
	* Sets the other1 qualification of this candidate form.
	*
	* @param other1Qualification the other1 qualification of this candidate form
	*/
	@Override
	public void setOther1Qualification(java.lang.String other1Qualification) {
		_candidateForm.setOther1Qualification(other1Qualification);
	}

	/**
	* Sets the other1 university institute of this candidate form.
	*
	* @param other1UniversityInstitute the other1 university institute of this candidate form
	*/
	@Override
	public void setOther1UniversityInstitute(
		java.lang.String other1UniversityInstitute) {
		_candidateForm.setOther1UniversityInstitute(other1UniversityInstitute);
	}

	/**
	* Sets the other1 year of passing of this candidate form.
	*
	* @param other1YearOfPassing the other1 year of passing of this candidate form
	*/
	@Override
	public void setOther1YearOfPassing(java.lang.String other1YearOfPassing) {
		_candidateForm.setOther1YearOfPassing(other1YearOfPassing);
	}

	/**
	* Sets the other2 grade of this candidate form.
	*
	* @param other2Grade the other2 grade of this candidate form
	*/
	@Override
	public void setOther2Grade(java.lang.String other2Grade) {
		_candidateForm.setOther2Grade(other2Grade);
	}

	/**
	* Sets the other2 qualification of this candidate form.
	*
	* @param other2Qualification the other2 qualification of this candidate form
	*/
	@Override
	public void setOther2Qualification(java.lang.String other2Qualification) {
		_candidateForm.setOther2Qualification(other2Qualification);
	}

	/**
	* Sets the other2 university institute of this candidate form.
	*
	* @param other2UniversityInstitute the other2 university institute of this candidate form
	*/
	@Override
	public void setOther2UniversityInstitute(
		java.lang.String other2UniversityInstitute) {
		_candidateForm.setOther2UniversityInstitute(other2UniversityInstitute);
	}

	/**
	* Sets the other2 year of passing of this candidate form.
	*
	* @param other2YearOfPassing the other2 year of passing of this candidate form
	*/
	@Override
	public void setOther2YearOfPassing(java.lang.String other2YearOfPassing) {
		_candidateForm.setOther2YearOfPassing(other2YearOfPassing);
	}

	/**
	* Sets the other3 grade of this candidate form.
	*
	* @param other3Grade the other3 grade of this candidate form
	*/
	@Override
	public void setOther3Grade(java.lang.String other3Grade) {
		_candidateForm.setOther3Grade(other3Grade);
	}

	/**
	* Sets the other3 qualification of this candidate form.
	*
	* @param other3Qualification the other3 qualification of this candidate form
	*/
	@Override
	public void setOther3Qualification(java.lang.String other3Qualification) {
		_candidateForm.setOther3Qualification(other3Qualification);
	}

	/**
	* Sets the other3 university institute of this candidate form.
	*
	* @param other3UniversityInstitute the other3 university institute of this candidate form
	*/
	@Override
	public void setOther3UniversityInstitute(
		java.lang.String other3UniversityInstitute) {
		_candidateForm.setOther3UniversityInstitute(other3UniversityInstitute);
	}

	/**
	* Sets the other3 year of passing of this candidate form.
	*
	* @param other3YearOfPassing the other3 year of passing of this candidate form
	*/
	@Override
	public void setOther3YearOfPassing(java.lang.String other3YearOfPassing) {
		_candidateForm.setOther3YearOfPassing(other3YearOfPassing);
	}

	/**
	* Sets the pg grade of this candidate form.
	*
	* @param PGGrade the pg grade of this candidate form
	*/
	@Override
	public void setPGGrade(java.lang.String PGGrade) {
		_candidateForm.setPGGrade(PGGrade);
	}

	/**
	* Sets the pg qualification of this candidate form.
	*
	* @param PGQualification the pg qualification of this candidate form
	*/
	@Override
	public void setPGQualification(java.lang.String PGQualification) {
		_candidateForm.setPGQualification(PGQualification);
	}

	/**
	* Sets the pg university institute of this candidate form.
	*
	* @param PGUniversityInstitute the pg university institute of this candidate form
	*/
	@Override
	public void setPGUniversityInstitute(java.lang.String PGUniversityInstitute) {
		_candidateForm.setPGUniversityInstitute(PGUniversityInstitute);
	}

	/**
	* Sets the pg year of passing of this candidate form.
	*
	* @param PGYearOfPassing the pg year of passing of this candidate form
	*/
	@Override
	public void setPGYearOfPassing(java.lang.String PGYearOfPassing) {
		_candidateForm.setPGYearOfPassing(PGYearOfPassing);
	}

	/**
	* Sets the pan card no of this candidate form.
	*
	* @param panCardNo the pan card no of this candidate form
	*/
	@Override
	public void setPanCardNo(java.lang.String panCardNo) {
		_candidateForm.setPanCardNo(panCardNo);
	}

	/**
	* Sets the password of this candidate form.
	*
	* @param password the password of this candidate form
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_candidateForm.setPassword(password);
	}

	/**
	* Sets the person alternate no given of this candidate form.
	*
	* @param personAlternateNoGiven the person alternate no given of this candidate form
	*/
	@Override
	public void setPersonAlternateNoGiven(
		java.lang.String personAlternateNoGiven) {
		_candidateForm.setPersonAlternateNoGiven(personAlternateNoGiven);
	}

	/**
	* Sets the ph d grade of this candidate form.
	*
	* @param PhDGrade the ph d grade of this candidate form
	*/
	@Override
	public void setPhDGrade(java.lang.String PhDGrade) {
		_candidateForm.setPhDGrade(PhDGrade);
	}

	/**
	* Sets the ph d qualification of this candidate form.
	*
	* @param PhDQualification the ph d qualification of this candidate form
	*/
	@Override
	public void setPhDQualification(java.lang.String PhDQualification) {
		_candidateForm.setPhDQualification(PhDQualification);
	}

	/**
	* Sets the ph d university institute of this candidate form.
	*
	* @param PhDUniversityInstitute the ph d university institute of this candidate form
	*/
	@Override
	public void setPhDUniversityInstitute(
		java.lang.String PhDUniversityInstitute) {
		_candidateForm.setPhDUniversityInstitute(PhDUniversityInstitute);
	}

	/**
	* Sets the ph d year of passing of this candidate form.
	*
	* @param PhDYearOfPassing the ph d year of passing of this candidate form
	*/
	@Override
	public void setPhDYearOfPassing(java.lang.String PhDYearOfPassing) {
		_candidateForm.setPhDYearOfPassing(PhDYearOfPassing);
	}

	/**
	* Sets the pin of this candidate form.
	*
	* @param pin the pin of this candidate form
	*/
	@Override
	public void setPin(java.lang.String pin) {
		_candidateForm.setPin(pin);
	}

	/**
	* Sets the primary key of this candidate form.
	*
	* @param primaryKey the primary key of this candidate form
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_candidateForm.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_candidateForm.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rel company of this candidate form.
	*
	* @param relCompany the rel company of this candidate form
	*/
	@Override
	public void setRelCompany(java.lang.String relCompany) {
		_candidateForm.setRelCompany(relCompany);
	}

	/**
	* Sets the rel from date of this candidate form.
	*
	* @param relFromDate the rel from date of this candidate form
	*/
	@Override
	public void setRelFromDate(java.lang.String relFromDate) {
		_candidateForm.setRelFromDate(relFromDate);
	}

	/**
	* Sets the rel leaving reason of this candidate form.
	*
	* @param relLeavingReason the rel leaving reason of this candidate form
	*/
	@Override
	public void setRelLeavingReason(java.lang.String relLeavingReason) {
		_candidateForm.setRelLeavingReason(relLeavingReason);
	}

	/**
	* Sets the rel location of this candidate form.
	*
	* @param relLocation the rel location of this candidate form
	*/
	@Override
	public void setRelLocation(java.lang.String relLocation) {
		_candidateForm.setRelLocation(relLocation);
	}

	/**
	* Sets the rel role of this candidate form.
	*
	* @param relRole the rel role of this candidate form
	*/
	@Override
	public void setRelRole(java.lang.String relRole) {
		_candidateForm.setRelRole(relRole);
	}

	/**
	* Sets the rel to date of this candidate form.
	*
	* @param relToDate the rel to date of this candidate form
	*/
	@Override
	public void setRelToDate(java.lang.String relToDate) {
		_candidateForm.setRelToDate(relToDate);
	}

	/**
	* Sets the religion of this candidate form.
	*
	* @param religion the religion of this candidate form
	*/
	@Override
	public void setReligion(java.lang.String religion) {
		_candidateForm.setReligion(religion);
	}

	/**
	* Sets the role of this candidate form.
	*
	* @param role the role of this candidate form
	*/
	@Override
	public void setRole(java.lang.String role) {
		_candidateForm.setRole(role);
	}

	/**
	* Sets the securityclearfrom of this candidate form.
	*
	* @param SECURITYCLEARFROM the securityclearfrom of this candidate form
	*/
	@Override
	public void setSECURITYCLEARFROM(java.lang.String SECURITYCLEARFROM) {
		_candidateForm.setSECURITYCLEARFROM(SECURITYCLEARFROM);
	}

	/**
	* Sets the securitycleartill of this candidate form.
	*
	* @param SECURITYCLEARTILL the securitycleartill of this candidate form
	*/
	@Override
	public void setSECURITYCLEARTILL(java.lang.String SECURITYCLEARTILL) {
		_candidateForm.setSECURITYCLEARTILL(SECURITYCLEARTILL);
	}

	/**
	* Sets the ssc grade of this candidate form.
	*
	* @param SSCGrade the ssc grade of this candidate form
	*/
	@Override
	public void setSSCGrade(java.lang.String SSCGrade) {
		_candidateForm.setSSCGrade(SSCGrade);
	}

	/**
	* Sets the ssc qualification of this candidate form.
	*
	* @param SSCQualification the ssc qualification of this candidate form
	*/
	@Override
	public void setSSCQualification(java.lang.String SSCQualification) {
		_candidateForm.setSSCQualification(SSCQualification);
	}

	/**
	* Sets the ssc university institute of this candidate form.
	*
	* @param SSCUniversityInstitute the ssc university institute of this candidate form
	*/
	@Override
	public void setSSCUniversityInstitute(
		java.lang.String SSCUniversityInstitute) {
		_candidateForm.setSSCUniversityInstitute(SSCUniversityInstitute);
	}

	/**
	* Sets the ssc year of passing of this candidate form.
	*
	* @param SSCYearOfPassing the ssc year of passing of this candidate form
	*/
	@Override
	public void setSSCYearOfPassing(java.lang.String SSCYearOfPassing) {
		_candidateForm.setSSCYearOfPassing(SSCYearOfPassing);
	}

	/**
	* Sets the secound c designation of this candidate form.
	*
	* @param secoundCDesignation the secound c designation of this candidate form
	*/
	@Override
	public void setSecoundCDesignation(java.lang.String secoundCDesignation) {
		_candidateForm.setSecoundCDesignation(secoundCDesignation);
	}

	/**
	* Sets the secound c location of this candidate form.
	*
	* @param secoundCLocation the secound c location of this candidate form
	*/
	@Override
	public void setSecoundCLocation(java.lang.String secoundCLocation) {
		_candidateForm.setSecoundCLocation(secoundCLocation);
	}

	/**
	* Sets the secound company name of this candidate form.
	*
	* @param secoundCompanyName the secound company name of this candidate form
	*/
	@Override
	public void setSecoundCompanyName(java.lang.String secoundCompanyName) {
		_candidateForm.setSecoundCompanyName(secoundCompanyName);
	}

	/**
	* Sets the secound fixed ctc of this candidate form.
	*
	* @param secoundFixedCTC the secound fixed ctc of this candidate form
	*/
	@Override
	public void setSecoundFixedCTC(java.lang.String secoundFixedCTC) {
		_candidateForm.setSecoundFixedCTC(secoundFixedCTC);
	}

	/**
	* Sets the secound from date of this candidate form.
	*
	* @param secoundFromDate the secound from date of this candidate form
	*/
	@Override
	public void setSecoundFromDate(java.lang.String secoundFromDate) {
		_candidateForm.setSecoundFromDate(secoundFromDate);
	}

	/**
	* Sets the secound remark if any of this candidate form.
	*
	* @param secoundRemarkIfAny the secound remark if any of this candidate form
	*/
	@Override
	public void setSecoundRemarkIfAny(java.lang.String secoundRemarkIfAny) {
		_candidateForm.setSecoundRemarkIfAny(secoundRemarkIfAny);
	}

	/**
	* Sets the secound to date of this candidate form.
	*
	* @param secoundToDate the secound to date of this candidate form
	*/
	@Override
	public void setSecoundToDate(java.lang.String secoundToDate) {
		_candidateForm.setSecoundToDate(secoundToDate);
	}

	/**
	* Sets the secound total ctc of this candidate form.
	*
	* @param secoundTotalCTC the secound total ctc of this candidate form
	*/
	@Override
	public void setSecoundTotalCTC(java.lang.String secoundTotalCTC) {
		_candidateForm.setSecoundTotalCTC(secoundTotalCTC);
	}

	/**
	* Sets the secound variable ctc of this candidate form.
	*
	* @param secoundVariableCTC the secound variable ctc of this candidate form
	*/
	@Override
	public void setSecoundVariableCTC(java.lang.String secoundVariableCTC) {
		_candidateForm.setSecoundVariableCTC(secoundVariableCTC);
	}

	/**
	* Sets the skill_ proficiency of this candidate form.
	*
	* @param skill_Proficiency the skill_ proficiency of this candidate form
	*/
	@Override
	public void setSkill_Proficiency(java.lang.String skill_Proficiency) {
		_candidateForm.setSkill_Proficiency(skill_Proficiency);
	}

	/**
	* Sets the specialization of this candidate form.
	*
	* @param specialization the specialization of this candidate form
	*/
	@Override
	public void setSpecialization(java.lang.String specialization) {
		_candidateForm.setSpecialization(specialization);
	}

	/**
	* Sets the state of this candidate form.
	*
	* @param state the state of this candidate form
	*/
	@Override
	public void setState(java.lang.String state) {
		_candidateForm.setState(state);
	}

	/**
	* Sets the sub caste of this candidate form.
	*
	* @param subCaste the sub caste of this candidate form
	*/
	@Override
	public void setSubCaste(java.lang.String subCaste) {
		_candidateForm.setSubCaste(subCaste);
	}

	/**
	* Sets the surname of this candidate form.
	*
	* @param surname the surname of this candidate form
	*/
	@Override
	public void setSurname(java.lang.String surname) {
		_candidateForm.setSurname(surname);
	}

	/**
	* Sets the third c designation of this candidate form.
	*
	* @param thirdCDesignation the third c designation of this candidate form
	*/
	@Override
	public void setThirdCDesignation(java.lang.String thirdCDesignation) {
		_candidateForm.setThirdCDesignation(thirdCDesignation);
	}

	/**
	* Sets the third c location of this candidate form.
	*
	* @param thirdCLocation the third c location of this candidate form
	*/
	@Override
	public void setThirdCLocation(java.lang.String thirdCLocation) {
		_candidateForm.setThirdCLocation(thirdCLocation);
	}

	/**
	* Sets the third company name of this candidate form.
	*
	* @param thirdCompanyName the third company name of this candidate form
	*/
	@Override
	public void setThirdCompanyName(java.lang.String thirdCompanyName) {
		_candidateForm.setThirdCompanyName(thirdCompanyName);
	}

	/**
	* Sets the third fixed ctc of this candidate form.
	*
	* @param thirdFixedCTC the third fixed ctc of this candidate form
	*/
	@Override
	public void setThirdFixedCTC(java.lang.String thirdFixedCTC) {
		_candidateForm.setThirdFixedCTC(thirdFixedCTC);
	}

	/**
	* Sets the third from date of this candidate form.
	*
	* @param thirdFromDate the third from date of this candidate form
	*/
	@Override
	public void setThirdFromDate(java.lang.String thirdFromDate) {
		_candidateForm.setThirdFromDate(thirdFromDate);
	}

	/**
	* Sets the third remark if any of this candidate form.
	*
	* @param thirdRemarkIfAny the third remark if any of this candidate form
	*/
	@Override
	public void setThirdRemarkIfAny(java.lang.String thirdRemarkIfAny) {
		_candidateForm.setThirdRemarkIfAny(thirdRemarkIfAny);
	}

	/**
	* Sets the third to date of this candidate form.
	*
	* @param thirdToDate the third to date of this candidate form
	*/
	@Override
	public void setThirdToDate(java.lang.String thirdToDate) {
		_candidateForm.setThirdToDate(thirdToDate);
	}

	/**
	* Sets the third total ctc of this candidate form.
	*
	* @param thirdTotalCTC the third total ctc of this candidate form
	*/
	@Override
	public void setThirdTotalCTC(java.lang.String thirdTotalCTC) {
		_candidateForm.setThirdTotalCTC(thirdTotalCTC);
	}

	/**
	* Sets the third variable ctc of this candidate form.
	*
	* @param thirdVariableCTC the third variable ctc of this candidate form
	*/
	@Override
	public void setThirdVariableCTC(java.lang.String thirdVariableCTC) {
		_candidateForm.setThirdVariableCTC(thirdVariableCTC);
	}

	/**
	* Sets the total yr experience of this candidate form.
	*
	* @param totalYrExperience the total yr experience of this candidate form
	*/
	@Override
	public void setTotalYrExperience(java.lang.String totalYrExperience) {
		_candidateForm.setTotalYrExperience(totalYrExperience);
	}

	/**
	* Sets the trade of this candidate form.
	*
	* @param trade the trade of this candidate form
	*/
	@Override
	public void setTrade(java.lang.String trade) {
		_candidateForm.setTrade(trade);
	}

	/**
	* Sets the uploadfile of this candidate form.
	*
	* @param UPLOADFILE the uploadfile of this candidate form
	*/
	@Override
	public void setUPLOADFILE(java.lang.String UPLOADFILE) {
		_candidateForm.setUPLOADFILE(UPLOADFILE);
	}

	/**
	* Sets the working since date of this candidate form.
	*
	* @param workingSinceDate the working since date of this candidate form
	*/
	@Override
	public void setWorkingSinceDate(java.lang.String workingSinceDate) {
		_candidateForm.setWorkingSinceDate(workingSinceDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateFormWrapper)) {
			return false;
		}

		CandidateFormWrapper candidateFormWrapper = (CandidateFormWrapper)obj;

		if (Objects.equals(_candidateForm, candidateFormWrapper._candidateForm)) {
			return true;
		}

		return false;
	}

	@Override
	public CandidateForm getWrappedModel() {
		return _candidateForm;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _candidateForm.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _candidateForm.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_candidateForm.resetOriginalValues();
	}

	private final CandidateForm _candidateForm;
}