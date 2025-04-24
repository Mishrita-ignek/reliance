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

package com.rinfra.annual.model;

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
 * This class is a wrapper for {@link AnnualReport}.
 * </p>
 *
 * @author MukeshPatidar
 * @see AnnualReport
 * @generated
 */
@ProviderType
public class AnnualReportWrapper implements AnnualReport,
	ModelWrapper<AnnualReport> {
	public AnnualReportWrapper(AnnualReport annualReport) {
		_annualReport = annualReport;
	}

	@Override
	public Class<?> getModelClass() {
		return AnnualReport.class;
	}

	@Override
	public String getModelClassName() {
		return AnnualReport.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("SRNO", getSRNO());
		attributes.put("FINANCIAL_YEARS", getFINANCIAL_YEARS());
		attributes.put("FINANCIALDATA", getFINANCIALDATA());
		attributes.put("FINANCIAL_DATALINK", getFINANCIAL_DATALINK());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long SRNO = (Long)attributes.get("SRNO");

		if (SRNO != null) {
			setSRNO(SRNO);
		}

		String FINANCIAL_YEARS = (String)attributes.get("FINANCIAL_YEARS");

		if (FINANCIAL_YEARS != null) {
			setFINANCIAL_YEARS(FINANCIAL_YEARS);
		}

		String FINANCIALDATA = (String)attributes.get("FINANCIALDATA");

		if (FINANCIALDATA != null) {
			setFINANCIALDATA(FINANCIALDATA);
		}

		String FINANCIAL_DATALINK = (String)attributes.get("FINANCIAL_DATALINK");

		if (FINANCIAL_DATALINK != null) {
			setFINANCIAL_DATALINK(FINANCIAL_DATALINK);
		}
	}

	@Override
	public AnnualReport toEscapedModel() {
		return new AnnualReportWrapper(_annualReport.toEscapedModel());
	}

	@Override
	public AnnualReport toUnescapedModel() {
		return new AnnualReportWrapper(_annualReport.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _annualReport.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _annualReport.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _annualReport.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _annualReport.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<AnnualReport> toCacheModel() {
		return _annualReport.toCacheModel();
	}

	@Override
	public int compareTo(AnnualReport annualReport) {
		return _annualReport.compareTo(annualReport);
	}

	@Override
	public int hashCode() {
		return _annualReport.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _annualReport.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AnnualReportWrapper((AnnualReport)_annualReport.clone());
	}

	/**
	* Returns the financialdata of this annual report.
	*
	* @return the financialdata of this annual report
	*/
	@Override
	public java.lang.String getFINANCIALDATA() {
		return _annualReport.getFINANCIALDATA();
	}

	/**
	* Returns the financial_datalink of this annual report.
	*
	* @return the financial_datalink of this annual report
	*/
	@Override
	public java.lang.String getFINANCIAL_DATALINK() {
		return _annualReport.getFINANCIAL_DATALINK();
	}

	/**
	* Returns the financial_years of this annual report.
	*
	* @return the financial_years of this annual report
	*/
	@Override
	public java.lang.String getFINANCIAL_YEARS() {
		return _annualReport.getFINANCIAL_YEARS();
	}

	@Override
	public java.lang.String toString() {
		return _annualReport.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _annualReport.toXmlString();
	}

	/**
	* Returns the primary key of this annual report.
	*
	* @return the primary key of this annual report
	*/
	@Override
	public long getPrimaryKey() {
		return _annualReport.getPrimaryKey();
	}

	/**
	* Returns the srno of this annual report.
	*
	* @return the srno of this annual report
	*/
	@Override
	public long getSRNO() {
		return _annualReport.getSRNO();
	}

	@Override
	public void persist() {
		_annualReport.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_annualReport.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_annualReport.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_annualReport.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_annualReport.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the financialdata of this annual report.
	*
	* @param FINANCIALDATA the financialdata of this annual report
	*/
	@Override
	public void setFINANCIALDATA(java.lang.String FINANCIALDATA) {
		_annualReport.setFINANCIALDATA(FINANCIALDATA);
	}

	/**
	* Sets the financial_datalink of this annual report.
	*
	* @param FINANCIAL_DATALINK the financial_datalink of this annual report
	*/
	@Override
	public void setFINANCIAL_DATALINK(java.lang.String FINANCIAL_DATALINK) {
		_annualReport.setFINANCIAL_DATALINK(FINANCIAL_DATALINK);
	}

	/**
	* Sets the financial_years of this annual report.
	*
	* @param FINANCIAL_YEARS the financial_years of this annual report
	*/
	@Override
	public void setFINANCIAL_YEARS(java.lang.String FINANCIAL_YEARS) {
		_annualReport.setFINANCIAL_YEARS(FINANCIAL_YEARS);
	}

	@Override
	public void setNew(boolean n) {
		_annualReport.setNew(n);
	}

	/**
	* Sets the primary key of this annual report.
	*
	* @param primaryKey the primary key of this annual report
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_annualReport.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_annualReport.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the srno of this annual report.
	*
	* @param SRNO the srno of this annual report
	*/
	@Override
	public void setSRNO(long SRNO) {
		_annualReport.setSRNO(SRNO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AnnualReportWrapper)) {
			return false;
		}

		AnnualReportWrapper annualReportWrapper = (AnnualReportWrapper)obj;

		if (Objects.equals(_annualReport, annualReportWrapper._annualReport)) {
			return true;
		}

		return false;
	}

	@Override
	public AnnualReport getWrappedModel() {
		return _annualReport;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _annualReport.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _annualReport.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_annualReport.resetOriginalValues();
	}

	private final AnnualReport _annualReport;
}