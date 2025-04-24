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

package com.media.query.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link MediaQuery}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MediaQuery
 * @generated
 */
@ProviderType
public class MediaQueryWrapper implements MediaQuery, ModelWrapper<MediaQuery> {
	public MediaQueryWrapper(MediaQuery mediaQuery) {
		_mediaQuery = mediaQuery;
	}

	@Override
	public Class<?> getModelClass() {
		return MediaQuery.class;
	}

	@Override
	public String getModelClassName() {
		return MediaQuery.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("srNo", getSrNo());
		attributes.put("journalistName", getJournalistName());
		attributes.put("newsOrganisationName", getNewsOrganisationName());
		attributes.put("organisationType", getOrganisationType());
		attributes.put("mobile", getMobile());
		attributes.put("email", getEmail());
		attributes.put("subject", getSubject());
		attributes.put("mediaQuery", getMediaQuery());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long srNo = (Long)attributes.get("srNo");

		if (srNo != null) {
			setSrNo(srNo);
		}

		String journalistName = (String)attributes.get("journalistName");

		if (journalistName != null) {
			setJournalistName(journalistName);
		}

		String newsOrganisationName = (String)attributes.get(
				"newsOrganisationName");

		if (newsOrganisationName != null) {
			setNewsOrganisationName(newsOrganisationName);
		}

		String organisationType = (String)attributes.get("organisationType");

		if (organisationType != null) {
			setOrganisationType(organisationType);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String subject = (String)attributes.get("subject");

		if (subject != null) {
			setSubject(subject);
		}

		String mediaQuery = (String)attributes.get("mediaQuery");

		if (mediaQuery != null) {
			setMediaQuery(mediaQuery);
		}
	}

	@Override
	public MediaQuery toEscapedModel() {
		return new MediaQueryWrapper(_mediaQuery.toEscapedModel());
	}

	@Override
	public MediaQuery toUnescapedModel() {
		return new MediaQueryWrapper(_mediaQuery.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _mediaQuery.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _mediaQuery.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _mediaQuery.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _mediaQuery.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<MediaQuery> toCacheModel() {
		return _mediaQuery.toCacheModel();
	}

	@Override
	public int compareTo(MediaQuery mediaQuery) {
		return _mediaQuery.compareTo(mediaQuery);
	}

	@Override
	public int hashCode() {
		return _mediaQuery.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mediaQuery.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new MediaQueryWrapper((MediaQuery)_mediaQuery.clone());
	}

	/**
	* Returns the email of this media query.
	*
	* @return the email of this media query
	*/
	@Override
	public java.lang.String getEmail() {
		return _mediaQuery.getEmail();
	}

	/**
	* Returns the journalist name of this media query.
	*
	* @return the journalist name of this media query
	*/
	@Override
	public java.lang.String getJournalistName() {
		return _mediaQuery.getJournalistName();
	}

	/**
	* Returns the media query of this media query.
	*
	* @return the media query of this media query
	*/
	@Override
	public java.lang.String getMediaQuery() {
		return _mediaQuery.getMediaQuery();
	}

	/**
	* Returns the mobile of this media query.
	*
	* @return the mobile of this media query
	*/
	@Override
	public java.lang.String getMobile() {
		return _mediaQuery.getMobile();
	}

	/**
	* Returns the news organisation name of this media query.
	*
	* @return the news organisation name of this media query
	*/
	@Override
	public java.lang.String getNewsOrganisationName() {
		return _mediaQuery.getNewsOrganisationName();
	}

	/**
	* Returns the organisation type of this media query.
	*
	* @return the organisation type of this media query
	*/
	@Override
	public java.lang.String getOrganisationType() {
		return _mediaQuery.getOrganisationType();
	}

	/**
	* Returns the subject of this media query.
	*
	* @return the subject of this media query
	*/
	@Override
	public java.lang.String getSubject() {
		return _mediaQuery.getSubject();
	}

	@Override
	public java.lang.String toString() {
		return _mediaQuery.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _mediaQuery.toXmlString();
	}

	/**
	* Returns the primary key of this media query.
	*
	* @return the primary key of this media query
	*/
	@Override
	public long getPrimaryKey() {
		return _mediaQuery.getPrimaryKey();
	}

	/**
	* Returns the sr no of this media query.
	*
	* @return the sr no of this media query
	*/
	@Override
	public long getSrNo() {
		return _mediaQuery.getSrNo();
	}

	@Override
	public void persist() {
		_mediaQuery.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_mediaQuery.setCachedModel(cachedModel);
	}

	/**
	* Sets the email of this media query.
	*
	* @param email the email of this media query
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_mediaQuery.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_mediaQuery.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_mediaQuery.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_mediaQuery.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the journalist name of this media query.
	*
	* @param journalistName the journalist name of this media query
	*/
	@Override
	public void setJournalistName(java.lang.String journalistName) {
		_mediaQuery.setJournalistName(journalistName);
	}

	/**
	* Sets the media query of this media query.
	*
	* @param mediaQuery the media query of this media query
	*/
	@Override
	public void setMediaQuery(java.lang.String mediaQuery) {
		_mediaQuery.setMediaQuery(mediaQuery);
	}

	/**
	* Sets the mobile of this media query.
	*
	* @param mobile the mobile of this media query
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_mediaQuery.setMobile(mobile);
	}

	@Override
	public void setNew(boolean n) {
		_mediaQuery.setNew(n);
	}

	/**
	* Sets the news organisation name of this media query.
	*
	* @param newsOrganisationName the news organisation name of this media query
	*/
	@Override
	public void setNewsOrganisationName(java.lang.String newsOrganisationName) {
		_mediaQuery.setNewsOrganisationName(newsOrganisationName);
	}

	/**
	* Sets the organisation type of this media query.
	*
	* @param organisationType the organisation type of this media query
	*/
	@Override
	public void setOrganisationType(java.lang.String organisationType) {
		_mediaQuery.setOrganisationType(organisationType);
	}

	/**
	* Sets the primary key of this media query.
	*
	* @param primaryKey the primary key of this media query
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_mediaQuery.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_mediaQuery.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sr no of this media query.
	*
	* @param srNo the sr no of this media query
	*/
	@Override
	public void setSrNo(long srNo) {
		_mediaQuery.setSrNo(srNo);
	}

	/**
	* Sets the subject of this media query.
	*
	* @param subject the subject of this media query
	*/
	@Override
	public void setSubject(java.lang.String subject) {
		_mediaQuery.setSubject(subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MediaQueryWrapper)) {
			return false;
		}

		MediaQueryWrapper mediaQueryWrapper = (MediaQueryWrapper)obj;

		if (Objects.equals(_mediaQuery, mediaQueryWrapper._mediaQuery)) {
			return true;
		}

		return false;
	}

	@Override
	public MediaQuery getWrappedModel() {
		return _mediaQuery;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _mediaQuery.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _mediaQuery.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_mediaQuery.resetOriginalValues();
	}

	private final MediaQuery _mediaQuery;
}