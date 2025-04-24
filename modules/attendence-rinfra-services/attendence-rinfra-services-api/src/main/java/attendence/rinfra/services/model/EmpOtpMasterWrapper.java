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
 * This class is a wrapper for {@link EmpOtpMaster}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpOtpMaster
 * @generated
 */
@ProviderType
public class EmpOtpMasterWrapper implements EmpOtpMaster,
	ModelWrapper<EmpOtpMaster> {
	public EmpOtpMasterWrapper(EmpOtpMaster empOtpMaster) {
		_empOtpMaster = empOtpMaster;
	}

	@Override
	public Class<?> getModelClass() {
		return EmpOtpMaster.class;
	}

	@Override
	public String getModelClassName() {
		return EmpOtpMaster.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empMobile", getEmpMobile());
		attributes.put("otp", getOtp());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String empMobile = (String)attributes.get("empMobile");

		if (empMobile != null) {
			setEmpMobile(empMobile);
		}

		String otp = (String)attributes.get("otp");

		if (otp != null) {
			setOtp(otp);
		}
	}

	@Override
	public attendence.rinfra.services.model.EmpOtpMaster toEscapedModel() {
		return new EmpOtpMasterWrapper(_empOtpMaster.toEscapedModel());
	}

	@Override
	public attendence.rinfra.services.model.EmpOtpMaster toUnescapedModel() {
		return new EmpOtpMasterWrapper(_empOtpMaster.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _empOtpMaster.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _empOtpMaster.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _empOtpMaster.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _empOtpMaster.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<attendence.rinfra.services.model.EmpOtpMaster> toCacheModel() {
		return _empOtpMaster.toCacheModel();
	}

	@Override
	public int compareTo(
		attendence.rinfra.services.model.EmpOtpMaster empOtpMaster) {
		return _empOtpMaster.compareTo(empOtpMaster);
	}

	@Override
	public int hashCode() {
		return _empOtpMaster.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empOtpMaster.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EmpOtpMasterWrapper((EmpOtpMaster)_empOtpMaster.clone());
	}

	/**
	* Returns the emp mobile of this emp otp master.
	*
	* @return the emp mobile of this emp otp master
	*/
	@Override
	public java.lang.String getEmpMobile() {
		return _empOtpMaster.getEmpMobile();
	}

	/**
	* Returns the otp of this emp otp master.
	*
	* @return the otp of this emp otp master
	*/
	@Override
	public java.lang.String getOtp() {
		return _empOtpMaster.getOtp();
	}

	/**
	* Returns the primary key of this emp otp master.
	*
	* @return the primary key of this emp otp master
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _empOtpMaster.getPrimaryKey();
	}

	@Override
	public java.lang.String toString() {
		return _empOtpMaster.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _empOtpMaster.toXmlString();
	}

	@Override
	public void persist() {
		_empOtpMaster.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_empOtpMaster.setCachedModel(cachedModel);
	}

	/**
	* Sets the emp mobile of this emp otp master.
	*
	* @param empMobile the emp mobile of this emp otp master
	*/
	@Override
	public void setEmpMobile(java.lang.String empMobile) {
		_empOtpMaster.setEmpMobile(empMobile);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_empOtpMaster.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_empOtpMaster.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_empOtpMaster.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_empOtpMaster.setNew(n);
	}

	/**
	* Sets the otp of this emp otp master.
	*
	* @param otp the otp of this emp otp master
	*/
	@Override
	public void setOtp(java.lang.String otp) {
		_empOtpMaster.setOtp(otp);
	}

	/**
	* Sets the primary key of this emp otp master.
	*
	* @param primaryKey the primary key of this emp otp master
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_empOtpMaster.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_empOtpMaster.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpOtpMasterWrapper)) {
			return false;
		}

		EmpOtpMasterWrapper empOtpMasterWrapper = (EmpOtpMasterWrapper)obj;

		if (Objects.equals(_empOtpMaster, empOtpMasterWrapper._empOtpMaster)) {
			return true;
		}

		return false;
	}

	@Override
	public EmpOtpMaster getWrappedModel() {
		return _empOtpMaster;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _empOtpMaster.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _empOtpMaster.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_empOtpMaster.resetOriginalValues();
	}

	private final EmpOtpMaster _empOtpMaster;
}