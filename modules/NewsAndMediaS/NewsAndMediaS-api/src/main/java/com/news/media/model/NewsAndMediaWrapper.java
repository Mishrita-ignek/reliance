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
 * This class is a wrapper for {@link NewsAndMedia}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndMedia
 * @generated
 */
@ProviderType
public class NewsAndMediaWrapper implements NewsAndMedia,
	ModelWrapper<NewsAndMedia> {
	public NewsAndMediaWrapper(NewsAndMedia newsAndMedia) {
		_newsAndMedia = newsAndMedia;
	}

	@Override
	public Class<?> getModelClass() {
		return NewsAndMedia.class;
	}

	@Override
	public String getModelClassName() {
		return NewsAndMedia.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SRNO", getSRNO());
		attributes.put("HDATE", getHDATE());
		attributes.put("HEADLINE", getHEADLINE());
		attributes.put("PUBLICATION", getPUBLICATION());
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

		String PUBLICATION = (String)attributes.get("PUBLICATION");

		if (PUBLICATION != null) {
			setPUBLICATION(PUBLICATION);
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
	public NewsAndMedia toEscapedModel() {
		return new NewsAndMediaWrapper(_newsAndMedia.toEscapedModel());
	}

	@Override
	public NewsAndMedia toUnescapedModel() {
		return new NewsAndMediaWrapper(_newsAndMedia.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _newsAndMedia.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _newsAndMedia.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _newsAndMedia.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _newsAndMedia.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<NewsAndMedia> toCacheModel() {
		return _newsAndMedia.toCacheModel();
	}

	@Override
	public int compareTo(NewsAndMedia newsAndMedia) {
		return _newsAndMedia.compareTo(newsAndMedia);
	}

	@Override
	public int hashCode() {
		return _newsAndMedia.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _newsAndMedia.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new NewsAndMediaWrapper((NewsAndMedia)_newsAndMedia.clone());
	}

	/**
	* Returns the document_name of this news and media.
	*
	* @return the document_name of this news and media
	*/
	@Override
	public java.lang.String getDOCUMENT_NAME() {
		return _newsAndMedia.getDOCUMENT_NAME();
	}

	/**
	* Returns the headline of this news and media.
	*
	* @return the headline of this news and media
	*/
	@Override
	public java.lang.String getHEADLINE() {
		return _newsAndMedia.getHEADLINE();
	}

	/**
	* Returns the publication of this news and media.
	*
	* @return the publication of this news and media
	*/
	@Override
	public java.lang.String getPUBLICATION() {
		return _newsAndMedia.getPUBLICATION();
	}

	@Override
	public java.lang.String toString() {
		return _newsAndMedia.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _newsAndMedia.toXmlString();
	}

	/**
	* Returns the createdate of this news and media.
	*
	* @return the createdate of this news and media
	*/
	@Override
	public Date getCREATEDATE() {
		return _newsAndMedia.getCREATEDATE();
	}

	/**
	* Returns the hdate of this news and media.
	*
	* @return the hdate of this news and media
	*/
	@Override
	public Date getHDATE() {
		return _newsAndMedia.getHDATE();
	}

	/**
	* Returns the primary key of this news and media.
	*
	* @return the primary key of this news and media
	*/
	@Override
	public long getPrimaryKey() {
		return _newsAndMedia.getPrimaryKey();
	}

	/**
	* Returns the srno of this news and media.
	*
	* @return the srno of this news and media
	*/
	@Override
	public long getSRNO() {
		return _newsAndMedia.getSRNO();
	}

	@Override
	public void persist() {
		_newsAndMedia.persist();
	}

	/**
	* Sets the createdate of this news and media.
	*
	* @param CREATEDATE the createdate of this news and media
	*/
	@Override
	public void setCREATEDATE(Date CREATEDATE) {
		_newsAndMedia.setCREATEDATE(CREATEDATE);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_newsAndMedia.setCachedModel(cachedModel);
	}

	/**
	* Sets the document_name of this news and media.
	*
	* @param DOCUMENT_NAME the document_name of this news and media
	*/
	@Override
	public void setDOCUMENT_NAME(java.lang.String DOCUMENT_NAME) {
		_newsAndMedia.setDOCUMENT_NAME(DOCUMENT_NAME);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_newsAndMedia.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_newsAndMedia.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_newsAndMedia.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the hdate of this news and media.
	*
	* @param HDATE the hdate of this news and media
	*/
	@Override
	public void setHDATE(Date HDATE) {
		_newsAndMedia.setHDATE(HDATE);
	}

	/**
	* Sets the headline of this news and media.
	*
	* @param HEADLINE the headline of this news and media
	*/
	@Override
	public void setHEADLINE(java.lang.String HEADLINE) {
		_newsAndMedia.setHEADLINE(HEADLINE);
	}

	@Override
	public void setNew(boolean n) {
		_newsAndMedia.setNew(n);
	}

	/**
	* Sets the publication of this news and media.
	*
	* @param PUBLICATION the publication of this news and media
	*/
	@Override
	public void setPUBLICATION(java.lang.String PUBLICATION) {
		_newsAndMedia.setPUBLICATION(PUBLICATION);
	}

	/**
	* Sets the primary key of this news and media.
	*
	* @param primaryKey the primary key of this news and media
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_newsAndMedia.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_newsAndMedia.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the srno of this news and media.
	*
	* @param SRNO the srno of this news and media
	*/
	@Override
	public void setSRNO(long SRNO) {
		_newsAndMedia.setSRNO(SRNO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof NewsAndMediaWrapper)) {
			return false;
		}

		NewsAndMediaWrapper newsAndMediaWrapper = (NewsAndMediaWrapper)obj;

		if (Objects.equals(_newsAndMedia, newsAndMediaWrapper._newsAndMedia)) {
			return true;
		}

		return false;
	}

	@Override
	public NewsAndMedia getWrappedModel() {
		return _newsAndMedia;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _newsAndMedia.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _newsAndMedia.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_newsAndMedia.resetOriginalValues();
	}

	private final NewsAndMedia _newsAndMedia;
}