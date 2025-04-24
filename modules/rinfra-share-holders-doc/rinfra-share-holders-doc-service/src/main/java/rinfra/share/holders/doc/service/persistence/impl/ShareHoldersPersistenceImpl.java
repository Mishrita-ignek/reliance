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

package rinfra.share.holders.doc.service.persistence.impl;

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

import rinfra.share.holders.doc.exception.NoSuchShareHoldersException;
import rinfra.share.holders.doc.model.ShareHolders;
import rinfra.share.holders.doc.model.impl.ShareHoldersImpl;
import rinfra.share.holders.doc.model.impl.ShareHoldersModelImpl;
import rinfra.share.holders.doc.service.persistence.ShareHoldersPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the share holders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ShareHoldersPersistence
 * @see rinfra.share.holders.doc.service.persistence.ShareHoldersUtil
 * @generated
 */
@ProviderType
public class ShareHoldersPersistenceImpl extends BasePersistenceImpl<ShareHolders>
	implements ShareHoldersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ShareHoldersUtil} to access the share holders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ShareHoldersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersModelImpl.FINDER_CACHE_ENABLED, ShareHoldersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersModelImpl.FINDER_CACHE_ENABLED, ShareHoldersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ShareHoldersPersistenceImpl() {
		setModelClass(ShareHolders.class);
	}

	/**
	 * Caches the share holders in the entity cache if it is enabled.
	 *
	 * @param shareHolders the share holders
	 */
	@Override
	public void cacheResult(ShareHolders shareHolders) {
		entityCache.putResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersImpl.class, shareHolders.getPrimaryKey(), shareHolders);

		shareHolders.resetOriginalValues();
	}

	/**
	 * Caches the share holderses in the entity cache if it is enabled.
	 *
	 * @param shareHolderses the share holderses
	 */
	@Override
	public void cacheResult(List<ShareHolders> shareHolderses) {
		for (ShareHolders shareHolders : shareHolderses) {
			if (entityCache.getResult(
						ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
						ShareHoldersImpl.class, shareHolders.getPrimaryKey()) == null) {
				cacheResult(shareHolders);
			}
			else {
				shareHolders.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all share holderses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ShareHoldersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the share holders.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ShareHolders shareHolders) {
		entityCache.removeResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersImpl.class, shareHolders.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<ShareHolders> shareHolderses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ShareHolders shareHolders : shareHolderses) {
			entityCache.removeResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
				ShareHoldersImpl.class, shareHolders.getPrimaryKey());
		}
	}

	/**
	 * Creates a new share holders with the primary key. Does not add the share holders to the database.
	 *
	 * @param FOLIO_NO the primary key for the new share holders
	 * @return the new share holders
	 */
	@Override
	public ShareHolders create(String FOLIO_NO) {
		ShareHolders shareHolders = new ShareHoldersImpl();

		shareHolders.setNew(true);
		shareHolders.setPrimaryKey(FOLIO_NO);

		return shareHolders;
	}

	/**
	 * Removes the share holders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FOLIO_NO the primary key of the share holders
	 * @return the share holders that was removed
	 * @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	 */
	@Override
	public ShareHolders remove(String FOLIO_NO)
		throws NoSuchShareHoldersException {
		return remove((Serializable)FOLIO_NO);
	}

	/**
	 * Removes the share holders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the share holders
	 * @return the share holders that was removed
	 * @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	 */
	@Override
	public ShareHolders remove(Serializable primaryKey)
		throws NoSuchShareHoldersException {
		Session session = null;

		try {
			session = openSession();

			ShareHolders shareHolders = (ShareHolders)session.get(ShareHoldersImpl.class,
					primaryKey);

			if (shareHolders == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchShareHoldersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(shareHolders);
		}
		catch (NoSuchShareHoldersException nsee) {
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
	protected ShareHolders removeImpl(ShareHolders shareHolders) {
		shareHolders = toUnwrappedModel(shareHolders);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(shareHolders)) {
				shareHolders = (ShareHolders)session.get(ShareHoldersImpl.class,
						shareHolders.getPrimaryKeyObj());
			}

			if (shareHolders != null) {
				session.delete(shareHolders);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (shareHolders != null) {
			clearCache(shareHolders);
		}

		return shareHolders;
	}

	@Override
	public ShareHolders updateImpl(ShareHolders shareHolders) {
		shareHolders = toUnwrappedModel(shareHolders);

		boolean isNew = shareHolders.isNew();

		Session session = null;

		try {
			session = openSession();

			if (shareHolders.isNew()) {
				session.save(shareHolders);

				shareHolders.setNew(false);
			}
			else {
				shareHolders = (ShareHolders)session.merge(shareHolders);
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

		entityCache.putResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
			ShareHoldersImpl.class, shareHolders.getPrimaryKey(), shareHolders,
			false);

		shareHolders.resetOriginalValues();

		return shareHolders;
	}

	protected ShareHolders toUnwrappedModel(ShareHolders shareHolders) {
		if (shareHolders instanceof ShareHoldersImpl) {
			return shareHolders;
		}

		ShareHoldersImpl shareHoldersImpl = new ShareHoldersImpl();

		shareHoldersImpl.setNew(shareHolders.isNew());
		shareHoldersImpl.setPrimaryKey(shareHolders.getPrimaryKey());

		shareHoldersImpl.setSRNO(shareHolders.getSRNO());
		shareHoldersImpl.setFOLIO_NO(shareHolders.getFOLIO_NO());
		shareHoldersImpl.setSHARES(shareHolders.getSHARES());

		return shareHoldersImpl;
	}

	/**
	 * Returns the share holders with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the share holders
	 * @return the share holders
	 * @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	 */
	@Override
	public ShareHolders findByPrimaryKey(Serializable primaryKey)
		throws NoSuchShareHoldersException {
		ShareHolders shareHolders = fetchByPrimaryKey(primaryKey);

		if (shareHolders == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchShareHoldersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return shareHolders;
	}

	/**
	 * Returns the share holders with the primary key or throws a {@link NoSuchShareHoldersException} if it could not be found.
	 *
	 * @param FOLIO_NO the primary key of the share holders
	 * @return the share holders
	 * @throws NoSuchShareHoldersException if a share holders with the primary key could not be found
	 */
	@Override
	public ShareHolders findByPrimaryKey(String FOLIO_NO)
		throws NoSuchShareHoldersException {
		return findByPrimaryKey((Serializable)FOLIO_NO);
	}

	/**
	 * Returns the share holders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the share holders
	 * @return the share holders, or <code>null</code> if a share holders with the primary key could not be found
	 */
	@Override
	public ShareHolders fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
				ShareHoldersImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ShareHolders shareHolders = (ShareHolders)serializable;

		if (shareHolders == null) {
			Session session = null;

			try {
				session = openSession();

				shareHolders = (ShareHolders)session.get(ShareHoldersImpl.class,
						primaryKey);

				if (shareHolders != null) {
					cacheResult(shareHolders);
				}
				else {
					entityCache.putResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
						ShareHoldersImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
					ShareHoldersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return shareHolders;
	}

	/**
	 * Returns the share holders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FOLIO_NO the primary key of the share holders
	 * @return the share holders, or <code>null</code> if a share holders with the primary key could not be found
	 */
	@Override
	public ShareHolders fetchByPrimaryKey(String FOLIO_NO) {
		return fetchByPrimaryKey((Serializable)FOLIO_NO);
	}

	@Override
	public Map<Serializable, ShareHolders> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ShareHolders> map = new HashMap<Serializable, ShareHolders>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ShareHolders shareHolders = fetchByPrimaryKey(primaryKey);

			if (shareHolders != null) {
				map.put(primaryKey, shareHolders);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
					ShareHoldersImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ShareHolders)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_SHAREHOLDERS_WHERE_PKS_IN);

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

			for (ShareHolders shareHolders : (List<ShareHolders>)q.list()) {
				map.put(shareHolders.getPrimaryKeyObj(), shareHolders);

				cacheResult(shareHolders);

				uncachedPrimaryKeys.remove(shareHolders.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ShareHoldersModelImpl.ENTITY_CACHE_ENABLED,
					ShareHoldersImpl.class, primaryKey, nullModel);
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
	 * Returns all the share holderses.
	 *
	 * @return the share holderses
	 */
	@Override
	public List<ShareHolders> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the share holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of share holderses
	 * @param end the upper bound of the range of share holderses (not inclusive)
	 * @return the range of share holderses
	 */
	@Override
	public List<ShareHolders> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the share holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of share holderses
	 * @param end the upper bound of the range of share holderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of share holderses
	 */
	@Override
	public List<ShareHolders> findAll(int start, int end,
		OrderByComparator<ShareHolders> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the share holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ShareHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of share holderses
	 * @param end the upper bound of the range of share holderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of share holderses
	 */
	@Override
	public List<ShareHolders> findAll(int start, int end,
		OrderByComparator<ShareHolders> orderByComparator,
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

		List<ShareHolders> list = null;

		if (retrieveFromCache) {
			list = (List<ShareHolders>)finderCache.getResult(finderPath,
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
					sql = sql.concat(ShareHoldersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ShareHolders>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ShareHolders>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the share holderses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ShareHolders shareHolders : findAll()) {
			remove(shareHolders);
		}
	}

	/**
	 * Returns the number of share holderses.
	 *
	 * @return the number of share holderses
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
		return ShareHoldersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the share holders persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ShareHoldersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_SHAREHOLDERS = "SELECT shareHolders FROM ShareHolders shareHolders";
	private static final String _SQL_SELECT_SHAREHOLDERS_WHERE_PKS_IN = "SELECT shareHolders FROM ShareHolders shareHolders WHERE FOLIO_NO IN (";
	private static final String _SQL_COUNT_SHAREHOLDERS = "SELECT COUNT(shareHolders) FROM ShareHolders shareHolders";
	private static final String _ORDER_BY_ENTITY_ALIAS = "shareHolders.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ShareHolders exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ShareHoldersPersistenceImpl.class);
}