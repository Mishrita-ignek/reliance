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

package com.rinfra.annual.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for AnnualReport. This utility wraps
 * {@link com.rinfra.annual.service.impl.AnnualReportLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author MukeshPatidar
 * @see AnnualReportLocalService
 * @see com.rinfra.annual.service.base.AnnualReportLocalServiceBaseImpl
 * @see com.rinfra.annual.service.impl.AnnualReportLocalServiceImpl
 * @generated
 */
@ProviderType
public class AnnualReportLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rinfra.annual.service.impl.AnnualReportLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
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
	* Adds the annual report to the database. Also notifies the appropriate model listeners.
	*
	* @param annualReport the annual report
	* @return the annual report that was added
	*/
	public static com.rinfra.annual.model.AnnualReport addAnnualReport(
		com.rinfra.annual.model.AnnualReport annualReport) {
		return getService().addAnnualReport(annualReport);
	}

	/**
	* Creates a new annual report with the primary key. Does not add the annual report to the database.
	*
	* @param SRNO the primary key for the new annual report
	* @return the new annual report
	*/
	public static com.rinfra.annual.model.AnnualReport createAnnualReport(
		long SRNO) {
		return getService().createAnnualReport(SRNO);
	}

	/**
	* Deletes the annual report from the database. Also notifies the appropriate model listeners.
	*
	* @param annualReport the annual report
	* @return the annual report that was removed
	*/
	public static com.rinfra.annual.model.AnnualReport deleteAnnualReport(
		com.rinfra.annual.model.AnnualReport annualReport) {
		return getService().deleteAnnualReport(annualReport);
	}

	/**
	* Deletes the annual report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report that was removed
	* @throws PortalException if a annual report with the primary key could not be found
	*/
	public static com.rinfra.annual.model.AnnualReport deleteAnnualReport(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteAnnualReport(SRNO);
	}

	public static com.rinfra.annual.model.AnnualReport fetchAnnualReport(
		long SRNO) {
		return getService().fetchAnnualReport(SRNO);
	}

	/**
	* Returns the annual report with the primary key.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report
	* @throws PortalException if a annual report with the primary key could not be found
	*/
	public static com.rinfra.annual.model.AnnualReport getAnnualReport(
		long SRNO) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getAnnualReport(SRNO);
	}

	/**
	* Updates the annual report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param annualReport the annual report
	* @return the annual report that was updated
	*/
	public static com.rinfra.annual.model.AnnualReport updateAnnualReport(
		com.rinfra.annual.model.AnnualReport annualReport) {
		return getService().updateAnnualReport(annualReport);
	}

	/**
	* Returns the number of annual reports.
	*
	* @return the number of annual reports
	*/
	public static int getAnnualReportsCount() {
		return getService().getAnnualReportsCount();
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.annual.model.impl.AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.annual.model.impl.AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	public static java.util.List<com.rinfra.annual.model.AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS) {
		return getService().findByFINANCIAL_YEARS(FINANCIAL_YEARS);
	}

	public static java.util.List<com.rinfra.annual.model.AnnualReport> getAnnualReport(
		java.lang.String year) {
		return getService().getAnnualReport(year);
	}

	/**
	* Returns a range of all the annual reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rinfra.annual.model.impl.AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annual reports
	* @param end the upper bound of the range of annual reports (not inclusive)
	* @return the range of annual reports
	*/
	public static java.util.List<com.rinfra.annual.model.AnnualReport> getAnnualReports(
		int start, int end) {
		return getService().getAnnualReports(start, end);
	}

	public static java.util.Set<java.lang.String> getAnnualReport() {
		return getService().getAnnualReport();
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

	public static AnnualReportLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AnnualReportLocalService, AnnualReportLocalService> _serviceTracker =
		ServiceTrackerFactory.open(AnnualReportLocalService.class);
}