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

package com.news.media.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import com.news.media.model.NewsAndMedia;
import com.news.media.service.persistence.NewsAndMediaPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class NewsAndMediaFinderBaseImpl extends BasePersistenceImpl<NewsAndMedia> {
	public NewsAndMediaFinderBaseImpl() {
		setModelClass(NewsAndMedia.class);
	}

	/**
	 * Returns the news and media persistence.
	 *
	 * @return the news and media persistence
	 */
	public NewsAndMediaPersistence getNewsAndMediaPersistence() {
		return newsAndMediaPersistence;
	}

	/**
	 * Sets the news and media persistence.
	 *
	 * @param newsAndMediaPersistence the news and media persistence
	 */
	public void setNewsAndMediaPersistence(
		NewsAndMediaPersistence newsAndMediaPersistence) {
		this.newsAndMediaPersistence = newsAndMediaPersistence;
	}

	@BeanReference(type = NewsAndMediaPersistence.class)
	protected NewsAndMediaPersistence newsAndMediaPersistence;
}