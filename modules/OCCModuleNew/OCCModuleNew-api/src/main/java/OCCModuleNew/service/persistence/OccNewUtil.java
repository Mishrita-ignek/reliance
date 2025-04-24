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

import OCCModuleNew.model.OccNew;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the occ new service. This utility wraps {@link OCCModuleNew.service.persistence.impl.OccNewPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh Patidar
 * @see OccNewPersistence
 * @see OCCModuleNew.service.persistence.impl.OccNewPersistenceImpl
 * @generated
 */
@ProviderType
public class OccNewUtil {
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
	public static void clearCache(OccNew occNew) {
		getPersistence().clearCache(occNew);
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
	public static List<OccNew> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OccNew> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OccNew> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<OccNew> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OccNew update(OccNew occNew) {
		return getPersistence().update(occNew);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OccNew update(OccNew occNew, ServiceContext serviceContext) {
		return getPersistence().update(occNew, serviceContext);
	}

	/**
	* Caches the occ new in the entity cache if it is enabled.
	*
	* @param occNew the occ new
	*/
	public static void cacheResult(OccNew occNew) {
		getPersistence().cacheResult(occNew);
	}

	/**
	* Caches the occ news in the entity cache if it is enabled.
	*
	* @param occNews the occ news
	*/
	public static void cacheResult(List<OccNew> occNews) {
		getPersistence().cacheResult(occNews);
	}

	/**
	* Creates a new occ new with the primary key. Does not add the occ new to the database.
	*
	* @param OCCID the primary key for the new occ new
	* @return the new occ new
	*/
	public static OccNew create(long OCCID) {
		return getPersistence().create(OCCID);
	}

	/**
	* Removes the occ new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param OCCID the primary key of the occ new
	* @return the occ new that was removed
	* @throws NoSuchOccNewException if a occ new with the primary key could not be found
	*/
	public static OccNew remove(long OCCID)
		throws OCCModuleNew.exception.NoSuchOccNewException {
		return getPersistence().remove(OCCID);
	}

	public static OccNew updateImpl(OccNew occNew) {
		return getPersistence().updateImpl(occNew);
	}

	/**
	* Returns the occ new with the primary key or throws a {@link NoSuchOccNewException} if it could not be found.
	*
	* @param OCCID the primary key of the occ new
	* @return the occ new
	* @throws NoSuchOccNewException if a occ new with the primary key could not be found
	*/
	public static OccNew findByPrimaryKey(long OCCID)
		throws OCCModuleNew.exception.NoSuchOccNewException {
		return getPersistence().findByPrimaryKey(OCCID);
	}

	/**
	* Returns the occ new with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param OCCID the primary key of the occ new
	* @return the occ new, or <code>null</code> if a occ new with the primary key could not be found
	*/
	public static OccNew fetchByPrimaryKey(long OCCID) {
		return getPersistence().fetchByPrimaryKey(OCCID);
	}

	public static java.util.Map<java.io.Serializable, OccNew> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the occ news.
	*
	* @return the occ news
	*/
	public static List<OccNew> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the occ news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ news
	* @param end the upper bound of the range of occ news (not inclusive)
	* @return the range of occ news
	*/
	public static List<OccNew> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the occ news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ news
	* @param end the upper bound of the range of occ news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of occ news
	*/
	public static List<OccNew> findAll(int start, int end,
		OrderByComparator<OccNew> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the occ news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ news
	* @param end the upper bound of the range of occ news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of occ news
	*/
	public static List<OccNew> findAll(int start, int end,
		OrderByComparator<OccNew> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the occ news from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of occ news.
	*
	* @return the number of occ news
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static OccNewPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OccNewPersistence, OccNewPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OccNewPersistence.class);
}