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

package OCCModuleNew.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link OCCModuleNew.service.http.OccMessageNewServiceSoap}.
 *
 * @author Mukesh Patidar
 * @see OCCModuleNew.service.http.OccMessageNewServiceSoap
 * @generated
 */
@ProviderType
public class OccMessageNewSoap implements Serializable {
	public static OccMessageNewSoap toSoapModel(OccMessageNew model) {
		OccMessageNewSoap soapModel = new OccMessageNewSoap();

		soapModel.setMSG_ID(model.getMSG_ID());
		soapModel.setListName(model.getListName());
		soapModel.setMessage(model.getMessage());
		soapModel.setMSgSendDate(model.getMSgSendDate());
		soapModel.setSeverity(model.getSeverity());

		return soapModel;
	}

	public static OccMessageNewSoap[] toSoapModels(OccMessageNew[] models) {
		OccMessageNewSoap[] soapModels = new OccMessageNewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OccMessageNewSoap[][] toSoapModels(OccMessageNew[][] models) {
		OccMessageNewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OccMessageNewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OccMessageNewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OccMessageNewSoap[] toSoapModels(List<OccMessageNew> models) {
		List<OccMessageNewSoap> soapModels = new ArrayList<OccMessageNewSoap>(models.size());

		for (OccMessageNew model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OccMessageNewSoap[soapModels.size()]);
	}

	public OccMessageNewSoap() {
	}

	public long getPrimaryKey() {
		return _MSG_ID;
	}

	public void setPrimaryKey(long pk) {
		setMSG_ID(pk);
	}

	public long getMSG_ID() {
		return _MSG_ID;
	}

	public void setMSG_ID(long MSG_ID) {
		_MSG_ID = MSG_ID;
	}

	public String getListName() {
		return _ListName;
	}

	public void setListName(String ListName) {
		_ListName = ListName;
	}

	public String getMessage() {
		return _Message;
	}

	public void setMessage(String Message) {
		_Message = Message;
	}

	public String getMSgSendDate() {
		return _MSgSendDate;
	}

	public void setMSgSendDate(String MSgSendDate) {
		_MSgSendDate = MSgSendDate;
	}

	public String getSeverity() {
		return _Severity;
	}

	public void setSeverity(String Severity) {
		_Severity = Severity;
	}

	private long _MSG_ID;
	private String _ListName;
	private String _Message;
	private String _MSgSendDate;
	private String _Severity;
}