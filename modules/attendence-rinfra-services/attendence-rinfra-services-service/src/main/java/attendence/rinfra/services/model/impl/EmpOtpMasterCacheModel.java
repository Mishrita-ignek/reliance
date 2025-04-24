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

import attendence.rinfra.services.model.EmpOtpMaster;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing EmpOtpMaster in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see EmpOtpMaster
 * @generated
 */
@ProviderType
public class EmpOtpMasterCacheModel implements CacheModel<EmpOtpMaster>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpOtpMasterCacheModel)) {
			return false;
		}

		EmpOtpMasterCacheModel empOtpMasterCacheModel = (EmpOtpMasterCacheModel)obj;

		if (empMobile.equals(empOtpMasterCacheModel.empMobile)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, empMobile);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(5);

		sb.append("{empMobile=");
		sb.append(empMobile);
		sb.append(", otp=");
		sb.append(otp);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public EmpOtpMaster toEntityModel() {
		EmpOtpMasterImpl empOtpMasterImpl = new EmpOtpMasterImpl();

		if (empMobile == null) {
			empOtpMasterImpl.setEmpMobile(StringPool.BLANK);
		}
		else {
			empOtpMasterImpl.setEmpMobile(empMobile);
		}

		if (otp == null) {
			empOtpMasterImpl.setOtp(StringPool.BLANK);
		}
		else {
			empOtpMasterImpl.setOtp(otp);
		}

		empOtpMasterImpl.resetOriginalValues();

		return empOtpMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		empMobile = objectInput.readUTF();
		otp = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (empMobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empMobile);
		}

		if (otp == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(otp);
		}
	}

	public String empMobile;
	public String otp;
}