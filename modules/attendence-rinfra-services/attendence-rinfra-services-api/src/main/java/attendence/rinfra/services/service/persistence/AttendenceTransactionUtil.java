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

import attendence.rinfra.services.model.AttendenceTransaction;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the attendence transaction service. This utility wraps {@link attendence.rinfra.services.service.persistence.impl.AttendenceTransactionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttendenceTransactionPersistence
 * @see attendence.rinfra.services.service.persistence.impl.AttendenceTransactionPersistenceImpl
 * @generated
 */
@ProviderType
public class AttendenceTransactionUtil {
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
	public static void clearCache(AttendenceTransaction attendenceTransaction) {
		getPersistence().clearCache(attendenceTransaction);
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
	public static List<AttendenceTransaction> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AttendenceTransaction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AttendenceTransaction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AttendenceTransaction> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AttendenceTransaction update(
		AttendenceTransaction attendenceTransaction) {
		return getPersistence().update(attendenceTransaction);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AttendenceTransaction update(
		AttendenceTransaction attendenceTransaction,
		ServiceContext serviceContext) {
		return getPersistence().update(attendenceTransaction, serviceContext);
	}

	/**
	* Returns the attendence transaction where employeeCode = &#63; or throws a {@link NoSuchAttendenceTransactionException} if it could not be found.
	*
	* @param employeeCode the employee code
	* @return the matching attendence transaction
	* @throws NoSuchAttendenceTransactionException if a matching attendence transaction could not be found
	*/
	public static AttendenceTransaction findByemployeeCode(
		java.lang.String employeeCode)
		throws attendence.rinfra.services.exception.NoSuchAttendenceTransactionException {
		return getPersistence().findByemployeeCode(employeeCode);
	}

	/**
	* Returns the attendence transaction where employeeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param employeeCode the employee code
	* @return the matching attendence transaction, or <code>null</code> if a matching attendence transaction could not be found
	*/
	public static AttendenceTransaction fetchByemployeeCode(
		java.lang.String employeeCode) {
		return getPersistence().fetchByemployeeCode(employeeCode);
	}

	/**
	* Returns the attendence transaction where employeeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param employeeCode the employee code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attendence transaction, or <code>null</code> if a matching attendence transaction could not be found
	*/
	public static AttendenceTransaction fetchByemployeeCode(
		java.lang.String employeeCode, boolean retrieveFromCache) {
		return getPersistence()
				   .fetchByemployeeCode(employeeCode, retrieveFromCache);
	}

	/**
	* Removes the attendence transaction where employeeCode = &#63; from the database.
	*
	* @param employeeCode the employee code
	* @return the attendence transaction that was removed
	*/
	public static AttendenceTransaction removeByemployeeCode(
		java.lang.String employeeCode)
		throws attendence.rinfra.services.exception.NoSuchAttendenceTransactionException {
		return getPersistence().removeByemployeeCode(employeeCode);
	}

	/**
	* Returns the number of attendence transactions where employeeCode = &#63;.
	*
	* @param employeeCode the employee code
	* @return the number of matching attendence transactions
	*/
	public static int countByemployeeCode(java.lang.String employeeCode) {
		return getPersistence().countByemployeeCode(employeeCode);
	}

	/**
	* Caches the attendence transaction in the entity cache if it is enabled.
	*
	* @param attendenceTransaction the attendence transaction
	*/
	public static void cacheResult(AttendenceTransaction attendenceTransaction) {
		getPersistence().cacheResult(attendenceTransaction);
	}

	/**
	* Caches the attendence transactions in the entity cache if it is enabled.
	*
	* @param attendenceTransactions the attendence transactions
	*/
	public static void cacheResult(
		List<AttendenceTransaction> attendenceTransactions) {
		getPersistence().cacheResult(attendenceTransactions);
	}

	/**
	* Creates a new attendence transaction with the primary key. Does not add the attendence transaction to the database.
	*
	* @param srNo the primary key for the new attendence transaction
	* @return the new attendence transaction
	*/
	public static AttendenceTransaction create(java.lang.String srNo) {
		return getPersistence().create(srNo);
	}

	/**
	* Removes the attendence transaction with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction that was removed
	* @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	*/
	public static AttendenceTransaction remove(java.lang.String srNo)
		throws attendence.rinfra.services.exception.NoSuchAttendenceTransactionException {
		return getPersistence().remove(srNo);
	}

	public static AttendenceTransaction updateImpl(
		AttendenceTransaction attendenceTransaction) {
		return getPersistence().updateImpl(attendenceTransaction);
	}

	/**
	* Returns the attendence transaction with the primary key or throws a {@link NoSuchAttendenceTransactionException} if it could not be found.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction
	* @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	*/
	public static AttendenceTransaction findByPrimaryKey(java.lang.String srNo)
		throws attendence.rinfra.services.exception.NoSuchAttendenceTransactionException {
		return getPersistence().findByPrimaryKey(srNo);
	}

	/**
	* Returns the attendence transaction with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction, or <code>null</code> if a attendence transaction with the primary key could not be found
	*/
	public static AttendenceTransaction fetchByPrimaryKey(java.lang.String srNo) {
		return getPersistence().fetchByPrimaryKey(srNo);
	}

	public static java.util.Map<java.io.Serializable, AttendenceTransaction> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the attendence transactions.
	*
	* @return the attendence transactions
	*/
	public static List<AttendenceTransaction> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the attendence transactions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attendence transactions
	* @param end the upper bound of the range of attendence transactions (not inclusive)
	* @return the range of attendence transactions
	*/
	public static List<AttendenceTransaction> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the attendence transactions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attendence transactions
	* @param end the upper bound of the range of attendence transactions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of attendence transactions
	*/
	public static List<AttendenceTransaction> findAll(int start, int end,
		OrderByComparator<AttendenceTransaction> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the attendence transactions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attendence transactions
	* @param end the upper bound of the range of attendence transactions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of attendence transactions
	*/
	public static List<AttendenceTransaction> findAll(int start, int end,
		OrderByComparator<AttendenceTransaction> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the attendence transactions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of attendence transactions.
	*
	* @return the number of attendence transactions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static AttendenceTransactionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AttendenceTransactionPersistence, AttendenceTransactionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AttendenceTransactionPersistence.class);
}