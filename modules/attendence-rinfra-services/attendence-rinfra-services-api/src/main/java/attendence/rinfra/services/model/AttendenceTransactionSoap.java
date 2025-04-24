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
public class AttendenceTransactionSoap implements Serializable {
	public static AttendenceTransactionSoap toSoapModel(
		AttendenceTransaction model) {
		AttendenceTransactionSoap soapModel = new AttendenceTransactionSoap();

		soapModel.setSrNo(model.getSrNo());
		soapModel.setEmployeeCode(model.getEmployeeCode());
		soapModel.setEmployeeName(model.getEmployeeName());
		soapModel.setMobile(model.getMobile());
		soapModel.setUserDefined1(model.getUserDefined1());
		soapModel.setUserDefined2(model.getUserDefined2());
		soapModel.setAttendenceMode(model.getAttendenceMode());
		soapModel.setAttendenceDateTime(model.getAttendenceDateTime());

		return soapModel;
	}

	public static AttendenceTransactionSoap[] toSoapModels(
		AttendenceTransaction[] models) {
		AttendenceTransactionSoap[] soapModels = new AttendenceTransactionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static AttendenceTransactionSoap[][] toSoapModels(
		AttendenceTransaction[][] models) {
		AttendenceTransactionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new AttendenceTransactionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new AttendenceTransactionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static AttendenceTransactionSoap[] toSoapModels(
		List<AttendenceTransaction> models) {
		List<AttendenceTransactionSoap> soapModels = new ArrayList<AttendenceTransactionSoap>(models.size());

		for (AttendenceTransaction model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new AttendenceTransactionSoap[soapModels.size()]);
	}

	public AttendenceTransactionSoap() {
	}

	public String getPrimaryKey() {
		return _srNo;
	}

	public void setPrimaryKey(String pk) {
		setSrNo(pk);
	}

	public String getSrNo() {
		return _srNo;
	}

	public void setSrNo(String srNo) {
		_srNo = srNo;
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

	public String getAttendenceMode() {
		return _attendenceMode;
	}

	public void setAttendenceMode(String attendenceMode) {
		_attendenceMode = attendenceMode;
	}

	public String getAttendenceDateTime() {
		return _attendenceDateTime;
	}

	public void setAttendenceDateTime(String attendenceDateTime) {
		_attendenceDateTime = attendenceDateTime;
	}

	private String _srNo;
	private String _employeeCode;
	private String _employeeName;
	private String _mobile;
	private String _userDefined1;
	private String _userDefined2;
	private String _attendenceMode;
	private String _attendenceDateTime;
}