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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RealityPropertyMasterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMasterLocalService
 * @generated
 */
@ProviderType
public class RealityPropertyMasterLocalServiceWrapper
	implements RealityPropertyMasterLocalService,
		ServiceWrapper<RealityPropertyMasterLocalService> {
	public RealityPropertyMasterLocalServiceWrapper(
		RealityPropertyMasterLocalService realityPropertyMasterLocalService) {
		_realityPropertyMasterLocalService = realityPropertyMasterLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _realityPropertyMasterLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _realityPropertyMasterLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _realityPropertyMasterLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _realityPropertyMasterLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _realityPropertyMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the reality property master to the database. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was added
	*/
	@Override
	public com.reliance.reality.model.RealityPropertyMaster addRealityPropertyMaster(
		com.reliance.reality.model.RealityPropertyMaster realityPropertyMaster) {
		return _realityPropertyMasterLocalService.addRealityPropertyMaster(realityPropertyMaster);
	}

	/**
	* Creates a new reality property master with the primary key. Does not add the reality property master to the database.
	*
	* @param property_ID the primary key for the new reality property master
	* @return the new reality property master
	*/
	@Override
	public com.reliance.reality.model.RealityPropertyMaster createRealityPropertyMaster(
		long property_ID) {
		return _realityPropertyMasterLocalService.createRealityPropertyMaster(property_ID);
	}

	/**
	* Deletes the reality property master from the database. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was removed
	*/
	@Override
	public com.reliance.reality.model.RealityPropertyMaster deleteRealityPropertyMaster(
		com.reliance.reality.model.RealityPropertyMaster realityPropertyMaster) {
		return _realityPropertyMasterLocalService.deleteRealityPropertyMaster(realityPropertyMaster);
	}

	/**
	* Deletes the reality property master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master that was removed
	* @throws PortalException if a reality property master with the primary key could not be found
	*/
	@Override
	public com.reliance.reality.model.RealityPropertyMaster deleteRealityPropertyMaster(
		long property_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _realityPropertyMasterLocalService.deleteRealityPropertyMaster(property_ID);
	}

	@Override
	public com.reliance.reality.model.RealityPropertyMaster fetchRealityPropertyMaster(
		long property_ID) {
		return _realityPropertyMasterLocalService.fetchRealityPropertyMaster(property_ID);
	}

	/**
	* Returns the reality property master with the primary key.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master
	* @throws PortalException if a reality property master with the primary key could not be found
	*/
	@Override
	public com.reliance.reality.model.RealityPropertyMaster getRealityPropertyMaster(
		long property_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _realityPropertyMasterLocalService.getRealityPropertyMaster(property_ID);
	}

	/**
	* Updates the reality property master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was updated
	*/
	@Override
	public com.reliance.reality.model.RealityPropertyMaster updateRealityPropertyMaster(
		com.reliance.reality.model.RealityPropertyMaster realityPropertyMaster) {
		return _realityPropertyMasterLocalService.updateRealityPropertyMaster(realityPropertyMaster);
	}

	/**
	* Returns the number of reality property masters.
	*
	* @return the number of reality property masters
	*/
	@Override
	public int getRealityPropertyMastersCount() {
		return _realityPropertyMasterLocalService.getRealityPropertyMastersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _realityPropertyMasterLocalService.getOSGiServiceIdentifier();
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
		return _realityPropertyMasterLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _realityPropertyMasterLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _realityPropertyMasterLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.reliance.reality.model.RealityPropertyMaster> getProperty(
		java.lang.String location) {
		return _realityPropertyMasterLocalService.getProperty(location);
	}

	@Override
	public java.util.List<com.reliance.reality.model.RealityPropertyMaster> getPropertyRecord(
		java.lang.String city) {
		return _realityPropertyMasterLocalService.getPropertyRecord(city);
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
	@Override
	public java.util.List<com.reliance.reality.model.RealityPropertyMaster> getRealityPropertyMasters(
		int start, int end) {
		return _realityPropertyMasterLocalService.getRealityPropertyMasters(start,
			end);
	}

	@Override
	public java.util.Set<java.lang.String> getCity() {
		return _realityPropertyMasterLocalService.getCity();
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
		return _realityPropertyMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _realityPropertyMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public RealityPropertyMasterLocalService getWrappedService() {
		return _realityPropertyMasterLocalService;
	}

	@Override
	public void setWrappedService(
		RealityPropertyMasterLocalService realityPropertyMasterLocalService) {
		_realityPropertyMasterLocalService = realityPropertyMasterLocalService;
	}

	private RealityPropertyMasterLocalService _realityPropertyMasterLocalService;
}