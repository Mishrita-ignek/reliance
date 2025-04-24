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
 * This class is a wrapper for {@link PressRelease}.
 * </p>
 *
 * @author Vipin Singh
 * @see PressRelease
 * @generated
 */
@ProviderType
public class PressReleaseWrapper implements PressRelease,
	ModelWrapper<PressRelease> {
	public PressReleaseWrapper(PressRelease pressRelease) {
		_pressRelease = pressRelease;
	}

	@Override
	public Class<?> getModelClass() {
		return PressRelease.class;
	}

	@Override
	public String getModelClassName() {
		return PressRelease.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pressId", getPressId());
		attributes.put("newsYear", getNewsYear());
		attributes.put("newsDate", getNewsDate());
		attributes.put("heading", getHeading());
		attributes.put("data", getData());
		attributes.put("description", getDescription());
		attributes.put("show", getShow());
		attributes.put("createdDate", getCreatedDate());
		attributes.put("fileName", getFileName());
		attributes.put("fileURL", getFileURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pressId = (Long)attributes.get("pressId");

		if (pressId != null) {
			setPressId(pressId);
		}

		String newsYear = (String)attributes.get("newsYear");

		if (newsYear != null) {
			setNewsYear(newsYear);
		}

		Date newsDate = (Date)attributes.get("newsDate");

		if (newsDate != null) {
			setNewsDate(newsDate);
		}

		String heading = (String)attributes.get("heading");

		if (heading != null) {
			setHeading(heading);
		}

		String data = (String)attributes.get("data");

		if (data != null) {
			setData(data);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String show = (String)attributes.get("show");

		if (show != null) {
			setShow(show);
		}

		Date createdDate = (Date)attributes.get("createdDate");

		if (createdDate != null) {
			setCreatedDate(createdDate);
		}

		String fileName = (String)attributes.get("fileName");

		if (fileName != null) {
			setFileName(fileName);
		}

		String fileURL = (String)attributes.get("fileURL");

		if (fileURL != null) {
			setFileURL(fileURL);
		}
	}

	@Override
	public PressRelease toEscapedModel() {
		return new PressReleaseWrapper(_pressRelease.toEscapedModel());
	}

	@Override
	public PressRelease toUnescapedModel() {
		return new PressReleaseWrapper(_pressRelease.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _pressRelease.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pressRelease.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pressRelease.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pressRelease.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<PressRelease> toCacheModel() {
		return _pressRelease.toCacheModel();
	}

	@Override
	public int compareTo(PressRelease pressRelease) {
		return _pressRelease.compareTo(pressRelease);
	}

	@Override
	public int hashCode() {
		return _pressRelease.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pressRelease.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PressReleaseWrapper((PressRelease)_pressRelease.clone());
	}

	/**
	* Returns the data of this press release.
	*
	* @return the data of this press release
	*/
	@Override
	public java.lang.String getData() {
		return _pressRelease.getData();
	}

	/**
	* Returns the description of this press release.
	*
	* @return the description of this press release
	*/
	@Override
	public java.lang.String getDescription() {
		return _pressRelease.getDescription();
	}

	/**
	* Returns the file name of this press release.
	*
	* @return the file name of this press release
	*/
	@Override
	public java.lang.String getFileName() {
		return _pressRelease.getFileName();
	}

	/**
	* Returns the file url of this press release.
	*
	* @return the file url of this press release
	*/
	@Override
	public java.lang.String getFileURL() {
		return _pressRelease.getFileURL();
	}

	/**
	* Returns the heading of this press release.
	*
	* @return the heading of this press release
	*/
	@Override
	public java.lang.String getHeading() {
		return _pressRelease.getHeading();
	}

	/**
	* Returns the news year of this press release.
	*
	* @return the news year of this press release
	*/
	@Override
	public java.lang.String getNewsYear() {
		return _pressRelease.getNewsYear();
	}

	/**
	* Returns the show of this press release.
	*
	* @return the show of this press release
	*/
	@Override
	public java.lang.String getShow() {
		return _pressRelease.getShow();
	}

	@Override
	public java.lang.String toString() {
		return _pressRelease.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pressRelease.toXmlString();
	}

	/**
	* Returns the created date of this press release.
	*
	* @return the created date of this press release
	*/
	@Override
	public Date getCreatedDate() {
		return _pressRelease.getCreatedDate();
	}

	/**
	* Returns the news date of this press release.
	*
	* @return the news date of this press release
	*/
	@Override
	public Date getNewsDate() {
		return _pressRelease.getNewsDate();
	}

	/**
	* Returns the press ID of this press release.
	*
	* @return the press ID of this press release
	*/
	@Override
	public long getPressId() {
		return _pressRelease.getPressId();
	}

	/**
	* Returns the primary key of this press release.
	*
	* @return the primary key of this press release
	*/
	@Override
	public long getPrimaryKey() {
		return _pressRelease.getPrimaryKey();
	}

	@Override
	public void persist() {
		_pressRelease.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pressRelease.setCachedModel(cachedModel);
	}

	/**
	* Sets the created date of this press release.
	*
	* @param createdDate the created date of this press release
	*/
	@Override
	public void setCreatedDate(Date createdDate) {
		_pressRelease.setCreatedDate(createdDate);
	}

	/**
	* Sets the data of this press release.
	*
	* @param data the data of this press release
	*/
	@Override
	public void setData(java.lang.String data) {
		_pressRelease.setData(data);
	}

	/**
	* Sets the description of this press release.
	*
	* @param description the description of this press release
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_pressRelease.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pressRelease.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_pressRelease.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pressRelease.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file name of this press release.
	*
	* @param fileName the file name of this press release
	*/
	@Override
	public void setFileName(java.lang.String fileName) {
		_pressRelease.setFileName(fileName);
	}

	/**
	* Sets the file url of this press release.
	*
	* @param fileURL the file url of this press release
	*/
	@Override
	public void setFileURL(java.lang.String fileURL) {
		_pressRelease.setFileURL(fileURL);
	}

	/**
	* Sets the heading of this press release.
	*
	* @param heading the heading of this press release
	*/
	@Override
	public void setHeading(java.lang.String heading) {
		_pressRelease.setHeading(heading);
	}

	@Override
	public void setNew(boolean n) {
		_pressRelease.setNew(n);
	}

	/**
	* Sets the news date of this press release.
	*
	* @param newsDate the news date of this press release
	*/
	@Override
	public void setNewsDate(Date newsDate) {
		_pressRelease.setNewsDate(newsDate);
	}

	/**
	* Sets the news year of this press release.
	*
	* @param newsYear the news year of this press release
	*/
	@Override
	public void setNewsYear(java.lang.String newsYear) {
		_pressRelease.setNewsYear(newsYear);
	}

	/**
	* Sets the press ID of this press release.
	*
	* @param pressId the press ID of this press release
	*/
	@Override
	public void setPressId(long pressId) {
		_pressRelease.setPressId(pressId);
	}

	/**
	* Sets the primary key of this press release.
	*
	* @param primaryKey the primary key of this press release
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pressRelease.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pressRelease.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the show of this press release.
	*
	* @param show the show of this press release
	*/
	@Override
	public void setShow(java.lang.String show) {
		_pressRelease.setShow(show);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PressReleaseWrapper)) {
			return false;
		}

		PressReleaseWrapper pressReleaseWrapper = (PressReleaseWrapper)obj;

		if (Objects.equals(_pressRelease, pressReleaseWrapper._pressRelease)) {
			return true;
		}

		return false;
	}

	@Override
	public PressRelease getWrappedModel() {
		return _pressRelease;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pressRelease.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pressRelease.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pressRelease.resetOriginalValues();
	}

	private final PressRelease _pressRelease;
}