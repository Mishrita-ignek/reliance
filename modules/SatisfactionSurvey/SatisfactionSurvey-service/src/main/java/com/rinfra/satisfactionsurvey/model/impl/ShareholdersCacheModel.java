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

package com.rinfra.satisfactionsurvey.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.rinfra.satisfactionsurvey.model.Shareholders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Shareholders in entity cache.
 *
 * @author Mukesh
 * @see Shareholders
 * @generated
 */
@ProviderType
public class ShareholdersCacheModel implements CacheModel<Shareholders>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ShareholdersCacheModel)) {
			return false;
		}

		ShareholdersCacheModel shareholdersCacheModel = (ShareholdersCacheModel)obj;

		if (SOLE_ID == shareholdersCacheModel.SOLE_ID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, SOLE_ID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{SHAREHOLDERSID=");
		sb.append(SHAREHOLDERSID);
		sb.append(", SOLE_ID=");
		sb.append(SOLE_ID);
		sb.append(", SOLE_NAME=");
		sb.append(SOLE_NAME);
		sb.append(", ID_NUMBER=");
		sb.append(ID_NUMBER);
		sb.append(", MOBILE=");
		sb.append(MOBILE);
		sb.append(", TELEPHONE=");
		sb.append(TELEPHONE);
		sb.append(", EMAIL=");
		sb.append(EMAIL);
		sb.append(", QUERY_RESPONSE=");
		sb.append(QUERY_RESPONSE);
		sb.append(", OVERALL_RATING=");
		sb.append(OVERALL_RATING);
		sb.append(", COMP_INFORMATION=");
		sb.append(COMP_INFORMATION);
		sb.append(", QUALITY_REPORT=");
		sb.append(QUALITY_REPORT);
		sb.append(", DESCRIPTION=");
		sb.append(DESCRIPTION);
		sb.append(", COMMENTS=");
		sb.append(COMMENTS);
		sb.append(", GRIEVANCE=");
		sb.append(GRIEVANCE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Shareholders toEntityModel() {
		ShareholdersImpl shareholdersImpl = new ShareholdersImpl();

		shareholdersImpl.setSHAREHOLDERSID(SHAREHOLDERSID);
		shareholdersImpl.setSOLE_ID(SOLE_ID);

		if (SOLE_NAME == null) {
			shareholdersImpl.setSOLE_NAME(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setSOLE_NAME(SOLE_NAME);
		}

		shareholdersImpl.setID_NUMBER(ID_NUMBER);
		shareholdersImpl.setMOBILE(MOBILE);
		shareholdersImpl.setTELEPHONE(TELEPHONE);

		if (EMAIL == null) {
			shareholdersImpl.setEMAIL(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setEMAIL(EMAIL);
		}

		if (QUERY_RESPONSE == null) {
			shareholdersImpl.setQUERY_RESPONSE(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setQUERY_RESPONSE(QUERY_RESPONSE);
		}

		if (OVERALL_RATING == null) {
			shareholdersImpl.setOVERALL_RATING(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setOVERALL_RATING(OVERALL_RATING);
		}

		if (COMP_INFORMATION == null) {
			shareholdersImpl.setCOMP_INFORMATION(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setCOMP_INFORMATION(COMP_INFORMATION);
		}

		if (QUALITY_REPORT == null) {
			shareholdersImpl.setQUALITY_REPORT(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setQUALITY_REPORT(QUALITY_REPORT);
		}

		if (DESCRIPTION == null) {
			shareholdersImpl.setDESCRIPTION(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setDESCRIPTION(DESCRIPTION);
		}

		if (COMMENTS == null) {
			shareholdersImpl.setCOMMENTS(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setCOMMENTS(COMMENTS);
		}

		if (GRIEVANCE == null) {
			shareholdersImpl.setGRIEVANCE(StringPool.BLANK);
		}
		else {
			shareholdersImpl.setGRIEVANCE(GRIEVANCE);
		}

		shareholdersImpl.resetOriginalValues();

		return shareholdersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SHAREHOLDERSID = objectInput.readLong();

		SOLE_ID = objectInput.readLong();
		SOLE_NAME = objectInput.readUTF();

		ID_NUMBER = objectInput.readLong();

		MOBILE = objectInput.readLong();

		TELEPHONE = objectInput.readLong();
		EMAIL = objectInput.readUTF();
		QUERY_RESPONSE = objectInput.readUTF();
		OVERALL_RATING = objectInput.readUTF();
		COMP_INFORMATION = objectInput.readUTF();
		QUALITY_REPORT = objectInput.readUTF();
		DESCRIPTION = objectInput.readUTF();
		COMMENTS = objectInput.readUTF();
		GRIEVANCE = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SHAREHOLDERSID);

		objectOutput.writeLong(SOLE_ID);

		if (SOLE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(SOLE_NAME);
		}

		objectOutput.writeLong(ID_NUMBER);

		objectOutput.writeLong(MOBILE);

		objectOutput.writeLong(TELEPHONE);

		if (EMAIL == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(EMAIL);
		}

		if (QUERY_RESPONSE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUERY_RESPONSE);
		}

		if (OVERALL_RATING == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(OVERALL_RATING);
		}

		if (COMP_INFORMATION == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COMP_INFORMATION);
		}

		if (QUALITY_REPORT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(QUALITY_REPORT);
		}

		if (DESCRIPTION == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DESCRIPTION);
		}

		if (COMMENTS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COMMENTS);
		}

		if (GRIEVANCE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(GRIEVANCE);
		}
	}

	public long SHAREHOLDERSID;
	public long SOLE_ID;
	public String SOLE_NAME;
	public long ID_NUMBER;
	public long MOBILE;
	public long TELEPHONE;
	public String EMAIL;
	public String QUERY_RESPONSE;
	public String OVERALL_RATING;
	public String COMP_INFORMATION;
	public String QUALITY_REPORT;
	public String DESCRIPTION;
	public String COMMENTS;
	public String GRIEVANCE;
}