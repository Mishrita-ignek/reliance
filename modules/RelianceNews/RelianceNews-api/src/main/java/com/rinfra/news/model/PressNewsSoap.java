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

package com.rinfra.news.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rinfra.news.service.http.PressNewsServiceSoap}.
 *
 * @author Vipin Singh
 * @see com.rinfra.news.service.http.PressNewsServiceSoap
 * @generated
 */
@ProviderType
public class PressNewsSoap implements Serializable {
	public static PressNewsSoap toSoapModel(PressNews model) {
		PressNewsSoap soapModel = new PressNewsSoap();

		soapModel.setNewsId(model.getNewsId());
		soapModel.setHeadLine(model.getHeadLine());
		soapModel.setPublication(model.getPublication());
		soapModel.setDownloadUrl(model.getDownloadUrl());
		soapModel.setFileName(model.getFileName());
		soapModel.setDate(model.getDate());
		soapModel.setYear(model.getYear());
		soapModel.setMonth(model.getMonth());
		soapModel.setShow(model.getShow());

		return soapModel;
	}

	public static PressNewsSoap[] toSoapModels(PressNews[] models) {
		PressNewsSoap[] soapModels = new PressNewsSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PressNewsSoap[][] toSoapModels(PressNews[][] models) {
		PressNewsSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PressNewsSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PressNewsSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PressNewsSoap[] toSoapModels(List<PressNews> models) {
		List<PressNewsSoap> soapModels = new ArrayList<PressNewsSoap>(models.size());

		for (PressNews model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PressNewsSoap[soapModels.size()]);
	}

	public PressNewsSoap() {
	}

	public long getPrimaryKey() {
		return _newsId;
	}

	public void setPrimaryKey(long pk) {
		setNewsId(pk);
	}

	public long getNewsId() {
		return _newsId;
	}

	public void setNewsId(long newsId) {
		_newsId = newsId;
	}

	public String getHeadLine() {
		return _headLine;
	}

	public void setHeadLine(String headLine) {
		_headLine = headLine;
	}

	public String getPublication() {
		return _publication;
	}

	public void setPublication(String publication) {
		_publication = publication;
	}

	public String getDownloadUrl() {
		return _downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		_downloadUrl = downloadUrl;
	}

	public String getFileName() {
		return _fileName;
	}

	public void setFileName(String fileName) {
		_fileName = fileName;
	}

	public Date getDate() {
		return _date;
	}

	public void setDate(Date date) {
		_date = date;
	}

	public int getYear() {
		return _year;
	}

	public void setYear(int year) {
		_year = year;
	}

	public int getMonth() {
		return _month;
	}

	public void setMonth(int month) {
		_month = month;
	}

	public String getShow() {
		return _show;
	}

	public void setShow(String show) {
		_show = show;
	}

	private long _newsId;
	private String _headLine;
	private String _publication;
	private String _downloadUrl;
	private String _fileName;
	private Date _date;
	private int _year;
	private int _month;
	private String _show;
}