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

package com.rinfra.news.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rinfra.news.model.PressNews;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the press news service. This utility wraps {@link com.rinfra.news.service.persistence.impl.PressNewsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vipin Singh
 * @see PressNewsPersistence
 * @see com.rinfra.news.service.persistence.impl.PressNewsPersistenceImpl
 * @generated
 */
@ProviderType
public class PressNewsUtil {
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
	public static void clearCache(PressNews pressNews) {
		getPersistence().clearCache(pressNews);
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
	public static List<PressNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PressNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PressNews> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PressNews> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PressNews update(PressNews pressNews) {
		return getPersistence().update(pressNews);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PressNews update(PressNews pressNews,
		ServiceContext serviceContext) {
		return getPersistence().update(pressNews, serviceContext);
	}

	/**
	* Returns all the press newses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the matching press newses
	*/
	public static List<PressNews> findByNewsYearAndMonth(int year, int month) {
		return getPersistence().findByNewsYearAndMonth(year, month);
	}

	/**
	* Returns a range of all the press newses where year = &#63; and month = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param month the month
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @return the range of matching press newses
	*/
	public static List<PressNews> findByNewsYearAndMonth(int year, int month,
		int start, int end) {
		return getPersistence().findByNewsYearAndMonth(year, month, start, end);
	}

	/**
	* Returns an ordered range of all the press newses where year = &#63; and month = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param month the month
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching press newses
	*/
	public static List<PressNews> findByNewsYearAndMonth(int year, int month,
		int start, int end, OrderByComparator<PressNews> orderByComparator) {
		return getPersistence()
				   .findByNewsYearAndMonth(year, month, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the press newses where year = &#63; and month = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param month the month
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching press newses
	*/
	public static List<PressNews> findByNewsYearAndMonth(int year, int month,
		int start, int end, OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByNewsYearAndMonth(year, month, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public static PressNews findByNewsYearAndMonth_First(int year, int month,
		OrderByComparator<PressNews> orderByComparator)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence()
				   .findByNewsYearAndMonth_First(year, month, orderByComparator);
	}

	/**
	* Returns the first press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public static PressNews fetchByNewsYearAndMonth_First(int year, int month,
		OrderByComparator<PressNews> orderByComparator) {
		return getPersistence()
				   .fetchByNewsYearAndMonth_First(year, month, orderByComparator);
	}

	/**
	* Returns the last press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public static PressNews findByNewsYearAndMonth_Last(int year, int month,
		OrderByComparator<PressNews> orderByComparator)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence()
				   .findByNewsYearAndMonth_Last(year, month, orderByComparator);
	}

	/**
	* Returns the last press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public static PressNews fetchByNewsYearAndMonth_Last(int year, int month,
		OrderByComparator<PressNews> orderByComparator) {
		return getPersistence()
				   .fetchByNewsYearAndMonth_Last(year, month, orderByComparator);
	}

	/**
	* Returns the press newses before and after the current press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param newsId the primary key of the current press news
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next press news
	* @throws NoSuchPressNewsException if a press news with the primary key could not be found
	*/
	public static PressNews[] findByNewsYearAndMonth_PrevAndNext(long newsId,
		int year, int month, OrderByComparator<PressNews> orderByComparator)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence()
				   .findByNewsYearAndMonth_PrevAndNext(newsId, year, month,
			orderByComparator);
	}

	/**
	* Removes all the press newses where year = &#63; and month = &#63; from the database.
	*
	* @param year the year
	* @param month the month
	*/
	public static void removeByNewsYearAndMonth(int year, int month) {
		getPersistence().removeByNewsYearAndMonth(year, month);
	}

	/**
	* Returns the number of press newses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the number of matching press newses
	*/
	public static int countByNewsYearAndMonth(int year, int month) {
		return getPersistence().countByNewsYearAndMonth(year, month);
	}

	/**
	* Returns all the press newses where year = &#63;.
	*
	* @param year the year
	* @return the matching press newses
	*/
	public static List<PressNews> findByNewsYear(int year) {
		return getPersistence().findByNewsYear(year);
	}

	/**
	* Returns a range of all the press newses where year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @return the range of matching press newses
	*/
	public static List<PressNews> findByNewsYear(int year, int start, int end) {
		return getPersistence().findByNewsYear(year, start, end);
	}

	/**
	* Returns an ordered range of all the press newses where year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching press newses
	*/
	public static List<PressNews> findByNewsYear(int year, int start, int end,
		OrderByComparator<PressNews> orderByComparator) {
		return getPersistence()
				   .findByNewsYear(year, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the press newses where year = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param year the year
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching press newses
	*/
	public static List<PressNews> findByNewsYear(int year, int start, int end,
		OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByNewsYear(year, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public static PressNews findByNewsYear_First(int year,
		OrderByComparator<PressNews> orderByComparator)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence().findByNewsYear_First(year, orderByComparator);
	}

	/**
	* Returns the first press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public static PressNews fetchByNewsYear_First(int year,
		OrderByComparator<PressNews> orderByComparator) {
		return getPersistence().fetchByNewsYear_First(year, orderByComparator);
	}

	/**
	* Returns the last press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public static PressNews findByNewsYear_Last(int year,
		OrderByComparator<PressNews> orderByComparator)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence().findByNewsYear_Last(year, orderByComparator);
	}

	/**
	* Returns the last press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public static PressNews fetchByNewsYear_Last(int year,
		OrderByComparator<PressNews> orderByComparator) {
		return getPersistence().fetchByNewsYear_Last(year, orderByComparator);
	}

	/**
	* Returns the press newses before and after the current press news in the ordered set where year = &#63;.
	*
	* @param newsId the primary key of the current press news
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next press news
	* @throws NoSuchPressNewsException if a press news with the primary key could not be found
	*/
	public static PressNews[] findByNewsYear_PrevAndNext(long newsId, int year,
		OrderByComparator<PressNews> orderByComparator)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence()
				   .findByNewsYear_PrevAndNext(newsId, year, orderByComparator);
	}

	/**
	* Removes all the press newses where year = &#63; from the database.
	*
	* @param year the year
	*/
	public static void removeByNewsYear(int year) {
		getPersistence().removeByNewsYear(year);
	}

	/**
	* Returns the number of press newses where year = &#63;.
	*
	* @param year the year
	* @return the number of matching press newses
	*/
	public static int countByNewsYear(int year) {
		return getPersistence().countByNewsYear(year);
	}

	/**
	* Caches the press news in the entity cache if it is enabled.
	*
	* @param pressNews the press news
	*/
	public static void cacheResult(PressNews pressNews) {
		getPersistence().cacheResult(pressNews);
	}

	/**
	* Caches the press newses in the entity cache if it is enabled.
	*
	* @param pressNewses the press newses
	*/
	public static void cacheResult(List<PressNews> pressNewses) {
		getPersistence().cacheResult(pressNewses);
	}

	/**
	* Creates a new press news with the primary key. Does not add the press news to the database.
	*
	* @param newsId the primary key for the new press news
	* @return the new press news
	*/
	public static PressNews create(long newsId) {
		return getPersistence().create(newsId);
	}

	/**
	* Removes the press news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the press news
	* @return the press news that was removed
	* @throws NoSuchPressNewsException if a press news with the primary key could not be found
	*/
	public static PressNews remove(long newsId)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence().remove(newsId);
	}

	public static PressNews updateImpl(PressNews pressNews) {
		return getPersistence().updateImpl(pressNews);
	}

	/**
	* Returns the press news with the primary key or throws a {@link NoSuchPressNewsException} if it could not be found.
	*
	* @param newsId the primary key of the press news
	* @return the press news
	* @throws NoSuchPressNewsException if a press news with the primary key could not be found
	*/
	public static PressNews findByPrimaryKey(long newsId)
		throws com.rinfra.news.exception.NoSuchPressNewsException {
		return getPersistence().findByPrimaryKey(newsId);
	}

	/**
	* Returns the press news with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param newsId the primary key of the press news
	* @return the press news, or <code>null</code> if a press news with the primary key could not be found
	*/
	public static PressNews fetchByPrimaryKey(long newsId) {
		return getPersistence().fetchByPrimaryKey(newsId);
	}

	public static java.util.Map<java.io.Serializable, PressNews> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the press newses.
	*
	* @return the press newses
	*/
	public static List<PressNews> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the press newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @return the range of press newses
	*/
	public static List<PressNews> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the press newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of press newses
	*/
	public static List<PressNews> findAll(int start, int end,
		OrderByComparator<PressNews> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the press newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of press newses
	*/
	public static List<PressNews> findAll(int start, int end,
		OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the press newses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of press newses.
	*
	* @return the number of press newses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PressNewsPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PressNewsPersistence, PressNewsPersistence> _serviceTracker =
		ServiceTrackerFactory.open(PressNewsPersistence.class);
}