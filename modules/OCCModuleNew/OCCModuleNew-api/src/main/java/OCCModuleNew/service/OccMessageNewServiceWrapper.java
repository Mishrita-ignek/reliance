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

package OCCModuleNew.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OccMessageNewService}.
 *
 * @author Mukesh Patidar
 * @see OccMessageNewService
 * @generated
 */
@ProviderType
public class OccMessageNewServiceWrapper implements OccMessageNewService,
	ServiceWrapper<OccMessageNewService> {
	public OccMessageNewServiceWrapper(
		OccMessageNewService occMessageNewService) {
		_occMessageNewService = occMessageNewService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _occMessageNewService.getOSGiServiceIdentifier();
	}

	@Override
	public OccMessageNewService getWrappedService() {
		return _occMessageNewService;
	}

	@Override
	public void setWrappedService(OccMessageNewService occMessageNewService) {
		_occMessageNewService = occMessageNewService;
	}

	private OccMessageNewService _occMessageNewService;
}