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

package com.rinfra.satisfactionsurvey.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rinfra.satisfactionsurvey.model.Shareholders;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the shareholders service. This utility wraps {@link com.rinfra.satisfactionsurvey.service.persistence.impl.ShareholdersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh
 * @see ShareholdersPersistence
 * @see com.rinfra.satisfactionsurvey.service.persistence.impl.ShareholdersPersistenceImpl
 * @generated
 */
@ProviderType
public class ShareholdersUtil {
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
	public static void clearCache(Shareholders shareholders) {
		getPersistence().clearCache(shareholders);
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
	public static List<Shareholders> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Shareholders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Shareholders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Shareholders> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Shareholders update(Shareholders shareholders) {
		return getPersistence().update(shareholders);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Shareholders update(Shareholders shareholders,
		ServiceContext serviceContext) {
		return getPersistence().update(shareholders, serviceContext);
	}

	/**
	* Caches the shareholders in the entity cache if it is enabled.
	*
	* @param shareholders the shareholders
	*/
	public static void cacheResult(Shareholders shareholders) {
		getPersistence().cacheResult(shareholders);
	}

	/**
	* Caches the shareholderses in the entity cache if it is enabled.
	*
	* @param shareholderses the shareholderses
	*/
	public static void cacheResult(List<Shareholders> shareholderses) {
		getPersistence().cacheResult(shareholderses);
	}

	/**
	* Creates a new shareholders with the primary key. Does not add the shareholders to the database.
	*
	* @param SOLE_ID the primary key for the new shareholders
	* @return the new shareholders
	*/
	public static Shareholders create(long SOLE_ID) {
		return getPersistence().create(SOLE_ID);
	}

	/**
	* Removes the shareholders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders that was removed
	* @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	*/
	public static Shareholders remove(long SOLE_ID)
		throws com.rinfra.satisfactionsurvey.exception.NoSuchShareholdersException {
		return getPersistence().remove(SOLE_ID);
	}

	public static Shareholders updateImpl(Shareholders shareholders) {
		return getPersistence().updateImpl(shareholders);
	}

	/**
	* Returns the shareholders with the primary key or throws a {@link NoSuchShareholdersException} if it could not be found.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders
	* @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	*/
	public static Shareholders findByPrimaryKey(long SOLE_ID)
		throws com.rinfra.satisfactionsurvey.exception.NoSuchShareholdersException {
		return getPersistence().findByPrimaryKey(SOLE_ID);
	}

	/**
	* Returns the shareholders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders, or <code>null</code> if a shareholders with the primary key could not be found
	*/
	public static Shareholders fetchByPrimaryKey(long SOLE_ID) {
		return getPersistence().fetchByPrimaryKey(SOLE_ID);
	}

	public static java.util.Map<java.io.Serializable, Shareholders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the shareholderses.
	*
	* @return the shareholderses
	*/
	public static List<Shareholders> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the shareholderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shareholderses
	* @param end the upper bound of the range of shareholderses (not inclusive)
	* @return the range of shareholderses
	*/
	public static List<Shareholders> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the shareholderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shareholderses
	* @param end the upper bound of the range of shareholderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shareholderses
	*/
	public static List<Shareholders> findAll(int start, int end,
		OrderByComparator<Shareholders> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the shareholderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shareholderses
	* @param end the upper bound of the range of shareholderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of shareholderses
	*/
	public static List<Shareholders> findAll(int start, int end,
		OrderByComparator<Shareholders> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the shareholderses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of shareholderses.
	*
	* @return the number of shareholderses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ShareholdersPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ShareholdersPersistence, ShareholdersPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ShareholdersPersistence.class);
}