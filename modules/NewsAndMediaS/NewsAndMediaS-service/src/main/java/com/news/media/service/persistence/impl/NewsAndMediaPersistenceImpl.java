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

package com.news.media.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.news.media.exception.NoSuchNewsAndMediaException;
import com.news.media.model.NewsAndMedia;
import com.news.media.model.impl.NewsAndMediaImpl;
import com.news.media.model.impl.NewsAndMediaModelImpl;
import com.news.media.service.persistence.NewsAndMediaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the news and media service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NewsAndMediaPersistence
 * @see com.news.media.service.persistence.NewsAndMediaUtil
 * @generated
 */
@ProviderType
public class NewsAndMediaPersistenceImpl extends BasePersistenceImpl<NewsAndMedia>
	implements NewsAndMediaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link NewsAndMediaUtil} to access the news and media persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = NewsAndMediaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
			NewsAndMediaModelImpl.FINDER_CACHE_ENABLED, NewsAndMediaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
			NewsAndMediaModelImpl.FINDER_CACHE_ENABLED, NewsAndMediaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
			NewsAndMediaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public NewsAndMediaPersistenceImpl() {
		setModelClass(NewsAndMedia.class);
	}

	/**
	 * Caches the news and media in the entity cache if it is enabled.
	 *
	 * @param newsAndMedia the news and media
	 */
	@Override
	public void cacheResult(NewsAndMedia newsAndMedia) {
		entityCache.putResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
			NewsAndMediaImpl.class, newsAndMedia.getPrimaryKey(), newsAndMedia);

		newsAndMedia.resetOriginalValues();
	}

	/**
	 * Caches the news and medias in the entity cache if it is enabled.
	 *
	 * @param newsAndMedias the news and medias
	 */
	@Override
	public void cacheResult(List<NewsAndMedia> newsAndMedias) {
		for (NewsAndMedia newsAndMedia : newsAndMedias) {
			if (entityCache.getResult(
						NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
						NewsAndMediaImpl.class, newsAndMedia.getPrimaryKey()) == null) {
				cacheResult(newsAndMedia);
			}
			else {
				newsAndMedia.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all news and medias.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NewsAndMediaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the news and media.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NewsAndMedia newsAndMedia) {
		entityCache.removeResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
			NewsAndMediaImpl.class, newsAndMedia.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<NewsAndMedia> newsAndMedias) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (NewsAndMedia newsAndMedia : newsAndMedias) {
			entityCache.removeResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
				NewsAndMediaImpl.class, newsAndMedia.getPrimaryKey());
		}
	}

	/**
	 * Creates a new news and media with the primary key. Does not add the news and media to the database.
	 *
	 * @param SRNO the primary key for the new news and media
	 * @return the new news and media
	 */
	@Override
	public NewsAndMedia create(long SRNO) {
		NewsAndMedia newsAndMedia = new NewsAndMediaImpl();

		newsAndMedia.setNew(true);
		newsAndMedia.setPrimaryKey(SRNO);

		return newsAndMedia;
	}

	/**
	 * Removes the news and media with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SRNO the primary key of the news and media
	 * @return the news and media that was removed
	 * @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	 */
	@Override
	public NewsAndMedia remove(long SRNO) throws NoSuchNewsAndMediaException {
		return remove((Serializable)SRNO);
	}

	/**
	 * Removes the news and media with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the news and media
	 * @return the news and media that was removed
	 * @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	 */
	@Override
	public NewsAndMedia remove(Serializable primaryKey)
		throws NoSuchNewsAndMediaException {
		Session session = null;

		try {
			session = openSession();

			NewsAndMedia newsAndMedia = (NewsAndMedia)session.get(NewsAndMediaImpl.class,
					primaryKey);

			if (newsAndMedia == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNewsAndMediaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(newsAndMedia);
		}
		catch (NoSuchNewsAndMediaException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected NewsAndMedia removeImpl(NewsAndMedia newsAndMedia) {
		newsAndMedia = toUnwrappedModel(newsAndMedia);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(newsAndMedia)) {
				newsAndMedia = (NewsAndMedia)session.get(NewsAndMediaImpl.class,
						newsAndMedia.getPrimaryKeyObj());
			}

			if (newsAndMedia != null) {
				session.delete(newsAndMedia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (newsAndMedia != null) {
			clearCache(newsAndMedia);
		}

		return newsAndMedia;
	}

	@Override
	public NewsAndMedia updateImpl(NewsAndMedia newsAndMedia) {
		newsAndMedia = toUnwrappedModel(newsAndMedia);

		boolean isNew = newsAndMedia.isNew();

		Session session = null;

		try {
			session = openSession();

			if (newsAndMedia.isNew()) {
				session.save(newsAndMedia);

				newsAndMedia.setNew(false);
			}
			else {
				newsAndMedia = (NewsAndMedia)session.merge(newsAndMedia);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
			NewsAndMediaImpl.class, newsAndMedia.getPrimaryKey(), newsAndMedia,
			false);

		newsAndMedia.resetOriginalValues();

		return newsAndMedia;
	}

	protected NewsAndMedia toUnwrappedModel(NewsAndMedia newsAndMedia) {
		if (newsAndMedia instanceof NewsAndMediaImpl) {
			return newsAndMedia;
		}

		NewsAndMediaImpl newsAndMediaImpl = new NewsAndMediaImpl();

		newsAndMediaImpl.setNew(newsAndMedia.isNew());
		newsAndMediaImpl.setPrimaryKey(newsAndMedia.getPrimaryKey());

		newsAndMediaImpl.setSRNO(newsAndMedia.getSRNO());
		newsAndMediaImpl.setHDATE(newsAndMedia.getHDATE());
		newsAndMediaImpl.setHEADLINE(newsAndMedia.getHEADLINE());
		newsAndMediaImpl.setPUBLICATION(newsAndMedia.getPUBLICATION());
		newsAndMediaImpl.setDOCUMENT_NAME(newsAndMedia.getDOCUMENT_NAME());
		newsAndMediaImpl.setCREATEDATE(newsAndMedia.getCREATEDATE());

		return newsAndMediaImpl;
	}

	/**
	 * Returns the news and media with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the news and media
	 * @return the news and media
	 * @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	 */
	@Override
	public NewsAndMedia findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNewsAndMediaException {
		NewsAndMedia newsAndMedia = fetchByPrimaryKey(primaryKey);

		if (newsAndMedia == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNewsAndMediaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return newsAndMedia;
	}

	/**
	 * Returns the news and media with the primary key or throws a {@link NoSuchNewsAndMediaException} if it could not be found.
	 *
	 * @param SRNO the primary key of the news and media
	 * @return the news and media
	 * @throws NoSuchNewsAndMediaException if a news and media with the primary key could not be found
	 */
	@Override
	public NewsAndMedia findByPrimaryKey(long SRNO)
		throws NoSuchNewsAndMediaException {
		return findByPrimaryKey((Serializable)SRNO);
	}

	/**
	 * Returns the news and media with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the news and media
	 * @return the news and media, or <code>null</code> if a news and media with the primary key could not be found
	 */
	@Override
	public NewsAndMedia fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
				NewsAndMediaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		NewsAndMedia newsAndMedia = (NewsAndMedia)serializable;

		if (newsAndMedia == null) {
			Session session = null;

			try {
				session = openSession();

				newsAndMedia = (NewsAndMedia)session.get(NewsAndMediaImpl.class,
						primaryKey);

				if (newsAndMedia != null) {
					cacheResult(newsAndMedia);
				}
				else {
					entityCache.putResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
						NewsAndMediaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
					NewsAndMediaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return newsAndMedia;
	}

	/**
	 * Returns the news and media with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SRNO the primary key of the news and media
	 * @return the news and media, or <code>null</code> if a news and media with the primary key could not be found
	 */
	@Override
	public NewsAndMedia fetchByPrimaryKey(long SRNO) {
		return fetchByPrimaryKey((Serializable)SRNO);
	}

	@Override
	public Map<Serializable, NewsAndMedia> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, NewsAndMedia> map = new HashMap<Serializable, NewsAndMedia>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			NewsAndMedia newsAndMedia = fetchByPrimaryKey(primaryKey);

			if (newsAndMedia != null) {
				map.put(primaryKey, newsAndMedia);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
					NewsAndMediaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (NewsAndMedia)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_NEWSANDMEDIA_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (NewsAndMedia newsAndMedia : (List<NewsAndMedia>)q.list()) {
				map.put(newsAndMedia.getPrimaryKeyObj(), newsAndMedia);

				cacheResult(newsAndMedia);

				uncachedPrimaryKeys.remove(newsAndMedia.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(NewsAndMediaModelImpl.ENTITY_CACHE_ENABLED,
					NewsAndMediaImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the news and medias.
	 *
	 * @return the news and medias
	 */
	@Override
	public List<NewsAndMedia> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<NewsAndMedia> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<NewsAndMedia> findAll(int start, int end,
		OrderByComparator<NewsAndMedia> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<NewsAndMedia> findAll(int start, int end,
		OrderByComparator<NewsAndMedia> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<NewsAndMedia> list = null;

		if (retrieveFromCache) {
			list = (List<NewsAndMedia>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_NEWSANDMEDIA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_NEWSANDMEDIA;

				if (pagination) {
					sql = sql.concat(NewsAndMediaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<NewsAndMedia>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<NewsAndMedia>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the news and medias from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NewsAndMedia newsAndMedia : findAll()) {
			remove(newsAndMedia);
		}
	}

	/**
	 * Returns the number of news and medias.
	 *
	 * @return the number of news and medias
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_NEWSANDMEDIA);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NewsAndMediaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the news and media persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(NewsAndMediaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_NEWSANDMEDIA = "SELECT newsAndMedia FROM NewsAndMedia newsAndMedia";
	private static final String _SQL_SELECT_NEWSANDMEDIA_WHERE_PKS_IN = "SELECT newsAndMedia FROM NewsAndMedia newsAndMedia WHERE SRNO IN (";
	private static final String _SQL_COUNT_NEWSANDMEDIA = "SELECT COUNT(newsAndMedia) FROM NewsAndMedia newsAndMedia";
	private static final String _ORDER_BY_ENTITY_ALIAS = "newsAndMedia.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No NewsAndMedia exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(NewsAndMediaPersistenceImpl.class);
}