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

package com.news.media.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.news.media.service.http.NewsAndMediaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.news.media.service.http.NewsAndMediaServiceSoap
 * @generated
 */
@ProviderType
public class NewsAndMediaSoap implements Serializable {
	public static NewsAndMediaSoap toSoapModel(NewsAndMedia model) {
		NewsAndMediaSoap soapModel = new NewsAndMediaSoap();

		soapModel.setSRNO(model.getSRNO());
		soapModel.setHDATE(model.getHDATE());
		soapModel.setHEADLINE(model.getHEADLINE());
		soapModel.setPUBLICATION(model.getPUBLICATION());
		soapModel.setDOCUMENT_NAME(model.getDOCUMENT_NAME());
		soapModel.setCREATEDATE(model.getCREATEDATE());

		return soapModel;
	}

	public static NewsAndMediaSoap[] toSoapModels(NewsAndMedia[] models) {
		NewsAndMediaSoap[] soapModels = new NewsAndMediaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static NewsAndMediaSoap[][] toSoapModels(NewsAndMedia[][] models) {
		NewsAndMediaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new NewsAndMediaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new NewsAndMediaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static NewsAndMediaSoap[] toSoapModels(List<NewsAndMedia> models) {
		List<NewsAndMediaSoap> soapModels = new ArrayList<NewsAndMediaSoap>(models.size());

		for (NewsAndMedia model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new NewsAndMediaSoap[soapModels.size()]);
	}

	public NewsAndMediaSoap() {
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

	public String getPUBLICATION() {
		return _PUBLICATION;
	}

	public void setPUBLICATION(String PUBLICATION) {
		_PUBLICATION = PUBLICATION;
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
	private String _PUBLICATION;
	private String _DOCUMENT_NAME;
	private Date _CREATEDATE;
}