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

package com.media.query.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.media.query.model.MediaQuery;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the media query service. This utility wraps {@link com.media.query.service.persistence.impl.MediaQueryPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MediaQueryPersistence
 * @see com.media.query.service.persistence.impl.MediaQueryPersistenceImpl
 * @generated
 */
@ProviderType
public class MediaQueryUtil {
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
	public static void clearCache(MediaQuery mediaQuery) {
		getPersistence().clearCache(mediaQuery);
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
	public static List<MediaQuery> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<MediaQuery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<MediaQuery> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<MediaQuery> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static MediaQuery update(MediaQuery mediaQuery) {
		return getPersistence().update(mediaQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static MediaQuery update(MediaQuery mediaQuery,
		ServiceContext serviceContext) {
		return getPersistence().update(mediaQuery, serviceContext);
	}

	/**
	* Caches the media query in the entity cache if it is enabled.
	*
	* @param mediaQuery the media query
	*/
	public static void cacheResult(MediaQuery mediaQuery) {
		getPersistence().cacheResult(mediaQuery);
	}

	/**
	* Caches the media queries in the entity cache if it is enabled.
	*
	* @param mediaQueries the media queries
	*/
	public static void cacheResult(List<MediaQuery> mediaQueries) {
		getPersistence().cacheResult(mediaQueries);
	}

	/**
	* Creates a new media query with the primary key. Does not add the media query to the database.
	*
	* @param srNo the primary key for the new media query
	* @return the new media query
	*/
	public static MediaQuery create(long srNo) {
		return getPersistence().create(srNo);
	}

	/**
	* Removes the media query with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srNo the primary key of the media query
	* @return the media query that was removed
	* @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	*/
	public static MediaQuery remove(long srNo)
		throws com.media.query.exception.NoSuchMediaQueryException {
		return getPersistence().remove(srNo);
	}

	public static MediaQuery updateImpl(MediaQuery mediaQuery) {
		return getPersistence().updateImpl(mediaQuery);
	}

	/**
	* Returns the media query with the primary key or throws a {@link NoSuchMediaQueryException} if it could not be found.
	*
	* @param srNo the primary key of the media query
	* @return the media query
	* @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	*/
	public static MediaQuery findByPrimaryKey(long srNo)
		throws com.media.query.exception.NoSuchMediaQueryException {
		return getPersistence().findByPrimaryKey(srNo);
	}

	/**
	* Returns the media query with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srNo the primary key of the media query
	* @return the media query, or <code>null</code> if a media query with the primary key could not be found
	*/
	public static MediaQuery fetchByPrimaryKey(long srNo) {
		return getPersistence().fetchByPrimaryKey(srNo);
	}

	public static java.util.Map<java.io.Serializable, MediaQuery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the media queries.
	*
	* @return the media queries
	*/
	public static List<MediaQuery> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the media queries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media queries
	* @param end the upper bound of the range of media queries (not inclusive)
	* @return the range of media queries
	*/
	public static List<MediaQuery> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the media queries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media queries
	* @param end the upper bound of the range of media queries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of media queries
	*/
	public static List<MediaQuery> findAll(int start, int end,
		OrderByComparator<MediaQuery> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the media queries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media queries
	* @param end the upper bound of the range of media queries (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of media queries
	*/
	public static List<MediaQuery> findAll(int start, int end,
		OrderByComparator<MediaQuery> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the media queries from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of media queries.
	*
	* @return the number of media queries
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static MediaQueryPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MediaQueryPersistence, MediaQueryPersistence> _serviceTracker =
		ServiceTrackerFactory.open(MediaQueryPersistence.class);
}