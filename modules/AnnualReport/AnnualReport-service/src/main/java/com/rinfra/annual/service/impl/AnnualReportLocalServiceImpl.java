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

package com.rinfra.annual.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.management.loading.PrivateClassLoader;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.rinfra.annual.model.AnnualReport;
import com.rinfra.annual.model.impl.AnnualReportImpl;
import com.rinfra.annual.service.AnnualReportLocalServiceUtil;
import com.rinfra.annual.service.base.AnnualReportLocalServiceBaseImpl;
import com.rinfra.annual.service.persistence.AnnualReportUtil;

/**
 * The implementation of the annual report local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rinfra.annual.service.AnnualReportLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Mukesh Patidar
 * @see AnnualReportLocalServiceBaseImpl
 * @see com.rinfra.annual.service.AnnualReportLocalServiceUtil
 */
@ProviderType
public class AnnualReportLocalServiceImpl
	extends AnnualReportLocalServiceBaseImpl {
	
	private static final Log log = LogFactoryUtil.getLog(AnnualReportLocalServiceImpl.class);
	
	public Set<String> getAnnualReport(){
		List<AnnualReport> annualReports=AnnualReportLocalServiceUtil.getAnnualReports(-1, -1);
		
		TreeSet<String> annualYearSet=new TreeSet();
		TreeSet<String> reverseYearSet=new TreeSet();
		
	if(Validator.isNotNull(annualYearSet)&& !(annualReports.isEmpty())){
		for (AnnualReport years: annualReports) {
			annualYearSet.add(years.getFINANCIAL_YEARS());
		}
		System.out.println(annualYearSet);
	}
		reverseYearSet = (TreeSet<String>) annualYearSet.descendingSet();
		return reverseYearSet;
		
	}

	public List<AnnualReport> getAnnualReport(String year){
		log.info("year"+year);
		List<AnnualReport> annualReports=AnnualReportLocalServiceUtil.findByFINANCIAL_YEARS(year);
		log.info("annualReports :: service"+annualReports);
		List<AnnualReport> reportList=new ArrayList();
		AnnualReport report = new AnnualReportImpl();
		for (AnnualReport years : annualReports) {
			report.setFINANCIAL_YEARS(years.getFINANCIAL_YEARS());
			report.setFINANCIALDATA(years.getFINANCIALDATA());
			report.setFINANCIAL_DATALINK(years.getFINANCIAL_DATALINK());
			reportList.add(report);
		}
		return reportList;
	}
	
	public  List<AnnualReport> findByFINANCIAL_YEARS(
			java.lang.String FINANCIAL_YEARS) {
			return AnnualReportUtil.findByFINANCIAL_YEARS(FINANCIAL_YEARS);
		}
	
}









