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
 * The extended model interface for the ShareHolders service. Represents a row in the &quot;SHARE_HOLDERS&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersModel
 * @see rinfra.share.holders.doc.model.impl.ShareHoldersImpl
 * @see rinfra.share.holders.doc.model.impl.ShareHoldersModelImpl
 * @generated
 */
@ImplementationClassName("rinfra.share.holders.doc.model.impl.ShareHoldersImpl")
@ProviderType
public interface ShareHolders extends ShareHoldersModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link rinfra.share.holders.doc.model.impl.ShareHoldersImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<ShareHolders, String> FOLIO_NO_ACCESSOR = new Accessor<ShareHolders, String>() {
			@Override
			public String get(ShareHolders shareHolders) {
				return shareHolders.getFOLIO_NO();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<ShareHolders> getTypeClass() {
				return ShareHolders.class;
			}
		};
}