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

import OCCModuleNew.model.OccNew;

import OCCModuleNew.service.persistence.OccNewPersistence;

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
public class OccNewFinderBaseImpl extends BasePersistenceImpl<OccNew> {
	public OccNewFinderBaseImpl() {
		setModelClass(OccNew.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("ListID", "LISTID");
			dbColumnNames.put("ListName", "LISTNAME");
			dbColumnNames.put("RollNo", "ROLLNO");
			dbColumnNames.put("Name", "NAME");
			dbColumnNames.put("MobileNo", "MOBILENO");
			dbColumnNames.put("Email", "EMAIL");
			dbColumnNames.put("Dept", "DEPT");

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
		return getOccNewPersistence().getBadColumnNames();
	}

	/**
	 * Returns the occ new persistence.
	 *
	 * @return the occ new persistence
	 */
	public OccNewPersistence getOccNewPersistence() {
		return occNewPersistence;
	}

	/**
	 * Sets the occ new persistence.
	 *
	 * @param occNewPersistence the occ new persistence
	 */
	public void setOccNewPersistence(OccNewPersistence occNewPersistence) {
		this.occNewPersistence = occNewPersistence;
	}

	@BeanReference(type = OccNewPersistence.class)
	protected OccNewPersistence occNewPersistence;
	private static final Log _log = LogFactoryUtil.getLog(OccNewFinderBaseImpl.class);
}