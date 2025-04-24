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
 * This class is a wrapper for {@link RelianceReality}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RelianceReality
 * @generated
 */
@ProviderType
public class RelianceRealityWrapper implements RelianceReality,
	ModelWrapper<RelianceReality> {
	public RelianceRealityWrapper(RelianceReality relianceReality) {
		_relianceReality = relianceReality;
	}

	@Override
	public Class<?> getModelClass() {
		return RelianceReality.class;
	}

	@Override
	public String getModelClassName() {
		return RelianceReality.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("r_Id", getR_Id());
		attributes.put("city", getCity());
		attributes.put("location", getLocation());
		attributes.put("address", getAddress());
		attributes.put("area", getArea());
		attributes.put("type", getType());
		attributes.put("guidancePrice", getGuidancePrice());
		attributes.put("propertyId", getPropertyId());
		attributes.put("offerPrice", getOfferPrice());
		attributes.put("funding", getFunding());
		attributes.put("days", getDays());
		attributes.put("empcode", getEmpcode());
		attributes.put("name", getName());
		attributes.put("email_id", getEmail_id());
		attributes.put("mobile", getMobile());
		attributes.put("ageOfProperty", getAgeOfProperty());
		attributes.put("groupCompanyName", getGroupCompanyName());
		attributes.put("createDate", getCreateDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long r_Id = (Long)attributes.get("r_Id");

		if (r_Id != null) {
			setR_Id(r_Id);
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

		Long guidancePrice = (Long)attributes.get("guidancePrice");

		if (guidancePrice != null) {
			setGuidancePrice(guidancePrice);
		}

		String propertyId = (String)attributes.get("propertyId");

		if (propertyId != null) {
			setPropertyId(propertyId);
		}

		String offerPrice = (String)attributes.get("offerPrice");

		if (offerPrice != null) {
			setOfferPrice(offerPrice);
		}

		String funding = (String)attributes.get("funding");

		if (funding != null) {
			setFunding(funding);
		}

		Long days = (Long)attributes.get("days");

		if (days != null) {
			setDays(days);
		}

		String empcode = (String)attributes.get("empcode");

		if (empcode != null) {
			setEmpcode(empcode);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email_id = (String)attributes.get("email_id");

		if (email_id != null) {
			setEmail_id(email_id);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String ageOfProperty = (String)attributes.get("ageOfProperty");

		if (ageOfProperty != null) {
			setAgeOfProperty(ageOfProperty);
		}

		String groupCompanyName = (String)attributes.get("groupCompanyName");

		if (groupCompanyName != null) {
			setGroupCompanyName(groupCompanyName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}
	}

	@Override
	public RelianceReality toEscapedModel() {
		return new RelianceRealityWrapper(_relianceReality.toEscapedModel());
	}

	@Override
	public RelianceReality toUnescapedModel() {
		return new RelianceRealityWrapper(_relianceReality.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _relianceReality.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _relianceReality.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _relianceReality.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _relianceReality.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<RelianceReality> toCacheModel() {
		return _relianceReality.toCacheModel();
	}

	@Override
	public int compareTo(RelianceReality relianceReality) {
		return _relianceReality.compareTo(relianceReality);
	}

	@Override
	public int hashCode() {
		return _relianceReality.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _relianceReality.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RelianceRealityWrapper((RelianceReality)_relianceReality.clone());
	}

	/**
	* Returns the address of this reliance reality.
	*
	* @return the address of this reliance reality
	*/
	@Override
	public java.lang.String getAddress() {
		return _relianceReality.getAddress();
	}

	/**
	* Returns the age of property of this reliance reality.
	*
	* @return the age of property of this reliance reality
	*/
	@Override
	public java.lang.String getAgeOfProperty() {
		return _relianceReality.getAgeOfProperty();
	}

	/**
	* Returns the area of this reliance reality.
	*
	* @return the area of this reliance reality
	*/
	@Override
	public java.lang.String getArea() {
		return _relianceReality.getArea();
	}

	/**
	* Returns the city of this reliance reality.
	*
	* @return the city of this reliance reality
	*/
	@Override
	public java.lang.String getCity() {
		return _relianceReality.getCity();
	}

	/**
	* Returns the email_id of this reliance reality.
	*
	* @return the email_id of this reliance reality
	*/
	@Override
	public java.lang.String getEmail_id() {
		return _relianceReality.getEmail_id();
	}

	/**
	* Returns the empcode of this reliance reality.
	*
	* @return the empcode of this reliance reality
	*/
	@Override
	public java.lang.String getEmpcode() {
		return _relianceReality.getEmpcode();
	}

	/**
	* Returns the funding of this reliance reality.
	*
	* @return the funding of this reliance reality
	*/
	@Override
	public java.lang.String getFunding() {
		return _relianceReality.getFunding();
	}

	/**
	* Returns the group company name of this reliance reality.
	*
	* @return the group company name of this reliance reality
	*/
	@Override
	public java.lang.String getGroupCompanyName() {
		return _relianceReality.getGroupCompanyName();
	}

	/**
	* Returns the location of this reliance reality.
	*
	* @return the location of this reliance reality
	*/
	@Override
	public java.lang.String getLocation() {
		return _relianceReality.getLocation();
	}

	/**
	* Returns the mobile of this reliance reality.
	*
	* @return the mobile of this reliance reality
	*/
	@Override
	public java.lang.String getMobile() {
		return _relianceReality.getMobile();
	}

	/**
	* Returns the name of this reliance reality.
	*
	* @return the name of this reliance reality
	*/
	@Override
	public java.lang.String getName() {
		return _relianceReality.getName();
	}

	/**
	* Returns the offer price of this reliance reality.
	*
	* @return the offer price of this reliance reality
	*/
	@Override
	public java.lang.String getOfferPrice() {
		return _relianceReality.getOfferPrice();
	}

	/**
	* Returns the property ID of this reliance reality.
	*
	* @return the property ID of this reliance reality
	*/
	@Override
	public java.lang.String getPropertyId() {
		return _relianceReality.getPropertyId();
	}

	/**
	* Returns the type of this reliance reality.
	*
	* @return the type of this reliance reality
	*/
	@Override
	public java.lang.String getType() {
		return _relianceReality.getType();
	}

	@Override
	public java.lang.String toString() {
		return _relianceReality.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _relianceReality.toXmlString();
	}

	/**
	* Returns the create date of this reliance reality.
	*
	* @return the create date of this reliance reality
	*/
	@Override
	public Date getCreateDate() {
		return _relianceReality.getCreateDate();
	}

	/**
	* Returns the days of this reliance reality.
	*
	* @return the days of this reliance reality
	*/
	@Override
	public long getDays() {
		return _relianceReality.getDays();
	}

	/**
	* Returns the guidance price of this reliance reality.
	*
	* @return the guidance price of this reliance reality
	*/
	@Override
	public long getGuidancePrice() {
		return _relianceReality.getGuidancePrice();
	}

	/**
	* Returns the primary key of this reliance reality.
	*
	* @return the primary key of this reliance reality
	*/
	@Override
	public long getPrimaryKey() {
		return _relianceReality.getPrimaryKey();
	}

	/**
	* Returns the r_ ID of this reliance reality.
	*
	* @return the r_ ID of this reliance reality
	*/
	@Override
	public long getR_Id() {
		return _relianceReality.getR_Id();
	}

	@Override
	public void persist() {
		_relianceReality.persist();
	}

	/**
	* Sets the address of this reliance reality.
	*
	* @param address the address of this reliance reality
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_relianceReality.setAddress(address);
	}

	/**
	* Sets the age of property of this reliance reality.
	*
	* @param ageOfProperty the age of property of this reliance reality
	*/
	@Override
	public void setAgeOfProperty(java.lang.String ageOfProperty) {
		_relianceReality.setAgeOfProperty(ageOfProperty);
	}

	/**
	* Sets the area of this reliance reality.
	*
	* @param area the area of this reliance reality
	*/
	@Override
	public void setArea(java.lang.String area) {
		_relianceReality.setArea(area);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_relianceReality.setCachedModel(cachedModel);
	}

	/**
	* Sets the city of this reliance reality.
	*
	* @param city the city of this reliance reality
	*/
	@Override
	public void setCity(java.lang.String city) {
		_relianceReality.setCity(city);
	}

	/**
	* Sets the create date of this reliance reality.
	*
	* @param createDate the create date of this reliance reality
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_relianceReality.setCreateDate(createDate);
	}

	/**
	* Sets the days of this reliance reality.
	*
	* @param days the days of this reliance reality
	*/
	@Override
	public void setDays(long days) {
		_relianceReality.setDays(days);
	}

	/**
	* Sets the email_id of this reliance reality.
	*
	* @param email_id the email_id of this reliance reality
	*/
	@Override
	public void setEmail_id(java.lang.String email_id) {
		_relianceReality.setEmail_id(email_id);
	}

	/**
	* Sets the empcode of this reliance reality.
	*
	* @param empcode the empcode of this reliance reality
	*/
	@Override
	public void setEmpcode(java.lang.String empcode) {
		_relianceReality.setEmpcode(empcode);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_relianceReality.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_relianceReality.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_relianceReality.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the funding of this reliance reality.
	*
	* @param funding the funding of this reliance reality
	*/
	@Override
	public void setFunding(java.lang.String funding) {
		_relianceReality.setFunding(funding);
	}

	/**
	* Sets the group company name of this reliance reality.
	*
	* @param groupCompanyName the group company name of this reliance reality
	*/
	@Override
	public void setGroupCompanyName(java.lang.String groupCompanyName) {
		_relianceReality.setGroupCompanyName(groupCompanyName);
	}

	/**
	* Sets the guidance price of this reliance reality.
	*
	* @param guidancePrice the guidance price of this reliance reality
	*/
	@Override
	public void setGuidancePrice(long guidancePrice) {
		_relianceReality.setGuidancePrice(guidancePrice);
	}

	/**
	* Sets the location of this reliance reality.
	*
	* @param location the location of this reliance reality
	*/
	@Override
	public void setLocation(java.lang.String location) {
		_relianceReality.setLocation(location);
	}

	/**
	* Sets the mobile of this reliance reality.
	*
	* @param mobile the mobile of this reliance reality
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_relianceReality.setMobile(mobile);
	}

	/**
	* Sets the name of this reliance reality.
	*
	* @param name the name of this reliance reality
	*/
	@Override
	public void setName(java.lang.String name) {
		_relianceReality.setName(name);
	}

	@Override
	public void setNew(boolean n) {
		_relianceReality.setNew(n);
	}

	/**
	* Sets the offer price of this reliance reality.
	*
	* @param offerPrice the offer price of this reliance reality
	*/
	@Override
	public void setOfferPrice(java.lang.String offerPrice) {
		_relianceReality.setOfferPrice(offerPrice);
	}

	/**
	* Sets the primary key of this reliance reality.
	*
	* @param primaryKey the primary key of this reliance reality
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_relianceReality.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_relianceReality.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the property ID of this reliance reality.
	*
	* @param propertyId the property ID of this reliance reality
	*/
	@Override
	public void setPropertyId(java.lang.String propertyId) {
		_relianceReality.setPropertyId(propertyId);
	}

	/**
	* Sets the r_ ID of this reliance reality.
	*
	* @param r_Id the r_ ID of this reliance reality
	*/
	@Override
	public void setR_Id(long r_Id) {
		_relianceReality.setR_Id(r_Id);
	}

	/**
	* Sets the type of this reliance reality.
	*
	* @param type the type of this reliance reality
	*/
	@Override
	public void setType(java.lang.String type) {
		_relianceReality.setType(type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RelianceRealityWrapper)) {
			return false;
		}

		RelianceRealityWrapper relianceRealityWrapper = (RelianceRealityWrapper)obj;

		if (Objects.equals(_relianceReality,
					relianceRealityWrapper._relianceReality)) {
			return true;
		}

		return false;
	}

	@Override
	public RelianceReality getWrappedModel() {
		return _relianceReality;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _relianceReality.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _relianceReality.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_relianceReality.resetOriginalValues();
	}

	private final RelianceReality _relianceReality;
}