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
public class EmpOtpMasterSoap implements Serializable {
	public static EmpOtpMasterSoap toSoapModel(EmpOtpMaster model) {
		EmpOtpMasterSoap soapModel = new EmpOtpMasterSoap();

		soapModel.setEmpMobile(model.getEmpMobile());
		soapModel.setOtp(model.getOtp());

		return soapModel;
	}

	public static EmpOtpMasterSoap[] toSoapModels(EmpOtpMaster[] models) {
		EmpOtpMasterSoap[] soapModels = new EmpOtpMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmpOtpMasterSoap[][] toSoapModels(EmpOtpMaster[][] models) {
		EmpOtpMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmpOtpMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmpOtpMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmpOtpMasterSoap[] toSoapModels(List<EmpOtpMaster> models) {
		List<EmpOtpMasterSoap> soapModels = new ArrayList<EmpOtpMasterSoap>(models.size());

		for (EmpOtpMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmpOtpMasterSoap[soapModels.size()]);
	}

	public EmpOtpMasterSoap() {
	}

	public String getPrimaryKey() {
		return _empMobile;
	}

	public void setPrimaryKey(String pk) {
		setEmpMobile(pk);
	}

	public String getEmpMobile() {
		return _empMobile;
	}

	public void setEmpMobile(String empMobile) {
		_empMobile = empMobile;
	}

	public String getOtp() {
		return _otp;
	}

	public void setOtp(String otp) {
		_otp = otp;
	}

	private String _empMobile;
	private String _otp;
}