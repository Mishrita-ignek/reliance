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

package com.rinfra.news.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.rinfra.news.model.PressNews;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PressNews in entity cache.
 *
 * @author Vipin Singh
 * @see PressNews
 * @generated
 */
@ProviderType
public class PressNewsCacheModel implements CacheModel<PressNews>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PressNewsCacheModel)) {
			return false;
		}

		PressNewsCacheModel pressNewsCacheModel = (PressNewsCacheModel)obj;

		if (newsId == pressNewsCacheModel.newsId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, newsId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{newsId=");
		sb.append(newsId);
		sb.append(", headLine=");
		sb.append(headLine);
		sb.append(", publication=");
		sb.append(publication);
		sb.append(", downloadUrl=");
		sb.append(downloadUrl);
		sb.append(", fileName=");
		sb.append(fileName);
		sb.append(", date=");
		sb.append(date);
		sb.append(", year=");
		sb.append(year);
		sb.append(", month=");
		sb.append(month);
		sb.append(", show=");
		sb.append(show);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public PressNews toEntityModel() {
		PressNewsImpl pressNewsImpl = new PressNewsImpl();

		pressNewsImpl.setNewsId(newsId);

		if (headLine == null) {
			pressNewsImpl.setHeadLine(StringPool.BLANK);
		}
		else {
			pressNewsImpl.setHeadLine(headLine);
		}

		if (publication == null) {
			pressNewsImpl.setPublication(StringPool.BLANK);
		}
		else {
			pressNewsImpl.setPublication(publication);
		}

		if (downloadUrl == null) {
			pressNewsImpl.setDownloadUrl(StringPool.BLANK);
		}
		else {
			pressNewsImpl.setDownloadUrl(downloadUrl);
		}

		if (fileName == null) {
			pressNewsImpl.setFileName(StringPool.BLANK);
		}
		else {
			pressNewsImpl.setFileName(fileName);
		}

		if (date == Long.MIN_VALUE) {
			pressNewsImpl.setDate(null);
		}
		else {
			pressNewsImpl.setDate(new Date(date));
		}

		pressNewsImpl.setYear(year);
		pressNewsImpl.setMonth(month);

		if (show == null) {
			pressNewsImpl.setShow(StringPool.BLANK);
		}
		else {
			pressNewsImpl.setShow(show);
		}

		pressNewsImpl.resetOriginalValues();

		return pressNewsImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		newsId = objectInput.readLong();
		headLine = objectInput.readUTF();
		publication = objectInput.readUTF();
		downloadUrl = objectInput.readUTF();
		fileName = objectInput.readUTF();
		date = objectInput.readLong();

		year = objectInput.readInt();

		month = objectInput.readInt();
		show = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(newsId);

		if (headLine == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(headLine);
		}

		if (publication == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(publication);
		}

		if (downloadUrl == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(downloadUrl);
		}

		if (fileName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fileName);
		}

		objectOutput.writeLong(date);

		objectOutput.writeInt(year);

		objectOutput.writeInt(month);

		if (show == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(show);
		}
	}

	public long newsId;
	public String headLine;
	public String publication;
	public String downloadUrl;
	public String fileName;
	public long date;
	public int year;
	public int month;
	public String show;
}