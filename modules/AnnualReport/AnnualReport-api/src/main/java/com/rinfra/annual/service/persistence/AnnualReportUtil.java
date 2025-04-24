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

package com.rinfra.annual.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rinfra.annual.model.AnnualReport;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the annual report service. This utility wraps {@link com.rinfra.annual.service.persistence.impl.AnnualReportPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MukeshPatidar
 * @see AnnualReportPersistence
 * @see com.rinfra.annual.service.persistence.impl.AnnualReportPersistenceImpl
 * @generated
 */
@ProviderType
public class AnnualReportUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(AnnualReport annualReport) {
		getPersistence().clearCache(annualReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<AnnualReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<AnnualReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<AnnualReport> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<AnnualReport> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static AnnualReport update(AnnualReport annualReport) {
		return getPersistence().update(annualReport);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static AnnualReport update(AnnualReport annualReport,
		ServiceContext serviceContext) {
		return getPersistence().update(annualReport, serviceContext);
	}

	/**
	* Returns all the annual reports where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @return the matching annual reports
	*/
	public static List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS) {
		return getPersistence().findByFINANCIAL_YEARS(FINANCIAL_YEARS);
	}

	/**
	* Returns a range of all the annual reports where FINANCIAL_YEARS = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param start the lower bound of the range of annual reports
	* @param end the upper bound of the range of annual reports (not inclusive)
	* @return the range of matching annual reports
	*/
	public static List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS, int start, int end) {
		return getPersistence()
				   .findByFINANCIAL_YEARS(FINANCIAL_YEARS, start, end);
	}

	/**
	* Returns an ordered range of all the annual reports where FINANCIAL_YEARS = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param start the lower bound of the range of annual reports
	* @param end the upper bound of the range of annual reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching annual reports
	*/
	public static List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS, int start, int end,
		OrderByComparator<AnnualReport> orderByComparator) {
		return getPersistence()
				   .findByFINANCIAL_YEARS(FINANCIAL_YEARS, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the annual reports where FINANCIAL_YEARS = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param start the lower bound of the range of annual reports
	* @param end the upper bound of the range of annual reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching annual reports
	*/
	public static List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS, int start, int end,
		OrderByComparator<AnnualReport> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByFINANCIAL_YEARS(FINANCIAL_YEARS, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annual report
	* @throws NoSuchAnnualReportException if a matching annual report could not be found
	*/
	public static AnnualReport findByFINANCIAL_YEARS_First(
		java.lang.String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator)
		throws com.rinfra.annual.exception.NoSuchAnnualReportException {
		return getPersistence()
				   .findByFINANCIAL_YEARS_First(FINANCIAL_YEARS,
			orderByComparator);
	}

	/**
	* Returns the first annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annual report, or <code>null</code> if a matching annual report could not be found
	*/
	public static AnnualReport fetchByFINANCIAL_YEARS_First(
		java.lang.String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator) {
		return getPersistence()
				   .fetchByFINANCIAL_YEARS_First(FINANCIAL_YEARS,
			orderByComparator);
	}

	/**
	* Returns the last annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annual report
	* @throws NoSuchAnnualReportException if a matching annual report could not be found
	*/
	public static AnnualReport findByFINANCIAL_YEARS_Last(
		java.lang.String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator)
		throws com.rinfra.annual.exception.NoSuchAnnualReportException {
		return getPersistence()
				   .findByFINANCIAL_YEARS_Last(FINANCIAL_YEARS,
			orderByComparator);
	}

	/**
	* Returns the last annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annual report, or <code>null</code> if a matching annual report could not be found
	*/
	public static AnnualReport fetchByFINANCIAL_YEARS_Last(
		java.lang.String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator) {
		return getPersistence()
				   .fetchByFINANCIAL_YEARS_Last(FINANCIAL_YEARS,
			orderByComparator);
	}

	/**
	* Returns the annual reports before and after the current annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param SRNO the primary key of the current annual report
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next annual report
	* @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	*/
	public static AnnualReport[] findByFINANCIAL_YEARS_PrevAndNext(long SRNO,
		java.lang.String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator)
		throws com.rinfra.annual.exception.NoSuchAnnualReportException {
		return getPersistence()
				   .findByFINANCIAL_YEARS_PrevAndNext(SRNO, FINANCIAL_YEARS,
			orderByComparator);
	}

	/**
	* Removes all the annual reports where FINANCIAL_YEARS = &#63; from the database.
	*
	* @param FINANCIAL_YEARS the financial_years
	*/
	public static void removeByFINANCIAL_YEARS(java.lang.String FINANCIAL_YEARS) {
		getPersistence().removeByFINANCIAL_YEARS(FINANCIAL_YEARS);
	}

	/**
	* Returns the number of annual reports where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @return the number of matching annual reports
	*/
	public static int countByFINANCIAL_YEARS(java.lang.String FINANCIAL_YEARS) {
		return getPersistence().countByFINANCIAL_YEARS(FINANCIAL_YEARS);
	}

	/**
	* Caches the annual report in the entity cache if it is enabled.
	*
	* @param annualReport the annual report
	*/
	public static void cacheResult(AnnualReport annualReport) {
		getPersistence().cacheResult(annualReport);
	}

	/**
	* Caches the annual reports in the entity cache if it is enabled.
	*
	* @param annualReports the annual reports
	*/
	public static void cacheResult(List<AnnualReport> annualReports) {
		getPersistence().cacheResult(annualReports);
	}

	/**
	* Creates a new annual report with the primary key. Does not add the annual report to the database.
	*
	* @param SRNO the primary key for the new annual report
	* @return the new annual report
	*/
	public static AnnualReport create(long SRNO) {
		return getPersistence().create(SRNO);
	}

	/**
	* Removes the annual report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report that was removed
	* @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	*/
	public static AnnualReport remove(long SRNO)
		throws com.rinfra.annual.exception.NoSuchAnnualReportException {
		return getPersistence().remove(SRNO);
	}

	public static AnnualReport updateImpl(AnnualReport annualReport) {
		return getPersistence().updateImpl(annualReport);
	}

	/**
	* Returns the annual report with the primary key or throws a {@link NoSuchAnnualReportException} if it could not be found.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report
	* @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	*/
	public static AnnualReport findByPrimaryKey(long SRNO)
		throws com.rinfra.annual.exception.NoSuchAnnualReportException {
		return getPersistence().findByPrimaryKey(SRNO);
	}

	/**
	* Returns the annual report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report, or <code>null</code> if a annual report with the primary key could not be found
	*/
	public static AnnualReport fetchByPrimaryKey(long SRNO) {
		return getPersistence().fetchByPrimaryKey(SRNO);
	}

	public static java.util.Map<java.io.Serializable, AnnualReport> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the annual reports.
	*
	* @return the annual reports
	*/
	public static List<AnnualReport> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the annual reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annual reports
	* @param end the upper bound of the range of annual reports (not inclusive)
	* @return the range of annual reports
	*/
	public static List<AnnualReport> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the annual reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annual reports
	* @param end the upper bound of the range of annual reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of annual reports
	*/
	public static List<AnnualReport> findAll(int start, int end,
		OrderByComparator<AnnualReport> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the annual reports.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of annual reports
	* @param end the upper bound of the range of annual reports (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of annual reports
	*/
	public static List<AnnualReport> findAll(int start, int end,
		OrderByComparator<AnnualReport> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the annual reports from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of annual reports.
	*
	* @return the number of annual reports
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static AnnualReportPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<AnnualReportPersistence, AnnualReportPersistence> _serviceTracker =
		ServiceTrackerFactory.open(AnnualReportPersistence.class);
}