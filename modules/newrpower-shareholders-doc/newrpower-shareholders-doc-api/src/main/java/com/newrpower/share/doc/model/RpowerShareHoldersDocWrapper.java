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

package com.newrpower.share.doc.model;

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
 * This class is a wrapper for {@link RpowerShareHoldersDoc}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersDoc
 * @generated
 */
@ProviderType
public class RpowerShareHoldersDocWrapper implements RpowerShareHoldersDoc,
	ModelWrapper<RpowerShareHoldersDoc> {
	public RpowerShareHoldersDocWrapper(
		RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		_rpowerShareHoldersDoc = rpowerShareHoldersDoc;
	}

	@Override
	public Class<?> getModelClass() {
		return RpowerShareHoldersDoc.class;
	}

	@Override
	public String getModelClassName() {
		return RpowerShareHoldersDoc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("pressId", getPressId());
		attributes.put("heading", getHeading());
		attributes.put("description", getDescription());
		attributes.put("fileURL", getFileURL());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pressId = (Long)attributes.get("pressId");

		if (pressId != null) {
			setPressId(pressId);
		}

		String heading = (String)attributes.get("heading");

		if (heading != null) {
			setHeading(heading);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String fileURL = (String)attributes.get("fileURL");

		if (fileURL != null) {
			setFileURL(fileURL);
		}
	}

	@Override
	public RpowerShareHoldersDoc toEscapedModel() {
		return new RpowerShareHoldersDocWrapper(_rpowerShareHoldersDoc.toEscapedModel());
	}

	@Override
	public RpowerShareHoldersDoc toUnescapedModel() {
		return new RpowerShareHoldersDocWrapper(_rpowerShareHoldersDoc.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _rpowerShareHoldersDoc.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rpowerShareHoldersDoc.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rpowerShareHoldersDoc.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rpowerShareHoldersDoc.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RpowerShareHoldersDoc> toCacheModel() {
		return _rpowerShareHoldersDoc.toCacheModel();
	}

	@Override
	public int compareTo(RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		return _rpowerShareHoldersDoc.compareTo(rpowerShareHoldersDoc);
	}

	@Override
	public int hashCode() {
		return _rpowerShareHoldersDoc.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rpowerShareHoldersDoc.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RpowerShareHoldersDocWrapper((RpowerShareHoldersDoc)_rpowerShareHoldersDoc.clone());
	}

	/**
	* Returns the description of this rpower share holders doc.
	*
	* @return the description of this rpower share holders doc
	*/
	@Override
	public java.lang.String getDescription() {
		return _rpowerShareHoldersDoc.getDescription();
	}

	/**
	* Returns the file url of this rpower share holders doc.
	*
	* @return the file url of this rpower share holders doc
	*/
	@Override
	public java.lang.String getFileURL() {
		return _rpowerShareHoldersDoc.getFileURL();
	}

	/**
	* Returns the heading of this rpower share holders doc.
	*
	* @return the heading of this rpower share holders doc
	*/
	@Override
	public java.lang.String getHeading() {
		return _rpowerShareHoldersDoc.getHeading();
	}

	@Override
	public java.lang.String toString() {
		return _rpowerShareHoldersDoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rpowerShareHoldersDoc.toXmlString();
	}

	/**
	* Returns the press ID of this rpower share holders doc.
	*
	* @return the press ID of this rpower share holders doc
	*/
	@Override
	public long getPressId() {
		return _rpowerShareHoldersDoc.getPressId();
	}

	/**
	* Returns the primary key of this rpower share holders doc.
	*
	* @return the primary key of this rpower share holders doc
	*/
	@Override
	public long getPrimaryKey() {
		return _rpowerShareHoldersDoc.getPrimaryKey();
	}

	@Override
	public void persist() {
		_rpowerShareHoldersDoc.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rpowerShareHoldersDoc.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this rpower share holders doc.
	*
	* @param description the description of this rpower share holders doc
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_rpowerShareHoldersDoc.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rpowerShareHoldersDoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rpowerShareHoldersDoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rpowerShareHoldersDoc.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file url of this rpower share holders doc.
	*
	* @param fileURL the file url of this rpower share holders doc
	*/
	@Override
	public void setFileURL(java.lang.String fileURL) {
		_rpowerShareHoldersDoc.setFileURL(fileURL);
	}

	/**
	* Sets the heading of this rpower share holders doc.
	*
	* @param heading the heading of this rpower share holders doc
	*/
	@Override
	public void setHeading(java.lang.String heading) {
		_rpowerShareHoldersDoc.setHeading(heading);
	}

	@Override
	public void setNew(boolean n) {
		_rpowerShareHoldersDoc.setNew(n);
	}

	/**
	* Sets the press ID of this rpower share holders doc.
	*
	* @param pressId the press ID of this rpower share holders doc
	*/
	@Override
	public void setPressId(long pressId) {
		_rpowerShareHoldersDoc.setPressId(pressId);
	}

	/**
	* Sets the primary key of this rpower share holders doc.
	*
	* @param primaryKey the primary key of this rpower share holders doc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rpowerShareHoldersDoc.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rpowerShareHoldersDoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RpowerShareHoldersDocWrapper)) {
			return false;
		}

		RpowerShareHoldersDocWrapper rpowerShareHoldersDocWrapper = (RpowerShareHoldersDocWrapper)obj;

		if (Objects.equals(_rpowerShareHoldersDoc,
					rpowerShareHoldersDocWrapper._rpowerShareHoldersDoc)) {
			return true;
		}

		return false;
	}

	@Override
	public RpowerShareHoldersDoc getWrappedModel() {
		return _rpowerShareHoldersDoc;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rpowerShareHoldersDoc.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rpowerShareHoldersDoc.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rpowerShareHoldersDoc.resetOriginalValues();
	}

	private final RpowerShareHoldersDoc _rpowerShareHoldersDoc;
}