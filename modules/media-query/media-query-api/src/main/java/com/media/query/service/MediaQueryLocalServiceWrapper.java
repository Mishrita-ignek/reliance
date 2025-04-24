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

package com.media.query.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MediaQueryLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MediaQueryLocalService
 * @generated
 */
@ProviderType
public class MediaQueryLocalServiceWrapper implements MediaQueryLocalService,
	ServiceWrapper<MediaQueryLocalService> {
	public MediaQueryLocalServiceWrapper(
		MediaQueryLocalService mediaQueryLocalService) {
		_mediaQueryLocalService = mediaQueryLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _mediaQueryLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _mediaQueryLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _mediaQueryLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mediaQueryLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mediaQueryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the media query to the database. Also notifies the appropriate model listeners.
	*
	* @param mediaQuery the media query
	* @return the media query that was added
	*/
	@Override
	public com.media.query.model.MediaQuery addMediaQuery(
		com.media.query.model.MediaQuery mediaQuery) {
		return _mediaQueryLocalService.addMediaQuery(mediaQuery);
	}

	/**
	* Creates a new media query with the primary key. Does not add the media query to the database.
	*
	* @param srNo the primary key for the new media query
	* @return the new media query
	*/
	@Override
	public com.media.query.model.MediaQuery createMediaQuery(long srNo) {
		return _mediaQueryLocalService.createMediaQuery(srNo);
	}

	/**
	* Deletes the media query from the database. Also notifies the appropriate model listeners.
	*
	* @param mediaQuery the media query
	* @return the media query that was removed
	*/
	@Override
	public com.media.query.model.MediaQuery deleteMediaQuery(
		com.media.query.model.MediaQuery mediaQuery) {
		return _mediaQueryLocalService.deleteMediaQuery(mediaQuery);
	}

	/**
	* Deletes the media query with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param srNo the primary key of the media query
	* @return the media query that was removed
	* @throws PortalException if a media query with the primary key could not be found
	*/
	@Override
	public com.media.query.model.MediaQuery deleteMediaQuery(long srNo)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mediaQueryLocalService.deleteMediaQuery(srNo);
	}

	@Override
	public com.media.query.model.MediaQuery fetchMediaQuery(long srNo) {
		return _mediaQueryLocalService.fetchMediaQuery(srNo);
	}

	/**
	* Returns the media query with the primary key.
	*
	* @param srNo the primary key of the media query
	* @return the media query
	* @throws PortalException if a media query with the primary key could not be found
	*/
	@Override
	public com.media.query.model.MediaQuery getMediaQuery(long srNo)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _mediaQueryLocalService.getMediaQuery(srNo);
	}

	/**
	* Updates the media query in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param mediaQuery the media query
	* @return the media query that was updated
	*/
	@Override
	public com.media.query.model.MediaQuery updateMediaQuery(
		com.media.query.model.MediaQuery mediaQuery) {
		return _mediaQueryLocalService.updateMediaQuery(mediaQuery);
	}

	/**
	* Returns the number of media queries.
	*
	* @return the number of media queries
	*/
	@Override
	public int getMediaQueriesCount() {
		return _mediaQueryLocalService.getMediaQueriesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _mediaQueryLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public java.lang.String saveMediaQuery(
		com.media.query.model.MediaQuery mediaQuery) {
		return _mediaQueryLocalService.saveMediaQuery(mediaQuery);
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
		return _mediaQueryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.media.query.model.impl.MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mediaQueryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.media.query.model.impl.MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _mediaQueryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the media queries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.media.query.model.impl.MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of media queries
	* @param end the upper bound of the range of media queries (not inclusive)
	* @return the range of media queries
	*/
	@Override
	public java.util.List<com.media.query.model.MediaQuery> getMediaQueries(
		int start, int end) {
		return _mediaQueryLocalService.getMediaQueries(start, end);
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
		return _mediaQueryLocalService.dynamicQueryCount(dynamicQuery);
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
		return _mediaQueryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public MediaQueryLocalService getWrappedService() {
		return _mediaQueryLocalService;
	}

	@Override
	public void setWrappedService(MediaQueryLocalService mediaQueryLocalService) {
		_mediaQueryLocalService = mediaQueryLocalService;
	}

	private MediaQueryLocalService _mediaQueryLocalService;
}