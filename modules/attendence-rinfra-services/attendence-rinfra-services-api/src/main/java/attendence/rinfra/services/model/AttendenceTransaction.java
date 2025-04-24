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

package attendence.rinfra.services.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the AttendenceTransaction service. Represents a row in the &quot;ATTENDENCE_TRANSACTION_TABLE&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see AttendenceTransactionModel
 * @see attendence.rinfra.services.model.impl.AttendenceTransactionImpl
 * @see attendence.rinfra.services.model.impl.AttendenceTransactionModelImpl
 * @generated
 */
@ImplementationClassName("attendence.rinfra.services.model.impl.AttendenceTransactionImpl")
@ProviderType
public interface AttendenceTransaction extends AttendenceTransactionModel,
	PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link attendence.rinfra.services.model.impl.AttendenceTransactionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<AttendenceTransaction, String> SR_NO_ACCESSOR = new Accessor<AttendenceTransaction, String>() {
			@Override
			public String get(AttendenceTransaction attendenceTransaction) {
				return attendenceTransaction.getSrNo();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<AttendenceTransaction> getTypeClass() {
				return AttendenceTransaction.class;
			}
		};
}