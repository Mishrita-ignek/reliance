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

package OCCModuleNew.service.persistence;

import OCCModuleNew.model.OccMessageNew;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the occ message new service. This utility wraps {@link OCCModuleNew.service.persistence.impl.OccMessageNewPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh Patidar
 * @see OccMessageNewPersistence
 * @see OCCModuleNew.service.persistence.impl.OccMessageNewPersistenceImpl
 * @generated
 */
@ProviderType
public class OccMessageNewUtil {
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
	public static void clearCache(OccMessageNew occMessageNew) {
		getPersistence().clearCache(occMessageNew);
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
	public static List<OccMessageNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OccMessageNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OccMessageNew> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OccMessageNew> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OccMessageNew update(OccMessageNew occMessageNew) {
		return getPersistence().update(occMessageNew);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OccMessageNew update(OccMessageNew occMessageNew,
		ServiceContext serviceContext) {
		return getPersistence().update(occMessageNew, serviceContext);
	}

	/**
	* Caches the occ message new in the entity cache if it is enabled.
	*
	* @param occMessageNew the occ message new
	*/
	public static void cacheResult(OccMessageNew occMessageNew) {
		getPersistence().cacheResult(occMessageNew);
	}

	/**
	* Caches the occ message news in the entity cache if it is enabled.
	*
	* @param occMessageNews the occ message news
	*/
	public static void cacheResult(List<OccMessageNew> occMessageNews) {
		getPersistence().cacheResult(occMessageNews);
	}

	/**
	* Creates a new occ message new with the primary key. Does not add the occ message new to the database.
	*
	* @param MSG_ID the primary key for the new occ message new
	* @return the new occ message new
	*/
	public static OccMessageNew create(long MSG_ID) {
		return getPersistence().create(MSG_ID);
	}

	/**
	* Removes the occ message new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new that was removed
	* @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	*/
	public static OccMessageNew remove(long MSG_ID)
		throws OCCModuleNew.exception.NoSuchOccMessageNewException {
		return getPersistence().remove(MSG_ID);
	}

	public static OccMessageNew updateImpl(OccMessageNew occMessageNew) {
		return getPersistence().updateImpl(occMessageNew);
	}

	/**
	* Returns the occ message new with the primary key or throws a {@link NoSuchOccMessageNewException} if it could not be found.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new
	* @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	*/
	public static OccMessageNew findByPrimaryKey(long MSG_ID)
		throws OCCModuleNew.exception.NoSuchOccMessageNewException {
		return getPersistence().findByPrimaryKey(MSG_ID);
	}

	/**
	* Returns the occ message new with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new, or <code>null</code> if a occ message new with the primary key could not be found
	*/
	public static OccMessageNew fetchByPrimaryKey(long MSG_ID) {
		return getPersistence().fetchByPrimaryKey(MSG_ID);
	}

	public static java.util.Map<java.io.Serializable, OccMessageNew> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the occ message news.
	*
	* @return the occ message news
	*/
	public static List<OccMessageNew> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @return the range of occ message news
	*/
	public static List<OccMessageNew> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of occ message news
	*/
	public static List<OccMessageNew> findAll(int start, int end,
		OrderByComparator<OccMessageNew> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of occ message news
	*/
	public static List<OccMessageNew> findAll(int start, int end,
		OrderByComparator<OccMessageNew> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the occ message news from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of occ message news.
	*
	* @return the number of occ message news
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static OccMessageNewPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OccMessageNewPersistence, OccMessageNewPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OccMessageNewPersistence.class);
}