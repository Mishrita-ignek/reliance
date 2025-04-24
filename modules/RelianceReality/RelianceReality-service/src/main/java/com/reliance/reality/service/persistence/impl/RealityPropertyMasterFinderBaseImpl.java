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

import com.reliance.reality.model.RealityPropertyMaster;
import com.reliance.reality.service.persistence.RealityPropertyMasterPersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RealityPropertyMasterFinderBaseImpl extends BasePersistenceImpl<RealityPropertyMaster> {
	public RealityPropertyMasterFinderBaseImpl() {
		setModelClass(RealityPropertyMaster.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("property_ID", "PROPERTY_ID");
			dbColumnNames.put("city", "CITY");
			dbColumnNames.put("location", "LOCATION");
			dbColumnNames.put("address", "ADDRESS");
			dbColumnNames.put("area", "AREA");
			dbColumnNames.put("type", "TYPE");
			dbColumnNames.put("guidancePrice", "GUIDANCEPRICE");
			dbColumnNames.put("propertyBid", "PROPERTYBID");
			dbColumnNames.put("offerPrice", "OFFER_PRICE");
			dbColumnNames.put("ageOfProperty", "AGEOFPROPERTY");
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
		return getRealityPropertyMasterPersistence().getBadColumnNames();
	}

	/**
	 * Returns the reality property master persistence.
	 *
	 * @return the reality property master persistence
	 */
	public RealityPropertyMasterPersistence getRealityPropertyMasterPersistence() {
		return realityPropertyMasterPersistence;
	}

	/**
	 * Sets the reality property master persistence.
	 *
	 * @param realityPropertyMasterPersistence the reality property master persistence
	 */
	public void setRealityPropertyMasterPersistence(
		RealityPropertyMasterPersistence realityPropertyMasterPersistence) {
		this.realityPropertyMasterPersistence = realityPropertyMasterPersistence;
	}

	@BeanReference(type = RealityPropertyMasterPersistence.class)
	protected RealityPropertyMasterPersistence realityPropertyMasterPersistence;
	private static final Log _log = LogFactoryUtil.getLog(RealityPropertyMasterFinderBaseImpl.class);
}