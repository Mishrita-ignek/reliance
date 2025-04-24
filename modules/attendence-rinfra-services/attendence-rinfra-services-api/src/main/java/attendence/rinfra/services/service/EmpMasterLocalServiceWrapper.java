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

package attendence.rinfra.services.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmpMasterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmpMasterLocalService
 * @generated
 */
@ProviderType
public class EmpMasterLocalServiceWrapper implements EmpMasterLocalService,
	ServiceWrapper<EmpMasterLocalService> {
	public EmpMasterLocalServiceWrapper(
		EmpMasterLocalService empMasterLocalService) {
		_empMasterLocalService = empMasterLocalService;
	}

	/**
	* Adds the emp master to the database. Also notifies the appropriate model listeners.
	*
	* @param empMaster the emp master
	* @return the emp master that was added
	*/
	@Override
	public attendence.rinfra.services.model.EmpMaster addEmpMaster(
		attendence.rinfra.services.model.EmpMaster empMaster) {
		return _empMasterLocalService.addEmpMaster(empMaster);
	}

	/**
	* Creates a new emp master with the primary key. Does not add the emp master to the database.
	*
	* @param employeeCode the primary key for the new emp master
	* @return the new emp master
	*/
	@Override
	public attendence.rinfra.services.model.EmpMaster createEmpMaster(
		java.lang.String employeeCode) {
		return _empMasterLocalService.createEmpMaster(employeeCode);
	}

	/**
	* Deletes the emp master from the database. Also notifies the appropriate model listeners.
	*
	* @param empMaster the emp master
	* @return the emp master that was removed
	*/
	@Override
	public attendence.rinfra.services.model.EmpMaster deleteEmpMaster(
		attendence.rinfra.services.model.EmpMaster empMaster) {
		return _empMasterLocalService.deleteEmpMaster(empMaster);
	}

	/**
	* Deletes the emp master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master that was removed
	* @throws PortalException if a emp master with the primary key could not be found
	*/
	@Override
	public attendence.rinfra.services.model.EmpMaster deleteEmpMaster(
		java.lang.String employeeCode)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empMasterLocalService.deleteEmpMaster(employeeCode);
	}

	@Override
	public attendence.rinfra.services.model.EmpMaster fetchEmpMaster(
		java.lang.String employeeCode) {
		return _empMasterLocalService.fetchEmpMaster(employeeCode);
	}

	/**
	* Returns the emp master with the primary key.
	*
	* @param employeeCode the primary key of the emp master
	* @return the emp master
	* @throws PortalException if a emp master with the primary key could not be found
	*/
	@Override
	public attendence.rinfra.services.model.EmpMaster getEmpMaster(
		java.lang.String employeeCode)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empMasterLocalService.getEmpMaster(employeeCode);
	}

	/**
	* Updates the emp master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empMaster the emp master
	* @return the emp master that was updated
	*/
	@Override
	public attendence.rinfra.services.model.EmpMaster updateEmpMaster(
		attendence.rinfra.services.model.EmpMaster empMaster) {
		return _empMasterLocalService.updateEmpMaster(empMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empMasterLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empMasterLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of emp masters.
	*
	* @return the number of emp masters
	*/
	@Override
	public int getEmpMastersCount() {
		return _empMasterLocalService.getEmpMastersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _empMasterLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _empMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _empMasterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _empMasterLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the emp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp masters
	* @param end the upper bound of the range of emp masters (not inclusive)
	* @return the range of emp masters
	*/
	@Override
	public java.util.List<attendence.rinfra.services.model.EmpMaster> getEmpMasters(
		int start, int end) {
		return _empMasterLocalService.getEmpMasters(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _empMasterLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _empMasterLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public EmpMasterLocalService getWrappedService() {
		return _empMasterLocalService;
	}

	@Override
	public void setWrappedService(EmpMasterLocalService empMasterLocalService) {
		_empMasterLocalService = empMasterLocalService;
	}

	private EmpMasterLocalService _empMasterLocalService;
}