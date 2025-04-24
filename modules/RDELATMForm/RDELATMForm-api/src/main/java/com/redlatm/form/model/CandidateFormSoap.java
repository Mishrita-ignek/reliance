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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.redlatm.form.service.http.CandidateFormServiceSoap}.
 *
 * @author Mukesh,Vipin
 * @see com.redlatm.form.service.http.CandidateFormServiceSoap
 * @generated
 */
@ProviderType
public class CandidateFormSoap implements Serializable {
	public static CandidateFormSoap toSoapModel(CandidateForm model) {
		CandidateFormSoap soapModel = new CandidateFormSoap();

		soapModel.setCaId(model.getCaId());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setSurname(model.getSurname());
		soapModel.setPassword(model.getPassword());
		soapModel.setFather_SpouseName(model.getFather_SpouseName());
		soapModel.setAadharCardNo(model.getAadharCardNo());
		soapModel.setPanCardNo(model.getPanCardNo());
		soapModel.setBankAccountNo(model.getBankAccountNo());
		soapModel.setEmploymentExRegnNo(model.getEmploymentExRegnNo());
		soapModel.setDateOfBirth(model.getDateOfBirth());
		soapModel.setNativeLocation(model.getNativeLocation());
		soapModel.setMotherTongue(model.getMotherTongue());
		soapModel.setIdentificationMark(model.getIdentificationMark());
		soapModel.setDomicile(model.getDomicile());
		soapModel.setLanguagesKnown(model.getLanguagesKnown());
		soapModel.setRelCompany(model.getRelCompany());
		soapModel.setRelLocation(model.getRelLocation());
		soapModel.setRelRole(model.getRelRole());
		soapModel.setRelFromDate(model.getRelFromDate());
		soapModel.setRelToDate(model.getRelToDate());
		soapModel.setRelLeavingReason(model.getRelLeavingReason());
		soapModel.setHandicapDetail(model.getHandicapDetail());
		soapModel.setReligion(model.getReligion());
		soapModel.setCaste(model.getCaste());
		soapModel.setSubCaste(model.getSubCaste());
		soapModel.setMaritalStatus(model.getMaritalStatus());
		soapModel.setAbleToJoin(model.getAbleToJoin());
		soapModel.setAbleToDays(model.getAbleToDays());
		soapModel.setAbleToMonth(model.getAbleToMonth());
		soapModel.setAddress(model.getAddress());
		soapModel.setCity(model.getCity());
		soapModel.setState(model.getState());
		soapModel.setPin(model.getPin());
		soapModel.setEmailAddress(model.getEmailAddress());
		soapModel.setAlternateEmailID(model.getAlternateEmailID());
		soapModel.setMobile(model.getMobile());
		soapModel.setAlternateMobile(model.getAlternateMobile());
		soapModel.setPersonAlternateNoGiven(model.getPersonAlternateNoGiven());
		soapModel.setMainQualification(model.getMainQualification());
		soapModel.setSpecialization(model.getSpecialization());
		soapModel.setTrade(model.getTrade());
		soapModel.setTotalYrExperience(model.getTotalYrExperience());
		soapModel.setSkill_Proficiency(model.getSkill_Proficiency());
		soapModel.setSECURITYCLEARFROM(model.getSECURITYCLEARFROM());
		soapModel.setSECURITYCLEARTILL(model.getSECURITYCLEARTILL());
		soapModel.setMEDICALFITDOCNAME(model.getMEDICALFITDOCNAME());
		soapModel.setMEDICALFITDOCADDR(model.getMEDICALFITDOCADDR());
		soapModel.setMEDICALFITDOCREGNNO(model.getMEDICALFITDOCREGNNO());
		soapModel.setMEDICALFITDOCTILL(model.getMEDICALFITDOCTILL());
		soapModel.setCurrentCompanyName(model.getCurrentCompanyName());
		soapModel.setCurrentCompanyAddress(model.getCurrentCompanyAddress());
		soapModel.setWorkingSinceDate(model.getWorkingSinceDate());
		soapModel.setDesignation(model.getDesignation());
		soapModel.setCTCFixed(model.getCTCFixed());
		soapModel.setCTCVariable(model.getCTCVariable());
		soapModel.setCTCTotal(model.getCTCTotal());
		soapModel.setRole(model.getRole());
		soapModel.setLocation(model.getLocation());
		soapModel.setNoticePeriod(model.getNoticePeriod());
		soapModel.setFirstCompanyName(model.getFirstCompanyName());
		soapModel.setFirstFromDate(model.getFirstFromDate());
		soapModel.setFirstToDate(model.getFirstToDate());
		soapModel.setFirstCLocation(model.getFirstCLocation());
		soapModel.setFirstCDesignation(model.getFirstCDesignation());
		soapModel.setFirstFixedCTC(model.getFirstFixedCTC());
		soapModel.setFirstVariableCTC(model.getFirstVariableCTC());
		soapModel.setFirstTotalCTC(model.getFirstTotalCTC());
		soapModel.setFirstRemarkIfAny(model.getFirstRemarkIfAny());
		soapModel.setSecoundCompanyName(model.getSecoundCompanyName());
		soapModel.setSecoundFromDate(model.getSecoundFromDate());
		soapModel.setSecoundToDate(model.getSecoundToDate());
		soapModel.setSecoundCLocation(model.getSecoundCLocation());
		soapModel.setSecoundCDesignation(model.getSecoundCDesignation());
		soapModel.setSecoundFixedCTC(model.getSecoundFixedCTC());
		soapModel.setSecoundVariableCTC(model.getSecoundVariableCTC());
		soapModel.setSecoundTotalCTC(model.getSecoundTotalCTC());
		soapModel.setSecoundRemarkIfAny(model.getSecoundRemarkIfAny());
		soapModel.setThirdCompanyName(model.getThirdCompanyName());
		soapModel.setThirdFromDate(model.getThirdFromDate());
		soapModel.setThirdToDate(model.getThirdToDate());
		soapModel.setThirdCLocation(model.getThirdCLocation());
		soapModel.setThirdCDesignation(model.getThirdCDesignation());
		soapModel.setThirdFixedCTC(model.getThirdFixedCTC());
		soapModel.setThirdVariableCTC(model.getThirdVariableCTC());
		soapModel.setThirdTotalCTC(model.getThirdTotalCTC());
		soapModel.setThirdRemarkIfAny(model.getThirdRemarkIfAny());
		soapModel.setForthCompanyName(model.getForthCompanyName());
		soapModel.setForthFromDate(model.getForthFromDate());
		soapModel.setForthToDate(model.getForthToDate());
		soapModel.setForthCLocation(model.getForthCLocation());
		soapModel.setForthCDesignation(model.getForthCDesignation());
		soapModel.setForthFixedCTC(model.getForthFixedCTC());
		soapModel.setForthVariableCTC(model.getForthVariableCTC());
		soapModel.setForthTotalCTC(model.getForthTotalCTC());
		soapModel.setForthRemarkIfAny(model.getForthRemarkIfAny());
		soapModel.setFifthCompanyName(model.getFifthCompanyName());
		soapModel.setFifthFromDate(model.getFifthFromDate());
		soapModel.setFifthToDate(model.getFifthToDate());
		soapModel.setFifthCLocation(model.getFifthCLocation());
		soapModel.setFifthCDesignation(model.getFifthCDesignation());
		soapModel.setFifthFixedCTC(model.getFifthFixedCTC());
		soapModel.setFifthVariableCTC(model.getFifthVariableCTC());
		soapModel.setFifthTotalCTC(model.getFifthTotalCTC());
		soapModel.setFifthRemarkIfAny(model.getFifthRemarkIfAny());
		soapModel.setSSCQualification(model.getSSCQualification());
		soapModel.setSSCUniversityInstitute(model.getSSCUniversityInstitute());
		soapModel.setSSCYearOfPassing(model.getSSCYearOfPassing());
		soapModel.setSSCGrade(model.getSSCGrade());
		soapModel.setHSCUniversityInstitute(model.getHSCUniversityInstitute());
		soapModel.setHSCQualification(model.getHSCQualification());
		soapModel.setHSCYearOfPassing(model.getHSCYearOfPassing());
		soapModel.setHSCGrade(model.getHSCGrade());
		soapModel.setGradUniversityInstitute(model.getGradUniversityInstitute());
		soapModel.setGradQualification(model.getGradQualification());
		soapModel.setGradYearOfPassing(model.getGradYearOfPassing());
		soapModel.setGradGrade(model.getGradGrade());
		soapModel.setPGUniversityInstitute(model.getPGUniversityInstitute());
		soapModel.setPGQualification(model.getPGQualification());
		soapModel.setPGYearOfPassing(model.getPGYearOfPassing());
		soapModel.setPGGrade(model.getPGGrade());
		soapModel.setPhDUniversityInstitute(model.getPhDUniversityInstitute());
		soapModel.setPhDQualification(model.getPhDQualification());
		soapModel.setPhDYearOfPassing(model.getPhDYearOfPassing());
		soapModel.setPhDGrade(model.getPhDGrade());
		soapModel.setOther1UniversityInstitute(model.getOther1UniversityInstitute());
		soapModel.setOther1Qualification(model.getOther1Qualification());
		soapModel.setOther1YearOfPassing(model.getOther1YearOfPassing());
		soapModel.setOther1Grade(model.getOther1Grade());
		soapModel.setOther2UniversityInstitute(model.getOther2UniversityInstitute());
		soapModel.setOther2Qualification(model.getOther2Qualification());
		soapModel.setOther2YearOfPassing(model.getOther2YearOfPassing());
		soapModel.setOther2Grade(model.getOther2Grade());
		soapModel.setOther3UniversityInstitute(model.getOther3UniversityInstitute());
		soapModel.setOther3Qualification(model.getOther3Qualification());
		soapModel.setOther3YearOfPassing(model.getOther3YearOfPassing());
		soapModel.setOther3Grade(model.getOther3Grade());
		soapModel.setUPLOADFILE(model.getUPLOADFILE());

		return soapModel;
	}

	public static CandidateFormSoap[] toSoapModels(CandidateForm[] models) {
		CandidateFormSoap[] soapModels = new CandidateFormSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CandidateFormSoap[][] toSoapModels(CandidateForm[][] models) {
		CandidateFormSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CandidateFormSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CandidateFormSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CandidateFormSoap[] toSoapModels(List<CandidateForm> models) {
		List<CandidateFormSoap> soapModels = new ArrayList<CandidateFormSoap>(models.size());

		for (CandidateForm model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CandidateFormSoap[soapModels.size()]);
	}

	public CandidateFormSoap() {
	}

	public long getPrimaryKey() {
		return _CaId;
	}

	public void setPrimaryKey(long pk) {
		setCaId(pk);
	}

	public long getCaId() {
		return _CaId;
	}

	public void setCaId(long CaId) {
		_CaId = CaId;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getSurname() {
		return _surname;
	}

	public void setSurname(String surname) {
		_surname = surname;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public String getFather_SpouseName() {
		return _father_SpouseName;
	}

	public void setFather_SpouseName(String father_SpouseName) {
		_father_SpouseName = father_SpouseName;
	}

	public String getAadharCardNo() {
		return _aadharCardNo;
	}

	public void setAadharCardNo(String aadharCardNo) {
		_aadharCardNo = aadharCardNo;
	}

	public String getPanCardNo() {
		return _panCardNo;
	}

	public void setPanCardNo(String panCardNo) {
		_panCardNo = panCardNo;
	}

	public String getBankAccountNo() {
		return _bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		_bankAccountNo = bankAccountNo;
	}

	public String getEmploymentExRegnNo() {
		return _employmentExRegnNo;
	}

	public void setEmploymentExRegnNo(String employmentExRegnNo) {
		_employmentExRegnNo = employmentExRegnNo;
	}

	public String getDateOfBirth() {
		return _dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		_dateOfBirth = dateOfBirth;
	}

	public String getNativeLocation() {
		return _nativeLocation;
	}

	public void setNativeLocation(String nativeLocation) {
		_nativeLocation = nativeLocation;
	}

	public String getMotherTongue() {
		return _motherTongue;
	}

	public void setMotherTongue(String motherTongue) {
		_motherTongue = motherTongue;
	}

	public String getIdentificationMark() {
		return _identificationMark;
	}

	public void setIdentificationMark(String identificationMark) {
		_identificationMark = identificationMark;
	}

	public String getDomicile() {
		return _domicile;
	}

	public void setDomicile(String domicile) {
		_domicile = domicile;
	}

	public String getLanguagesKnown() {
		return _languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		_languagesKnown = languagesKnown;
	}

	public String getRelCompany() {
		return _relCompany;
	}

	public void setRelCompany(String relCompany) {
		_relCompany = relCompany;
	}

	public String getRelLocation() {
		return _relLocation;
	}

	public void setRelLocation(String relLocation) {
		_relLocation = relLocation;
	}

	public String getRelRole() {
		return _relRole;
	}

	public void setRelRole(String relRole) {
		_relRole = relRole;
	}

	public String getRelFromDate() {
		return _relFromDate;
	}

	public void setRelFromDate(String relFromDate) {
		_relFromDate = relFromDate;
	}

	public String getRelToDate() {
		return _relToDate;
	}

	public void setRelToDate(String relToDate) {
		_relToDate = relToDate;
	}

	public String getRelLeavingReason() {
		return _relLeavingReason;
	}

	public void setRelLeavingReason(String relLeavingReason) {
		_relLeavingReason = relLeavingReason;
	}

	public String getHandicapDetail() {
		return _handicapDetail;
	}

	public void setHandicapDetail(String handicapDetail) {
		_handicapDetail = handicapDetail;
	}

	public String getReligion() {
		return _religion;
	}

	public void setReligion(String religion) {
		_religion = religion;
	}

	public String getCaste() {
		return _caste;
	}

	public void setCaste(String caste) {
		_caste = caste;
	}

	public String getSubCaste() {
		return _subCaste;
	}

	public void setSubCaste(String subCaste) {
		_subCaste = subCaste;
	}

	public String getMaritalStatus() {
		return _maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		_maritalStatus = maritalStatus;
	}

	public String getAbleToJoin() {
		return _ableToJoin;
	}

	public void setAbleToJoin(String ableToJoin) {
		_ableToJoin = ableToJoin;
	}

	public String getAbleToDays() {
		return _ableToDays;
	}

	public void setAbleToDays(String ableToDays) {
		_ableToDays = ableToDays;
	}

	public String getAbleToMonth() {
		return _ableToMonth;
	}

	public void setAbleToMonth(String ableToMonth) {
		_ableToMonth = ableToMonth;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	public String getPin() {
		return _pin;
	}

	public void setPin(String pin) {
		_pin = pin;
	}

	public String getEmailAddress() {
		return _emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;
	}

	public String getAlternateEmailID() {
		return _alternateEmailID;
	}

	public void setAlternateEmailID(String alternateEmailID) {
		_alternateEmailID = alternateEmailID;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getAlternateMobile() {
		return _alternateMobile;
	}

	public void setAlternateMobile(String alternateMobile) {
		_alternateMobile = alternateMobile;
	}

	public String getPersonAlternateNoGiven() {
		return _personAlternateNoGiven;
	}

	public void setPersonAlternateNoGiven(String personAlternateNoGiven) {
		_personAlternateNoGiven = personAlternateNoGiven;
	}

	public String getMainQualification() {
		return _mainQualification;
	}

	public void setMainQualification(String mainQualification) {
		_mainQualification = mainQualification;
	}

	public String getSpecialization() {
		return _specialization;
	}

	public void setSpecialization(String specialization) {
		_specialization = specialization;
	}

	public String getTrade() {
		return _trade;
	}

	public void setTrade(String trade) {
		_trade = trade;
	}

	public String getTotalYrExperience() {
		return _totalYrExperience;
	}

	public void setTotalYrExperience(String totalYrExperience) {
		_totalYrExperience = totalYrExperience;
	}

	public String getSkill_Proficiency() {
		return _skill_Proficiency;
	}

	public void setSkill_Proficiency(String skill_Proficiency) {
		_skill_Proficiency = skill_Proficiency;
	}

	public String getSECURITYCLEARFROM() {
		return _SECURITYCLEARFROM;
	}

	public void setSECURITYCLEARFROM(String SECURITYCLEARFROM) {
		_SECURITYCLEARFROM = SECURITYCLEARFROM;
	}

	public String getSECURITYCLEARTILL() {
		return _SECURITYCLEARTILL;
	}

	public void setSECURITYCLEARTILL(String SECURITYCLEARTILL) {
		_SECURITYCLEARTILL = SECURITYCLEARTILL;
	}

	public String getMEDICALFITDOCNAME() {
		return _MEDICALFITDOCNAME;
	}

	public void setMEDICALFITDOCNAME(String MEDICALFITDOCNAME) {
		_MEDICALFITDOCNAME = MEDICALFITDOCNAME;
	}

	public String getMEDICALFITDOCADDR() {
		return _MEDICALFITDOCADDR;
	}

	public void setMEDICALFITDOCADDR(String MEDICALFITDOCADDR) {
		_MEDICALFITDOCADDR = MEDICALFITDOCADDR;
	}

	public String getMEDICALFITDOCREGNNO() {
		return _MEDICALFITDOCREGNNO;
	}

	public void setMEDICALFITDOCREGNNO(String MEDICALFITDOCREGNNO) {
		_MEDICALFITDOCREGNNO = MEDICALFITDOCREGNNO;
	}

	public String getMEDICALFITDOCTILL() {
		return _MEDICALFITDOCTILL;
	}

	public void setMEDICALFITDOCTILL(String MEDICALFITDOCTILL) {
		_MEDICALFITDOCTILL = MEDICALFITDOCTILL;
	}

	public String getCurrentCompanyName() {
		return _currentCompanyName;
	}

	public void setCurrentCompanyName(String currentCompanyName) {
		_currentCompanyName = currentCompanyName;
	}

	public String getCurrentCompanyAddress() {
		return _currentCompanyAddress;
	}

	public void setCurrentCompanyAddress(String currentCompanyAddress) {
		_currentCompanyAddress = currentCompanyAddress;
	}

	public String getWorkingSinceDate() {
		return _workingSinceDate;
	}

	public void setWorkingSinceDate(String workingSinceDate) {
		_workingSinceDate = workingSinceDate;
	}

	public String getDesignation() {
		return _designation;
	}

	public void setDesignation(String designation) {
		_designation = designation;
	}

	public String getCTCFixed() {
		return _CTCFixed;
	}

	public void setCTCFixed(String CTCFixed) {
		_CTCFixed = CTCFixed;
	}

	public String getCTCVariable() {
		return _CTCVariable;
	}

	public void setCTCVariable(String CTCVariable) {
		_CTCVariable = CTCVariable;
	}

	public String getCTCTotal() {
		return _CTCTotal;
	}

	public void setCTCTotal(String CTCTotal) {
		_CTCTotal = CTCTotal;
	}

	public String getRole() {
		return _role;
	}

	public void setRole(String role) {
		_role = role;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getNoticePeriod() {
		return _noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		_noticePeriod = noticePeriod;
	}

	public String getFirstCompanyName() {
		return _firstCompanyName;
	}

	public void setFirstCompanyName(String firstCompanyName) {
		_firstCompanyName = firstCompanyName;
	}

	public String getFirstFromDate() {
		return _firstFromDate;
	}

	public void setFirstFromDate(String firstFromDate) {
		_firstFromDate = firstFromDate;
	}

	public String getFirstToDate() {
		return _firstToDate;
	}

	public void setFirstToDate(String firstToDate) {
		_firstToDate = firstToDate;
	}

	public String getFirstCLocation() {
		return _firstCLocation;
	}

	public void setFirstCLocation(String firstCLocation) {
		_firstCLocation = firstCLocation;
	}

	public String getFirstCDesignation() {
		return _firstCDesignation;
	}

	public void setFirstCDesignation(String firstCDesignation) {
		_firstCDesignation = firstCDesignation;
	}

	public String getFirstFixedCTC() {
		return _firstFixedCTC;
	}

	public void setFirstFixedCTC(String firstFixedCTC) {
		_firstFixedCTC = firstFixedCTC;
	}

	public String getFirstVariableCTC() {
		return _firstVariableCTC;
	}

	public void setFirstVariableCTC(String firstVariableCTC) {
		_firstVariableCTC = firstVariableCTC;
	}

	public String getFirstTotalCTC() {
		return _firstTotalCTC;
	}

	public void setFirstTotalCTC(String firstTotalCTC) {
		_firstTotalCTC = firstTotalCTC;
	}

	public String getFirstRemarkIfAny() {
		return _firstRemarkIfAny;
	}

	public void setFirstRemarkIfAny(String firstRemarkIfAny) {
		_firstRemarkIfAny = firstRemarkIfAny;
	}

	public String getSecoundCompanyName() {
		return _secoundCompanyName;
	}

	public void setSecoundCompanyName(String secoundCompanyName) {
		_secoundCompanyName = secoundCompanyName;
	}

	public String getSecoundFromDate() {
		return _secoundFromDate;
	}

	public void setSecoundFromDate(String secoundFromDate) {
		_secoundFromDate = secoundFromDate;
	}

	public String getSecoundToDate() {
		return _secoundToDate;
	}

	public void setSecoundToDate(String secoundToDate) {
		_secoundToDate = secoundToDate;
	}

	public String getSecoundCLocation() {
		return _secoundCLocation;
	}

	public void setSecoundCLocation(String secoundCLocation) {
		_secoundCLocation = secoundCLocation;
	}

	public String getSecoundCDesignation() {
		return _secoundCDesignation;
	}

	public void setSecoundCDesignation(String secoundCDesignation) {
		_secoundCDesignation = secoundCDesignation;
	}

	public String getSecoundFixedCTC() {
		return _secoundFixedCTC;
	}

	public void setSecoundFixedCTC(String secoundFixedCTC) {
		_secoundFixedCTC = secoundFixedCTC;
	}

	public String getSecoundVariableCTC() {
		return _secoundVariableCTC;
	}

	public void setSecoundVariableCTC(String secoundVariableCTC) {
		_secoundVariableCTC = secoundVariableCTC;
	}

	public String getSecoundTotalCTC() {
		return _secoundTotalCTC;
	}

	public void setSecoundTotalCTC(String secoundTotalCTC) {
		_secoundTotalCTC = secoundTotalCTC;
	}

	public String getSecoundRemarkIfAny() {
		return _secoundRemarkIfAny;
	}

	public void setSecoundRemarkIfAny(String secoundRemarkIfAny) {
		_secoundRemarkIfAny = secoundRemarkIfAny;
	}

	public String getThirdCompanyName() {
		return _thirdCompanyName;
	}

	public void setThirdCompanyName(String thirdCompanyName) {
		_thirdCompanyName = thirdCompanyName;
	}

	public String getThirdFromDate() {
		return _thirdFromDate;
	}

	public void setThirdFromDate(String thirdFromDate) {
		_thirdFromDate = thirdFromDate;
	}

	public String getThirdToDate() {
		return _thirdToDate;
	}

	public void setThirdToDate(String thirdToDate) {
		_thirdToDate = thirdToDate;
	}

	public String getThirdCLocation() {
		return _thirdCLocation;
	}

	public void setThirdCLocation(String thirdCLocation) {
		_thirdCLocation = thirdCLocation;
	}

	public String getThirdCDesignation() {
		return _thirdCDesignation;
	}

	public void setThirdCDesignation(String thirdCDesignation) {
		_thirdCDesignation = thirdCDesignation;
	}

	public String getThirdFixedCTC() {
		return _thirdFixedCTC;
	}

	public void setThirdFixedCTC(String thirdFixedCTC) {
		_thirdFixedCTC = thirdFixedCTC;
	}

	public String getThirdVariableCTC() {
		return _thirdVariableCTC;
	}

	public void setThirdVariableCTC(String thirdVariableCTC) {
		_thirdVariableCTC = thirdVariableCTC;
	}

	public String getThirdTotalCTC() {
		return _thirdTotalCTC;
	}

	public void setThirdTotalCTC(String thirdTotalCTC) {
		_thirdTotalCTC = thirdTotalCTC;
	}

	public String getThirdRemarkIfAny() {
		return _thirdRemarkIfAny;
	}

	public void setThirdRemarkIfAny(String thirdRemarkIfAny) {
		_thirdRemarkIfAny = thirdRemarkIfAny;
	}

	public String getForthCompanyName() {
		return _forthCompanyName;
	}

	public void setForthCompanyName(String forthCompanyName) {
		_forthCompanyName = forthCompanyName;
	}

	public String getForthFromDate() {
		return _forthFromDate;
	}

	public void setForthFromDate(String forthFromDate) {
		_forthFromDate = forthFromDate;
	}

	public String getForthToDate() {
		return _forthToDate;
	}

	public void setForthToDate(String forthToDate) {
		_forthToDate = forthToDate;
	}

	public String getForthCLocation() {
		return _forthCLocation;
	}

	public void setForthCLocation(String forthCLocation) {
		_forthCLocation = forthCLocation;
	}

	public String getForthCDesignation() {
		return _forthCDesignation;
	}

	public void setForthCDesignation(String forthCDesignation) {
		_forthCDesignation = forthCDesignation;
	}

	public String getForthFixedCTC() {
		return _forthFixedCTC;
	}

	public void setForthFixedCTC(String forthFixedCTC) {
		_forthFixedCTC = forthFixedCTC;
	}

	public String getForthVariableCTC() {
		return _forthVariableCTC;
	}

	public void setForthVariableCTC(String forthVariableCTC) {
		_forthVariableCTC = forthVariableCTC;
	}

	public String getForthTotalCTC() {
		return _forthTotalCTC;
	}

	public void setForthTotalCTC(String forthTotalCTC) {
		_forthTotalCTC = forthTotalCTC;
	}

	public String getForthRemarkIfAny() {
		return _forthRemarkIfAny;
	}

	public void setForthRemarkIfAny(String forthRemarkIfAny) {
		_forthRemarkIfAny = forthRemarkIfAny;
	}

	public String getFifthCompanyName() {
		return _fifthCompanyName;
	}

	public void setFifthCompanyName(String fifthCompanyName) {
		_fifthCompanyName = fifthCompanyName;
	}

	public String getFifthFromDate() {
		return _fifthFromDate;
	}

	public void setFifthFromDate(String fifthFromDate) {
		_fifthFromDate = fifthFromDate;
	}

	public String getFifthToDate() {
		return _fifthToDate;
	}

	public void setFifthToDate(String fifthToDate) {
		_fifthToDate = fifthToDate;
	}

	public String getFifthCLocation() {
		return _fifthCLocation;
	}

	public void setFifthCLocation(String fifthCLocation) {
		_fifthCLocation = fifthCLocation;
	}

	public String getFifthCDesignation() {
		return _fifthCDesignation;
	}

	public void setFifthCDesignation(String fifthCDesignation) {
		_fifthCDesignation = fifthCDesignation;
	}

	public String getFifthFixedCTC() {
		return _fifthFixedCTC;
	}

	public void setFifthFixedCTC(String fifthFixedCTC) {
		_fifthFixedCTC = fifthFixedCTC;
	}

	public String getFifthVariableCTC() {
		return _fifthVariableCTC;
	}

	public void setFifthVariableCTC(String fifthVariableCTC) {
		_fifthVariableCTC = fifthVariableCTC;
	}

	public String getFifthTotalCTC() {
		return _fifthTotalCTC;
	}

	public void setFifthTotalCTC(String fifthTotalCTC) {
		_fifthTotalCTC = fifthTotalCTC;
	}

	public String getFifthRemarkIfAny() {
		return _fifthRemarkIfAny;
	}

	public void setFifthRemarkIfAny(String fifthRemarkIfAny) {
		_fifthRemarkIfAny = fifthRemarkIfAny;
	}

	public String getSSCQualification() {
		return _SSCQualification;
	}

	public void setSSCQualification(String SSCQualification) {
		_SSCQualification = SSCQualification;
	}

	public String getSSCUniversityInstitute() {
		return _SSCUniversityInstitute;
	}

	public void setSSCUniversityInstitute(String SSCUniversityInstitute) {
		_SSCUniversityInstitute = SSCUniversityInstitute;
	}

	public String getSSCYearOfPassing() {
		return _SSCYearOfPassing;
	}

	public void setSSCYearOfPassing(String SSCYearOfPassing) {
		_SSCYearOfPassing = SSCYearOfPassing;
	}

	public String getSSCGrade() {
		return _SSCGrade;
	}

	public void setSSCGrade(String SSCGrade) {
		_SSCGrade = SSCGrade;
	}

	public String getHSCUniversityInstitute() {
		return _HSCUniversityInstitute;
	}

	public void setHSCUniversityInstitute(String HSCUniversityInstitute) {
		_HSCUniversityInstitute = HSCUniversityInstitute;
	}

	public String getHSCQualification() {
		return _HSCQualification;
	}

	public void setHSCQualification(String HSCQualification) {
		_HSCQualification = HSCQualification;
	}

	public String getHSCYearOfPassing() {
		return _HSCYearOfPassing;
	}

	public void setHSCYearOfPassing(String HSCYearOfPassing) {
		_HSCYearOfPassing = HSCYearOfPassing;
	}

	public String getHSCGrade() {
		return _HSCGrade;
	}

	public void setHSCGrade(String HSCGrade) {
		_HSCGrade = HSCGrade;
	}

	public String getGradUniversityInstitute() {
		return _GradUniversityInstitute;
	}

	public void setGradUniversityInstitute(String GradUniversityInstitute) {
		_GradUniversityInstitute = GradUniversityInstitute;
	}

	public String getGradQualification() {
		return _GradQualification;
	}

	public void setGradQualification(String GradQualification) {
		_GradQualification = GradQualification;
	}

	public String getGradYearOfPassing() {
		return _GradYearOfPassing;
	}

	public void setGradYearOfPassing(String GradYearOfPassing) {
		_GradYearOfPassing = GradYearOfPassing;
	}

	public String getGradGrade() {
		return _GradGrade;
	}

	public void setGradGrade(String GradGrade) {
		_GradGrade = GradGrade;
	}

	public String getPGUniversityInstitute() {
		return _PGUniversityInstitute;
	}

	public void setPGUniversityInstitute(String PGUniversityInstitute) {
		_PGUniversityInstitute = PGUniversityInstitute;
	}

	public String getPGQualification() {
		return _PGQualification;
	}

	public void setPGQualification(String PGQualification) {
		_PGQualification = PGQualification;
	}

	public String getPGYearOfPassing() {
		return _PGYearOfPassing;
	}

	public void setPGYearOfPassing(String PGYearOfPassing) {
		_PGYearOfPassing = PGYearOfPassing;
	}

	public String getPGGrade() {
		return _PGGrade;
	}

	public void setPGGrade(String PGGrade) {
		_PGGrade = PGGrade;
	}

	public String getPhDUniversityInstitute() {
		return _PhDUniversityInstitute;
	}

	public void setPhDUniversityInstitute(String PhDUniversityInstitute) {
		_PhDUniversityInstitute = PhDUniversityInstitute;
	}

	public String getPhDQualification() {
		return _PhDQualification;
	}

	public void setPhDQualification(String PhDQualification) {
		_PhDQualification = PhDQualification;
	}

	public String getPhDYearOfPassing() {
		return _PhDYearOfPassing;
	}

	public void setPhDYearOfPassing(String PhDYearOfPassing) {
		_PhDYearOfPassing = PhDYearOfPassing;
	}

	public String getPhDGrade() {
		return _PhDGrade;
	}

	public void setPhDGrade(String PhDGrade) {
		_PhDGrade = PhDGrade;
	}

	public String getOther1UniversityInstitute() {
		return _other1UniversityInstitute;
	}

	public void setOther1UniversityInstitute(String other1UniversityInstitute) {
		_other1UniversityInstitute = other1UniversityInstitute;
	}

	public String getOther1Qualification() {
		return _other1Qualification;
	}

	public void setOther1Qualification(String other1Qualification) {
		_other1Qualification = other1Qualification;
	}

	public String getOther1YearOfPassing() {
		return _other1YearOfPassing;
	}

	public void setOther1YearOfPassing(String other1YearOfPassing) {
		_other1YearOfPassing = other1YearOfPassing;
	}

	public String getOther1Grade() {
		return _other1Grade;
	}

	public void setOther1Grade(String other1Grade) {
		_other1Grade = other1Grade;
	}

	public String getOther2UniversityInstitute() {
		return _other2UniversityInstitute;
	}

	public void setOther2UniversityInstitute(String other2UniversityInstitute) {
		_other2UniversityInstitute = other2UniversityInstitute;
	}

	public String getOther2Qualification() {
		return _other2Qualification;
	}

	public void setOther2Qualification(String other2Qualification) {
		_other2Qualification = other2Qualification;
	}

	public String getOther2YearOfPassing() {
		return _other2YearOfPassing;
	}

	public void setOther2YearOfPassing(String other2YearOfPassing) {
		_other2YearOfPassing = other2YearOfPassing;
	}

	public String getOther2Grade() {
		return _other2Grade;
	}

	public void setOther2Grade(String other2Grade) {
		_other2Grade = other2Grade;
	}

	public String getOther3UniversityInstitute() {
		return _other3UniversityInstitute;
	}

	public void setOther3UniversityInstitute(String other3UniversityInstitute) {
		_other3UniversityInstitute = other3UniversityInstitute;
	}

	public String getOther3Qualification() {
		return _other3Qualification;
	}

	public void setOther3Qualification(String other3Qualification) {
		_other3Qualification = other3Qualification;
	}

	public String getOther3YearOfPassing() {
		return _other3YearOfPassing;
	}

	public void setOther3YearOfPassing(String other3YearOfPassing) {
		_other3YearOfPassing = other3YearOfPassing;
	}

	public String getOther3Grade() {
		return _other3Grade;
	}

	public void setOther3Grade(String other3Grade) {
		_other3Grade = other3Grade;
	}

	public String getUPLOADFILE() {
		return _UPLOADFILE;
	}

	public void setUPLOADFILE(String UPLOADFILE) {
		_UPLOADFILE = UPLOADFILE;
	}

	private long _CaId;
	private String _firstName;
	private String _surname;
	private String _password;
	private String _father_SpouseName;
	private String _aadharCardNo;
	private String _panCardNo;
	private String _bankAccountNo;
	private String _employmentExRegnNo;
	private String _dateOfBirth;
	private String _nativeLocation;
	private String _motherTongue;
	private String _identificationMark;
	private String _domicile;
	private String _languagesKnown;
	private String _relCompany;
	private String _relLocation;
	private String _relRole;
	private String _relFromDate;
	private String _relToDate;
	private String _relLeavingReason;
	private String _handicapDetail;
	private String _religion;
	private String _caste;
	private String _subCaste;
	private String _maritalStatus;
	private String _ableToJoin;
	private String _ableToDays;
	private String _ableToMonth;
	private String _address;
	private String _city;
	private String _state;
	private String _pin;
	private String _emailAddress;
	private String _alternateEmailID;
	private String _mobile;
	private String _alternateMobile;
	private String _personAlternateNoGiven;
	private String _mainQualification;
	private String _specialization;
	private String _trade;
	private String _totalYrExperience;
	private String _skill_Proficiency;
	private String _SECURITYCLEARFROM;
	private String _SECURITYCLEARTILL;
	private String _MEDICALFITDOCNAME;
	private String _MEDICALFITDOCADDR;
	private String _MEDICALFITDOCREGNNO;
	private String _MEDICALFITDOCTILL;
	private String _currentCompanyName;
	private String _currentCompanyAddress;
	private String _workingSinceDate;
	private String _designation;
	private String _CTCFixed;
	private String _CTCVariable;
	private String _CTCTotal;
	private String _role;
	private String _location;
	private String _noticePeriod;
	private String _firstCompanyName;
	private String _firstFromDate;
	private String _firstToDate;
	private String _firstCLocation;
	private String _firstCDesignation;
	private String _firstFixedCTC;
	private String _firstVariableCTC;
	private String _firstTotalCTC;
	private String _firstRemarkIfAny;
	private String _secoundCompanyName;
	private String _secoundFromDate;
	private String _secoundToDate;
	private String _secoundCLocation;
	private String _secoundCDesignation;
	private String _secoundFixedCTC;
	private String _secoundVariableCTC;
	private String _secoundTotalCTC;
	private String _secoundRemarkIfAny;
	private String _thirdCompanyName;
	private String _thirdFromDate;
	private String _thirdToDate;
	private String _thirdCLocation;
	private String _thirdCDesignation;
	private String _thirdFixedCTC;
	private String _thirdVariableCTC;
	private String _thirdTotalCTC;
	private String _thirdRemarkIfAny;
	private String _forthCompanyName;
	private String _forthFromDate;
	private String _forthToDate;
	private String _forthCLocation;
	private String _forthCDesignation;
	private String _forthFixedCTC;
	private String _forthVariableCTC;
	private String _forthTotalCTC;
	private String _forthRemarkIfAny;
	private String _fifthCompanyName;
	private String _fifthFromDate;
	private String _fifthToDate;
	private String _fifthCLocation;
	private String _fifthCDesignation;
	private String _fifthFixedCTC;
	private String _fifthVariableCTC;
	private String _fifthTotalCTC;
	private String _fifthRemarkIfAny;
	private String _SSCQualification;
	private String _SSCUniversityInstitute;
	private String _SSCYearOfPassing;
	private String _SSCGrade;
	private String _HSCUniversityInstitute;
	private String _HSCQualification;
	private String _HSCYearOfPassing;
	private String _HSCGrade;
	private String _GradUniversityInstitute;
	private String _GradQualification;
	private String _GradYearOfPassing;
	private String _GradGrade;
	private String _PGUniversityInstitute;
	private String _PGQualification;
	private String _PGYearOfPassing;
	private String _PGGrade;
	private String _PhDUniversityInstitute;
	private String _PhDQualification;
	private String _PhDYearOfPassing;
	private String _PhDGrade;
	private String _other1UniversityInstitute;
	private String _other1Qualification;
	private String _other1YearOfPassing;
	private String _other1Grade;
	private String _other2UniversityInstitute;
	private String _other2Qualification;
	private String _other2YearOfPassing;
	private String _other2Grade;
	private String _other3UniversityInstitute;
	private String _other3Qualification;
	private String _other3YearOfPassing;
	private String _other3Grade;
	private String _UPLOADFILE;
}