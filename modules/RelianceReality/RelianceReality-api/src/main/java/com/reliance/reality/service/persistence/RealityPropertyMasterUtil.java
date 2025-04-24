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

package com.reliance.reality.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.reliance.reality.model.RealityPropertyMaster;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the reality property master service. This utility wraps {@link com.reliance.reality.service.persistence.impl.RealityPropertyMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMasterPersistence
 * @see com.reliance.reality.service.persistence.impl.RealityPropertyMasterPersistenceImpl
 * @generated
 */
@ProviderType
public class RealityPropertyMasterUtil {
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
	public static void clearCache(RealityPropertyMaster realityPropertyMaster) {
		getPersistence().clearCache(realityPropertyMaster);
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
	public static List<RealityPropertyMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RealityPropertyMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RealityPropertyMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RealityPropertyMaster> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RealityPropertyMaster update(
		RealityPropertyMaster realityPropertyMaster) {
		return getPersistence().update(realityPropertyMaster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RealityPropertyMaster update(
		RealityPropertyMaster realityPropertyMaster,
		ServiceContext serviceContext) {
		return getPersistence().update(realityPropertyMaster, serviceContext);
	}

	/**
	* Caches the reality property master in the entity cache if it is enabled.
	*
	* @param realityPropertyMaster the reality property master
	*/
	public static void cacheResult(RealityPropertyMaster realityPropertyMaster) {
		getPersistence().cacheResult(realityPropertyMaster);
	}

	/**
	* Caches the reality property masters in the entity cache if it is enabled.
	*
	* @param realityPropertyMasters the reality property masters
	*/
	public static void cacheResult(
		List<RealityPropertyMaster> realityPropertyMasters) {
		getPersistence().cacheResult(realityPropertyMasters);
	}

	/**
	* Creates a new reality property master with the primary key. Does not add the reality property master to the database.
	*
	* @param property_ID the primary key for the new reality property master
	* @return the new reality property master
	*/
	public static RealityPropertyMaster create(long property_ID) {
		return getPersistence().create(property_ID);
	}

	/**
	* Removes the reality property master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master that was removed
	* @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	*/
	public static RealityPropertyMaster remove(long property_ID)
		throws com.reliance.reality.exception.NoSuchRealityPropertyMasterException {
		return getPersistence().remove(property_ID);
	}

	public static RealityPropertyMaster updateImpl(
		RealityPropertyMaster realityPropertyMaster) {
		return getPersistence().updateImpl(realityPropertyMaster);
	}

	/**
	* Returns the reality property master with the primary key or throws a {@link NoSuchRealityPropertyMasterException} if it could not be found.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master
	* @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	*/
	public static RealityPropertyMaster findByPrimaryKey(long property_ID)
		throws com.reliance.reality.exception.NoSuchRealityPropertyMasterException {
		return getPersistence().findByPrimaryKey(property_ID);
	}

	/**
	* Returns the reality property master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master, or <code>null</code> if a reality property master with the primary key could not be found
	*/
	public static RealityPropertyMaster fetchByPrimaryKey(long property_ID) {
		return getPersistence().fetchByPrimaryKey(property_ID);
	}

	public static java.util.Map<java.io.Serializable, RealityPropertyMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the reality property masters.
	*
	* @return the reality property masters
	*/
	public static List<RealityPropertyMaster> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @return the range of reality property masters
	*/
	public static List<RealityPropertyMaster> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reality property masters
	*/
	public static List<RealityPropertyMaster> findAll(int start, int end,
		OrderByComparator<RealityPropertyMaster> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of reality property masters
	*/
	public static List<RealityPropertyMaster> findAll(int start, int end,
		OrderByComparator<RealityPropertyMaster> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the reality property masters from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of reality property masters.
	*
	* @return the number of reality property masters
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static RealityPropertyMasterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RealityPropertyMasterPersistence, RealityPropertyMasterPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RealityPropertyMasterPersistence.class);
}