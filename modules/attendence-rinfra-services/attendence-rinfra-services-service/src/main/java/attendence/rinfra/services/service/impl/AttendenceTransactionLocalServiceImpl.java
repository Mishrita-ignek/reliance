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

package attendence.rinfra.services.service.impl;

import java.util.List;

import attendence.rinfra.services.model.AttendenceTransaction;
import attendence.rinfra.services.service.base.AttendenceTransactionLocalServiceBaseImpl;

/**
 * The implementation of the attendence transaction local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link attendence.rinfra.services.service.AttendenceTransactionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttendenceTransactionLocalServiceBaseImpl
 * @see attendence.rinfra.services.service.AttendenceTransactionLocalServiceUtil
 */
public class AttendenceTransactionLocalServiceImpl
	extends AttendenceTransactionLocalServiceBaseImpl {
	
	public List<AttendenceTransaction> getEmp(String code) {
		return attendenceTransactionFinder.getEmp(code);
	}
	
	public List<AttendenceTransaction> getAttendenceTrann(String date) {
		return attendenceTransactionFinder.getAttendenceTrann(date);
	}
	
	public List<AttendenceTransaction> getAttendenceTrann(String code, String date) {
		return attendenceTransactionFinder.getAttendenceTrann(code, date);
	}
}