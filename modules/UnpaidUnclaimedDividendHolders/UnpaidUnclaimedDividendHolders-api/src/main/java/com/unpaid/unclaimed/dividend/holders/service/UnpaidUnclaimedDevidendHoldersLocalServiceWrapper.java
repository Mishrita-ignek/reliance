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

package com.unpaid.unclaimed.dividend.holders.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UnpaidUnclaimedDevidendHoldersLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendHoldersLocalService
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendHoldersLocalServiceWrapper
	implements UnpaidUnclaimedDevidendHoldersLocalService,
		ServiceWrapper<UnpaidUnclaimedDevidendHoldersLocalService> {
	public UnpaidUnclaimedDevidendHoldersLocalServiceWrapper(
		UnpaidUnclaimedDevidendHoldersLocalService unpaidUnclaimedDevidendHoldersLocalService) {
		_unpaidUnclaimedDevidendHoldersLocalService = unpaidUnclaimedDevidendHoldersLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _unpaidUnclaimedDevidendHoldersLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _unpaidUnclaimedDevidendHoldersLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _unpaidUnclaimedDevidendHoldersLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _unpaidUnclaimedDevidendHoldersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _unpaidUnclaimedDevidendHoldersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the unpaid unclaimed devidend holders to the database. Also notifies the appropriate model listeners.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was added
	*/
	@Override
	public com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders addUnpaidUnclaimedDevidendHolders(
		com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return _unpaidUnclaimedDevidendHoldersLocalService.addUnpaidUnclaimedDevidendHolders(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Creates a new unpaid unclaimed devidend holders with the primary key. Does not add the unpaid unclaimed devidend holders to the database.
	*
	* @param SRNO the primary key for the new unpaid unclaimed devidend holders
	* @return the new unpaid unclaimed devidend holders
	*/
	@Override
	public com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders createUnpaidUnclaimedDevidendHolders(
		long SRNO) {
		return _unpaidUnclaimedDevidendHoldersLocalService.createUnpaidUnclaimedDevidendHolders(SRNO);
	}

	/**
	* Deletes the unpaid unclaimed devidend holders from the database. Also notifies the appropriate model listeners.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was removed
	*/
	@Override
	public com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders deleteUnpaidUnclaimedDevidendHolders(
		com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return _unpaidUnclaimedDevidendHoldersLocalService.deleteUnpaidUnclaimedDevidendHolders(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Deletes the unpaid unclaimed devidend holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was removed
	* @throws PortalException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	@Override
	public com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders deleteUnpaidUnclaimedDevidendHolders(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return _unpaidUnclaimedDevidendHoldersLocalService.deleteUnpaidUnclaimedDevidendHolders(SRNO);
	}

	@Override
	public com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders fetchUnpaidUnclaimedDevidendHolders(
		long SRNO) {
		return _unpaidUnclaimedDevidendHoldersLocalService.fetchUnpaidUnclaimedDevidendHolders(SRNO);
	}

	/**
	* Returns the unpaid unclaimed devidend holders with the primary key.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders
	* @throws PortalException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	@Override
	public com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders getUnpaidUnclaimedDevidendHolders(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return _unpaidUnclaimedDevidendHoldersLocalService.getUnpaidUnclaimedDevidendHolders(SRNO);
	}

	/**
	* Updates the unpaid unclaimed devidend holders in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was updated
	*/
	@Override
	public com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders updateUnpaidUnclaimedDevidendHolders(
		com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return _unpaidUnclaimedDevidendHoldersLocalService.updateUnpaidUnclaimedDevidendHolders(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Returns the number of unpaid unclaimed devidend holderses.
	*
	* @return the number of unpaid unclaimed devidend holderses
	*/
	@Override
	public int getUnpaidUnclaimedDevidendHoldersesCount() {
		return _unpaidUnclaimedDevidendHoldersLocalService.getUnpaidUnclaimedDevidendHoldersesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _unpaidUnclaimedDevidendHoldersLocalService.getOSGiServiceIdentifier();
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
		return _unpaidUnclaimedDevidendHoldersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _unpaidUnclaimedDevidendHoldersLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _unpaidUnclaimedDevidendHoldersLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders> getUnpaidUnclaimedDevidendData(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return _unpaidUnclaimedDevidendHoldersLocalService.getUnpaidUnclaimedDevidendData(FOLIO_NO_OF_ITIES);
	}

	@Override
	public java.util.List<com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders> getUnpaidUnclaimedDevidendHolderData(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return _unpaidUnclaimedDevidendHoldersLocalService.getUnpaidUnclaimedDevidendHolderData(FOLIO_NO_OF_ITIES);
	}

	/**
	* Returns a range of all the unpaid unclaimed devidend holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of unpaid unclaimed devidend holderses
	* @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	* @return the range of unpaid unclaimed devidend holderses
	*/
	@Override
	public java.util.List<com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders> getUnpaidUnclaimedDevidendHolderses(
		int start, int end) {
		return _unpaidUnclaimedDevidendHoldersLocalService.getUnpaidUnclaimedDevidendHolderses(start,
			end);
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
		return _unpaidUnclaimedDevidendHoldersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _unpaidUnclaimedDevidendHoldersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public UnpaidUnclaimedDevidendHoldersLocalService getWrappedService() {
		return _unpaidUnclaimedDevidendHoldersLocalService;
	}

	@Override
	public void setWrappedService(
		UnpaidUnclaimedDevidendHoldersLocalService unpaidUnclaimedDevidendHoldersLocalService) {
		_unpaidUnclaimedDevidendHoldersLocalService = unpaidUnclaimedDevidendHoldersLocalService;
	}

	private UnpaidUnclaimedDevidendHoldersLocalService _unpaidUnclaimedDevidendHoldersLocalService;
}