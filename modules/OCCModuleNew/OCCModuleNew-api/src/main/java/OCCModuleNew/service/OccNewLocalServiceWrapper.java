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

package OCCModuleNew.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OccNewLocalService}.
 *
 * @author Mukesh Patidar
 * @see OccNewLocalService
 * @generated
 */
@ProviderType
public class OccNewLocalServiceWrapper implements OccNewLocalService,
	ServiceWrapper<OccNewLocalService> {
	public OccNewLocalServiceWrapper(OccNewLocalService occNewLocalService) {
		_occNewLocalService = occNewLocalService;
	}

	/**
	* Adds the occ new to the database. Also notifies the appropriate model listeners.
	*
	* @param occNew the occ new
	* @return the occ new that was added
	*/
	@Override
	public OCCModuleNew.model.OccNew addOccNew(OCCModuleNew.model.OccNew occNew) {
		return _occNewLocalService.addOccNew(occNew);
	}

	/**
	* Creates a new occ new with the primary key. Does not add the occ new to the database.
	*
	* @param OCCID the primary key for the new occ new
	* @return the new occ new
	*/
	@Override
	public OCCModuleNew.model.OccNew createOccNew(long OCCID) {
		return _occNewLocalService.createOccNew(OCCID);
	}

	/**
	* Deletes the occ new from the database. Also notifies the appropriate model listeners.
	*
	* @param occNew the occ new
	* @return the occ new that was removed
	*/
	@Override
	public OCCModuleNew.model.OccNew deleteOccNew(
		OCCModuleNew.model.OccNew occNew) {
		return _occNewLocalService.deleteOccNew(occNew);
	}

	/**
	* Deletes the occ new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param OCCID the primary key of the occ new
	* @return the occ new that was removed
	* @throws PortalException if a occ new with the primary key could not be found
	*/
	@Override
	public OCCModuleNew.model.OccNew deleteOccNew(long OCCID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occNewLocalService.deleteOccNew(OCCID);
	}

	@Override
	public OCCModuleNew.model.OccNew fetchOccNew(long OCCID) {
		return _occNewLocalService.fetchOccNew(OCCID);
	}

	/**
	* Returns the occ new with the primary key.
	*
	* @param OCCID the primary key of the occ new
	* @return the occ new
	* @throws PortalException if a occ new with the primary key could not be found
	*/
	@Override
	public OCCModuleNew.model.OccNew getOccNew(long OCCID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occNewLocalService.getOccNew(OCCID);
	}

	/**
	* Updates the occ new in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param occNew the occ new
	* @return the occ new that was updated
	*/
	@Override
	public OCCModuleNew.model.OccNew updateOccNew(
		OCCModuleNew.model.OccNew occNew) {
		return _occNewLocalService.updateOccNew(occNew);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _occNewLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _occNewLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _occNewLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occNewLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occNewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of occ news.
	*
	* @return the number of occ news
	*/
	@Override
	public int getOccNewsCount() {
		return _occNewLocalService.getOccNewsCount();
	}

	@Override
	public int sendMail(java.lang.String msg, java.lang.String listName) {
		return _occNewLocalService.sendMail(msg, listName);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _occNewLocalService.getOSGiServiceIdentifier();
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
		return _occNewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _occNewLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _occNewLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<OCCModuleNew.model.OccNew> getList(
		java.lang.String listName) {
		return _occNewLocalService.getList(listName);
	}

	/**
	* Returns a range of all the occ news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ news
	* @param end the upper bound of the range of occ news (not inclusive)
	* @return the range of occ news
	*/
	@Override
	public java.util.List<OCCModuleNew.model.OccNew> getOccNews(int start,
		int end) {
		return _occNewLocalService.getOccNews(start, end);
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
		return _occNewLocalService.dynamicQueryCount(dynamicQuery);
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
		return _occNewLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public OccNewLocalService getWrappedService() {
		return _occNewLocalService;
	}

	@Override
	public void setWrappedService(OccNewLocalService occNewLocalService) {
		_occNewLocalService = occNewLocalService;
	}

	private OccNewLocalService _occNewLocalService;
}