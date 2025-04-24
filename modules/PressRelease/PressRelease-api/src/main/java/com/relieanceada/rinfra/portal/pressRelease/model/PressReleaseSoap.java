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

package com.relieanceada.rinfra.portal.pressRelease.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.relieanceada.rinfra.portal.pressRelease.service.http.PressReleaseServiceSoap}.
 *
 * @author Vipin Singh
 * @see com.relieanceada.rinfra.portal.pressRelease.service.http.PressReleaseServiceSoap
 * @generated
 */
@ProviderType
public class PressReleaseSoap implements Serializable {
	public static PressReleaseSoap toSoapModel(PressRelease model) {
		PressReleaseSoap soapModel = new PressReleaseSoap();

		soapModel.setPressId(model.getPressId());
		soapModel.setNewsYear(model.getNewsYear());
		soapModel.setNewsDate(model.getNewsDate());
		soapModel.setHeading(model.getHeading());
		soapModel.setData(model.getData());
		soapModel.setDescription(model.getDescription());
		soapModel.setShow(model.getShow());
		soapModel.setCreatedDate(model.getCreatedDate());
		soapModel.setFileName(model.getFileName());
		soapModel.setFileURL(model.getFileURL());

		return soapModel;
	}

	public static PressReleaseSoap[] toSoapModels(PressRelease[] models) {
		PressReleaseSoap[] soapModels = new PressReleaseSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PressReleaseSoap[][] toSoapModels(PressRelease[][] models) {
		PressReleaseSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PressReleaseSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PressReleaseSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PressReleaseSoap[] toSoapModels(List<PressRelease> models) {
		List<PressReleaseSoap> soapModels = new ArrayList<PressReleaseSoap>(models.size());

		for (PressRelease model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PressReleaseSoap[soapModels.size()]);
	}

	public PressReleaseSoap() {
	}

	public long getPrimaryKey() {
		return _pressId;
	}

	public void setPrimaryKey(long pk) {
		setPressId(pk);
	}

	public long getPressId() {
		return _pressId;
	}

	public void setPressId(long pressId) {
		_pressId = pressId;
	}

	public String getNewsYear() {
		return _newsYear;
	}

	public void setNewsYear(String newsYear) {
		_newsYear = newsYear;
	}

	public Date getNewsDate() {
		return _newsDate;
	}

	public void setNewsDate(Date newsDate) {
		_newsDate = newsDate;
	}

	public String getHeading() {
		return _heading;
	}

	public void setHeading(String heading) {
		_heading = heading;
	}

	public String getData() {
		return _data;
	}

	public void setData(String data) {
		_data = data;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getShow() {
		return _show;
	}

	public void setShow(String show) {
		_show = show;
	}

	public Date getCreatedDate() {
		return _createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		_createdDate = createdDate;
	}

	public String getFileName() {
		return _fileName;
	}

	public void setFileName(String fileName) {
		_fileName = fileName;
	}

	public String getFileURL() {
		return _fileURL;
	}

	public void setFileURL(String fileURL) {
		_fileURL = fileURL;
	}

	private long _pressId;
	private String _newsYear;
	private Date _newsDate;
	private String _heading;
	private String _data;
	private String _description;
	private String _show;
	private Date _createdDate;
	private String _fileName;
	private String _fileURL;
}