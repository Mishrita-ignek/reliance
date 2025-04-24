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

package com.rpower.unpaid.unclaimed.dividend.service;

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

import com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for RpowerUnpaidUnclaimedDevidend. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see RpowerUnpaidUnclaimedDevidendLocalServiceUtil
 * @see com.rpower.unpaid.unclaimed.dividend.service.base.RpowerUnpaidUnclaimedDevidendLocalServiceBaseImpl
 * @see com.rpower.unpaid.unclaimed.dividend.service.impl.RpowerUnpaidUnclaimedDevidendLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface RpowerUnpaidUnclaimedDevidendLocalService
	extends BaseLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpowerUnpaidUnclaimedDevidendLocalServiceUtil} to access the rpower unpaid unclaimed devidend local service. Add custom service methods to {@link com.rpower.unpaid.unclaimed.dividend.service.impl.RpowerUnpaidUnclaimedDevidendLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
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
	* Adds the rpower unpaid unclaimed devidend to the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RpowerUnpaidUnclaimedDevidend addRpowerUnpaidUnclaimedDevidend(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend);

	/**
	* Creates a new rpower unpaid unclaimed devidend with the primary key. Does not add the rpower unpaid unclaimed devidend to the database.
	*
	* @param SRNO the primary key for the new rpower unpaid unclaimed devidend
	* @return the new rpower unpaid unclaimed devidend
	*/
	public RpowerUnpaidUnclaimedDevidend createRpowerUnpaidUnclaimedDevidend(
		long SRNO);

	/**
	* Deletes the rpower unpaid unclaimed devidend from the database. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public RpowerUnpaidUnclaimedDevidend deleteRpowerUnpaidUnclaimedDevidend(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend);

	/**
	* Deletes the rpower unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was removed
	* @throws PortalException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public RpowerUnpaidUnclaimedDevidend deleteRpowerUnpaidUnclaimedDevidend(
		long SRNO) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RpowerUnpaidUnclaimedDevidend fetchRpowerUnpaidUnclaimedDevidend(
		long SRNO);

	/**
	* Returns the rpower unpaid unclaimed devidend with the primary key.
	*
	* @param SRNO the primary key of the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend
	* @throws PortalException if a rpower unpaid unclaimed devidend with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public RpowerUnpaidUnclaimedDevidend getRpowerUnpaidUnclaimedDevidend(
		long SRNO) throws PortalException;

	/**
	* Updates the rpower unpaid unclaimed devidend in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	* @return the rpower unpaid unclaimed devidend that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public RpowerUnpaidUnclaimedDevidend updateRpowerUnpaidUnclaimedDevidend(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend);

	/**
	* Returns the number of rpower unpaid unclaimed devidends.
	*
	* @return the number of rpower unpaid unclaimed devidends
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getRpowerUnpaidUnclaimedDevidendsCount();

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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
	* Returns a range of all the rpower unpaid unclaimed devidends.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower unpaid unclaimed devidends
	* @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	* @return the range of rpower unpaid unclaimed devidends
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RpowerUnpaidUnclaimedDevidend> getRpowerUnpaidUnclaimedDevidends(
		int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendData(
		java.lang.String FOLIO_NO_OF_ITIES);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendNew(
		java.lang.String FOLIO_NO_OF_ITIES);

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