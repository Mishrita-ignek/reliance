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

package com.rinfra.unpaid.unclaimed.devidend.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UnpaidUnclaimedDevidendService}.
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendService
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendServiceWrapper
	implements UnpaidUnclaimedDevidendService,
		ServiceWrapper<UnpaidUnclaimedDevidendService> {
	public UnpaidUnclaimedDevidendServiceWrapper(
		UnpaidUnclaimedDevidendService unpaidUnclaimedDevidendService) {
		_unpaidUnclaimedDevidendService = unpaidUnclaimedDevidendService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _unpaidUnclaimedDevidendService.getOSGiServiceIdentifier();
	}

	@Override
	public UnpaidUnclaimedDevidendService getWrappedService() {
		return _unpaidUnclaimedDevidendService;
	}

	@Override
	public void setWrappedService(
		UnpaidUnclaimedDevidendService unpaidUnclaimedDevidendService) {
		_unpaidUnclaimedDevidendService = unpaidUnclaimedDevidendService;
	}

	private UnpaidUnclaimedDevidendService _unpaidUnclaimedDevidendService;
}