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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rinfra.annual.service.http.AnnualReportServiceSoap}.
 *
 * @author MukeshPatidar
 * @see com.rinfra.annual.service.http.AnnualReportServiceSoap
 * @generated
 */
@ProviderType
public class AnnualReportSoap implements Serializable {
	public static AnnualReportSoap toSoapModel(AnnualReport model) {
		AnnualReportSoap soapModel = new AnnualReportSoap();

		soapModel.setSRNO(model.getSRNO());
		soapModel.setFINANCIAL_YEARS(model.getFINANCIAL_YEARS());
		soapModel.setFINANCIALDATA(model.getFINANCIALDATA());
		soapModel.setFINANCIAL_DATALINK(model.getFINANCIAL_DATALINK());

		return soapModel;
	}

	public static AnnualReportSoap[] toSoapModels(AnnualReport[] models) {
		AnnualReportSoap[] soapModels = new AnnualReportSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AnnualReportSoap[][] toSoapModels(AnnualReport[][] models) {
		AnnualReportSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AnnualReportSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AnnualReportSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AnnualReportSoap[] toSoapModels(List<AnnualReport> models) {
		List<AnnualReportSoap> soapModels = new ArrayList<AnnualReportSoap>(models.size());

		for (AnnualReport model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AnnualReportSoap[soapModels.size()]);
	}

	public AnnualReportSoap() {
	}

	public long getPrimaryKey() {
		return _SRNO;
	}

	public void setPrimaryKey(long pk) {
		setSRNO(pk);
	}

	public long getSRNO() {
		return _SRNO;
	}

	public void setSRNO(long SRNO) {
		_SRNO = SRNO;
	}

	public String getFINANCIAL_YEARS() {
		return _FINANCIAL_YEARS;
	}

	public void setFINANCIAL_YEARS(String FINANCIAL_YEARS) {
		_FINANCIAL_YEARS = FINANCIAL_YEARS;
	}

	public String getFINANCIALDATA() {
		return _FINANCIALDATA;
	}

	public void setFINANCIALDATA(String FINANCIALDATA) {
		_FINANCIALDATA = FINANCIALDATA;
	}

	public String getFINANCIAL_DATALINK() {
		return _FINANCIAL_DATALINK;
	}

	public void setFINANCIAL_DATALINK(String FINANCIAL_DATALINK) {
		_FINANCIAL_DATALINK = FINANCIAL_DATALINK;
	}

	private long _SRNO;
	private String _FINANCIAL_YEARS;
	private String _FINANCIALDATA;
	private String _FINANCIAL_DATALINK;
}