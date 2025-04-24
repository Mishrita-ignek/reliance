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

package rinfra.share.holders.doc.service.impl;

import java.util.ArrayList;
import java.util.List;

import rinfra.share.holders.doc.model.ShareHolders;
import rinfra.share.holders.doc.service.base.ShareHoldersLocalServiceBaseImpl;

/**
 * The implementation of the share holders local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link rinfra.share.holders.doc.service.ShareHoldersLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersLocalServiceBaseImpl
 * @see rinfra.share.holders.doc.service.ShareHoldersLocalServiceUtil
 */
public class ShareHoldersLocalServiceImpl
	extends ShareHoldersLocalServiceBaseImpl {
	public List<ShareHolders> getShareHolder(String no){
		return shareHoldersFinder.getShareHolders(no);
	}
}