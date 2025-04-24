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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MetroMediaReleaseLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MetroMediaReleaseLocalService
 * @generated
 */
@ProviderType
public class MetroMediaReleaseLocalServiceWrapper
	implements MetroMediaReleaseLocalService,
		ServiceWrapper<MetroMediaReleaseLocalService> {
	public MetroMediaReleaseLocalServiceWrapper(
		MetroMediaReleaseLocalService metroMediaReleaseLocalService) {
		_metroMediaReleaseLocalService = metroMediaReleaseLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _metroMediaReleaseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _metroMediaReleaseLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _metroMediaReleaseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _metroMediaReleaseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _metroMediaReleaseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the metro media release to the database. Also notifies the appropriate model listeners.
	*
	* @param metroMediaRelease the metro media release
	* @return the metro media release that was added
	*/
	@Override
	public com.metro.mediarelease.model.MetroMediaRelease addMetroMediaRelease(
		com.metro.mediarelease.model.MetroMediaRelease metroMediaRelease) {
		return _metroMediaReleaseLocalService.addMetroMediaRelease(metroMediaRelease);
	}

	/**
	* Creates a new metro media release with the primary key. Does not add the metro media release to the database.
	*
	* @param SRNO the primary key for the new metro media release
	* @return the new metro media release
	*/
	@Override
	public com.metro.mediarelease.model.MetroMediaRelease createMetroMediaRelease(
		long SRNO) {
		return _metroMediaReleaseLocalService.createMetroMediaRelease(SRNO);
	}

	/**
	* Deletes the metro media release from the database. Also notifies the appropriate model listeners.
	*
	* @param metroMediaRelease the metro media release
	* @return the metro media release that was removed
	*/
	@Override
	public com.metro.mediarelease.model.MetroMediaRelease deleteMetroMediaRelease(
		com.metro.mediarelease.model.MetroMediaRelease metroMediaRelease) {
		return _metroMediaReleaseLocalService.deleteMetroMediaRelease(metroMediaRelease);
	}

	/**
	* Deletes the metro media release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release that was removed
	* @throws PortalException if a metro media release with the primary key could not be found
	*/
	@Override
	public com.metro.mediarelease.model.MetroMediaRelease deleteMetroMediaRelease(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return _metroMediaReleaseLocalService.deleteMetroMediaRelease(SRNO);
	}

	@Override
	public com.metro.mediarelease.model.MetroMediaRelease fetchMetroMediaRelease(
		long SRNO) {
		return _metroMediaReleaseLocalService.fetchMetroMediaRelease(SRNO);
	}

	/**
	* Returns the metro media release with the primary key.
	*
	* @param SRNO the primary key of the metro media release
	* @return the metro media release
	* @throws PortalException if a metro media release with the primary key could not be found
	*/
	@Override
	public com.metro.mediarelease.model.MetroMediaRelease getMetroMediaRelease(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return _metroMediaReleaseLocalService.getMetroMediaRelease(SRNO);
	}

	/**
	* Updates the metro media release in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param metroMediaRelease the metro media release
	* @return the metro media release that was updated
	*/
	@Override
	public com.metro.mediarelease.model.MetroMediaRelease updateMetroMediaRelease(
		com.metro.mediarelease.model.MetroMediaRelease metroMediaRelease) {
		return _metroMediaReleaseLocalService.updateMetroMediaRelease(metroMediaRelease);
	}

	/**
	* Returns the number of metro media releases.
	*
	* @return the number of metro media releases
	*/
	@Override
	public int getMetroMediaReleasesCount() {
		return _metroMediaReleaseLocalService.getMetroMediaReleasesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _metroMediaReleaseLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _metroMediaReleaseLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _metroMediaReleaseLocalService.dynamicQuery(dynamicQuery, start,
			end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _metroMediaReleaseLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.metro.mediarelease.model.MetroMediaRelease> getMediaRelease(
		java.lang.String monthYear) {
		return _metroMediaReleaseLocalService.getMediaRelease(monthYear);
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
	@Override
	public java.util.List<com.metro.mediarelease.model.MetroMediaRelease> getMetroMediaReleases(
		int start, int end) {
		return _metroMediaReleaseLocalService.getMetroMediaReleases(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _metroMediaReleaseLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _metroMediaReleaseLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public MetroMediaReleaseLocalService getWrappedService() {
		return _metroMediaReleaseLocalService;
	}

	@Override
	public void setWrappedService(
		MetroMediaReleaseLocalService metroMediaReleaseLocalService) {
		_metroMediaReleaseLocalService = metroMediaReleaseLocalService;
	}

	private MetroMediaReleaseLocalService _metroMediaReleaseLocalService;
}