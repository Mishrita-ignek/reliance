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

package com.news.media.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the NewsAndMedia service. Represents a row in the &quot;mumbai_metro_news_media&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndMediaModel
 * @see com.news.media.model.impl.NewsAndMediaImpl
 * @see com.news.media.model.impl.NewsAndMediaModelImpl
 * @generated
 */
@ImplementationClassName("com.news.media.model.impl.NewsAndMediaImpl")
@ProviderType
public interface NewsAndMedia extends NewsAndMediaModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.news.media.model.impl.NewsAndMediaImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<NewsAndMedia, Long> SRNO_ACCESSOR = new Accessor<NewsAndMedia, Long>() {
			@Override
			public Long get(NewsAndMedia newsAndMedia) {
				return newsAndMedia.getSRNO();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<NewsAndMedia> getTypeClass() {
				return NewsAndMedia.class;
			}
		};
}