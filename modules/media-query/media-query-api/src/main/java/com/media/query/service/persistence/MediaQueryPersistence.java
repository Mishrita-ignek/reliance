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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.media.query.exception.NoSuchMediaQueryException;
import com.media.query.model.MediaQuery;

/**
 * The persistence interface for the media query service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.media.query.service.persistence.impl.MediaQueryPersistenceImpl
 * @see MediaQueryUtil
 * @generated
 */
@ProviderType
public interface MediaQueryPersistence extends BasePersistence<MediaQuery> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MediaQueryUtil} to access the media query persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the media query in the entity cache if it is enabled.
	*
	* @param mediaQuery the media query
	*/
	public void cacheResult(MediaQuery mediaQuery);

	/**
	* Caches the media queries in the entity cache if it is enabled.
	*
	* @param mediaQueries the media queries
	*/
	public void cacheResult(java.util.List<MediaQuery> mediaQueries);

	/**
	* Creates a new media query with the primary key. Does not add the media query to the database.
	*
	* @param srNo the primary key for the new media query
	* @return the new media query
	*/
	public MediaQuery create(long srNo);

	/**
	* Removes the media query with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srNo the primary key of the media query
	* @return the media query that was removed
	* @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	*/
	public MediaQuery remove(long srNo) throws NoSuchMediaQueryException;

	public MediaQuery updateImpl(MediaQuery mediaQuery);

	/**
	* Returns the media query with the primary key or throws a {@link NoSuchMediaQueryException} if it could not be found.
	*
	* @param srNo the primary key of the media query
	* @return the media query
	* @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	*/
	public MediaQuery findByPrimaryKey(long srNo)
		throws NoSuchMediaQueryException;

	/**
	* Returns the media query with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srNo the primary key of the media query
	* @return the media query, or <code>null</code> if a media query with the primary key could not be found
	*/
	public MediaQuery fetchByPrimaryKey(long srNo);

	@Override
	public java.util.Map<java.io.Serializable, MediaQuery> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the media queries.
	*
	* @return the media queries
	*/
	public java.util.List<MediaQuery> findAll();

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
	public java.util.List<MediaQuery> findAll(int start, int end);

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
	public java.util.List<MediaQuery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MediaQuery> orderByComparator);

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
	public java.util.List<MediaQuery> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<MediaQuery> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the media queries from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of media queries.
	*
	* @return the number of media queries
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}