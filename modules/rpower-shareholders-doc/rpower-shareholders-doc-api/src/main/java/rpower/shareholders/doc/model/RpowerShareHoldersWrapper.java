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

package rpower.shareholders.doc.model;

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
 * This class is a wrapper for {@link RpowerShareHolders}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHolders
 * @generated
 */
@ProviderType
public class RpowerShareHoldersWrapper implements RpowerShareHolders,
	ModelWrapper<RpowerShareHolders> {
	public RpowerShareHoldersWrapper(RpowerShareHolders rpowerShareHolders) {
		_rpowerShareHolders = rpowerShareHolders;
	}

	@Override
	public Class<?> getModelClass() {
		return RpowerShareHolders.class;
	}

	@Override
	public String getModelClassName() {
		return RpowerShareHolders.class.getName();
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
	public boolean isCachedModel() {
		return _rpowerShareHolders.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rpowerShareHolders.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rpowerShareHolders.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rpowerShareHolders.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<rpower.shareholders.doc.model.RpowerShareHolders> toCacheModel() {
		return _rpowerShareHolders.toCacheModel();
	}

	@Override
	public int compareTo(
		rpower.shareholders.doc.model.RpowerShareHolders rpowerShareHolders) {
		return _rpowerShareHolders.compareTo(rpowerShareHolders);
	}

	@Override
	public int hashCode() {
		return _rpowerShareHolders.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rpowerShareHolders.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RpowerShareHoldersWrapper((RpowerShareHolders)_rpowerShareHolders.clone());
	}

	/**
	* Returns the folio_no of this rpower share holders.
	*
	* @return the folio_no of this rpower share holders
	*/
	@Override
	public java.lang.String getFOLIO_NO() {
		return _rpowerShareHolders.getFOLIO_NO();
	}

	/**
	* Returns the primary key of this rpower share holders.
	*
	* @return the primary key of this rpower share holders
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _rpowerShareHolders.getPrimaryKey();
	}

	/**
	* Returns the shares of this rpower share holders.
	*
	* @return the shares of this rpower share holders
	*/
	@Override
	public java.lang.String getSHARES() {
		return _rpowerShareHolders.getSHARES();
	}

	@Override
	public java.lang.String toString() {
		return _rpowerShareHolders.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rpowerShareHolders.toXmlString();
	}

	/**
	* Returns the srno of this rpower share holders.
	*
	* @return the srno of this rpower share holders
	*/
	@Override
	public long getSRNO() {
		return _rpowerShareHolders.getSRNO();
	}

	@Override
	public rpower.shareholders.doc.model.RpowerShareHolders toEscapedModel() {
		return new RpowerShareHoldersWrapper(_rpowerShareHolders.toEscapedModel());
	}

	@Override
	public rpower.shareholders.doc.model.RpowerShareHolders toUnescapedModel() {
		return new RpowerShareHoldersWrapper(_rpowerShareHolders.toUnescapedModel());
	}

	@Override
	public void persist() {
		_rpowerShareHolders.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rpowerShareHolders.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rpowerShareHolders.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rpowerShareHolders.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rpowerShareHolders.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the folio_no of this rpower share holders.
	*
	* @param FOLIO_NO the folio_no of this rpower share holders
	*/
	@Override
	public void setFOLIO_NO(java.lang.String FOLIO_NO) {
		_rpowerShareHolders.setFOLIO_NO(FOLIO_NO);
	}

	@Override
	public void setNew(boolean n) {
		_rpowerShareHolders.setNew(n);
	}

	/**
	* Sets the primary key of this rpower share holders.
	*
	* @param primaryKey the primary key of this rpower share holders
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_rpowerShareHolders.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rpowerShareHolders.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the shares of this rpower share holders.
	*
	* @param SHARES the shares of this rpower share holders
	*/
	@Override
	public void setSHARES(java.lang.String SHARES) {
		_rpowerShareHolders.setSHARES(SHARES);
	}

	/**
	* Sets the srno of this rpower share holders.
	*
	* @param SRNO the srno of this rpower share holders
	*/
	@Override
	public void setSRNO(long SRNO) {
		_rpowerShareHolders.setSRNO(SRNO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RpowerShareHoldersWrapper)) {
			return false;
		}

		RpowerShareHoldersWrapper rpowerShareHoldersWrapper = (RpowerShareHoldersWrapper)obj;

		if (Objects.equals(_rpowerShareHolders,
					rpowerShareHoldersWrapper._rpowerShareHolders)) {
			return true;
		}

		return false;
	}

	@Override
	public RpowerShareHolders getWrappedModel() {
		return _rpowerShareHolders;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rpowerShareHolders.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rpowerShareHolders.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rpowerShareHolders.resetOriginalValues();
	}

	private final RpowerShareHolders _rpowerShareHolders;
}