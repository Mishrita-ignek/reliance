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

package com.relieanceada.rinfra.portal.pressRelease.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the PressRelease service. Represents a row in the &quot;PRESS_RELEASE_PressRelease&quot; database table, with each column mapped to a property of this class.
 *
 * @author Vipin Singh
 * @see PressReleaseModel
 * @see com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl
 * @see com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseModelImpl
 * @generated
 */
@ImplementationClassName("com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl")
@ProviderType
public interface PressRelease extends PressReleaseModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<PressRelease, Long> PRESS_ID_ACCESSOR = new Accessor<PressRelease, Long>() {
			@Override
			public Long get(PressRelease pressRelease) {
				return pressRelease.getPressId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<PressRelease> getTypeClass() {
				return PressRelease.class;
			}
		};
}