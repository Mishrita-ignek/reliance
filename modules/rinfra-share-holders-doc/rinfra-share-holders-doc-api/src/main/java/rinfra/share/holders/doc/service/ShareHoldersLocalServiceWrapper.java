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

package rinfra.share.holders.doc.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ShareHoldersLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersLocalService
 * @generated
 */
@ProviderType
public class ShareHoldersLocalServiceWrapper implements ShareHoldersLocalService,
	ServiceWrapper<ShareHoldersLocalService> {
	public ShareHoldersLocalServiceWrapper(
		ShareHoldersLocalService shareHoldersLocalService) {
		_shareHoldersLocalService = shareHoldersLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shareHoldersLocalService.dynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareHoldersLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareHoldersLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of share holderses.
	*
	* @return the number of share holderses
	*/
	@Override
	public int getShareHoldersesCount() {
		return _shareHoldersLocalService.getShareHoldersesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _shareHoldersLocalService.getOSGiServiceIdentifier();
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
		return _shareHoldersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rinfra.share.holders.doc.model.impl.ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shareHoldersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rinfra.share.holders.doc.model.impl.ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _shareHoldersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	@Override
	public java.util.List<rinfra.share.holders.doc.model.ShareHolders> getShareHolder(
		java.lang.String no) {
		return _shareHoldersLocalService.getShareHolder(no);
	}

	/**
	* Returns a range of all the share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rinfra.share.holders.doc.model.impl.ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holderses
	* @param end the upper bound of the range of share holderses (not inclusive)
	* @return the range of share holderses
	*/
	@Override
	public java.util.List<rinfra.share.holders.doc.model.ShareHolders> getShareHolderses(
		int start, int end) {
		return _shareHoldersLocalService.getShareHolderses(start, end);
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
		return _shareHoldersLocalService.dynamicQueryCount(dynamicQuery);
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
		return _shareHoldersLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the share holders to the database. Also notifies the appropriate model listeners.
	*
	* @param shareHolders the share holders
	* @return the share holders that was added
	*/
	@Override
	public rinfra.share.holders.doc.model.ShareHolders addShareHolders(
		rinfra.share.holders.doc.model.ShareHolders shareHolders) {
		return _shareHoldersLocalService.addShareHolders(shareHolders);
	}

	/**
	* Creates a new share holders with the primary key. Does not add the share holders to the database.
	*
	* @param FOLIO_NO the primary key for the new share holders
	* @return the new share holders
	*/
	@Override
	public rinfra.share.holders.doc.model.ShareHolders createShareHolders(
		java.lang.String FOLIO_NO) {
		return _shareHoldersLocalService.createShareHolders(FOLIO_NO);
	}

	/**
	* Deletes the share holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders that was removed
	* @throws PortalException if a share holders with the primary key could not be found
	*/
	@Override
	public rinfra.share.holders.doc.model.ShareHolders deleteShareHolders(
		java.lang.String FOLIO_NO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareHoldersLocalService.deleteShareHolders(FOLIO_NO);
	}

	/**
	* Deletes the share holders from the database. Also notifies the appropriate model listeners.
	*
	* @param shareHolders the share holders
	* @return the share holders that was removed
	*/
	@Override
	public rinfra.share.holders.doc.model.ShareHolders deleteShareHolders(
		rinfra.share.holders.doc.model.ShareHolders shareHolders) {
		return _shareHoldersLocalService.deleteShareHolders(shareHolders);
	}

	@Override
	public rinfra.share.holders.doc.model.ShareHolders fetchShareHolders(
		java.lang.String FOLIO_NO) {
		return _shareHoldersLocalService.fetchShareHolders(FOLIO_NO);
	}

	/**
	* Returns the share holders with the primary key.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders
	* @throws PortalException if a share holders with the primary key could not be found
	*/
	@Override
	public rinfra.share.holders.doc.model.ShareHolders getShareHolders(
		java.lang.String FOLIO_NO)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _shareHoldersLocalService.getShareHolders(FOLIO_NO);
	}

	/**
	* Updates the share holders in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shareHolders the share holders
	* @return the share holders that was updated
	*/
	@Override
	public rinfra.share.holders.doc.model.ShareHolders updateShareHolders(
		rinfra.share.holders.doc.model.ShareHolders shareHolders) {
		return _shareHoldersLocalService.updateShareHolders(shareHolders);
	}

	@Override
	public ShareHoldersLocalService getWrappedService() {
		return _shareHoldersLocalService;
	}

	@Override
	public void setWrappedService(
		ShareHoldersLocalService shareHoldersLocalService) {
		_shareHoldersLocalService = shareHoldersLocalService;
	}

	private ShareHoldersLocalService _shareHoldersLocalService;
}