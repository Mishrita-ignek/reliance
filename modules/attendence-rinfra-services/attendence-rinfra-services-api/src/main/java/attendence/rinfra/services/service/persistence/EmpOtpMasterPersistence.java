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

package attendence.rinfra.services.service.persistence;

import aQute.bnd.annotation.ProviderType;

import attendence.rinfra.services.exception.NoSuchEmpOtpMasterException;
import attendence.rinfra.services.model.EmpOtpMaster;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the emp otp master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see attendence.rinfra.services.service.persistence.impl.EmpOtpMasterPersistenceImpl
 * @see EmpOtpMasterUtil
 * @generated
 */
@ProviderType
public interface EmpOtpMasterPersistence extends BasePersistence<EmpOtpMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpOtpMasterUtil} to access the emp otp master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the emp otp master in the entity cache if it is enabled.
	*
	* @param empOtpMaster the emp otp master
	*/
	public void cacheResult(EmpOtpMaster empOtpMaster);

	/**
	* Caches the emp otp masters in the entity cache if it is enabled.
	*
	* @param empOtpMasters the emp otp masters
	*/
	public void cacheResult(java.util.List<EmpOtpMaster> empOtpMasters);

	/**
	* Creates a new emp otp master with the primary key. Does not add the emp otp master to the database.
	*
	* @param empMobile the primary key for the new emp otp master
	* @return the new emp otp master
	*/
	public EmpOtpMaster create(java.lang.String empMobile);

	/**
	* Removes the emp otp master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master that was removed
	* @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	*/
	public EmpOtpMaster remove(java.lang.String empMobile)
		throws NoSuchEmpOtpMasterException;

	public EmpOtpMaster updateImpl(EmpOtpMaster empOtpMaster);

	/**
	* Returns the emp otp master with the primary key or throws a {@link NoSuchEmpOtpMasterException} if it could not be found.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master
	* @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	*/
	public EmpOtpMaster findByPrimaryKey(java.lang.String empMobile)
		throws NoSuchEmpOtpMasterException;

	/**
	* Returns the emp otp master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master, or <code>null</code> if a emp otp master with the primary key could not be found
	*/
	public EmpOtpMaster fetchByPrimaryKey(java.lang.String empMobile);

	@Override
	public java.util.Map<java.io.Serializable, EmpOtpMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the emp otp masters.
	*
	* @return the emp otp masters
	*/
	public java.util.List<EmpOtpMaster> findAll();

	/**
	* Returns a range of all the emp otp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp otp masters
	* @param end the upper bound of the range of emp otp masters (not inclusive)
	* @return the range of emp otp masters
	*/
	public java.util.List<EmpOtpMaster> findAll(int start, int end);

	/**
	* Returns an ordered range of all the emp otp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp otp masters
	* @param end the upper bound of the range of emp otp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emp otp masters
	*/
	public java.util.List<EmpOtpMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpOtpMaster> orderByComparator);

	/**
	* Returns an ordered range of all the emp otp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp otp masters
	* @param end the upper bound of the range of emp otp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of emp otp masters
	*/
	public java.util.List<EmpOtpMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpOtpMaster> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the emp otp masters from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of emp otp masters.
	*
	* @return the number of emp otp masters
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}