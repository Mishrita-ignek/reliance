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

package com.rinfra.unpaidunclaimedshares.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the unpaidUnclaimedDevidend service. Represents a row in the &quot;UNPAID_DIVIDEND_SHARE&quot; database table, with each column mapped to a property of this class.
 *
 * @author Mukesh Patidar
 * @see unpaidUnclaimedDevidendModel
 * @see com.rinfra.unpaidunclaimedshares.model.impl.unpaidUnclaimedDevidendImpl
 * @see com.rinfra.unpaidunclaimedshares.model.impl.unpaidUnclaimedDevidendModelImpl
 * @generated
 */
@ImplementationClassName("com.rinfra.unpaidunclaimedshares.model.impl.unpaidUnclaimedDevidendImpl")
@ProviderType
public interface unpaidUnclaimedDevidend extends unpaidUnclaimedDevidendModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.rinfra.unpaidunclaimedshares.model.impl.unpaidUnclaimedDevidendImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<unpaidUnclaimedDevidend, Long> SRNO_ACCESSOR = new Accessor<unpaidUnclaimedDevidend, Long>() {
			@Override
			public Long get(unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
				return unpaidUnclaimedDevidend.getSRNO();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<unpaidUnclaimedDevidend> getTypeClass() {
				return unpaidUnclaimedDevidend.class;
			}
		};
}