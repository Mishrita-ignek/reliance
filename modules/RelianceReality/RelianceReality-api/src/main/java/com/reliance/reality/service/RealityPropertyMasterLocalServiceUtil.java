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
 * Provides the local service utility for RealityPropertyMaster. This utility wraps
 * {@link com.reliance.reality.service.impl.RealityPropertyMasterLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMasterLocalService
 * @see com.reliance.reality.service.base.RealityPropertyMasterLocalServiceBaseImpl
 * @see com.reliance.reality.service.impl.RealityPropertyMasterLocalServiceImpl
 * @generated
 */
@ProviderType
public class RealityPropertyMasterLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.reliance.reality.service.impl.RealityPropertyMasterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
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
	* Adds the reality property master to the database. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was added
	*/
	public static com.reliance.reality.model.RealityPropertyMaster addRealityPropertyMaster(
		com.reliance.reality.model.RealityPropertyMaster realityPropertyMaster) {
		return getService().addRealityPropertyMaster(realityPropertyMaster);
	}

	/**
	* Creates a new reality property master with the primary key. Does not add the reality property master to the database.
	*
	* @param property_ID the primary key for the new reality property master
	* @return the new reality property master
	*/
	public static com.reliance.reality.model.RealityPropertyMaster createRealityPropertyMaster(
		long property_ID) {
		return getService().createRealityPropertyMaster(property_ID);
	}

	/**
	* Deletes the reality property master from the database. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was removed
	*/
	public static com.reliance.reality.model.RealityPropertyMaster deleteRealityPropertyMaster(
		com.reliance.reality.model.RealityPropertyMaster realityPropertyMaster) {
		return getService().deleteRealityPropertyMaster(realityPropertyMaster);
	}

	/**
	* Deletes the reality property master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master that was removed
	* @throws PortalException if a reality property master with the primary key could not be found
	*/
	public static com.reliance.reality.model.RealityPropertyMaster deleteRealityPropertyMaster(
		long property_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRealityPropertyMaster(property_ID);
	}

	public static com.reliance.reality.model.RealityPropertyMaster fetchRealityPropertyMaster(
		long property_ID) {
		return getService().fetchRealityPropertyMaster(property_ID);
	}

	/**
	* Returns the reality property master with the primary key.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master
	* @throws PortalException if a reality property master with the primary key could not be found
	*/
	public static com.reliance.reality.model.RealityPropertyMaster getRealityPropertyMaster(
		long property_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRealityPropertyMaster(property_ID);
	}

	/**
	* Updates the reality property master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was updated
	*/
	public static com.reliance.reality.model.RealityPropertyMaster updateRealityPropertyMaster(
		com.reliance.reality.model.RealityPropertyMaster realityPropertyMaster) {
		return getService().updateRealityPropertyMaster(realityPropertyMaster);
	}

	/**
	* Returns the number of reality property masters.
	*
	* @return the number of reality property masters
	*/
	public static int getRealityPropertyMastersCount() {
		return getService().getRealityPropertyMastersCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.reliance.reality.model.RealityPropertyMaster> getProperty(
		java.lang.String location) {
		return getService().getProperty(location);
	}

	public static java.util.List<com.reliance.reality.model.RealityPropertyMaster> getPropertyRecord(
		java.lang.String city) {
		return getService().getPropertyRecord(city);
	}

	/**
	* Returns a range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @return the range of reality property masters
	*/
	public static java.util.List<com.reliance.reality.model.RealityPropertyMaster> getRealityPropertyMasters(
		int start, int end) {
		return getService().getRealityPropertyMasters(start, end);
	}

	public static java.util.Set<java.lang.String> getCity() {
		return getService().getCity();
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

	public static RealityPropertyMasterLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RealityPropertyMasterLocalService, RealityPropertyMasterLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RealityPropertyMasterLocalService.class);
}