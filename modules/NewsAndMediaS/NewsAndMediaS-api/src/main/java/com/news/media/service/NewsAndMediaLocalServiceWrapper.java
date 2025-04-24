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

package com.news.media.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link NewsAndMediaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndMediaLocalService
 * @generated
 */
@ProviderType
public class NewsAndMediaLocalServiceWrapper implements NewsAndMediaLocalService,
	ServiceWrapper<NewsAndMediaLocalService> {
	public NewsAndMediaLocalServiceWrapper(
		NewsAndMediaLocalService newsAndMediaLocalService) {
		_newsAndMediaLocalService = newsAndMediaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _newsAndMediaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _newsAndMediaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _newsAndMediaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsAndMediaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsAndMediaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the news and media to the database. Also notifies the appropriate model listeners.
	*
	* @param newsAndMedia the news and media
	* @return the news and media that was added
	*/
	@Override
	public com.news.media.model.NewsAndMedia addNewsAndMedia(
		com.news.media.model.NewsAndMedia newsAndMedia) {
		return _newsAndMediaLocalService.addNewsAndMedia(newsAndMedia);
	}

	/**
	* Creates a new news and media with the primary key. Does not add the news and media to the database.
	*
	* @param SRNO the primary key for the new news and media
	* @return the new news and media
	*/
	@Override
	public com.news.media.model.NewsAndMedia createNewsAndMedia(long SRNO) {
		return _newsAndMediaLocalService.createNewsAndMedia(SRNO);
	}

	/**
	* Deletes the news and media from the database. Also notifies the appropriate model listeners.
	*
	* @param newsAndMedia the news and media
	* @return the news and media that was removed
	*/
	@Override
	public com.news.media.model.NewsAndMedia deleteNewsAndMedia(
		com.news.media.model.NewsAndMedia newsAndMedia) {
		return _newsAndMediaLocalService.deleteNewsAndMedia(newsAndMedia);
	}

	/**
	* Deletes the news and media with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media that was removed
	* @throws PortalException if a news and media with the primary key could not be found
	*/
	@Override
	public com.news.media.model.NewsAndMedia deleteNewsAndMedia(long SRNO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsAndMediaLocalService.deleteNewsAndMedia(SRNO);
	}

	@Override
	public com.news.media.model.NewsAndMedia fetchNewsAndMedia(long SRNO) {
		return _newsAndMediaLocalService.fetchNewsAndMedia(SRNO);
	}

	/**
	* Returns the news and media with the primary key.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media
	* @throws PortalException if a news and media with the primary key could not be found
	*/
	@Override
	public com.news.media.model.NewsAndMedia getNewsAndMedia(long SRNO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _newsAndMediaLocalService.getNewsAndMedia(SRNO);
	}

	/**
	* Updates the news and media in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param newsAndMedia the news and media
	* @return the news and media that was updated
	*/
	@Override
	public com.news.media.model.NewsAndMedia updateNewsAndMedia(
		com.news.media.model.NewsAndMedia newsAndMedia) {
		return _newsAndMediaLocalService.updateNewsAndMedia(newsAndMedia);
	}

	/**
	* Returns the number of news and medias.
	*
	* @return the number of news and medias
	*/
	@Override
	public int getNewsAndMediasCount() {
		return _newsAndMediaLocalService.getNewsAndMediasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _newsAndMediaLocalService.getOSGiServiceIdentifier();
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
		return _newsAndMediaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.news.media.model.impl.NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _newsAndMediaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.news.media.model.impl.NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _newsAndMediaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the news and medias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.news.media.model.impl.NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news and medias
	* @param end the upper bound of the range of news and medias (not inclusive)
	* @return the range of news and medias
	*/
	@Override
	public java.util.List<com.news.media.model.NewsAndMedia> getNewsAndMedias(
		int start, int end) {
		return _newsAndMediaLocalService.getNewsAndMedias(start, end);
	}

	@Override
	public java.util.List<com.news.media.model.NewsAndMedia> getNewsList(
		java.lang.String monthYear, java.lang.String publication) {
		return _newsAndMediaLocalService.getNewsList(monthYear, publication);
	}

	@Override
	public java.util.List<com.news.media.model.NewsAndMedia> getPublicationList(
		java.lang.String monthYear) {
		return _newsAndMediaLocalService.getPublicationList(monthYear);
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
		return _newsAndMediaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _newsAndMediaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public NewsAndMediaLocalService getWrappedService() {
		return _newsAndMediaLocalService;
	}

	@Override
	public void setWrappedService(
		NewsAndMediaLocalService newsAndMediaLocalService) {
		_newsAndMediaLocalService = newsAndMediaLocalService;
	}

	private NewsAndMediaLocalService _newsAndMediaLocalService;
}