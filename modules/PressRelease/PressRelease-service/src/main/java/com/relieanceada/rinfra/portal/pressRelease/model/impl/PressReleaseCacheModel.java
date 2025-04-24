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

package com.relieanceada.rinfra.portal.pressRelease.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PressRelease in entity cache.
 *
 * @author Vipin Singh
 * @see PressRelease
 * @generated
 */
@ProviderType
public class PressReleaseCacheModel implements CacheModel<PressRelease>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PressReleaseCacheModel)) {
			return false;
		}

		PressReleaseCacheModel pressReleaseCacheModel = (PressReleaseCacheModel)obj;

		if (pressId == pressReleaseCacheModel.pressId) {
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
		StringBundler sb = new StringBundler(21);

		sb.append("{pressId=");
		sb.append(pressId);
		sb.append(", newsYear=");
		sb.append(newsYear);
		sb.append(", newsDate=");
		sb.append(newsDate);
		sb.append(", heading=");
		sb.append(heading);
		sb.append(", data=");
		sb.append(data);
		sb.append(", description=");
		sb.append(description);
		sb.append(", show=");
		sb.append(show);
		sb.append(", createdDate=");
		sb.append(createdDate);
		sb.append(", fileName=");
		sb.append(fileName);
		sb.append(", fileURL=");
		sb.append(fileURL);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PressRelease toEntityModel() {
		PressReleaseImpl pressReleaseImpl = new PressReleaseImpl();

		pressReleaseImpl.setPressId(pressId);

		if (newsYear == null) {
			pressReleaseImpl.setNewsYear(StringPool.BLANK);
		}
		else {
			pressReleaseImpl.setNewsYear(newsYear);
		}

		if (newsDate == Long.MIN_VALUE) {
			pressReleaseImpl.setNewsDate(null);
		}
		else {
			pressReleaseImpl.setNewsDate(new Date(newsDate));
		}

		if (heading == null) {
			pressReleaseImpl.setHeading(StringPool.BLANK);
		}
		else {
			pressReleaseImpl.setHeading(heading);
		}

		if (data == null) {
			pressReleaseImpl.setData(StringPool.BLANK);
		}
		else {
			pressReleaseImpl.setData(data);
		}

		if (description == null) {
			pressReleaseImpl.setDescription(StringPool.BLANK);
		}
		else {
			pressReleaseImpl.setDescription(description);
		}

		if (show == null) {
			pressReleaseImpl.setShow(StringPool.BLANK);
		}
		else {
			pressReleaseImpl.setShow(show);
		}

		if (createdDate == Long.MIN_VALUE) {
			pressReleaseImpl.setCreatedDate(null);
		}
		else {
			pressReleaseImpl.setCreatedDate(new Date(createdDate));
		}

		if (fileName == null) {
			pressReleaseImpl.setFileName(StringPool.BLANK);
		}
		else {
			pressReleaseImpl.setFileName(fileName);
		}

		if (fileURL == null) {
			pressReleaseImpl.setFileURL(StringPool.BLANK);
		}
		else {
			pressReleaseImpl.setFileURL(fileURL);
		}

		pressReleaseImpl.resetOriginalValues();

		return pressReleaseImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		pressId = objectInput.readLong();
		newsYear = objectInput.readUTF();
		newsDate = objectInput.readLong();
		heading = objectInput.readUTF();
		data = objectInput.readUTF();
		description = objectInput.readUTF();
		show = objectInput.readUTF();
		createdDate = objectInput.readLong();
		fileName = objectInput.readUTF();
		fileURL = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(pressId);

		if (newsYear == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newsYear);
		}

		objectOutput.writeLong(newsDate);

		if (heading == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(heading);
		}

		if (data == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(data);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (show == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(show);
		}

		objectOutput.writeLong(createdDate);

		if (fileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileName);
		}

		if (fileURL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileURL);
		}
	}

	public long pressId;
	public String newsYear;
	public long newsDate;
	public String heading;
	public String data;
	public String description;
	public String show;
	public long createdDate;
	public String fileName;
	public String fileURL;
}