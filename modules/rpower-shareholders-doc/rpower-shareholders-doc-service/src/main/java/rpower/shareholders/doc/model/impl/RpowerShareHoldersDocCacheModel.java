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

package rpower.shareholders.doc.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import rpower.shareholders.doc.model.RpowerShareHoldersDoc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpowerShareHoldersDoc in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersDoc
 * @generated
 */
@ProviderType
public class RpowerShareHoldersDocCacheModel implements CacheModel<RpowerShareHoldersDoc>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RpowerShareHoldersDocCacheModel)) {
			return false;
		}

		RpowerShareHoldersDocCacheModel rpowerShareHoldersDocCacheModel = (RpowerShareHoldersDocCacheModel)obj;

		if (pressId == rpowerShareHoldersDocCacheModel.pressId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, pressId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{pressId=");
		sb.append(pressId);
		sb.append(", heading=");
		sb.append(heading);
		sb.append(", description=");
		sb.append(description);
		sb.append(", fileURL=");
		sb.append(fileURL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpowerShareHoldersDoc toEntityModel() {
		RpowerShareHoldersDocImpl rpowerShareHoldersDocImpl = new RpowerShareHoldersDocImpl();

		rpowerShareHoldersDocImpl.setPressId(pressId);

		if (heading == null) {
			rpowerShareHoldersDocImpl.setHeading(StringPool.BLANK);
		}
		else {
			rpowerShareHoldersDocImpl.setHeading(heading);
		}

		if (description == null) {
			rpowerShareHoldersDocImpl.setDescription(StringPool.BLANK);
		}
		else {
			rpowerShareHoldersDocImpl.setDescription(description);
		}

		if (fileURL == null) {
			rpowerShareHoldersDocImpl.setFileURL(StringPool.BLANK);
		}
		else {
			rpowerShareHoldersDocImpl.setFileURL(fileURL);
		}

		rpowerShareHoldersDocImpl.resetOriginalValues();

		return rpowerShareHoldersDocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pressId = objectInput.readLong();
		heading = objectInput.readUTF();
		description = objectInput.readUTF();
		fileURL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(pressId);

		if (heading == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(heading);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (fileURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileURL);
		}
	}

	public long pressId;
	public String heading;
	public String description;
	public String fileURL;
}