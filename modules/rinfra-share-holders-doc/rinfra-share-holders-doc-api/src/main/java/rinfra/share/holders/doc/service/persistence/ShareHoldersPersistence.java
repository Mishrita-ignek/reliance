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

package rinfra.share.holders.doc.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import rinfra.share.holders.doc.exception.NoSuchShareHoldersException;
import rinfra.share.holders.doc.model.ShareHolders;

/**
 * The persistence interface for the share holders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rinfra.share.holders.doc.service.persistence.impl.ShareHoldersPersistenceImpl
 * @see ShareHoldersUtil
 * @generated
 */
@ProviderType
public interface ShareHoldersPersistence extends BasePersistence<ShareHolders> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShareHoldersUtil} to access the share holders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the share holders in the entity cache if it is enabled.
	*
	* @param shareHolders the share holders
	*/
	public void cacheResult(ShareHolders shareHolders);

	/**
	* Caches the share holderses in the entity cache if it is enabled.
	*
	* @param shareHolderses the share holderses
	*/
	public void cacheResult(java.util.List<ShareHolders> shareHolderses);

	/**
	* Creates a new share holders with the primary key. Does not add the share holders to the database.
	*
	* @param FOLIO_NO the primary key for the new share holders
	* @return the new share holders
	*/
	public ShareHolders create(java.lang.String FOLIO_NO);

	/**
	* Removes the share holders with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders that was removed
	* @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	*/
	public ShareHolders remove(java.lang.String FOLIO_NO)
		throws NoSuchShareHoldersException;

	public ShareHolders updateImpl(ShareHolders shareHolders);

	/**
	* Returns the share holders with the primary key or throws a {@link NoSuchShareHoldersException} if it could not be found.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders
	* @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	*/
	public ShareHolders findByPrimaryKey(java.lang.String FOLIO_NO)
		throws NoSuchShareHoldersException;

	/**
	* Returns the share holders with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param FOLIO_NO the primary key of the share holders
	* @return the share holders, or <code>null</code> if a share holders with the primary key could not be found
	*/
	public ShareHolders fetchByPrimaryKey(java.lang.String FOLIO_NO);

	@Override
	public java.util.Map<java.io.Serializable, ShareHolders> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the share holderses.
	*
	* @return the share holderses
	*/
	public java.util.List<ShareHolders> findAll();

	/**
	* Returns a range of all the share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holderses
	* @param end the upper bound of the range of share holderses (not inclusive)
	* @return the range of share holderses
	*/
	public java.util.List<ShareHolders> findAll(int start, int end);

	/**
	* Returns an ordered range of all the share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holderses
	* @param end the upper bound of the range of share holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of share holderses
	*/
	public java.util.List<ShareHolders> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareHolders> orderByComparator);

	/**
	* Returns an ordered range of all the share holderses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holderses
	* @param end the upper bound of the range of share holderses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of share holderses
	*/
	public java.util.List<ShareHolders> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareHolders> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the share holderses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of share holderses.
	*
	* @return the number of share holderses
	*/
	public int countAll();
}