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

package com.metro.mediarelease.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.metro.mediarelease.service.http.MetroMediaReleaseServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.metro.mediarelease.service.http.MetroMediaReleaseServiceSoap
 * @generated
 */
@ProviderType
public class MetroMediaReleaseSoap implements Serializable {
	public static MetroMediaReleaseSoap toSoapModel(MetroMediaRelease model) {
		MetroMediaReleaseSoap soapModel = new MetroMediaReleaseSoap();

		soapModel.setSRNO(model.getSRNO());
		soapModel.setHDATE(model.getHDATE());
		soapModel.setHEADLINE(model.getHEADLINE());
		soapModel.setDOCUMENT_NAME(model.getDOCUMENT_NAME());
		soapModel.setCREATEDATE(model.getCREATEDATE());

		return soapModel;
	}

	public static MetroMediaReleaseSoap[] toSoapModels(
		MetroMediaRelease[] models) {
		MetroMediaReleaseSoap[] soapModels = new MetroMediaReleaseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MetroMediaReleaseSoap[][] toSoapModels(
		MetroMediaRelease[][] models) {
		MetroMediaReleaseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MetroMediaReleaseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new MetroMediaReleaseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MetroMediaReleaseSoap[] toSoapModels(
		List<MetroMediaRelease> models) {
		List<MetroMediaReleaseSoap> soapModels = new ArrayList<MetroMediaReleaseSoap>(models.size());

		for (MetroMediaRelease model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MetroMediaReleaseSoap[soapModels.size()]);
	}

	public MetroMediaReleaseSoap() {
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

	public Date getHDATE() {
		return _HDATE;
	}

	public void setHDATE(Date HDATE) {
		_HDATE = HDATE;
	}

	public String getHEADLINE() {
		return _HEADLINE;
	}

	public void setHEADLINE(String HEADLINE) {
		_HEADLINE = HEADLINE;
	}

	public String getDOCUMENT_NAME() {
		return _DOCUMENT_NAME;
	}

	public void setDOCUMENT_NAME(String DOCUMENT_NAME) {
		_DOCUMENT_NAME = DOCUMENT_NAME;
	}

	public Date getCREATEDATE() {
		return _CREATEDATE;
	}

	public void setCREATEDATE(Date CREATEDATE) {
		_CREATEDATE = CREATEDATE;
	}

	private long _SRNO;
	private Date _HDATE;
	private String _HEADLINE;
	private String _DOCUMENT_NAME;
	private Date _CREATEDATE;
}