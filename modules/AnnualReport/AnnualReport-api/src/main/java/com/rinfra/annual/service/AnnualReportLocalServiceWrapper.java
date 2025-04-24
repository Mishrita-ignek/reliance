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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AnnualReportLocalService}.
 *
 * @author MukeshPatidar
 * @see AnnualReportLocalService
 * @generated
 */
@ProviderType
public class AnnualReportLocalServiceWrapper implements AnnualReportLocalService,
	ServiceWrapper<AnnualReportLocalService> {
	public AnnualReportLocalServiceWrapper(
		AnnualReportLocalService annualReportLocalService) {
		_annualReportLocalService = annualReportLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _annualReportLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _annualReportLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _annualReportLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualReportLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualReportLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the annual report to the database. Also notifies the appropriate model listeners.
	*
	* @param annualReport the annual report
	* @return the annual report that was added
	*/
	@Override
	public com.rinfra.annual.model.AnnualReport addAnnualReport(
		com.rinfra.annual.model.AnnualReport annualReport) {
		return _annualReportLocalService.addAnnualReport(annualReport);
	}

	/**
	* Creates a new annual report with the primary key. Does not add the annual report to the database.
	*
	* @param SRNO the primary key for the new annual report
	* @return the new annual report
	*/
	@Override
	public com.rinfra.annual.model.AnnualReport createAnnualReport(long SRNO) {
		return _annualReportLocalService.createAnnualReport(SRNO);
	}

	/**
	* Deletes the annual report from the database. Also notifies the appropriate model listeners.
	*
	* @param annualReport the annual report
	* @return the annual report that was removed
	*/
	@Override
	public com.rinfra.annual.model.AnnualReport deleteAnnualReport(
		com.rinfra.annual.model.AnnualReport annualReport) {
		return _annualReportLocalService.deleteAnnualReport(annualReport);
	}

	/**
	* Deletes the annual report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report that was removed
	* @throws PortalException if a annual report with the primary key could not be found
	*/
	@Override
	public com.rinfra.annual.model.AnnualReport deleteAnnualReport(long SRNO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualReportLocalService.deleteAnnualReport(SRNO);
	}

	@Override
	public com.rinfra.annual.model.AnnualReport fetchAnnualReport(long SRNO) {
		return _annualReportLocalService.fetchAnnualReport(SRNO);
	}

	/**
	* Returns the annual report with the primary key.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report
	* @throws PortalException if a annual report with the primary key could not be found
	*/
	@Override
	public com.rinfra.annual.model.AnnualReport getAnnualReport(long SRNO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _annualReportLocalService.getAnnualReport(SRNO);
	}

	/**
	* Updates the annual report in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param annualReport the annual report
	* @return the annual report that was updated
	*/
	@Override
	public com.rinfra.annual.model.AnnualReport updateAnnualReport(
		com.rinfra.annual.model.AnnualReport annualReport) {
		return _annualReportLocalService.updateAnnualReport(annualReport);
	}

	/**
	* Returns the number of annual reports.
	*
	* @return the number of annual reports
	*/
	@Override
	public int getAnnualReportsCount() {
		return _annualReportLocalService.getAnnualReportsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _annualReportLocalService.getOSGiServiceIdentifier();
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
		return _annualReportLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _annualReportLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _annualReportLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<com.rinfra.annual.model.AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS) {
		return _annualReportLocalService.findByFINANCIAL_YEARS(FINANCIAL_YEARS);
	}

	@Override
	public java.util.List<com.rinfra.annual.model.AnnualReport> getAnnualReport(
		java.lang.String year) {
		return _annualReportLocalService.getAnnualReport(year);
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
	@Override
	public java.util.List<com.rinfra.annual.model.AnnualReport> getAnnualReports(
		int start, int end) {
		return _annualReportLocalService.getAnnualReports(start, end);
	}

	@Override
	public java.util.Set<java.lang.String> getAnnualReport() {
		return _annualReportLocalService.getAnnualReport();
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
		return _annualReportLocalService.dynamicQueryCount(dynamicQuery);
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
		return _annualReportLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public AnnualReportLocalService getWrappedService() {
		return _annualReportLocalService;
	}

	@Override
	public void setWrappedService(
		AnnualReportLocalService annualReportLocalService) {
		_annualReportLocalService = annualReportLocalService;
	}

	private AnnualReportLocalService _annualReportLocalService;
}