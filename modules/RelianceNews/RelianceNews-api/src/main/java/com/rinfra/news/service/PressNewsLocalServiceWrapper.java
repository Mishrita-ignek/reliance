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

package com.rinfra.news.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PressNewsLocalService}.
 *
 * @author Vipin Singh
 * @see PressNewsLocalService
 * @generated
 */
@ProviderType
public class PressNewsLocalServiceWrapper implements PressNewsLocalService,
	ServiceWrapper<PressNewsLocalService> {
	public PressNewsLocalServiceWrapper(
		PressNewsLocalService pressNewsLocalService) {
		_pressNewsLocalService = pressNewsLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _pressNewsLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pressNewsLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _pressNewsLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressNewsLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressNewsLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the press news to the database. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was added
	*/
	@Override
	public com.rinfra.news.model.PressNews addPressNews(
		com.rinfra.news.model.PressNews pressNews) {
		return _pressNewsLocalService.addPressNews(pressNews);
	}

	/**
	* Creates a new press news with the primary key. Does not add the press news to the database.
	*
	* @param newsId the primary key for the new press news
	* @return the new press news
	*/
	@Override
	public com.rinfra.news.model.PressNews createPressNews(long newsId) {
		return _pressNewsLocalService.createPressNews(newsId);
	}

	/**
	* Deletes the press news from the database. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was removed
	*/
	@Override
	public com.rinfra.news.model.PressNews deletePressNews(
		com.rinfra.news.model.PressNews pressNews) {
		return _pressNewsLocalService.deletePressNews(pressNews);
	}

	/**
	* Deletes the press news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the press news
	* @return the press news that was removed
	* @throws PortalException if a press news with the primary key could not be found
	*/
	@Override
	public com.rinfra.news.model.PressNews deletePressNews(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressNewsLocalService.deletePressNews(newsId);
	}

	@Override
	public com.rinfra.news.model.PressNews fetchPressNews(long newsId) {
		return _pressNewsLocalService.fetchPressNews(newsId);
	}

	/**
	* Returns the press news with the primary key.
	*
	* @param newsId the primary key of the press news
	* @return the press news
	* @throws PortalException if a press news with the primary key could not be found
	*/
	@Override
	public com.rinfra.news.model.PressNews getPressNews(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressNewsLocalService.getPressNews(newsId);
	}

	/**
	* Updates the press news in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was updated
	*/
	@Override
	public com.rinfra.news.model.PressNews updatePressNews(
		com.rinfra.news.model.PressNews pressNews) {
		return _pressNewsLocalService.updatePressNews(pressNews);
	}

	/**
	* Returns the number of press newses.
	*
	* @return the number of press newses
	*/
	@Override
	public int getPressNewsesCount() {
		return _pressNewsLocalService.getPressNewsesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _pressNewsLocalService.getOSGiServiceIdentifier();
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
		return _pressNewsLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.news.model.impl.PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pressNewsLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.news.model.impl.PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pressNewsLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> fetchNewsTickerRecord() {
		return _pressNewsLocalService.fetchNewsTickerRecord();
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearAndMonth(
		int year, int month) {
		return _pressNewsLocalService.filterNewsByYearAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNewsWrapper> filterNewsByYearAndMonth(
		int year, java.lang.Integer month) {
		return _pressNewsLocalService.filterNewsByYearAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNewsWrapper> filterNewsByYearAndMonth(
		java.lang.Integer year, java.lang.Integer month) {
		return _pressNewsLocalService.filterNewsByYearAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearAndMonth(
		java.lang.String year, java.lang.String month) {
		return _pressNewsLocalService.filterNewsByYearAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearsAndMonth(
		int year, int month) {
		return _pressNewsLocalService.filterNewsByYearsAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearsAndMonth(
		java.lang.String year, java.lang.String month) {
		return _pressNewsLocalService.filterNewsByYearsAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> findByNewsYear(
		int year) {
		return _pressNewsLocalService.findByNewsYear(year);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> findByNewsYearAndMonth(
		int year, int month) {
		return _pressNewsLocalService.findByNewsYearAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> findByNewsYearAndMonth(
		java.lang.String year, java.lang.String month) {
		return _pressNewsLocalService.findByNewsYearAndMonth(year, month);
	}

	@Override
	public java.util.List<com.rinfra.news.model.PressNews> getNewsByYear(
		int year) {
		return _pressNewsLocalService.getNewsByYear(year);
	}

	/**
	* Returns a range of all the press newses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.news.model.impl.PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press newses
	* @param end the upper bound of the range of press newses (not inclusive)
	* @return the range of press newses
	*/
	@Override
	public java.util.List<com.rinfra.news.model.PressNews> getPressNewses(
		int start, int end) {
		return _pressNewsLocalService.getPressNewses(start, end);
	}

	@Override
	public java.util.Set<java.lang.Integer> getSetOfYear() {
		return _pressNewsLocalService.getSetOfYear();
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
		return _pressNewsLocalService.dynamicQueryCount(dynamicQuery);
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
		return _pressNewsLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public PressNewsLocalService getWrappedService() {
		return _pressNewsLocalService;
	}

	@Override
	public void setWrappedService(PressNewsLocalService pressNewsLocalService) {
		_pressNewsLocalService = pressNewsLocalService;
	}

	private PressNewsLocalService _pressNewsLocalService;
}