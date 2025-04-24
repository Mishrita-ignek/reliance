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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.reliance.reality.model.RelianceReality;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the reliance reality service. This utility wraps {@link com.reliance.reality.service.persistence.impl.RelianceRealityPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RelianceRealityPersistence
 * @see com.reliance.reality.service.persistence.impl.RelianceRealityPersistenceImpl
 * @generated
 */
@ProviderType
public class RelianceRealityUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(RelianceReality relianceReality) {
		getPersistence().clearCache(relianceReality);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RelianceReality> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RelianceReality> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RelianceReality> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RelianceReality> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RelianceReality update(RelianceReality relianceReality) {
		return getPersistence().update(relianceReality);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RelianceReality update(RelianceReality relianceReality,
		ServiceContext serviceContext) {
		return getPersistence().update(relianceReality, serviceContext);
	}

	/**
	* Caches the reliance reality in the entity cache if it is enabled.
	*
	* @param relianceReality the reliance reality
	*/
	public static void cacheResult(RelianceReality relianceReality) {
		getPersistence().cacheResult(relianceReality);
	}

	/**
	* Caches the reliance realities in the entity cache if it is enabled.
	*
	* @param relianceRealities the reliance realities
	*/
	public static void cacheResult(List<RelianceReality> relianceRealities) {
		getPersistence().cacheResult(relianceRealities);
	}

	/**
	* Creates a new reliance reality with the primary key. Does not add the reliance reality to the database.
	*
	* @param r_Id the primary key for the new reliance reality
	* @return the new reliance reality
	*/
	public static RelianceReality create(long r_Id) {
		return getPersistence().create(r_Id);
	}

	/**
	* Removes the reliance reality with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality that was removed
	* @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	*/
	public static RelianceReality remove(long r_Id)
		throws com.reliance.reality.exception.NoSuchRelianceRealityException {
		return getPersistence().remove(r_Id);
	}

	public static RelianceReality updateImpl(RelianceReality relianceReality) {
		return getPersistence().updateImpl(relianceReality);
	}

	/**
	* Returns the reliance reality with the primary key or throws a {@link NoSuchRelianceRealityException} if it could not be found.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality
	* @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	*/
	public static RelianceReality findByPrimaryKey(long r_Id)
		throws com.reliance.reality.exception.NoSuchRelianceRealityException {
		return getPersistence().findByPrimaryKey(r_Id);
	}

	/**
	* Returns the reliance reality with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality, or <code>null</code> if a reliance reality with the primary key could not be found
	*/
	public static RelianceReality fetchByPrimaryKey(long r_Id) {
		return getPersistence().fetchByPrimaryKey(r_Id);
	}

	public static java.util.Map<java.io.Serializable, RelianceReality> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the reliance realities.
	*
	* @return the reliance realities
	*/
	public static List<RelianceReality> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<RelianceReality> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<RelianceReality> findAll(int start, int end,
		OrderByComparator<RelianceReality> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<RelianceReality> findAll(int start, int end,
		OrderByComparator<RelianceReality> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the reliance realities from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of reliance realities.
	*
	* @return the number of reliance realities
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static RelianceRealityPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RelianceRealityPersistence, RelianceRealityPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RelianceRealityPersistence.class);
}