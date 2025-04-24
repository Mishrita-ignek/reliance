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

import attendence.rinfra.services.model.EmpOtpMaster;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the emp otp master service. This utility wraps {@link attendence.rinfra.services.service.persistence.impl.EmpOtpMasterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpOtpMasterPersistence
 * @see attendence.rinfra.services.service.persistence.impl.EmpOtpMasterPersistenceImpl
 * @generated
 */
@ProviderType
public class EmpOtpMasterUtil {
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
	public static void clearCache(EmpOtpMaster empOtpMaster) {
		getPersistence().clearCache(empOtpMaster);
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
	public static List<EmpOtpMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<EmpOtpMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<EmpOtpMaster> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<EmpOtpMaster> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static EmpOtpMaster update(EmpOtpMaster empOtpMaster) {
		return getPersistence().update(empOtpMaster);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static EmpOtpMaster update(EmpOtpMaster empOtpMaster,
		ServiceContext serviceContext) {
		return getPersistence().update(empOtpMaster, serviceContext);
	}

	/**
	* Caches the emp otp master in the entity cache if it is enabled.
	*
	* @param empOtpMaster the emp otp master
	*/
	public static void cacheResult(EmpOtpMaster empOtpMaster) {
		getPersistence().cacheResult(empOtpMaster);
	}

	/**
	* Caches the emp otp masters in the entity cache if it is enabled.
	*
	* @param empOtpMasters the emp otp masters
	*/
	public static void cacheResult(List<EmpOtpMaster> empOtpMasters) {
		getPersistence().cacheResult(empOtpMasters);
	}

	/**
	* Creates a new emp otp master with the primary key. Does not add the emp otp master to the database.
	*
	* @param empMobile the primary key for the new emp otp master
	* @return the new emp otp master
	*/
	public static EmpOtpMaster create(java.lang.String empMobile) {
		return getPersistence().create(empMobile);
	}

	/**
	* Removes the emp otp master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master that was removed
	* @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	*/
	public static EmpOtpMaster remove(java.lang.String empMobile)
		throws attendence.rinfra.services.exception.NoSuchEmpOtpMasterException {
		return getPersistence().remove(empMobile);
	}

	public static EmpOtpMaster updateImpl(EmpOtpMaster empOtpMaster) {
		return getPersistence().updateImpl(empOtpMaster);
	}

	/**
	* Returns the emp otp master with the primary key or throws a {@link NoSuchEmpOtpMasterException} if it could not be found.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master
	* @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	*/
	public static EmpOtpMaster findByPrimaryKey(java.lang.String empMobile)
		throws attendence.rinfra.services.exception.NoSuchEmpOtpMasterException {
		return getPersistence().findByPrimaryKey(empMobile);
	}

	/**
	* Returns the emp otp master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master, or <code>null</code> if a emp otp master with the primary key could not be found
	*/
	public static EmpOtpMaster fetchByPrimaryKey(java.lang.String empMobile) {
		return getPersistence().fetchByPrimaryKey(empMobile);
	}

	public static java.util.Map<java.io.Serializable, EmpOtpMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the emp otp masters.
	*
	* @return the emp otp masters
	*/
	public static List<EmpOtpMaster> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the emp otp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp otp masters
	* @param end the upper bound of the range of emp otp masters (not inclusive)
	* @return the range of emp otp masters
	*/
	public static List<EmpOtpMaster> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the emp otp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp otp masters
	* @param end the upper bound of the range of emp otp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emp otp masters
	*/
	public static List<EmpOtpMaster> findAll(int start, int end,
		OrderByComparator<EmpOtpMaster> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the emp otp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp otp masters
	* @param end the upper bound of the range of emp otp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of emp otp masters
	*/
	public static List<EmpOtpMaster> findAll(int start, int end,
		OrderByComparator<EmpOtpMaster> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the emp otp masters from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of emp otp masters.
	*
	* @return the number of emp otp masters
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static EmpOtpMasterPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmpOtpMasterPersistence, EmpOtpMasterPersistence> _serviceTracker =
		ServiceTrackerFactory.open(EmpOtpMasterPersistence.class);
}