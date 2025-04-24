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

import OCCModuleNew.model.OccMessageNew;

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
 * The cache model class for representing OccMessageNew in entity cache.
 *
 * @author Mukesh Patidar
 * @see OccMessageNew
 * @generated
 */
@ProviderType
public class OccMessageNewCacheModel implements CacheModel<OccMessageNew>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OccMessageNewCacheModel)) {
			return false;
		}

		OccMessageNewCacheModel occMessageNewCacheModel = (OccMessageNewCacheModel)obj;

		if (MSG_ID == occMessageNewCacheModel.MSG_ID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, MSG_ID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{MSG_ID=");
		sb.append(MSG_ID);
		sb.append(", ListName=");
		sb.append(ListName);
		sb.append(", Message=");
		sb.append(Message);
		sb.append(", MSgSendDate=");
		sb.append(MSgSendDate);
		sb.append(", Severity=");
		sb.append(Severity);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public OccMessageNew toEntityModel() {
		OccMessageNewImpl occMessageNewImpl = new OccMessageNewImpl();

		occMessageNewImpl.setMSG_ID(MSG_ID);

		if (ListName == null) {
			occMessageNewImpl.setListName(StringPool.BLANK);
		}
		else {
			occMessageNewImpl.setListName(ListName);
		}

		if (Message == null) {
			occMessageNewImpl.setMessage(StringPool.BLANK);
		}
		else {
			occMessageNewImpl.setMessage(Message);
		}

		if (MSgSendDate == null) {
			occMessageNewImpl.setMSgSendDate(StringPool.BLANK);
		}
		else {
			occMessageNewImpl.setMSgSendDate(MSgSendDate);
		}

		if (Severity == null) {
			occMessageNewImpl.setSeverity(StringPool.BLANK);
		}
		else {
			occMessageNewImpl.setSeverity(Severity);
		}

		occMessageNewImpl.resetOriginalValues();

		return occMessageNewImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		MSG_ID = objectInput.readLong();
		ListName = objectInput.readUTF();
		Message = objectInput.readUTF();
		MSgSendDate = objectInput.readUTF();
		Severity = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(MSG_ID);

		if (ListName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ListName);
		}

		if (Message == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Message);
		}

		if (MSgSendDate == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MSgSendDate);
		}

		if (Severity == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(Severity);
		}
	}

	public long MSG_ID;
	public String ListName;
	public String Message;
	public String MSgSendDate;
	public String Severity;
}