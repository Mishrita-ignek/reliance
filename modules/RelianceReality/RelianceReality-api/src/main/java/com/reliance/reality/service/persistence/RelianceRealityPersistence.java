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

import com.reliance.reality.exception.NoSuchRelianceRealityException;
import com.reliance.reality.model.RelianceReality;

/**
 * The persistence interface for the reliance reality service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.reliance.reality.service.persistence.impl.RelianceRealityPersistenceImpl
 * @see RelianceRealityUtil
 * @generated
 */
@ProviderType
public interface RelianceRealityPersistence extends BasePersistence<RelianceReality> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RelianceRealityUtil} to access the reliance reality persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the reliance reality in the entity cache if it is enabled.
	*
	* @param relianceReality the reliance reality
	*/
	public void cacheResult(RelianceReality relianceReality);

	/**
	* Caches the reliance realities in the entity cache if it is enabled.
	*
	* @param relianceRealities the reliance realities
	*/
	public void cacheResult(java.util.List<RelianceReality> relianceRealities);

	/**
	* Creates a new reliance reality with the primary key. Does not add the reliance reality to the database.
	*
	* @param r_Id the primary key for the new reliance reality
	* @return the new reliance reality
	*/
	public RelianceReality create(long r_Id);

	/**
	* Removes the reliance reality with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality that was removed
	* @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	*/
	public RelianceReality remove(long r_Id)
		throws NoSuchRelianceRealityException;

	public RelianceReality updateImpl(RelianceReality relianceReality);

	/**
	* Returns the reliance reality with the primary key or throws a {@link NoSuchRelianceRealityException} if it could not be found.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality
	* @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	*/
	public RelianceReality findByPrimaryKey(long r_Id)
		throws NoSuchRelianceRealityException;

	/**
	* Returns the reliance reality with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality, or <code>null</code> if a reliance reality with the primary key could not be found
	*/
	public RelianceReality fetchByPrimaryKey(long r_Id);

	@Override
	public java.util.Map<java.io.Serializable, RelianceReality> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the reliance realities.
	*
	* @return the reliance realities
	*/
	public java.util.List<RelianceReality> findAll();

	/**
	* Returns a range of all the reliance realities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reliance realities
	* @param end the upper bound of the range of reliance realities (not inclusive)
	* @return the range of reliance realities
	*/
	public java.util.List<RelianceReality> findAll(int start, int end);

	/**
	* Returns an ordered range of all the reliance realities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reliance realities
	* @param end the upper bound of the range of reliance realities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of reliance realities
	*/
	public java.util.List<RelianceReality> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelianceReality> orderByComparator);

	/**
	* Returns an ordered range of all the reliance realities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reliance realities
	* @param end the upper bound of the range of reliance realities (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of reliance realities
	*/
	public java.util.List<RelianceReality> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RelianceReality> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the reliance realities from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of reliance realities.
	*
	* @return the number of reliance realities
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}