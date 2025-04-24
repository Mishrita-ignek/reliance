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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for UnpaidUnclaimedDevidendHolders. This utility wraps
 * {@link com.unpaid.unclaimed.dividend.holders.service.impl.UnpaidUnclaimedDevidendHoldersLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendHoldersLocalService
 * @see com.unpaid.unclaimed.dividend.holders.service.base.UnpaidUnclaimedDevidendHoldersLocalServiceBaseImpl
 * @see com.unpaid.unclaimed.dividend.holders.service.impl.UnpaidUnclaimedDevidendHoldersLocalServiceImpl
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendHoldersLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.unpaid.unclaimed.dividend.holders.service.impl.UnpaidUnclaimedDevidendHoldersLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the unpaid unclaimed devidend holders to the database. Also notifies the appropriate model listeners.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was added
	*/
	public static com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders addUnpaidUnclaimedDevidendHolders(
		com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return getService()
				   .addUnpaidUnclaimedDevidendHolders(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Creates a new unpaid unclaimed devidend holders with the primary key. Does not add the unpaid unclaimed devidend holders to the database.
	*
	* @param SRNO the primary key for the new unpaid unclaimed devidend holders
	* @return the new unpaid unclaimed devidend holders
	*/
	public static com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders createUnpaidUnclaimedDevidendHolders(
		long SRNO) {
		return getService().createUnpaidUnclaimedDevidendHolders(SRNO);
	}

	/**
	* Deletes the unpaid unclaimed devidend holders from the database. Also notifies the appropriate model listeners.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was removed
	*/
	public static com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders deleteUnpaidUnclaimedDevidendHolders(
		com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return getService()
				   .deleteUnpaidUnclaimedDevidendHolders(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Deletes the unpaid unclaimed devidend holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was removed
	* @throws PortalException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public static com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders deleteUnpaidUnclaimedDevidendHolders(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteUnpaidUnclaimedDevidendHolders(SRNO);
	}

	public static com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders fetchUnpaidUnclaimedDevidendHolders(
		long SRNO) {
		return getService().fetchUnpaidUnclaimedDevidendHolders(SRNO);
	}

	/**
	* Returns the unpaid unclaimed devidend holders with the primary key.
	*
	* @param SRNO the primary key of the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders
	* @throws PortalException if a unpaid unclaimed devidend holders with the primary key could not be found
	*/
	public static com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders getUnpaidUnclaimedDevidendHolders(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getUnpaidUnclaimedDevidendHolders(SRNO);
	}

	/**
	* Updates the unpaid unclaimed devidend holders in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	* @return the unpaid unclaimed devidend holders that was updated
	*/
	public static com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders updateUnpaidUnclaimedDevidendHolders(
		com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		return getService()
				   .updateUnpaidUnclaimedDevidendHolders(unpaidUnclaimedDevidendHolders);
	}

	/**
	* Returns the number of unpaid unclaimed devidend holderses.
	*
	* @return the number of unpaid unclaimed devidend holderses
	*/
	public static int getUnpaidUnclaimedDevidendHoldersesCount() {
		return getService().getUnpaidUnclaimedDevidendHoldersesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders> getUnpaidUnclaimedDevidendData(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return getService().getUnpaidUnclaimedDevidendData(FOLIO_NO_OF_ITIES);
	}

	public static java.util.List<com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders> getUnpaidUnclaimedDevidendHolderData(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return getService()
				   .getUnpaidUnclaimedDevidendHolderData(FOLIO_NO_OF_ITIES);
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
	public static java.util.List<com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders> getUnpaidUnclaimedDevidendHolderses(
		int start, int end) {
		return getService().getUnpaidUnclaimedDevidendHolderses(start, end);
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

	public static UnpaidUnclaimedDevidendHoldersLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<UnpaidUnclaimedDevidendHoldersLocalService, UnpaidUnclaimedDevidendHoldersLocalService> _serviceTracker =
		ServiceTrackerFactory.open(UnpaidUnclaimedDevidendHoldersLocalService.class);
}