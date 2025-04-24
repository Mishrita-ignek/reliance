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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link PressNews}.
 * </p>
 *
 * @author Vipin Singh
 * @see PressNews
 * @generated
 */
@ProviderType
public class PressNewsWrapper implements PressNews, ModelWrapper<PressNews> {
	public PressNewsWrapper(PressNews pressNews) {
		_pressNews = pressNews;
	}

	@Override
	public Class<?> getModelClass() {
		return PressNews.class;
	}

	@Override
	public String getModelClassName() {
		return PressNews.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("newsId", getNewsId());
		attributes.put("headLine", getHeadLine());
		attributes.put("publication", getPublication());
		attributes.put("downloadUrl", getDownloadUrl());
		attributes.put("fileName", getFileName());
		attributes.put("date", getDate());
		attributes.put("year", getYear());
		attributes.put("month", getMonth());
		attributes.put("show", getShow());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long newsId = (Long)attributes.get("newsId");

		if (newsId != null) {
			setNewsId(newsId);
		}

		String headLine = (String)attributes.get("headLine");

		if (headLine != null) {
			setHeadLine(headLine);
		}

		String publication = (String)attributes.get("publication");

		if (publication != null) {
			setPublication(publication);
		}

		String downloadUrl = (String)attributes.get("downloadUrl");

		if (downloadUrl != null) {
			setDownloadUrl(downloadUrl);
		}

		String fileName = (String)attributes.get("fileName");

		if (fileName != null) {
			setFileName(fileName);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer month = (Integer)attributes.get("month");

		if (month != null) {
			setMonth(month);
		}

		String show = (String)attributes.get("show");

		if (show != null) {
			setShow(show);
		}
	}

	@Override
	public PressNews toEscapedModel() {
		return new PressNewsWrapper(_pressNews.toEscapedModel());
	}

	@Override
	public PressNews toUnescapedModel() {
		return new PressNewsWrapper(_pressNews.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _pressNews.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pressNews.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pressNews.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pressNews.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<PressNews> toCacheModel() {
		return _pressNews.toCacheModel();
	}

	@Override
	public int compareTo(PressNews pressNews) {
		return _pressNews.compareTo(pressNews);
	}

	/**
	* Returns the month of this press news.
	*
	* @return the month of this press news
	*/
	@Override
	public int getMonth() {
		return _pressNews.getMonth();
	}

	/**
	* Returns the year of this press news.
	*
	* @return the year of this press news
	*/
	@Override
	public int getYear() {
		return _pressNews.getYear();
	}

	@Override
	public int hashCode() {
		return _pressNews.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pressNews.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PressNewsWrapper((PressNews)_pressNews.clone());
	}

	/**
	* Returns the download url of this press news.
	*
	* @return the download url of this press news
	*/
	@Override
	public java.lang.String getDownloadUrl() {
		return _pressNews.getDownloadUrl();
	}

	/**
	* Returns the file name of this press news.
	*
	* @return the file name of this press news
	*/
	@Override
	public java.lang.String getFileName() {
		return _pressNews.getFileName();
	}

	/**
	* Returns the head line of this press news.
	*
	* @return the head line of this press news
	*/
	@Override
	public java.lang.String getHeadLine() {
		return _pressNews.getHeadLine();
	}

	/**
	* Returns the publication of this press news.
	*
	* @return the publication of this press news
	*/
	@Override
	public java.lang.String getPublication() {
		return _pressNews.getPublication();
	}

	/**
	* Returns the show of this press news.
	*
	* @return the show of this press news
	*/
	@Override
	public java.lang.String getShow() {
		return _pressNews.getShow();
	}

	@Override
	public java.lang.String toString() {
		return _pressNews.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pressNews.toXmlString();
	}

	/**
	* Returns the date of this press news.
	*
	* @return the date of this press news
	*/
	@Override
	public Date getDate() {
		return _pressNews.getDate();
	}

	/**
	* Returns the news ID of this press news.
	*
	* @return the news ID of this press news
	*/
	@Override
	public long getNewsId() {
		return _pressNews.getNewsId();
	}

	/**
	* Returns the primary key of this press news.
	*
	* @return the primary key of this press news
	*/
	@Override
	public long getPrimaryKey() {
		return _pressNews.getPrimaryKey();
	}

	@Override
	public void persist() {
		_pressNews.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pressNews.setCachedModel(cachedModel);
	}

	/**
	* Sets the date of this press news.
	*
	* @param date the date of this press news
	*/
	@Override
	public void setDate(Date date) {
		_pressNews.setDate(date);
	}

	/**
	* Sets the download url of this press news.
	*
	* @param downloadUrl the download url of this press news
	*/
	@Override
	public void setDownloadUrl(java.lang.String downloadUrl) {
		_pressNews.setDownloadUrl(downloadUrl);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pressNews.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_pressNews.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pressNews.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file name of this press news.
	*
	* @param fileName the file name of this press news
	*/
	@Override
	public void setFileName(java.lang.String fileName) {
		_pressNews.setFileName(fileName);
	}

	/**
	* Sets the head line of this press news.
	*
	* @param headLine the head line of this press news
	*/
	@Override
	public void setHeadLine(java.lang.String headLine) {
		_pressNews.setHeadLine(headLine);
	}

	/**
	* Sets the month of this press news.
	*
	* @param month the month of this press news
	*/
	@Override
	public void setMonth(int month) {
		_pressNews.setMonth(month);
	}

	@Override
	public void setNew(boolean n) {
		_pressNews.setNew(n);
	}

	/**
	* Sets the news ID of this press news.
	*
	* @param newsId the news ID of this press news
	*/
	@Override
	public void setNewsId(long newsId) {
		_pressNews.setNewsId(newsId);
	}

	/**
	* Sets the primary key of this press news.
	*
	* @param primaryKey the primary key of this press news
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pressNews.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pressNews.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the publication of this press news.
	*
	* @param publication the publication of this press news
	*/
	@Override
	public void setPublication(java.lang.String publication) {
		_pressNews.setPublication(publication);
	}

	/**
	* Sets the show of this press news.
	*
	* @param show the show of this press news
	*/
	@Override
	public void setShow(java.lang.String show) {
		_pressNews.setShow(show);
	}

	/**
	* Sets the year of this press news.
	*
	* @param year the year of this press news
	*/
	@Override
	public void setYear(int year) {
		_pressNews.setYear(year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PressNewsWrapper)) {
			return false;
		}

		PressNewsWrapper pressNewsWrapper = (PressNewsWrapper)obj;

		if (Objects.equals(_pressNews, pressNewsWrapper._pressNews)) {
			return true;
		}

		return false;
	}

	@Override
	public PressNews getWrappedModel() {
		return _pressNews;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pressNews.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pressNews.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pressNews.resetOriginalValues();
	}

	private final PressNews _pressNews;
}