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

import com.reliance.reality.model.RelianceReality;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing RelianceReality in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see RelianceReality
 * @generated
 */
@ProviderType
public class RelianceRealityCacheModel implements CacheModel<RelianceReality>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RelianceRealityCacheModel)) {
			return false;
		}

		RelianceRealityCacheModel relianceRealityCacheModel = (RelianceRealityCacheModel)obj;

		if (r_Id == relianceRealityCacheModel.r_Id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, r_Id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{r_Id=");
		sb.append(r_Id);
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
		sb.append(", propertyId=");
		sb.append(propertyId);
		sb.append(", offerPrice=");
		sb.append(offerPrice);
		sb.append(", funding=");
		sb.append(funding);
		sb.append(", days=");
		sb.append(days);
		sb.append(", empcode=");
		sb.append(empcode);
		sb.append(", name=");
		sb.append(name);
		sb.append(", email_id=");
		sb.append(email_id);
		sb.append(", mobile=");
		sb.append(mobile);
		sb.append(", ageOfProperty=");
		sb.append(ageOfProperty);
		sb.append(", groupCompanyName=");
		sb.append(groupCompanyName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RelianceReality toEntityModel() {
		RelianceRealityImpl relianceRealityImpl = new RelianceRealityImpl();

		relianceRealityImpl.setR_Id(r_Id);

		if (city == null) {
			relianceRealityImpl.setCity(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setCity(city);
		}

		if (location == null) {
			relianceRealityImpl.setLocation(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setLocation(location);
		}

		if (address == null) {
			relianceRealityImpl.setAddress(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setAddress(address);
		}

		if (area == null) {
			relianceRealityImpl.setArea(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setArea(area);
		}

		if (type == null) {
			relianceRealityImpl.setType(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setType(type);
		}

		relianceRealityImpl.setGuidancePrice(guidancePrice);

		if (propertyId == null) {
			relianceRealityImpl.setPropertyId(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setPropertyId(propertyId);
		}

		if (offerPrice == null) {
			relianceRealityImpl.setOfferPrice(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setOfferPrice(offerPrice);
		}

		if (funding == null) {
			relianceRealityImpl.setFunding(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setFunding(funding);
		}

		relianceRealityImpl.setDays(days);

		if (empcode == null) {
			relianceRealityImpl.setEmpcode(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setEmpcode(empcode);
		}

		if (name == null) {
			relianceRealityImpl.setName(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setName(name);
		}

		if (email_id == null) {
			relianceRealityImpl.setEmail_id(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setEmail_id(email_id);
		}

		if (mobile == null) {
			relianceRealityImpl.setMobile(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setMobile(mobile);
		}

		if (ageOfProperty == null) {
			relianceRealityImpl.setAgeOfProperty(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setAgeOfProperty(ageOfProperty);
		}

		if (groupCompanyName == null) {
			relianceRealityImpl.setGroupCompanyName(StringPool.BLANK);
		}
		else {
			relianceRealityImpl.setGroupCompanyName(groupCompanyName);
		}

		if (createDate == Long.MIN_VALUE) {
			relianceRealityImpl.setCreateDate(null);
		}
		else {
			relianceRealityImpl.setCreateDate(new Date(createDate));
		}

		relianceRealityImpl.resetOriginalValues();

		return relianceRealityImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		r_Id = objectInput.readLong();
		city = objectInput.readUTF();
		location = objectInput.readUTF();
		address = objectInput.readUTF();
		area = objectInput.readUTF();
		type = objectInput.readUTF();

		guidancePrice = objectInput.readLong();
		propertyId = objectInput.readUTF();
		offerPrice = objectInput.readUTF();
		funding = objectInput.readUTF();

		days = objectInput.readLong();
		empcode = objectInput.readUTF();
		name = objectInput.readUTF();
		email_id = objectInput.readUTF();
		mobile = objectInput.readUTF();
		ageOfProperty = objectInput.readUTF();
		groupCompanyName = objectInput.readUTF();
		createDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(r_Id);

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

		objectOutput.writeLong(guidancePrice);

		if (propertyId == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(propertyId);
		}

		if (offerPrice == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(offerPrice);
		}

		if (funding == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(funding);
		}

		objectOutput.writeLong(days);

		if (empcode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(empcode);
		}

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (email_id == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email_id);
		}

		if (mobile == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(mobile);
		}

		if (ageOfProperty == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ageOfProperty);
		}

		if (groupCompanyName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(groupCompanyName);
		}

		objectOutput.writeLong(createDate);
	}

	public long r_Id;
	public String city;
	public String location;
	public String address;
	public String area;
	public String type;
	public long guidancePrice;
	public String propertyId;
	public String offerPrice;
	public String funding;
	public long days;
	public String empcode;
	public String name;
	public String email_id;
	public String mobile;
	public String ageOfProperty;
	public String groupCompanyName;
	public long createDate;
}