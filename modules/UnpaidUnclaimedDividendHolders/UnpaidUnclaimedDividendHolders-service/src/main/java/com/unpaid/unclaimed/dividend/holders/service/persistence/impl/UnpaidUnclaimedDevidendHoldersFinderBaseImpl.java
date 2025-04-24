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

package com.unpaid.unclaimed.dividend.holders.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders;
import com.unpaid.unclaimed.dividend.holders.service.persistence.UnpaidUnclaimedDevidendHoldersPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class UnpaidUnclaimedDevidendHoldersFinderBaseImpl
	extends BasePersistenceImpl<UnpaidUnclaimedDevidendHolders> {
	public UnpaidUnclaimedDevidendHoldersFinderBaseImpl() {
		setModelClass(UnpaidUnclaimedDevidendHolders.class);
	}

	/**
	 * Returns the unpaid unclaimed devidend holders persistence.
	 *
	 * @return the unpaid unclaimed devidend holders persistence
	 */
	public UnpaidUnclaimedDevidendHoldersPersistence getUnpaidUnclaimedDevidendHoldersPersistence() {
		return unpaidUnclaimedDevidendHoldersPersistence;
	}

	/**
	 * Sets the unpaid unclaimed devidend holders persistence.
	 *
	 * @param unpaidUnclaimedDevidendHoldersPersistence the unpaid unclaimed devidend holders persistence
	 */
	public void setUnpaidUnclaimedDevidendHoldersPersistence(
		UnpaidUnclaimedDevidendHoldersPersistence unpaidUnclaimedDevidendHoldersPersistence) {
		this.unpaidUnclaimedDevidendHoldersPersistence = unpaidUnclaimedDevidendHoldersPersistence;
	}

	@BeanReference(type = UnpaidUnclaimedDevidendHoldersPersistence.class)
	protected UnpaidUnclaimedDevidendHoldersPersistence unpaidUnclaimedDevidendHoldersPersistence;
}