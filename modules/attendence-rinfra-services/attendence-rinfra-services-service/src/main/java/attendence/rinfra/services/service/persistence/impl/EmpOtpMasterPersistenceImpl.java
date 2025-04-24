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

import attendence.rinfra.services.exception.NoSuchEmpOtpMasterException;
import attendence.rinfra.services.model.EmpOtpMaster;
import attendence.rinfra.services.model.impl.EmpOtpMasterImpl;
import attendence.rinfra.services.model.impl.EmpOtpMasterModelImpl;
import attendence.rinfra.services.service.persistence.EmpOtpMasterPersistence;

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
 * The persistence implementation for the emp otp master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpOtpMasterPersistence
 * @see attendence.rinfra.services.service.persistence.EmpOtpMasterUtil
 * @generated
 */
@ProviderType
public class EmpOtpMasterPersistenceImpl extends BasePersistenceImpl<EmpOtpMaster>
	implements EmpOtpMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmpOtpMasterUtil} to access the emp otp master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmpOtpMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpOtpMasterModelImpl.FINDER_CACHE_ENABLED, EmpOtpMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpOtpMasterModelImpl.FINDER_CACHE_ENABLED, EmpOtpMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpOtpMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmpOtpMasterPersistenceImpl() {
		setModelClass(EmpOtpMaster.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("empMobile", "EMP_MOBILE");
			dbColumnNames.put("otp", "OTP");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the emp otp master in the entity cache if it is enabled.
	 *
	 * @param empOtpMaster the emp otp master
	 */
	@Override
	public void cacheResult(EmpOtpMaster empOtpMaster) {
		entityCache.putResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpOtpMasterImpl.class, empOtpMaster.getPrimaryKey(), empOtpMaster);

		empOtpMaster.resetOriginalValues();
	}

	/**
	 * Caches the emp otp masters in the entity cache if it is enabled.
	 *
	 * @param empOtpMasters the emp otp masters
	 */
	@Override
	public void cacheResult(List<EmpOtpMaster> empOtpMasters) {
		for (EmpOtpMaster empOtpMaster : empOtpMasters) {
			if (entityCache.getResult(
						EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
						EmpOtpMasterImpl.class, empOtpMaster.getPrimaryKey()) == null) {
				cacheResult(empOtpMaster);
			}
			else {
				empOtpMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all emp otp masters.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EmpOtpMasterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the emp otp master.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(EmpOtpMaster empOtpMaster) {
		entityCache.removeResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpOtpMasterImpl.class, empOtpMaster.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<EmpOtpMaster> empOtpMasters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (EmpOtpMaster empOtpMaster : empOtpMasters) {
			entityCache.removeResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
				EmpOtpMasterImpl.class, empOtpMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new emp otp master with the primary key. Does not add the emp otp master to the database.
	 *
	 * @param empMobile the primary key for the new emp otp master
	 * @return the new emp otp master
	 */
	@Override
	public EmpOtpMaster create(String empMobile) {
		EmpOtpMaster empOtpMaster = new EmpOtpMasterImpl();

		empOtpMaster.setNew(true);
		empOtpMaster.setPrimaryKey(empMobile);

		return empOtpMaster;
	}

	/**
	 * Removes the emp otp master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empMobile the primary key of the emp otp master
	 * @return the emp otp master that was removed
	 * @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	 */
	@Override
	public EmpOtpMaster remove(String empMobile)
		throws NoSuchEmpOtpMasterException {
		return remove((Serializable)empMobile);
	}

	/**
	 * Removes the emp otp master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the emp otp master
	 * @return the emp otp master that was removed
	 * @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	 */
	@Override
	public EmpOtpMaster remove(Serializable primaryKey)
		throws NoSuchEmpOtpMasterException {
		Session session = null;

		try {
			session = openSession();

			EmpOtpMaster empOtpMaster = (EmpOtpMaster)session.get(EmpOtpMasterImpl.class,
					primaryKey);

			if (empOtpMaster == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmpOtpMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(empOtpMaster);
		}
		catch (NoSuchEmpOtpMasterException nsee) {
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
	protected EmpOtpMaster removeImpl(EmpOtpMaster empOtpMaster) {
		empOtpMaster = toUnwrappedModel(empOtpMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(empOtpMaster)) {
				empOtpMaster = (EmpOtpMaster)session.get(EmpOtpMasterImpl.class,
						empOtpMaster.getPrimaryKeyObj());
			}

			if (empOtpMaster != null) {
				session.delete(empOtpMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (empOtpMaster != null) {
			clearCache(empOtpMaster);
		}

		return empOtpMaster;
	}

	@Override
	public EmpOtpMaster updateImpl(EmpOtpMaster empOtpMaster) {
		empOtpMaster = toUnwrappedModel(empOtpMaster);

		boolean isNew = empOtpMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (empOtpMaster.isNew()) {
				session.save(empOtpMaster);

				empOtpMaster.setNew(false);
			}
			else {
				empOtpMaster = (EmpOtpMaster)session.merge(empOtpMaster);
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

		entityCache.putResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
			EmpOtpMasterImpl.class, empOtpMaster.getPrimaryKey(), empOtpMaster,
			false);

		empOtpMaster.resetOriginalValues();

		return empOtpMaster;
	}

	protected EmpOtpMaster toUnwrappedModel(EmpOtpMaster empOtpMaster) {
		if (empOtpMaster instanceof EmpOtpMasterImpl) {
			return empOtpMaster;
		}

		EmpOtpMasterImpl empOtpMasterImpl = new EmpOtpMasterImpl();

		empOtpMasterImpl.setNew(empOtpMaster.isNew());
		empOtpMasterImpl.setPrimaryKey(empOtpMaster.getPrimaryKey());

		empOtpMasterImpl.setEmpMobile(empOtpMaster.getEmpMobile());
		empOtpMasterImpl.setOtp(empOtpMaster.getOtp());

		return empOtpMasterImpl;
	}

	/**
	 * Returns the emp otp master with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp otp master
	 * @return the emp otp master
	 * @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	 */
	@Override
	public EmpOtpMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmpOtpMasterException {
		EmpOtpMaster empOtpMaster = fetchByPrimaryKey(primaryKey);

		if (empOtpMaster == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmpOtpMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return empOtpMaster;
	}

	/**
	 * Returns the emp otp master with the primary key or throws a {@link NoSuchEmpOtpMasterException} if it could not be found.
	 *
	 * @param empMobile the primary key of the emp otp master
	 * @return the emp otp master
	 * @throws NoSuchEmpOtpMasterException if a emp otp master with the primary key could not be found
	 */
	@Override
	public EmpOtpMaster findByPrimaryKey(String empMobile)
		throws NoSuchEmpOtpMasterException {
		return findByPrimaryKey((Serializable)empMobile);
	}

	/**
	 * Returns the emp otp master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the emp otp master
	 * @return the emp otp master, or <code>null</code> if a emp otp master with the primary key could not be found
	 */
	@Override
	public EmpOtpMaster fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
				EmpOtpMasterImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		EmpOtpMaster empOtpMaster = (EmpOtpMaster)serializable;

		if (empOtpMaster == null) {
			Session session = null;

			try {
				session = openSession();

				empOtpMaster = (EmpOtpMaster)session.get(EmpOtpMasterImpl.class,
						primaryKey);

				if (empOtpMaster != null) {
					cacheResult(empOtpMaster);
				}
				else {
					entityCache.putResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
						EmpOtpMasterImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
					EmpOtpMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return empOtpMaster;
	}

	/**
	 * Returns the emp otp master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param empMobile the primary key of the emp otp master
	 * @return the emp otp master, or <code>null</code> if a emp otp master with the primary key could not be found
	 */
	@Override
	public EmpOtpMaster fetchByPrimaryKey(String empMobile) {
		return fetchByPrimaryKey((Serializable)empMobile);
	}

	@Override
	public Map<Serializable, EmpOtpMaster> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, EmpOtpMaster> map = new HashMap<Serializable, EmpOtpMaster>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			EmpOtpMaster empOtpMaster = fetchByPrimaryKey(primaryKey);

			if (empOtpMaster != null) {
				map.put(primaryKey, empOtpMaster);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
					EmpOtpMasterImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (EmpOtpMaster)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EMPOTPMASTER_WHERE_PKS_IN);

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

			for (EmpOtpMaster empOtpMaster : (List<EmpOtpMaster>)q.list()) {
				map.put(empOtpMaster.getPrimaryKeyObj(), empOtpMaster);

				cacheResult(empOtpMaster);

				uncachedPrimaryKeys.remove(empOtpMaster.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EmpOtpMasterModelImpl.ENTITY_CACHE_ENABLED,
					EmpOtpMasterImpl.class, primaryKey, nullModel);
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
	 * Returns all the emp otp masters.
	 *
	 * @return the emp otp masters
	 */
	@Override
	public List<EmpOtpMaster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the emp otp masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp otp masters
	 * @param end the upper bound of the range of emp otp masters (not inclusive)
	 * @return the range of emp otp masters
	 */
	@Override
	public List<EmpOtpMaster> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the emp otp masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp otp masters
	 * @param end the upper bound of the range of emp otp masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of emp otp masters
	 */
	@Override
	public List<EmpOtpMaster> findAll(int start, int end,
		OrderByComparator<EmpOtpMaster> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the emp otp masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpOtpMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of emp otp masters
	 * @param end the upper bound of the range of emp otp masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of emp otp masters
	 */
	@Override
	public List<EmpOtpMaster> findAll(int start, int end,
		OrderByComparator<EmpOtpMaster> orderByComparator,
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

		List<EmpOtpMaster> list = null;

		if (retrieveFromCache) {
			list = (List<EmpOtpMaster>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EMPOTPMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPOTPMASTER;

				if (pagination) {
					sql = sql.concat(EmpOtpMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<EmpOtpMaster>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<EmpOtpMaster>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the emp otp masters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (EmpOtpMaster empOtpMaster : findAll()) {
			remove(empOtpMaster);
		}
	}

	/**
	 * Returns the number of emp otp masters.
	 *
	 * @return the number of emp otp masters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPOTPMASTER);

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
		return EmpOtpMasterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the emp otp master persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EmpOtpMasterImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_EMPOTPMASTER = "SELECT empOtpMaster FROM EmpOtpMaster empOtpMaster";
	private static final String _SQL_SELECT_EMPOTPMASTER_WHERE_PKS_IN = "SELECT empOtpMaster FROM EmpOtpMaster empOtpMaster WHERE EMP_MOBILE IN (";
	private static final String _SQL_COUNT_EMPOTPMASTER = "SELECT COUNT(empOtpMaster) FROM EmpOtpMaster empOtpMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "empOtpMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No EmpOtpMaster exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(EmpOtpMasterPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"empMobile", "otp"
			});
}