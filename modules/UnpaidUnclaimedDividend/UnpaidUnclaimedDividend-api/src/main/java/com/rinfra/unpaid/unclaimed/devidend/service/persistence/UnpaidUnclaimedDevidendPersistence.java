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

package com.rinfra.unpaid.unclaimed.devidend.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchUnpaidUnclaimedDevidendException;
import com.rinfra.unpaid.unclaimed.devidend.model.UnpaidUnclaimedDevidend;

/**
 * The persistence interface for the unpaid unclaimed devidend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl.UnpaidUnclaimedDevidendPersistenceImpl
 * @see UnpaidUnclaimedDevidendUtil
 * @generated
 */
@ProviderType
public interface UnpaidUnclaimedDevidendPersistence extends BasePersistence<UnpaidUnclaimedDevidend> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UnpaidUnclaimedDevidendUtil} to access the unpaid unclaimed devidend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the unpaid unclaimed devidend in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidend the unpaid unclaimed devidend
	*/
	public void cacheResult(UnpaidUnclaimedDevidend unpaidUnclaimedDevidend);

	/**
	* Caches the unpaid unclaimed devidends in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidends the unpaid unclaimed devidends
	*/
	public void cacheResult(
		java.util.List<UnpaidUnclaimedDevidend> unpaidUnclaimedDevidends);

	/**
	* Creates a new unpaid unclaimed devidend with the primary key. Does not add the unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new unpaid unclaimed devidend
	* @return the new unpaid unclaimed devidend
	*/
	public UnpaidUnclaimedDevidend create(long SRNO);

	/**
	* Removes the unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend that was removed
	* @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public UnpaidUnclaimedDevidend remove(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendException;

	public UnpaidUnclaimedDevidend updateImpl(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend);

	/**
	* Returns the unpaid unclaimed devidend with the primary key or throws a {@link NoSuchUnpaidUnclaimedDevidendException} if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend
	* @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public UnpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendException;

	/**
	* Returns the unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend, or <code>null</code> if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public UnpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO);

	@Override
	public java.util.Map<java.io.Serializable, UnpaidUnclaimedDevidend> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the unpaid unclaimed devidends.
	*
	* @return the unpaid unclaimed devidends
	*/
	public java.util.List<UnpaidUnclaimedDevidend> findAll();

	/**
	* Returns a range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @return the range of unpaid unclaimed devidends
	*/
	public java.util.List<UnpaidUnclaimedDevidend> findAll(int start, int end);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of unpaid unclaimed devidends
	*/
	public java.util.List<UnpaidUnclaimedDevidend> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of unpaid unclaimed devidends
	*/
	public java.util.List<UnpaidUnclaimedDevidend> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<UnpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the unpaid unclaimed devidends from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of unpaid unclaimed devidends.
	*
	* @return the number of unpaid unclaimed devidends
	*/
	public int countAll();
}