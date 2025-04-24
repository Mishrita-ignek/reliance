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

package com.rinfra.satisfactionsurvey.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rinfra.satisfactionsurvey.exception.NoSuchShareholdersException;
import com.rinfra.satisfactionsurvey.model.Shareholders;

/**
 * The persistence interface for the shareholders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh
 * @see com.rinfra.satisfactionsurvey.service.persistence.impl.ShareholdersPersistenceImpl
 * @see ShareholdersUtil
 * @generated
 */
@ProviderType
public interface ShareholdersPersistence extends BasePersistence<Shareholders> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShareholdersUtil} to access the shareholders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the shareholders in the entity cache if it is enabled.
	*
	* @param shareholders the shareholders
	*/
	public void cacheResult(Shareholders shareholders);

	/**
	* Caches the shareholderses in the entity cache if it is enabled.
	*
	* @param shareholderses the shareholderses
	*/
	public void cacheResult(java.util.List<Shareholders> shareholderses);

	/**
	* Creates a new shareholders with the primary key. Does not add the shareholders to the database.
	*
	* @param SOLE_ID the primary key for the new shareholders
	* @return the new shareholders
	*/
	public Shareholders create(long SOLE_ID);

	/**
	* Removes the shareholders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders that was removed
	* @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	*/
	public Shareholders remove(long SOLE_ID) throws NoSuchShareholdersException;

	public Shareholders updateImpl(Shareholders shareholders);

	/**
	* Returns the shareholders with the primary key or throws a {@link NoSuchShareholdersException} if it could not be found.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders
	* @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	*/
	public Shareholders findByPrimaryKey(long SOLE_ID)
		throws NoSuchShareholdersException;

	/**
	* Returns the shareholders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders, or <code>null</code> if a shareholders with the primary key could not be found
	*/
	public Shareholders fetchByPrimaryKey(long SOLE_ID);

	@Override
	public java.util.Map<java.io.Serializable, Shareholders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the shareholderses.
	*
	* @return the shareholderses
	*/
	public java.util.List<Shareholders> findAll();

	/**
	* Returns a range of all the shareholderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shareholderses
	* @param end the upper bound of the range of shareholderses (not inclusive)
	* @return the range of shareholderses
	*/
	public java.util.List<Shareholders> findAll(int start, int end);

	/**
	* Returns an ordered range of all the shareholderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shareholderses
	* @param end the upper bound of the range of shareholderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of shareholderses
	*/
	public java.util.List<Shareholders> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Shareholders> orderByComparator);

	/**
	* Returns an ordered range of all the shareholderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shareholderses
	* @param end the upper bound of the range of shareholderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of shareholderses
	*/
	public java.util.List<Shareholders> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Shareholders> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the shareholderses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of shareholderses.
	*
	* @return the number of shareholderses
	*/
	public int countAll();
}