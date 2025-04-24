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

package rpower.shareholders.doc.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RpowerShareHoldersDocLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersDocLocalService
 * @generated
 */
@ProviderType
public class RpowerShareHoldersDocLocalServiceWrapper
	implements RpowerShareHoldersDocLocalService,
		ServiceWrapper<RpowerShareHoldersDocLocalService> {
	public RpowerShareHoldersDocLocalServiceWrapper(
		RpowerShareHoldersDocLocalService rpowerShareHoldersDocLocalService) {
		_rpowerShareHoldersDocLocalService = rpowerShareHoldersDocLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _rpowerShareHoldersDocLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpowerShareHoldersDocLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _rpowerShareHoldersDocLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerShareHoldersDocLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerShareHoldersDocLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of rpower share holders docs.
	*
	* @return the number of rpower share holders docs
	*/
	@Override
	public int getRpowerShareHoldersDocsCount() {
		return _rpowerShareHoldersDocLocalService.getRpowerShareHoldersDocsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _rpowerShareHoldersDocLocalService.getOSGiServiceIdentifier();
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
		return _rpowerShareHoldersDocLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rpower.shareholders.doc.model.impl.RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rpowerShareHoldersDocLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rpower.shareholders.doc.model.impl.RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _rpowerShareHoldersDocLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	@Override
	public java.util.List<rpower.shareholders.doc.model.RpowerShareHoldersDoc> getDocList() {
		return _rpowerShareHoldersDocLocalService.getDocList();
	}

	/**
	* Returns a range of all the rpower share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rpower.shareholders.doc.model.impl.RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holders docs
	* @param end the upper bound of the range of rpower share holders docs (not inclusive)
	* @return the range of rpower share holders docs
	*/
	@Override
	public java.util.List<rpower.shareholders.doc.model.RpowerShareHoldersDoc> getRpowerShareHoldersDocs(
		int start, int end) {
		return _rpowerShareHoldersDocLocalService.getRpowerShareHoldersDocs(start,
			end);
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
		return _rpowerShareHoldersDocLocalService.dynamicQueryCount(dynamicQuery);
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
		return _rpowerShareHoldersDocLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the rpower share holders doc to the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHoldersDoc the rpower share holders doc
	* @return the rpower share holders doc that was added
	*/
	@Override
	public rpower.shareholders.doc.model.RpowerShareHoldersDoc addRpowerShareHoldersDoc(
		rpower.shareholders.doc.model.RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		return _rpowerShareHoldersDocLocalService.addRpowerShareHoldersDoc(rpowerShareHoldersDoc);
	}

	/**
	* Creates a new rpower share holders doc with the primary key. Does not add the rpower share holders doc to the database.
	*
	* @param pressId the primary key for the new rpower share holders doc
	* @return the new rpower share holders doc
	*/
	@Override
	public rpower.shareholders.doc.model.RpowerShareHoldersDoc createRpowerShareHoldersDoc(
		long pressId) {
		return _rpowerShareHoldersDocLocalService.createRpowerShareHoldersDoc(pressId);
	}

	/**
	* Deletes the rpower share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pressId the primary key of the rpower share holders doc
	* @return the rpower share holders doc that was removed
	* @throws PortalException if a rpower share holders doc with the primary key could not be found
	*/
	@Override
	public rpower.shareholders.doc.model.RpowerShareHoldersDoc deleteRpowerShareHoldersDoc(
		long pressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerShareHoldersDocLocalService.deleteRpowerShareHoldersDoc(pressId);
	}

	/**
	* Deletes the rpower share holders doc from the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHoldersDoc the rpower share holders doc
	* @return the rpower share holders doc that was removed
	*/
	@Override
	public rpower.shareholders.doc.model.RpowerShareHoldersDoc deleteRpowerShareHoldersDoc(
		rpower.shareholders.doc.model.RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		return _rpowerShareHoldersDocLocalService.deleteRpowerShareHoldersDoc(rpowerShareHoldersDoc);
	}

	@Override
	public rpower.shareholders.doc.model.RpowerShareHoldersDoc fetchRpowerShareHoldersDoc(
		long pressId) {
		return _rpowerShareHoldersDocLocalService.fetchRpowerShareHoldersDoc(pressId);
	}

	/**
	* Returns the rpower share holders doc with the primary key.
	*
	* @param pressId the primary key of the rpower share holders doc
	* @return the rpower share holders doc
	* @throws PortalException if a rpower share holders doc with the primary key could not be found
	*/
	@Override
	public rpower.shareholders.doc.model.RpowerShareHoldersDoc getRpowerShareHoldersDoc(
		long pressId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _rpowerShareHoldersDocLocalService.getRpowerShareHoldersDoc(pressId);
	}

	/**
	* Updates the rpower share holders doc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHoldersDoc the rpower share holders doc
	* @return the rpower share holders doc that was updated
	*/
	@Override
	public rpower.shareholders.doc.model.RpowerShareHoldersDoc updateRpowerShareHoldersDoc(
		rpower.shareholders.doc.model.RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		return _rpowerShareHoldersDocLocalService.updateRpowerShareHoldersDoc(rpowerShareHoldersDoc);
	}

	@Override
	public RpowerShareHoldersDocLocalService getWrappedService() {
		return _rpowerShareHoldersDocLocalService;
	}

	@Override
	public void setWrappedService(
		RpowerShareHoldersDocLocalService rpowerShareHoldersDocLocalService) {
		_rpowerShareHoldersDocLocalService = rpowerShareHoldersDocLocalService;
	}

	private RpowerShareHoldersDocLocalService _rpowerShareHoldersDocLocalService;
}