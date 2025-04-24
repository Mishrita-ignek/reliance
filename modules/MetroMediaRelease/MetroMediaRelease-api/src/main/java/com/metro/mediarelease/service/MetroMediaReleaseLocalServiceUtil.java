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

package com.metro.mediarelease.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for MetroMediaRelease. This utility wraps
 * {@link com.metro.mediarelease.service.impl.MetroMediaReleaseLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MetroMediaReleaseLocalService
 * @see com.metro.mediarelease.service.base.MetroMediaReleaseLocalServiceBaseImpl
 * @see com.metro.mediarelease.service.impl.MetroMediaReleaseLocalServiceImpl
 * @generated
 */
@ProviderType
public class MetroMediaReleaseLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.metro.mediarelease.service.impl.MetroMediaReleaseLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the metro media release to the database. Also notifies the appropriate model listeners.
	*
	* @param metroMediaRelease the metro media release
	* @return the metro media release that was added
	*/
	public static com.metro.mediarelease.model.MetroMediaRelease addMetroMediaRelease(
		com.metro.mediarelease.model.MetroMediaRelease metroMediaRelease) {
		return getService().addMetroMediaRelease(metroMediaRelease);
	}

	/**
	* Creates a new metro media release with the primary key. Does not add the metro media release to the database.
	*
	* @param SRNO the primary key for the new metro media release
	* @return the new metro media release
	*/
	public static com.metro.mediarelease.model.MetroMediaRelease createMetroMediaRelease(
		long SRNO) {
		return getService().createMetroMediaRelease(SRNO);
	}

	/**
	* Deletes the metro media release from the database. Also notifies the appropriate model listeners.
	*
	* @param metroMediaRelease the metro media release
	* @return the metro media release that was removed
	*/
	public static com.metro.mediarelease.model.MetroMediaRelease deleteMetroMediaRelease(
		com.metro.mediarelease.model.MetroMediaRelease metroMediaRelease) {
		return getService().deleteMetroMediaRelease(metroMediaRelease);
	}

	/**
	* Deletes the metro media release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release that was removed
	* @throws PortalException if a metro media release with the primary key could not be found
	*/
	public static com.metro.mediarelease.model.MetroMediaRelease deleteMetroMediaRelease(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteMetroMediaRelease(SRNO);
	}

	public static com.metro.mediarelease.model.MetroMediaRelease fetchMetroMediaRelease(
		long SRNO) {
		return getService().fetchMetroMediaRelease(SRNO);
	}

	/**
	* Returns the metro media release with the primary key.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release
	* @throws PortalException if a metro media release with the primary key could not be found
	*/
	public static com.metro.mediarelease.model.MetroMediaRelease getMetroMediaRelease(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getMetroMediaRelease(SRNO);
	}

	/**
	* Updates the metro media release in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param metroMediaRelease the metro media release
	* @return the metro media release that was updated
	*/
	public static com.metro.mediarelease.model.MetroMediaRelease updateMetroMediaRelease(
		com.metro.mediarelease.model.MetroMediaRelease metroMediaRelease) {
		return getService().updateMetroMediaRelease(metroMediaRelease);
	}

	/**
	* Returns the number of metro media releases.
	*
	* @return the number of metro media releases
	*/
	public static int getMetroMediaReleasesCount() {
		return getService().getMetroMediaReleasesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.metro.mediarelease.model.impl.MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.metro.mediarelease.model.impl.MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.metro.mediarelease.model.MetroMediaRelease> getMediaRelease(
		java.lang.String monthYear) {
		return getService().getMediaRelease(monthYear);
	}

	/**
	* Returns a range of all the metro media releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.metro.mediarelease.model.impl.MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of metro media releases
	* @param end the upper bound of the range of metro media releases (not inclusive)
	* @return the range of metro media releases
	*/
	public static java.util.List<com.metro.mediarelease.model.MetroMediaRelease> getMetroMediaReleases(
		int start, int end) {
		return getService().getMetroMediaReleases(start, end);
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

	public static MetroMediaReleaseLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<MetroMediaReleaseLocalService, MetroMediaReleaseLocalService> _serviceTracker =
		ServiceTrackerFactory.open(MetroMediaReleaseLocalService.class);
}