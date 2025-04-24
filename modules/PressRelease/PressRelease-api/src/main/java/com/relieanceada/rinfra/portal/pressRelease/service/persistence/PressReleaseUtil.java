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

package com.relieanceada.rinfra.portal.pressRelease.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the press release service. This utility wraps {@link com.relieanceada.rinfra.portal.pressRelease.service.persistence.impl.PressReleasePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vipin Singh
 * @see PressReleasePersistence
 * @see com.relieanceada.rinfra.portal.pressRelease.service.persistence.impl.PressReleasePersistenceImpl
 * @generated
 */
@ProviderType
public class PressReleaseUtil {
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
	public static void clearCache(PressRelease pressRelease) {
		getPersistence().clearCache(pressRelease);
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
	public static List<PressRelease> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PressRelease> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PressRelease> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static PressRelease update(PressRelease pressRelease) {
		return getPersistence().update(pressRelease);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static PressRelease update(PressRelease pressRelease,
		ServiceContext serviceContext) {
		return getPersistence().update(pressRelease, serviceContext);
	}

	/**
	* Returns all the press releases where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @return the matching press releases
	*/
	public static List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear) {
		return getPersistence().findByselectedNewsYear(newsYear);
	}

	/**
	* Returns a range of all the press releases where newsYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param newsYear the news year
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @return the range of matching press releases
	*/
	public static List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear, int start, int end) {
		return getPersistence().findByselectedNewsYear(newsYear, start, end);
	}

	/**
	* Returns an ordered range of all the press releases where newsYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param newsYear the news year
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching press releases
	*/
	public static List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear, int start, int end,
		OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence()
				   .findByselectedNewsYear(newsYear, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the press releases where newsYear = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param newsYear the news year
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching press releases
	*/
	public static List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear, int start, int end,
		OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByselectedNewsYear(newsYear, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public static PressRelease findByselectedNewsYear_First(
		java.lang.String newsYear,
		OrderByComparator<PressRelease> orderByComparator)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence()
				   .findByselectedNewsYear_First(newsYear, orderByComparator);
	}

	/**
	* Returns the first press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public static PressRelease fetchByselectedNewsYear_First(
		java.lang.String newsYear,
		OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence()
				   .fetchByselectedNewsYear_First(newsYear, orderByComparator);
	}

	/**
	* Returns the last press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public static PressRelease findByselectedNewsYear_Last(
		java.lang.String newsYear,
		OrderByComparator<PressRelease> orderByComparator)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence()
				   .findByselectedNewsYear_Last(newsYear, orderByComparator);
	}

	/**
	* Returns the last press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public static PressRelease fetchByselectedNewsYear_Last(
		java.lang.String newsYear,
		OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence()
				   .fetchByselectedNewsYear_Last(newsYear, orderByComparator);
	}

	/**
	* Returns the press releases before and after the current press release in the ordered set where newsYear = &#63;.
	*
	* @param pressId the primary key of the current press release
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next press release
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public static PressRelease[] findByselectedNewsYear_PrevAndNext(
		long pressId, java.lang.String newsYear,
		OrderByComparator<PressRelease> orderByComparator)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence()
				   .findByselectedNewsYear_PrevAndNext(pressId, newsYear,
			orderByComparator);
	}

	/**
	* Removes all the press releases where newsYear = &#63; from the database.
	*
	* @param newsYear the news year
	*/
	public static void removeByselectedNewsYear(java.lang.String newsYear) {
		getPersistence().removeByselectedNewsYear(newsYear);
	}

	/**
	* Returns the number of press releases where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @return the number of matching press releases
	*/
	public static int countByselectedNewsYear(java.lang.String newsYear) {
		return getPersistence().countByselectedNewsYear(newsYear);
	}

	/**
	* Returns all the press releases where heading = &#63;.
	*
	* @param heading the heading
	* @return the matching press releases
	*/
	public static List<PressRelease> findByheading(java.lang.String heading) {
		return getPersistence().findByheading(heading);
	}

	/**
	* Returns a range of all the press releases where heading = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param heading the heading
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @return the range of matching press releases
	*/
	public static List<PressRelease> findByheading(java.lang.String heading,
		int start, int end) {
		return getPersistence().findByheading(heading, start, end);
	}

	/**
	* Returns an ordered range of all the press releases where heading = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param heading the heading
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching press releases
	*/
	public static List<PressRelease> findByheading(java.lang.String heading,
		int start, int end, OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence()
				   .findByheading(heading, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the press releases where heading = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param heading the heading
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching press releases
	*/
	public static List<PressRelease> findByheading(java.lang.String heading,
		int start, int end, OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByheading(heading, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public static PressRelease findByheading_First(java.lang.String heading,
		OrderByComparator<PressRelease> orderByComparator)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence().findByheading_First(heading, orderByComparator);
	}

	/**
	* Returns the first press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public static PressRelease fetchByheading_First(java.lang.String heading,
		OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence().fetchByheading_First(heading, orderByComparator);
	}

	/**
	* Returns the last press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public static PressRelease findByheading_Last(java.lang.String heading,
		OrderByComparator<PressRelease> orderByComparator)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence().findByheading_Last(heading, orderByComparator);
	}

	/**
	* Returns the last press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public static PressRelease fetchByheading_Last(java.lang.String heading,
		OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence().fetchByheading_Last(heading, orderByComparator);
	}

	/**
	* Returns the press releases before and after the current press release in the ordered set where heading = &#63;.
	*
	* @param pressId the primary key of the current press release
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next press release
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public static PressRelease[] findByheading_PrevAndNext(long pressId,
		java.lang.String heading,
		OrderByComparator<PressRelease> orderByComparator)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence()
				   .findByheading_PrevAndNext(pressId, heading,
			orderByComparator);
	}

	/**
	* Removes all the press releases where heading = &#63; from the database.
	*
	* @param heading the heading
	*/
	public static void removeByheading(java.lang.String heading) {
		getPersistence().removeByheading(heading);
	}

	/**
	* Returns the number of press releases where heading = &#63;.
	*
	* @param heading the heading
	* @return the number of matching press releases
	*/
	public static int countByheading(java.lang.String heading) {
		return getPersistence().countByheading(heading);
	}

	/**
	* Caches the press release in the entity cache if it is enabled.
	*
	* @param pressRelease the press release
	*/
	public static void cacheResult(PressRelease pressRelease) {
		getPersistence().cacheResult(pressRelease);
	}

	/**
	* Caches the press releases in the entity cache if it is enabled.
	*
	* @param pressReleases the press releases
	*/
	public static void cacheResult(List<PressRelease> pressReleases) {
		getPersistence().cacheResult(pressReleases);
	}

	/**
	* Creates a new press release with the primary key. Does not add the press release to the database.
	*
	* @param pressId the primary key for the new press release
	* @return the new press release
	*/
	public static PressRelease create(long pressId) {
		return getPersistence().create(pressId);
	}

	/**
	* Removes the press release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pressId the primary key of the press release
	* @return the press release that was removed
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public static PressRelease remove(long pressId)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence().remove(pressId);
	}

	public static PressRelease updateImpl(PressRelease pressRelease) {
		return getPersistence().updateImpl(pressRelease);
	}

	/**
	* Returns the press release with the primary key or throws a {@link NoSuchPressReleaseException} if it could not be found.
	*
	* @param pressId the primary key of the press release
	* @return the press release
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public static PressRelease findByPrimaryKey(long pressId)
		throws com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException {
		return getPersistence().findByPrimaryKey(pressId);
	}

	/**
	* Returns the press release with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pressId the primary key of the press release
	* @return the press release, or <code>null</code> if a press release with the primary key could not be found
	*/
	public static PressRelease fetchByPrimaryKey(long pressId) {
		return getPersistence().fetchByPrimaryKey(pressId);
	}

	public static java.util.Map<java.io.Serializable, PressRelease> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the press releases.
	*
	* @return the press releases
	*/
	public static List<PressRelease> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the press releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @return the range of press releases
	*/
	public static List<PressRelease> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the press releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of press releases
	*/
	public static List<PressRelease> findAll(int start, int end,
		OrderByComparator<PressRelease> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the press releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of press releases
	*/
	public static List<PressRelease> findAll(int start, int end,
		OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the press releases from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of press releases.
	*
	* @return the number of press releases
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static PressReleasePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PressReleasePersistence, PressReleasePersistence> _serviceTracker =
		ServiceTrackerFactory.open(PressReleasePersistence.class);
}