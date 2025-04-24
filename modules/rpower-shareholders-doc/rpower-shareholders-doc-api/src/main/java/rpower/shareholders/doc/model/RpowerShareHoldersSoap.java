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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link rpower.shareholders.doc.service.http.RpowerShareHoldersServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see rpower.shareholders.doc.service.http.RpowerShareHoldersServiceSoap
 * @generated
 */
@ProviderType
public class RpowerShareHoldersSoap implements Serializable {
	public static RpowerShareHoldersSoap toSoapModel(RpowerShareHolders model) {
		RpowerShareHoldersSoap soapModel = new RpowerShareHoldersSoap();

		soapModel.setSRNO(model.getSRNO());
		soapModel.setFOLIO_NO(model.getFOLIO_NO());
		soapModel.setSHARES(model.getSHARES());

		return soapModel;
	}

	public static RpowerShareHoldersSoap[] toSoapModels(
		RpowerShareHolders[] models) {
		RpowerShareHoldersSoap[] soapModels = new RpowerShareHoldersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpowerShareHoldersSoap[][] toSoapModels(
		RpowerShareHolders[][] models) {
		RpowerShareHoldersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RpowerShareHoldersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpowerShareHoldersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpowerShareHoldersSoap[] toSoapModels(
		List<RpowerShareHolders> models) {
		List<RpowerShareHoldersSoap> soapModels = new ArrayList<RpowerShareHoldersSoap>(models.size());

		for (RpowerShareHolders model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpowerShareHoldersSoap[soapModels.size()]);
	}

	public RpowerShareHoldersSoap() {
	}

	public String getPrimaryKey() {
		return _FOLIO_NO;
	}

	public void setPrimaryKey(String pk) {
		setFOLIO_NO(pk);
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

	public String getSHARES() {
		return _SHARES;
	}

	public void setSHARES(String SHARES) {
		_SHARES = SHARES;
	}

	private long _SRNO;
	private String _FOLIO_NO;
	private String _SHARES;
}