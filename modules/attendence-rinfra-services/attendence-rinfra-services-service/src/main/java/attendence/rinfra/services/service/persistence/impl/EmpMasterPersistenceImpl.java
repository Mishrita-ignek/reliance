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

package attendence.rinfra.services.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import attendence.rinfra.services.exception.NoSuchEmpMasterException;
import attendence.rinfra.services.model.EmpMaster;
import attendence.rinfra.services.model.impl.EmpMasterImpl;
import attendence.rinfra.services.model.impl.EmpMasterModelImpl;
import attendence.rinfra.services.service.persistence.EmpMasterPersistence;

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
 * The persistence implementation for the emp master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpMasterPersistence
 * @see attendence.rinfra.services.service.persistence.EmpMasterUtil
 * @generated
 */
@ProviderType
public class EmpMasterPersistenceImpl extends BasePersistenceImpl<EmpMaster>
	implements EmpMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmpMasterUtil} to access the emp master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmpMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpMasterModelImpl.FINDER_CACHE_ENABLED, EmpMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpMasterModelImpl.FINDER_CACHE_ENABLED, EmpMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmpMasterPersistenceImpl() {
		setModelClass(EmpMaster.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("employeeCode", "EMPLOYEE_CODE");
			dbColumnNames.put("employeeName", "EMPLOYEE_NAME");
			dbColumnNames.put("mobile", "MOBILE_NUMBER");
			dbColumnNames.put("userDefined1", "USER_DEFINED_1");
			dbColumnNames.put("userDefined2", "USER_DEFINED_2");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the emp master in the entity cache if it is enabled.
	 *
	 * @param empMaster the emp master
	 */
	@Override
	public void cacheResult(EmpMaster empMaster) {
		entityCache.putResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpMasterImpl.class, empMaster.getPrimaryKey(), empMaster);

		empMaster.resetOriginalValues();
	}

	/**
	 * Caches the emp masters in the entity cache if it is enabled.
	 *
	 * @param empMasters the emp masters
	 */
	@Override
	public void cacheResult(List<EmpMaster> empMasters) {
		for (EmpMaster empMaster : empMasters) {
			if (entityCache.getResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
						EmpMasterImpl.class, empMaster.getPrimaryKey()) == null) {
				cacheResult(empMaster);
			}
			else {
				empMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emp masters.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EmpMasterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emp master.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmpMaster empMaster) {
		entityCache.removeResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpMasterImpl.class, empMaster.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmpMaster> empMasters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmpMaster empMaster : empMasters) {
			entityCache.removeResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
				EmpMasterImpl.class, empMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new emp master with the primary key. Does not add the emp master to the database.
	 *
	 * @param employeeCode the primary key for the new emp master
	 * @return the new emp master
	 */
	@Override
	public EmpMaster create(String employeeCode) {
		EmpMaster empMaster = new EmpMasterImpl();

		empMaster.setNew(true);
		empMaster.setPrimaryKey(employeeCode);

		return empMaster;
	}

	/**
	 * Removes the emp master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param employeeCode the primary key of the emp master
	 * @return the emp master that was removed
	 * @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	 */
	@Override
	public EmpMaster remove(String employeeCode)
		throws NoSuchEmpMasterException {
		return remove((Serializable)employeeCode);
	}

	/**
	 * Removes the emp master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emp master
	 * @return the emp master that was removed
	 * @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	 */
	@Override
	public EmpMaster remove(Serializable primaryKey)
		throws NoSuchEmpMasterException {
		Session session = null;

		try {
			session = openSession();

			EmpMaster empMaster = (EmpMaster)session.get(EmpMasterImpl.class,
					primaryKey);

			if (empMaster == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmpMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(empMaster);
		}
		catch (NoSuchEmpMasterException nsee) {
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
	protected EmpMaster removeImpl(EmpMaster empMaster) {
		empMaster = toUnwrappedModel(empMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(empMaster)) {
				empMaster = (EmpMaster)session.get(EmpMasterImpl.class,
						empMaster.getPrimaryKeyObj());
			}

			if (empMaster != null) {
				session.delete(empMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (empMaster != null) {
			clearCache(empMaster);
		}

		return empMaster;
	}

	@Override
	public EmpMaster updateImpl(EmpMaster empMaster) {
		empMaster = toUnwrappedModel(empMaster);

		boolean isNew = empMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (empMaster.isNew()) {
				session.save(empMaster);

				empMaster.setNew(false);
			}
			else {
				empMaster = (EmpMaster)session.merge(empMaster);
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

		entityCache.putResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpMasterImpl.class, empMaster.getPrimaryKey(), empMaster, false);

		empMaster.resetOriginalValues();

		return empMaster;
	}

	protected EmpMaster toUnwrappedModel(EmpMaster empMaster) {
		if (empMaster instanceof EmpMasterImpl) {
			return empMaster;
		}

		EmpMasterImpl empMasterImpl = new EmpMasterImpl();

		empMasterImpl.setNew(empMaster.isNew());
		empMasterImpl.setPrimaryKey(empMaster.getPrimaryKey());

		empMasterImpl.setEmployeeCode(empMaster.getEmployeeCode());
		empMasterImpl.setEmployeeName(empMaster.getEmployeeName());
		empMasterImpl.setMobile(empMaster.getMobile());
		empMasterImpl.setUserDefined1(empMaster.getUserDefined1());
		empMasterImpl.setUserDefined2(empMaster.getUserDefined2());

		return empMasterImpl;
	}

	/**
	 * Returns the emp master with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp master
	 * @return the emp master
	 * @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	 */
	@Override
	public EmpMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmpMasterException {
		EmpMaster empMaster = fetchByPrimaryKey(primaryKey);

		if (empMaster == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmpMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return empMaster;
	}

	/**
	 * Returns the emp master with the primary key or throws a {@link NoSuchEmpMasterException} if it could not be found.
	 *
	 * @param employeeCode the primary key of the emp master
	 * @return the emp master
	 * @throws NoSuchEmpMasterException if a emp master with the primary key could not be found
	 */
	@Override
	public EmpMaster findByPrimaryKey(String employeeCode)
		throws NoSuchEmpMasterException {
		return findByPrimaryKey((Serializable)employeeCode);
	}

	/**
	 * Returns the emp master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp master
	 * @return the emp master, or <code>null</code> if a emp master with the primary key could not be found
	 */
	@Override
	public EmpMaster fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
				EmpMasterImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		EmpMaster empMaster = (EmpMaster)serializable;

		if (empMaster == null) {
			Session session = null;

			try {
				session = openSession();

				empMaster = (EmpMaster)session.get(EmpMasterImpl.class,
						primaryKey);

				if (empMaster != null) {
					cacheResult(empMaster);
				}
				else {
					entityCache.putResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
						EmpMasterImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
					EmpMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return empMaster;
	}

	/**
	 * Returns the emp master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param employeeCode the primary key of the emp master
	 * @return the emp master, or <code>null</code> if a emp master with the primary key could not be found
	 */
	@Override
	public EmpMaster fetchByPrimaryKey(String employeeCode) {
		return fetchByPrimaryKey((Serializable)employeeCode);
	}

	@Override
	public Map<Serializable, EmpMaster> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, EmpMaster> map = new HashMap<Serializable, EmpMaster>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			EmpMaster empMaster = fetchByPrimaryKey(primaryKey);

			if (empMaster != null) {
				map.put(primaryKey, empMaster);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
					EmpMasterImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (EmpMaster)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EMPMASTER_WHERE_PKS_IN);

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

			for (EmpMaster empMaster : (List<EmpMaster>)q.list()) {
				map.put(empMaster.getPrimaryKeyObj(), empMaster);

				cacheResult(empMaster);

				uncachedPrimaryKeys.remove(empMaster.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EmpMasterModelImpl.ENTITY_CACHE_ENABLED,
					EmpMasterImpl.class, primaryKey, nullModel);
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
	 * Returns all the emp masters.
	 *
	 * @return the emp masters
	 */
	@Override
	public List<EmpMaster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emp masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp masters
	 * @param end the upper bound of the range of emp masters (not inclusive)
	 * @return the range of emp masters
	 */
	@Override
	public List<EmpMaster> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emp masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp masters
	 * @param end the upper bound of the range of emp masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emp masters
	 */
	@Override
	public List<EmpMaster> findAll(int start, int end,
		OrderByComparator<EmpMaster> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the emp masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp masters
	 * @param end the upper bound of the range of emp masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of emp masters
	 */
	@Override
	public List<EmpMaster> findAll(int start, int end,
		OrderByComparator<EmpMaster> orderByComparator,
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

		List<EmpMaster> list = null;

		if (retrieveFromCache) {
			list = (List<EmpMaster>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EMPMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPMASTER;

				if (pagination) {
					sql = sql.concat(EmpMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmpMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<EmpMaster>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the emp masters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EmpMaster empMaster : findAll()) {
			remove(empMaster);
		}
	}

	/**
	 * Returns the number of emp masters.
	 *
	 * @return the number of emp masters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPMASTER);

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
		return EmpMasterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the emp master persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EmpMasterImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_EMPMASTER = "SELECT empMaster FROM EmpMaster empMaster";
	private static final String _SQL_SELECT_EMPMASTER_WHERE_PKS_IN = "SELECT empMaster FROM EmpMaster empMaster WHERE EMPLOYEE_CODE IN (";
	private static final String _SQL_COUNT_EMPMASTER = "SELECT COUNT(empMaster) FROM EmpMaster empMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "empMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmpMaster exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(EmpMasterPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"employeeCode", "employeeName", "mobile", "userDefined1",
				"userDefined2"
			});
}