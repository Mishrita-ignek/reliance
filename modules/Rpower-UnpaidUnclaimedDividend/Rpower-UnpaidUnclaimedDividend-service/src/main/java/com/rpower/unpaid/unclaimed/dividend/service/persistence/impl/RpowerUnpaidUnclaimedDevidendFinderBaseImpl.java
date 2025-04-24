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

package com.rpower.unpaid.unclaimed.dividend.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend;
import com.rpower.unpaid.unclaimed.dividend.service.persistence.RpowerUnpaidUnclaimedDevidendPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RpowerUnpaidUnclaimedDevidendFinderBaseImpl
	extends BasePersistenceImpl<RpowerUnpaidUnclaimedDevidend> {
	public RpowerUnpaidUnclaimedDevidendFinderBaseImpl() {
		setModelClass(RpowerUnpaidUnclaimedDevidend.class);
	}

	/**
	 * Returns the rpower unpaid unclaimed devidend persistence.
	 *
	 * @return the rpower unpaid unclaimed devidend persistence
	 */
	public RpowerUnpaidUnclaimedDevidendPersistence getRpowerUnpaidUnclaimedDevidendPersistence() {
		return rpowerUnpaidUnclaimedDevidendPersistence;
	}

	/**
	 * Sets the rpower unpaid unclaimed devidend persistence.
	 *
	 * @param rpowerUnpaidUnclaimedDevidendPersistence the rpower unpaid unclaimed devidend persistence
	 */
	public void setRpowerUnpaidUnclaimedDevidendPersistence(
		RpowerUnpaidUnclaimedDevidendPersistence rpowerUnpaidUnclaimedDevidendPersistence) {
		this.rpowerUnpaidUnclaimedDevidendPersistence = rpowerUnpaidUnclaimedDevidendPersistence;
	}

	@BeanReference(type = RpowerUnpaidUnclaimedDevidendPersistence.class)
	protected RpowerUnpaidUnclaimedDevidendPersistence rpowerUnpaidUnclaimedDevidendPersistence;
}