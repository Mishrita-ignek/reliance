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

package com.redlatm.form.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.ReflectionUtil;

import com.redlatm.form.model.CandidateForm;
import com.redlatm.form.service.persistence.CandidateFormPersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Mukesh,Vipin
 * @generated
 */
public class CandidateFormFinderBaseImpl extends BasePersistenceImpl<CandidateForm> {
	public CandidateFormFinderBaseImpl() {
		setModelClass(CandidateForm.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("CaId", "CA_ID");
			dbColumnNames.put("password", "password_");
			dbColumnNames.put("state", "state_");

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
		return getCandidateFormPersistence().getBadColumnNames();
	}

	/**
	 * Returns the candidate form persistence.
	 *
	 * @return the candidate form persistence
	 */
	public CandidateFormPersistence getCandidateFormPersistence() {
		return candidateFormPersistence;
	}

	/**
	 * Sets the candidate form persistence.
	 *
	 * @param candidateFormPersistence the candidate form persistence
	 */
	public void setCandidateFormPersistence(
		CandidateFormPersistence candidateFormPersistence) {
		this.candidateFormPersistence = candidateFormPersistence;
	}

	@BeanReference(type = CandidateFormPersistence.class)
	protected CandidateFormPersistence candidateFormPersistence;
	private static final Log _log = LogFactoryUtil.getLog(CandidateFormFinderBaseImpl.class);
}