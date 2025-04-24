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

package attendence.rinfra.services.service.persistence.impl;

import attendence.rinfra.services.model.AttendenceTransaction;
import attendence.rinfra.services.service.persistence.AttendenceTransactionPersistence;

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
 * @author Brian Wing Shun Chan
 * @generated
 */
public class AttendenceTransactionFinderBaseImpl extends BasePersistenceImpl<AttendenceTransaction> {
	public AttendenceTransactionFinderBaseImpl() {
		setModelClass(AttendenceTransaction.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("srNo", "SRNO");
			dbColumnNames.put("employeeCode", "EMPLOYEE_CODE");
			dbColumnNames.put("employeeName", "EMPLOYEE_NAME");
			dbColumnNames.put("mobile", "MOBILE_NUMBER");
			dbColumnNames.put("userDefined1", "USER_DEFINED_1");
			dbColumnNames.put("userDefined2", "USER_DEFINED_2");
			dbColumnNames.put("attendenceMode", "ATTENDENCE_MODE");
			dbColumnNames.put("attendenceDateTime", "ATTENDENCE_DATETIME");

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
		return getAttendenceTransactionPersistence().getBadColumnNames();
	}

	/**
	 * Returns the attendence transaction persistence.
	 *
	 * @return the attendence transaction persistence
	 */
	public AttendenceTransactionPersistence getAttendenceTransactionPersistence() {
		return attendenceTransactionPersistence;
	}

	/**
	 * Sets the attendence transaction persistence.
	 *
	 * @param attendenceTransactionPersistence the attendence transaction persistence
	 */
	public void setAttendenceTransactionPersistence(
		AttendenceTransactionPersistence attendenceTransactionPersistence) {
		this.attendenceTransactionPersistence = attendenceTransactionPersistence;
	}

	@BeanReference(type = AttendenceTransactionPersistence.class)
	protected AttendenceTransactionPersistence attendenceTransactionPersistence;
	private static final Log _log = LogFactoryUtil.getLog(AttendenceTransactionFinderBaseImpl.class);
}