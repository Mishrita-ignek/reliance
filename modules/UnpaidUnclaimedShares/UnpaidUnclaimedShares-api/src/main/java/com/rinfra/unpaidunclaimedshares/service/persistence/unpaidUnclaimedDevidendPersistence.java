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

package com.rinfra.unpaidunclaimedshares.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rinfra.unpaidunclaimedshares.exception.NoSuchunpaidUnclaimedDevidendException;
import com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend;

/**
 * The persistence interface for the unpaid unclaimed devidend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh Patidar
 * @see com.rinfra.unpaidunclaimedshares.service.persistence.impl.unpaidUnclaimedDevidendPersistenceImpl
 * @see unpaidUnclaimedDevidendUtil
 * @generated
 */
@ProviderType
public interface unpaidUnclaimedDevidendPersistence extends BasePersistence<unpaidUnclaimedDevidend> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link unpaidUnclaimedDevidendUtil} to access the unpaid unclaimed devidend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	*
	* @param FOLIO_NO the folio_no
	* @return the matching unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findByfolioNo(
		java.lang.String FOLIO_NO);

	/**
	* Returns a range of all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO the folio_no
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @return the range of matching unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findByfolioNo(
		java.lang.String FOLIO_NO, int start, int end);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO the folio_no
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findByfolioNo(
		java.lang.String FOLIO_NO, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO the folio_no
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findByfolioNo(
		java.lang.String FOLIO_NO, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	*
	* @param FOLIO_NO the folio_no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching unpaid unclaimed devidend
	* @throws NoSuchunpaidUnclaimedDevidendException if a matching unpaid unclaimed devidend could not be found
	*/
	public unpaidUnclaimedDevidend findByfolioNo_First(
		java.lang.String FOLIO_NO,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchunpaidUnclaimedDevidendException;

	/**
	* Returns the first unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	*
	* @param FOLIO_NO the folio_no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching unpaid unclaimed devidend, or <code>null</code> if a matching unpaid unclaimed devidend could not be found
	*/
	public unpaidUnclaimedDevidend fetchByfolioNo_First(
		java.lang.String FOLIO_NO,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns the last unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	*
	* @param FOLIO_NO the folio_no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching unpaid unclaimed devidend
	* @throws NoSuchunpaidUnclaimedDevidendException if a matching unpaid unclaimed devidend could not be found
	*/
	public unpaidUnclaimedDevidend findByfolioNo_Last(
		java.lang.String FOLIO_NO,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchunpaidUnclaimedDevidendException;

	/**
	* Returns the last unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	*
	* @param FOLIO_NO the folio_no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching unpaid unclaimed devidend, or <code>null</code> if a matching unpaid unclaimed devidend could not be found
	*/
	public unpaidUnclaimedDevidend fetchByfolioNo_Last(
		java.lang.String FOLIO_NO,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns the unpaid unclaimed devidends before and after the current unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	*
	* @param SRNO the primary key of the current unpaid unclaimed devidend
	* @param FOLIO_NO the folio_no
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next unpaid unclaimed devidend
	* @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public unpaidUnclaimedDevidend[] findByfolioNo_PrevAndNext(long SRNO,
		java.lang.String FOLIO_NO,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchunpaidUnclaimedDevidendException;

	/**
	* Removes all the unpaid unclaimed devidends where FOLIO_NO = &#63; from the database.
	*
	* @param FOLIO_NO the folio_no
	*/
	public void removeByfolioNo(java.lang.String FOLIO_NO);

	/**
	* Returns the number of unpaid unclaimed devidends where FOLIO_NO = &#63;.
	*
	* @param FOLIO_NO the folio_no
	* @return the number of matching unpaid unclaimed devidends
	*/
	public int countByfolioNo(java.lang.String FOLIO_NO);

	/**
	* Caches the unpaid unclaimed devidend in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidend the unpaid unclaimed devidend
	*/
	public void cacheResult(unpaidUnclaimedDevidend unpaidUnclaimedDevidend);

	/**
	* Caches the unpaid unclaimed devidends in the entity cache if it is enabled.
	*
	* @param unpaidUnclaimedDevidends the unpaid unclaimed devidends
	*/
	public void cacheResult(
		java.util.List<unpaidUnclaimedDevidend> unpaidUnclaimedDevidends);

	/**
	* Creates a new unpaid unclaimed devidend with the primary key. Does not add the unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new unpaid unclaimed devidend
	* @return the new unpaid unclaimed devidend
	*/
	public unpaidUnclaimedDevidend create(long SRNO);

	/**
	* Removes the unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend that was removed
	* @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public unpaidUnclaimedDevidend remove(long SRNO)
		throws NoSuchunpaidUnclaimedDevidendException;

	public unpaidUnclaimedDevidend updateImpl(
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend);

	/**
	* Returns the unpaid unclaimed devidend with the primary key or throws a {@link NoSuchunpaidUnclaimedDevidendException} if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend
	* @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public unpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws NoSuchunpaidUnclaimedDevidendException;

	/**
	* Returns the unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend
	* @return the unpaid unclaimed devidend, or <code>null</code> if a unpaid unclaimed devidend with the primary key could not be found
	*/
	public unpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO);

	@Override
	public java.util.Map<java.io.Serializable, unpaidUnclaimedDevidend> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the unpaid unclaimed devidends.
	*
	* @return the unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findAll();

	/**
	* Returns a range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @return the range of unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findAll(int start, int end);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns an ordered range of all the unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidends
	* @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of unpaid unclaimed devidends
	*/
	public java.util.List<unpaidUnclaimedDevidend> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<unpaidUnclaimedDevidend> orderByComparator,
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