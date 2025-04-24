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
 * The extended model interface for the RpowerShareHolders service. Represents a row in the &quot;RPOWER_SHARE_HOLDERS&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersModel
 * @see com.newrpower.share.doc.model.impl.RpowerShareHoldersImpl
 * @see com.newrpower.share.doc.model.impl.RpowerShareHoldersModelImpl
 * @generated
 */
@ImplementationClassName("com.newrpower.share.doc.model.impl.RpowerShareHoldersImpl")
@ProviderType
public interface RpowerShareHolders extends RpowerShareHoldersModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RpowerShareHolders, String> FOLIO_NO_ACCESSOR = new Accessor<RpowerShareHolders, String>() {
			@Override
			public String get(RpowerShareHolders rpowerShareHolders) {
				return rpowerShareHolders.getFOLIO_NO();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<RpowerShareHolders> getTypeClass() {
				return RpowerShareHolders.class;
			}
		};
}