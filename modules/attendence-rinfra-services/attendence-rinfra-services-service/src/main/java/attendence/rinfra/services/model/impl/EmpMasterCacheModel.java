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

package attendence.rinfra.services.model.impl;

import aQute.bnd.annotation.ProviderType;

import attendence.rinfra.services.model.EmpMaster;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EmpMaster in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EmpMaster
 * @generated
 */
@ProviderType
public class EmpMasterCacheModel implements CacheModel<EmpMaster>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpMasterCacheModel)) {
			return false;
		}

		EmpMasterCacheModel empMasterCacheModel = (EmpMasterCacheModel)obj;

		if (employeeCode.equals(empMasterCacheModel.employeeCode)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, employeeCode);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{employeeCode=");
		sb.append(employeeCode);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", userDefined1=");
		sb.append(userDefined1);
		sb.append(", userDefined2=");
		sb.append(userDefined2);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmpMaster toEntityModel() {
		EmpMasterImpl empMasterImpl = new EmpMasterImpl();

		if (employeeCode == null) {
			empMasterImpl.setEmployeeCode(StringPool.BLANK);
		}
		else {
			empMasterImpl.setEmployeeCode(employeeCode);
		}

		if (employeeName == null) {
			empMasterImpl.setEmployeeName(StringPool.BLANK);
		}
		else {
			empMasterImpl.setEmployeeName(employeeName);
		}

		if (mobile == null) {
			empMasterImpl.setMobile(StringPool.BLANK);
		}
		else {
			empMasterImpl.setMobile(mobile);
		}

		if (userDefined1 == null) {
			empMasterImpl.setUserDefined1(StringPool.BLANK);
		}
		else {
			empMasterImpl.setUserDefined1(userDefined1);
		}

		if (userDefined2 == null) {
			empMasterImpl.setUserDefined2(StringPool.BLANK);
		}
		else {
			empMasterImpl.setUserDefined2(userDefined2);
		}

		empMasterImpl.resetOriginalValues();

		return empMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		employeeCode = objectInput.readUTF();
		employeeName = objectInput.readUTF();
		mobile = objectInput.readUTF();
		userDefined1 = objectInput.readUTF();
		userDefined2 = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (employeeCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeCode);
		}

		if (employeeName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(employeeName);
		}

		if (mobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (userDefined1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userDefined1);
		}

		if (userDefined2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userDefined2);
		}
	}

	public String employeeCode;
	public String employeeName;
	public String mobile;
	public String userDefined1;
	public String userDefined2;
}