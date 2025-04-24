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

package com.rinfra.satisfactionsurvey.service.persistence.impl;

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

import com.rinfra.satisfactionsurvey.exception.NoSuchShareholdersException;
import com.rinfra.satisfactionsurvey.model.Shareholders;
import com.rinfra.satisfactionsurvey.model.impl.ShareholdersImpl;
import com.rinfra.satisfactionsurvey.model.impl.ShareholdersModelImpl;
import com.rinfra.satisfactionsurvey.service.persistence.ShareholdersPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the shareholders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh
 * @see ShareholdersPersistence
 * @see com.rinfra.satisfactionsurvey.service.persistence.ShareholdersUtil
 * @generated
 */
@ProviderType
public class ShareholdersPersistenceImpl extends BasePersistenceImpl<Shareholders>
	implements ShareholdersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ShareholdersUtil} to access the shareholders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ShareholdersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
			ShareholdersModelImpl.FINDER_CACHE_ENABLED, ShareholdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
			ShareholdersModelImpl.FINDER_CACHE_ENABLED, ShareholdersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
			ShareholdersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ShareholdersPersistenceImpl() {
		setModelClass(Shareholders.class);
	}

	/**
	 * Caches the shareholders in the entity cache if it is enabled.
	 *
	 * @param shareholders the shareholders
	 */
	@Override
	public void cacheResult(Shareholders shareholders) {
		entityCache.putResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
			ShareholdersImpl.class, shareholders.getPrimaryKey(), shareholders);

		shareholders.resetOriginalValues();
	}

	/**
	 * Caches the shareholderses in the entity cache if it is enabled.
	 *
	 * @param shareholderses the shareholderses
	 */
	@Override
	public void cacheResult(List<Shareholders> shareholderses) {
		for (Shareholders shareholders : shareholderses) {
			if (entityCache.getResult(
						ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
						ShareholdersImpl.class, shareholders.getPrimaryKey()) == null) {
				cacheResult(shareholders);
			}
			else {
				shareholders.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all shareholderses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ShareholdersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the shareholders.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Shareholders shareholders) {
		entityCache.removeResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
			ShareholdersImpl.class, shareholders.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Shareholders> shareholderses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Shareholders shareholders : shareholderses) {
			entityCache.removeResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
				ShareholdersImpl.class, shareholders.getPrimaryKey());
		}
	}

	/**
	 * Creates a new shareholders with the primary key. Does not add the shareholders to the database.
	 *
	 * @param SOLE_ID the primary key for the new shareholders
	 * @return the new shareholders
	 */
	@Override
	public Shareholders create(long SOLE_ID) {
		Shareholders shareholders = new ShareholdersImpl();

		shareholders.setNew(true);
		shareholders.setPrimaryKey(SOLE_ID);

		return shareholders;
	}

	/**
	 * Removes the shareholders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SOLE_ID the primary key of the shareholders
	 * @return the shareholders that was removed
	 * @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	 */
	@Override
	public Shareholders remove(long SOLE_ID) throws NoSuchShareholdersException {
		return remove((Serializable)SOLE_ID);
	}

	/**
	 * Removes the shareholders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the shareholders
	 * @return the shareholders that was removed
	 * @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	 */
	@Override
	public Shareholders remove(Serializable primaryKey)
		throws NoSuchShareholdersException {
		Session session = null;

		try {
			session = openSession();

			Shareholders shareholders = (Shareholders)session.get(ShareholdersImpl.class,
					primaryKey);

			if (shareholders == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShareholdersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shareholders);
		}
		catch (NoSuchShareholdersException nsee) {
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
	protected Shareholders removeImpl(Shareholders shareholders) {
		shareholders = toUnwrappedModel(shareholders);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shareholders)) {
				shareholders = (Shareholders)session.get(ShareholdersImpl.class,
						shareholders.getPrimaryKeyObj());
			}

			if (shareholders != null) {
				session.delete(shareholders);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (shareholders != null) {
			clearCache(shareholders);
		}

		return shareholders;
	}

	@Override
	public Shareholders updateImpl(Shareholders shareholders) {
		shareholders = toUnwrappedModel(shareholders);

		boolean isNew = shareholders.isNew();

		Session session = null;

		try {
			session = openSession();

			if (shareholders.isNew()) {
				session.save(shareholders);

				shareholders.setNew(false);
			}
			else {
				shareholders = (Shareholders)session.merge(shareholders);
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

		entityCache.putResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
			ShareholdersImpl.class, shareholders.getPrimaryKey(), shareholders,
			false);

		shareholders.resetOriginalValues();

		return shareholders;
	}

	protected Shareholders toUnwrappedModel(Shareholders shareholders) {
		if (shareholders instanceof ShareholdersImpl) {
			return shareholders;
		}

		ShareholdersImpl shareholdersImpl = new ShareholdersImpl();

		shareholdersImpl.setNew(shareholders.isNew());
		shareholdersImpl.setPrimaryKey(shareholders.getPrimaryKey());

		shareholdersImpl.setSHAREHOLDERSID(shareholders.getSHAREHOLDERSID());
		shareholdersImpl.setSOLE_ID(shareholders.getSOLE_ID());
		shareholdersImpl.setSOLE_NAME(shareholders.getSOLE_NAME());
		shareholdersImpl.setID_NUMBER(shareholders.getID_NUMBER());
		shareholdersImpl.setMOBILE(shareholders.getMOBILE());
		shareholdersImpl.setTELEPHONE(shareholders.getTELEPHONE());
		shareholdersImpl.setEMAIL(shareholders.getEMAIL());
		shareholdersImpl.setQUERY_RESPONSE(shareholders.getQUERY_RESPONSE());
		shareholdersImpl.setOVERALL_RATING(shareholders.getOVERALL_RATING());
		shareholdersImpl.setCOMP_INFORMATION(shareholders.getCOMP_INFORMATION());
		shareholdersImpl.setQUALITY_REPORT(shareholders.getQUALITY_REPORT());
		shareholdersImpl.setDESCRIPTION(shareholders.getDESCRIPTION());
		shareholdersImpl.setCOMMENTS(shareholders.getCOMMENTS());
		shareholdersImpl.setGRIEVANCE(shareholders.getGRIEVANCE());

		return shareholdersImpl;
	}

	/**
	 * Returns the shareholders with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the shareholders
	 * @return the shareholders
	 * @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	 */
	@Override
	public Shareholders findByPrimaryKey(Serializable primaryKey)
		throws NoSuchShareholdersException {
		Shareholders shareholders = fetchByPrimaryKey(primaryKey);

		if (shareholders == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchShareholdersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return shareholders;
	}

	/**
	 * Returns the shareholders with the primary key or throws a {@link NoSuchShareholdersException} if it could not be found.
	 *
	 * @param SOLE_ID the primary key of the shareholders
	 * @return the shareholders
	 * @throws NoSuchShareholdersException if a shareholders with the primary key could not be found
	 */
	@Override
	public Shareholders findByPrimaryKey(long SOLE_ID)
		throws NoSuchShareholdersException {
		return findByPrimaryKey((Serializable)SOLE_ID);
	}

	/**
	 * Returns the shareholders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the shareholders
	 * @return the shareholders, or <code>null</code> if a shareholders with the primary key could not be found
	 */
	@Override
	public Shareholders fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
				ShareholdersImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Shareholders shareholders = (Shareholders)serializable;

		if (shareholders == null) {
			Session session = null;

			try {
				session = openSession();

				shareholders = (Shareholders)session.get(ShareholdersImpl.class,
						primaryKey);

				if (shareholders != null) {
					cacheResult(shareholders);
				}
				else {
					entityCache.putResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
						ShareholdersImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
					ShareholdersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return shareholders;
	}

	/**
	 * Returns the shareholders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SOLE_ID the primary key of the shareholders
	 * @return the shareholders, or <code>null</code> if a shareholders with the primary key could not be found
	 */
	@Override
	public Shareholders fetchByPrimaryKey(long SOLE_ID) {
		return fetchByPrimaryKey((Serializable)SOLE_ID);
	}

	@Override
	public Map<Serializable, Shareholders> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Shareholders> map = new HashMap<Serializable, Shareholders>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Shareholders shareholders = fetchByPrimaryKey(primaryKey);

			if (shareholders != null) {
				map.put(primaryKey, shareholders);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
					ShareholdersImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Shareholders)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SHAREHOLDERS_WHERE_PKS_IN);

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

			for (Shareholders shareholders : (List<Shareholders>)q.list()) {
				map.put(shareholders.getPrimaryKeyObj(), shareholders);

				cacheResult(shareholders);

				uncachedPrimaryKeys.remove(shareholders.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ShareholdersModelImpl.ENTITY_CACHE_ENABLED,
					ShareholdersImpl.class, primaryKey, nullModel);
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
	 * Returns all the shareholderses.
	 *
	 * @return the shareholderses
	 */
	@Override
	public List<Shareholders> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the shareholderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholderses
	 * @param end the upper bound of the range of shareholderses (not inclusive)
	 * @return the range of shareholderses
	 */
	@Override
	public List<Shareholders> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the shareholderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholderses
	 * @param end the upper bound of the range of shareholderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of shareholderses
	 */
	@Override
	public List<Shareholders> findAll(int start, int end,
		OrderByComparator<Shareholders> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the shareholderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareholdersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of shareholderses
	 * @param end the upper bound of the range of shareholderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of shareholderses
	 */
	@Override
	public List<Shareholders> findAll(int start, int end,
		OrderByComparator<Shareholders> orderByComparator,
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

		List<Shareholders> list = null;

		if (retrieveFromCache) {
			list = (List<Shareholders>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SHAREHOLDERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SHAREHOLDERS;

				if (pagination) {
					sql = sql.concat(ShareholdersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Shareholders>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Shareholders>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the shareholderses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Shareholders shareholders : findAll()) {
			remove(shareholders);
		}
	}

	/**
	 * Returns the number of shareholderses.
	 *
	 * @return the number of shareholderses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SHAREHOLDERS);

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
		return ShareholdersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the shareholders persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ShareholdersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SHAREHOLDERS = "SELECT shareholders FROM Shareholders shareholders";
	private static final String _SQL_SELECT_SHAREHOLDERS_WHERE_PKS_IN = "SELECT shareholders FROM Shareholders shareholders WHERE SOLE_ID IN (";
	private static final String _SQL_COUNT_SHAREHOLDERS = "SELECT COUNT(shareholders) FROM Shareholders shareholders";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shareholders.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Shareholders exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ShareholdersPersistenceImpl.class);
}