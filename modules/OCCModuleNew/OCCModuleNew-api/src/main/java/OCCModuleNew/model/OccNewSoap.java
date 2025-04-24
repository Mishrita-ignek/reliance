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
 * This class is used by SOAP remote services, specifically {@link OCCModuleNew.service.http.OccNewServiceSoap}.
 *
 * @author Mukesh Patidar
 * @see OCCModuleNew.service.http.OccNewServiceSoap
 * @generated
 */
@ProviderType
public class OccNewSoap implements Serializable {
	public static OccNewSoap toSoapModel(OccNew model) {
		OccNewSoap soapModel = new OccNewSoap();

		soapModel.setOCCID(model.getOCCID());
		soapModel.setListID(model.getListID());
		soapModel.setListName(model.getListName());
		soapModel.setRollNo(model.getRollNo());
		soapModel.setName(model.getName());
		soapModel.setMobileNo(model.getMobileNo());
		soapModel.setEmail(model.getEmail());
		soapModel.setDept(model.getDept());

		return soapModel;
	}

	public static OccNewSoap[] toSoapModels(OccNew[] models) {
		OccNewSoap[] soapModels = new OccNewSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OccNewSoap[][] toSoapModels(OccNew[][] models) {
		OccNewSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OccNewSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OccNewSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OccNewSoap[] toSoapModels(List<OccNew> models) {
		List<OccNewSoap> soapModels = new ArrayList<OccNewSoap>(models.size());

		for (OccNew model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OccNewSoap[soapModels.size()]);
	}

	public OccNewSoap() {
	}

	public long getPrimaryKey() {
		return _OCCID;
	}

	public void setPrimaryKey(long pk) {
		setOCCID(pk);
	}

	public long getOCCID() {
		return _OCCID;
	}

	public void setOCCID(long OCCID) {
		_OCCID = OCCID;
	}

	public long getListID() {
		return _ListID;
	}

	public void setListID(long ListID) {
		_ListID = ListID;
	}

	public String getListName() {
		return _ListName;
	}

	public void setListName(String ListName) {
		_ListName = ListName;
	}

	public String getRollNo() {
		return _RollNo;
	}

	public void setRollNo(String RollNo) {
		_RollNo = RollNo;
	}

	public String getName() {
		return _Name;
	}

	public void setName(String Name) {
		_Name = Name;
	}

	public long getMobileNo() {
		return _MobileNo;
	}

	public void setMobileNo(long MobileNo) {
		_MobileNo = MobileNo;
	}

	public String getEmail() {
		return _Email;
	}

	public void setEmail(String Email) {
		_Email = Email;
	}

	public String getDept() {
		return _Dept;
	}

	public void setDept(String Dept) {
		_Dept = Dept;
	}

	private long _OCCID;
	private long _ListID;
	private String _ListName;
	private String _RollNo;
	private String _Name;
	private long _MobileNo;
	private String _Email;
	private String _Dept;
}