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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.rinfra.unpaidunclaimedshares.service.http.unpaidUnclaimedDevidendServiceSoap}.
 *
 * @author Mukesh Patidar
 * @see com.rinfra.unpaidunclaimedshares.service.http.unpaidUnclaimedDevidendServiceSoap
 * @generated
 */
@ProviderType
public class unpaidUnclaimedDevidendSoap implements Serializable {
	public static unpaidUnclaimedDevidendSoap toSoapModel(
		unpaidUnclaimedDevidend model) {
		unpaidUnclaimedDevidendSoap soapModel = new unpaidUnclaimedDevidendSoap();

		soapModel.setSRNO(model.getSRNO());
		soapModel.setFOLIO_NO(model.getFOLIO_NO());
		soapModel.setNAME(model.getNAME());
		soapModel.setADD1(model.getADD1());
		soapModel.setADD2(model.getADD2());
		soapModel.setADD3(model.getADD3());
		soapModel.setADD4(model.getADD4());
		soapModel.setADD5(model.getADD5());
		soapModel.setADD6(model.getADD6());
		soapModel.setJT1(model.getJT1());
		soapModel.setJT2(model.getJT2());
		soapModel.setJT3(model.getJT3());
		soapModel.setSHARES(model.getSHARES());

		return soapModel;
	}

	public static unpaidUnclaimedDevidendSoap[] toSoapModels(
		unpaidUnclaimedDevidend[] models) {
		unpaidUnclaimedDevidendSoap[] soapModels = new unpaidUnclaimedDevidendSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static unpaidUnclaimedDevidendSoap[][] toSoapModels(
		unpaidUnclaimedDevidend[][] models) {
		unpaidUnclaimedDevidendSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new unpaidUnclaimedDevidendSoap[models.length][models[0].length];
		}
		else {
			soapModels = new unpaidUnclaimedDevidendSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static unpaidUnclaimedDevidendSoap[] toSoapModels(
		List<unpaidUnclaimedDevidend> models) {
		List<unpaidUnclaimedDevidendSoap> soapModels = new ArrayList<unpaidUnclaimedDevidendSoap>(models.size());

		for (unpaidUnclaimedDevidend model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new unpaidUnclaimedDevidendSoap[soapModels.size()]);
	}

	public unpaidUnclaimedDevidendSoap() {
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

	public String getFOLIO_NO() {
		return _FOLIO_NO;
	}

	public void setFOLIO_NO(String FOLIO_NO) {
		_FOLIO_NO = FOLIO_NO;
	}

	public String getNAME() {
		return _NAME;
	}

	public void setNAME(String NAME) {
		_NAME = NAME;
	}

	public String getADD1() {
		return _ADD1;
	}

	public void setADD1(String ADD1) {
		_ADD1 = ADD1;
	}

	public String getADD2() {
		return _ADD2;
	}

	public void setADD2(String ADD2) {
		_ADD2 = ADD2;
	}

	public String getADD3() {
		return _ADD3;
	}

	public void setADD3(String ADD3) {
		_ADD3 = ADD3;
	}

	public String getADD4() {
		return _ADD4;
	}

	public void setADD4(String ADD4) {
		_ADD4 = ADD4;
	}

	public String getADD5() {
		return _ADD5;
	}

	public void setADD5(String ADD5) {
		_ADD5 = ADD5;
	}

	public String getADD6() {
		return _ADD6;
	}

	public void setADD6(String ADD6) {
		_ADD6 = ADD6;
	}

	public String getJT1() {
		return _JT1;
	}

	public void setJT1(String JT1) {
		_JT1 = JT1;
	}

	public String getJT2() {
		return _JT2;
	}

	public void setJT2(String JT2) {
		_JT2 = JT2;
	}

	public String getJT3() {
		return _JT3;
	}

	public void setJT3(String JT3) {
		_JT3 = JT3;
	}

	public String getSHARES() {
		return _SHARES;
	}

	public void setSHARES(String SHARES) {
		_SHARES = SHARES;
	}

	private long _SRNO;
	private String _FOLIO_NO;
	private String _NAME;
	private String _ADD1;
	private String _ADD2;
	private String _ADD3;
	private String _ADD4;
	private String _ADD5;
	private String _ADD6;
	private String _JT1;
	private String _JT2;
	private String _JT3;
	private String _SHARES;
}