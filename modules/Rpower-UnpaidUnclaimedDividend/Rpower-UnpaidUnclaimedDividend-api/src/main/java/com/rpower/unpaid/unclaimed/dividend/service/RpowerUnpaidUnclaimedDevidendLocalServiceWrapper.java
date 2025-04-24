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

package com.rpower.unpaid.unclaimed.dividend.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RpowerUnpaidUnclaimedDevidendLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerUnpaidUnclaimedDevidendLocalService
 * @generated
 */
@ProviderType
public class RpowerUnpaidUnclaimedDevidendLocalServiceWrapper
	implements RpowerUnpaidUnclaimedDevidendLocalService,
		ServiceWrapper<RpowerUnpaidUnclaimedDevidendLocalService> {
	public RpowerUnpaidUnclaimedDevidendLocalServiceWrapper(
		RpowerUnpaidUnclaimedDevidendLocalService rpowerUnpaidUnclaimedDevidendLocalService) {
		_rpowerUnpaidUnclaimedDevidendLocalService = rpowerUnpaidUnclaimedDevidendLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpowerUnpaidUnclaimedDevidendLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerUnpaidUnclaimedDevidendLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the rpower unpaid unclaimed devidend to the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was added
	*/
	@Override
	public com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend addRpowerUnpaidUnclaimedDevidend(
		com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.addRpowerUnpaidUnclaimedDevidend(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Creates a new rpower unpaid unclaimed devidend with the primary key. Does not add the rpower unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new rpower unpaid unclaimed devidend
	* @return the new rpower unpaid unclaimed devidend
	*/
	@Override
	public com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend createRpowerUnpaidUnclaimedDevidend(
		long SRNO) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.createRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	/**
	* Deletes the rpower unpaid unclaimed devidend from the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	*/
	@Override
	public com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend deleteRpowerUnpaidUnclaimedDevidend(
		com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.deleteRpowerUnpaidUnclaimedDevidend(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Deletes the rpower unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	* @throws PortalException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	@Override
	public com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend deleteRpowerUnpaidUnclaimedDevidend(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerUnpaidUnclaimedDevidendLocalService.deleteRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	@Override
	public com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend fetchRpowerUnpaidUnclaimedDevidend(
		long SRNO) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.fetchRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	/**
	* Returns the rpower unpaid unclaimed devidend with the primary key.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend
	* @throws PortalException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	@Override
	public com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend getRpowerUnpaidUnclaimedDevidend(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	/**
	* Updates the rpower unpaid unclaimed devidend in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was updated
	*/
	@Override
	public com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend updateRpowerUnpaidUnclaimedDevidend(
		com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.updateRpowerUnpaidUnclaimedDevidend(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Returns the number of rpower unpaid unclaimed devidends.
	*
	* @return the number of rpower unpaid unclaimed devidends
	*/
	@Override
	public int getRpowerUnpaidUnclaimedDevidendsCount() {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getRpowerUnpaidUnclaimedDevidendsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getOSGiServiceIdentifier();
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
		return _rpowerUnpaidUnclaimedDevidendLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rpowerUnpaidUnclaimedDevidendLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rpowerUnpaidUnclaimedDevidendLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns a range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @return the range of rpower unpaid unclaimed devidends
	*/
	@Override
	public java.util.List<com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend> getRpowerUnpaidUnclaimedDevidends(
		int start, int end) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getRpowerUnpaidUnclaimedDevidends(start,
			end);
	}

	@Override
	public java.util.List<com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendData(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getUnpaidUnclaimedDevidendData(FOLIO_NO_OF_ITIES);
	}

	@Override
	public java.util.List<com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendNew(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return _rpowerUnpaidUnclaimedDevidendLocalService.getUnpaidUnclaimedDevidendNew(FOLIO_NO_OF_ITIES);
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
		return _rpowerUnpaidUnclaimedDevidendLocalService.dynamicQueryCount(dynamicQuery);
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
		return _rpowerUnpaidUnclaimedDevidendLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public RpowerUnpaidUnclaimedDevidendLocalService getWrappedService() {
		return _rpowerUnpaidUnclaimedDevidendLocalService;
	}

	@Override
	public void setWrappedService(
		RpowerUnpaidUnclaimedDevidendLocalService rpowerUnpaidUnclaimedDevidendLocalService) {
		_rpowerUnpaidUnclaimedDevidendLocalService = rpowerUnpaidUnclaimedDevidendLocalService;
	}

	private RpowerUnpaidUnclaimedDevidendLocalService _rpowerUnpaidUnclaimedDevidendLocalService;
}