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

package com.reliance.reality.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.reliance.reality.model.RealityPropertyMaster;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RealityPropertyMaster in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMaster
 * @generated
 */
@ProviderType
public class RealityPropertyMasterCacheModel implements CacheModel<RealityPropertyMaster>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RealityPropertyMasterCacheModel)) {
			return false;
		}

		RealityPropertyMasterCacheModel realityPropertyMasterCacheModel = (RealityPropertyMasterCacheModel)obj;

		if (property_ID == realityPropertyMasterCacheModel.property_ID) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, property_ID);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{property_ID=");
		sb.append(property_ID);
		sb.append(", city=");
		sb.append(city);
		sb.append(", location=");
		sb.append(location);
		sb.append(", address=");
		sb.append(address);
		sb.append(", area=");
		sb.append(area);
		sb.append(", type=");
		sb.append(type);
		sb.append(", guidancePrice=");
		sb.append(guidancePrice);
		sb.append(", propertyBid=");
		sb.append(propertyBid);
		sb.append(", offerPrice=");
		sb.append(offerPrice);
		sb.append(", ageOfProperty=");
		sb.append(ageOfProperty);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RealityPropertyMaster toEntityModel() {
		RealityPropertyMasterImpl realityPropertyMasterImpl = new RealityPropertyMasterImpl();

		realityPropertyMasterImpl.setProperty_ID(property_ID);

		if (city == null) {
			realityPropertyMasterImpl.setCity(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setCity(city);
		}

		if (location == null) {
			realityPropertyMasterImpl.setLocation(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setLocation(location);
		}

		if (address == null) {
			realityPropertyMasterImpl.setAddress(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setAddress(address);
		}

		if (area == null) {
			realityPropertyMasterImpl.setArea(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setArea(area);
		}

		if (type == null) {
			realityPropertyMasterImpl.setType(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setType(type);
		}

		if (guidancePrice == null) {
			realityPropertyMasterImpl.setGuidancePrice(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setGuidancePrice(guidancePrice);
		}

		realityPropertyMasterImpl.setPropertyBid(propertyBid);

		if (offerPrice == null) {
			realityPropertyMasterImpl.setOfferPrice(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setOfferPrice(offerPrice);
		}

		if (ageOfProperty == null) {
			realityPropertyMasterImpl.setAgeOfProperty(StringPool.BLANK);
		}
		else {
			realityPropertyMasterImpl.setAgeOfProperty(ageOfProperty);
		}

		if (createDate == Long.MIN_VALUE) {
			realityPropertyMasterImpl.setCreateDate(null);
		}
		else {
			realityPropertyMasterImpl.setCreateDate(new Date(createDate));
		}

		realityPropertyMasterImpl.resetOriginalValues();

		return realityPropertyMasterImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		property_ID = objectInput.readLong();
		city = objectInput.readUTF();
		location = objectInput.readUTF();
		address = objectInput.readUTF();
		area = objectInput.readUTF();
		type = objectInput.readUTF();
		guidancePrice = objectInput.readUTF();

		propertyBid = objectInput.readLong();
		offerPrice = objectInput.readUTF();
		ageOfProperty = objectInput.readUTF();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(property_ID);

		if (city == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(city);
		}

		if (location == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(location);
		}

		if (address == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(address);
		}

		if (area == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(area);
		}

		if (type == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (guidancePrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(guidancePrice);
		}

		objectOutput.writeLong(propertyBid);

		if (offerPrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(offerPrice);
		}

		if (ageOfProperty == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ageOfProperty);
		}

		objectOutput.writeLong(createDate);
	}

	public long property_ID;
	public String city;
	public String location;
	public String address;
	public String area;
	public String type;
	public String guidancePrice;
	public long propertyBid;
	public String offerPrice;
	public String ageOfProperty;
	public long createDate;
}