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

package com.news.media.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.List;

import com.news.media.model.NewsAndMedia;
import com.news.media.service.base.NewsAndMediaLocalServiceBaseImpl;

/**
 * The implementation of the news and media local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.news.media.service.NewsAndMediaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndMediaLocalServiceBaseImpl
 * @see com.news.media.service.NewsAndMediaLocalServiceUtil
 */
@ProviderType
public class NewsAndMediaLocalServiceImpl extends NewsAndMediaLocalServiceBaseImpl {

	public List<NewsAndMedia> getPublicationList(String monthYear) {

		return newsAndMediaFinder.getPublicationList(monthYear);

	}
	
/*	public List<NewsAndMedia> getAllNewsList(String monthYear){
		
		return newsAndMediaFinder.getAllNewsList(monthYear);
		
	}*/

	public List<NewsAndMedia> getNewsList(String monthYear, String publication) {

		return newsAndMediaFinder.getNewsList(monthYear, publication);
	}

}