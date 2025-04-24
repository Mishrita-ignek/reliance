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

package com.metro.mediarelease.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.metro.mediarelease.model.MetroMediaRelease;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the metro media release service. This utility wraps {@link com.metro.mediarelease.service.persistence.impl.MetroMediaReleasePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetroMediaReleasePersistence
 * @see com.metro.mediarelease.service.persistence.impl.MetroMediaReleasePersistenceImpl
 * @generated
 */
@ProviderType
public class MetroMediaReleaseUtil {
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
	public static void clearCache(MetroMediaRelease metroMediaRelease) {
		getPersistence().clearCache(metroMediaRelease);
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
	public static List<MetroMediaRelease> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MetroMediaRelease> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MetroMediaRelease> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MetroMediaRelease> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MetroMediaRelease update(MetroMediaRelease metroMediaRelease) {
		return getPersistence().update(metroMediaRelease);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MetroMediaRelease update(
		MetroMediaRelease metroMediaRelease, ServiceContext serviceContext) {
		return getPersistence().update(metroMediaRelease, serviceContext);
	}

	/**
	* Caches the metro media release in the entity cache if it is enabled.
	*
	* @param metroMediaRelease the metro media release
	*/
	public static void cacheResult(MetroMediaRelease metroMediaRelease) {
		getPersistence().cacheResult(metroMediaRelease);
	}

	/**
	* Caches the metro media releases in the entity cache if it is enabled.
	*
	* @param metroMediaReleases the metro media releases
	*/
	public static void cacheResult(List<MetroMediaRelease> metroMediaReleases) {
		getPersistence().cacheResult(metroMediaReleases);
	}

	/**
	* Creates a new metro media release with the primary key. Does not add the metro media release to the database.
	*
	* @param SRNO the primary key for the new metro media release
	* @return the new metro media release
	*/
	public static MetroMediaRelease create(long SRNO) {
		return getPersistence().create(SRNO);
	}

	/**
	* Removes the metro media release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release that was removed
	* @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	*/
	public static MetroMediaRelease remove(long SRNO)
		throws com.metro.mediarelease.exception.NoSuchMetroMediaReleaseException {
		return getPersistence().remove(SRNO);
	}

	public static MetroMediaRelease updateImpl(
		MetroMediaRelease metroMediaRelease) {
		return getPersistence().updateImpl(metroMediaRelease);
	}

	/**
	* Returns the metro media release with the primary key or throws a {@link NoSuchMetroMediaReleaseException} if it could not be found.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release
	* @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	*/
	public static MetroMediaRelease findByPrimaryKey(long SRNO)
		throws com.metro.mediarelease.exception.NoSuchMetroMediaReleaseException {
		return getPersistence().findByPrimaryKey(SRNO);
	}

	/**
	* Returns the metro media release with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release, or <code>null</code> if a metro media release with the primary key could not be found
	*/
	public static MetroMediaRelease fetchByPrimaryKey(long SRNO) {
		return getPersistence().fetchByPrimaryKey(SRNO);
	}

	public static java.util.Map<java.io.Serializable, MetroMediaRelease> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the metro media releases.
	*
	* @return the metro media releases
	*/
	public static List<MetroMediaRelease> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the metro media releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of metro media releases
	* @param end the upper bound of the range of metro media releases (not inclusive)
	* @return the range of metro media releases
	*/
	public static List<MetroMediaRelease> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the metro media releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of metro media releases
	* @param end the upper bound of the range of metro media releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of metro media releases
	*/
	public static List<MetroMediaRelease> findAll(int start, int end,
		OrderByComparator<MetroMediaRelease> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the metro media releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of metro media releases
	* @param end the upper bound of the range of metro media releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of metro media releases
	*/
	public static List<MetroMediaRelease> findAll(int start, int end,
		OrderByComparator<MetroMediaRelease> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the metro media releases from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of metro media releases.
	*
	* @return the number of metro media releases
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MetroMediaReleasePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MetroMediaReleasePersistence, MetroMediaReleasePersistence> _serviceTracker =
		ServiceTrackerFactory.open(MetroMediaReleasePersistence.class);
}