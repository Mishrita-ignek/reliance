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

package com.unpaid.unclaimed.dividend.holders.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.unpaid.unclaimed.dividend.holders.exception.NoSuchUnpaidUnclaimedDevidendHoldersException;
import com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders;

/**
 * The persistence interface for the unpaid unclaimed devidend holders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.unpaid.unclaimed.dividend.holders.service.persistence.impl.UnpaidUnclaimedDevidendHoldersPersistenceImpl
 * @see UnpaidUnclaimedDevidendHoldersUtil
 * @generated
 */
@ProviderType
public interface UnpaidUnclaimedDevidendHoldersPersistence
	extends BasePersistence<UnpaidUnclaimedDevidendHolders> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UnpaidUnclaimedDevidendHoldersUtil} to access the unpaid unclaimed devidend holders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the unpaid unclaimed devidend holders in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	*/
	public void cacheResult(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders);

	/**
	* Caches the unpaid unclaimed devidend holderses in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidendHolderses the unpaid unclaimed devidend holderses
	*/
	public void cacheResult(
		java.util.List<UnpaidUnclaimedDevidendHolders> unpaidUnclaimedDevidendHolderses);

	/**
	* Creates a new unpaid unclaimed devidend holders with the primary key. Does not add the unpaid unclaimed devidend holders to the database.
	*
	* @param SRNO the primary key for the new unpaid unclaimed devidend holders
	* @return the new unpaid unclaimed devidend holders
	*/
	public UnpaidUnclaimedDevidendHolders create(long SRNO);

	/**
	* Removes the unpaid unclaimed devidend holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was removed
	* @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public UnpaidUnclaimedDevidendHolders remove(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendHoldersException;

	public UnpaidUnclaimedDevidendHolders updateImpl(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders);

	/**
	* Returns the unpaid unclaimed devidend holders with the primary key or throws a {@link NoSuchUnpaidUnclaimedDevidendHoldersException} if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders
	* @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public UnpaidUnclaimedDevidendHolders findByPrimaryKey(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendHoldersException;

	/**
	* Returns the unpaid unclaimed devidend holders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders, or <code>null</code> if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public UnpaidUnclaimedDevidendHolders fetchByPrimaryKey(long SRNO);

	@Override
	public java.util.Map<java.io.Serializable, UnpaidUnclaimedDevidendHolders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the unpaid unclaimed devidend holderses.
	*
	* @return the unpaid unclaimed devidend holderses
	*/
	public java.util.List<UnpaidUnclaimedDevidendHolders> findAll();

	/**
	* Returns a range of all the unpaid unclaimed devidend holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidend holderses
	* @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	* @return the range of unpaid unclaimed devidend holderses
	*/
	public java.util.List<UnpaidUnclaimedDevidendHolders> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidend holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidend holderses
	* @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of unpaid unclaimed devidend holderses
	*/
	public java.util.List<UnpaidUnclaimedDevidendHolders> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnpaidUnclaimedDevidendHolders> orderByComparator);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidend holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidend holderses
	* @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of unpaid unclaimed devidend holderses
	*/
	public java.util.List<UnpaidUnclaimedDevidendHolders> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnpaidUnclaimedDevidendHolders> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the unpaid unclaimed devidend holderses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of unpaid unclaimed devidend holderses.
	*
	* @return the number of unpaid unclaimed devidend holderses
	*/
	public int countAll();
}