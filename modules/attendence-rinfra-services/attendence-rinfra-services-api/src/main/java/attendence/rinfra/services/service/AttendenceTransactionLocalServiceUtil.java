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

package attendence.rinfra.services.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AttendenceTransaction. This utility wraps
 * {@link attendence.rinfra.services.service.impl.AttendenceTransactionLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see AttendenceTransactionLocalService
 * @see attendence.rinfra.services.service.base.AttendenceTransactionLocalServiceBaseImpl
 * @see attendence.rinfra.services.service.impl.AttendenceTransactionLocalServiceImpl
 * @generated
 */
@ProviderType
public class AttendenceTransactionLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link attendence.rinfra.services.service.impl.AttendenceTransactionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the attendence transaction to the database. Also notifies the appropriate model listeners.
	*
	* @param attendenceTransaction the attendence transaction
	* @return the attendence transaction that was added
	*/
	public static attendence.rinfra.services.model.AttendenceTransaction addAttendenceTransaction(
		attendence.rinfra.services.model.AttendenceTransaction attendenceTransaction) {
		return getService().addAttendenceTransaction(attendenceTransaction);
	}

	/**
	* Creates a new attendence transaction with the primary key. Does not add the attendence transaction to the database.
	*
	* @param srNo the primary key for the new attendence transaction
	* @return the new attendence transaction
	*/
	public static attendence.rinfra.services.model.AttendenceTransaction createAttendenceTransaction(
		java.lang.String srNo) {
		return getService().createAttendenceTransaction(srNo);
	}

	/**
	* Deletes the attendence transaction from the database. Also notifies the appropriate model listeners.
	*
	* @param attendenceTransaction the attendence transaction
	* @return the attendence transaction that was removed
	*/
	public static attendence.rinfra.services.model.AttendenceTransaction deleteAttendenceTransaction(
		attendence.rinfra.services.model.AttendenceTransaction attendenceTransaction) {
		return getService().deleteAttendenceTransaction(attendenceTransaction);
	}

	/**
	* Deletes the attendence transaction with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction that was removed
	* @throws PortalException if a attendence transaction with the primary key could not be found
	*/
	public static attendence.rinfra.services.model.AttendenceTransaction deleteAttendenceTransaction(
		java.lang.String srNo)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAttendenceTransaction(srNo);
	}

	public static attendence.rinfra.services.model.AttendenceTransaction fetchAttendenceTransaction(
		java.lang.String srNo) {
		return getService().fetchAttendenceTransaction(srNo);
	}

	/**
	* Returns the attendence transaction with the primary key.
	*
	* @param srNo the primary key of the attendence transaction
	* @return the attendence transaction
	* @throws PortalException if a attendence transaction with the primary key could not be found
	*/
	public static attendence.rinfra.services.model.AttendenceTransaction getAttendenceTransaction(
		java.lang.String srNo)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAttendenceTransaction(srNo);
	}

	/**
	* Updates the attendence transaction in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param attendenceTransaction the attendence transaction
	* @return the attendence transaction that was updated
	*/
	public static attendence.rinfra.services.model.AttendenceTransaction updateAttendenceTransaction(
		attendence.rinfra.services.model.AttendenceTransaction attendenceTransaction) {
		return getService().updateAttendenceTransaction(attendenceTransaction);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of attendence transactions.
	*
	* @return the number of attendence transactions
	*/
	public static int getAttendenceTransactionsCount() {
		return getService().getAttendenceTransactionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<attendence.rinfra.services.model.AttendenceTransaction> getAttendenceTrann(
		java.lang.String code, java.lang.String date) {
		return getService().getAttendenceTrann(code, date);
	}

	public static java.util.List<attendence.rinfra.services.model.AttendenceTransaction> getAttendenceTrann(
		java.lang.String date) {
		return getService().getAttendenceTrann(date);
	}

	/**
	* Returns a range of all the attendence transactions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of attendence transactions
	* @param end the upper bound of the range of attendence transactions (not inclusive)
	* @return the range of attendence transactions
	*/
	public static java.util.List<attendence.rinfra.services.model.AttendenceTransaction> getAttendenceTransactions(
		int start, int end) {
		return getService().getAttendenceTransactions(start, end);
	}

	public static java.util.List<attendence.rinfra.services.model.AttendenceTransaction> getEmp(
		java.lang.String code) {
		return getService().getEmp(code);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static AttendenceTransactionLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AttendenceTransactionLocalService, AttendenceTransactionLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AttendenceTransactionLocalService.class);
}