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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.newrpower.share.doc.service.http.ShareHoldersServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.newrpower.share.doc.service.http.ShareHoldersServiceSoap
 * @generated
 */
@ProviderType
public class ShareHoldersSoap implements Serializable {
	public static ShareHoldersSoap toSoapModel(ShareHolders model) {
		ShareHoldersSoap soapModel = new ShareHoldersSoap();

		soapModel.setSRNO(model.getSRNO());
		soapModel.setFOLIO_NO(model.getFOLIO_NO());
		soapModel.setSHARES(model.getSHARES());

		return soapModel;
	}

	public static ShareHoldersSoap[] toSoapModels(ShareHolders[] models) {
		ShareHoldersSoap[] soapModels = new ShareHoldersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ShareHoldersSoap[][] toSoapModels(ShareHolders[][] models) {
		ShareHoldersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ShareHoldersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ShareHoldersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ShareHoldersSoap[] toSoapModels(List<ShareHolders> models) {
		List<ShareHoldersSoap> soapModels = new ArrayList<ShareHoldersSoap>(models.size());

		for (ShareHolders model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ShareHoldersSoap[soapModels.size()]);
	}

	public ShareHoldersSoap() {
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