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

import com.rinfra.unpaid.unclaimed.devidend.model.RpowerUnpaidUnclaimedDevidend;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the rpower unpaid unclaimed devidend service. This utility wraps {@link com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl.RpowerUnpaidUnclaimedDevidendPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerUnpaidUnclaimedDevidendPersistence
 * @see com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl.RpowerUnpaidUnclaimedDevidendPersistenceImpl
 * @generated
 */
@ProviderType
public class RpowerUnpaidUnclaimedDevidendUtil {
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
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		getPersistence().clearCache(rpowerUnpaidUnclaimedDevidend);
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
	public static List<RpowerUnpaidUnclaimedDevidend> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RpowerUnpaidUnclaimedDevidend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RpowerUnpaidUnclaimedDevidend> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RpowerUnpaidUnclaimedDevidend update(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return getPersistence().update(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RpowerUnpaidUnclaimedDevidend update(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend,
		ServiceContext serviceContext) {
		return getPersistence()
				   .update(rpowerUnpaidUnclaimedDevidend, serviceContext);
	}

	/**
	* Returns all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @return the matching rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return getPersistence().findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
	}

	/**
	* Returns a range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @return the range of matching rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES, int start, int end) {
		return getPersistence()
				   .findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES, start, end);
	}

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES, int start, int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		return getPersistence()
				   .findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES, int start, int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend findByFOLIO_NO_OF_ITIES_First(
		java.lang.String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchRpowerUnpaidUnclaimedDevidendException {
		return getPersistence()
				   .findByFOLIO_NO_OF_ITIES_First(FOLIO_NO_OF_ITIES,
			orderByComparator);
	}

	/**
	* Returns the first rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rpower unpaid unclaimed devidend, or <code>null</code> if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend fetchByFOLIO_NO_OF_ITIES_First(
		java.lang.String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		return getPersistence()
				   .fetchByFOLIO_NO_OF_ITIES_First(FOLIO_NO_OF_ITIES,
			orderByComparator);
	}

	/**
	* Returns the last rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend findByFOLIO_NO_OF_ITIES_Last(
		java.lang.String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchRpowerUnpaidUnclaimedDevidendException {
		return getPersistence()
				   .findByFOLIO_NO_OF_ITIES_Last(FOLIO_NO_OF_ITIES,
			orderByComparator);
	}

	/**
	* Returns the last rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rpower unpaid unclaimed devidend, or <code>null</code> if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend fetchByFOLIO_NO_OF_ITIES_Last(
		java.lang.String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		return getPersistence()
				   .fetchByFOLIO_NO_OF_ITIES_Last(FOLIO_NO_OF_ITIES,
			orderByComparator);
	}

	/**
	* Returns the rpower unpaid unclaimed devidends before and after the current rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param SRNO the primary key of the current rpower unpaid unclaimed devidend
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend[] findByFOLIO_NO_OF_ITIES_PrevAndNext(
		long SRNO, java.lang.String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchRpowerUnpaidUnclaimedDevidendException {
		return getPersistence()
				   .findByFOLIO_NO_OF_ITIES_PrevAndNext(SRNO,
			FOLIO_NO_OF_ITIES, orderByComparator);
	}

	/**
	* Removes all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63; from the database.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	*/
	public static void removeByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES) {
		getPersistence().removeByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
	}

	/**
	* Returns the number of rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @return the number of matching rpower unpaid unclaimed devidends
	*/
	public static int countByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return getPersistence().countByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
	}

	/**
	* Caches the rpower unpaid unclaimed devidend in the entity cache if it is enabled.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	*/
	public static void cacheResult(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		getPersistence().cacheResult(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Caches the rpower unpaid unclaimed devidends in the entity cache if it is enabled.
	*
	* @param rpowerUnpaidUnclaimedDevidends the rpower unpaid unclaimed devidends
	*/
	public static void cacheResult(
		List<RpowerUnpaidUnclaimedDevidend> rpowerUnpaidUnclaimedDevidends) {
		getPersistence().cacheResult(rpowerUnpaidUnclaimedDevidends);
	}

	/**
	* Creates a new rpower unpaid unclaimed devidend with the primary key. Does not add the rpower unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new rpower unpaid unclaimed devidend
	* @return the new rpower unpaid unclaimed devidend
	*/
	public static RpowerUnpaidUnclaimedDevidend create(long SRNO) {
		return getPersistence().create(SRNO);
	}

	/**
	* Removes the rpower unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend remove(long SRNO)
		throws com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchRpowerUnpaidUnclaimedDevidendException {
		return getPersistence().remove(SRNO);
	}

	public static RpowerUnpaidUnclaimedDevidend updateImpl(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return getPersistence().updateImpl(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Returns the rpower unpaid unclaimed devidend with the primary key or throws a {@link NoSuchRpowerUnpaidUnclaimedDevidendException} if it could not be found.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchRpowerUnpaidUnclaimedDevidendException {
		return getPersistence().findByPrimaryKey(SRNO);
	}

	/**
	* Returns the rpower unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend, or <code>null</code> if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public static RpowerUnpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO) {
		return getPersistence().fetchByPrimaryKey(SRNO);
	}

	public static java.util.Map<java.io.Serializable, RpowerUnpaidUnclaimedDevidend> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the rpower unpaid unclaimed devidends.
	*
	* @return the rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @return the range of rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findAll(int start,
		int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rpower unpaid unclaimed devidends
	*/
	public static List<RpowerUnpaidUnclaimedDevidend> findAll(int start,
		int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the rpower unpaid unclaimed devidends from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rpower unpaid unclaimed devidends.
	*
	* @return the number of rpower unpaid unclaimed devidends
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RpowerUnpaidUnclaimedDevidendPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RpowerUnpaidUnclaimedDevidendPersistence, RpowerUnpaidUnclaimedDevidendPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RpowerUnpaidUnclaimedDevidendPersistence.class);
}