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

package rpower.shareholders.doc.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import rpower.shareholders.doc.exception.NoSuchRpowerShareHoldersDocException;
import rpower.shareholders.doc.model.RpowerShareHoldersDoc;

/**
 * The persistence interface for the rpower share holders doc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see rpower.shareholders.doc.service.persistence.impl.RpowerShareHoldersDocPersistenceImpl
 * @see RpowerShareHoldersDocUtil
 * @generated
 */
@ProviderType
public interface RpowerShareHoldersDocPersistence extends BasePersistence<RpowerShareHoldersDoc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpowerShareHoldersDocUtil} to access the rpower share holders doc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the rpower share holders doc in the entity cache if it is enabled.
	*
	* @param rpowerShareHoldersDoc the rpower share holders doc
	*/
	public void cacheResult(RpowerShareHoldersDoc rpowerShareHoldersDoc);

	/**
	* Caches the rpower share holders docs in the entity cache if it is enabled.
	*
	* @param rpowerShareHoldersDocs the rpower share holders docs
	*/
	public void cacheResult(
		java.util.List<RpowerShareHoldersDoc> rpowerShareHoldersDocs);

	/**
	* Creates a new rpower share holders doc with the primary key. Does not add the rpower share holders doc to the database.
	*
	* @param pressId the primary key for the new rpower share holders doc
	* @return the new rpower share holders doc
	*/
	public RpowerShareHoldersDoc create(long pressId);

	/**
	* Removes the rpower share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param pressId the primary key of the rpower share holders doc
	* @return the rpower share holders doc that was removed
	* @throws NoSuchRpowerShareHoldersDocException if a rpower share holders doc with the primary key could not be found
	*/
	public RpowerShareHoldersDoc remove(long pressId)
		throws NoSuchRpowerShareHoldersDocException;

	public RpowerShareHoldersDoc updateImpl(
		RpowerShareHoldersDoc rpowerShareHoldersDoc);

	/**
	* Returns the rpower share holders doc with the primary key or throws a {@link NoSuchRpowerShareHoldersDocException} if it could not be found.
	*
	* @param pressId the primary key of the rpower share holders doc
	* @return the rpower share holders doc
	* @throws NoSuchRpowerShareHoldersDocException if a rpower share holders doc with the primary key could not be found
	*/
	public RpowerShareHoldersDoc findByPrimaryKey(long pressId)
		throws NoSuchRpowerShareHoldersDocException;

	/**
	* Returns the rpower share holders doc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param pressId the primary key of the rpower share holders doc
	* @return the rpower share holders doc, or <code>null</code> if a rpower share holders doc with the primary key could not be found
	*/
	public RpowerShareHoldersDoc fetchByPrimaryKey(long pressId);

	@Override
	public java.util.Map<java.io.Serializable, RpowerShareHoldersDoc> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the rpower share holders docs.
	*
	* @return the rpower share holders docs
	*/
	public java.util.List<RpowerShareHoldersDoc> findAll();

	/**
	* Returns a range of all the rpower share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holders docs
	* @param end the upper bound of the range of rpower share holders docs (not inclusive)
	* @return the range of rpower share holders docs
	*/
	public java.util.List<RpowerShareHoldersDoc> findAll(int start, int end);

	/**
	* Returns an ordered range of all the rpower share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holders docs
	* @param end the upper bound of the range of rpower share holders docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rpower share holders docs
	*/
	public java.util.List<RpowerShareHoldersDoc> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerShareHoldersDoc> orderByComparator);

	/**
	* Returns an ordered range of all the rpower share holders docs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rpower share holders docs
	* @param end the upper bound of the range of rpower share holders docs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rpower share holders docs
	*/
	public java.util.List<RpowerShareHoldersDoc> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpowerShareHoldersDoc> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the rpower share holders docs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of rpower share holders docs.
	*
	* @return the number of rpower share holders docs
	*/
	public int countAll();
}