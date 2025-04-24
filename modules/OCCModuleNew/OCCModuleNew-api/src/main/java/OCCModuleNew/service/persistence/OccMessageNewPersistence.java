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

package OCCModuleNew.service.persistence;

import OCCModuleNew.exception.NoSuchOccMessageNewException;

import OCCModuleNew.model.OccMessageNew;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the occ message new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh Patidar
 * @see OCCModuleNew.service.persistence.impl.OccMessageNewPersistenceImpl
 * @see OccMessageNewUtil
 * @generated
 */
@ProviderType
public interface OccMessageNewPersistence extends BasePersistence<OccMessageNew> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OccMessageNewUtil} to access the occ message new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the occ message new in the entity cache if it is enabled.
	*
	* @param occMessageNew the occ message new
	*/
	public void cacheResult(OccMessageNew occMessageNew);

	/**
	* Caches the occ message news in the entity cache if it is enabled.
	*
	* @param occMessageNews the occ message news
	*/
	public void cacheResult(java.util.List<OccMessageNew> occMessageNews);

	/**
	* Creates a new occ message new with the primary key. Does not add the occ message new to the database.
	*
	* @param MSG_ID the primary key for the new occ message new
	* @return the new occ message new
	*/
	public OccMessageNew create(long MSG_ID);

	/**
	* Removes the occ message new with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new that was removed
	* @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	*/
	public OccMessageNew remove(long MSG_ID)
		throws NoSuchOccMessageNewException;

	public OccMessageNew updateImpl(OccMessageNew occMessageNew);

	/**
	* Returns the occ message new with the primary key or throws a {@link NoSuchOccMessageNewException} if it could not be found.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new
	* @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	*/
	public OccMessageNew findByPrimaryKey(long MSG_ID)
		throws NoSuchOccMessageNewException;

	/**
	* Returns the occ message new with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param MSG_ID the primary key of the occ message new
	* @return the occ message new, or <code>null</code> if a occ message new with the primary key could not be found
	*/
	public OccMessageNew fetchByPrimaryKey(long MSG_ID);

	@Override
	public java.util.Map<java.io.Serializable, OccMessageNew> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the occ message news.
	*
	* @return the occ message news
	*/
	public java.util.List<OccMessageNew> findAll();

	/**
	* Returns a range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @return the range of occ message news
	*/
	public java.util.List<OccMessageNew> findAll(int start, int end);

	/**
	* Returns an ordered range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of occ message news
	*/
	public java.util.List<OccMessageNew> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OccMessageNew> orderByComparator);

	/**
	* Returns an ordered range of all the occ message news.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccMessageNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of occ message news
	* @param end the upper bound of the range of occ message news (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of occ message news
	*/
	public java.util.List<OccMessageNew> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OccMessageNew> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the occ message news from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of occ message news.
	*
	* @return the number of occ message news
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}