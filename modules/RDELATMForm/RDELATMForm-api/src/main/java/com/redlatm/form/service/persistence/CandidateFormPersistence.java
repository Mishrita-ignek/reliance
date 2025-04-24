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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.redlatm.form.exception.NoSuchCandidateFormException;
import com.redlatm.form.model.CandidateForm;

/**
 * The persistence interface for the candidate form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh,Vipin
 * @see com.redlatm.form.service.persistence.impl.CandidateFormPersistenceImpl
 * @see CandidateFormUtil
 * @generated
 */
@ProviderType
public interface CandidateFormPersistence extends BasePersistence<CandidateForm> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CandidateFormUtil} to access the candidate form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the candidate forms where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the matching candidate forms
	*/
	public java.util.List<CandidateForm> findByemailId(
		java.lang.String emailAddress);

	/**
	* Returns a range of all the candidate forms where emailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emailAddress the email address
	* @param start the lower bound of the range of candidate forms
	* @param end the upper bound of the range of candidate forms (not inclusive)
	* @return the range of matching candidate forms
	*/
	public java.util.List<CandidateForm> findByemailId(
		java.lang.String emailAddress, int start, int end);

	/**
	* Returns an ordered range of all the candidate forms where emailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emailAddress the email address
	* @param start the lower bound of the range of candidate forms
	* @param end the upper bound of the range of candidate forms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching candidate forms
	*/
	public java.util.List<CandidateForm> findByemailId(
		java.lang.String emailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator);

	/**
	* Returns an ordered range of all the candidate forms where emailAddress = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param emailAddress the email address
	* @param start the lower bound of the range of candidate forms
	* @param end the upper bound of the range of candidate forms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching candidate forms
	*/
	public java.util.List<CandidateForm> findByemailId(
		java.lang.String emailAddress, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate form
	* @throws NoSuchCandidateFormException if a matching candidate form could not be found
	*/
	public CandidateForm findByemailId_First(java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator)
		throws NoSuchCandidateFormException;

	/**
	* Returns the first candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate form, or <code>null</code> if a matching candidate form could not be found
	*/
	public CandidateForm fetchByemailId_First(java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator);

	/**
	* Returns the last candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate form
	* @throws NoSuchCandidateFormException if a matching candidate form could not be found
	*/
	public CandidateForm findByemailId_Last(java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator)
		throws NoSuchCandidateFormException;

	/**
	* Returns the last candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate form, or <code>null</code> if a matching candidate form could not be found
	*/
	public CandidateForm fetchByemailId_Last(java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator);

	/**
	* Returns the candidate forms before and after the current candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param CaId the primary key of the current candidate form
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate form
	* @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	*/
	public CandidateForm[] findByemailId_PrevAndNext(long CaId,
		java.lang.String emailAddress,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator)
		throws NoSuchCandidateFormException;

	/**
	* Removes all the candidate forms where emailAddress = &#63; from the database.
	*
	* @param emailAddress the email address
	*/
	public void removeByemailId(java.lang.String emailAddress);

	/**
	* Returns the number of candidate forms where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the number of matching candidate forms
	*/
	public int countByemailId(java.lang.String emailAddress);

	/**
	* Caches the candidate form in the entity cache if it is enabled.
	*
	* @param candidateForm the candidate form
	*/
	public void cacheResult(CandidateForm candidateForm);

	/**
	* Caches the candidate forms in the entity cache if it is enabled.
	*
	* @param candidateForms the candidate forms
	*/
	public void cacheResult(java.util.List<CandidateForm> candidateForms);

	/**
	* Creates a new candidate form with the primary key. Does not add the candidate form to the database.
	*
	* @param CaId the primary key for the new candidate form
	* @return the new candidate form
	*/
	public CandidateForm create(long CaId);

	/**
	* Removes the candidate form with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form that was removed
	* @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	*/
	public CandidateForm remove(long CaId) throws NoSuchCandidateFormException;

	public CandidateForm updateImpl(CandidateForm candidateForm);

	/**
	* Returns the candidate form with the primary key or throws a {@link NoSuchCandidateFormException} if it could not be found.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form
	* @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	*/
	public CandidateForm findByPrimaryKey(long CaId)
		throws NoSuchCandidateFormException;

	/**
	* Returns the candidate form with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form, or <code>null</code> if a candidate form with the primary key could not be found
	*/
	public CandidateForm fetchByPrimaryKey(long CaId);

	@Override
	public java.util.Map<java.io.Serializable, CandidateForm> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the candidate forms.
	*
	* @return the candidate forms
	*/
	public java.util.List<CandidateForm> findAll();

	/**
	* Returns a range of all the candidate forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidate forms
	* @param end the upper bound of the range of candidate forms (not inclusive)
	* @return the range of candidate forms
	*/
	public java.util.List<CandidateForm> findAll(int start, int end);

	/**
	* Returns an ordered range of all the candidate forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidate forms
	* @param end the upper bound of the range of candidate forms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of candidate forms
	*/
	public java.util.List<CandidateForm> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator);

	/**
	* Returns an ordered range of all the candidate forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidate forms
	* @param end the upper bound of the range of candidate forms (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of candidate forms
	*/
	public java.util.List<CandidateForm> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<CandidateForm> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the candidate forms from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of candidate forms.
	*
	* @return the number of candidate forms
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}