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

package com.rinfra.unpaidunclaimedshares.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for unpaidUnclaimedDevidend. This utility wraps
 * {@link com.rinfra.unpaidunclaimedshares.service.impl.unpaidUnclaimedDevidendServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Mukesh Patidar
 * @see unpaidUnclaimedDevidendService
 * @see com.rinfra.unpaidunclaimedshares.service.base.unpaidUnclaimedDevidendServiceBaseImpl
 * @see com.rinfra.unpaidunclaimedshares.service.impl.unpaidUnclaimedDevidendServiceImpl
 * @generated
 */
@ProviderType
public class unpaidUnclaimedDevidendServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rinfra.unpaidunclaimedshares.service.impl.unpaidUnclaimedDevidendServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static unpaidUnclaimedDevidendService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<unpaidUnclaimedDevidendService, unpaidUnclaimedDevidendService> _serviceTracker =
		ServiceTrackerFactory.open(unpaidUnclaimedDevidendService.class);
}