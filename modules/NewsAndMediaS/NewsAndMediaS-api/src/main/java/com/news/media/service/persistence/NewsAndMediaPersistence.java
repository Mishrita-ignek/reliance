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

package com.news.media.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.news.media.exception.NoSuchNewsAndMediaException;
import com.news.media.model.NewsAndMedia;

/**
 * The persistence interface for the news and media service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.news.media.service.persistence.impl.NewsAndMediaPersistenceImpl
 * @see NewsAndMediaUtil
 * @generated
 */
@ProviderType
public interface NewsAndMediaPersistence extends BasePersistence<NewsAndMedia> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link NewsAndMediaUtil} to access the news and media persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the news and media in the entity cache if it is enabled.
	*
	* @param newsAndMedia the news and media
	*/
	public void cacheResult(NewsAndMedia newsAndMedia);

	/**
	* Caches the news and medias in the entity cache if it is enabled.
	*
	* @param newsAndMedias the news and medias
	*/
	public void cacheResult(java.util.List<NewsAndMedia> newsAndMedias);

	/**
	* Creates a new news and media with the primary key. Does not add the news and media to the database.
	*
	* @param SRNO the primary key for the new news and media
	* @return the new news and media
	*/
	public NewsAndMedia create(long SRNO);

	/**
	* Removes the news and media with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media that was removed
	* @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	*/
	public NewsAndMedia remove(long SRNO) throws NoSuchNewsAndMediaException;

	public NewsAndMedia updateImpl(NewsAndMedia newsAndMedia);

	/**
	* Returns the news and media with the primary key or throws a {@link NoSuchNewsAndMediaException} if it could not be found.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media
	* @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	*/
	public NewsAndMedia findByPrimaryKey(long SRNO)
		throws NoSuchNewsAndMediaException;

	/**
	* Returns the news and media with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param SRNO the primary key of the news and media
	* @return the news and media, or <code>null</code> if a news and media with the primary key could not be found
	*/
	public NewsAndMedia fetchByPrimaryKey(long SRNO);

	@Override
	public java.util.Map<java.io.Serializable, NewsAndMedia> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the news and medias.
	*
	* @return the news and medias
	*/
	public java.util.List<NewsAndMedia> findAll();

	/**
	* Returns a range of all the news and medias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news and medias
	* @param end the upper bound of the range of news and medias (not inclusive)
	* @return the range of news and medias
	*/
	public java.util.List<NewsAndMedia> findAll(int start, int end);

	/**
	* Returns an ordered range of all the news and medias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news and medias
	* @param end the upper bound of the range of news and medias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of news and medias
	*/
	public java.util.List<NewsAndMedia> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndMedia> orderByComparator);

	/**
	* Returns an ordered range of all the news and medias.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link NewsAndMediaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of news and medias
	* @param end the upper bound of the range of news and medias (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of news and medias
	*/
	public java.util.List<NewsAndMedia> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<NewsAndMedia> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the news and medias from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of news and medias.
	*
	* @return the number of news and medias
	*/
	public int countAll();
}