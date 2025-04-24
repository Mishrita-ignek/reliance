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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for RpowerUnpaidUnclaimedDevidend. This utility wraps
 * {@link com.rpower.unpaid.unclaimed.dividend.service.impl.RpowerUnpaidUnclaimedDevidendLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerUnpaidUnclaimedDevidendLocalService
 * @see com.rpower.unpaid.unclaimed.dividend.service.base.RpowerUnpaidUnclaimedDevidendLocalServiceBaseImpl
 * @see com.rpower.unpaid.unclaimed.dividend.service.impl.RpowerUnpaidUnclaimedDevidendLocalServiceImpl
 * @generated
 */
@ProviderType
public class RpowerUnpaidUnclaimedDevidendLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rpower.unpaid.unclaimed.dividend.service.impl.RpowerUnpaidUnclaimedDevidendLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the rpower unpaid unclaimed devidend to the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was added
	*/
	public static com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend addRpowerUnpaidUnclaimedDevidend(
		com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return getService()
				   .addRpowerUnpaidUnclaimedDevidend(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Creates a new rpower unpaid unclaimed devidend with the primary key. Does not add the rpower unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new rpower unpaid unclaimed devidend
	* @return the new rpower unpaid unclaimed devidend
	*/
	public static com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend createRpowerUnpaidUnclaimedDevidend(
		long SRNO) {
		return getService().createRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	/**
	* Deletes the rpower unpaid unclaimed devidend from the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	*/
	public static com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend deleteRpowerUnpaidUnclaimedDevidend(
		com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return getService()
				   .deleteRpowerUnpaidUnclaimedDevidend(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Deletes the rpower unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	* @throws PortalException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public static com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend deleteRpowerUnpaidUnclaimedDevidend(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	public static com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend fetchRpowerUnpaidUnclaimedDevidend(
		long SRNO) {
		return getService().fetchRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	/**
	* Returns the rpower unpaid unclaimed devidend with the primary key.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend
	* @throws PortalException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	public static com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend getRpowerUnpaidUnclaimedDevidend(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRpowerUnpaidUnclaimedDevidend(SRNO);
	}

	/**
	* Updates the rpower unpaid unclaimed devidend in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was updated
	*/
	public static com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend updateRpowerUnpaidUnclaimedDevidend(
		com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		return getService()
				   .updateRpowerUnpaidUnclaimedDevidend(rpowerUnpaidUnclaimedDevidend);
	}

	/**
	* Returns the number of rpower unpaid unclaimed devidends.
	*
	* @return the number of rpower unpaid unclaimed devidends
	*/
	public static int getRpowerUnpaidUnclaimedDevidendsCount() {
		return getService().getRpowerUnpaidUnclaimedDevidendsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	public static java.util.List<com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend> getRpowerUnpaidUnclaimedDevidends(
		int start, int end) {
		return getService().getRpowerUnpaidUnclaimedDevidends(start, end);
	}

	public static java.util.List<com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendData(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return getService().getUnpaidUnclaimedDevidendData(FOLIO_NO_OF_ITIES);
	}

	public static java.util.List<com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendNew(
		java.lang.String FOLIO_NO_OF_ITIES) {
		return getService().getUnpaidUnclaimedDevidendNew(FOLIO_NO_OF_ITIES);
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

	public static RpowerUnpaidUnclaimedDevidendLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RpowerUnpaidUnclaimedDevidendLocalService, RpowerUnpaidUnclaimedDevidendLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RpowerUnpaidUnclaimedDevidendLocalService.class);
}