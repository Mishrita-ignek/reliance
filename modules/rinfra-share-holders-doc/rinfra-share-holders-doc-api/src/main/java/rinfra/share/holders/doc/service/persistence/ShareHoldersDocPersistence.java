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

import rinfra.share.holders.doc.exception.NoSuchShareHoldersDocException;
import rinfra.share.holders.doc.model.ShareHoldersDoc;

/**
 * The persistence interface for the share holders doc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rinfra.share.holders.doc.service.persistence.impl.ShareHoldersDocPersistenceImpl
 * @see ShareHoldersDocUtil
 * @generated
 */
@ProviderType
public interface ShareHoldersDocPersistence extends BasePersistence<ShareHoldersDoc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ShareHoldersDocUtil} to access the share holders doc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the share holders doc in the entity cache if it is enabled.
	*
	* @param shareHoldersDoc the share holders doc
	*/
	public void cacheResult(ShareHoldersDoc shareHoldersDoc);

	/**
	* Caches the share holders docs in the entity cache if it is enabled.
	*
	* @param shareHoldersDocs the share holders docs
	*/
	public void cacheResult(java.util.List<ShareHoldersDoc> shareHoldersDocs);

	/**
	* Creates a new share holders doc with the primary key. Does not add the share holders doc to the database.
	*
	* @param pressId the primary key for the new share holders doc
	* @return the new share holders doc
	*/
	public ShareHoldersDoc create(long pressId);

	/**
	* Removes the share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pressId the primary key of the share holders doc
	* @return the share holders doc that was removed
	* @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	*/
	public ShareHoldersDoc remove(long pressId)
		throws NoSuchShareHoldersDocException;

	public ShareHoldersDoc updateImpl(ShareHoldersDoc shareHoldersDoc);

	/**
	* Returns the share holders doc with the primary key or throws a {@link NoSuchShareHoldersDocException} if it could not be found.
	*
	* @param pressId the primary key of the share holders doc
	* @return the share holders doc
	* @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	*/
	public ShareHoldersDoc findByPrimaryKey(long pressId)
		throws NoSuchShareHoldersDocException;

	/**
	* Returns the share holders doc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pressId the primary key of the share holders doc
	* @return the share holders doc, or <code>null</code> if a share holders doc with the primary key could not be found
	*/
	public ShareHoldersDoc fetchByPrimaryKey(long pressId);

	@Override
	public java.util.Map<java.io.Serializable, ShareHoldersDoc> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the share holders docs.
	*
	* @return the share holders docs
	*/
	public java.util.List<ShareHoldersDoc> findAll();

	/**
	* Returns a range of all the share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holders docs
	* @param end the upper bound of the range of share holders docs (not inclusive)
	* @return the range of share holders docs
	*/
	public java.util.List<ShareHoldersDoc> findAll(int start, int end);

	/**
	* Returns an ordered range of all the share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holders docs
	* @param end the upper bound of the range of share holders docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of share holders docs
	*/
	public java.util.List<ShareHoldersDoc> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareHoldersDoc> orderByComparator);

	/**
	* Returns an ordered range of all the share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of share holders docs
	* @param end the upper bound of the range of share holders docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of share holders docs
	*/
	public java.util.List<ShareHoldersDoc> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ShareHoldersDoc> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the share holders docs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of share holders docs.
	*
	* @return the number of share holders docs
	*/
	public int countAll();
}