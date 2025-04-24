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

import com.rinfra.annual.service.base.AnnualReportServiceBaseImpl;

/**
 * The implementation of the annual report remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rinfra.annual.service.AnnualReportService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Mukesh Patidar
 * @see AnnualReportServiceBaseImpl
 * @see com.rinfra.annual.service.AnnualReportServiceUtil
 */
@ProviderType
public class AnnualReportServiceImpl extends AnnualReportServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.rinfra.annual.service.AnnualReportServiceUtil} to access the annual report remote service.
	 */
}