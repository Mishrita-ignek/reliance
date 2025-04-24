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

package com.reliance.reality.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for RelianceReality. This utility wraps
 * {@link com.reliance.reality.service.impl.RelianceRealityLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RelianceRealityLocalService
 * @see com.reliance.reality.service.base.RelianceRealityLocalServiceBaseImpl
 * @see com.reliance.reality.service.impl.RelianceRealityLocalServiceImpl
 * @generated
 */
@ProviderType
public class RelianceRealityLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.reliance.reality.service.impl.RelianceRealityLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static boolean sendMail(java.lang.String msg,
		java.lang.String frommailid, java.lang.String tomailid,
		java.lang.String subject) {
		return getService().sendMail(msg, frommailid, tomailid, subject);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
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
	* Adds the reliance reality to the database. Also notifies the appropriate model listeners.
	*
	* @param relianceReality the reliance reality
	* @return the reliance reality that was added
	*/
	public static com.reliance.reality.model.RelianceReality addRelianceReality(
		com.reliance.reality.model.RelianceReality relianceReality) {
		return getService().addRelianceReality(relianceReality);
	}

	/**
	* Creates a new reliance reality with the primary key. Does not add the reliance reality to the database.
	*
	* @param r_Id the primary key for the new reliance reality
	* @return the new reliance reality
	*/
	public static com.reliance.reality.model.RelianceReality createRelianceReality(
		long r_Id) {
		return getService().createRelianceReality(r_Id);
	}

	/**
	* Deletes the reliance reality from the database. Also notifies the appropriate model listeners.
	*
	* @param relianceReality the reliance reality
	* @return the reliance reality that was removed
	*/
	public static com.reliance.reality.model.RelianceReality deleteRelianceReality(
		com.reliance.reality.model.RelianceReality relianceReality) {
		return getService().deleteRelianceReality(relianceReality);
	}

	/**
	* Deletes the reliance reality with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality that was removed
	* @throws PortalException if a reliance reality with the primary key could not be found
	*/
	public static com.reliance.reality.model.RelianceReality deleteRelianceReality(
		long r_Id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRelianceReality(r_Id);
	}

	public static com.reliance.reality.model.RelianceReality fetchRelianceReality(
		long r_Id) {
		return getService().fetchRelianceReality(r_Id);
	}

	/**
	* Returns the reliance reality with the primary key.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality
	* @throws PortalException if a reliance reality with the primary key could not be found
	*/
	public static com.reliance.reality.model.RelianceReality getRelianceReality(
		long r_Id) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRelianceReality(r_Id);
	}

	/**
	* Updates the reliance reality in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relianceReality the reliance reality
	* @return the reliance reality that was updated
	*/
	public static com.reliance.reality.model.RelianceReality updateRelianceReality(
		com.reliance.reality.model.RelianceReality relianceReality) {
		return getService().updateRelianceReality(relianceReality);
	}

	/**
	* Returns the number of reliance realities.
	*
	* @return the number of reliance realities
	*/
	public static int getRelianceRealitiesCount() {
		return getService().getRelianceRealitiesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.reliance.reality.model.RelianceReality> getExistRecord(
		java.lang.String empCode, java.lang.String propertyId) {
		return getService().getExistRecord(empCode, propertyId);
	}

	/**
	* Returns a range of all the reliance realities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reliance realities
	* @param end the upper bound of the range of reliance realities (not inclusive)
	* @return the range of reliance realities
	*/
	public static java.util.List<com.reliance.reality.model.RelianceReality> getRelianceRealities(
		int start, int end) {
		return getService().getRelianceRealities(start, end);
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

	public static void saveRelianceRealityForm(
		com.reliance.reality.model.RelianceReality relianceReality) {
		getService().saveRelianceRealityForm(relianceReality);
	}

	public static RelianceRealityLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RelianceRealityLocalService, RelianceRealityLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RelianceRealityLocalService.class);
}