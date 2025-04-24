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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for PressNews. This utility wraps
 * {@link com.rinfra.news.service.impl.PressNewsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Vipin Singh
 * @see PressNewsLocalService
 * @see com.rinfra.news.service.base.PressNewsLocalServiceBaseImpl
 * @see com.rinfra.news.service.impl.PressNewsLocalServiceImpl
 * @generated
 */
@ProviderType
public class PressNewsLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rinfra.news.service.impl.PressNewsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the press news to the database. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was added
	*/
	public static com.rinfra.news.model.PressNews addPressNews(
		com.rinfra.news.model.PressNews pressNews) {
		return getService().addPressNews(pressNews);
	}

	/**
	* Creates a new press news with the primary key. Does not add the press news to the database.
	*
	* @param newsId the primary key for the new press news
	* @return the new press news
	*/
	public static com.rinfra.news.model.PressNews createPressNews(long newsId) {
		return getService().createPressNews(newsId);
	}

	/**
	* Deletes the press news from the database. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was removed
	*/
	public static com.rinfra.news.model.PressNews deletePressNews(
		com.rinfra.news.model.PressNews pressNews) {
		return getService().deletePressNews(pressNews);
	}

	/**
	* Deletes the press news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the press news
	* @return the press news that was removed
	* @throws PortalException if a press news with the primary key could not be found
	*/
	public static com.rinfra.news.model.PressNews deletePressNews(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePressNews(newsId);
	}

	public static com.rinfra.news.model.PressNews fetchPressNews(long newsId) {
		return getService().fetchPressNews(newsId);
	}

	/**
	* Returns the press news with the primary key.
	*
	* @param newsId the primary key of the press news
	* @return the press news
	* @throws PortalException if a press news with the primary key could not be found
	*/
	public static com.rinfra.news.model.PressNews getPressNews(long newsId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPressNews(newsId);
	}

	/**
	* Updates the press news in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was updated
	*/
	public static com.rinfra.news.model.PressNews updatePressNews(
		com.rinfra.news.model.PressNews pressNews) {
		return getService().updatePressNews(pressNews);
	}

	/**
	* Returns the number of press newses.
	*
	* @return the number of press newses
	*/
	public static int getPressNewsesCount() {
		return getService().getPressNewsesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.news.model.impl.PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.news.model.impl.PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.rinfra.news.model.PressNews> fetchNewsTickerRecord() {
		return getService().fetchNewsTickerRecord();
	}

	public static java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearAndMonth(
		int year, int month) {
		return getService().filterNewsByYearAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNewsWrapper> filterNewsByYearAndMonth(
		int year, java.lang.Integer month) {
		return getService().filterNewsByYearAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNewsWrapper> filterNewsByYearAndMonth(
		java.lang.Integer year, java.lang.Integer month) {
		return getService().filterNewsByYearAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearAndMonth(
		java.lang.String year, java.lang.String month) {
		return getService().filterNewsByYearAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearsAndMonth(
		int year, int month) {
		return getService().filterNewsByYearsAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNews> filterNewsByYearsAndMonth(
		java.lang.String year, java.lang.String month) {
		return getService().filterNewsByYearsAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNews> findByNewsYear(
		int year) {
		return getService().findByNewsYear(year);
	}

	public static java.util.List<com.rinfra.news.model.PressNews> findByNewsYearAndMonth(
		int year, int month) {
		return getService().findByNewsYearAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNews> findByNewsYearAndMonth(
		java.lang.String year, java.lang.String month) {
		return getService().findByNewsYearAndMonth(year, month);
	}

	public static java.util.List<com.rinfra.news.model.PressNews> getNewsByYear(
		int year) {
		return getService().getNewsByYear(year);
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
	public static java.util.List<com.rinfra.news.model.PressNews> getPressNewses(
		int start, int end) {
		return getService().getPressNewses(start, end);
	}

	public static java.util.Set<java.lang.Integer> getSetOfYear() {
		return getService().getSetOfYear();
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

	public static PressNewsLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PressNewsLocalService, PressNewsLocalService> _serviceTracker =
		ServiceTrackerFactory.open(PressNewsLocalService.class);
}