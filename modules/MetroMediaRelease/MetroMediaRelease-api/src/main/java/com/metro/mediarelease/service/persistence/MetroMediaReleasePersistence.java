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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.metro.mediarelease.exception.NoSuchMetroMediaReleaseException;
import com.metro.mediarelease.model.MetroMediaRelease;

/**
 * The persistence interface for the metro media release service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.metro.mediarelease.service.persistence.impl.MetroMediaReleasePersistenceImpl
 * @see MetroMediaReleaseUtil
 * @generated
 */
@ProviderType
public interface MetroMediaReleasePersistence extends BasePersistence<MetroMediaRelease> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MetroMediaReleaseUtil} to access the metro media release persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the metro media release in the entity cache if it is enabled.
	*
	* @param metroMediaRelease the metro media release
	*/
	public void cacheResult(MetroMediaRelease metroMediaRelease);

	/**
	* Caches the metro media releases in the entity cache if it is enabled.
	*
	* @param metroMediaReleases the metro media releases
	*/
	public void cacheResult(
		java.util.List<MetroMediaRelease> metroMediaReleases);

	/**
	* Creates a new metro media release with the primary key. Does not add the metro media release to the database.
	*
	* @param SRNO the primary key for the new metro media release
	* @return the new metro media release
	*/
	public MetroMediaRelease create(long SRNO);

	/**
	* Removes the metro media release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release that was removed
	* @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	*/
	public MetroMediaRelease remove(long SRNO)
		throws NoSuchMetroMediaReleaseException;

	public MetroMediaRelease updateImpl(MetroMediaRelease metroMediaRelease);

	/**
	* Returns the metro media release with the primary key or throws a {@link NoSuchMetroMediaReleaseException} if it could not be found.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release
	* @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	*/
	public MetroMediaRelease findByPrimaryKey(long SRNO)
		throws NoSuchMetroMediaReleaseException;

	/**
	* Returns the metro media release with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release, or <code>null</code> if a metro media release with the primary key could not be found
	*/
	public MetroMediaRelease fetchByPrimaryKey(long SRNO);

	@Override
	public java.util.Map<java.io.Serializable, MetroMediaRelease> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the metro media releases.
	*
	* @return the metro media releases
	*/
	public java.util.List<MetroMediaRelease> findAll();

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
	public java.util.List<MetroMediaRelease> findAll(int start, int end);

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
	public java.util.List<MetroMediaRelease> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetroMediaRelease> orderByComparator);

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
	public java.util.List<MetroMediaRelease> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MetroMediaRelease> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the metro media releases from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of metro media releases.
	*
	* @return the number of metro media releases
	*/
	public int countAll();
}