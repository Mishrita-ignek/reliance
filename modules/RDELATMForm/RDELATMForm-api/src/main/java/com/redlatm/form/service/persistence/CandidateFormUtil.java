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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.redlatm.form.model.CandidateForm;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the candidate form service. This utility wraps {@link com.redlatm.form.service.persistence.impl.CandidateFormPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh,Vipin
 * @see CandidateFormPersistence
 * @see com.redlatm.form.service.persistence.impl.CandidateFormPersistenceImpl
 * @generated
 */
@ProviderType
public class CandidateFormUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(CandidateForm candidateForm) {
		getPersistence().clearCache(candidateForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<CandidateForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<CandidateForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<CandidateForm> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<CandidateForm> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static CandidateForm update(CandidateForm candidateForm) {
		return getPersistence().update(candidateForm);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static CandidateForm update(CandidateForm candidateForm,
		ServiceContext serviceContext) {
		return getPersistence().update(candidateForm, serviceContext);
	}

	/**
	* Returns all the candidate forms where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the matching candidate forms
	*/
	public static List<CandidateForm> findByemailId(
		java.lang.String emailAddress) {
		return getPersistence().findByemailId(emailAddress);
	}

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
	public static List<CandidateForm> findByemailId(
		java.lang.String emailAddress, int start, int end) {
		return getPersistence().findByemailId(emailAddress, start, end);
	}

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
	public static List<CandidateForm> findByemailId(
		java.lang.String emailAddress, int start, int end,
		OrderByComparator<CandidateForm> orderByComparator) {
		return getPersistence()
				   .findByemailId(emailAddress, start, end, orderByComparator);
	}

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
	public static List<CandidateForm> findByemailId(
		java.lang.String emailAddress, int start, int end,
		OrderByComparator<CandidateForm> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByemailId(emailAddress, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate form
	* @throws NoSuchCandidateFormException if a matching candidate form could not be found
	*/
	public static CandidateForm findByemailId_First(
		java.lang.String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator)
		throws com.redlatm.form.exception.NoSuchCandidateFormException {
		return getPersistence()
				   .findByemailId_First(emailAddress, orderByComparator);
	}

	/**
	* Returns the first candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching candidate form, or <code>null</code> if a matching candidate form could not be found
	*/
	public static CandidateForm fetchByemailId_First(
		java.lang.String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator) {
		return getPersistence()
				   .fetchByemailId_First(emailAddress, orderByComparator);
	}

	/**
	* Returns the last candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate form
	* @throws NoSuchCandidateFormException if a matching candidate form could not be found
	*/
	public static CandidateForm findByemailId_Last(
		java.lang.String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator)
		throws com.redlatm.form.exception.NoSuchCandidateFormException {
		return getPersistence()
				   .findByemailId_Last(emailAddress, orderByComparator);
	}

	/**
	* Returns the last candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching candidate form, or <code>null</code> if a matching candidate form could not be found
	*/
	public static CandidateForm fetchByemailId_Last(
		java.lang.String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator) {
		return getPersistence()
				   .fetchByemailId_Last(emailAddress, orderByComparator);
	}

	/**
	* Returns the candidate forms before and after the current candidate form in the ordered set where emailAddress = &#63;.
	*
	* @param CaId the primary key of the current candidate form
	* @param emailAddress the email address
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next candidate form
	* @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	*/
	public static CandidateForm[] findByemailId_PrevAndNext(long CaId,
		java.lang.String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator)
		throws com.redlatm.form.exception.NoSuchCandidateFormException {
		return getPersistence()
				   .findByemailId_PrevAndNext(CaId, emailAddress,
			orderByComparator);
	}

	/**
	* Removes all the candidate forms where emailAddress = &#63; from the database.
	*
	* @param emailAddress the email address
	*/
	public static void removeByemailId(java.lang.String emailAddress) {
		getPersistence().removeByemailId(emailAddress);
	}

	/**
	* Returns the number of candidate forms where emailAddress = &#63;.
	*
	* @param emailAddress the email address
	* @return the number of matching candidate forms
	*/
	public static int countByemailId(java.lang.String emailAddress) {
		return getPersistence().countByemailId(emailAddress);
	}

	/**
	* Caches the candidate form in the entity cache if it is enabled.
	*
	* @param candidateForm the candidate form
	*/
	public static void cacheResult(CandidateForm candidateForm) {
		getPersistence().cacheResult(candidateForm);
	}

	/**
	* Caches the candidate forms in the entity cache if it is enabled.
	*
	* @param candidateForms the candidate forms
	*/
	public static void cacheResult(List<CandidateForm> candidateForms) {
		getPersistence().cacheResult(candidateForms);
	}

	/**
	* Creates a new candidate form with the primary key. Does not add the candidate form to the database.
	*
	* @param CaId the primary key for the new candidate form
	* @return the new candidate form
	*/
	public static CandidateForm create(long CaId) {
		return getPersistence().create(CaId);
	}

	/**
	* Removes the candidate form with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form that was removed
	* @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	*/
	public static CandidateForm remove(long CaId)
		throws com.redlatm.form.exception.NoSuchCandidateFormException {
		return getPersistence().remove(CaId);
	}

	public static CandidateForm updateImpl(CandidateForm candidateForm) {
		return getPersistence().updateImpl(candidateForm);
	}

	/**
	* Returns the candidate form with the primary key or throws a {@link NoSuchCandidateFormException} if it could not be found.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form
	* @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	*/
	public static CandidateForm findByPrimaryKey(long CaId)
		throws com.redlatm.form.exception.NoSuchCandidateFormException {
		return getPersistence().findByPrimaryKey(CaId);
	}

	/**
	* Returns the candidate form with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form, or <code>null</code> if a candidate form with the primary key could not be found
	*/
	public static CandidateForm fetchByPrimaryKey(long CaId) {
		return getPersistence().fetchByPrimaryKey(CaId);
	}

	public static java.util.Map<java.io.Serializable, CandidateForm> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the candidate forms.
	*
	* @return the candidate forms
	*/
	public static List<CandidateForm> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<CandidateForm> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<CandidateForm> findAll(int start, int end,
		OrderByComparator<CandidateForm> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<CandidateForm> findAll(int start, int end,
		OrderByComparator<CandidateForm> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the candidate forms from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of candidate forms.
	*
	* @return the number of candidate forms
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static CandidateFormPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CandidateFormPersistence, CandidateFormPersistence> _serviceTracker =
		ServiceTrackerFactory.open(CandidateFormPersistence.class);
}