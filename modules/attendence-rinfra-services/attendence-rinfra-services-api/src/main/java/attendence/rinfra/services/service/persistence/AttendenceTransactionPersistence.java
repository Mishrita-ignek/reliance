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

import attendence.rinfra.services.exception.NoSuchAttendenceTransactionException;
import attendence.rinfra.services.model.AttendenceTransaction;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the attendence transaction service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see attendence.rinfra.services.service.persistence.impl.AttendenceTransactionPersistenceImpl
 * @see AttendenceTransactionUtil
 * @generated
 */
@ProviderType
public interface AttendenceTransactionPersistence extends BasePersistence<AttendenceTransaction> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AttendenceTransactionUtil} to access the attendence transaction persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns the attendence transaction where employeeCode = &#63; or throws a {@link NoSuchAttendenceTransactionException} if it could not be found.
	*
	* @param employeeCode the employee code
	* @return the matching attendence transaction
	* @throws NoSuchAttendenceTransactionException if a matching attendence transaction could not be found
	*/
	public AttendenceTransaction findByemployeeCode(
		java.lang.String employeeCode)
		throws NoSuchAttendenceTransactionException;

	/**
	* Returns the attendence transaction where employeeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param employeeCode the employee code
	* @return the matching attendence transaction, or <code>null</code> if a matching attendence transaction could not be found
	*/
	public AttendenceTransaction fetchByemployeeCode(
		java.lang.String employeeCode);

	/**
	* Returns the attendence transaction where employeeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param employeeCode the employee code
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching attendence transaction, or <code>null</code> if a matching attendence transaction could not be found
	*/
	public AttendenceTransaction fetchByemployeeCode(
		java.lang.String employeeCode, boolean retrieveFromCache);

	/**
	* Removes the attendence transaction where employeeCode = &#63; from the database.
	*
	* @param employeeCode the employee code
	* @return the attendence transaction that was removed
	*/
	public AttendenceTransaction removeByemployeeCode(
		java.lang.String employeeCode)
		throws NoSuchAttendenceTransactionException;

	/**
	* Returns the number of attendence transactions where employeeCode = &#63;.
	*
	* @param employeeCode the employee code
	* @return the number of matching attendence transactions
	*/
	public int countByemployeeCode(java.lang.String employeeCode);

	/**
	* Caches the attendence transaction in the entity cache if it is enabled.
	*
	* @param attendenceTransaction the attendence transaction
	*/
	public void cacheResult(AttendenceTransaction attendenceTransaction);

	/**
	* Caches the attendence transactions in the entity cache if it is enabled.
	*
	* @param attendenceTransactions the attendence transactions
	*/
	public void cacheResult(
		java.util.List<AttendenceTransaction> attendenceTransactions);

	/**
	* Creates a new attendence transaction with the primary key. Does not add the attendence transaction to the database.
	*
	* @param srNo the primary key for the new attendence transaction
	* @return the new attendence transaction
	*/
	public AttendenceTransaction create(java.lang.String srNo);

	/**
	* Removes the attendence transaction with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction that was removed
	* @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	*/
	public AttendenceTransaction remove(java.lang.String srNo)
		throws NoSuchAttendenceTransactionException;

	public AttendenceTransaction updateImpl(
		AttendenceTransaction attendenceTransaction);

	/**
	* Returns the attendence transaction with the primary key or throws a {@link NoSuchAttendenceTransactionException} if it could not be found.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction
	* @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	*/
	public AttendenceTransaction findByPrimaryKey(java.lang.String srNo)
		throws NoSuchAttendenceTransactionException;

	/**
	* Returns the attendence transaction with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction, or <code>null</code> if a attendence transaction with the primary key could not be found
	*/
	public AttendenceTransaction fetchByPrimaryKey(java.lang.String srNo);

	@Override
	public java.util.Map<java.io.Serializable, AttendenceTransaction> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the attendence transactions.
	*
	* @return the attendence transactions
	*/
	public java.util.List<AttendenceTransaction> findAll();

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
	public java.util.List<AttendenceTransaction> findAll(int start, int end);

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
	public java.util.List<AttendenceTransaction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttendenceTransaction> orderByComparator);

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
	public java.util.List<AttendenceTransaction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AttendenceTransaction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the attendence transactions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of attendence transactions.
	*
	* @return the number of attendence transactions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}