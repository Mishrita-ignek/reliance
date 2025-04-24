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

package com.reliance.reality.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.reliance.reality.service.http.RelianceRealityServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.reliance.reality.service.http.RelianceRealityServiceSoap
 * @generated
 */
@ProviderType
public class RelianceRealitySoap implements Serializable {
	public static RelianceRealitySoap toSoapModel(RelianceReality model) {
		RelianceRealitySoap soapModel = new RelianceRealitySoap();

		soapModel.setR_Id(model.getR_Id());
		soapModel.setCity(model.getCity());
		soapModel.setLocation(model.getLocation());
		soapModel.setAddress(model.getAddress());
		soapModel.setArea(model.getArea());
		soapModel.setType(model.getType());
		soapModel.setGuidancePrice(model.getGuidancePrice());
		soapModel.setPropertyId(model.getPropertyId());
		soapModel.setOfferPrice(model.getOfferPrice());
		soapModel.setFunding(model.getFunding());
		soapModel.setDays(model.getDays());
		soapModel.setEmpcode(model.getEmpcode());
		soapModel.setName(model.getName());
		soapModel.setEmail_id(model.getEmail_id());
		soapModel.setMobile(model.getMobile());
		soapModel.setAgeOfProperty(model.getAgeOfProperty());
		soapModel.setGroupCompanyName(model.getGroupCompanyName());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static RelianceRealitySoap[] toSoapModels(RelianceReality[] models) {
		RelianceRealitySoap[] soapModels = new RelianceRealitySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RelianceRealitySoap[][] toSoapModels(
		RelianceReality[][] models) {
		RelianceRealitySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RelianceRealitySoap[models.length][models[0].length];
		}
		else {
			soapModels = new RelianceRealitySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RelianceRealitySoap[] toSoapModels(
		List<RelianceReality> models) {
		List<RelianceRealitySoap> soapModels = new ArrayList<RelianceRealitySoap>(models.size());

		for (RelianceReality model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RelianceRealitySoap[soapModels.size()]);
	}

	public RelianceRealitySoap() {
	}

	public long getPrimaryKey() {
		return _r_Id;
	}

	public void setPrimaryKey(long pk) {
		setR_Id(pk);
	}

	public long getR_Id() {
		return _r_Id;
	}

	public void setR_Id(long r_Id) {
		_r_Id = r_Id;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getArea() {
		return _area;
	}

	public void setArea(String area) {
		_area = area;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public long getGuidancePrice() {
		return _guidancePrice;
	}

	public void setGuidancePrice(long guidancePrice) {
		_guidancePrice = guidancePrice;
	}

	public String getPropertyId() {
		return _propertyId;
	}

	public void setPropertyId(String propertyId) {
		_propertyId = propertyId;
	}

	public String getOfferPrice() {
		return _offerPrice;
	}

	public void setOfferPrice(String offerPrice) {
		_offerPrice = offerPrice;
	}

	public String getFunding() {
		return _funding;
	}

	public void setFunding(String funding) {
		_funding = funding;
	}

	public long getDays() {
		return _days;
	}

	public void setDays(long days) {
		_days = days;
	}

	public String getEmpcode() {
		return _empcode;
	}

	public void setEmpcode(String empcode) {
		_empcode = empcode;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getEmail_id() {
		return _email_id;
	}

	public void setEmail_id(String email_id) {
		_email_id = email_id;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getAgeOfProperty() {
		return _ageOfProperty;
	}

	public void setAgeOfProperty(String ageOfProperty) {
		_ageOfProperty = ageOfProperty;
	}

	public String getGroupCompanyName() {
		return _groupCompanyName;
	}

	public void setGroupCompanyName(String groupCompanyName) {
		_groupCompanyName = groupCompanyName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _r_Id;
	private String _city;
	private String _location;
	private String _address;
	private String _area;
	private String _type;
	private long _guidancePrice;
	private String _propertyId;
	private String _offerPrice;
	private String _funding;
	private long _days;
	private String _empcode;
	private String _name;
	private String _email_id;
	private String _mobile;
	private String _ageOfProperty;
	private String _groupCompanyName;
	private Date _createDate;
}