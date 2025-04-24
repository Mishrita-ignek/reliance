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

package com.unpaid.unclaimed.dividend.holders.service.persistence.impl;

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

import com.unpaid.unclaimed.dividend.holders.exception.NoSuchUnpaidUnclaimedDevidendHoldersException;
import com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders;
import com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersImpl;
import com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersModelImpl;
import com.unpaid.unclaimed.dividend.holders.service.persistence.UnpaidUnclaimedDevidendHoldersPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the unpaid unclaimed devidend holders service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendHoldersPersistence
 * @see com.unpaid.unclaimed.dividend.holders.service.persistence.UnpaidUnclaimedDevidendHoldersUtil
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendHoldersPersistenceImpl
	extends BasePersistenceImpl<UnpaidUnclaimedDevidendHolders>
	implements UnpaidUnclaimedDevidendHoldersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UnpaidUnclaimedDevidendHoldersUtil} to access the unpaid unclaimed devidend holders persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UnpaidUnclaimedDevidendHoldersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersModelImpl.FINDER_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersModelImpl.FINDER_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

	public UnpaidUnclaimedDevidendHoldersPersistenceImpl() {
		setModelClass(UnpaidUnclaimedDevidendHolders.class);
	}

	/**
	 * Caches the unpaid unclaimed devidend holders in the entity cache if it is enabled.
	 *
	 * @param unpaidUnclaimedDevidendHolders the unpaid unclaimed devidend holders
	 */
	@Override
	public void cacheResult(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		entityCache.putResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersImpl.class,
			unpaidUnclaimedDevidendHolders.getPrimaryKey(),
			unpaidUnclaimedDevidendHolders);

		unpaidUnclaimedDevidendHolders.resetOriginalValues();
	}

	/**
	 * Caches the unpaid unclaimed devidend holderses in the entity cache if it is enabled.
	 *
	 * @param unpaidUnclaimedDevidendHolderses the unpaid unclaimed devidend holderses
	 */
	@Override
	public void cacheResult(
		List<UnpaidUnclaimedDevidendHolders> unpaidUnclaimedDevidendHolderses) {
		for (UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders : unpaidUnclaimedDevidendHolderses) {
			if (entityCache.getResult(
						UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
						UnpaidUnclaimedDevidendHoldersImpl.class,
						unpaidUnclaimedDevidendHolders.getPrimaryKey()) == null) {
				cacheResult(unpaidUnclaimedDevidendHolders);
			}
			else {
				unpaidUnclaimedDevidendHolders.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all unpaid unclaimed devidend holderses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UnpaidUnclaimedDevidendHoldersImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the unpaid unclaimed devidend holders.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		entityCache.removeResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersImpl.class,
			unpaidUnclaimedDevidendHolders.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<UnpaidUnclaimedDevidendHolders> unpaidUnclaimedDevidendHolderses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders : unpaidUnclaimedDevidendHolderses) {
			entityCache.removeResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
				UnpaidUnclaimedDevidendHoldersImpl.class,
				unpaidUnclaimedDevidendHolders.getPrimaryKey());
		}
	}

	/**
	 * Creates a new unpaid unclaimed devidend holders with the primary key. Does not add the unpaid unclaimed devidend holders to the database.
	 *
	 * @param SRNO the primary key for the new unpaid unclaimed devidend holders
	 * @return the new unpaid unclaimed devidend holders
	 */
	@Override
	public UnpaidUnclaimedDevidendHolders create(long SRNO) {
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders = new UnpaidUnclaimedDevidendHoldersImpl();

		unpaidUnclaimedDevidendHolders.setNew(true);
		unpaidUnclaimedDevidendHolders.setPrimaryKey(SRNO);

		return unpaidUnclaimedDevidendHolders;
	}

	/**
	 * Removes the unpaid unclaimed devidend holders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend holders
	 * @return the unpaid unclaimed devidend holders that was removed
	 * @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidendHolders remove(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendHoldersException {
		return remove((Serializable)SRNO);
	}

	/**
	 * Removes the unpaid unclaimed devidend holders with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend holders
	 * @return the unpaid unclaimed devidend holders that was removed
	 * @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidendHolders remove(Serializable primaryKey)
		throws NoSuchUnpaidUnclaimedDevidendHoldersException {
		Session session = null;

		try {
			session = openSession();

			UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders = (UnpaidUnclaimedDevidendHolders)session.get(UnpaidUnclaimedDevidendHoldersImpl.class,
					primaryKey);

			if (unpaidUnclaimedDevidendHolders == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUnpaidUnclaimedDevidendHoldersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(unpaidUnclaimedDevidendHolders);
		}
		catch (NoSuchUnpaidUnclaimedDevidendHoldersException nsee) {
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
	protected UnpaidUnclaimedDevidendHolders removeImpl(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		unpaidUnclaimedDevidendHolders = toUnwrappedModel(unpaidUnclaimedDevidendHolders);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(unpaidUnclaimedDevidendHolders)) {
				unpaidUnclaimedDevidendHolders = (UnpaidUnclaimedDevidendHolders)session.get(UnpaidUnclaimedDevidendHoldersImpl.class,
						unpaidUnclaimedDevidendHolders.getPrimaryKeyObj());
			}

			if (unpaidUnclaimedDevidendHolders != null) {
				session.delete(unpaidUnclaimedDevidendHolders);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (unpaidUnclaimedDevidendHolders != null) {
			clearCache(unpaidUnclaimedDevidendHolders);
		}

		return unpaidUnclaimedDevidendHolders;
	}

	@Override
	public UnpaidUnclaimedDevidendHolders updateImpl(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		unpaidUnclaimedDevidendHolders = toUnwrappedModel(unpaidUnclaimedDevidendHolders);

		boolean isNew = unpaidUnclaimedDevidendHolders.isNew();

		Session session = null;

		try {
			session = openSession();

			if (unpaidUnclaimedDevidendHolders.isNew()) {
				session.save(unpaidUnclaimedDevidendHolders);

				unpaidUnclaimedDevidendHolders.setNew(false);
			}
			else {
				unpaidUnclaimedDevidendHolders = (UnpaidUnclaimedDevidendHolders)session.merge(unpaidUnclaimedDevidendHolders);
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

		entityCache.putResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendHoldersImpl.class,
			unpaidUnclaimedDevidendHolders.getPrimaryKey(),
			unpaidUnclaimedDevidendHolders, false);

		unpaidUnclaimedDevidendHolders.resetOriginalValues();

		return unpaidUnclaimedDevidendHolders;
	}

	protected UnpaidUnclaimedDevidendHolders toUnwrappedModel(
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders) {
		if (unpaidUnclaimedDevidendHolders instanceof UnpaidUnclaimedDevidendHoldersImpl) {
			return unpaidUnclaimedDevidendHolders;
		}

		UnpaidUnclaimedDevidendHoldersImpl unpaidUnclaimedDevidendHoldersImpl = new UnpaidUnclaimedDevidendHoldersImpl();

		unpaidUnclaimedDevidendHoldersImpl.setNew(unpaidUnclaimedDevidendHolders.isNew());
		unpaidUnclaimedDevidendHoldersImpl.setPrimaryKey(unpaidUnclaimedDevidendHolders.getPrimaryKey());

		unpaidUnclaimedDevidendHoldersImpl.setSRNO(unpaidUnclaimedDevidendHolders.getSRNO());
		unpaidUnclaimedDevidendHoldersImpl.setFIRST_NAME(unpaidUnclaimedDevidendHolders.getFIRST_NAME());
		unpaidUnclaimedDevidendHoldersImpl.setMIDDLE_NAME(unpaidUnclaimedDevidendHolders.getMIDDLE_NAME());
		unpaidUnclaimedDevidendHoldersImpl.setLAST_NAME(unpaidUnclaimedDevidendHolders.getLAST_NAME());
		unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_FIRST_NAME(unpaidUnclaimedDevidendHolders.getFATHER_HUSBAND_FIRST_NAME());
		unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_MIDDLE_NAME(unpaidUnclaimedDevidendHolders.getFATHER_HUSBAND_MIDDLE_NAME());
		unpaidUnclaimedDevidendHoldersImpl.setFATHER_HUSBAND_LAST_NAME(unpaidUnclaimedDevidendHolders.getFATHER_HUSBAND_LAST_NAME());
		unpaidUnclaimedDevidendHoldersImpl.setADDRESS(unpaidUnclaimedDevidendHolders.getADDRESS());
		unpaidUnclaimedDevidendHoldersImpl.setCOUNTRY(unpaidUnclaimedDevidendHolders.getCOUNTRY());
		unpaidUnclaimedDevidendHoldersImpl.setSTATE(unpaidUnclaimedDevidendHolders.getSTATE());
		unpaidUnclaimedDevidendHoldersImpl.setDISTRICT(unpaidUnclaimedDevidendHolders.getDISTRICT());
		unpaidUnclaimedDevidendHoldersImpl.setPIN_CODE(unpaidUnclaimedDevidendHolders.getPIN_CODE());
		unpaidUnclaimedDevidendHoldersImpl.setFOLIO_NO_OF_ITIES(unpaidUnclaimedDevidendHolders.getFOLIO_NO_OF_ITIES());
		unpaidUnclaimedDevidendHoldersImpl.setINVESTMENT_TYPE(unpaidUnclaimedDevidendHolders.getINVESTMENT_TYPE());
		unpaidUnclaimedDevidendHoldersImpl.setAMOUNT_DUE_IN_RS(unpaidUnclaimedDevidendHolders.getAMOUNT_DUE_IN_RS());
		unpaidUnclaimedDevidendHoldersImpl.setPROPOSED_DATE_TRANSFER_IPEF(unpaidUnclaimedDevidendHolders.getPROPOSED_DATE_TRANSFER_IPEF());
		unpaidUnclaimedDevidendHoldersImpl.setCREATEDATE(unpaidUnclaimedDevidendHolders.getCREATEDATE());

		return unpaidUnclaimedDevidendHoldersImpl;
	}

	/**
	 * Returns the unpaid unclaimed devidend holders with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend holders
	 * @return the unpaid unclaimed devidend holders
	 * @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidendHolders findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchUnpaidUnclaimedDevidendHoldersException {
		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders = fetchByPrimaryKey(primaryKey);

		if (unpaidUnclaimedDevidendHolders == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUnpaidUnclaimedDevidendHoldersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return unpaidUnclaimedDevidendHolders;
	}

	/**
	 * Returns the unpaid unclaimed devidend holders with the primary key or throws a {@link NoSuchUnpaidUnclaimedDevidendHoldersException} if it could not be found.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend holders
	 * @return the unpaid unclaimed devidend holders
	 * @throws NoSuchUnpaidUnclaimedDevidendHoldersException if a unpaid unclaimed devidend holders with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidendHolders findByPrimaryKey(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendHoldersException {
		return findByPrimaryKey((Serializable)SRNO);
	}

	/**
	 * Returns the unpaid unclaimed devidend holders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend holders
	 * @return the unpaid unclaimed devidend holders, or <code>null</code> if a unpaid unclaimed devidend holders with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidendHolders fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
				UnpaidUnclaimedDevidendHoldersImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders = (UnpaidUnclaimedDevidendHolders)serializable;

		if (unpaidUnclaimedDevidendHolders == null) {
			Session session = null;

			try {
				session = openSession();

				unpaidUnclaimedDevidendHolders = (UnpaidUnclaimedDevidendHolders)session.get(UnpaidUnclaimedDevidendHoldersImpl.class,
						primaryKey);

				if (unpaidUnclaimedDevidendHolders != null) {
					cacheResult(unpaidUnclaimedDevidendHolders);
				}
				else {
					entityCache.putResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
						UnpaidUnclaimedDevidendHoldersImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
					UnpaidUnclaimedDevidendHoldersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return unpaidUnclaimedDevidendHolders;
	}

	/**
	 * Returns the unpaid unclaimed devidend holders with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend holders
	 * @return the unpaid unclaimed devidend holders, or <code>null</code> if a unpaid unclaimed devidend holders with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidendHolders fetchByPrimaryKey(long SRNO) {
		return fetchByPrimaryKey((Serializable)SRNO);
	}

	@Override
	public Map<Serializable, UnpaidUnclaimedDevidendHolders> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UnpaidUnclaimedDevidendHolders> map = new HashMap<Serializable, UnpaidUnclaimedDevidendHolders>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders = fetchByPrimaryKey(primaryKey);

			if (unpaidUnclaimedDevidendHolders != null) {
				map.put(primaryKey, unpaidUnclaimedDevidendHolders);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
					UnpaidUnclaimedDevidendHoldersImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(UnpaidUnclaimedDevidendHolders)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UNPAIDUNCLAIMEDDEVIDENDHOLDERS_WHERE_PKS_IN);

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

			for (UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders : (List<UnpaidUnclaimedDevidendHolders>)q.list()) {
				map.put(unpaidUnclaimedDevidendHolders.getPrimaryKeyObj(),
					unpaidUnclaimedDevidendHolders);

				cacheResult(unpaidUnclaimedDevidendHolders);

				uncachedPrimaryKeys.remove(unpaidUnclaimedDevidendHolders.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UnpaidUnclaimedDevidendHoldersModelImpl.ENTITY_CACHE_ENABLED,
					UnpaidUnclaimedDevidendHoldersImpl.class, primaryKey,
					nullModel);
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
	 * Returns all the unpaid unclaimed devidend holderses.
	 *
	 * @return the unpaid unclaimed devidend holderses
	 */
	@Override
	public List<UnpaidUnclaimedDevidendHolders> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unpaid unclaimed devidend holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidend holderses
	 * @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	 * @return the range of unpaid unclaimed devidend holderses
	 */
	@Override
	public List<UnpaidUnclaimedDevidendHolders> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidend holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidend holderses
	 * @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unpaid unclaimed devidend holderses
	 */
	@Override
	public List<UnpaidUnclaimedDevidendHolders> findAll(int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidendHolders> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidend holderses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendHoldersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidend holderses
	 * @param end the upper bound of the range of unpaid unclaimed devidend holderses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of unpaid unclaimed devidend holderses
	 */
	@Override
	public List<UnpaidUnclaimedDevidendHolders> findAll(int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidendHolders> orderByComparator,
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

		List<UnpaidUnclaimedDevidendHolders> list = null;

		if (retrieveFromCache) {
			list = (List<UnpaidUnclaimedDevidendHolders>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UNPAIDUNCLAIMEDDEVIDENDHOLDERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDENDHOLDERS;

				if (pagination) {
					sql = sql.concat(UnpaidUnclaimedDevidendHoldersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UnpaidUnclaimedDevidendHolders>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UnpaidUnclaimedDevidendHolders>)QueryUtil.list(q,
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
	 * Removes all the unpaid unclaimed devidend holderses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders : findAll()) {
			remove(unpaidUnclaimedDevidendHolders);
		}
	}

	/**
	 * Returns the number of unpaid unclaimed devidend holderses.
	 *
	 * @return the number of unpaid unclaimed devidend holderses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UNPAIDUNCLAIMEDDEVIDENDHOLDERS);

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
		return UnpaidUnclaimedDevidendHoldersModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the unpaid unclaimed devidend holders persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UnpaidUnclaimedDevidendHoldersImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDENDHOLDERS = "SELECT unpaidUnclaimedDevidendHolders FROM UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders";
	private static final String _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDENDHOLDERS_WHERE_PKS_IN =
		"SELECT unpaidUnclaimedDevidendHolders FROM UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders WHERE SRNO IN (";
	private static final String _SQL_COUNT_UNPAIDUNCLAIMEDDEVIDENDHOLDERS = "SELECT COUNT(unpaidUnclaimedDevidendHolders) FROM UnpaidUnclaimedDevidendHolders unpaidUnclaimedDevidendHolders";
	private static final String _ORDER_BY_ENTITY_ALIAS = "unpaidUnclaimedDevidendHolders.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UnpaidUnclaimedDevidendHolders exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(UnpaidUnclaimedDevidendHoldersPersistenceImpl.class);
}