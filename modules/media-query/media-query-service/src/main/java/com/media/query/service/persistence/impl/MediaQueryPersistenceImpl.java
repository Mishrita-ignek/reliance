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

package com.media.query.service.persistence.impl;

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
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.media.query.exception.NoSuchMediaQueryException;
import com.media.query.model.MediaQuery;
import com.media.query.model.impl.MediaQueryImpl;
import com.media.query.model.impl.MediaQueryModelImpl;
import com.media.query.service.persistence.MediaQueryPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the media query service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MediaQueryPersistence
 * @see com.media.query.service.persistence.MediaQueryUtil
 * @generated
 */
@ProviderType
public class MediaQueryPersistenceImpl extends BasePersistenceImpl<MediaQuery>
	implements MediaQueryPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MediaQueryUtil} to access the media query persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MediaQueryImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
			MediaQueryModelImpl.FINDER_CACHE_ENABLED, MediaQueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
			MediaQueryModelImpl.FINDER_CACHE_ENABLED, MediaQueryImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
			MediaQueryModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MediaQueryPersistenceImpl() {
		setModelClass(MediaQuery.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("srNo", "SR_NO");
			dbColumnNames.put("journalistName", "JOURNALIST_NAME");
			dbColumnNames.put("newsOrganisationName", "ORGANISATION_NAME");
			dbColumnNames.put("organisationType", "ORGANISATION_TYPE");
			dbColumnNames.put("mobile", "MOBILE");
			dbColumnNames.put("email", "EMAIL");
			dbColumnNames.put("subject", "SUBJECT");
			dbColumnNames.put("mediaQuery", "MEDIAQUERY");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the media query in the entity cache if it is enabled.
	 *
	 * @param mediaQuery the media query
	 */
	@Override
	public void cacheResult(MediaQuery mediaQuery) {
		entityCache.putResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
			MediaQueryImpl.class, mediaQuery.getPrimaryKey(), mediaQuery);

		mediaQuery.resetOriginalValues();
	}

	/**
	 * Caches the media queries in the entity cache if it is enabled.
	 *
	 * @param mediaQueries the media queries
	 */
	@Override
	public void cacheResult(List<MediaQuery> mediaQueries) {
		for (MediaQuery mediaQuery : mediaQueries) {
			if (entityCache.getResult(
						MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
						MediaQueryImpl.class, mediaQuery.getPrimaryKey()) == null) {
				cacheResult(mediaQuery);
			}
			else {
				mediaQuery.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all media queries.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MediaQueryImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the media query.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MediaQuery mediaQuery) {
		entityCache.removeResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
			MediaQueryImpl.class, mediaQuery.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MediaQuery> mediaQueries) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MediaQuery mediaQuery : mediaQueries) {
			entityCache.removeResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
				MediaQueryImpl.class, mediaQuery.getPrimaryKey());
		}
	}

	/**
	 * Creates a new media query with the primary key. Does not add the media query to the database.
	 *
	 * @param srNo the primary key for the new media query
	 * @return the new media query
	 */
	@Override
	public MediaQuery create(long srNo) {
		MediaQuery mediaQuery = new MediaQueryImpl();

		mediaQuery.setNew(true);
		mediaQuery.setPrimaryKey(srNo);

		return mediaQuery;
	}

	/**
	 * Removes the media query with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param srNo the primary key of the media query
	 * @return the media query that was removed
	 * @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	 */
	@Override
	public MediaQuery remove(long srNo) throws NoSuchMediaQueryException {
		return remove((Serializable)srNo);
	}

	/**
	 * Removes the media query with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the media query
	 * @return the media query that was removed
	 * @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	 */
	@Override
	public MediaQuery remove(Serializable primaryKey)
		throws NoSuchMediaQueryException {
		Session session = null;

		try {
			session = openSession();

			MediaQuery mediaQuery = (MediaQuery)session.get(MediaQueryImpl.class,
					primaryKey);

			if (mediaQuery == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMediaQueryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(mediaQuery);
		}
		catch (NoSuchMediaQueryException nsee) {
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
	protected MediaQuery removeImpl(MediaQuery mediaQuery) {
		mediaQuery = toUnwrappedModel(mediaQuery);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(mediaQuery)) {
				mediaQuery = (MediaQuery)session.get(MediaQueryImpl.class,
						mediaQuery.getPrimaryKeyObj());
			}

			if (mediaQuery != null) {
				session.delete(mediaQuery);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (mediaQuery != null) {
			clearCache(mediaQuery);
		}

		return mediaQuery;
	}

	@Override
	public MediaQuery updateImpl(MediaQuery mediaQuery) {
		mediaQuery = toUnwrappedModel(mediaQuery);

		boolean isNew = mediaQuery.isNew();

		Session session = null;

		try {
			session = openSession();

			if (mediaQuery.isNew()) {
				session.save(mediaQuery);

				mediaQuery.setNew(false);
			}
			else {
				mediaQuery = (MediaQuery)session.merge(mediaQuery);
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

		entityCache.putResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
			MediaQueryImpl.class, mediaQuery.getPrimaryKey(), mediaQuery, false);

		mediaQuery.resetOriginalValues();

		return mediaQuery;
	}

	protected MediaQuery toUnwrappedModel(MediaQuery mediaQuery) {
		if (mediaQuery instanceof MediaQueryImpl) {
			return mediaQuery;
		}

		MediaQueryImpl mediaQueryImpl = new MediaQueryImpl();

		mediaQueryImpl.setNew(mediaQuery.isNew());
		mediaQueryImpl.setPrimaryKey(mediaQuery.getPrimaryKey());

		mediaQueryImpl.setSrNo(mediaQuery.getSrNo());
		mediaQueryImpl.setJournalistName(mediaQuery.getJournalistName());
		mediaQueryImpl.setNewsOrganisationName(mediaQuery.getNewsOrganisationName());
		mediaQueryImpl.setOrganisationType(mediaQuery.getOrganisationType());
		mediaQueryImpl.setMobile(mediaQuery.getMobile());
		mediaQueryImpl.setEmail(mediaQuery.getEmail());
		mediaQueryImpl.setSubject(mediaQuery.getSubject());
		mediaQueryImpl.setMediaQuery(mediaQuery.getMediaQuery());

		return mediaQueryImpl;
	}

	/**
	 * Returns the media query with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the media query
	 * @return the media query
	 * @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	 */
	@Override
	public MediaQuery findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMediaQueryException {
		MediaQuery mediaQuery = fetchByPrimaryKey(primaryKey);

		if (mediaQuery == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMediaQueryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return mediaQuery;
	}

	/**
	 * Returns the media query with the primary key or throws a {@link NoSuchMediaQueryException} if it could not be found.
	 *
	 * @param srNo the primary key of the media query
	 * @return the media query
	 * @throws NoSuchMediaQueryException if a media query with the primary key could not be found
	 */
	@Override
	public MediaQuery findByPrimaryKey(long srNo)
		throws NoSuchMediaQueryException {
		return findByPrimaryKey((Serializable)srNo);
	}

	/**
	 * Returns the media query with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the media query
	 * @return the media query, or <code>null</code> if a media query with the primary key could not be found
	 */
	@Override
	public MediaQuery fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
				MediaQueryImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		MediaQuery mediaQuery = (MediaQuery)serializable;

		if (mediaQuery == null) {
			Session session = null;

			try {
				session = openSession();

				mediaQuery = (MediaQuery)session.get(MediaQueryImpl.class,
						primaryKey);

				if (mediaQuery != null) {
					cacheResult(mediaQuery);
				}
				else {
					entityCache.putResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
						MediaQueryImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
					MediaQueryImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return mediaQuery;
	}

	/**
	 * Returns the media query with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param srNo the primary key of the media query
	 * @return the media query, or <code>null</code> if a media query with the primary key could not be found
	 */
	@Override
	public MediaQuery fetchByPrimaryKey(long srNo) {
		return fetchByPrimaryKey((Serializable)srNo);
	}

	@Override
	public Map<Serializable, MediaQuery> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, MediaQuery> map = new HashMap<Serializable, MediaQuery>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			MediaQuery mediaQuery = fetchByPrimaryKey(primaryKey);

			if (mediaQuery != null) {
				map.put(primaryKey, mediaQuery);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
					MediaQueryImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (MediaQuery)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_MEDIAQUERY_WHERE_PKS_IN);

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

			for (MediaQuery mediaQuery : (List<MediaQuery>)q.list()) {
				map.put(mediaQuery.getPrimaryKeyObj(), mediaQuery);

				cacheResult(mediaQuery);

				uncachedPrimaryKeys.remove(mediaQuery.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(MediaQueryModelImpl.ENTITY_CACHE_ENABLED,
					MediaQueryImpl.class, primaryKey, nullModel);
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
	 * Returns all the media queries.
	 *
	 * @return the media queries
	 */
	@Override
	public List<MediaQuery> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the media queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of media queries
	 * @param end the upper bound of the range of media queries (not inclusive)
	 * @return the range of media queries
	 */
	@Override
	public List<MediaQuery> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the media queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of media queries
	 * @param end the upper bound of the range of media queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of media queries
	 */
	@Override
	public List<MediaQuery> findAll(int start, int end,
		OrderByComparator<MediaQuery> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the media queries.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MediaQueryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of media queries
	 * @param end the upper bound of the range of media queries (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of media queries
	 */
	@Override
	public List<MediaQuery> findAll(int start, int end,
		OrderByComparator<MediaQuery> orderByComparator,
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

		List<MediaQuery> list = null;

		if (retrieveFromCache) {
			list = (List<MediaQuery>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_MEDIAQUERY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MEDIAQUERY;

				if (pagination) {
					sql = sql.concat(MediaQueryModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MediaQuery>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<MediaQuery>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the media queries from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MediaQuery mediaQuery : findAll()) {
			remove(mediaQuery);
		}
	}

	/**
	 * Returns the number of media queries.
	 *
	 * @return the number of media queries
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MEDIAQUERY);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MediaQueryModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the media query persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(MediaQueryImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_MEDIAQUERY = "SELECT mediaQuery FROM MediaQuery mediaQuery";
	private static final String _SQL_SELECT_MEDIAQUERY_WHERE_PKS_IN = "SELECT mediaQuery FROM MediaQuery mediaQuery WHERE SR_NO IN (";
	private static final String _SQL_COUNT_MEDIAQUERY = "SELECT COUNT(mediaQuery) FROM MediaQuery mediaQuery";
	private static final String _ORDER_BY_ENTITY_ALIAS = "mediaQuery.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MediaQuery exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(MediaQueryPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"srNo", "journalistName", "newsOrganisationName",
				"organisationType", "mobile", "email", "subject", "mediaQuery"
			});
}