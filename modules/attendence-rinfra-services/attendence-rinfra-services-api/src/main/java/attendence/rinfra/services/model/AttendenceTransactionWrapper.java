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

package attendence.rinfra.services.model;

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
 * This class is a wrapper for {@link AttendenceTransaction}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttendenceTransaction
 * @generated
 */
@ProviderType
public class AttendenceTransactionWrapper implements AttendenceTransaction,
	ModelWrapper<AttendenceTransaction> {
	public AttendenceTransactionWrapper(
		AttendenceTransaction attendenceTransaction) {
		_attendenceTransaction = attendenceTransaction;
	}

	@Override
	public Class<?> getModelClass() {
		return AttendenceTransaction.class;
	}

	@Override
	public String getModelClassName() {
		return AttendenceTransaction.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("srNo", getSrNo());
		attributes.put("employeeCode", getEmployeeCode());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("mobile", getMobile());
		attributes.put("userDefined1", getUserDefined1());
		attributes.put("userDefined2", getUserDefined2());
		attributes.put("attendenceMode", getAttendenceMode());
		attributes.put("attendenceDateTime", getAttendenceDateTime());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String srNo = (String)attributes.get("srNo");

		if (srNo != null) {
			setSrNo(srNo);
		}

		String employeeCode = (String)attributes.get("employeeCode");

		if (employeeCode != null) {
			setEmployeeCode(employeeCode);
		}

		String employeeName = (String)attributes.get("employeeName");

		if (employeeName != null) {
			setEmployeeName(employeeName);
		}

		String mobile = (String)attributes.get("mobile");

		if (mobile != null) {
			setMobile(mobile);
		}

		String userDefined1 = (String)attributes.get("userDefined1");

		if (userDefined1 != null) {
			setUserDefined1(userDefined1);
		}

		String userDefined2 = (String)attributes.get("userDefined2");

		if (userDefined2 != null) {
			setUserDefined2(userDefined2);
		}

		String attendenceMode = (String)attributes.get("attendenceMode");

		if (attendenceMode != null) {
			setAttendenceMode(attendenceMode);
		}

		String attendenceDateTime = (String)attributes.get("attendenceDateTime");

		if (attendenceDateTime != null) {
			setAttendenceDateTime(attendenceDateTime);
		}
	}

	@Override
	public attendence.rinfra.services.model.AttendenceTransaction toEscapedModel() {
		return new AttendenceTransactionWrapper(_attendenceTransaction.toEscapedModel());
	}

	@Override
	public attendence.rinfra.services.model.AttendenceTransaction toUnescapedModel() {
		return new AttendenceTransactionWrapper(_attendenceTransaction.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _attendenceTransaction.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _attendenceTransaction.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _attendenceTransaction.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _attendenceTransaction.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<attendence.rinfra.services.model.AttendenceTransaction> toCacheModel() {
		return _attendenceTransaction.toCacheModel();
	}

	@Override
	public int compareTo(
		attendence.rinfra.services.model.AttendenceTransaction attendenceTransaction) {
		return _attendenceTransaction.compareTo(attendenceTransaction);
	}

	@Override
	public int hashCode() {
		return _attendenceTransaction.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attendenceTransaction.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new AttendenceTransactionWrapper((AttendenceTransaction)_attendenceTransaction.clone());
	}

	/**
	* Returns the attendence date time of this attendence transaction.
	*
	* @return the attendence date time of this attendence transaction
	*/
	@Override
	public java.lang.String getAttendenceDateTime() {
		return _attendenceTransaction.getAttendenceDateTime();
	}

	/**
	* Returns the attendence mode of this attendence transaction.
	*
	* @return the attendence mode of this attendence transaction
	*/
	@Override
	public java.lang.String getAttendenceMode() {
		return _attendenceTransaction.getAttendenceMode();
	}

	/**
	* Returns the employee code of this attendence transaction.
	*
	* @return the employee code of this attendence transaction
	*/
	@Override
	public java.lang.String getEmployeeCode() {
		return _attendenceTransaction.getEmployeeCode();
	}

	/**
	* Returns the employee name of this attendence transaction.
	*
	* @return the employee name of this attendence transaction
	*/
	@Override
	public java.lang.String getEmployeeName() {
		return _attendenceTransaction.getEmployeeName();
	}

	/**
	* Returns the mobile of this attendence transaction.
	*
	* @return the mobile of this attendence transaction
	*/
	@Override
	public java.lang.String getMobile() {
		return _attendenceTransaction.getMobile();
	}

	/**
	* Returns the primary key of this attendence transaction.
	*
	* @return the primary key of this attendence transaction
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _attendenceTransaction.getPrimaryKey();
	}

	/**
	* Returns the sr no of this attendence transaction.
	*
	* @return the sr no of this attendence transaction
	*/
	@Override
	public java.lang.String getSrNo() {
		return _attendenceTransaction.getSrNo();
	}

	/**
	* Returns the user defined1 of this attendence transaction.
	*
	* @return the user defined1 of this attendence transaction
	*/
	@Override
	public java.lang.String getUserDefined1() {
		return _attendenceTransaction.getUserDefined1();
	}

	/**
	* Returns the user defined2 of this attendence transaction.
	*
	* @return the user defined2 of this attendence transaction
	*/
	@Override
	public java.lang.String getUserDefined2() {
		return _attendenceTransaction.getUserDefined2();
	}

	@Override
	public java.lang.String toString() {
		return _attendenceTransaction.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _attendenceTransaction.toXmlString();
	}

	@Override
	public void persist() {
		_attendenceTransaction.persist();
	}

	/**
	* Sets the attendence date time of this attendence transaction.
	*
	* @param attendenceDateTime the attendence date time of this attendence transaction
	*/
	@Override
	public void setAttendenceDateTime(java.lang.String attendenceDateTime) {
		_attendenceTransaction.setAttendenceDateTime(attendenceDateTime);
	}

	/**
	* Sets the attendence mode of this attendence transaction.
	*
	* @param attendenceMode the attendence mode of this attendence transaction
	*/
	@Override
	public void setAttendenceMode(java.lang.String attendenceMode) {
		_attendenceTransaction.setAttendenceMode(attendenceMode);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_attendenceTransaction.setCachedModel(cachedModel);
	}

	/**
	* Sets the employee code of this attendence transaction.
	*
	* @param employeeCode the employee code of this attendence transaction
	*/
	@Override
	public void setEmployeeCode(java.lang.String employeeCode) {
		_attendenceTransaction.setEmployeeCode(employeeCode);
	}

	/**
	* Sets the employee name of this attendence transaction.
	*
	* @param employeeName the employee name of this attendence transaction
	*/
	@Override
	public void setEmployeeName(java.lang.String employeeName) {
		_attendenceTransaction.setEmployeeName(employeeName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_attendenceTransaction.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_attendenceTransaction.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_attendenceTransaction.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the mobile of this attendence transaction.
	*
	* @param mobile the mobile of this attendence transaction
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_attendenceTransaction.setMobile(mobile);
	}

	@Override
	public void setNew(boolean n) {
		_attendenceTransaction.setNew(n);
	}

	/**
	* Sets the primary key of this attendence transaction.
	*
	* @param primaryKey the primary key of this attendence transaction
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_attendenceTransaction.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_attendenceTransaction.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the sr no of this attendence transaction.
	*
	* @param srNo the sr no of this attendence transaction
	*/
	@Override
	public void setSrNo(java.lang.String srNo) {
		_attendenceTransaction.setSrNo(srNo);
	}

	/**
	* Sets the user defined1 of this attendence transaction.
	*
	* @param userDefined1 the user defined1 of this attendence transaction
	*/
	@Override
	public void setUserDefined1(java.lang.String userDefined1) {
		_attendenceTransaction.setUserDefined1(userDefined1);
	}

	/**
	* Sets the user defined2 of this attendence transaction.
	*
	* @param userDefined2 the user defined2 of this attendence transaction
	*/
	@Override
	public void setUserDefined2(java.lang.String userDefined2) {
		_attendenceTransaction.setUserDefined2(userDefined2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof AttendenceTransactionWrapper)) {
			return false;
		}

		AttendenceTransactionWrapper attendenceTransactionWrapper = (AttendenceTransactionWrapper)obj;

		if (Objects.equals(_attendenceTransaction,
					attendenceTransactionWrapper._attendenceTransaction)) {
			return true;
		}

		return false;
	}

	@Override
	public AttendenceTransaction getWrappedModel() {
		return _attendenceTransaction;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _attendenceTransaction.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _attendenceTransaction.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_attendenceTransaction.resetOriginalValues();
	}

	private final AttendenceTransaction _attendenceTransaction;
}