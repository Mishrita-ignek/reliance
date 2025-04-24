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
 * Provides a wrapper for {@link OccMessageNewLocalService}.
 *
 * @author Mukesh Patidar
 * @see OccMessageNewLocalService
 * @generated
 */
@ProviderType
public class OccMessageNewLocalServiceWrapper
	implements OccMessageNewLocalService,
		ServiceWrapper<OccMessageNewLocalService> {
	public OccMessageNewLocalServiceWrapper(
		OccMessageNewLocalService occMessageNewLocalService) {
		_occMessageNewLocalService = occMessageNewLocalService;
	}

	/**
	* Adds the occ message new to the database. Also notifies the appropriate model listeners.
	*
	* @param occMessageNew the occ message new
	* @return the occ message new that was added
	*/
	@Override
	public OCCModuleNew.model.OccMessageNew addOccMessageNew(
		OCCModuleNew.model.OccMessageNew occMessageNew) {
		return _occMessageNewLocalService.addOccMessageNew(occMessageNew);
	}

	/**
	* Creates a new occ message new with the primary key. Does not add the occ message new to the database.
	*
	* @param MSG_ID the primary key for the new occ message new
	* @return the new occ message new
	*/
	@Override
	public OCCModuleNew.model.OccMessageNew createOccMessageNew(long MSG_ID) {
		return _occMessageNewLocalService.createOccMessageNew(MSG_ID);
	}

	/**
	* Deletes the occ message new from the database. Also notifies the appropriate model listeners.
	*
	* @param occMessageNew the occ message new
	* @return the occ message new that was removed
	*/
	@Override
	public OCCModuleNew.model.OccMessageNew deleteOccMessageNew(
		OCCModuleNew.model.OccMessageNew occMessageNew) {
		return _occMessageNewLocalService.deleteOccMessageNew(occMessageNew);
	}

	/**
	* Deletes the occ message new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new that was removed
	* @throws PortalException if a occ message new with the primary key could not be found
	*/
	@Override
	public OCCModuleNew.model.OccMessageNew deleteOccMessageNew(long MSG_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occMessageNewLocalService.deleteOccMessageNew(MSG_ID);
	}

	@Override
	public OCCModuleNew.model.OccMessageNew fetchOccMessageNew(long MSG_ID) {
		return _occMessageNewLocalService.fetchOccMessageNew(MSG_ID);
	}

	/**
	* Returns the occ message new with the primary key.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new
	* @throws PortalException if a occ message new with the primary key could not be found
	*/
	@Override
	public OCCModuleNew.model.OccMessageNew getOccMessageNew(long MSG_ID)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occMessageNewLocalService.getOccMessageNew(MSG_ID);
	}

	/**
	* Updates the occ message new in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param occMessageNew the occ message new
	* @return the occ message new that was updated
	*/
	@Override
	public OCCModuleNew.model.OccMessageNew updateOccMessageNew(
		OCCModuleNew.model.OccMessageNew occMessageNew) {
		return _occMessageNewLocalService.updateOccMessageNew(occMessageNew);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _occMessageNewLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _occMessageNewLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _occMessageNewLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occMessageNewLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _occMessageNewLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of occ message news.
	*
	* @return the number of occ message news
	*/
	@Override
	public int getOccMessageNewsCount() {
		return _occMessageNewLocalService.getOccMessageNewsCount();
	}

	@Override
	public int saveMsg(java.lang.String msg, java.lang.String listName,
		java.lang.String severity) {
		return _occMessageNewLocalService.saveMsg(msg, listName, severity);
	}

	@Override
	public java.lang.String getDate() {
		return _occMessageNewLocalService.getDate();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _occMessageNewLocalService.getOSGiServiceIdentifier();
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
		return _occMessageNewLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _occMessageNewLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _occMessageNewLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<OCCModuleNew.model.OccMessageNew> getMsgList(
		java.lang.String listName) {
		return _occMessageNewLocalService.getMsgList(listName);
	}

	@Override
	public java.util.List<OCCModuleNew.model.OccMessageNew> getMsgsAlert() {
		return _occMessageNewLocalService.getMsgsAlert();
	}

	/**
	* Returns a range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OCCModuleNew.model.impl.OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @return the range of occ message news
	*/
	@Override
	public java.util.List<OCCModuleNew.model.OccMessageNew> getOccMessageNews(
		int start, int end) {
		return _occMessageNewLocalService.getOccMessageNews(start, end);
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
		return _occMessageNewLocalService.dynamicQueryCount(dynamicQuery);
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
		return _occMessageNewLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public OccMessageNewLocalService getWrappedService() {
		return _occMessageNewLocalService;
	}

	@Override
	public void setWrappedService(
		OccMessageNewLocalService occMessageNewLocalService) {
		_occMessageNewLocalService = occMessageNewLocalService;
	}

	private OccMessageNewLocalService _occMessageNewLocalService;
}