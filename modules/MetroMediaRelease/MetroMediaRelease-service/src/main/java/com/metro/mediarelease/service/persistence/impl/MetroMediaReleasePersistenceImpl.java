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

package com.metro.mediarelease.service.persistence.impl;

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

import com.metro.mediarelease.exception.NoSuchMetroMediaReleaseException;
import com.metro.mediarelease.model.MetroMediaRelease;
import com.metro.mediarelease.model.impl.MetroMediaReleaseImpl;
import com.metro.mediarelease.model.impl.MetroMediaReleaseModelImpl;
import com.metro.mediarelease.service.persistence.MetroMediaReleasePersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the metro media release service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MetroMediaReleasePersistence
 * @see com.metro.mediarelease.service.persistence.MetroMediaReleaseUtil
 * @generated
 */
@ProviderType
public class MetroMediaReleasePersistenceImpl extends BasePersistenceImpl<MetroMediaRelease>
	implements MetroMediaReleasePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link MetroMediaReleaseUtil} to access the metro media release persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = MetroMediaReleaseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
			MetroMediaReleaseModelImpl.FINDER_CACHE_ENABLED,
			MetroMediaReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
			MetroMediaReleaseModelImpl.FINDER_CACHE_ENABLED,
			MetroMediaReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
			MetroMediaReleaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public MetroMediaReleasePersistenceImpl() {
		setModelClass(MetroMediaRelease.class);
	}

	/**
	 * Caches the metro media release in the entity cache if it is enabled.
	 *
	 * @param metroMediaRelease the metro media release
	 */
	@Override
	public void cacheResult(MetroMediaRelease metroMediaRelease) {
		entityCache.putResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
			MetroMediaReleaseImpl.class, metroMediaRelease.getPrimaryKey(),
			metroMediaRelease);

		metroMediaRelease.resetOriginalValues();
	}

	/**
	 * Caches the metro media releases in the entity cache if it is enabled.
	 *
	 * @param metroMediaReleases the metro media releases
	 */
	@Override
	public void cacheResult(List<MetroMediaRelease> metroMediaReleases) {
		for (MetroMediaRelease metroMediaRelease : metroMediaReleases) {
			if (entityCache.getResult(
						MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
						MetroMediaReleaseImpl.class,
						metroMediaRelease.getPrimaryKey()) == null) {
				cacheResult(metroMediaRelease);
			}
			else {
				metroMediaRelease.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all metro media releases.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MetroMediaReleaseImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the metro media release.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MetroMediaRelease metroMediaRelease) {
		entityCache.removeResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
			MetroMediaReleaseImpl.class, metroMediaRelease.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<MetroMediaRelease> metroMediaReleases) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (MetroMediaRelease metroMediaRelease : metroMediaReleases) {
			entityCache.removeResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
				MetroMediaReleaseImpl.class, metroMediaRelease.getPrimaryKey());
		}
	}

	/**
	 * Creates a new metro media release with the primary key. Does not add the metro media release to the database.
	 *
	 * @param SRNO the primary key for the new metro media release
	 * @return the new metro media release
	 */
	@Override
	public MetroMediaRelease create(long SRNO) {
		MetroMediaRelease metroMediaRelease = new MetroMediaReleaseImpl();

		metroMediaRelease.setNew(true);
		metroMediaRelease.setPrimaryKey(SRNO);

		return metroMediaRelease;
	}

	/**
	 * Removes the metro media release with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SRNO the primary key of the metro media release
	 * @return the metro media release that was removed
	 * @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	 */
	@Override
	public MetroMediaRelease remove(long SRNO)
		throws NoSuchMetroMediaReleaseException {
		return remove((Serializable)SRNO);
	}

	/**
	 * Removes the metro media release with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the metro media release
	 * @return the metro media release that was removed
	 * @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	 */
	@Override
	public MetroMediaRelease remove(Serializable primaryKey)
		throws NoSuchMetroMediaReleaseException {
		Session session = null;

		try {
			session = openSession();

			MetroMediaRelease metroMediaRelease = (MetroMediaRelease)session.get(MetroMediaReleaseImpl.class,
					primaryKey);

			if (metroMediaRelease == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMetroMediaReleaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(metroMediaRelease);
		}
		catch (NoSuchMetroMediaReleaseException nsee) {
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
	protected MetroMediaRelease removeImpl(MetroMediaRelease metroMediaRelease) {
		metroMediaRelease = toUnwrappedModel(metroMediaRelease);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(metroMediaRelease)) {
				metroMediaRelease = (MetroMediaRelease)session.get(MetroMediaReleaseImpl.class,
						metroMediaRelease.getPrimaryKeyObj());
			}

			if (metroMediaRelease != null) {
				session.delete(metroMediaRelease);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (metroMediaRelease != null) {
			clearCache(metroMediaRelease);
		}

		return metroMediaRelease;
	}

	@Override
	public MetroMediaRelease updateImpl(MetroMediaRelease metroMediaRelease) {
		metroMediaRelease = toUnwrappedModel(metroMediaRelease);

		boolean isNew = metroMediaRelease.isNew();

		Session session = null;

		try {
			session = openSession();

			if (metroMediaRelease.isNew()) {
				session.save(metroMediaRelease);

				metroMediaRelease.setNew(false);
			}
			else {
				metroMediaRelease = (MetroMediaRelease)session.merge(metroMediaRelease);
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

		entityCache.putResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
			MetroMediaReleaseImpl.class, metroMediaRelease.getPrimaryKey(),
			metroMediaRelease, false);

		metroMediaRelease.resetOriginalValues();

		return metroMediaRelease;
	}

	protected MetroMediaRelease toUnwrappedModel(
		MetroMediaRelease metroMediaRelease) {
		if (metroMediaRelease instanceof MetroMediaReleaseImpl) {
			return metroMediaRelease;
		}

		MetroMediaReleaseImpl metroMediaReleaseImpl = new MetroMediaReleaseImpl();

		metroMediaReleaseImpl.setNew(metroMediaRelease.isNew());
		metroMediaReleaseImpl.setPrimaryKey(metroMediaRelease.getPrimaryKey());

		metroMediaReleaseImpl.setSRNO(metroMediaRelease.getSRNO());
		metroMediaReleaseImpl.setHDATE(metroMediaRelease.getHDATE());
		metroMediaReleaseImpl.setHEADLINE(metroMediaRelease.getHEADLINE());
		metroMediaReleaseImpl.setDOCUMENT_NAME(metroMediaRelease.getDOCUMENT_NAME());
		metroMediaReleaseImpl.setCREATEDATE(metroMediaRelease.getCREATEDATE());

		return metroMediaReleaseImpl;
	}

	/**
	 * Returns the metro media release with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the metro media release
	 * @return the metro media release
	 * @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	 */
	@Override
	public MetroMediaRelease findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMetroMediaReleaseException {
		MetroMediaRelease metroMediaRelease = fetchByPrimaryKey(primaryKey);

		if (metroMediaRelease == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMetroMediaReleaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return metroMediaRelease;
	}

	/**
	 * Returns the metro media release with the primary key or throws a {@link NoSuchMetroMediaReleaseException} if it could not be found.
	 *
	 * @param SRNO the primary key of the metro media release
	 * @return the metro media release
	 * @throws NoSuchMetroMediaReleaseException if a metro media release with the primary key could not be found
	 */
	@Override
	public MetroMediaRelease findByPrimaryKey(long SRNO)
		throws NoSuchMetroMediaReleaseException {
		return findByPrimaryKey((Serializable)SRNO);
	}

	/**
	 * Returns the metro media release with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the metro media release
	 * @return the metro media release, or <code>null</code> if a metro media release with the primary key could not be found
	 */
	@Override
	public MetroMediaRelease fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
				MetroMediaReleaseImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		MetroMediaRelease metroMediaRelease = (MetroMediaRelease)serializable;

		if (metroMediaRelease == null) {
			Session session = null;

			try {
				session = openSession();

				metroMediaRelease = (MetroMediaRelease)session.get(MetroMediaReleaseImpl.class,
						primaryKey);

				if (metroMediaRelease != null) {
					cacheResult(metroMediaRelease);
				}
				else {
					entityCache.putResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
						MetroMediaReleaseImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
					MetroMediaReleaseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return metroMediaRelease;
	}

	/**
	 * Returns the metro media release with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SRNO the primary key of the metro media release
	 * @return the metro media release, or <code>null</code> if a metro media release with the primary key could not be found
	 */
	@Override
	public MetroMediaRelease fetchByPrimaryKey(long SRNO) {
		return fetchByPrimaryKey((Serializable)SRNO);
	}

	@Override
	public Map<Serializable, MetroMediaRelease> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, MetroMediaRelease> map = new HashMap<Serializable, MetroMediaRelease>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			MetroMediaRelease metroMediaRelease = fetchByPrimaryKey(primaryKey);

			if (metroMediaRelease != null) {
				map.put(primaryKey, metroMediaRelease);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
					MetroMediaReleaseImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (MetroMediaRelease)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_METROMEDIARELEASE_WHERE_PKS_IN);

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

			for (MetroMediaRelease metroMediaRelease : (List<MetroMediaRelease>)q.list()) {
				map.put(metroMediaRelease.getPrimaryKeyObj(), metroMediaRelease);

				cacheResult(metroMediaRelease);

				uncachedPrimaryKeys.remove(metroMediaRelease.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(MetroMediaReleaseModelImpl.ENTITY_CACHE_ENABLED,
					MetroMediaReleaseImpl.class, primaryKey, nullModel);
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
	 * Returns all the metro media releases.
	 *
	 * @return the metro media releases
	 */
	@Override
	public List<MetroMediaRelease> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the metro media releases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of metro media releases
	 * @param end the upper bound of the range of metro media releases (not inclusive)
	 * @return the range of metro media releases
	 */
	@Override
	public List<MetroMediaRelease> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the metro media releases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of metro media releases
	 * @param end the upper bound of the range of metro media releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of metro media releases
	 */
	@Override
	public List<MetroMediaRelease> findAll(int start, int end,
		OrderByComparator<MetroMediaRelease> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the metro media releases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link MetroMediaReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of metro media releases
	 * @param end the upper bound of the range of metro media releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of metro media releases
	 */
	@Override
	public List<MetroMediaRelease> findAll(int start, int end,
		OrderByComparator<MetroMediaRelease> orderByComparator,
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

		List<MetroMediaRelease> list = null;

		if (retrieveFromCache) {
			list = (List<MetroMediaRelease>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_METROMEDIARELEASE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_METROMEDIARELEASE;

				if (pagination) {
					sql = sql.concat(MetroMediaReleaseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<MetroMediaRelease>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<MetroMediaRelease>)QueryUtil.list(q,
							getDialect(), start, end);
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
	 * Removes all the metro media releases from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MetroMediaRelease metroMediaRelease : findAll()) {
			remove(metroMediaRelease);
		}
	}

	/**
	 * Returns the number of metro media releases.
	 *
	 * @return the number of metro media releases
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_METROMEDIARELEASE);

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
		return MetroMediaReleaseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the metro media release persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(MetroMediaReleaseImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_METROMEDIARELEASE = "SELECT metroMediaRelease FROM MetroMediaRelease metroMediaRelease";
	private static final String _SQL_SELECT_METROMEDIARELEASE_WHERE_PKS_IN = "SELECT metroMediaRelease FROM MetroMediaRelease metroMediaRelease WHERE SRNO IN (";
	private static final String _SQL_COUNT_METROMEDIARELEASE = "SELECT COUNT(metroMediaRelease) FROM MetroMediaRelease metroMediaRelease";
	private static final String _ORDER_BY_ENTITY_ALIAS = "metroMediaRelease.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No MetroMediaRelease exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(MetroMediaReleasePersistenceImpl.class);
}