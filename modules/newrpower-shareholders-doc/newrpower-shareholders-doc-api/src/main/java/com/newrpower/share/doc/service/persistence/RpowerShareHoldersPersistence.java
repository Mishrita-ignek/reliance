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

package com.newrpower.share.doc.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.newrpower.share.doc.exception.NoSuchRpowerShareHoldersException;
import com.newrpower.share.doc.model.RpowerShareHolders;

/**
 * The persistence interface for the rpower share holders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.newrpower.share.doc.service.persistence.impl.RpowerShareHoldersPersistenceImpl
 * @see RpowerShareHoldersUtil
 * @generated
 */
@ProviderType
public interface RpowerShareHoldersPersistence extends BasePersistence<RpowerShareHolders> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpowerShareHoldersUtil} to access the rpower share holders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the rpower share holders in the entity cache if it is enabled.
	*
	* @param rpowerShareHolders the rpower share holders
	*/
	public void cacheResult(RpowerShareHolders rpowerShareHolders);

	/**
	* Caches the rpower share holderses in the entity cache if it is enabled.
	*
	* @param rpowerShareHolderses the rpower share holderses
	*/
	public void cacheResult(
		java.util.List<RpowerShareHolders> rpowerShareHolderses);

	/**
	* Creates a new rpower share holders with the primary key. Does not add the rpower share holders to the database.
	*
	* @param FOLIO_NO the primary key for the new rpower share holders
	* @return the new rpower share holders
	*/
	public RpowerShareHolders create(java.lang.String FOLIO_NO);

	/**
	* Removes the rpower share holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders that was removed
	* @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	*/
	public RpowerShareHolders remove(java.lang.String FOLIO_NO)
		throws NoSuchRpowerShareHoldersException;

	public RpowerShareHolders updateImpl(RpowerShareHolders rpowerShareHolders);

	/**
	* Returns the rpower share holders with the primary key or throws a {@link NoSuchRpowerShareHoldersException} if it could not be found.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders
	* @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	*/
	public RpowerShareHolders findByPrimaryKey(java.lang.String FOLIO_NO)
		throws NoSuchRpowerShareHoldersException;

	/**
	* Returns the rpower share holders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders, or <code>null</code> if a rpower share holders with the primary key could not be found
	*/
	public RpowerShareHolders fetchByPrimaryKey(java.lang.String FOLIO_NO);

	@Override
	public java.util.Map<java.io.Serializable, RpowerShareHolders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the rpower share holderses.
	*
	* @return the rpower share holderses
	*/
	public java.util.List<RpowerShareHolders> findAll();

	/**
	* Returns a range of all the rpower share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holderses
	* @param end the upper bound of the range of rpower share holderses (not inclusive)
	* @return the range of rpower share holderses
	*/
	public java.util.List<RpowerShareHolders> findAll(int start, int end);

	/**
	* Returns an ordered range of all the rpower share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holderses
	* @param end the upper bound of the range of rpower share holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rpower share holderses
	*/
	public java.util.List<RpowerShareHolders> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerShareHolders> orderByComparator);

	/**
	* Returns an ordered range of all the rpower share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holderses
	* @param end the upper bound of the range of rpower share holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rpower share holderses
	*/
	public java.util.List<RpowerShareHolders> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerShareHolders> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the rpower share holderses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of rpower share holderses.
	*
	* @return the number of rpower share holderses
	*/
	public int countAll();
}