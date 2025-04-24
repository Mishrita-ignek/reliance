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

package rpower.shareholders.doc.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import rpower.shareholders.doc.model.RpowerShareHolders;

import java.util.List;

/**
 * The persistence utility for the rpower share holders service. This utility wraps {@link rpower.shareholders.doc.service.persistence.impl.RpowerShareHoldersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersPersistence
 * @see rpower.shareholders.doc.service.persistence.impl.RpowerShareHoldersPersistenceImpl
 * @generated
 */
@ProviderType
public class RpowerShareHoldersUtil {
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
	public static void clearCache(RpowerShareHolders rpowerShareHolders) {
		getPersistence().clearCache(rpowerShareHolders);
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
	public static List<RpowerShareHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RpowerShareHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RpowerShareHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RpowerShareHolders> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RpowerShareHolders update(
		RpowerShareHolders rpowerShareHolders) {
		return getPersistence().update(rpowerShareHolders);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RpowerShareHolders update(
		RpowerShareHolders rpowerShareHolders, ServiceContext serviceContext) {
		return getPersistence().update(rpowerShareHolders, serviceContext);
	}

	/**
	* Caches the rpower share holders in the entity cache if it is enabled.
	*
	* @param rpowerShareHolders the rpower share holders
	*/
	public static void cacheResult(RpowerShareHolders rpowerShareHolders) {
		getPersistence().cacheResult(rpowerShareHolders);
	}

	/**
	* Caches the rpower share holderses in the entity cache if it is enabled.
	*
	* @param rpowerShareHolderses the rpower share holderses
	*/
	public static void cacheResult(
		List<RpowerShareHolders> rpowerShareHolderses) {
		getPersistence().cacheResult(rpowerShareHolderses);
	}

	/**
	* Creates a new rpower share holders with the primary key. Does not add the rpower share holders to the database.
	*
	* @param FOLIO_NO the primary key for the new rpower share holders
	* @return the new rpower share holders
	*/
	public static RpowerShareHolders create(java.lang.String FOLIO_NO) {
		return getPersistence().create(FOLIO_NO);
	}

	/**
	* Removes the rpower share holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders that was removed
	* @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	*/
	public static RpowerShareHolders remove(java.lang.String FOLIO_NO)
		throws rpower.shareholders.doc.exception.NoSuchRpowerShareHoldersException {
		return getPersistence().remove(FOLIO_NO);
	}

	public static RpowerShareHolders updateImpl(
		RpowerShareHolders rpowerShareHolders) {
		return getPersistence().updateImpl(rpowerShareHolders);
	}

	/**
	* Returns the rpower share holders with the primary key or throws a {@link NoSuchRpowerShareHoldersException} if it could not be found.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders
	* @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	*/
	public static RpowerShareHolders findByPrimaryKey(java.lang.String FOLIO_NO)
		throws rpower.shareholders.doc.exception.NoSuchRpowerShareHoldersException {
		return getPersistence().findByPrimaryKey(FOLIO_NO);
	}

	/**
	* Returns the rpower share holders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders, or <code>null</code> if a rpower share holders with the primary key could not be found
	*/
	public static RpowerShareHolders fetchByPrimaryKey(
		java.lang.String FOLIO_NO) {
		return getPersistence().fetchByPrimaryKey(FOLIO_NO);
	}

	public static java.util.Map<java.io.Serializable, RpowerShareHolders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the rpower share holderses.
	*
	* @return the rpower share holderses
	*/
	public static List<RpowerShareHolders> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<RpowerShareHolders> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<RpowerShareHolders> findAll(int start, int end,
		OrderByComparator<RpowerShareHolders> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<RpowerShareHolders> findAll(int start, int end,
		OrderByComparator<RpowerShareHolders> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the rpower share holderses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rpower share holderses.
	*
	* @return the number of rpower share holderses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RpowerShareHoldersPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RpowerShareHoldersPersistence, RpowerShareHoldersPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RpowerShareHoldersPersistence.class);
}