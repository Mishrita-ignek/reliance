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

package com.newrpower.share.doc.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.newrpower.share.doc.model.RpowerShareHolders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpowerShareHolders in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHolders
 * @generated
 */
@ProviderType
public class RpowerShareHoldersCacheModel implements CacheModel<RpowerShareHolders>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RpowerShareHoldersCacheModel)) {
			return false;
		}

		RpowerShareHoldersCacheModel rpowerShareHoldersCacheModel = (RpowerShareHoldersCacheModel)obj;

		if (FOLIO_NO.equals(rpowerShareHoldersCacheModel.FOLIO_NO)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, FOLIO_NO);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{SRNO=");
		sb.append(SRNO);
		sb.append(", FOLIO_NO=");
		sb.append(FOLIO_NO);
		sb.append(", SHARES=");
		sb.append(SHARES);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpowerShareHolders toEntityModel() {
		RpowerShareHoldersImpl rpowerShareHoldersImpl = new RpowerShareHoldersImpl();

		rpowerShareHoldersImpl.setSRNO(SRNO);

		if (FOLIO_NO == null) {
			rpowerShareHoldersImpl.setFOLIO_NO(StringPool.BLANK);
		}
		else {
			rpowerShareHoldersImpl.setFOLIO_NO(FOLIO_NO);
		}

		if (SHARES == null) {
			rpowerShareHoldersImpl.setSHARES(StringPool.BLANK);
		}
		else {
			rpowerShareHoldersImpl.setSHARES(SHARES);
		}

		rpowerShareHoldersImpl.resetOriginalValues();

		return rpowerShareHoldersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SRNO = objectInput.readLong();
		FOLIO_NO = objectInput.readUTF();
		SHARES = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SRNO);

		if (FOLIO_NO == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FOLIO_NO);
		}

		if (SHARES == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SHARES);
		}
	}

	public long SRNO;
	public String FOLIO_NO;
	public String SHARES;
}