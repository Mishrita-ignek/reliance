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

package com.reliance.reality.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.ReflectionUtil;

import com.reliance.reality.model.RelianceReality;
import com.reliance.reality.service.persistence.RelianceRealityPersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RelianceRealityFinderBaseImpl extends BasePersistenceImpl<RelianceReality> {
	public RelianceRealityFinderBaseImpl() {
		setModelClass(RelianceReality.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("r_Id", "R_ID");
			dbColumnNames.put("city", "CITY");
			dbColumnNames.put("location", "LOCATION");
			dbColumnNames.put("address", "ADDRESS");
			dbColumnNames.put("area", "AREA");
			dbColumnNames.put("type", "TYPE");
			dbColumnNames.put("guidancePrice", "GUIDANCEPRICE");
			dbColumnNames.put("propertyId", "PROPERTY_ID");
			dbColumnNames.put("offerPrice", "OFFER_PRICE");
			dbColumnNames.put("funding", "FUNDING");
			dbColumnNames.put("days", "DAYS");
			dbColumnNames.put("empcode", "EMPCODE");
			dbColumnNames.put("name", "NAME");
			dbColumnNames.put("email_id", "EMAIL_ID");
			dbColumnNames.put("mobile", "MOBILE");
			dbColumnNames.put("ageOfProperty", "AGEOFPROPERTY");
			dbColumnNames.put("groupCompanyName", "GROUPCOMPANYNAME");
			dbColumnNames.put("createDate", "CREATEDATE");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRelianceRealityPersistence().getBadColumnNames();
	}

	/**
	 * Returns the reliance reality persistence.
	 *
	 * @return the reliance reality persistence
	 */
	public RelianceRealityPersistence getRelianceRealityPersistence() {
		return relianceRealityPersistence;
	}

	/**
	 * Sets the reliance reality persistence.
	 *
	 * @param relianceRealityPersistence the reliance reality persistence
	 */
	public void setRelianceRealityPersistence(
		RelianceRealityPersistence relianceRealityPersistence) {
		this.relianceRealityPersistence = relianceRealityPersistence;
	}

	@BeanReference(type = RelianceRealityPersistence.class)
	protected RelianceRealityPersistence relianceRealityPersistence;
	private static final Log _log = LogFactoryUtil.getLog(RelianceRealityFinderBaseImpl.class);
}