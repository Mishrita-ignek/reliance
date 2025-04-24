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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rinfra.news.model.PressNews;
import com.rinfra.news.model.PressNewsWrapper;

import java.io.Serializable;

import java.util.List;
import java.util.Set;

/**
 * Provides the local service interface for PressNews. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Vipin Singh
 * @see PressNewsLocalServiceUtil
 * @see com.rinfra.news.service.base.PressNewsLocalServiceBaseImpl
 * @see com.rinfra.news.service.impl.PressNewsLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface PressNewsLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PressNewsLocalServiceUtil} to access the press news local service. Add custom service methods to {@link com.rinfra.news.service.impl.PressNewsLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the press news to the database. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PressNews addPressNews(PressNews pressNews);

	/**
	* Creates a new press news with the primary key. Does not add the press news to the database.
	*
	* @param newsId the primary key for the new press news
	* @return the new press news
	*/
	public PressNews createPressNews(long newsId);

	/**
	* Deletes the press news from the database. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public PressNews deletePressNews(PressNews pressNews);

	/**
	* Deletes the press news with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param newsId the primary key of the press news
	* @return the press news that was removed
	* @throws PortalException if a press news with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public PressNews deletePressNews(long newsId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PressNews fetchPressNews(long newsId);

	/**
	* Returns the press news with the primary key.
	*
	* @param newsId the primary key of the press news
	* @return the press news
	* @throws PortalException if a press news with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PressNews getPressNews(long newsId) throws PortalException;

	/**
	* Updates the press news in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pressNews the press news
	* @return the press news that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public PressNews updatePressNews(PressNews pressNews);

	/**
	* Returns the number of press newses.
	*
	* @return the number of press newses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getPressNewsesCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PressNews> fetchNewsTickerRecord();

	public List<PressNews> filterNewsByYearAndMonth(int year, int month);

	public List<PressNewsWrapper> filterNewsByYearAndMonth(int year,
		java.lang.Integer month);

	public List<PressNewsWrapper> filterNewsByYearAndMonth(
		java.lang.Integer year, java.lang.Integer month);

	public List<PressNews> filterNewsByYearAndMonth(java.lang.String year,
		java.lang.String month);

	public List<PressNews> filterNewsByYearsAndMonth(int year, int month);

	public List<PressNews> filterNewsByYearsAndMonth(java.lang.String year,
		java.lang.String month);

	public List<PressNews> findByNewsYear(int year);

	public List<PressNews> findByNewsYearAndMonth(int year, int month);

	public List<PressNews> findByNewsYearAndMonth(java.lang.String year,
		java.lang.String month);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PressNews> getNewsByYear(int year);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<PressNews> getPressNewses(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Set<java.lang.Integer> getSetOfYear();

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}