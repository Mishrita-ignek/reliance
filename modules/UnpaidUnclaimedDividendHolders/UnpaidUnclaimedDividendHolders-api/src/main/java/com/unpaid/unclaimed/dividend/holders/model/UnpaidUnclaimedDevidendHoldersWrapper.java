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

package com.unpaid.unclaimed.dividend.holders.model;

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
 * This class is a wrapper for {@link UnpaidUnclaimedDevidendHolders}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendHolders
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendHoldersWrapper
	implements UnpaidUnclaimedDevidendHolders,
		ModelWrapper<UnpaidUnclaimedDevidendHolders> {
	public UnpaidUnclaimedDevidendHoldersWrapper(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		_unpaidUnclaimedDevidendHolders = unpaidUnclaimedDevidendHolders;
	}

	@Override
	public Class<?> getModelClass() {
		return UnpaidUnclaimedDevidendHolders.class;
	}

	@Override
	public String getModelClassName() {
		return UnpaidUnclaimedDevidendHolders.class.getName();
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
	public UnpaidUnclaimedDevidendHolders toEscapedModel() {
		return new UnpaidUnclaimedDevidendHoldersWrapper(_unpaidUnclaimedDevidendHolders.toEscapedModel());
	}

	@Override
	public UnpaidUnclaimedDevidendHolders toUnescapedModel() {
		return new UnpaidUnclaimedDevidendHoldersWrapper(_unpaidUnclaimedDevidendHolders.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _unpaidUnclaimedDevidendHolders.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _unpaidUnclaimedDevidendHolders.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _unpaidUnclaimedDevidendHolders.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _unpaidUnclaimedDevidendHolders.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<UnpaidUnclaimedDevidendHolders> toCacheModel() {
		return _unpaidUnclaimedDevidendHolders.toCacheModel();
	}

	/**
	* Returns the amount_due_in_rs of this unpaid unclaimed devidend holders.
	*
	* @return the amount_due_in_rs of this unpaid unclaimed devidend holders
	*/
	@Override
	public double getAMOUNT_DUE_IN_RS() {
		return _unpaidUnclaimedDevidendHolders.getAMOUNT_DUE_IN_RS();
	}

	@Override
	public int compareTo(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return _unpaidUnclaimedDevidendHolders.compareTo(unpaidUnclaimedDevidendHolders);
	}

	@Override
	public int hashCode() {
		return _unpaidUnclaimedDevidendHolders.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _unpaidUnclaimedDevidendHolders.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new UnpaidUnclaimedDevidendHoldersWrapper((UnpaidUnclaimedDevidendHolders)_unpaidUnclaimedDevidendHolders.clone());
	}

	/**
	* Returns the address of this unpaid unclaimed devidend holders.
	*
	* @return the address of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getADDRESS() {
		return _unpaidUnclaimedDevidendHolders.getADDRESS();
	}

	/**
	* Returns the country of this unpaid unclaimed devidend holders.
	*
	* @return the country of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getCOUNTRY() {
		return _unpaidUnclaimedDevidendHolders.getCOUNTRY();
	}

	/**
	* Returns the district of this unpaid unclaimed devidend holders.
	*
	* @return the district of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getDISTRICT() {
		return _unpaidUnclaimedDevidendHolders.getDISTRICT();
	}

	/**
	* Returns the father_husband_first_name of this unpaid unclaimed devidend holders.
	*
	* @return the father_husband_first_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getFATHER_HUSBAND_FIRST_NAME() {
		return _unpaidUnclaimedDevidendHolders.getFATHER_HUSBAND_FIRST_NAME();
	}

	/**
	* Returns the father_husband_last_name of this unpaid unclaimed devidend holders.
	*
	* @return the father_husband_last_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getFATHER_HUSBAND_LAST_NAME() {
		return _unpaidUnclaimedDevidendHolders.getFATHER_HUSBAND_LAST_NAME();
	}

	/**
	* Returns the father_husband_middle_name of this unpaid unclaimed devidend holders.
	*
	* @return the father_husband_middle_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getFATHER_HUSBAND_MIDDLE_NAME() {
		return _unpaidUnclaimedDevidendHolders.getFATHER_HUSBAND_MIDDLE_NAME();
	}

	/**
	* Returns the first_name of this unpaid unclaimed devidend holders.
	*
	* @return the first_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getFIRST_NAME() {
		return _unpaidUnclaimedDevidendHolders.getFIRST_NAME();
	}

	/**
	* Returns the folio_no_of_ities of this unpaid unclaimed devidend holders.
	*
	* @return the folio_no_of_ities of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getFOLIO_NO_OF_ITIES() {
		return _unpaidUnclaimedDevidendHolders.getFOLIO_NO_OF_ITIES();
	}

	/**
	* Returns the investment_type of this unpaid unclaimed devidend holders.
	*
	* @return the investment_type of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getINVESTMENT_TYPE() {
		return _unpaidUnclaimedDevidendHolders.getINVESTMENT_TYPE();
	}

	/**
	* Returns the last_name of this unpaid unclaimed devidend holders.
	*
	* @return the last_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getLAST_NAME() {
		return _unpaidUnclaimedDevidendHolders.getLAST_NAME();
	}

	/**
	* Returns the middle_name of this unpaid unclaimed devidend holders.
	*
	* @return the middle_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getMIDDLE_NAME() {
		return _unpaidUnclaimedDevidendHolders.getMIDDLE_NAME();
	}

	/**
	* Returns the state of this unpaid unclaimed devidend holders.
	*
	* @return the state of this unpaid unclaimed devidend holders
	*/
	@Override
	public java.lang.String getSTATE() {
		return _unpaidUnclaimedDevidendHolders.getSTATE();
	}

	@Override
	public java.lang.String toString() {
		return _unpaidUnclaimedDevidendHolders.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _unpaidUnclaimedDevidendHolders.toXmlString();
	}

	/**
	* Returns the createdate of this unpaid unclaimed devidend holders.
	*
	* @return the createdate of this unpaid unclaimed devidend holders
	*/
	@Override
	public Date getCREATEDATE() {
		return _unpaidUnclaimedDevidendHolders.getCREATEDATE();
	}

	/**
	* Returns the proposed_date_transfer_ipef of this unpaid unclaimed devidend holders.
	*
	* @return the proposed_date_transfer_ipef of this unpaid unclaimed devidend holders
	*/
	@Override
	public Date getPROPOSED_DATE_TRANSFER_IPEF() {
		return _unpaidUnclaimedDevidendHolders.getPROPOSED_DATE_TRANSFER_IPEF();
	}

	/**
	* Returns the pin_code of this unpaid unclaimed devidend holders.
	*
	* @return the pin_code of this unpaid unclaimed devidend holders
	*/
	@Override
	public long getPIN_CODE() {
		return _unpaidUnclaimedDevidendHolders.getPIN_CODE();
	}

	/**
	* Returns the primary key of this unpaid unclaimed devidend holders.
	*
	* @return the primary key of this unpaid unclaimed devidend holders
	*/
	@Override
	public long getPrimaryKey() {
		return _unpaidUnclaimedDevidendHolders.getPrimaryKey();
	}

	/**
	* Returns the srno of this unpaid unclaimed devidend holders.
	*
	* @return the srno of this unpaid unclaimed devidend holders
	*/
	@Override
	public long getSRNO() {
		return _unpaidUnclaimedDevidendHolders.getSRNO();
	}

	@Override
	public void persist() {
		_unpaidUnclaimedDevidendHolders.persist();
	}

	/**
	* Sets the address of this unpaid unclaimed devidend holders.
	*
	* @param ADDRESS the address of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setADDRESS(java.lang.String ADDRESS) {
		_unpaidUnclaimedDevidendHolders.setADDRESS(ADDRESS);
	}

	/**
	* Sets the amount_due_in_rs of this unpaid unclaimed devidend holders.
	*
	* @param AMOUNT_DUE_IN_RS the amount_due_in_rs of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setAMOUNT_DUE_IN_RS(double AMOUNT_DUE_IN_RS) {
		_unpaidUnclaimedDevidendHolders.setAMOUNT_DUE_IN_RS(AMOUNT_DUE_IN_RS);
	}

	/**
	* Sets the country of this unpaid unclaimed devidend holders.
	*
	* @param COUNTRY the country of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setCOUNTRY(java.lang.String COUNTRY) {
		_unpaidUnclaimedDevidendHolders.setCOUNTRY(COUNTRY);
	}

	/**
	* Sets the createdate of this unpaid unclaimed devidend holders.
	*
	* @param CREATEDATE the createdate of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setCREATEDATE(Date CREATEDATE) {
		_unpaidUnclaimedDevidendHolders.setCREATEDATE(CREATEDATE);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_unpaidUnclaimedDevidendHolders.setCachedModel(cachedModel);
	}

	/**
	* Sets the district of this unpaid unclaimed devidend holders.
	*
	* @param DISTRICT the district of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setDISTRICT(java.lang.String DISTRICT) {
		_unpaidUnclaimedDevidendHolders.setDISTRICT(DISTRICT);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_unpaidUnclaimedDevidendHolders.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_unpaidUnclaimedDevidendHolders.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_unpaidUnclaimedDevidendHolders.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the father_husband_first_name of this unpaid unclaimed devidend holders.
	*
	* @param FATHER_HUSBAND_FIRST_NAME the father_husband_first_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setFATHER_HUSBAND_FIRST_NAME(
		java.lang.String FATHER_HUSBAND_FIRST_NAME) {
		_unpaidUnclaimedDevidendHolders.setFATHER_HUSBAND_FIRST_NAME(FATHER_HUSBAND_FIRST_NAME);
	}

	/**
	* Sets the father_husband_last_name of this unpaid unclaimed devidend holders.
	*
	* @param FATHER_HUSBAND_LAST_NAME the father_husband_last_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setFATHER_HUSBAND_LAST_NAME(
		java.lang.String FATHER_HUSBAND_LAST_NAME) {
		_unpaidUnclaimedDevidendHolders.setFATHER_HUSBAND_LAST_NAME(FATHER_HUSBAND_LAST_NAME);
	}

	/**
	* Sets the father_husband_middle_name of this unpaid unclaimed devidend holders.
	*
	* @param FATHER_HUSBAND_MIDDLE_NAME the father_husband_middle_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setFATHER_HUSBAND_MIDDLE_NAME(
		java.lang.String FATHER_HUSBAND_MIDDLE_NAME) {
		_unpaidUnclaimedDevidendHolders.setFATHER_HUSBAND_MIDDLE_NAME(FATHER_HUSBAND_MIDDLE_NAME);
	}

	/**
	* Sets the first_name of this unpaid unclaimed devidend holders.
	*
	* @param FIRST_NAME the first_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setFIRST_NAME(java.lang.String FIRST_NAME) {
		_unpaidUnclaimedDevidendHolders.setFIRST_NAME(FIRST_NAME);
	}

	/**
	* Sets the folio_no_of_ities of this unpaid unclaimed devidend holders.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setFOLIO_NO_OF_ITIES(java.lang.String FOLIO_NO_OF_ITIES) {
		_unpaidUnclaimedDevidendHolders.setFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
	}

	/**
	* Sets the investment_type of this unpaid unclaimed devidend holders.
	*
	* @param INVESTMENT_TYPE the investment_type of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setINVESTMENT_TYPE(java.lang.String INVESTMENT_TYPE) {
		_unpaidUnclaimedDevidendHolders.setINVESTMENT_TYPE(INVESTMENT_TYPE);
	}

	/**
	* Sets the last_name of this unpaid unclaimed devidend holders.
	*
	* @param LAST_NAME the last_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setLAST_NAME(java.lang.String LAST_NAME) {
		_unpaidUnclaimedDevidendHolders.setLAST_NAME(LAST_NAME);
	}

	/**
	* Sets the middle_name of this unpaid unclaimed devidend holders.
	*
	* @param MIDDLE_NAME the middle_name of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setMIDDLE_NAME(java.lang.String MIDDLE_NAME) {
		_unpaidUnclaimedDevidendHolders.setMIDDLE_NAME(MIDDLE_NAME);
	}

	@Override
	public void setNew(boolean n) {
		_unpaidUnclaimedDevidendHolders.setNew(n);
	}

	/**
	* Sets the pin_code of this unpaid unclaimed devidend holders.
	*
	* @param PIN_CODE the pin_code of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setPIN_CODE(long PIN_CODE) {
		_unpaidUnclaimedDevidendHolders.setPIN_CODE(PIN_CODE);
	}

	/**
	* Sets the proposed_date_transfer_ipef of this unpaid unclaimed devidend holders.
	*
	* @param PROPOSED_DATE_TRANSFER_IPEF the proposed_date_transfer_ipef of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setPROPOSED_DATE_TRANSFER_IPEF(Date PROPOSED_DATE_TRANSFER_IPEF) {
		_unpaidUnclaimedDevidendHolders.setPROPOSED_DATE_TRANSFER_IPEF(PROPOSED_DATE_TRANSFER_IPEF);
	}

	/**
	* Sets the primary key of this unpaid unclaimed devidend holders.
	*
	* @param primaryKey the primary key of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_unpaidUnclaimedDevidendHolders.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_unpaidUnclaimedDevidendHolders.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the srno of this unpaid unclaimed devidend holders.
	*
	* @param SRNO the srno of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setSRNO(long SRNO) {
		_unpaidUnclaimedDevidendHolders.setSRNO(SRNO);
	}

	/**
	* Sets the state of this unpaid unclaimed devidend holders.
	*
	* @param STATE the state of this unpaid unclaimed devidend holders
	*/
	@Override
	public void setSTATE(java.lang.String STATE) {
		_unpaidUnclaimedDevidendHolders.setSTATE(STATE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UnpaidUnclaimedDevidendHoldersWrapper)) {
			return false;
		}

		UnpaidUnclaimedDevidendHoldersWrapper unpaidUnclaimedDevidendHoldersWrapper =
			(UnpaidUnclaimedDevidendHoldersWrapper)obj;

		if (Objects.equals(_unpaidUnclaimedDevidendHolders,
					unpaidUnclaimedDevidendHoldersWrapper._unpaidUnclaimedDevidendHolders)) {
			return true;
		}

		return false;
	}

	@Override
	public UnpaidUnclaimedDevidendHolders getWrappedModel() {
		return _unpaidUnclaimedDevidendHolders;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _unpaidUnclaimedDevidendHolders.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _unpaidUnclaimedDevidendHolders.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_unpaidUnclaimedDevidendHolders.resetOriginalValues();
	}

	private final UnpaidUnclaimedDevidendHolders _unpaidUnclaimedDevidendHolders;
}