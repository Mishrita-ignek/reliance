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

package com.reliance.reality.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.reliance.reality.model.RealityPropertyMaster;

import java.io.Serializable;

import java.util.List;
import java.util.Set;

/**
 * Provides the local service interface for RealityPropertyMaster. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMasterLocalServiceUtil
 * @see com.reliance.reality.service.base.RealityPropertyMasterLocalServiceBaseImpl
 * @see com.reliance.reality.service.impl.RealityPropertyMasterLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface RealityPropertyMasterLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RealityPropertyMasterLocalServiceUtil} to access the reality property master local service. Add custom service methods to {@link com.reliance.reality.service.impl.RealityPropertyMasterLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the reality property master to the database. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RealityPropertyMaster addRealityPropertyMaster(
		RealityPropertyMaster realityPropertyMaster);

	/**
	* Creates a new reality property master with the primary key. Does not add the reality property master to the database.
	*
	* @param property_ID the primary key for the new reality property master
	* @return the new reality property master
	*/
	public RealityPropertyMaster createRealityPropertyMaster(long property_ID);

	/**
	* Deletes the reality property master from the database. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public RealityPropertyMaster deleteRealityPropertyMaster(
		RealityPropertyMaster realityPropertyMaster);

	/**
	* Deletes the reality property master with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master that was removed
	* @throws PortalException if a reality property master with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public RealityPropertyMaster deleteRealityPropertyMaster(long property_ID)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RealityPropertyMaster fetchRealityPropertyMaster(long property_ID);

	/**
	* Returns the reality property master with the primary key.
	*
	* @param property_ID the primary key of the reality property master
	* @return the reality property master
	* @throws PortalException if a reality property master with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RealityPropertyMaster getRealityPropertyMaster(long property_ID)
		throws PortalException;

	/**
	* Updates the reality property master in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param realityPropertyMaster the reality property master
	* @return the reality property master that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RealityPropertyMaster updateRealityPropertyMaster(
		RealityPropertyMaster realityPropertyMaster);

	/**
	* Returns the number of reality property masters.
	*
	* @return the number of reality property masters
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRealityPropertyMastersCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RealityPropertyMaster> getProperty(java.lang.String location);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RealityPropertyMaster> getPropertyRecord(java.lang.String city);

	/**
	* Returns a range of all the reality property masters.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.reliance.reality.model.impl.RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of reality property masters
	* @param end the upper bound of the range of reality property masters (not inclusive)
	* @return the range of reality property masters
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RealityPropertyMaster> getRealityPropertyMasters(int start,
		int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Set<java.lang.String> getCity();

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}