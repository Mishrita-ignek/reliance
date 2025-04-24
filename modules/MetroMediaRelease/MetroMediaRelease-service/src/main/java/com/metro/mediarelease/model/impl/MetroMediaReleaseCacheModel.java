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

package com.metro.mediarelease.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.metro.mediarelease.model.MetroMediaRelease;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing MetroMediaRelease in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see MetroMediaRelease
 * @generated
 */
@ProviderType
public class MetroMediaReleaseCacheModel implements CacheModel<MetroMediaRelease>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MetroMediaReleaseCacheModel)) {
			return false;
		}

		MetroMediaReleaseCacheModel metroMediaReleaseCacheModel = (MetroMediaReleaseCacheModel)obj;

		if (SRNO == metroMediaReleaseCacheModel.SRNO) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, SRNO);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{SRNO=");
		sb.append(SRNO);
		sb.append(", HDATE=");
		sb.append(HDATE);
		sb.append(", HEADLINE=");
		sb.append(HEADLINE);
		sb.append(", DOCUMENT_NAME=");
		sb.append(DOCUMENT_NAME);
		sb.append(", CREATEDATE=");
		sb.append(CREATEDATE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MetroMediaRelease toEntityModel() {
		MetroMediaReleaseImpl metroMediaReleaseImpl = new MetroMediaReleaseImpl();

		metroMediaReleaseImpl.setSRNO(SRNO);

		if (HDATE == Long.MIN_VALUE) {
			metroMediaReleaseImpl.setHDATE(null);
		}
		else {
			metroMediaReleaseImpl.setHDATE(new Date(HDATE));
		}

		if (HEADLINE == null) {
			metroMediaReleaseImpl.setHEADLINE(StringPool.BLANK);
		}
		else {
			metroMediaReleaseImpl.setHEADLINE(HEADLINE);
		}

		if (DOCUMENT_NAME == null) {
			metroMediaReleaseImpl.setDOCUMENT_NAME(StringPool.BLANK);
		}
		else {
			metroMediaReleaseImpl.setDOCUMENT_NAME(DOCUMENT_NAME);
		}

		if (CREATEDATE == Long.MIN_VALUE) {
			metroMediaReleaseImpl.setCREATEDATE(null);
		}
		else {
			metroMediaReleaseImpl.setCREATEDATE(new Date(CREATEDATE));
		}

		metroMediaReleaseImpl.resetOriginalValues();

		return metroMediaReleaseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SRNO = objectInput.readLong();
		HDATE = objectInput.readLong();
		HEADLINE = objectInput.readUTF();
		DOCUMENT_NAME = objectInput.readUTF();
		CREATEDATE = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SRNO);
		objectOutput.writeLong(HDATE);

		if (HEADLINE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(HEADLINE);
		}

		if (DOCUMENT_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DOCUMENT_NAME);
		}

		objectOutput.writeLong(CREATEDATE);
	}

	public long SRNO;
	public long HDATE;
	public String HEADLINE;
	public String DOCUMENT_NAME;
	public long CREATEDATE;
}