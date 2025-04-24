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

package com.news.media.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.news.media.model.NewsAndMedia;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the news and media service. This utility wraps {@link com.news.media.service.persistence.impl.NewsAndMediaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndMediaPersistence
 * @see com.news.media.service.persistence.impl.NewsAndMediaPersistenceImpl
 * @generated
 */
@ProviderType
public class NewsAndMediaUtil {
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
	public static void clearCache(NewsAndMedia newsAndMedia) {
		getPersistence().clearCache(newsAndMedia);
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
	public static List<NewsAndMedia> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<NewsAndMedia> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<NewsAndMedia> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<NewsAndMedia> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static NewsAndMedia update(NewsAndMedia newsAndMedia) {
		return getPersistence().update(newsAndMedia);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static NewsAndMedia update(NewsAndMedia newsAndMedia,
		ServiceContext serviceContext) {
		return getPersistence().update(newsAndMedia, serviceContext);
	}

	/**
	* Caches the news and media in the entity cache if it is enabled.
	*
	* @param newsAndMedia the news and media
	*/
	public static void cacheResult(NewsAndMedia newsAndMedia) {
		getPersistence().cacheResult(newsAndMedia);
	}

	/**
	* Caches the news and medias in the entity cache if it is enabled.
	*
	* @param newsAndMedias the news and medias
	*/
	public static void cacheResult(List<NewsAndMedia> newsAndMedias) {
		getPersistence().cacheResult(newsAndMedias);
	}

	/**
	* Creates a new news and media with the primary key. Does not add the news and media to the database.
	*
	* @param SRNO the primary key for the new news and media
	* @return the new news and media
	*/
	public static NewsAndMedia create(long SRNO) {
		return getPersistence().create(SRNO);
	}

	/**
	* Removes the news and media with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media that was removed
	* @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	*/
	public static NewsAndMedia remove(long SRNO)
		throws com.news.media.exception.NoSuchNewsAndMediaException {
		return getPersistence().remove(SRNO);
	}

	public static NewsAndMedia updateImpl(NewsAndMedia newsAndMedia) {
		return getPersistence().updateImpl(newsAndMedia);
	}

	/**
	* Returns the news and media with the primary key or throws a {@link NoSuchNewsAndMediaException} if it could not be found.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media
	* @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	*/
	public static NewsAndMedia findByPrimaryKey(long SRNO)
		throws com.news.media.exception.NoSuchNewsAndMediaException {
		return getPersistence().findByPrimaryKey(SRNO);
	}

	/**
	* Returns the news and media with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media, or <code>null</code> if a news and media with the primary key could not be found
	*/
	public static NewsAndMedia fetchByPrimaryKey(long SRNO) {
		return getPersistence().fetchByPrimaryKey(SRNO);
	}

	public static java.util.Map<java.io.Serializable, NewsAndMedia> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the news and medias.
	*
	* @return the news and medias
	*/
	public static List<NewsAndMedia> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the news and medias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news and medias
	* @param end the upper bound of the range of news and medias (not inclusive)
	* @return the range of news and medias
	*/
	public static List<NewsAndMedia> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the news and medias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news and medias
	* @param end the upper bound of the range of news and medias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of news and medias
	*/
	public static List<NewsAndMedia> findAll(int start, int end,
		OrderByComparator<NewsAndMedia> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the news and medias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news and medias
	* @param end the upper bound of the range of news and medias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of news and medias
	*/
	public static List<NewsAndMedia> findAll(int start, int end,
		OrderByComparator<NewsAndMedia> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the news and medias from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of news and medias.
	*
	* @return the number of news and medias
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static NewsAndMediaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<NewsAndMediaPersistence, NewsAndMediaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(NewsAndMediaPersistence.class);
}