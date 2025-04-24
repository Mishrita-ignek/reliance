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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.rinfra.annual.exception.NoSuchAnnualReportException;
import com.rinfra.annual.model.AnnualReport;

/**
 * The persistence interface for the annual report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MukeshPatidar
 * @see com.rinfra.annual.service.persistence.impl.AnnualReportPersistenceImpl
 * @see AnnualReportUtil
 * @generated
 */
@ProviderType
public interface AnnualReportPersistence extends BasePersistence<AnnualReport> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link AnnualReportUtil} to access the annual report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the annual reports where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @return the matching annual reports
	*/
	public java.util.List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS);

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
	public java.util.List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS, int start, int end);

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
	public java.util.List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator);

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
	public java.util.List<AnnualReport> findByFINANCIAL_YEARS(
		java.lang.String FINANCIAL_YEARS, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annual report
	* @throws NoSuchAnnualReportException if a matching annual report could not be found
	*/
	public AnnualReport findByFINANCIAL_YEARS_First(
		java.lang.String FINANCIAL_YEARS,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator)
		throws NoSuchAnnualReportException;

	/**
	* Returns the first annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching annual report, or <code>null</code> if a matching annual report could not be found
	*/
	public AnnualReport fetchByFINANCIAL_YEARS_First(
		java.lang.String FINANCIAL_YEARS,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator);

	/**
	* Returns the last annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annual report
	* @throws NoSuchAnnualReportException if a matching annual report could not be found
	*/
	public AnnualReport findByFINANCIAL_YEARS_Last(
		java.lang.String FINANCIAL_YEARS,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator)
		throws NoSuchAnnualReportException;

	/**
	* Returns the last annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching annual report, or <code>null</code> if a matching annual report could not be found
	*/
	public AnnualReport fetchByFINANCIAL_YEARS_Last(
		java.lang.String FINANCIAL_YEARS,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator);

	/**
	* Returns the annual reports before and after the current annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	*
	* @param SRNO the primary key of the current annual report
	* @param FINANCIAL_YEARS the financial_years
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next annual report
	* @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	*/
	public AnnualReport[] findByFINANCIAL_YEARS_PrevAndNext(long SRNO,
		java.lang.String FINANCIAL_YEARS,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator)
		throws NoSuchAnnualReportException;

	/**
	* Removes all the annual reports where FINANCIAL_YEARS = &#63; from the database.
	*
	* @param FINANCIAL_YEARS the financial_years
	*/
	public void removeByFINANCIAL_YEARS(java.lang.String FINANCIAL_YEARS);

	/**
	* Returns the number of annual reports where FINANCIAL_YEARS = &#63;.
	*
	* @param FINANCIAL_YEARS the financial_years
	* @return the number of matching annual reports
	*/
	public int countByFINANCIAL_YEARS(java.lang.String FINANCIAL_YEARS);

	/**
	* Caches the annual report in the entity cache if it is enabled.
	*
	* @param annualReport the annual report
	*/
	public void cacheResult(AnnualReport annualReport);

	/**
	* Caches the annual reports in the entity cache if it is enabled.
	*
	* @param annualReports the annual reports
	*/
	public void cacheResult(java.util.List<AnnualReport> annualReports);

	/**
	* Creates a new annual report with the primary key. Does not add the annual report to the database.
	*
	* @param SRNO the primary key for the new annual report
	* @return the new annual report
	*/
	public AnnualReport create(long SRNO);

	/**
	* Removes the annual report with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report that was removed
	* @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	*/
	public AnnualReport remove(long SRNO) throws NoSuchAnnualReportException;

	public AnnualReport updateImpl(AnnualReport annualReport);

	/**
	* Returns the annual report with the primary key or throws a {@link NoSuchAnnualReportException} if it could not be found.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report
	* @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	*/
	public AnnualReport findByPrimaryKey(long SRNO)
		throws NoSuchAnnualReportException;

	/**
	* Returns the annual report with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the annual report
	* @return the annual report, or <code>null</code> if a annual report with the primary key could not be found
	*/
	public AnnualReport fetchByPrimaryKey(long SRNO);

	@Override
	public java.util.Map<java.io.Serializable, AnnualReport> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the annual reports.
	*
	* @return the annual reports
	*/
	public java.util.List<AnnualReport> findAll();

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
	public java.util.List<AnnualReport> findAll(int start, int end);

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
	public java.util.List<AnnualReport> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator);

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
	public java.util.List<AnnualReport> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<AnnualReport> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the annual reports from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of annual reports.
	*
	* @return the number of annual reports
	*/
	public int countAll();
}