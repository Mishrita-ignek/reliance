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

package rinfra.share.holders.doc.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import rinfra.share.holders.doc.model.ShareHoldersDoc;

import java.util.List;

/**
 * The persistence utility for the share holders doc service. This utility wraps {@link rinfra.share.holders.doc.service.persistence.impl.ShareHoldersDocPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersDocPersistence
 * @see rinfra.share.holders.doc.service.persistence.impl.ShareHoldersDocPersistenceImpl
 * @generated
 */
@ProviderType
public class ShareHoldersDocUtil {
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
	public static void clearCache(ShareHoldersDoc shareHoldersDoc) {
		getPersistence().clearCache(shareHoldersDoc);
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
	public static List<ShareHoldersDoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ShareHoldersDoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ShareHoldersDoc> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ShareHoldersDoc> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ShareHoldersDoc update(ShareHoldersDoc shareHoldersDoc) {
		return getPersistence().update(shareHoldersDoc);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ShareHoldersDoc update(ShareHoldersDoc shareHoldersDoc,
		ServiceContext serviceContext) {
		return getPersistence().update(shareHoldersDoc, serviceContext);
	}

	/**
	* Caches the share holders doc in the entity cache if it is enabled.
	*
	* @param shareHoldersDoc the share holders doc
	*/
	public static void cacheResult(ShareHoldersDoc shareHoldersDoc) {
		getPersistence().cacheResult(shareHoldersDoc);
	}

	/**
	* Caches the share holders docs in the entity cache if it is enabled.
	*
	* @param shareHoldersDocs the share holders docs
	*/
	public static void cacheResult(List<ShareHoldersDoc> shareHoldersDocs) {
		getPersistence().cacheResult(shareHoldersDocs);
	}

	/**
	* Creates a new share holders doc with the primary key. Does not add the share holders doc to the database.
	*
	* @param pressId the primary key for the new share holders doc
	* @return the new share holders doc
	*/
	public static ShareHoldersDoc create(long pressId) {
		return getPersistence().create(pressId);
	}

	/**
	* Removes the share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pressId the primary key of the share holders doc
	* @return the share holders doc that was removed
	* @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	*/
	public static ShareHoldersDoc remove(long pressId)
		throws rinfra.share.holders.doc.exception.NoSuchShareHoldersDocException {
		return getPersistence().remove(pressId);
	}

	public static ShareHoldersDoc updateImpl(ShareHoldersDoc shareHoldersDoc) {
		return getPersistence().updateImpl(shareHoldersDoc);
	}

	/**
	* Returns the share holders doc with the primary key or throws a {@link NoSuchShareHoldersDocException} if it could not be found.
	*
	* @param pressId the primary key of the share holders doc
	* @return the share holders doc
	* @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	*/
	public static ShareHoldersDoc findByPrimaryKey(long pressId)
		throws rinfra.share.holders.doc.exception.NoSuchShareHoldersDocException {
		return getPersistence().findByPrimaryKey(pressId);
	}

	/**
	* Returns the share holders doc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pressId the primary key of the share holders doc
	* @return the share holders doc, or <code>null</code> if a share holders doc with the primary key could not be found
	*/
	public static ShareHoldersDoc fetchByPrimaryKey(long pressId) {
		return getPersistence().fetchByPrimaryKey(pressId);
	}

	public static java.util.Map<java.io.Serializable, ShareHoldersDoc> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the share holders docs.
	*
	* @return the share holders docs
	*/
	public static List<ShareHoldersDoc> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holders docs
	* @param end the upper bound of the range of share holders docs (not inclusive)
	* @return the range of share holders docs
	*/
	public static List<ShareHoldersDoc> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holders docs
	* @param end the upper bound of the range of share holders docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of share holders docs
	*/
	public static List<ShareHoldersDoc> findAll(int start, int end,
		OrderByComparator<ShareHoldersDoc> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holders docs
	* @param end the upper bound of the range of share holders docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of share holders docs
	*/
	public static List<ShareHoldersDoc> findAll(int start, int end,
		OrderByComparator<ShareHoldersDoc> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the share holders docs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of share holders docs.
	*
	* @return the number of share holders docs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ShareHoldersDocPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ShareHoldersDocPersistence, ShareHoldersDocPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ShareHoldersDocPersistence.class);
}