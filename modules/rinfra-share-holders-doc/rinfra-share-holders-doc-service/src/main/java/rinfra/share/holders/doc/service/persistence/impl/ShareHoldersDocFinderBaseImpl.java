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

import rinfra.share.holders.doc.model.ShareHoldersDoc;
import rinfra.share.holders.doc.service.persistence.ShareHoldersDocPersistence;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ShareHoldersDocFinderBaseImpl extends BasePersistenceImpl<ShareHoldersDoc> {
	public ShareHoldersDocFinderBaseImpl() {
		setModelClass(ShareHoldersDoc.class);
	}

	/**
	 * Returns the share holders doc persistence.
	 *
	 * @return the share holders doc persistence
	 */
	public ShareHoldersDocPersistence getShareHoldersDocPersistence() {
		return shareHoldersDocPersistence;
	}

	/**
	 * Sets the share holders doc persistence.
	 *
	 * @param shareHoldersDocPersistence the share holders doc persistence
	 */
	public void setShareHoldersDocPersistence(
		ShareHoldersDocPersistence shareHoldersDocPersistence) {
		this.shareHoldersDocPersistence = shareHoldersDocPersistence;
	}

	@BeanReference(type = ShareHoldersDocPersistence.class)
	protected ShareHoldersDocPersistence shareHoldersDocPersistence;
}