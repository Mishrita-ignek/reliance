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

package com.rinfra.satisfactionsurvey.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rinfra.satisfactionsurvey.service.http.ShareholdersServiceSoap}.
 *
 * @author Mukesh
 * @see com.rinfra.satisfactionsurvey.service.http.ShareholdersServiceSoap
 * @generated
 */
@ProviderType
public class ShareholdersSoap implements Serializable {
	public static ShareholdersSoap toSoapModel(Shareholders model) {
		ShareholdersSoap soapModel = new ShareholdersSoap();

		soapModel.setSHAREHOLDERSID(model.getSHAREHOLDERSID());
		soapModel.setSOLE_ID(model.getSOLE_ID());
		soapModel.setSOLE_NAME(model.getSOLE_NAME());
		soapModel.setID_NUMBER(model.getID_NUMBER());
		soapModel.setMOBILE(model.getMOBILE());
		soapModel.setTELEPHONE(model.getTELEPHONE());
		soapModel.setEMAIL(model.getEMAIL());
		soapModel.setQUERY_RESPONSE(model.getQUERY_RESPONSE());
		soapModel.setOVERALL_RATING(model.getOVERALL_RATING());
		soapModel.setCOMP_INFORMATION(model.getCOMP_INFORMATION());
		soapModel.setQUALITY_REPORT(model.getQUALITY_REPORT());
		soapModel.setDESCRIPTION(model.getDESCRIPTION());
		soapModel.setCOMMENTS(model.getCOMMENTS());
		soapModel.setGRIEVANCE(model.getGRIEVANCE());

		return soapModel;
	}

	public static ShareholdersSoap[] toSoapModels(Shareholders[] models) {
		ShareholdersSoap[] soapModels = new ShareholdersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ShareholdersSoap[][] toSoapModels(Shareholders[][] models) {
		ShareholdersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ShareholdersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ShareholdersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ShareholdersSoap[] toSoapModels(List<Shareholders> models) {
		List<ShareholdersSoap> soapModels = new ArrayList<ShareholdersSoap>(models.size());

		for (Shareholders model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ShareholdersSoap[soapModels.size()]);
	}

	public ShareholdersSoap() {
	}

	public long getPrimaryKey() {
		return _SOLE_ID;
	}

	public void setPrimaryKey(long pk) {
		setSOLE_ID(pk);
	}

	public long getSHAREHOLDERSID() {
		return _SHAREHOLDERSID;
	}

	public void setSHAREHOLDERSID(long SHAREHOLDERSID) {
		_SHAREHOLDERSID = SHAREHOLDERSID;
	}

	public long getSOLE_ID() {
		return _SOLE_ID;
	}

	public void setSOLE_ID(long SOLE_ID) {
		_SOLE_ID = SOLE_ID;
	}

	public String getSOLE_NAME() {
		return _SOLE_NAME;
	}

	public void setSOLE_NAME(String SOLE_NAME) {
		_SOLE_NAME = SOLE_NAME;
	}

	public long getID_NUMBER() {
		return _ID_NUMBER;
	}

	public void setID_NUMBER(long ID_NUMBER) {
		_ID_NUMBER = ID_NUMBER;
	}

	public long getMOBILE() {
		return _MOBILE;
	}

	public void setMOBILE(long MOBILE) {
		_MOBILE = MOBILE;
	}

	public long getTELEPHONE() {
		return _TELEPHONE;
	}

	public void setTELEPHONE(long TELEPHONE) {
		_TELEPHONE = TELEPHONE;
	}

	public String getEMAIL() {
		return _EMAIL;
	}

	public void setEMAIL(String EMAIL) {
		_EMAIL = EMAIL;
	}

	public String getQUERY_RESPONSE() {
		return _QUERY_RESPONSE;
	}

	public void setQUERY_RESPONSE(String QUERY_RESPONSE) {
		_QUERY_RESPONSE = QUERY_RESPONSE;
	}

	public String getOVERALL_RATING() {
		return _OVERALL_RATING;
	}

	public void setOVERALL_RATING(String OVERALL_RATING) {
		_OVERALL_RATING = OVERALL_RATING;
	}

	public String getCOMP_INFORMATION() {
		return _COMP_INFORMATION;
	}

	public void setCOMP_INFORMATION(String COMP_INFORMATION) {
		_COMP_INFORMATION = COMP_INFORMATION;
	}

	public String getQUALITY_REPORT() {
		return _QUALITY_REPORT;
	}

	public void setQUALITY_REPORT(String QUALITY_REPORT) {
		_QUALITY_REPORT = QUALITY_REPORT;
	}

	public String getDESCRIPTION() {
		return _DESCRIPTION;
	}

	public void setDESCRIPTION(String DESCRIPTION) {
		_DESCRIPTION = DESCRIPTION;
	}

	public String getCOMMENTS() {
		return _COMMENTS;
	}

	public void setCOMMENTS(String COMMENTS) {
		_COMMENTS = COMMENTS;
	}

	public String getGRIEVANCE() {
		return _GRIEVANCE;
	}

	public void setGRIEVANCE(String GRIEVANCE) {
		_GRIEVANCE = GRIEVANCE;
	}

	private long _SHAREHOLDERSID;
	private long _SOLE_ID;
	private String _SOLE_NAME;
	private long _ID_NUMBER;
	private long _MOBILE;
	private long _TELEPHONE;
	private String _EMAIL;
	private String _QUERY_RESPONSE;
	private String _OVERALL_RATING;
	private String _COMP_INFORMATION;
	private String _QUALITY_REPORT;
	private String _DESCRIPTION;
	private String _COMMENTS;
	private String _GRIEVANCE;
}