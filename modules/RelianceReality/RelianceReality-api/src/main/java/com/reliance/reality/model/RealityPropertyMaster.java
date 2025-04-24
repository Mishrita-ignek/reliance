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

package com.reliance.reality.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the RealityPropertyMaster service. Represents a row in the &quot;REALITY_PROPERTY_MSTR&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMasterModel
 * @see com.reliance.reality.model.impl.RealityPropertyMasterImpl
 * @see com.reliance.reality.model.impl.RealityPropertyMasterModelImpl
 * @generated
 */
@ImplementationClassName("com.reliance.reality.model.impl.RealityPropertyMasterImpl")
@ProviderType
public interface RealityPropertyMaster extends RealityPropertyMasterModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.reliance.reality.model.impl.RealityPropertyMasterImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RealityPropertyMaster, Long> PROPERTY_ID_ACCESSOR =
		new Accessor<RealityPropertyMaster, Long>() {
			@Override
			public Long get(RealityPropertyMaster realityPropertyMaster) {
				return realityPropertyMaster.getProperty_ID();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RealityPropertyMaster> getTypeClass() {
				return RealityPropertyMaster.class;
			}
		};
}