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

package OCCModuleNew.service.persistence.impl;

import OCCModuleNew.exception.NoSuchOccMessageNewException;

import OCCModuleNew.model.OccMessageNew;

import OCCModuleNew.model.impl.OccMessageNewImpl;
import OCCModuleNew.model.impl.OccMessageNewModelImpl;

import OCCModuleNew.service.persistence.OccMessageNewPersistence;

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
 * The persistence implementation for the occ message new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh Patidar
 * @see OccMessageNewPersistence
 * @see OCCModuleNew.service.persistence.OccMessageNewUtil
 * @generated
 */
@ProviderType
public class OccMessageNewPersistenceImpl extends BasePersistenceImpl<OccMessageNew>
	implements OccMessageNewPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OccMessageNewUtil} to access the occ message new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OccMessageNewImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
			OccMessageNewModelImpl.FINDER_CACHE_ENABLED,
			OccMessageNewImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
			OccMessageNewModelImpl.FINDER_CACHE_ENABLED,
			OccMessageNewImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
			OccMessageNewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OccMessageNewPersistenceImpl() {
		setModelClass(OccMessageNew.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("ListName", "LISTNAME");
			dbColumnNames.put("Message", "MESSAGE");
			dbColumnNames.put("MSgSendDate", "MSGSENDDATE");
			dbColumnNames.put("Severity", "SEVERITY");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the occ message new in the entity cache if it is enabled.
	 *
	 * @param occMessageNew the occ message new
	 */
	@Override
	public void cacheResult(OccMessageNew occMessageNew) {
		entityCache.putResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
			OccMessageNewImpl.class, occMessageNew.getPrimaryKey(),
			occMessageNew);

		occMessageNew.resetOriginalValues();
	}

	/**
	 * Caches the occ message news in the entity cache if it is enabled.
	 *
	 * @param occMessageNews the occ message news
	 */
	@Override
	public void cacheResult(List<OccMessageNew> occMessageNews) {
		for (OccMessageNew occMessageNew : occMessageNews) {
			if (entityCache.getResult(
						OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
						OccMessageNewImpl.class, occMessageNew.getPrimaryKey()) == null) {
				cacheResult(occMessageNew);
			}
			else {
				occMessageNew.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all occ message news.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OccMessageNewImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the occ message new.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OccMessageNew occMessageNew) {
		entityCache.removeResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
			OccMessageNewImpl.class, occMessageNew.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OccMessageNew> occMessageNews) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OccMessageNew occMessageNew : occMessageNews) {
			entityCache.removeResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
				OccMessageNewImpl.class, occMessageNew.getPrimaryKey());
		}
	}

	/**
	 * Creates a new occ message new with the primary key. Does not add the occ message new to the database.
	 *
	 * @param MSG_ID the primary key for the new occ message new
	 * @return the new occ message new
	 */
	@Override
	public OccMessageNew create(long MSG_ID) {
		OccMessageNew occMessageNew = new OccMessageNewImpl();

		occMessageNew.setNew(true);
		occMessageNew.setPrimaryKey(MSG_ID);

		return occMessageNew;
	}

	/**
	 * Removes the occ message new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param MSG_ID the primary key of the occ message new
	 * @return the occ message new that was removed
	 * @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	 */
	@Override
	public OccMessageNew remove(long MSG_ID)
		throws NoSuchOccMessageNewException {
		return remove((Serializable)MSG_ID);
	}

	/**
	 * Removes the occ message new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the occ message new
	 * @return the occ message new that was removed
	 * @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	 */
	@Override
	public OccMessageNew remove(Serializable primaryKey)
		throws NoSuchOccMessageNewException {
		Session session = null;

		try {
			session = openSession();

			OccMessageNew occMessageNew = (OccMessageNew)session.get(OccMessageNewImpl.class,
					primaryKey);

			if (occMessageNew == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOccMessageNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(occMessageNew);
		}
		catch (NoSuchOccMessageNewException nsee) {
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
	protected OccMessageNew removeImpl(OccMessageNew occMessageNew) {
		occMessageNew = toUnwrappedModel(occMessageNew);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(occMessageNew)) {
				occMessageNew = (OccMessageNew)session.get(OccMessageNewImpl.class,
						occMessageNew.getPrimaryKeyObj());
			}

			if (occMessageNew != null) {
				session.delete(occMessageNew);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (occMessageNew != null) {
			clearCache(occMessageNew);
		}

		return occMessageNew;
	}

	@Override
	public OccMessageNew updateImpl(OccMessageNew occMessageNew) {
		occMessageNew = toUnwrappedModel(occMessageNew);

		boolean isNew = occMessageNew.isNew();

		Session session = null;

		try {
			session = openSession();

			if (occMessageNew.isNew()) {
				session.save(occMessageNew);

				occMessageNew.setNew(false);
			}
			else {
				occMessageNew = (OccMessageNew)session.merge(occMessageNew);
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

		entityCache.putResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
			OccMessageNewImpl.class, occMessageNew.getPrimaryKey(),
			occMessageNew, false);

		occMessageNew.resetOriginalValues();

		return occMessageNew;
	}

	protected OccMessageNew toUnwrappedModel(OccMessageNew occMessageNew) {
		if (occMessageNew instanceof OccMessageNewImpl) {
			return occMessageNew;
		}

		OccMessageNewImpl occMessageNewImpl = new OccMessageNewImpl();

		occMessageNewImpl.setNew(occMessageNew.isNew());
		occMessageNewImpl.setPrimaryKey(occMessageNew.getPrimaryKey());

		occMessageNewImpl.setMSG_ID(occMessageNew.getMSG_ID());
		occMessageNewImpl.setListName(occMessageNew.getListName());
		occMessageNewImpl.setMessage(occMessageNew.getMessage());
		occMessageNewImpl.setMSgSendDate(occMessageNew.getMSgSendDate());
		occMessageNewImpl.setSeverity(occMessageNew.getSeverity());

		return occMessageNewImpl;
	}

	/**
	 * Returns the occ message new with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the occ message new
	 * @return the occ message new
	 * @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	 */
	@Override
	public OccMessageNew findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOccMessageNewException {
		OccMessageNew occMessageNew = fetchByPrimaryKey(primaryKey);

		if (occMessageNew == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOccMessageNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return occMessageNew;
	}

	/**
	 * Returns the occ message new with the primary key or throws a {@link NoSuchOccMessageNewException} if it could not be found.
	 *
	 * @param MSG_ID the primary key of the occ message new
	 * @return the occ message new
	 * @throws NoSuchOccMessageNewException if a occ message new with the primary key could not be found
	 */
	@Override
	public OccMessageNew findByPrimaryKey(long MSG_ID)
		throws NoSuchOccMessageNewException {
		return findByPrimaryKey((Serializable)MSG_ID);
	}

	/**
	 * Returns the occ message new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the occ message new
	 * @return the occ message new, or <code>null</code> if a occ message new with the primary key could not be found
	 */
	@Override
	public OccMessageNew fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
				OccMessageNewImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		OccMessageNew occMessageNew = (OccMessageNew)serializable;

		if (occMessageNew == null) {
			Session session = null;

			try {
				session = openSession();

				occMessageNew = (OccMessageNew)session.get(OccMessageNewImpl.class,
						primaryKey);

				if (occMessageNew != null) {
					cacheResult(occMessageNew);
				}
				else {
					entityCache.putResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
						OccMessageNewImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
					OccMessageNewImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return occMessageNew;
	}

	/**
	 * Returns the occ message new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param MSG_ID the primary key of the occ message new
	 * @return the occ message new, or <code>null</code> if a occ message new with the primary key could not be found
	 */
	@Override
	public OccMessageNew fetchByPrimaryKey(long MSG_ID) {
		return fetchByPrimaryKey((Serializable)MSG_ID);
	}

	@Override
	public Map<Serializable, OccMessageNew> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, OccMessageNew> map = new HashMap<Serializable, OccMessageNew>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			OccMessageNew occMessageNew = fetchByPrimaryKey(primaryKey);

			if (occMessageNew != null) {
				map.put(primaryKey, occMessageNew);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
					OccMessageNewImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (OccMessageNew)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OCCMESSAGENEW_WHERE_PKS_IN);

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

			for (OccMessageNew occMessageNew : (List<OccMessageNew>)q.list()) {
				map.put(occMessageNew.getPrimaryKeyObj(), occMessageNew);

				cacheResult(occMessageNew);

				uncachedPrimaryKeys.remove(occMessageNew.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OccMessageNewModelImpl.ENTITY_CACHE_ENABLED,
					OccMessageNewImpl.class, primaryKey, nullModel);
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
	 * Returns all the occ message news.
	 *
	 * @return the occ message news
	 */
	@Override
	public List<OccMessageNew> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<OccMessageNew> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<OccMessageNew> findAll(int start, int end,
		OrderByComparator<OccMessageNew> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<OccMessageNew> findAll(int start, int end,
		OrderByComparator<OccMessageNew> orderByComparator,
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

		List<OccMessageNew> list = null;

		if (retrieveFromCache) {
			list = (List<OccMessageNew>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OCCMESSAGENEW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OCCMESSAGENEW;

				if (pagination) {
					sql = sql.concat(OccMessageNewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OccMessageNew>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OccMessageNew>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the occ message news from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OccMessageNew occMessageNew : findAll()) {
			remove(occMessageNew);
		}
	}

	/**
	 * Returns the number of occ message news.
	 *
	 * @return the number of occ message news
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OCCMESSAGENEW);

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
		return OccMessageNewModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the occ message new persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OccMessageNewImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OCCMESSAGENEW = "SELECT occMessageNew FROM OccMessageNew occMessageNew";
	private static final String _SQL_SELECT_OCCMESSAGENEW_WHERE_PKS_IN = "SELECT occMessageNew FROM OccMessageNew occMessageNew WHERE MSG_ID IN (";
	private static final String _SQL_COUNT_OCCMESSAGENEW = "SELECT COUNT(occMessageNew) FROM OccMessageNew occMessageNew";
	private static final String _ORDER_BY_ENTITY_ALIAS = "occMessageNew.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OccMessageNew exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(OccMessageNewPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"ListName", "Message", "MSgSendDate", "Severity"
			});
}