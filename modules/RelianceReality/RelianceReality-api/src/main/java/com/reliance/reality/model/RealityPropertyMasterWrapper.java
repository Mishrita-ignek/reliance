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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link RealityPropertyMaster}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMaster
 * @generated
 */
@ProviderType
public class RealityPropertyMasterWrapper implements RealityPropertyMaster,
	ModelWrapper<RealityPropertyMaster> {
	public RealityPropertyMasterWrapper(
		RealityPropertyMaster realityPropertyMaster) {
		_realityPropertyMaster = realityPropertyMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return RealityPropertyMaster.class;
	}

	@Override
	public String getModelClassName() {
		return RealityPropertyMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("property_ID", getProperty_ID());
		attributes.put("city", getCity());
		attributes.put("location", getLocation());
		attributes.put("address", getAddress());
		attributes.put("area", getArea());
		attributes.put("type", getType());
		attributes.put("guidancePrice", getGuidancePrice());
		attributes.put("propertyBid", getPropertyBid());
		attributes.put("offerPrice", getOfferPrice());
		attributes.put("ageOfProperty", getAgeOfProperty());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long property_ID = (Long)attributes.get("property_ID");

		if (property_ID != null) {
			setProperty_ID(property_ID);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String area = (String)attributes.get("area");

		if (area != null) {
			setArea(area);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String guidancePrice = (String)attributes.get("guidancePrice");

		if (guidancePrice != null) {
			setGuidancePrice(guidancePrice);
		}

		Long propertyBid = (Long)attributes.get("propertyBid");

		if (propertyBid != null) {
			setPropertyBid(propertyBid);
		}

		String offerPrice = (String)attributes.get("offerPrice");

		if (offerPrice != null) {
			setOfferPrice(offerPrice);
		}

		String ageOfProperty = (String)attributes.get("ageOfProperty");

		if (ageOfProperty != null) {
			setAgeOfProperty(ageOfProperty);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@Override
	public RealityPropertyMaster toEscapedModel() {
		return new RealityPropertyMasterWrapper(_realityPropertyMaster.toEscapedModel());
	}

	@Override
	public RealityPropertyMaster toUnescapedModel() {
		return new RealityPropertyMasterWrapper(_realityPropertyMaster.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _realityPropertyMaster.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _realityPropertyMaster.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _realityPropertyMaster.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _realityPropertyMaster.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RealityPropertyMaster> toCacheModel() {
		return _realityPropertyMaster.toCacheModel();
	}

	@Override
	public int compareTo(RealityPropertyMaster realityPropertyMaster) {
		return _realityPropertyMaster.compareTo(realityPropertyMaster);
	}

	@Override
	public int hashCode() {
		return _realityPropertyMaster.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _realityPropertyMaster.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RealityPropertyMasterWrapper((RealityPropertyMaster)_realityPropertyMaster.clone());
	}

	/**
	* Returns the address of this reality property master.
	*
	* @return the address of this reality property master
	*/
	@Override
	public java.lang.String getAddress() {
		return _realityPropertyMaster.getAddress();
	}

	/**
	* Returns the age of property of this reality property master.
	*
	* @return the age of property of this reality property master
	*/
	@Override
	public java.lang.String getAgeOfProperty() {
		return _realityPropertyMaster.getAgeOfProperty();
	}

	/**
	* Returns the area of this reality property master.
	*
	* @return the area of this reality property master
	*/
	@Override
	public java.lang.String getArea() {
		return _realityPropertyMaster.getArea();
	}

	/**
	* Returns the city of this reality property master.
	*
	* @return the city of this reality property master
	*/
	@Override
	public java.lang.String getCity() {
		return _realityPropertyMaster.getCity();
	}

	/**
	* Returns the guidance price of this reality property master.
	*
	* @return the guidance price of this reality property master
	*/
	@Override
	public java.lang.String getGuidancePrice() {
		return _realityPropertyMaster.getGuidancePrice();
	}

	/**
	* Returns the location of this reality property master.
	*
	* @return the location of this reality property master
	*/
	@Override
	public java.lang.String getLocation() {
		return _realityPropertyMaster.getLocation();
	}

	/**
	* Returns the offer price of this reality property master.
	*
	* @return the offer price of this reality property master
	*/
	@Override
	public java.lang.String getOfferPrice() {
		return _realityPropertyMaster.getOfferPrice();
	}

	/**
	* Returns the type of this reality property master.
	*
	* @return the type of this reality property master
	*/
	@Override
	public java.lang.String getType() {
		return _realityPropertyMaster.getType();
	}

	@Override
	public java.lang.String toString() {
		return _realityPropertyMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _realityPropertyMaster.toXmlString();
	}

	/**
	* Returns the create date of this reality property master.
	*
	* @return the create date of this reality property master
	*/
	@Override
	public Date getCreateDate() {
		return _realityPropertyMaster.getCreateDate();
	}

	/**
	* Returns the primary key of this reality property master.
	*
	* @return the primary key of this reality property master
	*/
	@Override
	public long getPrimaryKey() {
		return _realityPropertyMaster.getPrimaryKey();
	}

	/**
	* Returns the property bid of this reality property master.
	*
	* @return the property bid of this reality property master
	*/
	@Override
	public long getPropertyBid() {
		return _realityPropertyMaster.getPropertyBid();
	}

	/**
	* Returns the property_id of this reality property master.
	*
	* @return the property_id of this reality property master
	*/
	@Override
	public long getProperty_ID() {
		return _realityPropertyMaster.getProperty_ID();
	}

	@Override
	public void persist() {
		_realityPropertyMaster.persist();
	}

	/**
	* Sets the address of this reality property master.
	*
	* @param address the address of this reality property master
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_realityPropertyMaster.setAddress(address);
	}

	/**
	* Sets the age of property of this reality property master.
	*
	* @param ageOfProperty the age of property of this reality property master
	*/
	@Override
	public void setAgeOfProperty(java.lang.String ageOfProperty) {
		_realityPropertyMaster.setAgeOfProperty(ageOfProperty);
	}

	/**
	* Sets the area of this reality property master.
	*
	* @param area the area of this reality property master
	*/
	@Override
	public void setArea(java.lang.String area) {
		_realityPropertyMaster.setArea(area);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_realityPropertyMaster.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this reality property master.
	*
	* @param city the city of this reality property master
	*/
	@Override
	public void setCity(java.lang.String city) {
		_realityPropertyMaster.setCity(city);
	}

	/**
	* Sets the create date of this reality property master.
	*
	* @param createDate the create date of this reality property master
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_realityPropertyMaster.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_realityPropertyMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_realityPropertyMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_realityPropertyMaster.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the guidance price of this reality property master.
	*
	* @param guidancePrice the guidance price of this reality property master
	*/
	@Override
	public void setGuidancePrice(java.lang.String guidancePrice) {
		_realityPropertyMaster.setGuidancePrice(guidancePrice);
	}

	/**
	* Sets the location of this reality property master.
	*
	* @param location the location of this reality property master
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_realityPropertyMaster.setLocation(location);
	}

	@Override
	public void setNew(boolean n) {
		_realityPropertyMaster.setNew(n);
	}

	/**
	* Sets the offer price of this reality property master.
	*
	* @param offerPrice the offer price of this reality property master
	*/
	@Override
	public void setOfferPrice(java.lang.String offerPrice) {
		_realityPropertyMaster.setOfferPrice(offerPrice);
	}

	/**
	* Sets the primary key of this reality property master.
	*
	* @param primaryKey the primary key of this reality property master
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_realityPropertyMaster.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_realityPropertyMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the property bid of this reality property master.
	*
	* @param propertyBid the property bid of this reality property master
	*/
	@Override
	public void setPropertyBid(long propertyBid) {
		_realityPropertyMaster.setPropertyBid(propertyBid);
	}

	/**
	* Sets the property_id of this reality property master.
	*
	* @param property_ID the property_id of this reality property master
	*/
	@Override
	public void setProperty_ID(long property_ID) {
		_realityPropertyMaster.setProperty_ID(property_ID);
	}

	/**
	* Sets the type of this reality property master.
	*
	* @param type the type of this reality property master
	*/
	@Override
	public void setType(java.lang.String type) {
		_realityPropertyMaster.setType(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RealityPropertyMasterWrapper)) {
			return false;
		}

		RealityPropertyMasterWrapper realityPropertyMasterWrapper = (RealityPropertyMasterWrapper)obj;

		if (Objects.equals(_realityPropertyMaster,
					realityPropertyMasterWrapper._realityPropertyMaster)) {
			return true;
		}

		return false;
	}

	@Override
	public RealityPropertyMaster getWrappedModel() {
		return _realityPropertyMaster;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _realityPropertyMaster.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _realityPropertyMaster.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_realityPropertyMaster.resetOriginalValues();
	}

	private final RealityPropertyMaster _realityPropertyMaster;
}