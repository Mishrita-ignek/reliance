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

package OCCModuleNew.model.impl;

import OCCModuleNew.model.OccNew;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing OccNew in entity cache.
 *
 * @author Mukesh Patidar
 * @see OccNew
 * @generated
 */
@ProviderType
public class OccNewCacheModel implements CacheModel<OccNew>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OccNewCacheModel)) {
			return false;
		}

		OccNewCacheModel occNewCacheModel = (OccNewCacheModel)obj;

		if (OCCID == occNewCacheModel.OCCID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, OCCID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{OCCID=");
		sb.append(OCCID);
		sb.append(", ListID=");
		sb.append(ListID);
		sb.append(", ListName=");
		sb.append(ListName);
		sb.append(", RollNo=");
		sb.append(RollNo);
		sb.append(", Name=");
		sb.append(Name);
		sb.append(", MobileNo=");
		sb.append(MobileNo);
		sb.append(", Email=");
		sb.append(Email);
		sb.append(", Dept=");
		sb.append(Dept);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OccNew toEntityModel() {
		OccNewImpl occNewImpl = new OccNewImpl();

		occNewImpl.setOCCID(OCCID);
		occNewImpl.setListID(ListID);

		if (ListName == null) {
			occNewImpl.setListName(StringPool.BLANK);
		}
		else {
			occNewImpl.setListName(ListName);
		}

		if (RollNo == null) {
			occNewImpl.setRollNo(StringPool.BLANK);
		}
		else {
			occNewImpl.setRollNo(RollNo);
		}

		if (Name == null) {
			occNewImpl.setName(StringPool.BLANK);
		}
		else {
			occNewImpl.setName(Name);
		}

		occNewImpl.setMobileNo(MobileNo);

		if (Email == null) {
			occNewImpl.setEmail(StringPool.BLANK);
		}
		else {
			occNewImpl.setEmail(Email);
		}

		if (Dept == null) {
			occNewImpl.setDept(StringPool.BLANK);
		}
		else {
			occNewImpl.setDept(Dept);
		}

		occNewImpl.resetOriginalValues();

		return occNewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		OCCID = objectInput.readLong();

		ListID = objectInput.readLong();
		ListName = objectInput.readUTF();
		RollNo = objectInput.readUTF();
		Name = objectInput.readUTF();

		MobileNo = objectInput.readLong();
		Email = objectInput.readUTF();
		Dept = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(OCCID);

		objectOutput.writeLong(ListID);

		if (ListName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ListName);
		}

		if (RollNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(RollNo);
		}

		if (Name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Name);
		}

		objectOutput.writeLong(MobileNo);

		if (Email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Email);
		}

		if (Dept == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Dept);
		}
	}

	public long OCCID;
	public long ListID;
	public String ListName;
	public String RollNo;
	public String Name;
	public long MobileNo;
	public String Email;
	public String Dept;
}