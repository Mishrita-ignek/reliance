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

package com.rinfra.unpaidunclaimedshares.model;

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
 * This class is a wrapper for {@link unpaidUnclaimedDevidend}.
 * </p>
 *
 * @author Mukesh Patidar
 * @see unpaidUnclaimedDevidend
 * @generated
 */
@ProviderType
public class unpaidUnclaimedDevidendWrapper implements unpaidUnclaimedDevidend,
	ModelWrapper<unpaidUnclaimedDevidend> {
	public unpaidUnclaimedDevidendWrapper(
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		_unpaidUnclaimedDevidend = unpaidUnclaimedDevidend;
	}

	@Override
	public Class<?> getModelClass() {
		return unpaidUnclaimedDevidend.class;
	}

	@Override
	public String getModelClassName() {
		return unpaidUnclaimedDevidend.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SRNO", getSRNO());
		attributes.put("FOLIO_NO", getFOLIO_NO());
		attributes.put("NAME", getNAME());
		attributes.put("ADD1", getADD1());
		attributes.put("ADD2", getADD2());
		attributes.put("ADD3", getADD3());
		attributes.put("ADD4", getADD4());
		attributes.put("ADD5", getADD5());
		attributes.put("ADD6", getADD6());
		attributes.put("JT1", getJT1());
		attributes.put("JT2", getJT2());
		attributes.put("JT3", getJT3());
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

		String NAME = (String)attributes.get("NAME");

		if (NAME != null) {
			setNAME(NAME);
		}

		String ADD1 = (String)attributes.get("ADD1");

		if (ADD1 != null) {
			setADD1(ADD1);
		}

		String ADD2 = (String)attributes.get("ADD2");

		if (ADD2 != null) {
			setADD2(ADD2);
		}

		String ADD3 = (String)attributes.get("ADD3");

		if (ADD3 != null) {
			setADD3(ADD3);
		}

		String ADD4 = (String)attributes.get("ADD4");

		if (ADD4 != null) {
			setADD4(ADD4);
		}

		String ADD5 = (String)attributes.get("ADD5");

		if (ADD5 != null) {
			setADD5(ADD5);
		}

		String ADD6 = (String)attributes.get("ADD6");

		if (ADD6 != null) {
			setADD6(ADD6);
		}

		String JT1 = (String)attributes.get("JT1");

		if (JT1 != null) {
			setJT1(JT1);
		}

		String JT2 = (String)attributes.get("JT2");

		if (JT2 != null) {
			setJT2(JT2);
		}

		String JT3 = (String)attributes.get("JT3");

		if (JT3 != null) {
			setJT3(JT3);
		}

		String SHARES = (String)attributes.get("SHARES");

		if (SHARES != null) {
			setSHARES(SHARES);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _unpaidUnclaimedDevidend.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _unpaidUnclaimedDevidend.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _unpaidUnclaimedDevidend.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _unpaidUnclaimedDevidend.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend> toCacheModel() {
		return _unpaidUnclaimedDevidend.toCacheModel();
	}

	@Override
	public com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend toEscapedModel() {
		return new unpaidUnclaimedDevidendWrapper(_unpaidUnclaimedDevidend.toEscapedModel());
	}

	@Override
	public com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend toUnescapedModel() {
		return new unpaidUnclaimedDevidendWrapper(_unpaidUnclaimedDevidend.toUnescapedModel());
	}

	@Override
	public int compareTo(
		com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		return _unpaidUnclaimedDevidend.compareTo(unpaidUnclaimedDevidend);
	}

	@Override
	public int hashCode() {
		return _unpaidUnclaimedDevidend.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _unpaidUnclaimedDevidend.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new unpaidUnclaimedDevidendWrapper((unpaidUnclaimedDevidend)_unpaidUnclaimedDevidend.clone());
	}

	/**
	* Returns the add1 of this unpaid unclaimed devidend.
	*
	* @return the add1 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getADD1() {
		return _unpaidUnclaimedDevidend.getADD1();
	}

	/**
	* Returns the add2 of this unpaid unclaimed devidend.
	*
	* @return the add2 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getADD2() {
		return _unpaidUnclaimedDevidend.getADD2();
	}

	/**
	* Returns the add3 of this unpaid unclaimed devidend.
	*
	* @return the add3 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getADD3() {
		return _unpaidUnclaimedDevidend.getADD3();
	}

	/**
	* Returns the add4 of this unpaid unclaimed devidend.
	*
	* @return the add4 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getADD4() {
		return _unpaidUnclaimedDevidend.getADD4();
	}

	/**
	* Returns the add5 of this unpaid unclaimed devidend.
	*
	* @return the add5 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getADD5() {
		return _unpaidUnclaimedDevidend.getADD5();
	}

	/**
	* Returns the add6 of this unpaid unclaimed devidend.
	*
	* @return the add6 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getADD6() {
		return _unpaidUnclaimedDevidend.getADD6();
	}

	/**
	* Returns the folio_no of this unpaid unclaimed devidend.
	*
	* @return the folio_no of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getFOLIO_NO() {
		return _unpaidUnclaimedDevidend.getFOLIO_NO();
	}

	/**
	* Returns the jt1 of this unpaid unclaimed devidend.
	*
	* @return the jt1 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getJT1() {
		return _unpaidUnclaimedDevidend.getJT1();
	}

	/**
	* Returns the jt2 of this unpaid unclaimed devidend.
	*
	* @return the jt2 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getJT2() {
		return _unpaidUnclaimedDevidend.getJT2();
	}

	/**
	* Returns the jt3 of this unpaid unclaimed devidend.
	*
	* @return the jt3 of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getJT3() {
		return _unpaidUnclaimedDevidend.getJT3();
	}

	/**
	* Returns the name of this unpaid unclaimed devidend.
	*
	* @return the name of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getNAME() {
		return _unpaidUnclaimedDevidend.getNAME();
	}

	/**
	* Returns the shares of this unpaid unclaimed devidend.
	*
	* @return the shares of this unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getSHARES() {
		return _unpaidUnclaimedDevidend.getSHARES();
	}

	@Override
	public java.lang.String toString() {
		return _unpaidUnclaimedDevidend.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _unpaidUnclaimedDevidend.toXmlString();
	}

	/**
	* Returns the primary key of this unpaid unclaimed devidend.
	*
	* @return the primary key of this unpaid unclaimed devidend
	*/
	@Override
	public long getPrimaryKey() {
		return _unpaidUnclaimedDevidend.getPrimaryKey();
	}

	/**
	* Returns the srno of this unpaid unclaimed devidend.
	*
	* @return the srno of this unpaid unclaimed devidend
	*/
	@Override
	public long getSRNO() {
		return _unpaidUnclaimedDevidend.getSRNO();
	}

	@Override
	public void persist() {
		_unpaidUnclaimedDevidend.persist();
	}

	/**
	* Sets the add1 of this unpaid unclaimed devidend.
	*
	* @param ADD1 the add1 of this unpaid unclaimed devidend
	*/
	@Override
	public void setADD1(java.lang.String ADD1) {
		_unpaidUnclaimedDevidend.setADD1(ADD1);
	}

	/**
	* Sets the add2 of this unpaid unclaimed devidend.
	*
	* @param ADD2 the add2 of this unpaid unclaimed devidend
	*/
	@Override
	public void setADD2(java.lang.String ADD2) {
		_unpaidUnclaimedDevidend.setADD2(ADD2);
	}

	/**
	* Sets the add3 of this unpaid unclaimed devidend.
	*
	* @param ADD3 the add3 of this unpaid unclaimed devidend
	*/
	@Override
	public void setADD3(java.lang.String ADD3) {
		_unpaidUnclaimedDevidend.setADD3(ADD3);
	}

	/**
	* Sets the add4 of this unpaid unclaimed devidend.
	*
	* @param ADD4 the add4 of this unpaid unclaimed devidend
	*/
	@Override
	public void setADD4(java.lang.String ADD4) {
		_unpaidUnclaimedDevidend.setADD4(ADD4);
	}

	/**
	* Sets the add5 of this unpaid unclaimed devidend.
	*
	* @param ADD5 the add5 of this unpaid unclaimed devidend
	*/
	@Override
	public void setADD5(java.lang.String ADD5) {
		_unpaidUnclaimedDevidend.setADD5(ADD5);
	}

	/**
	* Sets the add6 of this unpaid unclaimed devidend.
	*
	* @param ADD6 the add6 of this unpaid unclaimed devidend
	*/
	@Override
	public void setADD6(java.lang.String ADD6) {
		_unpaidUnclaimedDevidend.setADD6(ADD6);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_unpaidUnclaimedDevidend.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_unpaidUnclaimedDevidend.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_unpaidUnclaimedDevidend.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_unpaidUnclaimedDevidend.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the folio_no of this unpaid unclaimed devidend.
	*
	* @param FOLIO_NO the folio_no of this unpaid unclaimed devidend
	*/
	@Override
	public void setFOLIO_NO(java.lang.String FOLIO_NO) {
		_unpaidUnclaimedDevidend.setFOLIO_NO(FOLIO_NO);
	}

	/**
	* Sets the jt1 of this unpaid unclaimed devidend.
	*
	* @param JT1 the jt1 of this unpaid unclaimed devidend
	*/
	@Override
	public void setJT1(java.lang.String JT1) {
		_unpaidUnclaimedDevidend.setJT1(JT1);
	}

	/**
	* Sets the jt2 of this unpaid unclaimed devidend.
	*
	* @param JT2 the jt2 of this unpaid unclaimed devidend
	*/
	@Override
	public void setJT2(java.lang.String JT2) {
		_unpaidUnclaimedDevidend.setJT2(JT2);
	}

	/**
	* Sets the jt3 of this unpaid unclaimed devidend.
	*
	* @param JT3 the jt3 of this unpaid unclaimed devidend
	*/
	@Override
	public void setJT3(java.lang.String JT3) {
		_unpaidUnclaimedDevidend.setJT3(JT3);
	}

	/**
	* Sets the name of this unpaid unclaimed devidend.
	*
	* @param NAME the name of this unpaid unclaimed devidend
	*/
	@Override
	public void setNAME(java.lang.String NAME) {
		_unpaidUnclaimedDevidend.setNAME(NAME);
	}

	@Override
	public void setNew(boolean n) {
		_unpaidUnclaimedDevidend.setNew(n);
	}

	/**
	* Sets the primary key of this unpaid unclaimed devidend.
	*
	* @param primaryKey the primary key of this unpaid unclaimed devidend
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_unpaidUnclaimedDevidend.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_unpaidUnclaimedDevidend.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the shares of this unpaid unclaimed devidend.
	*
	* @param SHARES the shares of this unpaid unclaimed devidend
	*/
	@Override
	public void setSHARES(java.lang.String SHARES) {
		_unpaidUnclaimedDevidend.setSHARES(SHARES);
	}

	/**
	* Sets the srno of this unpaid unclaimed devidend.
	*
	* @param SRNO the srno of this unpaid unclaimed devidend
	*/
	@Override
	public void setSRNO(long SRNO) {
		_unpaidUnclaimedDevidend.setSRNO(SRNO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof unpaidUnclaimedDevidendWrapper)) {
			return false;
		}

		unpaidUnclaimedDevidendWrapper unpaidUnclaimedDevidendWrapper = (unpaidUnclaimedDevidendWrapper)obj;

		if (Objects.equals(_unpaidUnclaimedDevidend,
					unpaidUnclaimedDevidendWrapper._unpaidUnclaimedDevidend)) {
			return true;
		}

		return false;
	}

	@Override
	public unpaidUnclaimedDevidend getWrappedModel() {
		return _unpaidUnclaimedDevidend;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _unpaidUnclaimedDevidend.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _unpaidUnclaimedDevidend.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_unpaidUnclaimedDevidend.resetOriginalValues();
	}

	private final unpaidUnclaimedDevidend _unpaidUnclaimedDevidend;
}