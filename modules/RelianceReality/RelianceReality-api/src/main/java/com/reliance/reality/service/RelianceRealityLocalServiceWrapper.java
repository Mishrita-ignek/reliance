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
 * Provides a wrapper for {@link RelianceRealityLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RelianceRealityLocalService
 * @generated
 */
@ProviderType
public class RelianceRealityLocalServiceWrapper
	implements RelianceRealityLocalService,
		ServiceWrapper<RelianceRealityLocalService> {
	public RelianceRealityLocalServiceWrapper(
		RelianceRealityLocalService relianceRealityLocalService) {
		_relianceRealityLocalService = relianceRealityLocalService;
	}

	@Override
	public boolean sendMail(java.lang.String msg, java.lang.String frommailid,
		java.lang.String tomailid, java.lang.String subject) {
		return _relianceRealityLocalService.sendMail(msg, frommailid, tomailid,
			subject);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _relianceRealityLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _relianceRealityLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _relianceRealityLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _relianceRealityLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _relianceRealityLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the reliance reality to the database. Also notifies the appropriate model listeners.
	*
	* @param relianceReality the reliance reality
	* @return the reliance reality that was added
	*/
	@Override
	public com.reliance.reality.model.RelianceReality addRelianceReality(
		com.reliance.reality.model.RelianceReality relianceReality) {
		return _relianceRealityLocalService.addRelianceReality(relianceReality);
	}

	/**
	* Creates a new reliance reality with the primary key. Does not add the reliance reality to the database.
	*
	* @param r_Id the primary key for the new reliance reality
	* @return the new reliance reality
	*/
	@Override
	public com.reliance.reality.model.RelianceReality createRelianceReality(
		long r_Id) {
		return _relianceRealityLocalService.createRelianceReality(r_Id);
	}

	/**
	* Deletes the reliance reality from the database. Also notifies the appropriate model listeners.
	*
	* @param relianceReality the reliance reality
	* @return the reliance reality that was removed
	*/
	@Override
	public com.reliance.reality.model.RelianceReality deleteRelianceReality(
		com.reliance.reality.model.RelianceReality relianceReality) {
		return _relianceRealityLocalService.deleteRelianceReality(relianceReality);
	}

	/**
	* Deletes the reliance reality with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality that was removed
	* @throws PortalException if a reliance reality with the primary key could not be found
	*/
	@Override
	public com.reliance.reality.model.RelianceReality deleteRelianceReality(
		long r_Id) throws com.liferay.portal.kernel.exception.PortalException {
		return _relianceRealityLocalService.deleteRelianceReality(r_Id);
	}

	@Override
	public com.reliance.reality.model.RelianceReality fetchRelianceReality(
		long r_Id) {
		return _relianceRealityLocalService.fetchRelianceReality(r_Id);
	}

	/**
	* Returns the reliance reality with the primary key.
	*
	* @param r_Id the primary key of the reliance reality
	* @return the reliance reality
	* @throws PortalException if a reliance reality with the primary key could not be found
	*/
	@Override
	public com.reliance.reality.model.RelianceReality getRelianceReality(
		long r_Id) throws com.liferay.portal.kernel.exception.PortalException {
		return _relianceRealityLocalService.getRelianceReality(r_Id);
	}

	/**
	* Updates the reliance reality in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param relianceReality the reliance reality
	* @return the reliance reality that was updated
	*/
	@Override
	public com.reliance.reality.model.RelianceReality updateRelianceReality(
		com.reliance.reality.model.RelianceReality relianceReality) {
		return _relianceRealityLocalService.updateRelianceReality(relianceReality);
	}

	/**
	* Returns the number of reliance realities.
	*
	* @return the number of reliance realities
	*/
	@Override
	public int getRelianceRealitiesCount() {
		return _relianceRealityLocalService.getRelianceRealitiesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _relianceRealityLocalService.getOSGiServiceIdentifier();
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
		return _relianceRealityLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _relianceRealityLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _relianceRealityLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.reliance.reality.model.RelianceReality> getExistRecord(
		java.lang.String empCode, java.lang.String propertyId) {
		return _relianceRealityLocalService.getExistRecord(empCode, propertyId);
	}

	/**
	* Returns a range of all the reliance realities.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reliance realities
	* @param end the upper bound of the range of reliance realities (not inclusive)
	* @return the range of reliance realities
	*/
	@Override
	public java.util.List<com.reliance.reality.model.RelianceReality> getRelianceRealities(
		int start, int end) {
		return _relianceRealityLocalService.getRelianceRealities(start, end);
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
		return _relianceRealityLocalService.dynamicQueryCount(dynamicQuery);
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
		return _relianceRealityLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public void saveRelianceRealityForm(
		com.reliance.reality.model.RelianceReality relianceReality) {
		_relianceRealityLocalService.saveRelianceRealityForm(relianceReality);
	}

	@Override
	public RelianceRealityLocalService getWrappedService() {
		return _relianceRealityLocalService;
	}

	@Override
	public void setWrappedService(
		RelianceRealityLocalService relianceRealityLocalService) {
		_relianceRealityLocalService = relianceRealityLocalService;
	}

	private RelianceRealityLocalService _relianceRealityLocalService;
}