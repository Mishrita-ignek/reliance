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
 * This class is used by SOAP remote services, specifically {@link com.reliance.reality.service.http.RealityPropertyMasterServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.reliance.reality.service.http.RealityPropertyMasterServiceSoap
 * @generated
 */
@ProviderType
public class RealityPropertyMasterSoap implements Serializable {
	public static RealityPropertyMasterSoap toSoapModel(
		RealityPropertyMaster model) {
		RealityPropertyMasterSoap soapModel = new RealityPropertyMasterSoap();

		soapModel.setProperty_ID(model.getProperty_ID());
		soapModel.setCity(model.getCity());
		soapModel.setLocation(model.getLocation());
		soapModel.setAddress(model.getAddress());
		soapModel.setArea(model.getArea());
		soapModel.setType(model.getType());
		soapModel.setGuidancePrice(model.getGuidancePrice());
		soapModel.setPropertyBid(model.getPropertyBid());
		soapModel.setOfferPrice(model.getOfferPrice());
		soapModel.setAgeOfProperty(model.getAgeOfProperty());
		soapModel.setCreateDate(model.getCreateDate());

		return soapModel;
	}

	public static RealityPropertyMasterSoap[] toSoapModels(
		RealityPropertyMaster[] models) {
		RealityPropertyMasterSoap[] soapModels = new RealityPropertyMasterSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RealityPropertyMasterSoap[][] toSoapModels(
		RealityPropertyMaster[][] models) {
		RealityPropertyMasterSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RealityPropertyMasterSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RealityPropertyMasterSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RealityPropertyMasterSoap[] toSoapModels(
		List<RealityPropertyMaster> models) {
		List<RealityPropertyMasterSoap> soapModels = new ArrayList<RealityPropertyMasterSoap>(models.size());

		for (RealityPropertyMaster model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RealityPropertyMasterSoap[soapModels.size()]);
	}

	public RealityPropertyMasterSoap() {
	}

	public long getPrimaryKey() {
		return _property_ID;
	}

	public void setPrimaryKey(long pk) {
		setProperty_ID(pk);
	}

	public long getProperty_ID() {
		return _property_ID;
	}

	public void setProperty_ID(long property_ID) {
		_property_ID = property_ID;
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

	public String getGuidancePrice() {
		return _guidancePrice;
	}

	public void setGuidancePrice(String guidancePrice) {
		_guidancePrice = guidancePrice;
	}

	public long getPropertyBid() {
		return _propertyBid;
	}

	public void setPropertyBid(long propertyBid) {
		_propertyBid = propertyBid;
	}

	public String getOfferPrice() {
		return _offerPrice;
	}

	public void setOfferPrice(String offerPrice) {
		_offerPrice = offerPrice;
	}

	public String getAgeOfProperty() {
		return _ageOfProperty;
	}

	public void setAgeOfProperty(String ageOfProperty) {
		_ageOfProperty = ageOfProperty;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	private long _property_ID;
	private String _city;
	private String _location;
	private String _address;
	private String _area;
	private String _type;
	private String _guidancePrice;
	private long _propertyBid;
	private String _offerPrice;
	private String _ageOfProperty;
	private Date _createDate;
}