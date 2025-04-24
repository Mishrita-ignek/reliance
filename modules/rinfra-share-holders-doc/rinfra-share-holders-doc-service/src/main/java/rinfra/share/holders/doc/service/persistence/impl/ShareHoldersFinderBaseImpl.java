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

package rinfra.share.holders.doc.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import rinfra.share.holders.doc.model.ShareHolders;
import rinfra.share.holders.doc.service.persistence.ShareHoldersPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ShareHoldersFinderBaseImpl extends BasePersistenceImpl<ShareHolders> {
	public ShareHoldersFinderBaseImpl() {
		setModelClass(ShareHolders.class);
	}

	/**
	 * Returns the share holders persistence.
	 *
	 * @return the share holders persistence
	 */
	public ShareHoldersPersistence getShareHoldersPersistence() {
		return shareHoldersPersistence;
	}

	/**
	 * Sets the share holders persistence.
	 *
	 * @param shareHoldersPersistence the share holders persistence
	 */
	public void setShareHoldersPersistence(
		ShareHoldersPersistence shareHoldersPersistence) {
		this.shareHoldersPersistence = shareHoldersPersistence;
	}

	@BeanReference(type = ShareHoldersPersistence.class)
	protected ShareHoldersPersistence shareHoldersPersistence;
}