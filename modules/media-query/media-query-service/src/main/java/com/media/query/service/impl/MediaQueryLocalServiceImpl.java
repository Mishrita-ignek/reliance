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

package com.media.query.service.impl;

import com.media.query.model.MediaQuery;
import com.media.query.service.MediaQueryLocalServiceUtil;
import com.media.query.service.base.MediaQueryLocalServiceBaseImpl;

/**
 * The implementation of the media query local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.media.query.service.MediaQueryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MediaQueryLocalServiceBaseImpl
 * @see com.media.query.service.MediaQueryLocalServiceUtil
 */
public class MediaQueryLocalServiceImpl extends MediaQueryLocalServiceBaseImpl {
	
	public String saveMediaQuery(MediaQuery mediaQuery){
		String status = "ERROR";
		mediaQuery = MediaQueryLocalServiceUtil.updateMediaQuery(mediaQuery);
		if(mediaQuery!=null){
			status = "SUCCESS";
		}
		return status;
	}
}