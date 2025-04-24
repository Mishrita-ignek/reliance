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

package rpower.shareholders.doc.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import rpower.shareholders.doc.exception.NoSuchRpowerShareHoldersException;
import rpower.shareholders.doc.model.RpowerShareHolders;
import rpower.shareholders.doc.model.impl.RpowerShareHoldersImpl;
import rpower.shareholders.doc.model.impl.RpowerShareHoldersModelImpl;
import rpower.shareholders.doc.service.persistence.RpowerShareHoldersPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the rpower share holders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersPersistence
 * @see rpower.shareholders.doc.service.persistence.RpowerShareHoldersUtil
 * @generated
 */
@ProviderType
public class RpowerShareHoldersPersistenceImpl extends BasePersistenceImpl<RpowerShareHolders>
	implements RpowerShareHoldersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RpowerShareHoldersUtil} to access the rpower share holders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RpowerShareHoldersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersModelImpl.FINDER_CACHE_ENABLED,
			RpowerShareHoldersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersModelImpl.FINDER_CACHE_ENABLED,
			RpowerShareHoldersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RpowerShareHoldersPersistenceImpl() {
		setModelClass(RpowerShareHolders.class);
	}

	/**
	 * Caches the rpower share holders in the entity cache if it is enabled.
	 *
	 * @param rpowerShareHolders the rpower share holders
	 */
	@Override
	public void cacheResult(RpowerShareHolders rpowerShareHolders) {
		entityCache.putResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersImpl.class, rpowerShareHolders.getPrimaryKey(),
			rpowerShareHolders);

		rpowerShareHolders.resetOriginalValues();
	}

	/**
	 * Caches the rpower share holderses in the entity cache if it is enabled.
	 *
	 * @param rpowerShareHolderses the rpower share holderses
	 */
	@Override
	public void cacheResult(List<RpowerShareHolders> rpowerShareHolderses) {
		for (RpowerShareHolders rpowerShareHolders : rpowerShareHolderses) {
			if (entityCache.getResult(
						RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
						RpowerShareHoldersImpl.class,
						rpowerShareHolders.getPrimaryKey()) == null) {
				cacheResult(rpowerShareHolders);
			}
			else {
				rpowerShareHolders.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rpower share holderses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpowerShareHoldersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rpower share holders.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpowerShareHolders rpowerShareHolders) {
		entityCache.removeResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersImpl.class, rpowerShareHolders.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RpowerShareHolders> rpowerShareHolderses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RpowerShareHolders rpowerShareHolders : rpowerShareHolderses) {
			entityCache.removeResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
				RpowerShareHoldersImpl.class, rpowerShareHolders.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rpower share holders with the primary key. Does not add the rpower share holders to the database.
	 *
	 * @param FOLIO_NO the primary key for the new rpower share holders
	 * @return the new rpower share holders
	 */
	@Override
	public RpowerShareHolders create(String FOLIO_NO) {
		RpowerShareHolders rpowerShareHolders = new RpowerShareHoldersImpl();

		rpowerShareHolders.setNew(true);
		rpowerShareHolders.setPrimaryKey(FOLIO_NO);

		return rpowerShareHolders;
	}

	/**
	 * Removes the rpower share holders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FOLIO_NO the primary key of the rpower share holders
	 * @return the rpower share holders that was removed
	 * @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	 */
	@Override
	public RpowerShareHolders remove(String FOLIO_NO)
		throws NoSuchRpowerShareHoldersException {
		return remove((Serializable)FOLIO_NO);
	}

	/**
	 * Removes the rpower share holders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rpower share holders
	 * @return the rpower share holders that was removed
	 * @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	 */
	@Override
	public RpowerShareHolders remove(Serializable primaryKey)
		throws NoSuchRpowerShareHoldersException {
		Session session = null;

		try {
			session = openSession();

			RpowerShareHolders rpowerShareHolders = (RpowerShareHolders)session.get(RpowerShareHoldersImpl.class,
					primaryKey);

			if (rpowerShareHolders == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpowerShareHoldersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rpowerShareHolders);
		}
		catch (NoSuchRpowerShareHoldersException nsee) {
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
	protected RpowerShareHolders removeImpl(
		RpowerShareHolders rpowerShareHolders) {
		rpowerShareHolders = toUnwrappedModel(rpowerShareHolders);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpowerShareHolders)) {
				rpowerShareHolders = (RpowerShareHolders)session.get(RpowerShareHoldersImpl.class,
						rpowerShareHolders.getPrimaryKeyObj());
			}

			if (rpowerShareHolders != null) {
				session.delete(rpowerShareHolders);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rpowerShareHolders != null) {
			clearCache(rpowerShareHolders);
		}

		return rpowerShareHolders;
	}

	@Override
	public RpowerShareHolders updateImpl(RpowerShareHolders rpowerShareHolders) {
		rpowerShareHolders = toUnwrappedModel(rpowerShareHolders);

		boolean isNew = rpowerShareHolders.isNew();

		Session session = null;

		try {
			session = openSession();

			if (rpowerShareHolders.isNew()) {
				session.save(rpowerShareHolders);

				rpowerShareHolders.setNew(false);
			}
			else {
				rpowerShareHolders = (RpowerShareHolders)session.merge(rpowerShareHolders);
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

		entityCache.putResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersImpl.class, rpowerShareHolders.getPrimaryKey(),
			rpowerShareHolders, false);

		rpowerShareHolders.resetOriginalValues();

		return rpowerShareHolders;
	}

	protected RpowerShareHolders toUnwrappedModel(
		RpowerShareHolders rpowerShareHolders) {
		if (rpowerShareHolders instanceof RpowerShareHoldersImpl) {
			return rpowerShareHolders;
		}

		RpowerShareHoldersImpl rpowerShareHoldersImpl = new RpowerShareHoldersImpl();

		rpowerShareHoldersImpl.setNew(rpowerShareHolders.isNew());
		rpowerShareHoldersImpl.setPrimaryKey(rpowerShareHolders.getPrimaryKey());

		rpowerShareHoldersImpl.setSRNO(rpowerShareHolders.getSRNO());
		rpowerShareHoldersImpl.setFOLIO_NO(rpowerShareHolders.getFOLIO_NO());
		rpowerShareHoldersImpl.setSHARES(rpowerShareHolders.getSHARES());

		return rpowerShareHoldersImpl;
	}

	/**
	 * Returns the rpower share holders with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rpower share holders
	 * @return the rpower share holders
	 * @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	 */
	@Override
	public RpowerShareHolders findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpowerShareHoldersException {
		RpowerShareHolders rpowerShareHolders = fetchByPrimaryKey(primaryKey);

		if (rpowerShareHolders == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpowerShareHoldersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rpowerShareHolders;
	}

	/**
	 * Returns the rpower share holders with the primary key or throws a {@link NoSuchRpowerShareHoldersException} if it could not be found.
	 *
	 * @param FOLIO_NO the primary key of the rpower share holders
	 * @return the rpower share holders
	 * @throws NoSuchRpowerShareHoldersException if a rpower share holders with the primary key could not be found
	 */
	@Override
	public RpowerShareHolders findByPrimaryKey(String FOLIO_NO)
		throws NoSuchRpowerShareHoldersException {
		return findByPrimaryKey((Serializable)FOLIO_NO);
	}

	/**
	 * Returns the rpower share holders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rpower share holders
	 * @return the rpower share holders, or <code>null</code> if a rpower share holders with the primary key could not be found
	 */
	@Override
	public RpowerShareHolders fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
				RpowerShareHoldersImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RpowerShareHolders rpowerShareHolders = (RpowerShareHolders)serializable;

		if (rpowerShareHolders == null) {
			Session session = null;

			try {
				session = openSession();

				rpowerShareHolders = (RpowerShareHolders)session.get(RpowerShareHoldersImpl.class,
						primaryKey);

				if (rpowerShareHolders != null) {
					cacheResult(rpowerShareHolders);
				}
				else {
					entityCache.putResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
						RpowerShareHoldersImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
					RpowerShareHoldersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rpowerShareHolders;
	}

	/**
	 * Returns the rpower share holders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FOLIO_NO the primary key of the rpower share holders
	 * @return the rpower share holders, or <code>null</code> if a rpower share holders with the primary key could not be found
	 */
	@Override
	public RpowerShareHolders fetchByPrimaryKey(String FOLIO_NO) {
		return fetchByPrimaryKey((Serializable)FOLIO_NO);
	}

	@Override
	public Map<Serializable, RpowerShareHolders> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RpowerShareHolders> map = new HashMap<Serializable, RpowerShareHolders>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RpowerShareHolders rpowerShareHolders = fetchByPrimaryKey(primaryKey);

			if (rpowerShareHolders != null) {
				map.put(primaryKey, rpowerShareHolders);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
					RpowerShareHoldersImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (RpowerShareHolders)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RPOWERSHAREHOLDERS_WHERE_PKS_IN);

		for (int i = 0; i < uncachedPrimaryKeys.size(); i++) {
			query.append(StringPool.QUESTION);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			QueryPos qPos = QueryPos.getInstance(q);

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				qPos.add((String)primaryKey);
			}

			for (RpowerShareHolders rpowerShareHolders : (List<RpowerShareHolders>)q.list()) {
				map.put(rpowerShareHolders.getPrimaryKeyObj(),
					rpowerShareHolders);

				cacheResult(rpowerShareHolders);

				uncachedPrimaryKeys.remove(rpowerShareHolders.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RpowerShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
					RpowerShareHoldersImpl.class, primaryKey, nullModel);
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
	 * Returns all the rpower share holderses.
	 *
	 * @return the rpower share holderses
	 */
	@Override
	public List<RpowerShareHolders> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rpower share holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower share holderses
	 * @param end the upper bound of the range of rpower share holderses (not inclusive)
	 * @return the range of rpower share holderses
	 */
	@Override
	public List<RpowerShareHolders> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rpower share holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower share holderses
	 * @param end the upper bound of the range of rpower share holderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rpower share holderses
	 */
	@Override
	public List<RpowerShareHolders> findAll(int start, int end,
		OrderByComparator<RpowerShareHolders> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rpower share holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower share holderses
	 * @param end the upper bound of the range of rpower share holderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of rpower share holderses
	 */
	@Override
	public List<RpowerShareHolders> findAll(int start, int end,
		OrderByComparator<RpowerShareHolders> orderByComparator,
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

		List<RpowerShareHolders> list = null;

		if (retrieveFromCache) {
			list = (List<RpowerShareHolders>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RPOWERSHAREHOLDERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RPOWERSHAREHOLDERS;

				if (pagination) {
					sql = sql.concat(RpowerShareHoldersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RpowerShareHolders>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RpowerShareHolders>)QueryUtil.list(q,
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
	 * Removes all the rpower share holderses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpowerShareHolders rpowerShareHolders : findAll()) {
			remove(rpowerShareHolders);
		}
	}

	/**
	 * Returns the number of rpower share holderses.
	 *
	 * @return the number of rpower share holderses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RPOWERSHAREHOLDERS);

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
		return RpowerShareHoldersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rpower share holders persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RpowerShareHoldersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RPOWERSHAREHOLDERS = "SELECT rpowerShareHolders FROM RpowerShareHolders rpowerShareHolders";
	private static final String _SQL_SELECT_RPOWERSHAREHOLDERS_WHERE_PKS_IN = "SELECT rpowerShareHolders FROM RpowerShareHolders rpowerShareHolders WHERE FOLIO_NO IN (";
	private static final String _SQL_COUNT_RPOWERSHAREHOLDERS = "SELECT COUNT(rpowerShareHolders) FROM RpowerShareHolders rpowerShareHolders";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rpowerShareHolders.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RpowerShareHolders exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(RpowerShareHoldersPersistenceImpl.class);
}