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
 * This class is a wrapper for {@link EmpMaster}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpMaster
 * @generated
 */
@ProviderType
public class EmpMasterWrapper implements EmpMaster, ModelWrapper<EmpMaster> {
	public EmpMasterWrapper(EmpMaster empMaster) {
		_empMaster = empMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return EmpMaster.class;
	}

	@Override
	public String getModelClassName() {
		return EmpMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeCode", getEmployeeCode());
		attributes.put("employeeName", getEmployeeName());
		attributes.put("mobile", getMobile());
		attributes.put("userDefined1", getUserDefined1());
		attributes.put("userDefined2", getUserDefined2());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
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
	}

	@Override
	public attendence.rinfra.services.model.EmpMaster toEscapedModel() {
		return new EmpMasterWrapper(_empMaster.toEscapedModel());
	}

	@Override
	public attendence.rinfra.services.model.EmpMaster toUnescapedModel() {
		return new EmpMasterWrapper(_empMaster.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _empMaster.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _empMaster.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _empMaster.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _empMaster.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<attendence.rinfra.services.model.EmpMaster> toCacheModel() {
		return _empMaster.toCacheModel();
	}

	@Override
	public int compareTo(attendence.rinfra.services.model.EmpMaster empMaster) {
		return _empMaster.compareTo(empMaster);
	}

	@Override
	public int hashCode() {
		return _empMaster.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empMaster.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EmpMasterWrapper((EmpMaster)_empMaster.clone());
	}

	/**
	* Returns the employee code of this emp master.
	*
	* @return the employee code of this emp master
	*/
	@Override
	public java.lang.String getEmployeeCode() {
		return _empMaster.getEmployeeCode();
	}

	/**
	* Returns the employee name of this emp master.
	*
	* @return the employee name of this emp master
	*/
	@Override
	public java.lang.String getEmployeeName() {
		return _empMaster.getEmployeeName();
	}

	/**
	* Returns the mobile of this emp master.
	*
	* @return the mobile of this emp master
	*/
	@Override
	public java.lang.String getMobile() {
		return _empMaster.getMobile();
	}

	/**
	* Returns the primary key of this emp master.
	*
	* @return the primary key of this emp master
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _empMaster.getPrimaryKey();
	}

	/**
	* Returns the user defined1 of this emp master.
	*
	* @return the user defined1 of this emp master
	*/
	@Override
	public java.lang.String getUserDefined1() {
		return _empMaster.getUserDefined1();
	}

	/**
	* Returns the user defined2 of this emp master.
	*
	* @return the user defined2 of this emp master
	*/
	@Override
	public java.lang.String getUserDefined2() {
		return _empMaster.getUserDefined2();
	}

	@Override
	public java.lang.String toString() {
		return _empMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _empMaster.toXmlString();
	}

	@Override
	public void persist() {
		_empMaster.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_empMaster.setCachedModel(cachedModel);
	}

	/**
	* Sets the employee code of this emp master.
	*
	* @param employeeCode the employee code of this emp master
	*/
	@Override
	public void setEmployeeCode(java.lang.String employeeCode) {
		_empMaster.setEmployeeCode(employeeCode);
	}

	/**
	* Sets the employee name of this emp master.
	*
	* @param employeeName the employee name of this emp master
	*/
	@Override
	public void setEmployeeName(java.lang.String employeeName) {
		_empMaster.setEmployeeName(employeeName);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_empMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_empMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_empMaster.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the mobile of this emp master.
	*
	* @param mobile the mobile of this emp master
	*/
	@Override
	public void setMobile(java.lang.String mobile) {
		_empMaster.setMobile(mobile);
	}

	@Override
	public void setNew(boolean n) {
		_empMaster.setNew(n);
	}

	/**
	* Sets the primary key of this emp master.
	*
	* @param primaryKey the primary key of this emp master
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_empMaster.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_empMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user defined1 of this emp master.
	*
	* @param userDefined1 the user defined1 of this emp master
	*/
	@Override
	public void setUserDefined1(java.lang.String userDefined1) {
		_empMaster.setUserDefined1(userDefined1);
	}

	/**
	* Sets the user defined2 of this emp master.
	*
	* @param userDefined2 the user defined2 of this emp master
	*/
	@Override
	public void setUserDefined2(java.lang.String userDefined2) {
		_empMaster.setUserDefined2(userDefined2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpMasterWrapper)) {
			return false;
		}

		EmpMasterWrapper empMasterWrapper = (EmpMasterWrapper)obj;

		if (Objects.equals(_empMaster, empMasterWrapper._empMaster)) {
			return true;
		}

		return false;
	}

	@Override
	public EmpMaster getWrappedModel() {
		return _empMaster;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _empMaster.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _empMaster.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_empMaster.resetOriginalValues();
	}

	private final EmpMaster _empMaster;
}