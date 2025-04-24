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

package com.media.query.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.media.query.model.MediaQuery;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing MediaQuery in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see MediaQuery
 * @generated
 */
@ProviderType
public class MediaQueryCacheModel implements CacheModel<MediaQuery>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof MediaQueryCacheModel)) {
			return false;
		}

		MediaQueryCacheModel mediaQueryCacheModel = (MediaQueryCacheModel)obj;

		if (srNo == mediaQueryCacheModel.srNo) {
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
		sb.append(", journalistName=");
		sb.append(journalistName);
		sb.append(", newsOrganisationName=");
		sb.append(newsOrganisationName);
		sb.append(", organisationType=");
		sb.append(organisationType);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", email=");
		sb.append(email);
		sb.append(", subject=");
		sb.append(subject);
		sb.append(", mediaQuery=");
		sb.append(mediaQuery);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public MediaQuery toEntityModel() {
		MediaQueryImpl mediaQueryImpl = new MediaQueryImpl();

		mediaQueryImpl.setSrNo(srNo);

		if (journalistName == null) {
			mediaQueryImpl.setJournalistName(StringPool.BLANK);
		}
		else {
			mediaQueryImpl.setJournalistName(journalistName);
		}

		if (newsOrganisationName == null) {
			mediaQueryImpl.setNewsOrganisationName(StringPool.BLANK);
		}
		else {
			mediaQueryImpl.setNewsOrganisationName(newsOrganisationName);
		}

		if (organisationType == null) {
			mediaQueryImpl.setOrganisationType(StringPool.BLANK);
		}
		else {
			mediaQueryImpl.setOrganisationType(organisationType);
		}

		if (mobile == null) {
			mediaQueryImpl.setMobile(StringPool.BLANK);
		}
		else {
			mediaQueryImpl.setMobile(mobile);
		}

		if (email == null) {
			mediaQueryImpl.setEmail(StringPool.BLANK);
		}
		else {
			mediaQueryImpl.setEmail(email);
		}

		if (subject == null) {
			mediaQueryImpl.setSubject(StringPool.BLANK);
		}
		else {
			mediaQueryImpl.setSubject(subject);
		}

		if (mediaQuery == null) {
			mediaQueryImpl.setMediaQuery(StringPool.BLANK);
		}
		else {
			mediaQueryImpl.setMediaQuery(mediaQuery);
		}

		mediaQueryImpl.resetOriginalValues();

		return mediaQueryImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		srNo = objectInput.readLong();
		journalistName = objectInput.readUTF();
		newsOrganisationName = objectInput.readUTF();
		organisationType = objectInput.readUTF();
		mobile = objectInput.readUTF();
		email = objectInput.readUTF();
		subject = objectInput.readUTF();
		mediaQuery = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(srNo);

		if (journalistName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(journalistName);
		}

		if (newsOrganisationName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(newsOrganisationName);
		}

		if (organisationType == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(organisationType);
		}

		if (mobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (subject == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(subject);
		}

		if (mediaQuery == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mediaQuery);
		}
	}

	public long srNo;
	public String journalistName;
	public String newsOrganisationName;
	public String organisationType;
	public String mobile;
	public String email;
	public String subject;
	public String mediaQuery;
}