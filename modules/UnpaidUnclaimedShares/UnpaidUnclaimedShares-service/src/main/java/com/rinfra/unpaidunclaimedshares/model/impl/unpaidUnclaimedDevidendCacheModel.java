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

package com.rinfra.unpaidunclaimedshares.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing unpaidUnclaimedDevidend in entity cache.
 *
 * @author Mukesh Patidar
 * @see unpaidUnclaimedDevidend
 * @generated
 */
@ProviderType
public class unpaidUnclaimedDevidendCacheModel implements CacheModel<unpaidUnclaimedDevidend>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof unpaidUnclaimedDevidendCacheModel)) {
			return false;
		}

		unpaidUnclaimedDevidendCacheModel unpaidUnclaimedDevidendCacheModel = (unpaidUnclaimedDevidendCacheModel)obj;

		if (SRNO == unpaidUnclaimedDevidendCacheModel.SRNO) {
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
		StringBundler sb = new StringBundler(27);

		sb.append("{SRNO=");
		sb.append(SRNO);
		sb.append(", FOLIO_NO=");
		sb.append(FOLIO_NO);
		sb.append(", NAME=");
		sb.append(NAME);
		sb.append(", ADD1=");
		sb.append(ADD1);
		sb.append(", ADD2=");
		sb.append(ADD2);
		sb.append(", ADD3=");
		sb.append(ADD3);
		sb.append(", ADD4=");
		sb.append(ADD4);
		sb.append(", ADD5=");
		sb.append(ADD5);
		sb.append(", ADD6=");
		sb.append(ADD6);
		sb.append(", JT1=");
		sb.append(JT1);
		sb.append(", JT2=");
		sb.append(JT2);
		sb.append(", JT3=");
		sb.append(JT3);
		sb.append(", SHARES=");
		sb.append(SHARES);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public unpaidUnclaimedDevidend toEntityModel() {
		unpaidUnclaimedDevidendImpl unpaidUnclaimedDevidendImpl = new unpaidUnclaimedDevidendImpl();

		unpaidUnclaimedDevidendImpl.setSRNO(SRNO);

		if (FOLIO_NO == null) {
			unpaidUnclaimedDevidendImpl.setFOLIO_NO(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setFOLIO_NO(FOLIO_NO);
		}

		if (NAME == null) {
			unpaidUnclaimedDevidendImpl.setNAME(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setNAME(NAME);
		}

		if (ADD1 == null) {
			unpaidUnclaimedDevidendImpl.setADD1(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setADD1(ADD1);
		}

		if (ADD2 == null) {
			unpaidUnclaimedDevidendImpl.setADD2(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setADD2(ADD2);
		}

		if (ADD3 == null) {
			unpaidUnclaimedDevidendImpl.setADD3(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setADD3(ADD3);
		}

		if (ADD4 == null) {
			unpaidUnclaimedDevidendImpl.setADD4(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setADD4(ADD4);
		}

		if (ADD5 == null) {
			unpaidUnclaimedDevidendImpl.setADD5(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setADD5(ADD5);
		}

		if (ADD6 == null) {
			unpaidUnclaimedDevidendImpl.setADD6(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setADD6(ADD6);
		}

		if (JT1 == null) {
			unpaidUnclaimedDevidendImpl.setJT1(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setJT1(JT1);
		}

		if (JT2 == null) {
			unpaidUnclaimedDevidendImpl.setJT2(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setJT2(JT2);
		}

		if (JT3 == null) {
			unpaidUnclaimedDevidendImpl.setJT3(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setJT3(JT3);
		}

		if (SHARES == null) {
			unpaidUnclaimedDevidendImpl.setSHARES(StringPool.BLANK);
		}
		else {
			unpaidUnclaimedDevidendImpl.setSHARES(SHARES);
		}

		unpaidUnclaimedDevidendImpl.resetOriginalValues();

		return unpaidUnclaimedDevidendImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SRNO = objectInput.readLong();
		FOLIO_NO = objectInput.readUTF();
		NAME = objectInput.readUTF();
		ADD1 = objectInput.readUTF();
		ADD2 = objectInput.readUTF();
		ADD3 = objectInput.readUTF();
		ADD4 = objectInput.readUTF();
		ADD5 = objectInput.readUTF();
		ADD6 = objectInput.readUTF();
		JT1 = objectInput.readUTF();
		JT2 = objectInput.readUTF();
		JT3 = objectInput.readUTF();
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

		if (NAME == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(NAME);
		}

		if (ADD1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADD1);
		}

		if (ADD2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADD2);
		}

		if (ADD3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADD3);
		}

		if (ADD4 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADD4);
		}

		if (ADD5 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADD5);
		}

		if (ADD6 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ADD6);
		}

		if (JT1 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(JT1);
		}

		if (JT2 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(JT2);
		}

		if (JT3 == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(JT3);
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
	public String NAME;
	public String ADD1;
	public String ADD2;
	public String ADD3;
	public String ADD4;
	public String ADD5;
	public String ADD6;
	public String JT1;
	public String JT2;
	public String JT3;
	public String SHARES;
}