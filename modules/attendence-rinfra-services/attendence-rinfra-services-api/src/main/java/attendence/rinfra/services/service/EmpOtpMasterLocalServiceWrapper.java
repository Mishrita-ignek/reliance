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
 * Provides a wrapper for {@link EmpOtpMasterLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmpOtpMasterLocalService
 * @generated
 */
@ProviderType
public class EmpOtpMasterLocalServiceWrapper implements EmpOtpMasterLocalService,
	ServiceWrapper<EmpOtpMasterLocalService> {
	public EmpOtpMasterLocalServiceWrapper(
		EmpOtpMasterLocalService empOtpMasterLocalService) {
		_empOtpMasterLocalService = empOtpMasterLocalService;
	}

	/**
	* Adds the emp otp master to the database. Also notifies the appropriate model listeners.
	*
	* @param empOtpMaster the emp otp master
	* @return the emp otp master that was added
	*/
	@Override
	public attendence.rinfra.services.model.EmpOtpMaster addEmpOtpMaster(
		attendence.rinfra.services.model.EmpOtpMaster empOtpMaster) {
		return _empOtpMasterLocalService.addEmpOtpMaster(empOtpMaster);
	}

	/**
	* Creates a new emp otp master with the primary key. Does not add the emp otp master to the database.
	*
	* @param empMobile the primary key for the new emp otp master
	* @return the new emp otp master
	*/
	@Override
	public attendence.rinfra.services.model.EmpOtpMaster createEmpOtpMaster(
		java.lang.String empMobile) {
		return _empOtpMasterLocalService.createEmpOtpMaster(empMobile);
	}

	/**
	* Deletes the emp otp master from the database. Also notifies the appropriate model listeners.
	*
	* @param empOtpMaster the emp otp master
	* @return the emp otp master that was removed
	*/
	@Override
	public attendence.rinfra.services.model.EmpOtpMaster deleteEmpOtpMaster(
		attendence.rinfra.services.model.EmpOtpMaster empOtpMaster) {
		return _empOtpMasterLocalService.deleteEmpOtpMaster(empOtpMaster);
	}

	/**
	* Deletes the emp otp master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master that was removed
	* @throws PortalException if a emp otp master with the primary key could not be found
	*/
	@Override
	public attendence.rinfra.services.model.EmpOtpMaster deleteEmpOtpMaster(
		java.lang.String empMobile)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empOtpMasterLocalService.deleteEmpOtpMaster(empMobile);
	}

	@Override
	public attendence.rinfra.services.model.EmpOtpMaster fetchEmpOtpMaster(
		java.lang.String empMobile) {
		return _empOtpMasterLocalService.fetchEmpOtpMaster(empMobile);
	}

	/**
	* Returns the emp otp master with the primary key.
	*
	* @param empMobile the primary key of the emp otp master
	* @return the emp otp master
	* @throws PortalException if a emp otp master with the primary key could not be found
	*/
	@Override
	public attendence.rinfra.services.model.EmpOtpMaster getEmpOtpMaster(
		java.lang.String empMobile)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empOtpMasterLocalService.getEmpOtpMaster(empMobile);
	}

	/**
	* Updates the emp otp master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empOtpMaster the emp otp master
	* @return the emp otp master that was updated
	*/
	@Override
	public attendence.rinfra.services.model.EmpOtpMaster updateEmpOtpMaster(
		attendence.rinfra.services.model.EmpOtpMaster empOtpMaster) {
		return _empOtpMasterLocalService.updateEmpOtpMaster(empOtpMaster);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empOtpMasterLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empOtpMasterLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empOtpMasterLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of emp otp masters.
	*
	* @return the number of emp otp masters
	*/
	@Override
	public int getEmpOtpMastersCount() {
		return _empOtpMasterLocalService.getEmpOtpMastersCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _empOtpMasterLocalService.getOSGiServiceIdentifier();
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
		return _empOtpMasterLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empOtpMasterLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empOtpMasterLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the emp otp masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link attendence.rinfra.services.model.impl.EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp otp masters
	* @param end the upper bound of the range of emp otp masters (not inclusive)
	* @return the range of emp otp masters
	*/
	@Override
	public java.util.List<attendence.rinfra.services.model.EmpOtpMaster> getEmpOtpMasters(
		int start, int end) {
		return _empOtpMasterLocalService.getEmpOtpMasters(start, end);
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
		return _empOtpMasterLocalService.dynamicQueryCount(dynamicQuery);
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
		return _empOtpMasterLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public EmpOtpMasterLocalService getWrappedService() {
		return _empOtpMasterLocalService;
	}

	@Override
	public void setWrappedService(
		EmpOtpMasterLocalService empOtpMasterLocalService) {
		_empOtpMasterLocalService = empOtpMasterLocalService;
	}

	private EmpOtpMasterLocalService _empOtpMasterLocalService;
}