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

import OCCModuleNew.exception.NoSuchOccNewException;

import OCCModuleNew.model.OccNew;

import OCCModuleNew.model.impl.OccNewImpl;
import OCCModuleNew.model.impl.OccNewModelImpl;

import OCCModuleNew.service.persistence.OccNewPersistence;

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
 * The persistence implementation for the occ new service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh Patidar
 * @see OccNewPersistence
 * @see OCCModuleNew.service.persistence.OccNewUtil
 * @generated
 */
@ProviderType
public class OccNewPersistenceImpl extends BasePersistenceImpl<OccNew>
	implements OccNewPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OccNewUtil} to access the occ new persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OccNewImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OccNewModelImpl.ENTITY_CACHE_ENABLED,
			OccNewModelImpl.FINDER_CACHE_ENABLED, OccNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OccNewModelImpl.ENTITY_CACHE_ENABLED,
			OccNewModelImpl.FINDER_CACHE_ENABLED, OccNewImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OccNewModelImpl.ENTITY_CACHE_ENABLED,
			OccNewModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OccNewPersistenceImpl() {
		setModelClass(OccNew.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("ListID", "LISTID");
			dbColumnNames.put("ListName", "LISTNAME");
			dbColumnNames.put("RollNo", "ROLLNO");
			dbColumnNames.put("Name", "NAME");
			dbColumnNames.put("MobileNo", "MOBILENO");
			dbColumnNames.put("Email", "EMAIL");
			dbColumnNames.put("Dept", "DEPT");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the occ new in the entity cache if it is enabled.
	 *
	 * @param occNew the occ new
	 */
	@Override
	public void cacheResult(OccNew occNew) {
		entityCache.putResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
			OccNewImpl.class, occNew.getPrimaryKey(), occNew);

		occNew.resetOriginalValues();
	}

	/**
	 * Caches the occ news in the entity cache if it is enabled.
	 *
	 * @param occNews the occ news
	 */
	@Override
	public void cacheResult(List<OccNew> occNews) {
		for (OccNew occNew : occNews) {
			if (entityCache.getResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
						OccNewImpl.class, occNew.getPrimaryKey()) == null) {
				cacheResult(occNew);
			}
			else {
				occNew.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all occ news.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OccNewImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the occ new.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OccNew occNew) {
		entityCache.removeResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
			OccNewImpl.class, occNew.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<OccNew> occNews) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (OccNew occNew : occNews) {
			entityCache.removeResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
				OccNewImpl.class, occNew.getPrimaryKey());
		}
	}

	/**
	 * Creates a new occ new with the primary key. Does not add the occ new to the database.
	 *
	 * @param OCCID the primary key for the new occ new
	 * @return the new occ new
	 */
	@Override
	public OccNew create(long OCCID) {
		OccNew occNew = new OccNewImpl();

		occNew.setNew(true);
		occNew.setPrimaryKey(OCCID);

		return occNew;
	}

	/**
	 * Removes the occ new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param OCCID the primary key of the occ new
	 * @return the occ new that was removed
	 * @throws NoSuchOccNewException if a occ new with the primary key could not be found
	 */
	@Override
	public OccNew remove(long OCCID) throws NoSuchOccNewException {
		return remove((Serializable)OCCID);
	}

	/**
	 * Removes the occ new with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the occ new
	 * @return the occ new that was removed
	 * @throws NoSuchOccNewException if a occ new with the primary key could not be found
	 */
	@Override
	public OccNew remove(Serializable primaryKey) throws NoSuchOccNewException {
		Session session = null;

		try {
			session = openSession();

			OccNew occNew = (OccNew)session.get(OccNewImpl.class, primaryKey);

			if (occNew == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOccNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(occNew);
		}
		catch (NoSuchOccNewException nsee) {
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
	protected OccNew removeImpl(OccNew occNew) {
		occNew = toUnwrappedModel(occNew);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(occNew)) {
				occNew = (OccNew)session.get(OccNewImpl.class,
						occNew.getPrimaryKeyObj());
			}

			if (occNew != null) {
				session.delete(occNew);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (occNew != null) {
			clearCache(occNew);
		}

		return occNew;
	}

	@Override
	public OccNew updateImpl(OccNew occNew) {
		occNew = toUnwrappedModel(occNew);

		boolean isNew = occNew.isNew();

		Session session = null;

		try {
			session = openSession();

			if (occNew.isNew()) {
				session.save(occNew);

				occNew.setNew(false);
			}
			else {
				occNew = (OccNew)session.merge(occNew);
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

		entityCache.putResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
			OccNewImpl.class, occNew.getPrimaryKey(), occNew, false);

		occNew.resetOriginalValues();

		return occNew;
	}

	protected OccNew toUnwrappedModel(OccNew occNew) {
		if (occNew instanceof OccNewImpl) {
			return occNew;
		}

		OccNewImpl occNewImpl = new OccNewImpl();

		occNewImpl.setNew(occNew.isNew());
		occNewImpl.setPrimaryKey(occNew.getPrimaryKey());

		occNewImpl.setOCCID(occNew.getOCCID());
		occNewImpl.setListID(occNew.getListID());
		occNewImpl.setListName(occNew.getListName());
		occNewImpl.setRollNo(occNew.getRollNo());
		occNewImpl.setName(occNew.getName());
		occNewImpl.setMobileNo(occNew.getMobileNo());
		occNewImpl.setEmail(occNew.getEmail());
		occNewImpl.setDept(occNew.getDept());

		return occNewImpl;
	}

	/**
	 * Returns the occ new with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the occ new
	 * @return the occ new
	 * @throws NoSuchOccNewException if a occ new with the primary key could not be found
	 */
	@Override
	public OccNew findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOccNewException {
		OccNew occNew = fetchByPrimaryKey(primaryKey);

		if (occNew == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOccNewException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return occNew;
	}

	/**
	 * Returns the occ new with the primary key or throws a {@link NoSuchOccNewException} if it could not be found.
	 *
	 * @param OCCID the primary key of the occ new
	 * @return the occ new
	 * @throws NoSuchOccNewException if a occ new with the primary key could not be found
	 */
	@Override
	public OccNew findByPrimaryKey(long OCCID) throws NoSuchOccNewException {
		return findByPrimaryKey((Serializable)OCCID);
	}

	/**
	 * Returns the occ new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the occ new
	 * @return the occ new, or <code>null</code> if a occ new with the primary key could not be found
	 */
	@Override
	public OccNew fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
				OccNewImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		OccNew occNew = (OccNew)serializable;

		if (occNew == null) {
			Session session = null;

			try {
				session = openSession();

				occNew = (OccNew)session.get(OccNewImpl.class, primaryKey);

				if (occNew != null) {
					cacheResult(occNew);
				}
				else {
					entityCache.putResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
						OccNewImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
					OccNewImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return occNew;
	}

	/**
	 * Returns the occ new with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param OCCID the primary key of the occ new
	 * @return the occ new, or <code>null</code> if a occ new with the primary key could not be found
	 */
	@Override
	public OccNew fetchByPrimaryKey(long OCCID) {
		return fetchByPrimaryKey((Serializable)OCCID);
	}

	@Override
	public Map<Serializable, OccNew> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, OccNew> map = new HashMap<Serializable, OccNew>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			OccNew occNew = fetchByPrimaryKey(primaryKey);

			if (occNew != null) {
				map.put(primaryKey, occNew);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
					OccNewImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (OccNew)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OCCNEW_WHERE_PKS_IN);

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

			for (OccNew occNew : (List<OccNew>)q.list()) {
				map.put(occNew.getPrimaryKeyObj(), occNew);

				cacheResult(occNew);

				uncachedPrimaryKeys.remove(occNew.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OccNewModelImpl.ENTITY_CACHE_ENABLED,
					OccNewImpl.class, primaryKey, nullModel);
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
	 * Returns all the occ news.
	 *
	 * @return the occ news
	 */
	@Override
	public List<OccNew> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the occ news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of occ news
	 * @param end the upper bound of the range of occ news (not inclusive)
	 * @return the range of occ news
	 */
	@Override
	public List<OccNew> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the occ news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of occ news
	 * @param end the upper bound of the range of occ news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of occ news
	 */
	@Override
	public List<OccNew> findAll(int start, int end,
		OrderByComparator<OccNew> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the occ news.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OccNewModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of occ news
	 * @param end the upper bound of the range of occ news (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of occ news
	 */
	@Override
	public List<OccNew> findAll(int start, int end,
		OrderByComparator<OccNew> orderByComparator, boolean retrieveFromCache) {
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

		List<OccNew> list = null;

		if (retrieveFromCache) {
			list = (List<OccNew>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OCCNEW);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OCCNEW;

				if (pagination) {
					sql = sql.concat(OccNewModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<OccNew>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<OccNew>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the occ news from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OccNew occNew : findAll()) {
			remove(occNew);
		}
	}

	/**
	 * Returns the number of occ news.
	 *
	 * @return the number of occ news
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OCCNEW);

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
		return OccNewModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the occ new persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OccNewImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OCCNEW = "SELECT occNew FROM OccNew occNew";
	private static final String _SQL_SELECT_OCCNEW_WHERE_PKS_IN = "SELECT occNew FROM OccNew occNew WHERE OCCID IN (";
	private static final String _SQL_COUNT_OCCNEW = "SELECT COUNT(occNew) FROM OccNew occNew";
	private static final String _ORDER_BY_ENTITY_ALIAS = "occNew.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No OccNew exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(OccNewPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"ListID", "ListName", "RollNo", "Name", "MobileNo", "Email",
				"Dept"
			});
}