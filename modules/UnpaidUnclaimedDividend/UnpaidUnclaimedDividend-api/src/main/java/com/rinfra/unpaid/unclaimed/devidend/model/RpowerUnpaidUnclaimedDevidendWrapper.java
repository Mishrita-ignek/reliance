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

package com.rinfra.unpaid.unclaimed.devidend.model;

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
 * This class is a wrapper for {@link RpowerUnpaidUnclaimedDevidend}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerUnpaidUnclaimedDevidend
 * @generated
 */
@ProviderType
public class RpowerUnpaidUnclaimedDevidendWrapper
	implements RpowerUnpaidUnclaimedDevidend,
		ModelWrapper<RpowerUnpaidUnclaimedDevidend> {
	public RpowerUnpaidUnclaimedDevidendWrapper(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		_rpowerUnpaidUnclaimedDevidend = rpowerUnpaidUnclaimedDevidend;
	}

	@Override
	public Class<?> getModelClass() {
		return RpowerUnpaidUnclaimedDevidend.class;
	}

	@Override
	public String getModelClassName() {
		return RpowerUnpaidUnclaimedDevidend.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SRNO", getSRNO());
		attributes.put("FIRST_NAME", getFIRST_NAME());
		attributes.put("MIDDLE_NAME", getMIDDLE_NAME());
		attributes.put("LAST_NAME", getLAST_NAME());
		attributes.put("FATHER_HUSBAND_FIRST_NAME",
			getFATHER_HUSBAND_FIRST_NAME());
		attributes.put("FATHER_HUSBAND_MIDDLE_NAME",
			getFATHER_HUSBAND_MIDDLE_NAME());
		attributes.put("FATHER_HUSBAND_LAST_NAME", getFATHER_HUSBAND_LAST_NAME());
		attributes.put("ADDRESS", getADDRESS());
		attributes.put("COUNTRY", getCOUNTRY());
		attributes.put("STATE", getSTATE());
		attributes.put("DISTRICT", getDISTRICT());
		attributes.put("PIN_CODE", getPIN_CODE());
		attributes.put("FOLIO_NO_OF_ITIES", getFOLIO_NO_OF_ITIES());
		attributes.put("INVESTMENT_TYPE", getINVESTMENT_TYPE());
		attributes.put("AMOUNT_DUE_IN_RS", getAMOUNT_DUE_IN_RS());
		attributes.put("PROPOSED_DATE_TRANSFER_IPEF",
			getPROPOSED_DATE_TRANSFER_IPEF());
		attributes.put("CREATEDATE", getCREATEDATE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SRNO = (Long)attributes.get("SRNO");

		if (SRNO != null) {
			setSRNO(SRNO);
		}

		String FIRST_NAME = (String)attributes.get("FIRST_NAME");

		if (FIRST_NAME != null) {
			setFIRST_NAME(FIRST_NAME);
		}

		String MIDDLE_NAME = (String)attributes.get("MIDDLE_NAME");

		if (MIDDLE_NAME != null) {
			setMIDDLE_NAME(MIDDLE_NAME);
		}

		String LAST_NAME = (String)attributes.get("LAST_NAME");

		if (LAST_NAME != null) {
			setLAST_NAME(LAST_NAME);
		}

		String FATHER_HUSBAND_FIRST_NAME = (String)attributes.get(
				"FATHER_HUSBAND_FIRST_NAME");

		if (FATHER_HUSBAND_FIRST_NAME != null) {
			setFATHER_HUSBAND_FIRST_NAME(FATHER_HUSBAND_FIRST_NAME);
		}

		String FATHER_HUSBAND_MIDDLE_NAME = (String)attributes.get(
				"FATHER_HUSBAND_MIDDLE_NAME");

		if (FATHER_HUSBAND_MIDDLE_NAME != null) {
			setFATHER_HUSBAND_MIDDLE_NAME(FATHER_HUSBAND_MIDDLE_NAME);
		}

		String FATHER_HUSBAND_LAST_NAME = (String)attributes.get(
				"FATHER_HUSBAND_LAST_NAME");

		if (FATHER_HUSBAND_LAST_NAME != null) {
			setFATHER_HUSBAND_LAST_NAME(FATHER_HUSBAND_LAST_NAME);
		}

		String ADDRESS = (String)attributes.get("ADDRESS");

		if (ADDRESS != null) {
			setADDRESS(ADDRESS);
		}

		String COUNTRY = (String)attributes.get("COUNTRY");

		if (COUNTRY != null) {
			setCOUNTRY(COUNTRY);
		}

		String STATE = (String)attributes.get("STATE");

		if (STATE != null) {
			setSTATE(STATE);
		}

		String DISTRICT = (String)attributes.get("DISTRICT");

		if (DISTRICT != null) {
			setDISTRICT(DISTRICT);
		}

		Long PIN_CODE = (Long)attributes.get("PIN_CODE");

		if (PIN_CODE != null) {
			setPIN_CODE(PIN_CODE);
		}

		String FOLIO_NO_OF_ITIES = (String)attributes.get("FOLIO_NO_OF_ITIES");

		if (FOLIO_NO_OF_ITIES != null) {
			setFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
		}

		String INVESTMENT_TYPE = (String)attributes.get("INVESTMENT_TYPE");

		if (INVESTMENT_TYPE != null) {
			setINVESTMENT_TYPE(INVESTMENT_TYPE);
		}

		Double AMOUNT_DUE_IN_RS = (Double)attributes.get("AMOUNT_DUE_IN_RS");

		if (AMOUNT_DUE_IN_RS != null) {
			setAMOUNT_DUE_IN_RS(AMOUNT_DUE_IN_RS);
		}

		Date PROPOSED_DATE_TRANSFER_IPEF = (Date)attributes.get(
				"PROPOSED_DATE_TRANSFER_IPEF");

		if (PROPOSED_DATE_TRANSFER_IPEF != null) {
			setPROPOSED_DATE_TRANSFER_IPEF(PROPOSED_DATE_TRANSFER_IPEF);
		}

		Date CREATEDATE = (Date)attributes.get("CREATEDATE");

		if (CREATEDATE != null) {
			setCREATEDATE(CREATEDATE);
		}
	}

	@Override
	public RpowerUnpaidUnclaimedDevidend toEscapedModel() {
		return new RpowerUnpaidUnclaimedDevidendWrapper(_rpowerUnpaidUnclaimedDevidend.toEscapedModel());
	}

	@Override
	public RpowerUnpaidUnclaimedDevidend toUnescapedModel() {
		return new RpowerUnpaidUnclaimedDevidendWrapper(_rpowerUnpaidUnclaimedDevidend.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _rpowerUnpaidUnclaimedDevidend.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _rpowerUnpaidUnclaimedDevidend.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _rpowerUnpaidUnclaimedDevidend.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _rpowerUnpaidUnclaimedDevidend.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RpowerUnpaidUnclaimedDevidend> toCacheModel() {
		return _rpowerUnpaidUnclaimedDevidend.toCacheModel();
	}

	/**
	* Returns the amount_due_in_rs of this rpower unpaid unclaimed devidend.
	*
	* @return the amount_due_in_rs of this rpower unpaid unclaimed devidend
	*/
	@Override
	public double getAMOUNT_DUE_IN_RS() {
		return _rpowerUnpaidUnclaimedDevidend.getAMOUNT_DUE_IN_RS();
	}

	@Override
	public int compareTo(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return _rpowerUnpaidUnclaimedDevidend.compareTo(rpowerUnpaidUnclaimedDevidend);
	}

	@Override
	public int hashCode() {
		return _rpowerUnpaidUnclaimedDevidend.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _rpowerUnpaidUnclaimedDevidend.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RpowerUnpaidUnclaimedDevidendWrapper((RpowerUnpaidUnclaimedDevidend)_rpowerUnpaidUnclaimedDevidend.clone());
	}

	/**
	* Returns the address of this rpower unpaid unclaimed devidend.
	*
	* @return the address of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getADDRESS() {
		return _rpowerUnpaidUnclaimedDevidend.getADDRESS();
	}

	/**
	* Returns the country of this rpower unpaid unclaimed devidend.
	*
	* @return the country of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getCOUNTRY() {
		return _rpowerUnpaidUnclaimedDevidend.getCOUNTRY();
	}

	/**
	* Returns the district of this rpower unpaid unclaimed devidend.
	*
	* @return the district of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getDISTRICT() {
		return _rpowerUnpaidUnclaimedDevidend.getDISTRICT();
	}

	/**
	* Returns the father_husband_first_name of this rpower unpaid unclaimed devidend.
	*
	* @return the father_husband_first_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getFATHER_HUSBAND_FIRST_NAME() {
		return _rpowerUnpaidUnclaimedDevidend.getFATHER_HUSBAND_FIRST_NAME();
	}

	/**
	* Returns the father_husband_last_name of this rpower unpaid unclaimed devidend.
	*
	* @return the father_husband_last_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getFATHER_HUSBAND_LAST_NAME() {
		return _rpowerUnpaidUnclaimedDevidend.getFATHER_HUSBAND_LAST_NAME();
	}

	/**
	* Returns the father_husband_middle_name of this rpower unpaid unclaimed devidend.
	*
	* @return the father_husband_middle_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getFATHER_HUSBAND_MIDDLE_NAME() {
		return _rpowerUnpaidUnclaimedDevidend.getFATHER_HUSBAND_MIDDLE_NAME();
	}

	/**
	* Returns the first_name of this rpower unpaid unclaimed devidend.
	*
	* @return the first_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getFIRST_NAME() {
		return _rpowerUnpaidUnclaimedDevidend.getFIRST_NAME();
	}

	/**
	* Returns the folio_no_of_ities of this rpower unpaid unclaimed devidend.
	*
	* @return the folio_no_of_ities of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getFOLIO_NO_OF_ITIES() {
		return _rpowerUnpaidUnclaimedDevidend.getFOLIO_NO_OF_ITIES();
	}

	/**
	* Returns the investment_type of this rpower unpaid unclaimed devidend.
	*
	* @return the investment_type of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getINVESTMENT_TYPE() {
		return _rpowerUnpaidUnclaimedDevidend.getINVESTMENT_TYPE();
	}

	/**
	* Returns the last_name of this rpower unpaid unclaimed devidend.
	*
	* @return the last_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getLAST_NAME() {
		return _rpowerUnpaidUnclaimedDevidend.getLAST_NAME();
	}

	/**
	* Returns the middle_name of this rpower unpaid unclaimed devidend.
	*
	* @return the middle_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getMIDDLE_NAME() {
		return _rpowerUnpaidUnclaimedDevidend.getMIDDLE_NAME();
	}

	/**
	* Returns the state of this rpower unpaid unclaimed devidend.
	*
	* @return the state of this rpower unpaid unclaimed devidend
	*/
	@Override
	public java.lang.String getSTATE() {
		return _rpowerUnpaidUnclaimedDevidend.getSTATE();
	}

	@Override
	public java.lang.String toString() {
		return _rpowerUnpaidUnclaimedDevidend.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _rpowerUnpaidUnclaimedDevidend.toXmlString();
	}

	/**
	* Returns the createdate of this rpower unpaid unclaimed devidend.
	*
	* @return the createdate of this rpower unpaid unclaimed devidend
	*/
	@Override
	public Date getCREATEDATE() {
		return _rpowerUnpaidUnclaimedDevidend.getCREATEDATE();
	}

	/**
	* Returns the proposed_date_transfer_ipef of this rpower unpaid unclaimed devidend.
	*
	* @return the proposed_date_transfer_ipef of this rpower unpaid unclaimed devidend
	*/
	@Override
	public Date getPROPOSED_DATE_TRANSFER_IPEF() {
		return _rpowerUnpaidUnclaimedDevidend.getPROPOSED_DATE_TRANSFER_IPEF();
	}

	/**
	* Returns the pin_code of this rpower unpaid unclaimed devidend.
	*
	* @return the pin_code of this rpower unpaid unclaimed devidend
	*/
	@Override
	public long getPIN_CODE() {
		return _rpowerUnpaidUnclaimedDevidend.getPIN_CODE();
	}

	/**
	* Returns the primary key of this rpower unpaid unclaimed devidend.
	*
	* @return the primary key of this rpower unpaid unclaimed devidend
	*/
	@Override
	public long getPrimaryKey() {
		return _rpowerUnpaidUnclaimedDevidend.getPrimaryKey();
	}

	/**
	* Returns the srno of this rpower unpaid unclaimed devidend.
	*
	* @return the srno of this rpower unpaid unclaimed devidend
	*/
	@Override
	public long getSRNO() {
		return _rpowerUnpaidUnclaimedDevidend.getSRNO();
	}

	@Override
	public void persist() {
		_rpowerUnpaidUnclaimedDevidend.persist();
	}

	/**
	* Sets the address of this rpower unpaid unclaimed devidend.
	*
	* @param ADDRESS the address of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setADDRESS(java.lang.String ADDRESS) {
		_rpowerUnpaidUnclaimedDevidend.setADDRESS(ADDRESS);
	}

	/**
	* Sets the amount_due_in_rs of this rpower unpaid unclaimed devidend.
	*
	* @param AMOUNT_DUE_IN_RS the amount_due_in_rs of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setAMOUNT_DUE_IN_RS(double AMOUNT_DUE_IN_RS) {
		_rpowerUnpaidUnclaimedDevidend.setAMOUNT_DUE_IN_RS(AMOUNT_DUE_IN_RS);
	}

	/**
	* Sets the country of this rpower unpaid unclaimed devidend.
	*
	* @param COUNTRY the country of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setCOUNTRY(java.lang.String COUNTRY) {
		_rpowerUnpaidUnclaimedDevidend.setCOUNTRY(COUNTRY);
	}

	/**
	* Sets the createdate of this rpower unpaid unclaimed devidend.
	*
	* @param CREATEDATE the createdate of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setCREATEDATE(Date CREATEDATE) {
		_rpowerUnpaidUnclaimedDevidend.setCREATEDATE(CREATEDATE);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_rpowerUnpaidUnclaimedDevidend.setCachedModel(cachedModel);
	}

	/**
	* Sets the district of this rpower unpaid unclaimed devidend.
	*
	* @param DISTRICT the district of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setDISTRICT(java.lang.String DISTRICT) {
		_rpowerUnpaidUnclaimedDevidend.setDISTRICT(DISTRICT);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_rpowerUnpaidUnclaimedDevidend.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_rpowerUnpaidUnclaimedDevidend.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_rpowerUnpaidUnclaimedDevidend.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the father_husband_first_name of this rpower unpaid unclaimed devidend.
	*
	* @param FATHER_HUSBAND_FIRST_NAME the father_husband_first_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setFATHER_HUSBAND_FIRST_NAME(
		java.lang.String FATHER_HUSBAND_FIRST_NAME) {
		_rpowerUnpaidUnclaimedDevidend.setFATHER_HUSBAND_FIRST_NAME(FATHER_HUSBAND_FIRST_NAME);
	}

	/**
	* Sets the father_husband_last_name of this rpower unpaid unclaimed devidend.
	*
	* @param FATHER_HUSBAND_LAST_NAME the father_husband_last_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setFATHER_HUSBAND_LAST_NAME(
		java.lang.String FATHER_HUSBAND_LAST_NAME) {
		_rpowerUnpaidUnclaimedDevidend.setFATHER_HUSBAND_LAST_NAME(FATHER_HUSBAND_LAST_NAME);
	}

	/**
	* Sets the father_husband_middle_name of this rpower unpaid unclaimed devidend.
	*
	* @param FATHER_HUSBAND_MIDDLE_NAME the father_husband_middle_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setFATHER_HUSBAND_MIDDLE_NAME(
		java.lang.String FATHER_HUSBAND_MIDDLE_NAME) {
		_rpowerUnpaidUnclaimedDevidend.setFATHER_HUSBAND_MIDDLE_NAME(FATHER_HUSBAND_MIDDLE_NAME);
	}

	/**
	* Sets the first_name of this rpower unpaid unclaimed devidend.
	*
	* @param FIRST_NAME the first_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setFIRST_NAME(java.lang.String FIRST_NAME) {
		_rpowerUnpaidUnclaimedDevidend.setFIRST_NAME(FIRST_NAME);
	}

	/**
	* Sets the folio_no_of_ities of this rpower unpaid unclaimed devidend.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setFOLIO_NO_OF_ITIES(java.lang.String FOLIO_NO_OF_ITIES) {
		_rpowerUnpaidUnclaimedDevidend.setFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
	}

	/**
	* Sets the investment_type of this rpower unpaid unclaimed devidend.
	*
	* @param INVESTMENT_TYPE the investment_type of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setINVESTMENT_TYPE(java.lang.String INVESTMENT_TYPE) {
		_rpowerUnpaidUnclaimedDevidend.setINVESTMENT_TYPE(INVESTMENT_TYPE);
	}

	/**
	* Sets the last_name of this rpower unpaid unclaimed devidend.
	*
	* @param LAST_NAME the last_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setLAST_NAME(java.lang.String LAST_NAME) {
		_rpowerUnpaidUnclaimedDevidend.setLAST_NAME(LAST_NAME);
	}

	/**
	* Sets the middle_name of this rpower unpaid unclaimed devidend.
	*
	* @param MIDDLE_NAME the middle_name of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setMIDDLE_NAME(java.lang.String MIDDLE_NAME) {
		_rpowerUnpaidUnclaimedDevidend.setMIDDLE_NAME(MIDDLE_NAME);
	}

	@Override
	public void setNew(boolean n) {
		_rpowerUnpaidUnclaimedDevidend.setNew(n);
	}

	/**
	* Sets the pin_code of this rpower unpaid unclaimed devidend.
	*
	* @param PIN_CODE the pin_code of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setPIN_CODE(long PIN_CODE) {
		_rpowerUnpaidUnclaimedDevidend.setPIN_CODE(PIN_CODE);
	}

	/**
	* Sets the proposed_date_transfer_ipef of this rpower unpaid unclaimed devidend.
	*
	* @param PROPOSED_DATE_TRANSFER_IPEF the proposed_date_transfer_ipef of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setPROPOSED_DATE_TRANSFER_IPEF(Date PROPOSED_DATE_TRANSFER_IPEF) {
		_rpowerUnpaidUnclaimedDevidend.setPROPOSED_DATE_TRANSFER_IPEF(PROPOSED_DATE_TRANSFER_IPEF);
	}

	/**
	* Sets the primary key of this rpower unpaid unclaimed devidend.
	*
	* @param primaryKey the primary key of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_rpowerUnpaidUnclaimedDevidend.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_rpowerUnpaidUnclaimedDevidend.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the srno of this rpower unpaid unclaimed devidend.
	*
	* @param SRNO the srno of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setSRNO(long SRNO) {
		_rpowerUnpaidUnclaimedDevidend.setSRNO(SRNO);
	}

	/**
	* Sets the state of this rpower unpaid unclaimed devidend.
	*
	* @param STATE the state of this rpower unpaid unclaimed devidend
	*/
	@Override
	public void setSTATE(java.lang.String STATE) {
		_rpowerUnpaidUnclaimedDevidend.setSTATE(STATE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RpowerUnpaidUnclaimedDevidendWrapper)) {
			return false;
		}

		RpowerUnpaidUnclaimedDevidendWrapper rpowerUnpaidUnclaimedDevidendWrapper =
			(RpowerUnpaidUnclaimedDevidendWrapper)obj;

		if (Objects.equals(_rpowerUnpaidUnclaimedDevidend,
					rpowerUnpaidUnclaimedDevidendWrapper._rpowerUnpaidUnclaimedDevidend)) {
			return true;
		}

		return false;
	}

	@Override
	public RpowerUnpaidUnclaimedDevidend getWrappedModel() {
		return _rpowerUnpaidUnclaimedDevidend;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _rpowerUnpaidUnclaimedDevidend.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _rpowerUnpaidUnclaimedDevidend.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_rpowerUnpaidUnclaimedDevidend.resetOriginalValues();
	}

	private final RpowerUnpaidUnclaimedDevidend _rpowerUnpaidUnclaimedDevidend;
}