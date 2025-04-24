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

package rpower.shareholders.doc.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import rpower.shareholders.doc.model.RpowerShareHoldersDoc;
import rpower.shareholders.doc.service.persistence.RpowerShareHoldersDocPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class RpowerShareHoldersDocFinderBaseImpl extends BasePersistenceImpl<RpowerShareHoldersDoc> {
	public RpowerShareHoldersDocFinderBaseImpl() {
		setModelClass(RpowerShareHoldersDoc.class);
	}

	/**
	 * Returns the rpower share holders doc persistence.
	 *
	 * @return the rpower share holders doc persistence
	 */
	public RpowerShareHoldersDocPersistence getRpowerShareHoldersDocPersistence() {
		return rpowerShareHoldersDocPersistence;
	}

	/**
	 * Sets the rpower share holders doc persistence.
	 *
	 * @param rpowerShareHoldersDocPersistence the rpower share holders doc persistence
	 */
	public void setRpowerShareHoldersDocPersistence(
		RpowerShareHoldersDocPersistence rpowerShareHoldersDocPersistence) {
		this.rpowerShareHoldersDocPersistence = rpowerShareHoldersDocPersistence;
	}

	@BeanReference(type = RpowerShareHoldersDocPersistence.class)
	protected RpowerShareHoldersDocPersistence rpowerShareHoldersDocPersistence;
}