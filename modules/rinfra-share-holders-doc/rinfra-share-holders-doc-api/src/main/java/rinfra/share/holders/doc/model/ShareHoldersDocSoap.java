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

package rinfra.share.holders.doc.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link rinfra.share.holders.doc.service.http.ShareHoldersDocServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see rinfra.share.holders.doc.service.http.ShareHoldersDocServiceSoap
 * @generated
 */
@ProviderType
public class ShareHoldersDocSoap implements Serializable {
	public static ShareHoldersDocSoap toSoapModel(ShareHoldersDoc model) {
		ShareHoldersDocSoap soapModel = new ShareHoldersDocSoap();

		soapModel.setPressId(model.getPressId());
		soapModel.setHeading(model.getHeading());
		soapModel.setDescription(model.getDescription());
		soapModel.setFileURL(model.getFileURL());

		return soapModel;
	}

	public static ShareHoldersDocSoap[] toSoapModels(ShareHoldersDoc[] models) {
		ShareHoldersDocSoap[] soapModels = new ShareHoldersDocSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ShareHoldersDocSoap[][] toSoapModels(
		ShareHoldersDoc[][] models) {
		ShareHoldersDocSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ShareHoldersDocSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ShareHoldersDocSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ShareHoldersDocSoap[] toSoapModels(
		List<ShareHoldersDoc> models) {
		List<ShareHoldersDocSoap> soapModels = new ArrayList<ShareHoldersDocSoap>(models.size());

		for (ShareHoldersDoc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ShareHoldersDocSoap[soapModels.size()]);
	}

	public ShareHoldersDocSoap() {
	}

	public long getPrimaryKey() {
		return _pressId;
	}

	public void setPrimaryKey(long pk) {
		setPressId(pk);
	}

	public long getPressId() {
		return _pressId;
	}

	public void setPressId(long pressId) {
		_pressId = pressId;
	}

	public String getHeading() {
		return _heading;
	}

	public void setHeading(String heading) {
		_heading = heading;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public String getFileURL() {
		return _fileURL;
	}

	public void setFileURL(String fileURL) {
		_fileURL = fileURL;
	}

	private long _pressId;
	private String _heading;
	private String _description;
	private String _fileURL;
}