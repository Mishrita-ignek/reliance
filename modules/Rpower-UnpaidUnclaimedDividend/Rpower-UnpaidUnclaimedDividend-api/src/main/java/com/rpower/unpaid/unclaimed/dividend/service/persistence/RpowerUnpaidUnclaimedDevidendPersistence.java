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

package com.rpower.unpaid.unclaimed.dividend.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rpower.unpaid.unclaimed.dividend.exception.NoSuchRpowerUnpaidUnclaimedDevidendException;
import com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend;

/**
 * The persistence interface for the rpower unpaid unclaimed devidend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.rpower.unpaid.unclaimed.dividend.service.persistence.impl.RpowerUnpaidUnclaimedDevidendPersistenceImpl
 * @see RpowerUnpaidUnclaimedDevidendUtil
 * @generated
 */
@ProviderType
public interface RpowerUnpaidUnclaimedDevidendPersistence
	extends BasePersistence<RpowerUnpaidUnclaimedDevidend> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpowerUnpaidUnclaimedDevidendUtil} to access the rpower unpaid unclaimed devidend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @return the matching rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES);

	/**
	* Returns a range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @return the range of matching rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES, int start, int end);

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		java.lang.String FOLIO_NO_OF_ITIES, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend findByFOLIO_NO_OF_ITIES_First(
		java.lang.String FOLIO_NO_OF_ITIES,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException;

	/**
	* Returns the first rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching rpower unpaid unclaimed devidend, or <code>null</code> if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend fetchByFOLIO_NO_OF_ITIES_First(
		java.lang.String FOLIO_NO_OF_ITIES,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns the last rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend findByFOLIO_NO_OF_ITIES_Last(
		java.lang.String FOLIO_NO_OF_ITIES,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException;

	/**
	* Returns the last rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching rpower unpaid unclaimed devidend, or <code>null</code> if a matching rpower unpaid unclaimed devidend could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend fetchByFOLIO_NO_OF_ITIES_Last(
		java.lang.String FOLIO_NO_OF_ITIES,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns the rpower unpaid unclaimed devidends before and after the current rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param SRNO the primary key of the current rpower unpaid unclaimed devidend
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend[] findByFOLIO_NO_OF_ITIES_PrevAndNext(
		long SRNO, java.lang.String FOLIO_NO_OF_ITIES,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException;

	/**
	* Removes all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63; from the database.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	*/
	public void removeByFOLIO_NO_OF_ITIES(java.lang.String FOLIO_NO_OF_ITIES);

	/**
	* Returns the number of rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	*
	* @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	* @return the number of matching rpower unpaid unclaimed devidends
	*/
	public int countByFOLIO_NO_OF_ITIES(java.lang.String FOLIO_NO_OF_ITIES);

	/**
	* Caches the rpower unpaid unclaimed devidend in the entity cache if it is enabled.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	*/
	public void cacheResult(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend);

	/**
	* Caches the rpower unpaid unclaimed devidends in the entity cache if it is enabled.
	*
	* @param rpowerUnpaidUnclaimedDevidends the rpower unpaid unclaimed devidends
	*/
	public void cacheResult(
		java.util.List<RpowerUnpaidUnclaimedDevidend> rpowerUnpaidUnclaimedDevidends);

	/**
	* Creates a new rpower unpaid unclaimed devidend with the primary key. Does not add the rpower unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new rpower unpaid unclaimed devidend
	* @return the new rpower unpaid unclaimed devidend
	*/
	public RpowerUnpaidUnclaimedDevidend create(long SRNO);

	/**
	* Removes the rpower unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend remove(long SRNO)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException;

	public RpowerUnpaidUnclaimedDevidend updateImpl(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend);

	/**
	* Returns the rpower unpaid unclaimed devidend with the primary key or throws a {@link NoSuchRpowerUnpaidUnclaimedDevidendException} if it could not be found.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend
	* @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException;

	/**
	* Returns the rpower unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend, or <code>null</code> if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public RpowerUnpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO);

	@Override
	public java.util.Map<java.io.Serializable, RpowerUnpaidUnclaimedDevidend> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the rpower unpaid unclaimed devidends.
	*
	* @return the rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findAll();

	/**
	* Returns a range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @return the range of rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findAll(int start,
		int end);

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator);

	/**
	* Returns an ordered range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rpower unpaid unclaimed devidends
	*/
	public java.util.List<RpowerUnpaidUnclaimedDevidend> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the rpower unpaid unclaimed devidends from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of rpower unpaid unclaimed devidends.
	*
	* @return the number of rpower unpaid unclaimed devidends
	*/
	public int countAll();
}