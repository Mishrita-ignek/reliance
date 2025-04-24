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
 * This class is a wrapper for {@link ShareHolders}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareHolders
 * @generated
 */
@ProviderType
public class ShareHoldersWrapper implements ShareHolders,
	ModelWrapper<ShareHolders> {
	public ShareHoldersWrapper(ShareHolders shareHolders) {
		_shareHolders = shareHolders;
	}

	@Override
	public Class<?> getModelClass() {
		return ShareHolders.class;
	}

	@Override
	public String getModelClassName() {
		return ShareHolders.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SRNO", getSRNO());
		attributes.put("FOLIO_NO", getFOLIO_NO());
		attributes.put("SHARES", getSHARES());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SRNO = (Long)attributes.get("SRNO");

		if (SRNO != null) {
			setSRNO(SRNO);
		}

		String FOLIO_NO = (String)attributes.get("FOLIO_NO");

		if (FOLIO_NO != null) {
			setFOLIO_NO(FOLIO_NO);
		}

		String SHARES = (String)attributes.get("SHARES");

		if (SHARES != null) {
			setSHARES(SHARES);
		}
	}

	@Override
	public ShareHolders toEscapedModel() {
		return new ShareHoldersWrapper(_shareHolders.toEscapedModel());
	}

	@Override
	public ShareHolders toUnescapedModel() {
		return new ShareHoldersWrapper(_shareHolders.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _shareHolders.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _shareHolders.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _shareHolders.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _shareHolders.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ShareHolders> toCacheModel() {
		return _shareHolders.toCacheModel();
	}

	@Override
	public int compareTo(ShareHolders shareHolders) {
		return _shareHolders.compareTo(shareHolders);
	}

	@Override
	public int hashCode() {
		return _shareHolders.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _shareHolders.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ShareHoldersWrapper((ShareHolders)_shareHolders.clone());
	}

	/**
	* Returns the folio_no of this share holders.
	*
	* @return the folio_no of this share holders
	*/
	@Override
	public java.lang.String getFOLIO_NO() {
		return _shareHolders.getFOLIO_NO();
	}

	/**
	* Returns the primary key of this share holders.
	*
	* @return the primary key of this share holders
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _shareHolders.getPrimaryKey();
	}

	/**
	* Returns the shares of this share holders.
	*
	* @return the shares of this share holders
	*/
	@Override
	public java.lang.String getSHARES() {
		return _shareHolders.getSHARES();
	}

	@Override
	public java.lang.String toString() {
		return _shareHolders.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _shareHolders.toXmlString();
	}

	/**
	* Returns the srno of this share holders.
	*
	* @return the srno of this share holders
	*/
	@Override
	public long getSRNO() {
		return _shareHolders.getSRNO();
	}

	@Override
	public void persist() {
		_shareHolders.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_shareHolders.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_shareHolders.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_shareHolders.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_shareHolders.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the folio_no of this share holders.
	*
	* @param FOLIO_NO the folio_no of this share holders
	*/
	@Override
	public void setFOLIO_NO(java.lang.String FOLIO_NO) {
		_shareHolders.setFOLIO_NO(FOLIO_NO);
	}

	@Override
	public void setNew(boolean n) {
		_shareHolders.setNew(n);
	}

	/**
	* Sets the primary key of this share holders.
	*
	* @param primaryKey the primary key of this share holders
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_shareHolders.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_shareHolders.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the shares of this share holders.
	*
	* @param SHARES the shares of this share holders
	*/
	@Override
	public void setSHARES(java.lang.String SHARES) {
		_shareHolders.setSHARES(SHARES);
	}

	/**
	* Sets the srno of this share holders.
	*
	* @param SRNO the srno of this share holders
	*/
	@Override
	public void setSRNO(long SRNO) {
		_shareHolders.setSRNO(SRNO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ShareHoldersWrapper)) {
			return false;
		}

		ShareHoldersWrapper shareHoldersWrapper = (ShareHoldersWrapper)obj;

		if (Objects.equals(_shareHolders, shareHoldersWrapper._shareHolders)) {
			return true;
		}

		return false;
	}

	@Override
	public ShareHolders getWrappedModel() {
		return _shareHolders;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _shareHolders.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _shareHolders.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_shareHolders.resetOriginalValues();
	}

	private final ShareHolders _shareHolders;
}