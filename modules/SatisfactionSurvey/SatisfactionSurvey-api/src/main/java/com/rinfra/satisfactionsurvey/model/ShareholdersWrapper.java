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

package com.rinfra.satisfactionsurvey.model;

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
 * This class is a wrapper for {@link Shareholders}.
 * </p>
 *
 * @author Mukesh
 * @see Shareholders
 * @generated
 */
@ProviderType
public class ShareholdersWrapper implements Shareholders,
	ModelWrapper<Shareholders> {
	public ShareholdersWrapper(Shareholders shareholders) {
		_shareholders = shareholders;
	}

	@Override
	public Class<?> getModelClass() {
		return Shareholders.class;
	}

	@Override
	public String getModelClassName() {
		return Shareholders.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SHAREHOLDERSID", getSHAREHOLDERSID());
		attributes.put("SOLE_ID", getSOLE_ID());
		attributes.put("SOLE_NAME", getSOLE_NAME());
		attributes.put("ID_NUMBER", getID_NUMBER());
		attributes.put("MOBILE", getMOBILE());
		attributes.put("TELEPHONE", getTELEPHONE());
		attributes.put("EMAIL", getEMAIL());
		attributes.put("QUERY_RESPONSE", getQUERY_RESPONSE());
		attributes.put("OVERALL_RATING", getOVERALL_RATING());
		attributes.put("COMP_INFORMATION", getCOMP_INFORMATION());
		attributes.put("QUALITY_REPORT", getQUALITY_REPORT());
		attributes.put("DESCRIPTION", getDESCRIPTION());
		attributes.put("COMMENTS", getCOMMENTS());
		attributes.put("GRIEVANCE", getGRIEVANCE());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SHAREHOLDERSID = (Long)attributes.get("SHAREHOLDERSID");

		if (SHAREHOLDERSID != null) {
			setSHAREHOLDERSID(SHAREHOLDERSID);
		}

		Long SOLE_ID = (Long)attributes.get("SOLE_ID");

		if (SOLE_ID != null) {
			setSOLE_ID(SOLE_ID);
		}

		String SOLE_NAME = (String)attributes.get("SOLE_NAME");

		if (SOLE_NAME != null) {
			setSOLE_NAME(SOLE_NAME);
		}

		Long ID_NUMBER = (Long)attributes.get("ID_NUMBER");

		if (ID_NUMBER != null) {
			setID_NUMBER(ID_NUMBER);
		}

		Long MOBILE = (Long)attributes.get("MOBILE");

		if (MOBILE != null) {
			setMOBILE(MOBILE);
		}

		Long TELEPHONE = (Long)attributes.get("TELEPHONE");

		if (TELEPHONE != null) {
			setTELEPHONE(TELEPHONE);
		}

		String EMAIL = (String)attributes.get("EMAIL");

		if (EMAIL != null) {
			setEMAIL(EMAIL);
		}

		String QUERY_RESPONSE = (String)attributes.get("QUERY_RESPONSE");

		if (QUERY_RESPONSE != null) {
			setQUERY_RESPONSE(QUERY_RESPONSE);
		}

		String OVERALL_RATING = (String)attributes.get("OVERALL_RATING");

		if (OVERALL_RATING != null) {
			setOVERALL_RATING(OVERALL_RATING);
		}

		String COMP_INFORMATION = (String)attributes.get("COMP_INFORMATION");

		if (COMP_INFORMATION != null) {
			setCOMP_INFORMATION(COMP_INFORMATION);
		}

		String QUALITY_REPORT = (String)attributes.get("QUALITY_REPORT");

		if (QUALITY_REPORT != null) {
			setQUALITY_REPORT(QUALITY_REPORT);
		}

		String DESCRIPTION = (String)attributes.get("DESCRIPTION");

		if (DESCRIPTION != null) {
			setDESCRIPTION(DESCRIPTION);
		}

		String COMMENTS = (String)attributes.get("COMMENTS");

		if (COMMENTS != null) {
			setCOMMENTS(COMMENTS);
		}

		String GRIEVANCE = (String)attributes.get("GRIEVANCE");

		if (GRIEVANCE != null) {
			setGRIEVANCE(GRIEVANCE);
		}
	}

	@Override
	public Shareholders toEscapedModel() {
		return new ShareholdersWrapper(_shareholders.toEscapedModel());
	}

	@Override
	public Shareholders toUnescapedModel() {
		return new ShareholdersWrapper(_shareholders.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _shareholders.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _shareholders.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _shareholders.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _shareholders.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Shareholders> toCacheModel() {
		return _shareholders.toCacheModel();
	}

	@Override
	public int compareTo(Shareholders shareholders) {
		return _shareholders.compareTo(shareholders);
	}

	@Override
	public int hashCode() {
		return _shareholders.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _shareholders.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ShareholdersWrapper((Shareholders)_shareholders.clone());
	}

	/**
	* Returns the comments of this shareholders.
	*
	* @return the comments of this shareholders
	*/
	@Override
	public java.lang.String getCOMMENTS() {
		return _shareholders.getCOMMENTS();
	}

	/**
	* Returns the comp_information of this shareholders.
	*
	* @return the comp_information of this shareholders
	*/
	@Override
	public java.lang.String getCOMP_INFORMATION() {
		return _shareholders.getCOMP_INFORMATION();
	}

	/**
	* Returns the description of this shareholders.
	*
	* @return the description of this shareholders
	*/
	@Override
	public java.lang.String getDESCRIPTION() {
		return _shareholders.getDESCRIPTION();
	}

	/**
	* Returns the email of this shareholders.
	*
	* @return the email of this shareholders
	*/
	@Override
	public java.lang.String getEMAIL() {
		return _shareholders.getEMAIL();
	}

	/**
	* Returns the grievance of this shareholders.
	*
	* @return the grievance of this shareholders
	*/
	@Override
	public java.lang.String getGRIEVANCE() {
		return _shareholders.getGRIEVANCE();
	}

	/**
	* Returns the overall_rating of this shareholders.
	*
	* @return the overall_rating of this shareholders
	*/
	@Override
	public java.lang.String getOVERALL_RATING() {
		return _shareholders.getOVERALL_RATING();
	}

	/**
	* Returns the quality_report of this shareholders.
	*
	* @return the quality_report of this shareholders
	*/
	@Override
	public java.lang.String getQUALITY_REPORT() {
		return _shareholders.getQUALITY_REPORT();
	}

	/**
	* Returns the query_response of this shareholders.
	*
	* @return the query_response of this shareholders
	*/
	@Override
	public java.lang.String getQUERY_RESPONSE() {
		return _shareholders.getQUERY_RESPONSE();
	}

	/**
	* Returns the sole_name of this shareholders.
	*
	* @return the sole_name of this shareholders
	*/
	@Override
	public java.lang.String getSOLE_NAME() {
		return _shareholders.getSOLE_NAME();
	}

	@Override
	public java.lang.String toString() {
		return _shareholders.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _shareholders.toXmlString();
	}

	/**
	* Returns the id_number of this shareholders.
	*
	* @return the id_number of this shareholders
	*/
	@Override
	public long getID_NUMBER() {
		return _shareholders.getID_NUMBER();
	}

	/**
	* Returns the mobile of this shareholders.
	*
	* @return the mobile of this shareholders
	*/
	@Override
	public long getMOBILE() {
		return _shareholders.getMOBILE();
	}

	/**
	* Returns the primary key of this shareholders.
	*
	* @return the primary key of this shareholders
	*/
	@Override
	public long getPrimaryKey() {
		return _shareholders.getPrimaryKey();
	}

	/**
	* Returns the shareholdersid of this shareholders.
	*
	* @return the shareholdersid of this shareholders
	*/
	@Override
	public long getSHAREHOLDERSID() {
		return _shareholders.getSHAREHOLDERSID();
	}

	/**
	* Returns the sole_id of this shareholders.
	*
	* @return the sole_id of this shareholders
	*/
	@Override
	public long getSOLE_ID() {
		return _shareholders.getSOLE_ID();
	}

	/**
	* Returns the telephone of this shareholders.
	*
	* @return the telephone of this shareholders
	*/
	@Override
	public long getTELEPHONE() {
		return _shareholders.getTELEPHONE();
	}

	@Override
	public void persist() {
		_shareholders.persist();
	}

	/**
	* Sets the comments of this shareholders.
	*
	* @param COMMENTS the comments of this shareholders
	*/
	@Override
	public void setCOMMENTS(java.lang.String COMMENTS) {
		_shareholders.setCOMMENTS(COMMENTS);
	}

	/**
	* Sets the comp_information of this shareholders.
	*
	* @param COMP_INFORMATION the comp_information of this shareholders
	*/
	@Override
	public void setCOMP_INFORMATION(java.lang.String COMP_INFORMATION) {
		_shareholders.setCOMP_INFORMATION(COMP_INFORMATION);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_shareholders.setCachedModel(cachedModel);
	}

	/**
	* Sets the description of this shareholders.
	*
	* @param DESCRIPTION the description of this shareholders
	*/
	@Override
	public void setDESCRIPTION(java.lang.String DESCRIPTION) {
		_shareholders.setDESCRIPTION(DESCRIPTION);
	}

	/**
	* Sets the email of this shareholders.
	*
	* @param EMAIL the email of this shareholders
	*/
	@Override
	public void setEMAIL(java.lang.String EMAIL) {
		_shareholders.setEMAIL(EMAIL);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_shareholders.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_shareholders.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_shareholders.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the grievance of this shareholders.
	*
	* @param GRIEVANCE the grievance of this shareholders
	*/
	@Override
	public void setGRIEVANCE(java.lang.String GRIEVANCE) {
		_shareholders.setGRIEVANCE(GRIEVANCE);
	}

	/**
	* Sets the id_number of this shareholders.
	*
	* @param ID_NUMBER the id_number of this shareholders
	*/
	@Override
	public void setID_NUMBER(long ID_NUMBER) {
		_shareholders.setID_NUMBER(ID_NUMBER);
	}

	/**
	* Sets the mobile of this shareholders.
	*
	* @param MOBILE the mobile of this shareholders
	*/
	@Override
	public void setMOBILE(long MOBILE) {
		_shareholders.setMOBILE(MOBILE);
	}

	@Override
	public void setNew(boolean n) {
		_shareholders.setNew(n);
	}

	/**
	* Sets the overall_rating of this shareholders.
	*
	* @param OVERALL_RATING the overall_rating of this shareholders
	*/
	@Override
	public void setOVERALL_RATING(java.lang.String OVERALL_RATING) {
		_shareholders.setOVERALL_RATING(OVERALL_RATING);
	}

	/**
	* Sets the primary key of this shareholders.
	*
	* @param primaryKey the primary key of this shareholders
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_shareholders.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_shareholders.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quality_report of this shareholders.
	*
	* @param QUALITY_REPORT the quality_report of this shareholders
	*/
	@Override
	public void setQUALITY_REPORT(java.lang.String QUALITY_REPORT) {
		_shareholders.setQUALITY_REPORT(QUALITY_REPORT);
	}

	/**
	* Sets the query_response of this shareholders.
	*
	* @param QUERY_RESPONSE the query_response of this shareholders
	*/
	@Override
	public void setQUERY_RESPONSE(java.lang.String QUERY_RESPONSE) {
		_shareholders.setQUERY_RESPONSE(QUERY_RESPONSE);
	}

	/**
	* Sets the shareholdersid of this shareholders.
	*
	* @param SHAREHOLDERSID the shareholdersid of this shareholders
	*/
	@Override
	public void setSHAREHOLDERSID(long SHAREHOLDERSID) {
		_shareholders.setSHAREHOLDERSID(SHAREHOLDERSID);
	}

	/**
	* Sets the sole_id of this shareholders.
	*
	* @param SOLE_ID the sole_id of this shareholders
	*/
	@Override
	public void setSOLE_ID(long SOLE_ID) {
		_shareholders.setSOLE_ID(SOLE_ID);
	}

	/**
	* Sets the sole_name of this shareholders.
	*
	* @param SOLE_NAME the sole_name of this shareholders
	*/
	@Override
	public void setSOLE_NAME(java.lang.String SOLE_NAME) {
		_shareholders.setSOLE_NAME(SOLE_NAME);
	}

	/**
	* Sets the telephone of this shareholders.
	*
	* @param TELEPHONE the telephone of this shareholders
	*/
	@Override
	public void setTELEPHONE(long TELEPHONE) {
		_shareholders.setTELEPHONE(TELEPHONE);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ShareholdersWrapper)) {
			return false;
		}

		ShareholdersWrapper shareholdersWrapper = (ShareholdersWrapper)obj;

		if (Objects.equals(_shareholders, shareholdersWrapper._shareholders)) {
			return true;
		}

		return false;
	}

	@Override
	public Shareholders getWrappedModel() {
		return _shareholders;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _shareholders.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _shareholders.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_shareholders.resetOriginalValues();
	}

	private final Shareholders _shareholders;
}