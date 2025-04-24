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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException;
import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;

/**
 * The persistence interface for the press release service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vipin Singh
 * @see com.relieanceada.rinfra.portal.pressRelease.service.persistence.impl.PressReleasePersistenceImpl
 * @see PressReleaseUtil
 * @generated
 */
@ProviderType
public interface PressReleasePersistence extends BasePersistence<PressRelease> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PressReleaseUtil} to access the press release persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the press releases where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @return the matching press releases
	*/
	public java.util.List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear);

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
	public java.util.List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear, int start, int end);

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
	public java.util.List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator);

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
	public java.util.List<PressRelease> findByselectedNewsYear(
		java.lang.String newsYear, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public PressRelease findByselectedNewsYear_First(
		java.lang.String newsYear,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException;

	/**
	* Returns the first press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public PressRelease fetchByselectedNewsYear_First(
		java.lang.String newsYear,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator);

	/**
	* Returns the last press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public PressRelease findByselectedNewsYear_Last(java.lang.String newsYear,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException;

	/**
	* Returns the last press release in the ordered set where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public PressRelease fetchByselectedNewsYear_Last(
		java.lang.String newsYear,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator);

	/**
	* Returns the press releases before and after the current press release in the ordered set where newsYear = &#63;.
	*
	* @param pressId the primary key of the current press release
	* @param newsYear the news year
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next press release
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public PressRelease[] findByselectedNewsYear_PrevAndNext(long pressId,
		java.lang.String newsYear,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException;

	/**
	* Removes all the press releases where newsYear = &#63; from the database.
	*
	* @param newsYear the news year
	*/
	public void removeByselectedNewsYear(java.lang.String newsYear);

	/**
	* Returns the number of press releases where newsYear = &#63;.
	*
	* @param newsYear the news year
	* @return the number of matching press releases
	*/
	public int countByselectedNewsYear(java.lang.String newsYear);

	/**
	* Returns all the press releases where heading = &#63;.
	*
	* @param heading the heading
	* @return the matching press releases
	*/
	public java.util.List<PressRelease> findByheading(java.lang.String heading);

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
	public java.util.List<PressRelease> findByheading(
		java.lang.String heading, int start, int end);

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
	public java.util.List<PressRelease> findByheading(
		java.lang.String heading, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator);

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
	public java.util.List<PressRelease> findByheading(
		java.lang.String heading, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public PressRelease findByheading_First(java.lang.String heading,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException;

	/**
	* Returns the first press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public PressRelease fetchByheading_First(java.lang.String heading,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator);

	/**
	* Returns the last press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release
	* @throws NoSuchPressReleaseException if a matching press release could not be found
	*/
	public PressRelease findByheading_Last(java.lang.String heading,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException;

	/**
	* Returns the last press release in the ordered set where heading = &#63;.
	*
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching press release, or <code>null</code> if a matching press release could not be found
	*/
	public PressRelease fetchByheading_Last(java.lang.String heading,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator);

	/**
	* Returns the press releases before and after the current press release in the ordered set where heading = &#63;.
	*
	* @param pressId the primary key of the current press release
	* @param heading the heading
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next press release
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public PressRelease[] findByheading_PrevAndNext(long pressId,
		java.lang.String heading,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException;

	/**
	* Removes all the press releases where heading = &#63; from the database.
	*
	* @param heading the heading
	*/
	public void removeByheading(java.lang.String heading);

	/**
	* Returns the number of press releases where heading = &#63;.
	*
	* @param heading the heading
	* @return the number of matching press releases
	*/
	public int countByheading(java.lang.String heading);

	/**
	* Caches the press release in the entity cache if it is enabled.
	*
	* @param pressRelease the press release
	*/
	public void cacheResult(PressRelease pressRelease);

	/**
	* Caches the press releases in the entity cache if it is enabled.
	*
	* @param pressReleases the press releases
	*/
	public void cacheResult(java.util.List<PressRelease> pressReleases);

	/**
	* Creates a new press release with the primary key. Does not add the press release to the database.
	*
	* @param pressId the primary key for the new press release
	* @return the new press release
	*/
	public PressRelease create(long pressId);

	/**
	* Removes the press release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pressId the primary key of the press release
	* @return the press release that was removed
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public PressRelease remove(long pressId) throws NoSuchPressReleaseException;

	public PressRelease updateImpl(PressRelease pressRelease);

	/**
	* Returns the press release with the primary key or throws a {@link NoSuchPressReleaseException} if it could not be found.
	*
	* @param pressId the primary key of the press release
	* @return the press release
	* @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	*/
	public PressRelease findByPrimaryKey(long pressId)
		throws NoSuchPressReleaseException;

	/**
	* Returns the press release with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pressId the primary key of the press release
	* @return the press release, or <code>null</code> if a press release with the primary key could not be found
	*/
	public PressRelease fetchByPrimaryKey(long pressId);

	@Override
	public java.util.Map<java.io.Serializable, PressRelease> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the press releases.
	*
	* @return the press releases
	*/
	public java.util.List<PressRelease> findAll();

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
	public java.util.List<PressRelease> findAll(int start, int end);

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
	public java.util.List<PressRelease> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator);

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
	public java.util.List<PressRelease> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the press releases from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of press releases.
	*
	* @return the number of press releases
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}