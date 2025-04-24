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

package OCCModuleNew.service.persistence.impl;

import OCCModuleNew.model.OccMessageNew;

import OCCModuleNew.service.persistence.OccMessageNewPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.ReflectionUtil;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Mukesh Patidar
 * @generated
 */
public class OccMessageNewFinderBaseImpl extends BasePersistenceImpl<OccMessageNew> {
	public OccMessageNewFinderBaseImpl() {
		setModelClass(OccMessageNew.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("ListName", "LISTNAME");
			dbColumnNames.put("Message", "MESSAGE");
			dbColumnNames.put("MSgSendDate", "MSGSENDDATE");
			dbColumnNames.put("Severity", "SEVERITY");

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
		return getOccMessageNewPersistence().getBadColumnNames();
	}

	/**
	 * Returns the occ message new persistence.
	 *
	 * @return the occ message new persistence
	 */
	public OccMessageNewPersistence getOccMessageNewPersistence() {
		return occMessageNewPersistence;
	}

	/**
	 * Sets the occ message new persistence.
	 *
	 * @param occMessageNewPersistence the occ message new persistence
	 */
	public void setOccMessageNewPersistence(
		OccMessageNewPersistence occMessageNewPersistence) {
		this.occMessageNewPersistence = occMessageNewPersistence;
	}

	@BeanReference(type = OccMessageNewPersistence.class)
	protected OccMessageNewPersistence occMessageNewPersistence;
	private static final Log _log = LogFactoryUtil.getLog(OccMessageNewFinderBaseImpl.class);
}