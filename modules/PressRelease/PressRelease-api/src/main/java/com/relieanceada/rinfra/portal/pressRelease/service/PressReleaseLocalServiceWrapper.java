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

package com.relieanceada.rinfra.portal.pressRelease.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PressReleaseLocalService}.
 *
 * @author Vipin Singh
 * @see PressReleaseLocalService
 * @generated
 */
@ProviderType
public class PressReleaseLocalServiceWrapper implements PressReleaseLocalService,
	ServiceWrapper<PressReleaseLocalService> {
	public PressReleaseLocalServiceWrapper(
		PressReleaseLocalService pressReleaseLocalService) {
		_pressReleaseLocalService = pressReleaseLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _pressReleaseLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _pressReleaseLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _pressReleaseLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressReleaseLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressReleaseLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the press release to the database. Also notifies the appropriate model listeners.
	*
	* @param pressRelease the press release
	* @return the press release that was added
	*/
	@Override
	public com.relieanceada.rinfra.portal.pressRelease.model.PressRelease addPressRelease(
		com.relieanceada.rinfra.portal.pressRelease.model.PressRelease pressRelease) {
		return _pressReleaseLocalService.addPressRelease(pressRelease);
	}

	/**
	* Creates a new press release with the primary key. Does not add the press release to the database.
	*
	* @param pressId the primary key for the new press release
	* @return the new press release
	*/
	@Override
	public com.relieanceada.rinfra.portal.pressRelease.model.PressRelease createPressRelease(
		long pressId) {
		return _pressReleaseLocalService.createPressRelease(pressId);
	}

	/**
	* Deletes the press release from the database. Also notifies the appropriate model listeners.
	*
	* @param pressRelease the press release
	* @return the press release that was removed
	*/
	@Override
	public com.relieanceada.rinfra.portal.pressRelease.model.PressRelease deletePressRelease(
		com.relieanceada.rinfra.portal.pressRelease.model.PressRelease pressRelease) {
		return _pressReleaseLocalService.deletePressRelease(pressRelease);
	}

	/**
	* Deletes the press release with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pressId the primary key of the press release
	* @return the press release that was removed
	* @throws PortalException if a press release with the primary key could not be found
	*/
	@Override
	public com.relieanceada.rinfra.portal.pressRelease.model.PressRelease deletePressRelease(
		long pressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressReleaseLocalService.deletePressRelease(pressId);
	}

	@Override
	public com.relieanceada.rinfra.portal.pressRelease.model.PressRelease fetchPressRelease(
		long pressId) {
		return _pressReleaseLocalService.fetchPressRelease(pressId);
	}

	/**
	* Returns the press release with the primary key.
	*
	* @param pressId the primary key of the press release
	* @return the press release
	* @throws PortalException if a press release with the primary key could not be found
	*/
	@Override
	public com.relieanceada.rinfra.portal.pressRelease.model.PressRelease getPressRelease(
		long pressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _pressReleaseLocalService.getPressRelease(pressId);
	}

	/**
	* Updates the press release in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param pressRelease the press release
	* @return the press release that was updated
	*/
	@Override
	public com.relieanceada.rinfra.portal.pressRelease.model.PressRelease updatePressRelease(
		com.relieanceada.rinfra.portal.pressRelease.model.PressRelease pressRelease) {
		return _pressReleaseLocalService.updatePressRelease(pressRelease);
	}

	/**
	* Returns the number of press releases.
	*
	* @return the number of press releases
	*/
	@Override
	public int getPressReleasesCount() {
		return _pressReleaseLocalService.getPressReleasesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _pressReleaseLocalService.getOSGiServiceIdentifier();
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
		return _pressReleaseLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pressReleaseLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _pressReleaseLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.relieanceada.rinfra.portal.pressRelease.model.PressRelease> fetchNewsTickerRecord() {
		return _pressReleaseLocalService.fetchNewsTickerRecord();
	}

	@Override
	public java.util.List<com.relieanceada.rinfra.portal.pressRelease.model.PressRelease> fetchPressReleases(
		java.lang.String selectedNewsYear) {
		return _pressReleaseLocalService.fetchPressReleases(selectedNewsYear);
	}

	@Override
	public java.util.List<com.relieanceada.rinfra.portal.pressRelease.model.PressRelease> findByselectedNewsYear(
		java.lang.String newsYear) {
		return _pressReleaseLocalService.findByselectedNewsYear(newsYear);
	}

	@Override
	public java.util.List<java.lang.String> getNewsYearList() {
		return _pressReleaseLocalService.getNewsYearList();
	}

	/**
	* Returns a range of all the press releases.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of press releases
	* @param end the upper bound of the range of press releases (not inclusive)
	* @return the range of press releases
	*/
	@Override
	public java.util.List<com.relieanceada.rinfra.portal.pressRelease.model.PressRelease> getPressReleases(
		int start, int end) {
		return _pressReleaseLocalService.getPressReleases(start, end);
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
		return _pressReleaseLocalService.dynamicQueryCount(dynamicQuery);
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
		return _pressReleaseLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public PressReleaseLocalService getWrappedService() {
		return _pressReleaseLocalService;
	}

	@Override
	public void setWrappedService(
		PressReleaseLocalService pressReleaseLocalService) {
		_pressReleaseLocalService = pressReleaseLocalService;
	}

	private PressReleaseLocalService _pressReleaseLocalService;
}