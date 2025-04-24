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

package OCCModuleNew.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link OccNew}.
 * </p>
 *
 * @author Mukesh Patidar
 * @see OccNew
 * @generated
 */
@ProviderType
public class OccNewWrapper implements OccNew, ModelWrapper<OccNew> {
	public OccNewWrapper(OccNew occNew) {
		_occNew = occNew;
	}

	@Override
	public Class<?> getModelClass() {
		return OccNew.class;
	}

	@Override
	public String getModelClassName() {
		return OccNew.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("OCCID", getOCCID());
		attributes.put("ListID", getListID());
		attributes.put("ListName", getListName());
		attributes.put("RollNo", getRollNo());
		attributes.put("Name", getName());
		attributes.put("MobileNo", getMobileNo());
		attributes.put("Email", getEmail());
		attributes.put("Dept", getDept());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long OCCID = (Long)attributes.get("OCCID");

		if (OCCID != null) {
			setOCCID(OCCID);
		}

		Long ListID = (Long)attributes.get("ListID");

		if (ListID != null) {
			setListID(ListID);
		}

		String ListName = (String)attributes.get("ListName");

		if (ListName != null) {
			setListName(ListName);
		}

		String RollNo = (String)attributes.get("RollNo");

		if (RollNo != null) {
			setRollNo(RollNo);
		}

		String Name = (String)attributes.get("Name");

		if (Name != null) {
			setName(Name);
		}

		Long MobileNo = (Long)attributes.get("MobileNo");

		if (MobileNo != null) {
			setMobileNo(MobileNo);
		}

		String Email = (String)attributes.get("Email");

		if (Email != null) {
			setEmail(Email);
		}

		String Dept = (String)attributes.get("Dept");

		if (Dept != null) {
			setDept(Dept);
		}
	}

	@Override
	public OCCModuleNew.model.OccNew toEscapedModel() {
		return new OccNewWrapper(_occNew.toEscapedModel());
	}

	@Override
	public OCCModuleNew.model.OccNew toUnescapedModel() {
		return new OccNewWrapper(_occNew.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _occNew.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _occNew.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _occNew.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _occNew.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OCCModuleNew.model.OccNew> toCacheModel() {
		return _occNew.toCacheModel();
	}

	@Override
	public int compareTo(OCCModuleNew.model.OccNew occNew) {
		return _occNew.compareTo(occNew);
	}

	@Override
	public int hashCode() {
		return _occNew.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _occNew.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OccNewWrapper((OccNew)_occNew.clone());
	}

	/**
	* Returns the dept of this occ new.
	*
	* @return the dept of this occ new
	*/
	@Override
	public java.lang.String getDept() {
		return _occNew.getDept();
	}

	/**
	* Returns the email of this occ new.
	*
	* @return the email of this occ new
	*/
	@Override
	public java.lang.String getEmail() {
		return _occNew.getEmail();
	}

	/**
	* Returns the list name of this occ new.
	*
	* @return the list name of this occ new
	*/
	@Override
	public java.lang.String getListName() {
		return _occNew.getListName();
	}

	/**
	* Returns the name of this occ new.
	*
	* @return the name of this occ new
	*/
	@Override
	public java.lang.String getName() {
		return _occNew.getName();
	}

	/**
	* Returns the roll no of this occ new.
	*
	* @return the roll no of this occ new
	*/
	@Override
	public java.lang.String getRollNo() {
		return _occNew.getRollNo();
	}

	@Override
	public java.lang.String toString() {
		return _occNew.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _occNew.toXmlString();
	}

	/**
	* Returns the list ID of this occ new.
	*
	* @return the list ID of this occ new
	*/
	@Override
	public long getListID() {
		return _occNew.getListID();
	}

	/**
	* Returns the mobile no of this occ new.
	*
	* @return the mobile no of this occ new
	*/
	@Override
	public long getMobileNo() {
		return _occNew.getMobileNo();
	}

	/**
	* Returns the occid of this occ new.
	*
	* @return the occid of this occ new
	*/
	@Override
	public long getOCCID() {
		return _occNew.getOCCID();
	}

	/**
	* Returns the primary key of this occ new.
	*
	* @return the primary key of this occ new
	*/
	@Override
	public long getPrimaryKey() {
		return _occNew.getPrimaryKey();
	}

	@Override
	public void persist() {
		_occNew.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_occNew.setCachedModel(cachedModel);
	}

	/**
	* Sets the dept of this occ new.
	*
	* @param Dept the dept of this occ new
	*/
	@Override
	public void setDept(java.lang.String Dept) {
		_occNew.setDept(Dept);
	}

	/**
	* Sets the email of this occ new.
	*
	* @param Email the email of this occ new
	*/
	@Override
	public void setEmail(java.lang.String Email) {
		_occNew.setEmail(Email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_occNew.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_occNew.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_occNew.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the list ID of this occ new.
	*
	* @param ListID the list ID of this occ new
	*/
	@Override
	public void setListID(long ListID) {
		_occNew.setListID(ListID);
	}

	/**
	* Sets the list name of this occ new.
	*
	* @param ListName the list name of this occ new
	*/
	@Override
	public void setListName(java.lang.String ListName) {
		_occNew.setListName(ListName);
	}

	/**
	* Sets the mobile no of this occ new.
	*
	* @param MobileNo the mobile no of this occ new
	*/
	@Override
	public void setMobileNo(long MobileNo) {
		_occNew.setMobileNo(MobileNo);
	}

	/**
	* Sets the name of this occ new.
	*
	* @param Name the name of this occ new
	*/
	@Override
	public void setName(java.lang.String Name) {
		_occNew.setName(Name);
	}

	@Override
	public void setNew(boolean n) {
		_occNew.setNew(n);
	}

	/**
	* Sets the occid of this occ new.
	*
	* @param OCCID the occid of this occ new
	*/
	@Override
	public void setOCCID(long OCCID) {
		_occNew.setOCCID(OCCID);
	}

	/**
	* Sets the primary key of this occ new.
	*
	* @param primaryKey the primary key of this occ new
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_occNew.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_occNew.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the roll no of this occ new.
	*
	* @param RollNo the roll no of this occ new
	*/
	@Override
	public void setRollNo(java.lang.String RollNo) {
		_occNew.setRollNo(RollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OccNewWrapper)) {
			return false;
		}

		OccNewWrapper occNewWrapper = (OccNewWrapper)obj;

		if (Objects.equals(_occNew, occNewWrapper._occNew)) {
			return true;
		}

		return false;
	}

	@Override
	public OccNew getWrappedModel() {
		return _occNew;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _occNew.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _occNew.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_occNew.resetOriginalValues();
	}

	private final OccNew _occNew;
}