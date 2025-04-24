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

package com.newrpower.share.doc.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the RpowerShareHoldersDoc service. Represents a row in the &quot;RPOWER_SHARE_HOLDERS_DOC&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersDocModel
 * @see com.newrpower.share.doc.model.impl.RpowerShareHoldersDocImpl
 * @see com.newrpower.share.doc.model.impl.RpowerShareHoldersDocModelImpl
 * @generated
 */
@ImplementationClassName("com.newrpower.share.doc.model.impl.RpowerShareHoldersDocImpl")
@ProviderType
public interface RpowerShareHoldersDoc extends RpowerShareHoldersDocModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersDocImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RpowerShareHoldersDoc, Long> PRESS_ID_ACCESSOR = new Accessor<RpowerShareHoldersDoc, Long>() {
			@Override
			public Long get(RpowerShareHoldersDoc rpowerShareHoldersDoc) {
				return rpowerShareHoldersDoc.getPressId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RpowerShareHoldersDoc> getTypeClass() {
				return RpowerShareHoldersDoc.class;
			}
		};
}