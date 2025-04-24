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

package com.rinfra.annual.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.rinfra.annual.model.AnnualReport;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing AnnualReport in entity cache.
 *
 * @author MukeshPatidar
 * @see AnnualReport
 * @generated
 */
@ProviderType
public class AnnualReportCacheModel implements CacheModel<AnnualReport>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AnnualReportCacheModel)) {
			return false;
		}

		AnnualReportCacheModel annualReportCacheModel = (AnnualReportCacheModel)obj;

		if (SRNO == annualReportCacheModel.SRNO) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{SRNO=");
		sb.append(SRNO);
		sb.append(", FINANCIAL_YEARS=");
		sb.append(FINANCIAL_YEARS);
		sb.append(", FINANCIALDATA=");
		sb.append(FINANCIALDATA);
		sb.append(", FINANCIAL_DATALINK=");
		sb.append(FINANCIAL_DATALINK);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public AnnualReport toEntityModel() {
		AnnualReportImpl annualReportImpl = new AnnualReportImpl();

		annualReportImpl.setSRNO(SRNO);

		if (FINANCIAL_YEARS == null) {
			annualReportImpl.setFINANCIAL_YEARS(StringPool.BLANK);
		}
		else {
			annualReportImpl.setFINANCIAL_YEARS(FINANCIAL_YEARS);
		}

		if (FINANCIALDATA == null) {
			annualReportImpl.setFINANCIALDATA(StringPool.BLANK);
		}
		else {
			annualReportImpl.setFINANCIALDATA(FINANCIALDATA);
		}

		if (FINANCIAL_DATALINK == null) {
			annualReportImpl.setFINANCIAL_DATALINK(StringPool.BLANK);
		}
		else {
			annualReportImpl.setFINANCIAL_DATALINK(FINANCIAL_DATALINK);
		}

		annualReportImpl.resetOriginalValues();

		return annualReportImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		SRNO = objectInput.readLong();
		FINANCIAL_YEARS = objectInput.readUTF();
		FINANCIALDATA = objectInput.readUTF();
		FINANCIAL_DATALINK = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(SRNO);

		if (FINANCIAL_YEARS == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FINANCIAL_YEARS);
		}

		if (FINANCIALDATA == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FINANCIALDATA);
		}

		if (FINANCIAL_DATALINK == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(FINANCIAL_DATALINK);
		}
	}

	public long SRNO;
	public String FINANCIAL_YEARS;
	public String FINANCIALDATA;
	public String FINANCIAL_DATALINK;
}