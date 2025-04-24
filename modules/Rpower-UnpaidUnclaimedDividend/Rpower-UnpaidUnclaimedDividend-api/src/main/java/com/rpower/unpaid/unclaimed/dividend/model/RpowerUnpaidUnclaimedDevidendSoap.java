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

package com.rpower.unpaid.unclaimed.dividend.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rpower.unpaid.unclaimed.dividend.service.http.RpowerUnpaidUnclaimedDevidendServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.rpower.unpaid.unclaimed.dividend.service.http.RpowerUnpaidUnclaimedDevidendServiceSoap
 * @generated
 */
@ProviderType
public class RpowerUnpaidUnclaimedDevidendSoap implements Serializable {
	public static RpowerUnpaidUnclaimedDevidendSoap toSoapModel(
		RpowerUnpaidUnclaimedDevidend model) {
		RpowerUnpaidUnclaimedDevidendSoap soapModel = new RpowerUnpaidUnclaimedDevidendSoap();

		soapModel.setSRNO(model.getSRNO());
		soapModel.setFIRST_NAME(model.getFIRST_NAME());
		soapModel.setMIDDLE_NAME(model.getMIDDLE_NAME());
		soapModel.setLAST_NAME(model.getLAST_NAME());
		soapModel.setFATHER_HUSBAND_FIRST_NAME(model.getFATHER_HUSBAND_FIRST_NAME());
		soapModel.setFATHER_HUSBAND_MIDDLE_NAME(model.getFATHER_HUSBAND_MIDDLE_NAME());
		soapModel.setFATHER_HUSBAND_LAST_NAME(model.getFATHER_HUSBAND_LAST_NAME());
		soapModel.setADDRESS(model.getADDRESS());
		soapModel.setCOUNTRY(model.getCOUNTRY());
		soapModel.setSTATE(model.getSTATE());
		soapModel.setDISTRICT(model.getDISTRICT());
		soapModel.setPIN_CODE(model.getPIN_CODE());
		soapModel.setFOLIO_NO_OF_ITIES(model.getFOLIO_NO_OF_ITIES());
		soapModel.setINVESTMENT_TYPE(model.getINVESTMENT_TYPE());
		soapModel.setAMOUNT_DUE_IN_RS(model.getAMOUNT_DUE_IN_RS());
		soapModel.setPROPOSED_DATE_TRANSFER_IPEF(model.getPROPOSED_DATE_TRANSFER_IPEF());
		soapModel.setCREATEDATE(model.getCREATEDATE());

		return soapModel;
	}

	public static RpowerUnpaidUnclaimedDevidendSoap[] toSoapModels(
		RpowerUnpaidUnclaimedDevidend[] models) {
		RpowerUnpaidUnclaimedDevidendSoap[] soapModels = new RpowerUnpaidUnclaimedDevidendSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpowerUnpaidUnclaimedDevidendSoap[][] toSoapModels(
		RpowerUnpaidUnclaimedDevidend[][] models) {
		RpowerUnpaidUnclaimedDevidendSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RpowerUnpaidUnclaimedDevidendSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpowerUnpaidUnclaimedDevidendSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpowerUnpaidUnclaimedDevidendSoap[] toSoapModels(
		List<RpowerUnpaidUnclaimedDevidend> models) {
		List<RpowerUnpaidUnclaimedDevidendSoap> soapModels = new ArrayList<RpowerUnpaidUnclaimedDevidendSoap>(models.size());

		for (RpowerUnpaidUnclaimedDevidend model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpowerUnpaidUnclaimedDevidendSoap[soapModels.size()]);
	}

	public RpowerUnpaidUnclaimedDevidendSoap() {
	}

	public long getPrimaryKey() {
		return _SRNO;
	}

	public void setPrimaryKey(long pk) {
		setSRNO(pk);
	}

	public long getSRNO() {
		return _SRNO;
	}

	public void setSRNO(long SRNO) {
		_SRNO = SRNO;
	}

	public String getFIRST_NAME() {
		return _FIRST_NAME;
	}

	public void setFIRST_NAME(String FIRST_NAME) {
		_FIRST_NAME = FIRST_NAME;
	}

	public String getMIDDLE_NAME() {
		return _MIDDLE_NAME;
	}

	public void setMIDDLE_NAME(String MIDDLE_NAME) {
		_MIDDLE_NAME = MIDDLE_NAME;
	}

	public String getLAST_NAME() {
		return _LAST_NAME;
	}

	public void setLAST_NAME(String LAST_NAME) {
		_LAST_NAME = LAST_NAME;
	}

	public String getFATHER_HUSBAND_FIRST_NAME() {
		return _FATHER_HUSBAND_FIRST_NAME;
	}

	public void setFATHER_HUSBAND_FIRST_NAME(String FATHER_HUSBAND_FIRST_NAME) {
		_FATHER_HUSBAND_FIRST_NAME = FATHER_HUSBAND_FIRST_NAME;
	}

	public String getFATHER_HUSBAND_MIDDLE_NAME() {
		return _FATHER_HUSBAND_MIDDLE_NAME;
	}

	public void setFATHER_HUSBAND_MIDDLE_NAME(String FATHER_HUSBAND_MIDDLE_NAME) {
		_FATHER_HUSBAND_MIDDLE_NAME = FATHER_HUSBAND_MIDDLE_NAME;
	}

	public String getFATHER_HUSBAND_LAST_NAME() {
		return _FATHER_HUSBAND_LAST_NAME;
	}

	public void setFATHER_HUSBAND_LAST_NAME(String FATHER_HUSBAND_LAST_NAME) {
		_FATHER_HUSBAND_LAST_NAME = FATHER_HUSBAND_LAST_NAME;
	}

	public String getADDRESS() {
		return _ADDRESS;
	}

	public void setADDRESS(String ADDRESS) {
		_ADDRESS = ADDRESS;
	}

	public String getCOUNTRY() {
		return _COUNTRY;
	}

	public void setCOUNTRY(String COUNTRY) {
		_COUNTRY = COUNTRY;
	}

	public String getSTATE() {
		return _STATE;
	}

	public void setSTATE(String STATE) {
		_STATE = STATE;
	}

	public String getDISTRICT() {
		return _DISTRICT;
	}

	public void setDISTRICT(String DISTRICT) {
		_DISTRICT = DISTRICT;
	}

	public long getPIN_CODE() {
		return _PIN_CODE;
	}

	public void setPIN_CODE(long PIN_CODE) {
		_PIN_CODE = PIN_CODE;
	}

	public String getFOLIO_NO_OF_ITIES() {
		return _FOLIO_NO_OF_ITIES;
	}

	public void setFOLIO_NO_OF_ITIES(String FOLIO_NO_OF_ITIES) {
		_FOLIO_NO_OF_ITIES = FOLIO_NO_OF_ITIES;
	}

	public String getINVESTMENT_TYPE() {
		return _INVESTMENT_TYPE;
	}

	public void setINVESTMENT_TYPE(String INVESTMENT_TYPE) {
		_INVESTMENT_TYPE = INVESTMENT_TYPE;
	}

	public double getAMOUNT_DUE_IN_RS() {
		return _AMOUNT_DUE_IN_RS;
	}

	public void setAMOUNT_DUE_IN_RS(double AMOUNT_DUE_IN_RS) {
		_AMOUNT_DUE_IN_RS = AMOUNT_DUE_IN_RS;
	}

	public Date getPROPOSED_DATE_TRANSFER_IPEF() {
		return _PROPOSED_DATE_TRANSFER_IPEF;
	}

	public void setPROPOSED_DATE_TRANSFER_IPEF(Date PROPOSED_DATE_TRANSFER_IPEF) {
		_PROPOSED_DATE_TRANSFER_IPEF = PROPOSED_DATE_TRANSFER_IPEF;
	}

	public Date getCREATEDATE() {
		return _CREATEDATE;
	}

	public void setCREATEDATE(Date CREATEDATE) {
		_CREATEDATE = CREATEDATE;
	}

	private long _SRNO;
	private String _FIRST_NAME;
	private String _MIDDLE_NAME;
	private String _LAST_NAME;
	private String _FATHER_HUSBAND_FIRST_NAME;
	private String _FATHER_HUSBAND_MIDDLE_NAME;
	private String _FATHER_HUSBAND_LAST_NAME;
	private String _ADDRESS;
	private String _COUNTRY;
	private String _STATE;
	private String _DISTRICT;
	private long _PIN_CODE;
	private String _FOLIO_NO_OF_ITIES;
	private String _INVESTMENT_TYPE;
	private double _AMOUNT_DUE_IN_RS;
	private Date _PROPOSED_DATE_TRANSFER_IPEF;
	private Date _CREATEDATE;
}