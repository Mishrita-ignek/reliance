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

package com.rinfra.annual.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AnnualReport service. Represents a row in the &quot;FINANCIAL_REPORT&quot; database table, with each column mapped to a property of this class.
 *
 * @author MukeshPatidar
 * @see AnnualReportModel
 * @see com.rinfra.annual.model.impl.AnnualReportImpl
 * @see com.rinfra.annual.model.impl.AnnualReportModelImpl
 * @generated
 */
@ImplementationClassName("com.rinfra.annual.model.impl.AnnualReportImpl")
@ProviderType
public interface AnnualReport extends AnnualReportModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.rinfra.annual.model.impl.AnnualReportImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AnnualReport, Long> SRNO_ACCESSOR = new Accessor<AnnualReport, Long>() {
			@Override
			public Long get(AnnualReport annualReport) {
				return annualReport.getSRNO();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<AnnualReport> getTypeClass() {
				return AnnualReport.class;
			}
		};
}