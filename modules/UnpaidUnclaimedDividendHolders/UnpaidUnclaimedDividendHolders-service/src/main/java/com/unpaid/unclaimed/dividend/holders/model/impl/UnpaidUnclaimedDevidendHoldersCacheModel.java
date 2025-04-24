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

package com.unpaid.unclaimed.dividend.holders.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing UnpaidUnclaimedDevidendHolders in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendHolders
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendHoldersCacheModel implements CacheModel<UnpaidUnclaimedDevidendHolders>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UnpaidUnclaimedDevidendHoldersCacheModel)) {
			return false;
		}

		UnpaidUnclaimedDevidendHoldersCacheModel unpaidUnclaimedDevidendHoldersCacheModel =
			(UnpaidUnclaimedDevidendHoldersCacheModel)obj;

		if (SRNO == unpaidUnclaimedDevidendHoldersCacheModel.SRNO) {
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
		StringBundler sb = new StringBundler(35);

		sb.append("{SRNO=");
		sb.append(SRNO);
		sb.append(", FIRST_NAME=");
		sb.append(FIRST_NAME);
		sb.append(", MIDDLE_NAME=");
		sb.append(MIDDLE_NAME);
		sb.append(", LAST_NAME=");
		sb.append(LAST_NAME);
		sb.append(", FATHER_HUSBAND_FIRST_NAME=");
		sb.append(FATHER_HUSBAND_FIRST_NAME);
		sb.append(", FATHER_HUSBAND_MIDDLE_NAME=");
		sb.append(FATHER_HUSBAND_MIDDLE_NAME);
		sb.append(", FATHER_HUSBAND_LAST_NAME=");
		sb.append(FATHER_HUSBAND_LAST_NAME);
		sb.append(", ADDRESS=");
		sb.append(ADDRESS);
		sb.append(", COUNTRY=");
		sb.append(COUNTRY);
		sb.append(", STATE=");
		sb.append(STATE);
		sb.append(", DISTRICT=");
		sb.append(DISTRICT);
		sb.append(", PIN_CODE=");
		sb.append(PIN_CODE);
		sb.append(", FOLIO_NO_OF_ITIES=");
		sb.append(FOLIO_NO_OF_ITIES);
		sb.append(", INVESTMENT_TYPE=");
		sb.append(INVESTMENT_TYPE);
		sb.append(", AMOUNT_DUE_IN_RS=");
		sb.append(AMOUNT_DUE_IN_RS);
		sb.append(", PROPOSED_DATE_TRANSFER_IPEF=");
		sb.append(PROPOSED_DATE_TRANSFER_IPEF);
		sb.append(", CREATEDATE=");
		sb.append(CREATEDATE);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public UnpaidUnclaimedDevidendHolders toEntityModel() {
		UnpaidUnclaimedDevidendHoldersImpl unpaidUnclaimedDevidendHoldersImpl = new UnpaidUnclaimedDevidendHoldersImpl();

		unpaidUnclaimedDevidendHoldersImpl.setSRNO(SRNO);

		if (FIRST_NAME == null) {
			unpaidUnclaimedDevidendHoldersImpl.setFIRST_NAME(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setFIRST_NAME(FIRST_NAME);
		}

		if (MIDDLE_NAME == null) {
			unpaidUnclaimedDevidendHoldersImpl.setMIDDLE_NAME(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setMIDDLE_NAME(MIDDLE_NAME);
		}

		if (LAST_NAME == null) {
			unpaidUnclaimedDevidendHoldersImpl.setLAST_NAME(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setLAST_NAME(LAST_NAME);
		}

		if (FATHER_HUSBAND_FIRST_NAME == null) {
			unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_FIRST_NAME(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_FIRST_NAME(FATHER_HUSBAND_FIRST_NAME);
		}

		if (FATHER_HUSBAND_MIDDLE_NAME == null) {
			unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_MIDDLE_NAME(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_MIDDLE_NAME(FATHER_HUSBAND_MIDDLE_NAME);
		}

		if (FATHER_HUSBAND_LAST_NAME == null) {
			unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_LAST_NAME(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_LAST_NAME(FATHER_HUSBAND_LAST_NAME);
		}

		if (ADDRESS == null) {
			unpaidUnclaimedDevidendHoldersImpl.setADDRESS(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setADDRESS(ADDRESS);
		}

		if (COUNTRY == null) {
			unpaidUnclaimedDevidendHoldersImpl.setCOUNTRY(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setCOUNTRY(COUNTRY);
		}

		if (STATE == null) {
			unpaidUnclaimedDevidendHoldersImpl.setSTATE(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setSTATE(STATE);
		}

		if (DISTRICT == null) {
			unpaidUnclaimedDevidendHoldersImpl.setDISTRICT(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setDISTRICT(DISTRICT);
		}

		unpaidUnclaimedDevidendHoldersImpl.setPIN_CODE(PIN_CODE);

		if (FOLIO_NO_OF_ITIES == null) {
			unpaidUnclaimedDevidendHoldersImpl.setFOLIO_NO_OF_ITIES(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
		}

		if (INVESTMENT_TYPE == null) {
			unpaidUnclaimedDevidendHoldersImpl.setINVESTMENT_TYPE(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setINVESTMENT_TYPE(INVESTMENT_TYPE);
		}

		unpaidUnclaimedDevidendHoldersImpl.setAMOUNT_DUE_IN_RS(AMOUNT_DUE_IN_RS);

		if (PROPOSED_DATE_TRANSFER_IPEF == Long.MIN_VALUE) {
			unpaidUnclaimedDevidendHoldersImpl.setPROPOSED_DATE_TRANSFER_IPEF(null);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setPROPOSED_DATE_TRANSFER_IPEF(new Date(
					PROPOSED_DATE_TRANSFER_IPEF));
		}

		if (CREATEDATE == Long.MIN_VALUE) {
			unpaidUnclaimedDevidendHoldersImpl.setCREATEDATE(null);
		}
		else {
			unpaidUnclaimedDevidendHoldersImpl.setCREATEDATE(new Date(
					CREATEDATE));
		}

		unpaidUnclaimedDevidendHoldersImpl.resetOriginalValues();

		return unpaidUnclaimedDevidendHoldersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SRNO = objectInput.readLong();
		FIRST_NAME = objectInput.readUTF();
		MIDDLE_NAME = objectInput.readUTF();
		LAST_NAME = objectInput.readUTF();
		FATHER_HUSBAND_FIRST_NAME = objectInput.readUTF();
		FATHER_HUSBAND_MIDDLE_NAME = objectInput.readUTF();
		FATHER_HUSBAND_LAST_NAME = objectInput.readUTF();
		ADDRESS = objectInput.readUTF();
		COUNTRY = objectInput.readUTF();
		STATE = objectInput.readUTF();
		DISTRICT = objectInput.readUTF();

		PIN_CODE = objectInput.readLong();
		FOLIO_NO_OF_ITIES = objectInput.readUTF();
		INVESTMENT_TYPE = objectInput.readUTF();

		AMOUNT_DUE_IN_RS = objectInput.readDouble();
		PROPOSED_DATE_TRANSFER_IPEF = objectInput.readLong();
		CREATEDATE = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SRNO);

		if (FIRST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FIRST_NAME);
		}

		if (MIDDLE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(MIDDLE_NAME);
		}

		if (LAST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(LAST_NAME);
		}

		if (FATHER_HUSBAND_FIRST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FATHER_HUSBAND_FIRST_NAME);
		}

		if (FATHER_HUSBAND_MIDDLE_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FATHER_HUSBAND_MIDDLE_NAME);
		}

		if (FATHER_HUSBAND_LAST_NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FATHER_HUSBAND_LAST_NAME);
		}

		if (ADDRESS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADDRESS);
		}

		if (COUNTRY == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(COUNTRY);
		}

		if (STATE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(STATE);
		}

		if (DISTRICT == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(DISTRICT);
		}

		objectOutput.writeLong(PIN_CODE);

		if (FOLIO_NO_OF_ITIES == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FOLIO_NO_OF_ITIES);
		}

		if (INVESTMENT_TYPE == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(INVESTMENT_TYPE);
		}

		objectOutput.writeDouble(AMOUNT_DUE_IN_RS);
		objectOutput.writeLong(PROPOSED_DATE_TRANSFER_IPEF);
		objectOutput.writeLong(CREATEDATE);
	}

	public long SRNO;
	public String FIRST_NAME;
	public String MIDDLE_NAME;
	public String LAST_NAME;
	public String FATHER_HUSBAND_FIRST_NAME;
	public String FATHER_HUSBAND_MIDDLE_NAME;
	public String FATHER_HUSBAND_LAST_NAME;
	public String ADDRESS;
	public String COUNTRY;
	public String STATE;
	public String DISTRICT;
	public long PIN_CODE;
	public String FOLIO_NO_OF_ITIES;
	public String INVESTMENT_TYPE;
	public double AMOUNT_DUE_IN_RS;
	public long PROPOSED_DATE_TRANSFER_IPEF;
	public long CREATEDATE;
}