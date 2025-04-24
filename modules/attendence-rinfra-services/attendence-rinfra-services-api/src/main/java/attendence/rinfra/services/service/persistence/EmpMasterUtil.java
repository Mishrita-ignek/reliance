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

package attendence.rinfra.services.service.persistence;

import aQute.bnd.annotation.ProviderType;

import attendence.rinfra.services.model.EmpMaster;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the emp master service. This utility wraps {@link attendence.rinfra.services.service.persistence.impl.EmpMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpMasterPersistence
 * @see attendence.rinfra.services.service.persistence.impl.EmpMasterPersistenceImpl
 * @generated
 */
@ProviderType
public class EmpMasterUtil {
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
	public static void clearCache(EmpMaster empMaster) {
		getPersistence().clearCache(empMaster);
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
	public static List<EmpMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmpMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmpMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EmpMaster> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EmpMaster update(EmpMaster empMaster) {
		return getPersistence().update(empMaster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EmpMaster update(EmpMaster empMaster,
		ServiceContext serviceContext) {
		return getPersistence().update(empMaster, serviceContext);
	}

	/**
	* Caches the emp master in the entity cache if it is enabled.
	*
	* @param empMaster the emp master
	*/
	public static void cacheResult(EmpMaster empMaster) {
		getPersistence().cacheResult(empMaster);
	}

	/**
	* Caches the emp masters in the entity cache if it is enabled.
	*
	* @param empMasters the emp masters
	*/
	public static void cacheResult(List<EmpMaster> empMasters) {
		getPersistence().cacheResult(empMasters);
	}

	/**
	* Creates a new emp master with the primary key. Does not add the emp master to the database.
	*
	* @param employeeCode the primary key for the new emp master
	* @return the new emp master
	*/
	public static EmpMaster create(java.lang.String employeeCode) {
		return getPersistence().create(employeeCode);
	}

	/**
	* Removes the emp master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master that was removed
	* @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	*/
	public static EmpMaster remove(java.lang.String employeeCode)
		throws attendence.rinfra.services.exception.NoSuchEmpMasterException {
		return getPersistence().remove(employeeCode);
	}

	public static EmpMaster updateImpl(EmpMaster empMaster) {
		return getPersistence().updateImpl(empMaster);
	}

	/**
	* Returns the emp master with the primary key or throws a {@link NoSuchEmpMasterException} if it could not be found.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master
	* @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	*/
	public static EmpMaster findByPrimaryKey(java.lang.String employeeCode)
		throws attendence.rinfra.services.exception.NoSuchEmpMasterException {
		return getPersistence().findByPrimaryKey(employeeCode);
	}

	/**
	* Returns the emp master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master, or <code>null</code> if a emp master with the primary key could not be found
	*/
	public static EmpMaster fetchByPrimaryKey(java.lang.String employeeCode) {
		return getPersistence().fetchByPrimaryKey(employeeCode);
	}

	public static java.util.Map<java.io.Serializable, EmpMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the emp masters.
	*
	* @return the emp masters
	*/
	public static List<EmpMaster> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the emp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp masters
	* @param end the upper bound of the range of emp masters (not inclusive)
	* @return the range of emp masters
	*/
	public static List<EmpMaster> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the emp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp masters
	* @param end the upper bound of the range of emp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emp masters
	*/
	public static List<EmpMaster> findAll(int start, int end,
		OrderByComparator<EmpMaster> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the emp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp masters
	* @param end the upper bound of the range of emp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of emp masters
	*/
	public static List<EmpMaster> findAll(int start, int end,
		OrderByComparator<EmpMaster> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the emp masters from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of emp masters.
	*
	* @return the number of emp masters
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static EmpMasterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmpMasterPersistence, EmpMasterPersistence> _serviceTracker =
		ServiceTrackerFactory.open(EmpMasterPersistence.class);
}