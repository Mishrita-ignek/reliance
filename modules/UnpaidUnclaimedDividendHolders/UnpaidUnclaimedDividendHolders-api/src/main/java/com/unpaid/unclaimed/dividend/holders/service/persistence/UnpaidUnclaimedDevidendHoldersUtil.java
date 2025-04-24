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

package com.unpaid.unclaimed.dividend.holders.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the unpaid unclaimed devidend holders service. This utility wraps {@link com.unpaid.unclaimed.dividend.holders.service.persistence.impl.UnpaidUnclaimedDevidendHoldersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendHoldersPersistence
 * @see com.unpaid.unclaimed.dividend.holders.service.persistence.impl.UnpaidUnclaimedDevidendHoldersPersistenceImpl
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendHoldersUtil {
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
	public static void clearCache(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		getPersistence().clearCache(unpaidUnclaimedDevidendHolders);
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
	public static List<UnpaidUnclaimedDevidendHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UnpaidUnclaimedDevidendHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UnpaidUnclaimedDevidendHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidendHolders> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UnpaidUnclaimedDevidendHolders update(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return getPersistence().update(unpaidUnclaimedDevidendHolders);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UnpaidUnclaimedDevidendHolders update(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(unpaidUnclaimedDevidendHolders, serviceContext);
	}

	/**
	* Caches the unpaid unclaimed devidend holders in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	*/
	public static void cacheResult(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		getPersistence().cacheResult(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Caches the unpaid unclaimed devidend holderses in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidendHolderses the unpaid unclaimed devidend holderses
	*/
	public static void cacheResult(
		List<UnpaidUnclaimedDevidendHolders> unpaidUnclaimedDevidendHolderses) {
		getPersistence().cacheResult(unpaidUnclaimedDevidendHolderses);
	}

	/**
	* Creates a new unpaid unclaimed devidend holders with the primary key. Does not add the unpaid unclaimed devidend holders to the database.
	*
	* @param SRNO the primary key for the new unpaid unclaimed devidend holders
	* @return the new unpaid unclaimed devidend holders
	*/
	public static UnpaidUnclaimedDevidendHolders create(long SRNO) {
		return getPersistence().create(SRNO);
	}

	/**
	* Removes the unpaid unclaimed devidend holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was removed
	* @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public static UnpaidUnclaimedDevidendHolders remove(long SRNO)
		throws com.unpaid.unclaimed.dividend.holders.exception.NoSuchUnpaidUnclaimedDevidendHoldersException {
		return getPersistence().remove(SRNO);
	}

	public static UnpaidUnclaimedDevidendHolders updateImpl(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return getPersistence().updateImpl(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Returns the unpaid unclaimed devidend holders with the primary key or throws a {@link NoSuchUnpaidUnclaimedDevidendHoldersException} if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders
	* @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public static UnpaidUnclaimedDevidendHolders findByPrimaryKey(long SRNO)
		throws com.unpaid.unclaimed.dividend.holders.exception.NoSuchUnpaidUnclaimedDevidendHoldersException {
		return getPersistence().findByPrimaryKey(SRNO);
	}

	/**
	* Returns the unpaid unclaimed devidend holders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders, or <code>null</code> if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public static UnpaidUnclaimedDevidendHolders fetchByPrimaryKey(long SRNO) {
		return getPersistence().fetchByPrimaryKey(SRNO);
	}

	public static java.util.Map<java.io.Serializable, UnpaidUnclaimedDevidendHolders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the unpaid unclaimed devidend holderses.
	*
	* @return the unpaid unclaimed devidend holderses
	*/
	public static List<UnpaidUnclaimedDevidendHolders> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the unpaid unclaimed devidend holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidend holderses
	* @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	* @return the range of unpaid unclaimed devidend holderses
	*/
	public static List<UnpaidUnclaimedDevidendHolders> findAll(int start,
		int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the unpaid unclaimed devidend holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidend holderses
	* @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of unpaid unclaimed devidend holderses
	*/
	public static List<UnpaidUnclaimedDevidendHolders> findAll(int start,
		int end,
		OrderByComparator<UnpaidUnclaimedDevidendHolders> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the unpaid unclaimed devidend holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidend holderses
	* @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of unpaid unclaimed devidend holderses
	*/
	public static List<UnpaidUnclaimedDevidendHolders> findAll(int start,
		int end,
		OrderByComparator<UnpaidUnclaimedDevidendHolders> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the unpaid unclaimed devidend holderses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of unpaid unclaimed devidend holderses.
	*
	* @return the number of unpaid unclaimed devidend holderses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UnpaidUnclaimedDevidendHoldersPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UnpaidUnclaimedDevidendHoldersPersistence, UnpaidUnclaimedDevidendHoldersPersistence> _serviceTracker =
		ServiceTrackerFactory.open(UnpaidUnclaimedDevidendHoldersPersistence.class);
}