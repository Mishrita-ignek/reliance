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

package com.redlatm.form.service.persistence;

import aQute.bnd.annotation.ProviderType;

/**
 * @author Mukesh,Vipin
 * @generated
 */
@ProviderType
public interface CandidateFormFinder {
	public java.util.List validateCandidateUserLogin(
		java.lang.String username, java.lang.String password);

	public java.lang.String validateCandidateEmailFinder(java.lang.String email);

	public java.util.List<com.redlatm.form.model.CandidateForm> validateCandidateEmailFinderPersitence(
		java.lang.String email);

	public java.lang.String setCandidatePasswordFinderImpl(
		java.lang.String password, java.lang.String emailId);
}