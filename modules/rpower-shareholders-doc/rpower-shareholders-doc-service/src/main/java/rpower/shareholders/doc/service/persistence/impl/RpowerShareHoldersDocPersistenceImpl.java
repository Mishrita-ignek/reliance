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
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import rpower.shareholders.doc.exception.NoSuchRpowerShareHoldersDocException;
import rpower.shareholders.doc.model.RpowerShareHoldersDoc;
import rpower.shareholders.doc.model.impl.RpowerShareHoldersDocImpl;
import rpower.shareholders.doc.model.impl.RpowerShareHoldersDocModelImpl;
import rpower.shareholders.doc.service.persistence.RpowerShareHoldersDocPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the rpower share holders doc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerShareHoldersDocPersistence
 * @see rpower.shareholders.doc.service.persistence.RpowerShareHoldersDocUtil
 * @generated
 */
@ProviderType
public class RpowerShareHoldersDocPersistenceImpl extends BasePersistenceImpl<RpowerShareHoldersDoc>
	implements RpowerShareHoldersDocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RpowerShareHoldersDocUtil} to access the rpower share holders doc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RpowerShareHoldersDocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersDocModelImpl.FINDER_CACHE_ENABLED,
			RpowerShareHoldersDocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersDocModelImpl.FINDER_CACHE_ENABLED,
			RpowerShareHoldersDocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersDocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RpowerShareHoldersDocPersistenceImpl() {
		setModelClass(RpowerShareHoldersDoc.class);
	}

	/**
	 * Caches the rpower share holders doc in the entity cache if it is enabled.
	 *
	 * @param rpowerShareHoldersDoc the rpower share holders doc
	 */
	@Override
	public void cacheResult(RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		entityCache.putResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersDocImpl.class,
			rpowerShareHoldersDoc.getPrimaryKey(), rpowerShareHoldersDoc);

		rpowerShareHoldersDoc.resetOriginalValues();
	}

	/**
	 * Caches the rpower share holders docs in the entity cache if it is enabled.
	 *
	 * @param rpowerShareHoldersDocs the rpower share holders docs
	 */
	@Override
	public void cacheResult(List<RpowerShareHoldersDoc> rpowerShareHoldersDocs) {
		for (RpowerShareHoldersDoc rpowerShareHoldersDoc : rpowerShareHoldersDocs) {
			if (entityCache.getResult(
						RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
						RpowerShareHoldersDocImpl.class,
						rpowerShareHoldersDoc.getPrimaryKey()) == null) {
				cacheResult(rpowerShareHoldersDoc);
			}
			else {
				rpowerShareHoldersDoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rpower share holders docs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpowerShareHoldersDocImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rpower share holders doc.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		entityCache.removeResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersDocImpl.class,
			rpowerShareHoldersDoc.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RpowerShareHoldersDoc> rpowerShareHoldersDocs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RpowerShareHoldersDoc rpowerShareHoldersDoc : rpowerShareHoldersDocs) {
			entityCache.removeResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
				RpowerShareHoldersDocImpl.class,
				rpowerShareHoldersDoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rpower share holders doc with the primary key. Does not add the rpower share holders doc to the database.
	 *
	 * @param pressId the primary key for the new rpower share holders doc
	 * @return the new rpower share holders doc
	 */
	@Override
	public RpowerShareHoldersDoc create(long pressId) {
		RpowerShareHoldersDoc rpowerShareHoldersDoc = new RpowerShareHoldersDocImpl();

		rpowerShareHoldersDoc.setNew(true);
		rpowerShareHoldersDoc.setPrimaryKey(pressId);

		return rpowerShareHoldersDoc;
	}

	/**
	 * Removes the rpower share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pressId the primary key of the rpower share holders doc
	 * @return the rpower share holders doc that was removed
	 * @throws NoSuchRpowerShareHoldersDocException if a rpower share holders doc with the primary key could not be found
	 */
	@Override
	public RpowerShareHoldersDoc remove(long pressId)
		throws NoSuchRpowerShareHoldersDocException {
		return remove((Serializable)pressId);
	}

	/**
	 * Removes the rpower share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rpower share holders doc
	 * @return the rpower share holders doc that was removed
	 * @throws NoSuchRpowerShareHoldersDocException if a rpower share holders doc with the primary key could not be found
	 */
	@Override
	public RpowerShareHoldersDoc remove(Serializable primaryKey)
		throws NoSuchRpowerShareHoldersDocException {
		Session session = null;

		try {
			session = openSession();

			RpowerShareHoldersDoc rpowerShareHoldersDoc = (RpowerShareHoldersDoc)session.get(RpowerShareHoldersDocImpl.class,
					primaryKey);

			if (rpowerShareHoldersDoc == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpowerShareHoldersDocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rpowerShareHoldersDoc);
		}
		catch (NoSuchRpowerShareHoldersDocException nsee) {
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
	protected RpowerShareHoldersDoc removeImpl(
		RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		rpowerShareHoldersDoc = toUnwrappedModel(rpowerShareHoldersDoc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpowerShareHoldersDoc)) {
				rpowerShareHoldersDoc = (RpowerShareHoldersDoc)session.get(RpowerShareHoldersDocImpl.class,
						rpowerShareHoldersDoc.getPrimaryKeyObj());
			}

			if (rpowerShareHoldersDoc != null) {
				session.delete(rpowerShareHoldersDoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rpowerShareHoldersDoc != null) {
			clearCache(rpowerShareHoldersDoc);
		}

		return rpowerShareHoldersDoc;
	}

	@Override
	public RpowerShareHoldersDoc updateImpl(
		RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		rpowerShareHoldersDoc = toUnwrappedModel(rpowerShareHoldersDoc);

		boolean isNew = rpowerShareHoldersDoc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (rpowerShareHoldersDoc.isNew()) {
				session.save(rpowerShareHoldersDoc);

				rpowerShareHoldersDoc.setNew(false);
			}
			else {
				rpowerShareHoldersDoc = (RpowerShareHoldersDoc)session.merge(rpowerShareHoldersDoc);
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

		entityCache.putResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			RpowerShareHoldersDocImpl.class,
			rpowerShareHoldersDoc.getPrimaryKey(), rpowerShareHoldersDoc, false);

		rpowerShareHoldersDoc.resetOriginalValues();

		return rpowerShareHoldersDoc;
	}

	protected RpowerShareHoldersDoc toUnwrappedModel(
		RpowerShareHoldersDoc rpowerShareHoldersDoc) {
		if (rpowerShareHoldersDoc instanceof RpowerShareHoldersDocImpl) {
			return rpowerShareHoldersDoc;
		}

		RpowerShareHoldersDocImpl rpowerShareHoldersDocImpl = new RpowerShareHoldersDocImpl();

		rpowerShareHoldersDocImpl.setNew(rpowerShareHoldersDoc.isNew());
		rpowerShareHoldersDocImpl.setPrimaryKey(rpowerShareHoldersDoc.getPrimaryKey());

		rpowerShareHoldersDocImpl.setPressId(rpowerShareHoldersDoc.getPressId());
		rpowerShareHoldersDocImpl.setHeading(rpowerShareHoldersDoc.getHeading());
		rpowerShareHoldersDocImpl.setDescription(rpowerShareHoldersDoc.getDescription());
		rpowerShareHoldersDocImpl.setFileURL(rpowerShareHoldersDoc.getFileURL());

		return rpowerShareHoldersDocImpl;
	}

	/**
	 * Returns the rpower share holders doc with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rpower share holders doc
	 * @return the rpower share holders doc
	 * @throws NoSuchRpowerShareHoldersDocException if a rpower share holders doc with the primary key could not be found
	 */
	@Override
	public RpowerShareHoldersDoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpowerShareHoldersDocException {
		RpowerShareHoldersDoc rpowerShareHoldersDoc = fetchByPrimaryKey(primaryKey);

		if (rpowerShareHoldersDoc == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpowerShareHoldersDocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rpowerShareHoldersDoc;
	}

	/**
	 * Returns the rpower share holders doc with the primary key or throws a {@link NoSuchRpowerShareHoldersDocException} if it could not be found.
	 *
	 * @param pressId the primary key of the rpower share holders doc
	 * @return the rpower share holders doc
	 * @throws NoSuchRpowerShareHoldersDocException if a rpower share holders doc with the primary key could not be found
	 */
	@Override
	public RpowerShareHoldersDoc findByPrimaryKey(long pressId)
		throws NoSuchRpowerShareHoldersDocException {
		return findByPrimaryKey((Serializable)pressId);
	}

	/**
	 * Returns the rpower share holders doc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rpower share holders doc
	 * @return the rpower share holders doc, or <code>null</code> if a rpower share holders doc with the primary key could not be found
	 */
	@Override
	public RpowerShareHoldersDoc fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
				RpowerShareHoldersDocImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RpowerShareHoldersDoc rpowerShareHoldersDoc = (RpowerShareHoldersDoc)serializable;

		if (rpowerShareHoldersDoc == null) {
			Session session = null;

			try {
				session = openSession();

				rpowerShareHoldersDoc = (RpowerShareHoldersDoc)session.get(RpowerShareHoldersDocImpl.class,
						primaryKey);

				if (rpowerShareHoldersDoc != null) {
					cacheResult(rpowerShareHoldersDoc);
				}
				else {
					entityCache.putResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
						RpowerShareHoldersDocImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
					RpowerShareHoldersDocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rpowerShareHoldersDoc;
	}

	/**
	 * Returns the rpower share holders doc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pressId the primary key of the rpower share holders doc
	 * @return the rpower share holders doc, or <code>null</code> if a rpower share holders doc with the primary key could not be found
	 */
	@Override
	public RpowerShareHoldersDoc fetchByPrimaryKey(long pressId) {
		return fetchByPrimaryKey((Serializable)pressId);
	}

	@Override
	public Map<Serializable, RpowerShareHoldersDoc> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RpowerShareHoldersDoc> map = new HashMap<Serializable, RpowerShareHoldersDoc>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RpowerShareHoldersDoc rpowerShareHoldersDoc = fetchByPrimaryKey(primaryKey);

			if (rpowerShareHoldersDoc != null) {
				map.put(primaryKey, rpowerShareHoldersDoc);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
					RpowerShareHoldersDocImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (RpowerShareHoldersDoc)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RPOWERSHAREHOLDERSDOC_WHERE_PKS_IN);

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

			for (RpowerShareHoldersDoc rpowerShareHoldersDoc : (List<RpowerShareHoldersDoc>)q.list()) {
				map.put(rpowerShareHoldersDoc.getPrimaryKeyObj(),
					rpowerShareHoldersDoc);

				cacheResult(rpowerShareHoldersDoc);

				uncachedPrimaryKeys.remove(rpowerShareHoldersDoc.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RpowerShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
					RpowerShareHoldersDocImpl.class, primaryKey, nullModel);
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
	 * Returns all the rpower share holders docs.
	 *
	 * @return the rpower share holders docs
	 */
	@Override
	public List<RpowerShareHoldersDoc> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rpower share holders docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower share holders docs
	 * @param end the upper bound of the range of rpower share holders docs (not inclusive)
	 * @return the range of rpower share holders docs
	 */
	@Override
	public List<RpowerShareHoldersDoc> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rpower share holders docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower share holders docs
	 * @param end the upper bound of the range of rpower share holders docs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rpower share holders docs
	 */
	@Override
	public List<RpowerShareHoldersDoc> findAll(int start, int end,
		OrderByComparator<RpowerShareHoldersDoc> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rpower share holders docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower share holders docs
	 * @param end the upper bound of the range of rpower share holders docs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of rpower share holders docs
	 */
	@Override
	public List<RpowerShareHoldersDoc> findAll(int start, int end,
		OrderByComparator<RpowerShareHoldersDoc> orderByComparator,
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

		List<RpowerShareHoldersDoc> list = null;

		if (retrieveFromCache) {
			list = (List<RpowerShareHoldersDoc>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RPOWERSHAREHOLDERSDOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RPOWERSHAREHOLDERSDOC;

				if (pagination) {
					sql = sql.concat(RpowerShareHoldersDocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RpowerShareHoldersDoc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RpowerShareHoldersDoc>)QueryUtil.list(q,
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
	 * Removes all the rpower share holders docs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpowerShareHoldersDoc rpowerShareHoldersDoc : findAll()) {
			remove(rpowerShareHoldersDoc);
		}
	}

	/**
	 * Returns the number of rpower share holders docs.
	 *
	 * @return the number of rpower share holders docs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RPOWERSHAREHOLDERSDOC);

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
		return RpowerShareHoldersDocModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rpower share holders doc persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RpowerShareHoldersDocImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RPOWERSHAREHOLDERSDOC = "SELECT rpowerShareHoldersDoc FROM RpowerShareHoldersDoc rpowerShareHoldersDoc";
	private static final String _SQL_SELECT_RPOWERSHAREHOLDERSDOC_WHERE_PKS_IN = "SELECT rpowerShareHoldersDoc FROM RpowerShareHoldersDoc rpowerShareHoldersDoc WHERE pressId IN (";
	private static final String _SQL_COUNT_RPOWERSHAREHOLDERSDOC = "SELECT COUNT(rpowerShareHoldersDoc) FROM RpowerShareHoldersDoc rpowerShareHoldersDoc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rpowerShareHoldersDoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RpowerShareHoldersDoc exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(RpowerShareHoldersDocPersistenceImpl.class);
}