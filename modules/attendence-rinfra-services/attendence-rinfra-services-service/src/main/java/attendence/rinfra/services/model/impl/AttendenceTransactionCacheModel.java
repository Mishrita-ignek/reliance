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

import attendence.rinfra.services.model.AttendenceTransaction;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AttendenceTransaction in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see AttendenceTransaction
 * @generated
 */
@ProviderType
public class AttendenceTransactionCacheModel implements CacheModel<AttendenceTransaction>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttendenceTransactionCacheModel)) {
			return false;
		}

		AttendenceTransactionCacheModel attendenceTransactionCacheModel = (AttendenceTransactionCacheModel)obj;

		if (srNo.equals(attendenceTransactionCacheModel.srNo)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, srNo);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{srNo=");
		sb.append(srNo);
		sb.append(", employeeCode=");
		sb.append(employeeCode);
		sb.append(", employeeName=");
		sb.append(employeeName);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", userDefined1=");
		sb.append(userDefined1);
		sb.append(", userDefined2=");
		sb.append(userDefined2);
		sb.append(", attendenceMode=");
		sb.append(attendenceMode);
		sb.append(", attendenceDateTime=");
		sb.append(attendenceDateTime);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AttendenceTransaction toEntityModel() {
		AttendenceTransactionImpl attendenceTransactionImpl = new AttendenceTransactionImpl();

		if (srNo == null) {
			attendenceTransactionImpl.setSrNo(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setSrNo(srNo);
		}

		if (employeeCode == null) {
			attendenceTransactionImpl.setEmployeeCode(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setEmployeeCode(employeeCode);
		}

		if (employeeName == null) {
			attendenceTransactionImpl.setEmployeeName(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setEmployeeName(employeeName);
		}

		if (mobile == null) {
			attendenceTransactionImpl.setMobile(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setMobile(mobile);
		}

		if (userDefined1 == null) {
			attendenceTransactionImpl.setUserDefined1(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setUserDefined1(userDefined1);
		}

		if (userDefined2 == null) {
			attendenceTransactionImpl.setUserDefined2(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setUserDefined2(userDefined2);
		}

		if (attendenceMode == null) {
			attendenceTransactionImpl.setAttendenceMode(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setAttendenceMode(attendenceMode);
		}

		if (attendenceDateTime == null) {
			attendenceTransactionImpl.setAttendenceDateTime(StringPool.BLANK);
		}
		else {
			attendenceTransactionImpl.setAttendenceDateTime(attendenceDateTime);
		}

		attendenceTransactionImpl.resetOriginalValues();

		return attendenceTransactionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		srNo = objectInput.readUTF();
		employeeCode = objectInput.readUTF();
		employeeName = objectInput.readUTF();
		mobile = objectInput.readUTF();
		userDefined1 = objectInput.readUTF();
		userDefined2 = objectInput.readUTF();
		attendenceMode = objectInput.readUTF();
		attendenceDateTime = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (srNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(srNo);
		}

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

		if (attendenceMode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attendenceMode);
		}

		if (attendenceDateTime == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(attendenceDateTime);
		}
	}

	public String srNo;
	public String employeeCode;
	public String employeeName;
	public String mobile;
	public String userDefined1;
	public String userDefined2;
	public String attendenceMode;
	public String attendenceDateTime;
}