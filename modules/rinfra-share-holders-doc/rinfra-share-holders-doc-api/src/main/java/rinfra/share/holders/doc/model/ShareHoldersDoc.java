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

package rinfra.share.holders.doc.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the ShareHoldersDoc service. Represents a row in the &quot;SHARE_HOLDERS_DOC&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersDocModel
 * @see rinfra.share.holders.doc.model.impl.ShareHoldersDocImpl
 * @see rinfra.share.holders.doc.model.impl.ShareHoldersDocModelImpl
 * @generated
 */
@ImplementationClassName("rinfra.share.holders.doc.model.impl.ShareHoldersDocImpl")
@ProviderType
public interface ShareHoldersDoc extends ShareHoldersDocModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link rinfra.share.holders.doc.model.impl.ShareHoldersDocImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ShareHoldersDoc, Long> PRESS_ID_ACCESSOR = new Accessor<ShareHoldersDoc, Long>() {
			@Override
			public Long get(ShareHoldersDoc shareHoldersDoc) {
				return shareHoldersDoc.getPressId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<ShareHoldersDoc> getTypeClass() {
				return ShareHoldersDoc.class;
			}
		};
}