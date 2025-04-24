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

import attendence.rinfra.services.exception.NoSuchEmpMasterException;
import attendence.rinfra.services.model.EmpMaster;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the emp master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see attendence.rinfra.services.service.persistence.impl.EmpMasterPersistenceImpl
 * @see EmpMasterUtil
 * @generated
 */
@ProviderType
public interface EmpMasterPersistence extends BasePersistence<EmpMaster> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpMasterUtil} to access the emp master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the emp master in the entity cache if it is enabled.
	*
	* @param empMaster the emp master
	*/
	public void cacheResult(EmpMaster empMaster);

	/**
	* Caches the emp masters in the entity cache if it is enabled.
	*
	* @param empMasters the emp masters
	*/
	public void cacheResult(java.util.List<EmpMaster> empMasters);

	/**
	* Creates a new emp master with the primary key. Does not add the emp master to the database.
	*
	* @param employeeCode the primary key for the new emp master
	* @return the new emp master
	*/
	public EmpMaster create(java.lang.String employeeCode);

	/**
	* Removes the emp master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master that was removed
	* @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	*/
	public EmpMaster remove(java.lang.String employeeCode)
		throws NoSuchEmpMasterException;

	public EmpMaster updateImpl(EmpMaster empMaster);

	/**
	* Returns the emp master with the primary key or throws a {@link NoSuchEmpMasterException} if it could not be found.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master
	* @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	*/
	public EmpMaster findByPrimaryKey(java.lang.String employeeCode)
		throws NoSuchEmpMasterException;

	/**
	* Returns the emp master with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master, or <code>null</code> if a emp master with the primary key could not be found
	*/
	public EmpMaster fetchByPrimaryKey(java.lang.String employeeCode);

	@Override
	public java.util.Map<java.io.Serializable, EmpMaster> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the emp masters.
	*
	* @return the emp masters
	*/
	public java.util.List<EmpMaster> findAll();

	/**
	* Returns a range of all the emp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp masters
	* @param end the upper bound of the range of emp masters (not inclusive)
	* @return the range of emp masters
	*/
	public java.util.List<EmpMaster> findAll(int start, int end);

	/**
	* Returns an ordered range of all the emp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp masters
	* @param end the upper bound of the range of emp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emp masters
	*/
	public java.util.List<EmpMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpMaster> orderByComparator);

	/**
	* Returns an ordered range of all the emp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp masters
	* @param end the upper bound of the range of emp masters (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of emp masters
	*/
	public java.util.List<EmpMaster> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<EmpMaster> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the emp masters from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of emp masters.
	*
	* @return the number of emp masters
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}