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

package attendence.rinfra.services.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class EmpMasterSoap implements Serializable {
	public static EmpMasterSoap toSoapModel(EmpMaster model) {
		EmpMasterSoap soapModel = new EmpMasterSoap();

		soapModel.setEmployeeCode(model.getEmployeeCode());
		soapModel.setEmployeeName(model.getEmployeeName());
		soapModel.setMobile(model.getMobile());
		soapModel.setUserDefined1(model.getUserDefined1());
		soapModel.setUserDefined2(model.getUserDefined2());

		return soapModel;
	}

	public static EmpMasterSoap[] toSoapModels(EmpMaster[] models) {
		EmpMasterSoap[] soapModels = new EmpMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmpMasterSoap[][] toSoapModels(EmpMaster[][] models) {
		EmpMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmpMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmpMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmpMasterSoap[] toSoapModels(List<EmpMaster> models) {
		List<EmpMasterSoap> soapModels = new ArrayList<EmpMasterSoap>(models.size());

		for (EmpMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmpMasterSoap[soapModels.size()]);
	}

	public EmpMasterSoap() {
	}

	public String getPrimaryKey() {
		return _employeeCode;
	}

	public void setPrimaryKey(String pk) {
		setEmployeeCode(pk);
	}

	public String getEmployeeCode() {
		return _employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		_employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return _employeeName;
	}

	public void setEmployeeName(String employeeName) {
		_employeeName = employeeName;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getUserDefined1() {
		return _userDefined1;
	}

	public void setUserDefined1(String userDefined1) {
		_userDefined1 = userDefined1;
	}

	public String getUserDefined2() {
		return _userDefined2;
	}

	public void setUserDefined2(String userDefined2) {
		_userDefined2 = userDefined2;
	}

	private String _employeeCode;
	private String _employeeName;
	private String _mobile;
	private String _userDefined1;
	private String _userDefined2;
}