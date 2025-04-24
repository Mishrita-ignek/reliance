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

package com.rinfra.unpaidunclaimedshares.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend;
import com.rinfra.unpaidunclaimedshares.service.persistence.unpaidUnclaimedDevidendPersistence;

/**
 * @author Mukesh Patidar
 * @generated
 */
public class unpaidUnclaimedDevidendFinderBaseImpl extends BasePersistenceImpl<unpaidUnclaimedDevidend> {
	public unpaidUnclaimedDevidendFinderBaseImpl() {
		setModelClass(unpaidUnclaimedDevidend.class);
	}

	/**
	 * Returns the unpaid unclaimed devidend persistence.
	 *
	 * @return the unpaid unclaimed devidend persistence
	 */
	public unpaidUnclaimedDevidendPersistence getunpaidUnclaimedDevidendPersistence() {
		return unpaidUnclaimedDevidendPersistence;
	}

	/**
	 * Sets the unpaid unclaimed devidend persistence.
	 *
	 * @param unpaidUnclaimedDevidendPersistence the unpaid unclaimed devidend persistence
	 */
	public void setunpaidUnclaimedDevidendPersistence(
		unpaidUnclaimedDevidendPersistence unpaidUnclaimedDevidendPersistence) {
		this.unpaidUnclaimedDevidendPersistence = unpaidUnclaimedDevidendPersistence;
	}

	@BeanReference(type = unpaidUnclaimedDevidendPersistence.class)
	protected unpaidUnclaimedDevidendPersistence unpaidUnclaimedDevidendPersistence;
}