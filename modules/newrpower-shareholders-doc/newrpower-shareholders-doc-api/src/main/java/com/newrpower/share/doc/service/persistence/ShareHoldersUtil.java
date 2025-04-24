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

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.newrpower.share.doc.model.ShareHolders;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the share holders service. This utility wraps {@link com.newrpower.share.doc.service.persistence.impl.ShareHoldersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersPersistence
 * @see com.newrpower.share.doc.service.persistence.impl.ShareHoldersPersistenceImpl
 * @generated
 */
@ProviderType
public class ShareHoldersUtil {
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
	public static void clearCache(ShareHolders shareHolders) {
		getPersistence().clearCache(shareHolders);
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
	public static List<ShareHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ShareHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ShareHolders> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ShareHolders> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ShareHolders update(ShareHolders shareHolders) {
		return getPersistence().update(shareHolders);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ShareHolders update(ShareHolders shareHolders,
		ServiceContext serviceContext) {
		return getPersistence().update(shareHolders, serviceContext);
	}

	/**
	* Caches the share holders in the entity cache if it is enabled.
	*
	* @param shareHolders the share holders
	*/
	public static void cacheResult(ShareHolders shareHolders) {
		getPersistence().cacheResult(shareHolders);
	}

	/**
	* Caches the share holderses in the entity cache if it is enabled.
	*
	* @param shareHolderses the share holderses
	*/
	public static void cacheResult(List<ShareHolders> shareHolderses) {
		getPersistence().cacheResult(shareHolderses);
	}

	/**
	* Creates a new share holders with the primary key. Does not add the share holders to the database.
	*
	* @param FOLIO_NO the primary key for the new share holders
	* @return the new share holders
	*/
	public static ShareHolders create(java.lang.String FOLIO_NO) {
		return getPersistence().create(FOLIO_NO);
	}

	/**
	* Removes the share holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders that was removed
	* @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	*/
	public static ShareHolders remove(java.lang.String FOLIO_NO)
		throws com.newrpower.share.doc.exception.NoSuchShareHoldersException {
		return getPersistence().remove(FOLIO_NO);
	}

	public static ShareHolders updateImpl(ShareHolders shareHolders) {
		return getPersistence().updateImpl(shareHolders);
	}

	/**
	* Returns the share holders with the primary key or throws a {@link NoSuchShareHoldersException} if it could not be found.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders
	* @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	*/
	public static ShareHolders findByPrimaryKey(java.lang.String FOLIO_NO)
		throws com.newrpower.share.doc.exception.NoSuchShareHoldersException {
		return getPersistence().findByPrimaryKey(FOLIO_NO);
	}

	/**
	* Returns the share holders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders, or <code>null</code> if a share holders with the primary key could not be found
	*/
	public static ShareHolders fetchByPrimaryKey(java.lang.String FOLIO_NO) {
		return getPersistence().fetchByPrimaryKey(FOLIO_NO);
	}

	public static java.util.Map<java.io.Serializable, ShareHolders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the share holderses.
	*
	* @return the share holderses
	*/
	public static List<ShareHolders> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holderses
	* @param end the upper bound of the range of share holderses (not inclusive)
	* @return the range of share holderses
	*/
	public static List<ShareHolders> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holderses
	* @param end the upper bound of the range of share holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of share holderses
	*/
	public static List<ShareHolders> findAll(int start, int end,
		OrderByComparator<ShareHolders> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holderses
	* @param end the upper bound of the range of share holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of share holderses
	*/
	public static List<ShareHolders> findAll(int start, int end,
		OrderByComparator<ShareHolders> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the share holderses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of share holderses.
	*
	* @return the number of share holderses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ShareHoldersPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ShareHoldersPersistence, ShareHoldersPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ShareHoldersPersistence.class);
}