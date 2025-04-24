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

package OCCModuleNew.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for OccMessageNew. This utility wraps
 * {@link OCCModuleNew.service.impl.OccMessageNewLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Mukesh Patidar
 * @see OccMessageNewLocalService
 * @see OCCModuleNew.service.base.OccMessageNewLocalServiceBaseImpl
 * @see OCCModuleNew.service.impl.OccMessageNewLocalServiceImpl
 * @generated
 */
@ProviderType
public class OccMessageNewLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link OCCModuleNew.service.impl.OccMessageNewLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the occ message new to the database. Also notifies the appropriate model listeners.
	*
	* @param occMessageNew the occ message new
	* @return the occ message new that was added
	*/
	public static OCCModuleNew.model.OccMessageNew addOccMessageNew(
		OCCModuleNew.model.OccMessageNew occMessageNew) {
		return getService().addOccMessageNew(occMessageNew);
	}

	/**
	* Creates a new occ message new with the primary key. Does not add the occ message new to the database.
	*
	* @param MSG_ID the primary key for the new occ message new
	* @return the new occ message new
	*/
	public static OCCModuleNew.model.OccMessageNew createOccMessageNew(
		long MSG_ID) {
		return getService().createOccMessageNew(MSG_ID);
	}

	/**
	* Deletes the occ message new from the database. Also notifies the appropriate model listeners.
	*
	* @param occMessageNew the occ message new
	* @return the occ message new that was removed
	*/
	public static OCCModuleNew.model.OccMessageNew deleteOccMessageNew(
		OCCModuleNew.model.OccMessageNew occMessageNew) {
		return getService().deleteOccMessageNew(occMessageNew);
	}

	/**
	* Deletes the occ message new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new that was removed
	* @throws PortalException if a occ message new with the primary key could not be found
	*/
	public static OCCModuleNew.model.OccMessageNew deleteOccMessageNew(
		long MSG_ID) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteOccMessageNew(MSG_ID);
	}

	public static OCCModuleNew.model.OccMessageNew fetchOccMessageNew(
		long MSG_ID) {
		return getService().fetchOccMessageNew(MSG_ID);
	}

	/**
	* Returns the occ message new with the primary key.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new
	* @throws PortalException if a occ message new with the primary key could not be found
	*/
	public static OCCModuleNew.model.OccMessageNew getOccMessageNew(long MSG_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getOccMessageNew(MSG_ID);
	}

	/**
	* Updates the occ message new in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param occMessageNew the occ message new
	* @return the occ message new that was updated
	*/
	public static OCCModuleNew.model.OccMessageNew updateOccMessageNew(
		OCCModuleNew.model.OccMessageNew occMessageNew) {
		return getService().updateOccMessageNew(occMessageNew);
	}

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
	* Returns the number of occ message news.
	*
	* @return the number of occ message news
	*/
	public static int getOccMessageNewsCount() {
		return getService().getOccMessageNewsCount();
	}

	public static int saveMsg(java.lang.String msg, java.lang.String listName,
		java.lang.String severity) {
		return getService().saveMsg(msg, listName, severity);
	}

	public static java.lang.String getDate() {
		return getService().getDate();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<OCCModuleNew.model.OccMessageNew> getMsgList(
		java.lang.String listName) {
		return getService().getMsgList(listName);
	}

	public static java.util.List<OCCModuleNew.model.OccMessageNew> getMsgsAlert() {
		return getService().getMsgsAlert();
	}

	/**
	* Returns a range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @return the range of occ message news
	*/
	public static java.util.List<OCCModuleNew.model.OccMessageNew> getOccMessageNews(
		int start, int end) {
		return getService().getOccMessageNews(start, end);
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

	public static OccMessageNewLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OccMessageNewLocalService, OccMessageNewLocalService> _serviceTracker =
		ServiceTrackerFactory.open(OccMessageNewLocalService.class);
}