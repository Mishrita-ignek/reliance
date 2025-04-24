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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rinfra.news.exception.NoSuchPressNewsException;
import com.rinfra.news.model.PressNews;

/**
 * The persistence interface for the press news service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vipin Singh
 * @see com.rinfra.news.service.persistence.impl.PressNewsPersistenceImpl
 * @see PressNewsUtil
 * @generated
 */
@ProviderType
public interface PressNewsPersistence extends BasePersistence<PressNews> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PressNewsUtil} to access the press news persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the press newses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the matching press newses
	*/
	public java.util.List<PressNews> findByNewsYearAndMonth(int year, int month);

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
	public java.util.List<PressNews> findByNewsYearAndMonth(int year,
		int month, int start, int end);

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
	public java.util.List<PressNews> findByNewsYearAndMonth(int year,
		int month, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator);

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
	public java.util.List<PressNews> findByNewsYearAndMonth(int year,
		int month, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public PressNews findByNewsYearAndMonth_First(int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException;

	/**
	* Returns the first press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public PressNews fetchByNewsYearAndMonth_First(int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator);

	/**
	* Returns the last press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public PressNews findByNewsYearAndMonth_Last(int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException;

	/**
	* Returns the last press news in the ordered set where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public PressNews fetchByNewsYearAndMonth_Last(int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator);

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
	public PressNews[] findByNewsYearAndMonth_PrevAndNext(long newsId,
		int year, int month,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException;

	/**
	* Removes all the press newses where year = &#63; and month = &#63; from the database.
	*
	* @param year the year
	* @param month the month
	*/
	public void removeByNewsYearAndMonth(int year, int month);

	/**
	* Returns the number of press newses where year = &#63; and month = &#63;.
	*
	* @param year the year
	* @param month the month
	* @return the number of matching press newses
	*/
	public int countByNewsYearAndMonth(int year, int month);

	/**
	* Returns all the press newses where year = &#63;.
	*
	* @param year the year
	* @return the matching press newses
	*/
	public java.util.List<PressNews> findByNewsYear(int year);

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
	public java.util.List<PressNews> findByNewsYear(int year, int start, int end);

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
	public java.util.List<PressNews> findByNewsYear(int year, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator);

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
	public java.util.List<PressNews> findByNewsYear(int year, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public PressNews findByNewsYear_First(int year,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException;

	/**
	* Returns the first press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public PressNews fetchByNewsYear_First(int year,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator);

	/**
	* Returns the last press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news
	* @throws NoSuchPressNewsException if a matching press news could not be found
	*/
	public PressNews findByNewsYear_Last(int year,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException;

	/**
	* Returns the last press news in the ordered set where year = &#63;.
	*
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press news, or <code>null</code> if a matching press news could not be found
	*/
	public PressNews fetchByNewsYear_Last(int year,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator);

	/**
	* Returns the press newses before and after the current press news in the ordered set where year = &#63;.
	*
	* @param newsId the primary key of the current press news
	* @param year the year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next press news
	* @throws NoSuchPressNewsException if a press news with the primary key could not be found
	*/
	public PressNews[] findByNewsYear_PrevAndNext(long newsId, int year,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException;

	/**
	* Removes all the press newses where year = &#63; from the database.
	*
	* @param year the year
	*/
	public void removeByNewsYear(int year);

	/**
	* Returns the number of press newses where year = &#63;.
	*
	* @param year the year
	* @return the number of matching press newses
	*/
	public int countByNewsYear(int year);

	/**
	* Caches the press news in the entity cache if it is enabled.
	*
	* @param pressNews the press news
	*/
	public void cacheResult(PressNews pressNews);

	/**
	* Caches the press newses in the entity cache if it is enabled.
	*
	* @param pressNewses the press newses
	*/
	public void cacheResult(java.util.List<PressNews> pressNewses);

	/**
	* Creates a new press news with the primary key. Does not add the press news to the database.
	*
	* @param newsId the primary key for the new press news
	* @return the new press news
	*/
	public PressNews create(long newsId);

	/**
	* Removes the press news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the press news
	* @return the press news that was removed
	* @throws NoSuchPressNewsException if a press news with the primary key could not be found
	*/
	public PressNews remove(long newsId) throws NoSuchPressNewsException;

	public PressNews updateImpl(PressNews pressNews);

	/**
	* Returns the press news with the primary key or throws a {@link NoSuchPressNewsException} if it could not be found.
	*
	* @param newsId the primary key of the press news
	* @return the press news
	* @throws NoSuchPressNewsException if a press news with the primary key could not be found
	*/
	public PressNews findByPrimaryKey(long newsId)
		throws NoSuchPressNewsException;

	/**
	* Returns the press news with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param newsId the primary key of the press news
	* @return the press news, or <code>null</code> if a press news with the primary key could not be found
	*/
	public PressNews fetchByPrimaryKey(long newsId);

	@Override
	public java.util.Map<java.io.Serializable, PressNews> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the press newses.
	*
	* @return the press newses
	*/
	public java.util.List<PressNews> findAll();

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
	public java.util.List<PressNews> findAll(int start, int end);

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
	public java.util.List<PressNews> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator);

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
	public java.util.List<PressNews> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the press newses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of press newses.
	*
	* @return the number of press newses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}