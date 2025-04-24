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
 * This class is a wrapper for {@link OccMessageNew}.
 * </p>
 *
 * @author Mukesh Patidar
 * @see OccMessageNew
 * @generated
 */
@ProviderType
public class OccMessageNewWrapper implements OccMessageNew,
	ModelWrapper<OccMessageNew> {
	public OccMessageNewWrapper(OccMessageNew occMessageNew) {
		_occMessageNew = occMessageNew;
	}

	@Override
	public Class<?> getModelClass() {
		return OccMessageNew.class;
	}

	@Override
	public String getModelClassName() {
		return OccMessageNew.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("MSG_ID", getMSG_ID());
		attributes.put("ListName", getListName());
		attributes.put("Message", getMessage());
		attributes.put("MSgSendDate", getMSgSendDate());
		attributes.put("Severity", getSeverity());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long MSG_ID = (Long)attributes.get("MSG_ID");

		if (MSG_ID != null) {
			setMSG_ID(MSG_ID);
		}

		String ListName = (String)attributes.get("ListName");

		if (ListName != null) {
			setListName(ListName);
		}

		String Message = (String)attributes.get("Message");

		if (Message != null) {
			setMessage(Message);
		}

		String MSgSendDate = (String)attributes.get("MSgSendDate");

		if (MSgSendDate != null) {
			setMSgSendDate(MSgSendDate);
		}

		String Severity = (String)attributes.get("Severity");

		if (Severity != null) {
			setSeverity(Severity);
		}
	}

	@Override
	public OCCModuleNew.model.OccMessageNew toEscapedModel() {
		return new OccMessageNewWrapper(_occMessageNew.toEscapedModel());
	}

	@Override
	public OCCModuleNew.model.OccMessageNew toUnescapedModel() {
		return new OccMessageNewWrapper(_occMessageNew.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _occMessageNew.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _occMessageNew.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _occMessageNew.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _occMessageNew.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OCCModuleNew.model.OccMessageNew> toCacheModel() {
		return _occMessageNew.toCacheModel();
	}

	@Override
	public int compareTo(OCCModuleNew.model.OccMessageNew occMessageNew) {
		return _occMessageNew.compareTo(occMessageNew);
	}

	@Override
	public int hashCode() {
		return _occMessageNew.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _occMessageNew.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OccMessageNewWrapper((OccMessageNew)_occMessageNew.clone());
	}

	/**
	* Returns the list name of this occ message new.
	*
	* @return the list name of this occ message new
	*/
	@Override
	public java.lang.String getListName() {
		return _occMessageNew.getListName();
	}

	/**
	* Returns the m sg send date of this occ message new.
	*
	* @return the m sg send date of this occ message new
	*/
	@Override
	public java.lang.String getMSgSendDate() {
		return _occMessageNew.getMSgSendDate();
	}

	/**
	* Returns the message of this occ message new.
	*
	* @return the message of this occ message new
	*/
	@Override
	public java.lang.String getMessage() {
		return _occMessageNew.getMessage();
	}

	/**
	* Returns the severity of this occ message new.
	*
	* @return the severity of this occ message new
	*/
	@Override
	public java.lang.String getSeverity() {
		return _occMessageNew.getSeverity();
	}

	@Override
	public java.lang.String toString() {
		return _occMessageNew.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _occMessageNew.toXmlString();
	}

	/**
	* Returns the msg_id of this occ message new.
	*
	* @return the msg_id of this occ message new
	*/
	@Override
	public long getMSG_ID() {
		return _occMessageNew.getMSG_ID();
	}

	/**
	* Returns the primary key of this occ message new.
	*
	* @return the primary key of this occ message new
	*/
	@Override
	public long getPrimaryKey() {
		return _occMessageNew.getPrimaryKey();
	}

	@Override
	public void persist() {
		_occMessageNew.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_occMessageNew.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_occMessageNew.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_occMessageNew.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_occMessageNew.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the list name of this occ message new.
	*
	* @param ListName the list name of this occ message new
	*/
	@Override
	public void setListName(java.lang.String ListName) {
		_occMessageNew.setListName(ListName);
	}

	/**
	* Sets the msg_id of this occ message new.
	*
	* @param MSG_ID the msg_id of this occ message new
	*/
	@Override
	public void setMSG_ID(long MSG_ID) {
		_occMessageNew.setMSG_ID(MSG_ID);
	}

	/**
	* Sets the m sg send date of this occ message new.
	*
	* @param MSgSendDate the m sg send date of this occ message new
	*/
	@Override
	public void setMSgSendDate(java.lang.String MSgSendDate) {
		_occMessageNew.setMSgSendDate(MSgSendDate);
	}

	/**
	* Sets the message of this occ message new.
	*
	* @param Message the message of this occ message new
	*/
	@Override
	public void setMessage(java.lang.String Message) {
		_occMessageNew.setMessage(Message);
	}

	@Override
	public void setNew(boolean n) {
		_occMessageNew.setNew(n);
	}

	/**
	* Sets the primary key of this occ message new.
	*
	* @param primaryKey the primary key of this occ message new
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_occMessageNew.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_occMessageNew.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the severity of this occ message new.
	*
	* @param Severity the severity of this occ message new
	*/
	@Override
	public void setSeverity(java.lang.String Severity) {
		_occMessageNew.setSeverity(Severity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OccMessageNewWrapper)) {
			return false;
		}

		OccMessageNewWrapper occMessageNewWrapper = (OccMessageNewWrapper)obj;

		if (Objects.equals(_occMessageNew, occMessageNewWrapper._occMessageNew)) {
			return true;
		}

		return false;
	}

	@Override
	public OccMessageNew getWrappedModel() {
		return _occMessageNew;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _occMessageNew.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _occMessageNew.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_occMessageNew.resetOriginalValues();
	}

	private final OccMessageNew _occMessageNew;
}