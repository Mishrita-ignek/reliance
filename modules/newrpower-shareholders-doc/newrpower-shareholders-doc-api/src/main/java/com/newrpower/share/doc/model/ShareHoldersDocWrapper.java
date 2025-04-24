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
 * This class is a wrapper for {@link ShareHoldersDoc}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersDoc
 * @generated
 */
@ProviderType
public class ShareHoldersDocWrapper implements ShareHoldersDoc,
	ModelWrapper<ShareHoldersDoc> {
	public ShareHoldersDocWrapper(ShareHoldersDoc shareHoldersDoc) {
		_shareHoldersDoc = shareHoldersDoc;
	}

	@Override
	public Class<?> getModelClass() {
		return ShareHoldersDoc.class;
	}

	@Override
	public String getModelClassName() {
		return ShareHoldersDoc.class.getName();
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
	public ShareHoldersDoc toEscapedModel() {
		return new ShareHoldersDocWrapper(_shareHoldersDoc.toEscapedModel());
	}

	@Override
	public ShareHoldersDoc toUnescapedModel() {
		return new ShareHoldersDocWrapper(_shareHoldersDoc.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _shareHoldersDoc.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _shareHoldersDoc.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _shareHoldersDoc.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _shareHoldersDoc.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ShareHoldersDoc> toCacheModel() {
		return _shareHoldersDoc.toCacheModel();
	}

	@Override
	public int compareTo(ShareHoldersDoc shareHoldersDoc) {
		return _shareHoldersDoc.compareTo(shareHoldersDoc);
	}

	@Override
	public int hashCode() {
		return _shareHoldersDoc.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _shareHoldersDoc.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ShareHoldersDocWrapper((ShareHoldersDoc)_shareHoldersDoc.clone());
	}

	/**
	* Returns the description of this share holders doc.
	*
	* @return the description of this share holders doc
	*/
	@Override
	public java.lang.String getDescription() {
		return _shareHoldersDoc.getDescription();
	}

	/**
	* Returns the file url of this share holders doc.
	*
	* @return the file url of this share holders doc
	*/
	@Override
	public java.lang.String getFileURL() {
		return _shareHoldersDoc.getFileURL();
	}

	/**
	* Returns the heading of this share holders doc.
	*
	* @return the heading of this share holders doc
	*/
	@Override
	public java.lang.String getHeading() {
		return _shareHoldersDoc.getHeading();
	}

	@Override
	public java.lang.String toString() {
		return _shareHoldersDoc.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _shareHoldersDoc.toXmlString();
	}

	/**
	* Returns the press ID of this share holders doc.
	*
	* @return the press ID of this share holders doc
	*/
	@Override
	public long getPressId() {
		return _shareHoldersDoc.getPressId();
	}

	/**
	* Returns the primary key of this share holders doc.
	*
	* @return the primary key of this share holders doc
	*/
	@Override
	public long getPrimaryKey() {
		return _shareHoldersDoc.getPrimaryKey();
	}

	@Override
	public void persist() {
		_shareHoldersDoc.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_shareHoldersDoc.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this share holders doc.
	*
	* @param description the description of this share holders doc
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_shareHoldersDoc.setDescription(description);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_shareHoldersDoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_shareHoldersDoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_shareHoldersDoc.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the file url of this share holders doc.
	*
	* @param fileURL the file url of this share holders doc
	*/
	@Override
	public void setFileURL(java.lang.String fileURL) {
		_shareHoldersDoc.setFileURL(fileURL);
	}

	/**
	* Sets the heading of this share holders doc.
	*
	* @param heading the heading of this share holders doc
	*/
	@Override
	public void setHeading(java.lang.String heading) {
		_shareHoldersDoc.setHeading(heading);
	}

	@Override
	public void setNew(boolean n) {
		_shareHoldersDoc.setNew(n);
	}

	/**
	* Sets the press ID of this share holders doc.
	*
	* @param pressId the press ID of this share holders doc
	*/
	@Override
	public void setPressId(long pressId) {
		_shareHoldersDoc.setPressId(pressId);
	}

	/**
	* Sets the primary key of this share holders doc.
	*
	* @param primaryKey the primary key of this share holders doc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_shareHoldersDoc.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_shareHoldersDoc.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ShareHoldersDocWrapper)) {
			return false;
		}

		ShareHoldersDocWrapper shareHoldersDocWrapper = (ShareHoldersDocWrapper)obj;

		if (Objects.equals(_shareHoldersDoc,
					shareHoldersDocWrapper._shareHoldersDoc)) {
			return true;
		}

		return false;
	}

	@Override
	public ShareHoldersDoc getWrappedModel() {
		return _shareHoldersDoc;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _shareHoldersDoc.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _shareHoldersDoc.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_shareHoldersDoc.resetOriginalValues();
	}

	private final ShareHoldersDoc _shareHoldersDoc;
}