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

package com.newrpower.share.doc.service.persistence.impl;

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

import com.newrpower.share.doc.exception.NoSuchShareHoldersDocException;
import com.newrpower.share.doc.model.ShareHoldersDoc;
import com.newrpower.share.doc.model.impl.ShareHoldersDocImpl;
import com.newrpower.share.doc.model.impl.ShareHoldersDocModelImpl;
import com.newrpower.share.doc.service.persistence.ShareHoldersDocPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the share holders doc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersDocPersistence
 * @see com.newrpower.share.doc.service.persistence.ShareHoldersDocUtil
 * @generated
 */
@ProviderType
public class ShareHoldersDocPersistenceImpl extends BasePersistenceImpl<ShareHoldersDoc>
	implements ShareHoldersDocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ShareHoldersDocUtil} to access the share holders doc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ShareHoldersDocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersDocModelImpl.FINDER_CACHE_ENABLED,
			ShareHoldersDocImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersDocModelImpl.FINDER_CACHE_ENABLED,
			ShareHoldersDocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersDocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ShareHoldersDocPersistenceImpl() {
		setModelClass(ShareHoldersDoc.class);
	}

	/**
	 * Caches the share holders doc in the entity cache if it is enabled.
	 *
	 * @param shareHoldersDoc the share holders doc
	 */
	@Override
	public void cacheResult(ShareHoldersDoc shareHoldersDoc) {
		entityCache.putResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersDocImpl.class, shareHoldersDoc.getPrimaryKey(),
			shareHoldersDoc);

		shareHoldersDoc.resetOriginalValues();
	}

	/**
	 * Caches the share holders docs in the entity cache if it is enabled.
	 *
	 * @param shareHoldersDocs the share holders docs
	 */
	@Override
	public void cacheResult(List<ShareHoldersDoc> shareHoldersDocs) {
		for (ShareHoldersDoc shareHoldersDoc : shareHoldersDocs) {
			if (entityCache.getResult(
						ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
						ShareHoldersDocImpl.class,
						shareHoldersDoc.getPrimaryKey()) == null) {
				cacheResult(shareHoldersDoc);
			}
			else {
				shareHoldersDoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all share holders docs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ShareHoldersDocImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the share holders doc.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ShareHoldersDoc shareHoldersDoc) {
		entityCache.removeResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersDocImpl.class, shareHoldersDoc.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ShareHoldersDoc> shareHoldersDocs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ShareHoldersDoc shareHoldersDoc : shareHoldersDocs) {
			entityCache.removeResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
				ShareHoldersDocImpl.class, shareHoldersDoc.getPrimaryKey());
		}
	}

	/**
	 * Creates a new share holders doc with the primary key. Does not add the share holders doc to the database.
	 *
	 * @param pressId the primary key for the new share holders doc
	 * @return the new share holders doc
	 */
	@Override
	public ShareHoldersDoc create(long pressId) {
		ShareHoldersDoc shareHoldersDoc = new ShareHoldersDocImpl();

		shareHoldersDoc.setNew(true);
		shareHoldersDoc.setPrimaryKey(pressId);

		return shareHoldersDoc;
	}

	/**
	 * Removes the share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pressId the primary key of the share holders doc
	 * @return the share holders doc that was removed
	 * @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	 */
	@Override
	public ShareHoldersDoc remove(long pressId)
		throws NoSuchShareHoldersDocException {
		return remove((Serializable)pressId);
	}

	/**
	 * Removes the share holders doc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the share holders doc
	 * @return the share holders doc that was removed
	 * @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	 */
	@Override
	public ShareHoldersDoc remove(Serializable primaryKey)
		throws NoSuchShareHoldersDocException {
		Session session = null;

		try {
			session = openSession();

			ShareHoldersDoc shareHoldersDoc = (ShareHoldersDoc)session.get(ShareHoldersDocImpl.class,
					primaryKey);

			if (shareHoldersDoc == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShareHoldersDocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shareHoldersDoc);
		}
		catch (NoSuchShareHoldersDocException nsee) {
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
	protected ShareHoldersDoc removeImpl(ShareHoldersDoc shareHoldersDoc) {
		shareHoldersDoc = toUnwrappedModel(shareHoldersDoc);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shareHoldersDoc)) {
				shareHoldersDoc = (ShareHoldersDoc)session.get(ShareHoldersDocImpl.class,
						shareHoldersDoc.getPrimaryKeyObj());
			}

			if (shareHoldersDoc != null) {
				session.delete(shareHoldersDoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (shareHoldersDoc != null) {
			clearCache(shareHoldersDoc);
		}

		return shareHoldersDoc;
	}

	@Override
	public ShareHoldersDoc updateImpl(ShareHoldersDoc shareHoldersDoc) {
		shareHoldersDoc = toUnwrappedModel(shareHoldersDoc);

		boolean isNew = shareHoldersDoc.isNew();

		Session session = null;

		try {
			session = openSession();

			if (shareHoldersDoc.isNew()) {
				session.save(shareHoldersDoc);

				shareHoldersDoc.setNew(false);
			}
			else {
				shareHoldersDoc = (ShareHoldersDoc)session.merge(shareHoldersDoc);
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

		entityCache.putResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersDocImpl.class, shareHoldersDoc.getPrimaryKey(),
			shareHoldersDoc, false);

		shareHoldersDoc.resetOriginalValues();

		return shareHoldersDoc;
	}

	protected ShareHoldersDoc toUnwrappedModel(ShareHoldersDoc shareHoldersDoc) {
		if (shareHoldersDoc instanceof ShareHoldersDocImpl) {
			return shareHoldersDoc;
		}

		ShareHoldersDocImpl shareHoldersDocImpl = new ShareHoldersDocImpl();

		shareHoldersDocImpl.setNew(shareHoldersDoc.isNew());
		shareHoldersDocImpl.setPrimaryKey(shareHoldersDoc.getPrimaryKey());

		shareHoldersDocImpl.setPressId(shareHoldersDoc.getPressId());
		shareHoldersDocImpl.setHeading(shareHoldersDoc.getHeading());
		shareHoldersDocImpl.setDescription(shareHoldersDoc.getDescription());
		shareHoldersDocImpl.setFileURL(shareHoldersDoc.getFileURL());

		return shareHoldersDocImpl;
	}

	/**
	 * Returns the share holders doc with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the share holders doc
	 * @return the share holders doc
	 * @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	 */
	@Override
	public ShareHoldersDoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchShareHoldersDocException {
		ShareHoldersDoc shareHoldersDoc = fetchByPrimaryKey(primaryKey);

		if (shareHoldersDoc == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchShareHoldersDocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return shareHoldersDoc;
	}

	/**
	 * Returns the share holders doc with the primary key or throws a {@link NoSuchShareHoldersDocException} if it could not be found.
	 *
	 * @param pressId the primary key of the share holders doc
	 * @return the share holders doc
	 * @throws NoSuchShareHoldersDocException if a share holders doc with the primary key could not be found
	 */
	@Override
	public ShareHoldersDoc findByPrimaryKey(long pressId)
		throws NoSuchShareHoldersDocException {
		return findByPrimaryKey((Serializable)pressId);
	}

	/**
	 * Returns the share holders doc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the share holders doc
	 * @return the share holders doc, or <code>null</code> if a share holders doc with the primary key could not be found
	 */
	@Override
	public ShareHoldersDoc fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
				ShareHoldersDocImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ShareHoldersDoc shareHoldersDoc = (ShareHoldersDoc)serializable;

		if (shareHoldersDoc == null) {
			Session session = null;

			try {
				session = openSession();

				shareHoldersDoc = (ShareHoldersDoc)session.get(ShareHoldersDocImpl.class,
						primaryKey);

				if (shareHoldersDoc != null) {
					cacheResult(shareHoldersDoc);
				}
				else {
					entityCache.putResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
						ShareHoldersDocImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
					ShareHoldersDocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return shareHoldersDoc;
	}

	/**
	 * Returns the share holders doc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pressId the primary key of the share holders doc
	 * @return the share holders doc, or <code>null</code> if a share holders doc with the primary key could not be found
	 */
	@Override
	public ShareHoldersDoc fetchByPrimaryKey(long pressId) {
		return fetchByPrimaryKey((Serializable)pressId);
	}

	@Override
	public Map<Serializable, ShareHoldersDoc> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ShareHoldersDoc> map = new HashMap<Serializable, ShareHoldersDoc>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ShareHoldersDoc shareHoldersDoc = fetchByPrimaryKey(primaryKey);

			if (shareHoldersDoc != null) {
				map.put(primaryKey, shareHoldersDoc);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
					ShareHoldersDocImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ShareHoldersDoc)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SHAREHOLDERSDOC_WHERE_PKS_IN);

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

			for (ShareHoldersDoc shareHoldersDoc : (List<ShareHoldersDoc>)q.list()) {
				map.put(shareHoldersDoc.getPrimaryKeyObj(), shareHoldersDoc);

				cacheResult(shareHoldersDoc);

				uncachedPrimaryKeys.remove(shareHoldersDoc.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ShareHoldersDocModelImpl.ENTITY_CACHE_ENABLED,
					ShareHoldersDocImpl.class, primaryKey, nullModel);
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
	 * Returns all the share holders docs.
	 *
	 * @return the share holders docs
	 */
	@Override
	public List<ShareHoldersDoc> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the share holders docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of share holders docs
	 * @param end the upper bound of the range of share holders docs (not inclusive)
	 * @return the range of share holders docs
	 */
	@Override
	public List<ShareHoldersDoc> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the share holders docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of share holders docs
	 * @param end the upper bound of the range of share holders docs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of share holders docs
	 */
	@Override
	public List<ShareHoldersDoc> findAll(int start, int end,
		OrderByComparator<ShareHoldersDoc> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the share holders docs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersDocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of share holders docs
	 * @param end the upper bound of the range of share holders docs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of share holders docs
	 */
	@Override
	public List<ShareHoldersDoc> findAll(int start, int end,
		OrderByComparator<ShareHoldersDoc> orderByComparator,
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

		List<ShareHoldersDoc> list = null;

		if (retrieveFromCache) {
			list = (List<ShareHoldersDoc>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_SHAREHOLDERSDOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_SHAREHOLDERSDOC;

				if (pagination) {
					sql = sql.concat(ShareHoldersDocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ShareHoldersDoc>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ShareHoldersDoc>)QueryUtil.list(q,
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
	 * Removes all the share holders docs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ShareHoldersDoc shareHoldersDoc : findAll()) {
			remove(shareHoldersDoc);
		}
	}

	/**
	 * Returns the number of share holders docs.
	 *
	 * @return the number of share holders docs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_SHAREHOLDERSDOC);

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
		return ShareHoldersDocModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the share holders doc persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ShareHoldersDocImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SHAREHOLDERSDOC = "SELECT shareHoldersDoc FROM ShareHoldersDoc shareHoldersDoc";
	private static final String _SQL_SELECT_SHAREHOLDERSDOC_WHERE_PKS_IN = "SELECT shareHoldersDoc FROM ShareHoldersDoc shareHoldersDoc WHERE pressId IN (";
	private static final String _SQL_COUNT_SHAREHOLDERSDOC = "SELECT COUNT(shareHoldersDoc) FROM ShareHoldersDoc shareHoldersDoc";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shareHoldersDoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ShareHoldersDoc exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ShareHoldersDocPersistenceImpl.class);
}