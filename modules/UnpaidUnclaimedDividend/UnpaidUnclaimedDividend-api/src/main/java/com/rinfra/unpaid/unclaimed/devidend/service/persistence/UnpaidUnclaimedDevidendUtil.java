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

package com.rinfra.unpaid.unclaimed.devidend.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rinfra.unpaid.unclaimed.devidend.model.UnpaidUnclaimedDevidend;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the unpaid unclaimed devidend service. This utility wraps {@link com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl.UnpaidUnclaimedDevidendPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendPersistence
 * @see com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl.UnpaidUnclaimedDevidendPersistenceImpl
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendUtil {
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
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		getPersistence().clearCache(unpaidUnclaimedDevidend);
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
	public static List<UnpaidUnclaimedDevidend> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<UnpaidUnclaimedDevidend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<UnpaidUnclaimedDevidend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidend> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static UnpaidUnclaimedDevidend update(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		return getPersistence().update(unpaidUnclaimedDevidend);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static UnpaidUnclaimedDevidend update(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend,
		ServiceContext serviceContext) {
		return getPersistence().update(unpaidUnclaimedDevidend, serviceContext);
	}

	/**
	* Caches the unpaid unclaimed devidend in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidend the unpaid unclaimed devidend
	*/
	public static void cacheResult(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		getPersistence().cacheResult(unpaidUnclaimedDevidend);
	}

	/**
	* Caches the unpaid unclaimed devidends in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidends the unpaid unclaimed devidends
	*/
	public static void cacheResult(
		List<UnpaidUnclaimedDevidend> unpaidUnclaimedDevidends) {
		getPersistence().cacheResult(unpaidUnclaimedDevidends);
	}

	/**
	* Creates a new unpaid unclaimed devidend with the primary key. Does not add the unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new unpaid unclaimed devidend
	* @return the new unpaid unclaimed devidend
	*/
	public static UnpaidUnclaimedDevidend create(long SRNO) {
		return getPersistence().create(SRNO);
	}

	/**
	* Removes the unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend that was removed
	* @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public static UnpaidUnclaimedDevidend remove(long SRNO)
		throws com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchUnpaidUnclaimedDevidendException {
		return getPersistence().remove(SRNO);
	}

	public static UnpaidUnclaimedDevidend updateImpl(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		return getPersistence().updateImpl(unpaidUnclaimedDevidend);
	}

	/**
	* Returns the unpaid unclaimed devidend with the primary key or throws a {@link NoSuchUnpaidUnclaimedDevidendException} if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend
	* @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public static UnpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchUnpaidUnclaimedDevidendException {
		return getPersistence().findByPrimaryKey(SRNO);
	}

	/**
	* Returns the unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend, or <code>null</code> if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public static UnpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO) {
		return getPersistence().fetchByPrimaryKey(SRNO);
	}

	public static java.util.Map<java.io.Serializable, UnpaidUnclaimedDevidend> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the unpaid unclaimed devidends.
	*
	* @return the unpaid unclaimed devidends
	*/
	public static List<UnpaidUnclaimedDevidend> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @return the range of unpaid unclaimed devidends
	*/
	public static List<UnpaidUnclaimedDevidend> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of unpaid unclaimed devidends
	*/
	public static List<UnpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidend> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of unpaid unclaimed devidends
	*/
	public static List<UnpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the unpaid unclaimed devidends from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of unpaid unclaimed devidends.
	*
	* @return the number of unpaid unclaimed devidends
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static UnpaidUnclaimedDevidendPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UnpaidUnclaimedDevidendPersistence, UnpaidUnclaimedDevidendPersistence> _serviceTracker =
		ServiceTrackerFactory.open(UnpaidUnclaimedDevidendPersistence.class);
}