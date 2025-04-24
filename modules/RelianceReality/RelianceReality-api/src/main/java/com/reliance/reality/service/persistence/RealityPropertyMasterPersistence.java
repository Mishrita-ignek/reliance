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

package com.reliance.reality.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.reliance.reality.exception.NoSuchRealityPropertyMasterException;
import com.reliance.reality.model.RealityPropertyMaster;

/**
 * The persistence interface for the reality property master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.reliance.reality.service.persistence.impl.RealityPropertyMasterPersistenceImpl
 * @see RealityPropertyMasterUtil
 * @generated
 */
@ProviderType
public interface RealityPropertyMasterPersistence extends BasePersistence<RealityPropertyMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RealityPropertyMasterUtil} to access the reality property master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the reality property master in the entity cache if it is enabled.
	*
	* @param realityPropertyMaster the reality property master
	*/
	public void cacheResult(RealityPropertyMaster realityPropertyMaster);

	/**
	* Caches the reality property masters in the entity cache if it is enabled.
	*
	* @param realityPropertyMasters the reality property masters
	*/
	public void cacheResult(
		java.util.List<RealityPropertyMaster> realityPropertyMasters);

	/**
	* Creates a new reality property master with the primary key. Does not add the reality property master to the database.
	*
	* @param property_ID the primary key for the new reality property master
	* @return the new reality property master
	*/
	public RealityPropertyMaster create(long property_ID);

	/**
	* Removes the reality property master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master that was removed
	* @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	*/
	public RealityPropertyMaster remove(long property_ID)
		throws NoSuchRealityPropertyMasterException;

	public RealityPropertyMaster updateImpl(
		RealityPropertyMaster realityPropertyMaster);

	/**
	* Returns the reality property master with the primary key or throws a {@link NoSuchRealityPropertyMasterException} if it could not be found.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master
	* @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	*/
	public RealityPropertyMaster findByPrimaryKey(long property_ID)
		throws NoSuchRealityPropertyMasterException;

	/**
	* Returns the reality property master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master, or <code>null</code> if a reality property master with the primary key could not be found
	*/
	public RealityPropertyMaster fetchByPrimaryKey(long property_ID);

	@Override
	public java.util.Map<java.io.Serializable, RealityPropertyMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the reality property masters.
	*
	* @return the reality property masters
	*/
	public java.util.List<RealityPropertyMaster> findAll();

	/**
	* Returns a range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @return the range of reality property masters
	*/
	public java.util.List<RealityPropertyMaster> findAll(int start, int end);

	/**
	* Returns an ordered range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reality property masters
	*/
	public java.util.List<RealityPropertyMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RealityPropertyMaster> orderByComparator);

	/**
	* Returns an ordered range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of reality property masters
	*/
	public java.util.List<RealityPropertyMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RealityPropertyMaster> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the reality property masters from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of reality property masters.
	*
	* @return the number of reality property masters
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}