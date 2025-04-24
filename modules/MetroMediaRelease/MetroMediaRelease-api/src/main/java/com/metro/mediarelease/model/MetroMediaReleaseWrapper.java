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
 * This class is a wrapper for {@link MetroMediaRelease}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetroMediaRelease
 * @generated
 */
@ProviderType
public class MetroMediaReleaseWrapper implements MetroMediaRelease,
	ModelWrapper<MetroMediaRelease> {
	public MetroMediaReleaseWrapper(MetroMediaRelease metroMediaRelease) {
		_metroMediaRelease = metroMediaRelease;
	}

	@Override
	public Class<?> getModelClass() {
		return MetroMediaRelease.class;
	}

	@Override
	public String getModelClassName() {
		return MetroMediaRelease.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SRNO", getSRNO());
		attributes.put("HDATE", getHDATE());
		attributes.put("HEADLINE", getHEADLINE());
		attributes.put("DOCUMENT_NAME", getDOCUMENT_NAME());
		attributes.put("CREATEDATE", getCREATEDATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SRNO = (Long)attributes.get("SRNO");

		if (SRNO != null) {
			setSRNO(SRNO);
		}

		Date HDATE = (Date)attributes.get("HDATE");

		if (HDATE != null) {
			setHDATE(HDATE);
		}

		String HEADLINE = (String)attributes.get("HEADLINE");

		if (HEADLINE != null) {
			setHEADLINE(HEADLINE);
		}

		String DOCUMENT_NAME = (String)attributes.get("DOCUMENT_NAME");

		if (DOCUMENT_NAME != null) {
			setDOCUMENT_NAME(DOCUMENT_NAME);
		}

		Date CREATEDATE = (Date)attributes.get("CREATEDATE");

		if (CREATEDATE != null) {
			setCREATEDATE(CREATEDATE);
		}
	}

	@Override
	public MetroMediaRelease toEscapedModel() {
		return new MetroMediaReleaseWrapper(_metroMediaRelease.toEscapedModel());
	}

	@Override
	public MetroMediaRelease toUnescapedModel() {
		return new MetroMediaReleaseWrapper(_metroMediaRelease.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _metroMediaRelease.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _metroMediaRelease.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _metroMediaRelease.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _metroMediaRelease.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<MetroMediaRelease> toCacheModel() {
		return _metroMediaRelease.toCacheModel();
	}

	@Override
	public int compareTo(MetroMediaRelease metroMediaRelease) {
		return _metroMediaRelease.compareTo(metroMediaRelease);
	}

	@Override
	public int hashCode() {
		return _metroMediaRelease.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _metroMediaRelease.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new MetroMediaReleaseWrapper((MetroMediaRelease)_metroMediaRelease.clone());
	}

	/**
	* Returns the document_name of this metro media release.
	*
	* @return the document_name of this metro media release
	*/
	@Override
	public java.lang.String getDOCUMENT_NAME() {
		return _metroMediaRelease.getDOCUMENT_NAME();
	}

	/**
	* Returns the headline of this metro media release.
	*
	* @return the headline of this metro media release
	*/
	@Override
	public java.lang.String getHEADLINE() {
		return _metroMediaRelease.getHEADLINE();
	}

	@Override
	public java.lang.String toString() {
		return _metroMediaRelease.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _metroMediaRelease.toXmlString();
	}

	/**
	* Returns the createdate of this metro media release.
	*
	* @return the createdate of this metro media release
	*/
	@Override
	public Date getCREATEDATE() {
		return _metroMediaRelease.getCREATEDATE();
	}

	/**
	* Returns the hdate of this metro media release.
	*
	* @return the hdate of this metro media release
	*/
	@Override
	public Date getHDATE() {
		return _metroMediaRelease.getHDATE();
	}

	/**
	* Returns the primary key of this metro media release.
	*
	* @return the primary key of this metro media release
	*/
	@Override
	public long getPrimaryKey() {
		return _metroMediaRelease.getPrimaryKey();
	}

	/**
	* Returns the srno of this metro media release.
	*
	* @return the srno of this metro media release
	*/
	@Override
	public long getSRNO() {
		return _metroMediaRelease.getSRNO();
	}

	@Override
	public void persist() {
		_metroMediaRelease.persist();
	}

	/**
	* Sets the createdate of this metro media release.
	*
	* @param CREATEDATE the createdate of this metro media release
	*/
	@Override
	public void setCREATEDATE(Date CREATEDATE) {
		_metroMediaRelease.setCREATEDATE(CREATEDATE);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_metroMediaRelease.setCachedModel(cachedModel);
	}

	/**
	* Sets the document_name of this metro media release.
	*
	* @param DOCUMENT_NAME the document_name of this metro media release
	*/
	@Override
	public void setDOCUMENT_NAME(java.lang.String DOCUMENT_NAME) {
		_metroMediaRelease.setDOCUMENT_NAME(DOCUMENT_NAME);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_metroMediaRelease.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_metroMediaRelease.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_metroMediaRelease.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the hdate of this metro media release.
	*
	* @param HDATE the hdate of this metro media release
	*/
	@Override
	public void setHDATE(Date HDATE) {
		_metroMediaRelease.setHDATE(HDATE);
	}

	/**
	* Sets the headline of this metro media release.
	*
	* @param HEADLINE the headline of this metro media release
	*/
	@Override
	public void setHEADLINE(java.lang.String HEADLINE) {
		_metroMediaRelease.setHEADLINE(HEADLINE);
	}

	@Override
	public void setNew(boolean n) {
		_metroMediaRelease.setNew(n);
	}

	/**
	* Sets the primary key of this metro media release.
	*
	* @param primaryKey the primary key of this metro media release
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_metroMediaRelease.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_metroMediaRelease.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the srno of this metro media release.
	*
	* @param SRNO the srno of this metro media release
	*/
	@Override
	public void setSRNO(long SRNO) {
		_metroMediaRelease.setSRNO(SRNO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MetroMediaReleaseWrapper)) {
			return false;
		}

		MetroMediaReleaseWrapper metroMediaReleaseWrapper = (MetroMediaReleaseWrapper)obj;

		if (Objects.equals(_metroMediaRelease,
					metroMediaReleaseWrapper._metroMediaRelease)) {
			return true;
		}

		return false;
	}

	@Override
	public MetroMediaRelease getWrappedModel() {
		return _metroMediaRelease;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _metroMediaRelease.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _metroMediaRelease.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_metroMediaRelease.resetOriginalValues();
	}

	private final MetroMediaRelease _metroMediaRelease;
}