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
 * The extended model interface for the RelianceReality service. Represents a row in the &quot;RELIANCE_REALITY&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see RelianceRealityModel
 * @see com.reliance.reality.model.impl.RelianceRealityImpl
 * @see com.reliance.reality.model.impl.RelianceRealityModelImpl
 * @generated
 */
@ImplementationClassName("com.reliance.reality.model.impl.RelianceRealityImpl")
@ProviderType
public interface RelianceReality extends RelianceRealityModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.reliance.reality.model.impl.RelianceRealityImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RelianceReality, Long> R__ID_ACCESSOR = new Accessor<RelianceReality, Long>() {
			@Override
			public Long get(RelianceReality relianceReality) {
				return relianceReality.getR_Id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RelianceReality> getTypeClass() {
				return RelianceReality.class;
			}
		};
}