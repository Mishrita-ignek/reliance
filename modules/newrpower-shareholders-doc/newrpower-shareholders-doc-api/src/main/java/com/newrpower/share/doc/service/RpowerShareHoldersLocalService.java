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

package com.newrpower.share.doc.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
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

import com.newrpower.share.doc.model.RpowerShareHolders;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for RpowerShareHolders. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersLocalServiceUtil
 * @see com.newrpower.share.doc.service.base.RpowerShareHoldersLocalServiceBaseImpl
 * @see com.newrpower.share.doc.service.impl.RpowerShareHoldersLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface RpowerShareHoldersLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpowerShareHoldersLocalServiceUtil} to access the rpower share holders local service. Add custom service methods to {@link com.newrpower.share.doc.service.impl.RpowerShareHoldersLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public DynamicQuery dynamicQuery();

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
	* Adds the rpower share holders to the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHolders the rpower share holders
	* @return the rpower share holders that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RpowerShareHolders addRpowerShareHolders(
		RpowerShareHolders rpowerShareHolders);

	/**
	* Creates a new rpower share holders with the primary key. Does not add the rpower share holders to the database.
	*
	* @param FOLIO_NO the primary key for the new rpower share holders
	* @return the new rpower share holders
	*/
	public RpowerShareHolders createRpowerShareHolders(
		java.lang.String FOLIO_NO);

	/**
	* Deletes the rpower share holders from the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHolders the rpower share holders
	* @return the rpower share holders that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public RpowerShareHolders deleteRpowerShareHolders(
		RpowerShareHolders rpowerShareHolders);

	/**
	* Deletes the rpower share holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders that was removed
	* @throws PortalException if a rpower share holders with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public RpowerShareHolders deleteRpowerShareHolders(
		java.lang.String FOLIO_NO) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RpowerShareHolders fetchRpowerShareHolders(java.lang.String FOLIO_NO);

	/**
	* Returns the rpower share holders with the primary key.
	*
	* @param FOLIO_NO the primary key of the rpower share holders
	* @return the rpower share holders
	* @throws PortalException if a rpower share holders with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RpowerShareHolders getRpowerShareHolders(java.lang.String FOLIO_NO)
		throws PortalException;

	/**
	* Updates the rpower share holders in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rpowerShareHolders the rpower share holders
	* @return the rpower share holders that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RpowerShareHolders updateRpowerShareHolders(
		RpowerShareHolders rpowerShareHolders);

	/**
	* Returns the number of rpower share holderses.
	*
	* @return the number of rpower share holderses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRpowerShareHoldersesCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

	/**
	* Returns a range of all the rpower share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.newrpower.share.doc.model.impl.RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holderses
	* @param end the upper bound of the range of rpower share holderses (not inclusive)
	* @return the range of rpower share holderses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RpowerShareHolders> getRpowerShareHolderses(int start, int end);

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