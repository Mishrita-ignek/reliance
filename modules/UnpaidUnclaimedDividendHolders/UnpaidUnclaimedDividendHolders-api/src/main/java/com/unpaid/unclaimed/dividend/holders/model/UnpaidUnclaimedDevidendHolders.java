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

package com.unpaid.unclaimed.dividend.holders.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the UnpaidUnclaimedDevidendHolders service. Represents a row in the &quot;UNPAID_DIVIDEND_FY_2018&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendHoldersModel
 * @see com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersImpl
 * @see com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersModelImpl
 * @generated
 */
@ImplementationClassName("com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersImpl")
@ProviderType
public interface UnpaidUnclaimedDevidendHolders
	extends UnpaidUnclaimedDevidendHoldersModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<UnpaidUnclaimedDevidendHolders, Long> SRNO_ACCESSOR =
		new Accessor<UnpaidUnclaimedDevidendHolders, Long>() {
			@Override
			public Long get(
				UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
				return unpaidUnclaimedDevidendHolders.getSRNO();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<UnpaidUnclaimedDevidendHolders> getTypeClass() {
				return UnpaidUnclaimedDevidendHolders.class;
			}
		};
}