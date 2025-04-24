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

import com.reliance.reality.exception.NoSuchRelianceRealityException;
import com.reliance.reality.model.RelianceReality;
import com.reliance.reality.model.impl.RelianceRealityImpl;
import com.reliance.reality.model.impl.RelianceRealityModelImpl;
import com.reliance.reality.service.persistence.RelianceRealityPersistence;

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
 * The persistence implementation for the reliance reality service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RelianceRealityPersistence
 * @see com.reliance.reality.service.persistence.RelianceRealityUtil
 * @generated
 */
@ProviderType
public class RelianceRealityPersistenceImpl extends BasePersistenceImpl<RelianceReality>
	implements RelianceRealityPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RelianceRealityUtil} to access the reliance reality persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RelianceRealityImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
			RelianceRealityModelImpl.FINDER_CACHE_ENABLED,
			RelianceRealityImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
			RelianceRealityModelImpl.FINDER_CACHE_ENABLED,
			RelianceRealityImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
			RelianceRealityModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RelianceRealityPersistenceImpl() {
		setModelClass(RelianceReality.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("r_Id", "R_ID");
			dbColumnNames.put("city", "CITY");
			dbColumnNames.put("location", "LOCATION");
			dbColumnNames.put("address", "ADDRESS");
			dbColumnNames.put("area", "AREA");
			dbColumnNames.put("type", "TYPE");
			dbColumnNames.put("guidancePrice", "GUIDANCEPRICE");
			dbColumnNames.put("propertyId", "PROPERTY_ID");
			dbColumnNames.put("offerPrice", "OFFER_PRICE");
			dbColumnNames.put("funding", "FUNDING");
			dbColumnNames.put("days", "DAYS");
			dbColumnNames.put("empcode", "EMPCODE");
			dbColumnNames.put("name", "NAME");
			dbColumnNames.put("email_id", "EMAIL_ID");
			dbColumnNames.put("mobile", "MOBILE");
			dbColumnNames.put("ageOfProperty", "AGEOFPROPERTY");
			dbColumnNames.put("groupCompanyName", "GROUPCOMPANYNAME");
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
	 * Caches the reliance reality in the entity cache if it is enabled.
	 *
	 * @param relianceReality the reliance reality
	 */
	@Override
	public void cacheResult(RelianceReality relianceReality) {
		entityCache.putResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
			RelianceRealityImpl.class, relianceReality.getPrimaryKey(),
			relianceReality);

		relianceReality.resetOriginalValues();
	}

	/**
	 * Caches the reliance realities in the entity cache if it is enabled.
	 *
	 * @param relianceRealities the reliance realities
	 */
	@Override
	public void cacheResult(List<RelianceReality> relianceRealities) {
		for (RelianceReality relianceReality : relianceRealities) {
			if (entityCache.getResult(
						RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
						RelianceRealityImpl.class,
						relianceReality.getPrimaryKey()) == null) {
				cacheResult(relianceReality);
			}
			else {
				relianceReality.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all reliance realities.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RelianceRealityImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the reliance reality.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RelianceReality relianceReality) {
		entityCache.removeResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
			RelianceRealityImpl.class, relianceReality.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RelianceReality> relianceRealities) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RelianceReality relianceReality : relianceRealities) {
			entityCache.removeResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
				RelianceRealityImpl.class, relianceReality.getPrimaryKey());
		}
	}

	/**
	 * Creates a new reliance reality with the primary key. Does not add the reliance reality to the database.
	 *
	 * @param r_Id the primary key for the new reliance reality
	 * @return the new reliance reality
	 */
	@Override
	public RelianceReality create(long r_Id) {
		RelianceReality relianceReality = new RelianceRealityImpl();

		relianceReality.setNew(true);
		relianceReality.setPrimaryKey(r_Id);

		return relianceReality;
	}

	/**
	 * Removes the reliance reality with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param r_Id the primary key of the reliance reality
	 * @return the reliance reality that was removed
	 * @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	 */
	@Override
	public RelianceReality remove(long r_Id)
		throws NoSuchRelianceRealityException {
		return remove((Serializable)r_Id);
	}

	/**
	 * Removes the reliance reality with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the reliance reality
	 * @return the reliance reality that was removed
	 * @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	 */
	@Override
	public RelianceReality remove(Serializable primaryKey)
		throws NoSuchRelianceRealityException {
		Session session = null;

		try {
			session = openSession();

			RelianceReality relianceReality = (RelianceReality)session.get(RelianceRealityImpl.class,
					primaryKey);

			if (relianceReality == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRelianceRealityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(relianceReality);
		}
		catch (NoSuchRelianceRealityException nsee) {
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
	protected RelianceReality removeImpl(RelianceReality relianceReality) {
		relianceReality = toUnwrappedModel(relianceReality);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(relianceReality)) {
				relianceReality = (RelianceReality)session.get(RelianceRealityImpl.class,
						relianceReality.getPrimaryKeyObj());
			}

			if (relianceReality != null) {
				session.delete(relianceReality);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (relianceReality != null) {
			clearCache(relianceReality);
		}

		return relianceReality;
	}

	@Override
	public RelianceReality updateImpl(RelianceReality relianceReality) {
		relianceReality = toUnwrappedModel(relianceReality);

		boolean isNew = relianceReality.isNew();

		Session session = null;

		try {
			session = openSession();

			if (relianceReality.isNew()) {
				session.save(relianceReality);

				relianceReality.setNew(false);
			}
			else {
				relianceReality = (RelianceReality)session.merge(relianceReality);
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

		entityCache.putResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
			RelianceRealityImpl.class, relianceReality.getPrimaryKey(),
			relianceReality, false);

		relianceReality.resetOriginalValues();

		return relianceReality;
	}

	protected RelianceReality toUnwrappedModel(RelianceReality relianceReality) {
		if (relianceReality instanceof RelianceRealityImpl) {
			return relianceReality;
		}

		RelianceRealityImpl relianceRealityImpl = new RelianceRealityImpl();

		relianceRealityImpl.setNew(relianceReality.isNew());
		relianceRealityImpl.setPrimaryKey(relianceReality.getPrimaryKey());

		relianceRealityImpl.setR_Id(relianceReality.getR_Id());
		relianceRealityImpl.setCity(relianceReality.getCity());
		relianceRealityImpl.setLocation(relianceReality.getLocation());
		relianceRealityImpl.setAddress(relianceReality.getAddress());
		relianceRealityImpl.setArea(relianceReality.getArea());
		relianceRealityImpl.setType(relianceReality.getType());
		relianceRealityImpl.setGuidancePrice(relianceReality.getGuidancePrice());
		relianceRealityImpl.setPropertyId(relianceReality.getPropertyId());
		relianceRealityImpl.setOfferPrice(relianceReality.getOfferPrice());
		relianceRealityImpl.setFunding(relianceReality.getFunding());
		relianceRealityImpl.setDays(relianceReality.getDays());
		relianceRealityImpl.setEmpcode(relianceReality.getEmpcode());
		relianceRealityImpl.setName(relianceReality.getName());
		relianceRealityImpl.setEmail_id(relianceReality.getEmail_id());
		relianceRealityImpl.setMobile(relianceReality.getMobile());
		relianceRealityImpl.setAgeOfProperty(relianceReality.getAgeOfProperty());
		relianceRealityImpl.setGroupCompanyName(relianceReality.getGroupCompanyName());
		relianceRealityImpl.setCreateDate(relianceReality.getCreateDate());

		return relianceRealityImpl;
	}

	/**
	 * Returns the reliance reality with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the reliance reality
	 * @return the reliance reality
	 * @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	 */
	@Override
	public RelianceReality findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRelianceRealityException {
		RelianceReality relianceReality = fetchByPrimaryKey(primaryKey);

		if (relianceReality == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRelianceRealityException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return relianceReality;
	}

	/**
	 * Returns the reliance reality with the primary key or throws a {@link NoSuchRelianceRealityException} if it could not be found.
	 *
	 * @param r_Id the primary key of the reliance reality
	 * @return the reliance reality
	 * @throws NoSuchRelianceRealityException if a reliance reality with the primary key could not be found
	 */
	@Override
	public RelianceReality findByPrimaryKey(long r_Id)
		throws NoSuchRelianceRealityException {
		return findByPrimaryKey((Serializable)r_Id);
	}

	/**
	 * Returns the reliance reality with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the reliance reality
	 * @return the reliance reality, or <code>null</code> if a reliance reality with the primary key could not be found
	 */
	@Override
	public RelianceReality fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
				RelianceRealityImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RelianceReality relianceReality = (RelianceReality)serializable;

		if (relianceReality == null) {
			Session session = null;

			try {
				session = openSession();

				relianceReality = (RelianceReality)session.get(RelianceRealityImpl.class,
						primaryKey);

				if (relianceReality != null) {
					cacheResult(relianceReality);
				}
				else {
					entityCache.putResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
						RelianceRealityImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
					RelianceRealityImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return relianceReality;
	}

	/**
	 * Returns the reliance reality with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param r_Id the primary key of the reliance reality
	 * @return the reliance reality, or <code>null</code> if a reliance reality with the primary key could not be found
	 */
	@Override
	public RelianceReality fetchByPrimaryKey(long r_Id) {
		return fetchByPrimaryKey((Serializable)r_Id);
	}

	@Override
	public Map<Serializable, RelianceReality> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RelianceReality> map = new HashMap<Serializable, RelianceReality>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RelianceReality relianceReality = fetchByPrimaryKey(primaryKey);

			if (relianceReality != null) {
				map.put(primaryKey, relianceReality);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
					RelianceRealityImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (RelianceReality)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RELIANCEREALITY_WHERE_PKS_IN);

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

			for (RelianceReality relianceReality : (List<RelianceReality>)q.list()) {
				map.put(relianceReality.getPrimaryKeyObj(), relianceReality);

				cacheResult(relianceReality);

				uncachedPrimaryKeys.remove(relianceReality.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RelianceRealityModelImpl.ENTITY_CACHE_ENABLED,
					RelianceRealityImpl.class, primaryKey, nullModel);
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
	 * Returns all the reliance realities.
	 *
	 * @return the reliance realities
	 */
	@Override
	public List<RelianceReality> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the reliance realities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reliance realities
	 * @param end the upper bound of the range of reliance realities (not inclusive)
	 * @return the range of reliance realities
	 */
	@Override
	public List<RelianceReality> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the reliance realities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reliance realities
	 * @param end the upper bound of the range of reliance realities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reliance realities
	 */
	@Override
	public List<RelianceReality> findAll(int start, int end,
		OrderByComparator<RelianceReality> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the reliance realities.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RelianceRealityModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of reliance realities
	 * @param end the upper bound of the range of reliance realities (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of reliance realities
	 */
	@Override
	public List<RelianceReality> findAll(int start, int end,
		OrderByComparator<RelianceReality> orderByComparator,
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

		List<RelianceReality> list = null;

		if (retrieveFromCache) {
			list = (List<RelianceReality>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RELIANCEREALITY);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RELIANCEREALITY;

				if (pagination) {
					sql = sql.concat(RelianceRealityModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RelianceReality>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RelianceReality>)QueryUtil.list(q,
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
	 * Removes all the reliance realities from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RelianceReality relianceReality : findAll()) {
			remove(relianceReality);
		}
	}

	/**
	 * Returns the number of reliance realities.
	 *
	 * @return the number of reliance realities
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RELIANCEREALITY);

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
		return RelianceRealityModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the reliance reality persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RelianceRealityImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RELIANCEREALITY = "SELECT relianceReality FROM RelianceReality relianceReality";
	private static final String _SQL_SELECT_RELIANCEREALITY_WHERE_PKS_IN = "SELECT relianceReality FROM RelianceReality relianceReality WHERE R_ID IN (";
	private static final String _SQL_COUNT_RELIANCEREALITY = "SELECT COUNT(relianceReality) FROM RelianceReality relianceReality";
	private static final String _ORDER_BY_ENTITY_ALIAS = "relianceReality.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RelianceReality exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(RelianceRealityPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"r_Id", "city", "location", "address", "area", "type",
				"guidancePrice", "propertyId", "offerPrice", "funding", "days",
				"empcode", "name", "email_id", "mobile", "ageOfProperty",
				"groupCompanyName", "createDate"
			});
}