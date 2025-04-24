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

package com.newrpower.share.doc.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for RpowerShareHolders. This utility wraps
 * {@link com.newrpower.share.doc.service.impl.RpowerShareHoldersLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersLocalService
 * @see com.newrpower.share.doc.service.base.RpowerShareHoldersLocalServiceBaseImpl
 * @see com.newrpower.share.doc.service.impl.RpowerShareHoldersLocalServiceImpl
 * @generated
 */
@ProviderType
public class RpowerShareHoldersLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.newrpower.share.doc.service.impl.RpowerShareHoldersLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
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
	* Adds the rpower share holders to the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHolders the rpower share holders
	* @return the rpower share holders that was added
	*/
	public static com.newrpower.share.doc.model.RpowerShareHolders addRpowerShareHolders(
		com.newrpower.share.doc.model.RpowerShareHolders rpowerShareHolders) {
		return getService().addRpowerShareHolders(rpowerShareHolders);
	}

	/**
	* Creates a new rpower share holders with the primary key. Does not add the rpower share holders to the database.
	*
	* @param FOLIO_NO the primary key for the new rpower share holders
	* @return the new rpower share holders
	*/
	public static com.newrpower.share.doc.model.RpowerShareHolders createRpowerShareHolders(
		java.lang.String FOLIO_NO) {
		return getService().createRpowerShareHolders(FOLIO_NO);
	}

	/**
	* Deletes the rpower share holders from the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHolders the rpower share holders
	* @return the rpower share holders that was removed
	*/
	public static com.newrpower.share.doc.model.RpowerShareHolders deleteRpowerShareHolders(
		com.newrpower.share.doc.model.RpowerShareHolders rpowerShareHolders) {
		return getService().deleteRpowerShareHolders(rpowerShareHolders);
	}

	/**
	* Deletes the rpower share holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders that was removed
	* @throws PortalException if a rpower share holders with the primary key could not be found
	*/
	public static com.newrpower.share.doc.model.RpowerShareHolders deleteRpowerShareHolders(
		java.lang.String FOLIO_NO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteRpowerShareHolders(FOLIO_NO);
	}

	public static com.newrpower.share.doc.model.RpowerShareHolders fetchRpowerShareHolders(
		java.lang.String FOLIO_NO) {
		return getService().fetchRpowerShareHolders(FOLIO_NO);
	}

	/**
	* Returns the rpower share holders with the primary key.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders
	* @throws PortalException if a rpower share holders with the primary key could not be found
	*/
	public static com.newrpower.share.doc.model.RpowerShareHolders getRpowerShareHolders(
		java.lang.String FOLIO_NO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getRpowerShareHolders(FOLIO_NO);
	}

	/**
	* Updates the rpower share holders in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHolders the rpower share holders
	* @return the rpower share holders that was updated
	*/
	public static com.newrpower.share.doc.model.RpowerShareHolders updateRpowerShareHolders(
		com.newrpower.share.doc.model.RpowerShareHolders rpowerShareHolders) {
		return getService().updateRpowerShareHolders(rpowerShareHolders);
	}

	/**
	* Returns the number of rpower share holderses.
	*
	* @return the number of rpower share holderses
	*/
	public static int getRpowerShareHoldersesCount() {
		return getService().getRpowerShareHoldersesCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the rpower share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holderses
	* @param end the upper bound of the range of rpower share holderses (not inclusive)
	* @return the range of rpower share holderses
	*/
	public static java.util.List<com.newrpower.share.doc.model.RpowerShareHolders> getRpowerShareHolderses(
		int start, int end) {
		return getService().getRpowerShareHolderses(start, end);
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

	public static RpowerShareHoldersLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RpowerShareHoldersLocalService, RpowerShareHoldersLocalService> _serviceTracker =
		ServiceTrackerFactory.open(RpowerShareHoldersLocalService.class);
}