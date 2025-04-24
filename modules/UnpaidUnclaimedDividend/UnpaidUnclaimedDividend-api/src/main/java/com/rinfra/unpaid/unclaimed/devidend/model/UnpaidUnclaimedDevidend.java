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

package com.rinfra.unpaid.unclaimed.devidend.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the UnpaidUnclaimedDevidend service. Represents a row in the &quot;UNPAID_DIVIDEND_FY_2018&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendModel
 * @see com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendImpl
 * @see com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendModelImpl
 * @generated
 */
@ImplementationClassName("com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendImpl")
@ProviderType
public interface UnpaidUnclaimedDevidend extends UnpaidUnclaimedDevidendModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<UnpaidUnclaimedDevidend, Long> SRNO_ACCESSOR = new Accessor<UnpaidUnclaimedDevidend, Long>() {
			@Override
			public Long get(UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
				return unpaidUnclaimedDevidend.getSRNO();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UnpaidUnclaimedDevidend> getTypeClass() {
				return UnpaidUnclaimedDevidend.class;
			}
		};
}