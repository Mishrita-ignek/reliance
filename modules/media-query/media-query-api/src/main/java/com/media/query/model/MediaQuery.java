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

package com.media.query.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the MediaQuery service. Represents a row in the &quot;MEDIA_QUERY&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see MediaQueryModel
 * @see com.media.query.model.impl.MediaQueryImpl
 * @see com.media.query.model.impl.MediaQueryModelImpl
 * @generated
 */
@ImplementationClassName("com.media.query.model.impl.MediaQueryImpl")
@ProviderType
public interface MediaQuery extends MediaQueryModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.media.query.model.impl.MediaQueryImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<MediaQuery, Long> SR_NO_ACCESSOR = new Accessor<MediaQuery, Long>() {
			@Override
			public Long get(MediaQuery mediaQuery) {
				return mediaQuery.getSrNo();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<MediaQuery> getTypeClass() {
				return MediaQuery.class;
			}
		};
}