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

package com.rinfra.unpaidunclaimedshares.service.impl;

import java.util.List;

import com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend;
import com.rinfra.unpaidunclaimedshares.service.base.unpaidUnclaimedDevidendLocalServiceBaseImpl;
import com.rinfra.unpaidunclaimedshares.service.persistence.unpaidUnclaimedDevidendUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the unpaid unclaimed devidend local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.rinfra.unpaidunclaimedshares.service.unpaidUnclaimedDevidendLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Mukesh Patidar
 * @see unpaidUnclaimedDevidendLocalServiceBaseImpl
 * @see com.rinfra.unpaidunclaimedshares.service.unpaidUnclaimedDevidendLocalServiceUtil
 */
@ProviderType
public class unpaidUnclaimedDevidendLocalServiceImpl extends unpaidUnclaimedDevidendLocalServiceBaseImpl {

	public List<unpaidUnclaimedDevidend> getFolioDetails(String FOLIO_NO) {
		System.out.println("FOLIO_NO " + FOLIO_NO);
		return unpaidUnclaimedDevidendUtil.findByfolioNo(FOLIO_NO);
	}

	public List<unpaidUnclaimedDevidend> getFolioDetailsCustomSql(String FOLIO_NO) {
		System.out.println("FOLIO_NO " + FOLIO_NO);
		return this.unpaidUnclaimedDevidendFinder.getFolioDetailsList(FOLIO_NO);
	}

	public List<unpaidUnclaimedDevidend> findByfolioNo(String FOLIO_NO) {
		System.out.println("FOLIO_NO" + FOLIO_NO);
		return unpaidUnclaimedDevidendUtil.findByfolioNo(FOLIO_NO);
	}

}