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

package com.reliance.reality.service.persistence.impl;

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

import com.reliance.reality.exception.NoSuchRealityPropertyMasterException;
import com.reliance.reality.model.RealityPropertyMaster;
import com.reliance.reality.model.impl.RealityPropertyMasterImpl;
import com.reliance.reality.model.impl.RealityPropertyMasterModelImpl;
import com.reliance.reality.service.persistence.RealityPropertyMasterPersistence;

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
 * The persistence implementation for the reality property master service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RealityPropertyMasterPersistence
 * @see com.reliance.reality.service.persistence.RealityPropertyMasterUtil
 * @generated
 */
@ProviderType
public class RealityPropertyMasterPersistenceImpl extends BasePersistenceImpl<RealityPropertyMaster>
	implements RealityPropertyMasterPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RealityPropertyMasterUtil} to access the reality property master persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RealityPropertyMasterImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
			RealityPropertyMasterModelImpl.FINDER_CACHE_ENABLED,
			RealityPropertyMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
			RealityPropertyMasterModelImpl.FINDER_CACHE_ENABLED,
			RealityPropertyMasterImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
			RealityPropertyMasterModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RealityPropertyMasterPersistenceImpl() {
		setModelClass(RealityPropertyMaster.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("property_ID", "PROPERTY_ID");
			dbColumnNames.put("city", "CITY");
			dbColumnNames.put("location", "LOCATION");
			dbColumnNames.put("address", "ADDRESS");
			dbColumnNames.put("area", "AREA");
			dbColumnNames.put("type", "TYPE");
			dbColumnNames.put("guidancePrice", "GUIDANCEPRICE");
			dbColumnNames.put("propertyBid", "PROPERTYBID");
			dbColumnNames.put("offerPrice", "OFFER_PRICE");
			dbColumnNames.put("ageOfProperty", "AGEOFPROPERTY");
			dbColumnNames.put("createDate", "CREATEDATE");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the reality property master in the entity cache if it is enabled.
	 *
	 * @param realityPropertyMaster the reality property master
	 */
	@Override
	public void cacheResult(RealityPropertyMaster realityPropertyMaster) {
		entityCache.putResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
			RealityPropertyMasterImpl.class,
			realityPropertyMaster.getPrimaryKey(), realityPropertyMaster);

		realityPropertyMaster.resetOriginalValues();
	}

	/**
	 * Caches the reality property masters in the entity cache if it is enabled.
	 *
	 * @param realityPropertyMasters the reality property masters
	 */
	@Override
	public void cacheResult(List<RealityPropertyMaster> realityPropertyMasters) {
		for (RealityPropertyMaster realityPropertyMaster : realityPropertyMasters) {
			if (entityCache.getResult(
						RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
						RealityPropertyMasterImpl.class,
						realityPropertyMaster.getPrimaryKey()) == null) {
				cacheResult(realityPropertyMaster);
			}
			else {
				realityPropertyMaster.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all reality property masters.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RealityPropertyMasterImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the reality property master.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RealityPropertyMaster realityPropertyMaster) {
		entityCache.removeResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
			RealityPropertyMasterImpl.class,
			realityPropertyMaster.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RealityPropertyMaster> realityPropertyMasters) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RealityPropertyMaster realityPropertyMaster : realityPropertyMasters) {
			entityCache.removeResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
				RealityPropertyMasterImpl.class,
				realityPropertyMaster.getPrimaryKey());
		}
	}

	/**
	 * Creates a new reality property master with the primary key. Does not add the reality property master to the database.
	 *
	 * @param property_ID the primary key for the new reality property master
	 * @return the new reality property master
	 */
	@Override
	public RealityPropertyMaster create(long property_ID) {
		RealityPropertyMaster realityPropertyMaster = new RealityPropertyMasterImpl();

		realityPropertyMaster.setNew(true);
		realityPropertyMaster.setPrimaryKey(property_ID);

		return realityPropertyMaster;
	}

	/**
	 * Removes the reality property master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param property_ID the primary key of the reality property master
	 * @return the reality property master that was removed
	 * @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	 */
	@Override
	public RealityPropertyMaster remove(long property_ID)
		throws NoSuchRealityPropertyMasterException {
		return remove((Serializable)property_ID);
	}

	/**
	 * Removes the reality property master with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the reality property master
	 * @return the reality property master that was removed
	 * @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	 */
	@Override
	public RealityPropertyMaster remove(Serializable primaryKey)
		throws NoSuchRealityPropertyMasterException {
		Session session = null;

		try {
			session = openSession();

			RealityPropertyMaster realityPropertyMaster = (RealityPropertyMaster)session.get(RealityPropertyMasterImpl.class,
					primaryKey);

			if (realityPropertyMaster == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRealityPropertyMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(realityPropertyMaster);
		}
		catch (NoSuchRealityPropertyMasterException nsee) {
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
	protected RealityPropertyMaster removeImpl(
		RealityPropertyMaster realityPropertyMaster) {
		realityPropertyMaster = toUnwrappedModel(realityPropertyMaster);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(realityPropertyMaster)) {
				realityPropertyMaster = (RealityPropertyMaster)session.get(RealityPropertyMasterImpl.class,
						realityPropertyMaster.getPrimaryKeyObj());
			}

			if (realityPropertyMaster != null) {
				session.delete(realityPropertyMaster);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (realityPropertyMaster != null) {
			clearCache(realityPropertyMaster);
		}

		return realityPropertyMaster;
	}

	@Override
	public RealityPropertyMaster updateImpl(
		RealityPropertyMaster realityPropertyMaster) {
		realityPropertyMaster = toUnwrappedModel(realityPropertyMaster);

		boolean isNew = realityPropertyMaster.isNew();

		Session session = null;

		try {
			session = openSession();

			if (realityPropertyMaster.isNew()) {
				session.save(realityPropertyMaster);

				realityPropertyMaster.setNew(false);
			}
			else {
				realityPropertyMaster = (RealityPropertyMaster)session.merge(realityPropertyMaster);
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

		entityCache.putResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
			RealityPropertyMasterImpl.class,
			realityPropertyMaster.getPrimaryKey(), realityPropertyMaster, false);

		realityPropertyMaster.resetOriginalValues();

		return realityPropertyMaster;
	}

	protected RealityPropertyMaster toUnwrappedModel(
		RealityPropertyMaster realityPropertyMaster) {
		if (realityPropertyMaster instanceof RealityPropertyMasterImpl) {
			return realityPropertyMaster;
		}

		RealityPropertyMasterImpl realityPropertyMasterImpl = new RealityPropertyMasterImpl();

		realityPropertyMasterImpl.setNew(realityPropertyMaster.isNew());
		realityPropertyMasterImpl.setPrimaryKey(realityPropertyMaster.getPrimaryKey());

		realityPropertyMasterImpl.setProperty_ID(realityPropertyMaster.getProperty_ID());
		realityPropertyMasterImpl.setCity(realityPropertyMaster.getCity());
		realityPropertyMasterImpl.setLocation(realityPropertyMaster.getLocation());
		realityPropertyMasterImpl.setAddress(realityPropertyMaster.getAddress());
		realityPropertyMasterImpl.setArea(realityPropertyMaster.getArea());
		realityPropertyMasterImpl.setType(realityPropertyMaster.getType());
		realityPropertyMasterImpl.setGuidancePrice(realityPropertyMaster.getGuidancePrice());
		realityPropertyMasterImpl.setPropertyBid(realityPropertyMaster.getPropertyBid());
		realityPropertyMasterImpl.setOfferPrice(realityPropertyMaster.getOfferPrice());
		realityPropertyMasterImpl.setAgeOfProperty(realityPropertyMaster.getAgeOfProperty());
		realityPropertyMasterImpl.setCreateDate(realityPropertyMaster.getCreateDate());

		return realityPropertyMasterImpl;
	}

	/**
	 * Returns the reality property master with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the reality property master
	 * @return the reality property master
	 * @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	 */
	@Override
	public RealityPropertyMaster findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRealityPropertyMasterException {
		RealityPropertyMaster realityPropertyMaster = fetchByPrimaryKey(primaryKey);

		if (realityPropertyMaster == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRealityPropertyMasterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return realityPropertyMaster;
	}

	/**
	 * Returns the reality property master with the primary key or throws a {@link NoSuchRealityPropertyMasterException} if it could not be found.
	 *
	 * @param property_ID the primary key of the reality property master
	 * @return the reality property master
	 * @throws NoSuchRealityPropertyMasterException if a reality property master with the primary key could not be found
	 */
	@Override
	public RealityPropertyMaster findByPrimaryKey(long property_ID)
		throws NoSuchRealityPropertyMasterException {
		return findByPrimaryKey((Serializable)property_ID);
	}

	/**
	 * Returns the reality property master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the reality property master
	 * @return the reality property master, or <code>null</code> if a reality property master with the primary key could not be found
	 */
	@Override
	public RealityPropertyMaster fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
				RealityPropertyMasterImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RealityPropertyMaster realityPropertyMaster = (RealityPropertyMaster)serializable;

		if (realityPropertyMaster == null) {
			Session session = null;

			try {
				session = openSession();

				realityPropertyMaster = (RealityPropertyMaster)session.get(RealityPropertyMasterImpl.class,
						primaryKey);

				if (realityPropertyMaster != null) {
					cacheResult(realityPropertyMaster);
				}
				else {
					entityCache.putResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
						RealityPropertyMasterImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
					RealityPropertyMasterImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return realityPropertyMaster;
	}

	/**
	 * Returns the reality property master with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param property_ID the primary key of the reality property master
	 * @return the reality property master, or <code>null</code> if a reality property master with the primary key could not be found
	 */
	@Override
	public RealityPropertyMaster fetchByPrimaryKey(long property_ID) {
		return fetchByPrimaryKey((Serializable)property_ID);
	}

	@Override
	public Map<Serializable, RealityPropertyMaster> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RealityPropertyMaster> map = new HashMap<Serializable, RealityPropertyMaster>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RealityPropertyMaster realityPropertyMaster = fetchByPrimaryKey(primaryKey);

			if (realityPropertyMaster != null) {
				map.put(primaryKey, realityPropertyMaster);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
					RealityPropertyMasterImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (RealityPropertyMaster)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_REALITYPROPERTYMASTER_WHERE_PKS_IN);

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

			for (RealityPropertyMaster realityPropertyMaster : (List<RealityPropertyMaster>)q.list()) {
				map.put(realityPropertyMaster.getPrimaryKeyObj(),
					realityPropertyMaster);

				cacheResult(realityPropertyMaster);

				uncachedPrimaryKeys.remove(realityPropertyMaster.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RealityPropertyMasterModelImpl.ENTITY_CACHE_ENABLED,
					RealityPropertyMasterImpl.class, primaryKey, nullModel);
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
	 * Returns all the reality property masters.
	 *
	 * @return the reality property masters
	 */
	@Override
	public List<RealityPropertyMaster> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the reality property masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reality property masters
	 * @param end the upper bound of the range of reality property masters (not inclusive)
	 * @return the range of reality property masters
	 */
	@Override
	public List<RealityPropertyMaster> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the reality property masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reality property masters
	 * @param end the upper bound of the range of reality property masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reality property masters
	 */
	@Override
	public List<RealityPropertyMaster> findAll(int start, int end,
		OrderByComparator<RealityPropertyMaster> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the reality property masters.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RealityPropertyMasterModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reality property masters
	 * @param end the upper bound of the range of reality property masters (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of reality property masters
	 */
	@Override
	public List<RealityPropertyMaster> findAll(int start, int end,
		OrderByComparator<RealityPropertyMaster> orderByComparator,
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

		List<RealityPropertyMaster> list = null;

		if (retrieveFromCache) {
			list = (List<RealityPropertyMaster>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REALITYPROPERTYMASTER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REALITYPROPERTYMASTER;

				if (pagination) {
					sql = sql.concat(RealityPropertyMasterModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RealityPropertyMaster>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RealityPropertyMaster>)QueryUtil.list(q,
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
	 * Removes all the reality property masters from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RealityPropertyMaster realityPropertyMaster : findAll()) {
			remove(realityPropertyMaster);
		}
	}

	/**
	 * Returns the number of reality property masters.
	 *
	 * @return the number of reality property masters
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REALITYPROPERTYMASTER);

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
		return RealityPropertyMasterModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the reality property master persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RealityPropertyMasterImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_REALITYPROPERTYMASTER = "SELECT realityPropertyMaster FROM RealityPropertyMaster realityPropertyMaster";
	private static final String _SQL_SELECT_REALITYPROPERTYMASTER_WHERE_PKS_IN = "SELECT realityPropertyMaster FROM RealityPropertyMaster realityPropertyMaster WHERE PROPERTY_ID IN (";
	private static final String _SQL_COUNT_REALITYPROPERTYMASTER = "SELECT COUNT(realityPropertyMaster) FROM RealityPropertyMaster realityPropertyMaster";
	private static final String _ORDER_BY_ENTITY_ALIAS = "realityPropertyMaster.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RealityPropertyMaster exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(RealityPropertyMasterPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"property_ID", "city", "location", "address", "area", "type",
				"guidancePrice", "propertyBid", "offerPrice", "ageOfProperty",
				"createDate"
			});
}