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

package com.rinfra.satisfactionsurvey.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ShareholdersLocalService}.
 *
 * @author Mukesh
 * @see ShareholdersLocalService
 * @generated
 */
@ProviderType
public class ShareholdersLocalServiceWrapper implements ShareholdersLocalService,
	ServiceWrapper<ShareholdersLocalService> {
	public ShareholdersLocalServiceWrapper(
		ShareholdersLocalService shareholdersLocalService) {
		_shareholdersLocalService = shareholdersLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _shareholdersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shareholdersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _shareholdersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareholdersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareholdersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the shareholders to the database. Also notifies the appropriate model listeners.
	*
	* @param shareholders the shareholders
	* @return the shareholders that was added
	*/
	@Override
	public com.rinfra.satisfactionsurvey.model.Shareholders addShareholders(
		com.rinfra.satisfactionsurvey.model.Shareholders shareholders) {
		return _shareholdersLocalService.addShareholders(shareholders);
	}

	/**
	* Creates a new shareholders with the primary key. Does not add the shareholders to the database.
	*
	* @param SOLE_ID the primary key for the new shareholders
	* @return the new shareholders
	*/
	@Override
	public com.rinfra.satisfactionsurvey.model.Shareholders createShareholders(
		long SOLE_ID) {
		return _shareholdersLocalService.createShareholders(SOLE_ID);
	}

	/**
	* Deletes the shareholders from the database. Also notifies the appropriate model listeners.
	*
	* @param shareholders the shareholders
	* @return the shareholders that was removed
	*/
	@Override
	public com.rinfra.satisfactionsurvey.model.Shareholders deleteShareholders(
		com.rinfra.satisfactionsurvey.model.Shareholders shareholders) {
		return _shareholdersLocalService.deleteShareholders(shareholders);
	}

	/**
	* Deletes the shareholders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders that was removed
	* @throws PortalException if a shareholders with the primary key could not be found
	*/
	@Override
	public com.rinfra.satisfactionsurvey.model.Shareholders deleteShareholders(
		long SOLE_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareholdersLocalService.deleteShareholders(SOLE_ID);
	}

	@Override
	public com.rinfra.satisfactionsurvey.model.Shareholders fetchShareholders(
		long SOLE_ID) {
		return _shareholdersLocalService.fetchShareholders(SOLE_ID);
	}

	/**
	* Returns the shareholders with the primary key.
	*
	* @param SOLE_ID the primary key of the shareholders
	* @return the shareholders
	* @throws PortalException if a shareholders with the primary key could not be found
	*/
	@Override
	public com.rinfra.satisfactionsurvey.model.Shareholders getShareholders(
		long SOLE_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareholdersLocalService.getShareholders(SOLE_ID);
	}

	/**
	* Updates the shareholders in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shareholders the shareholders
	* @return the shareholders that was updated
	*/
	@Override
	public com.rinfra.satisfactionsurvey.model.Shareholders updateShareholders(
		com.rinfra.satisfactionsurvey.model.Shareholders shareholders) {
		return _shareholdersLocalService.updateShareholders(shareholders);
	}

	/**
	* Returns the number of shareholderses.
	*
	* @return the number of shareholderses
	*/
	@Override
	public int getShareholdersesCount() {
		return _shareholdersLocalService.getShareholdersesCount();
	}

	@Override
	public int saveShareholdersSurvey(java.lang.Long ShareholdersId,
		java.lang.String soleName, java.lang.Long actualId,
		java.lang.Long clientIdNo, java.lang.Long mobileNo,
		java.lang.Long telephoneNo, java.lang.String emailId,
		java.lang.String responce, java.lang.String responce1,
		java.lang.String responce2, java.lang.String responce3,
		java.lang.String GRIEVANCE, java.lang.String description,
		java.lang.String comments) {
		return _shareholdersLocalService.saveShareholdersSurvey(ShareholdersId,
			soleName, actualId, clientIdNo, mobileNo, telephoneNo, emailId,
			responce, responce1, responce2, responce3, GRIEVANCE, description,
			comments);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _shareholdersLocalService.getOSGiServiceIdentifier();
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
		return _shareholdersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.satisfactionsurvey.model.impl.ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shareholdersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.satisfactionsurvey.model.impl.ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shareholdersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the shareholderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.satisfactionsurvey.model.impl.ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of shareholderses
	* @param end the upper bound of the range of shareholderses (not inclusive)
	* @return the range of shareholderses
	*/
	@Override
	public java.util.List<com.rinfra.satisfactionsurvey.model.Shareholders> getShareholderses(
		int start, int end) {
		return _shareholdersLocalService.getShareholderses(start, end);
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
		return _shareholdersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _shareholdersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public ShareholdersLocalService getWrappedService() {
		return _shareholdersLocalService;
	}

	@Override
	public void setWrappedService(
		ShareholdersLocalService shareholdersLocalService) {
		_shareholdersLocalService = shareholdersLocalService;
	}

	private ShareholdersLocalService _shareholdersLocalService;
}