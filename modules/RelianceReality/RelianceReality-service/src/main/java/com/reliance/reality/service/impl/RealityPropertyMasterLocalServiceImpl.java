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

package com.reliance.reality.service.impl;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.reliance.reality.model.RealityPropertyMaster;
import com.reliance.reality.service.RealityPropertyMasterLocalServiceUtil;
import com.reliance.reality.service.base.RealityPropertyMasterLocalServiceBaseImpl;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the reality property master local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.reliance.reality.service.RealityPropertyMasterLocalService}
 * interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMasterLocalServiceBaseImpl
 * @see com.reliance.reality.service.RealityPropertyMasterLocalServiceUtil
 */
@ProviderType
public class RealityPropertyMasterLocalServiceImpl extends RealityPropertyMasterLocalServiceBaseImpl {
	private final Log log = LogFactoryUtil.getLog(RealityPropertyMasterLocalServiceImpl.class);

	public Set<String> getCity() {
		Set<String> city = new TreeSet<String>();
		List<RealityPropertyMaster> masters = RealityPropertyMasterLocalServiceUtil.getRealityPropertyMasters(-1, -1);
		if ((Validator.isNotNull(masters)) && (!masters.isEmpty())) {
			for (RealityPropertyMaster master : masters) {
				city.add(master.getCity());
			}
		}
		System.out.println("city" + city);
		return city;
	}

	public List<RealityPropertyMaster> getPropertyRecord(String city) {
		return realityPropertyMasterFinder.getPropertyRecord(city);
	}
	
	public List<RealityPropertyMaster> getProperty(String location) {
		return realityPropertyMasterFinder.getProperty(location);
	}

}