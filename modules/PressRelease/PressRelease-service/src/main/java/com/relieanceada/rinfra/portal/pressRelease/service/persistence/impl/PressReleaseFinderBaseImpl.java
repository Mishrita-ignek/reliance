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

package com.relieanceada.rinfra.portal.pressRelease.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.ReflectionUtil;

import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;
import com.relieanceada.rinfra.portal.pressRelease.service.persistence.PressReleasePersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Vipin Singh
 * @generated
 */
public class PressReleaseFinderBaseImpl extends BasePersistenceImpl<PressRelease> {
	public PressReleaseFinderBaseImpl() {
		setModelClass(PressRelease.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("data", "data_");
			dbColumnNames.put("show", "show_");

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
		return getPressReleasePersistence().getBadColumnNames();
	}

	/**
	 * Returns the press release persistence.
	 *
	 * @return the press release persistence
	 */
	public PressReleasePersistence getPressReleasePersistence() {
		return pressReleasePersistence;
	}

	/**
	 * Sets the press release persistence.
	 *
	 * @param pressReleasePersistence the press release persistence
	 */
	public void setPressReleasePersistence(
		PressReleasePersistence pressReleasePersistence) {
		this.pressReleasePersistence = pressReleasePersistence;
	}

	@BeanReference(type = PressReleasePersistence.class)
	protected PressReleasePersistence pressReleasePersistence;
	private static final Log _log = LogFactoryUtil.getLog(PressReleaseFinderBaseImpl.class);
}