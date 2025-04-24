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

package com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl;

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

import com.rinfra.unpaid.unclaimed.devidend.exception.NoSuchUnpaidUnclaimedDevidendException;
import com.rinfra.unpaid.unclaimed.devidend.model.UnpaidUnclaimedDevidend;
import com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendImpl;
import com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendModelImpl;
import com.rinfra.unpaid.unclaimed.devidend.service.persistence.UnpaidUnclaimedDevidendPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the unpaid unclaimed devidend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendPersistence
 * @see com.rinfra.unpaid.unclaimed.devidend.service.persistence.UnpaidUnclaimedDevidendUtil
 * @generated
 */
@ProviderType
public class UnpaidUnclaimedDevidendPersistenceImpl extends BasePersistenceImpl<UnpaidUnclaimedDevidend>
	implements UnpaidUnclaimedDevidendPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UnpaidUnclaimedDevidendUtil} to access the unpaid unclaimed devidend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UnpaidUnclaimedDevidendImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			UnpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			UnpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UnpaidUnclaimedDevidendPersistenceImpl() {
		setModelClass(UnpaidUnclaimedDevidend.class);
	}

	/**
	 * Caches the unpaid unclaimed devidend in the entity cache if it is enabled.
	 *
	 * @param unpaidUnclaimedDevidend the unpaid unclaimed devidend
	 */
	@Override
	public void cacheResult(UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		entityCache.putResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendImpl.class,
			unpaidUnclaimedDevidend.getPrimaryKey(), unpaidUnclaimedDevidend);

		unpaidUnclaimedDevidend.resetOriginalValues();
	}

	/**
	 * Caches the unpaid unclaimed devidends in the entity cache if it is enabled.
	 *
	 * @param unpaidUnclaimedDevidends the unpaid unclaimed devidends
	 */
	@Override
	public void cacheResult(
		List<UnpaidUnclaimedDevidend> unpaidUnclaimedDevidends) {
		for (UnpaidUnclaimedDevidend unpaidUnclaimedDevidend : unpaidUnclaimedDevidends) {
			if (entityCache.getResult(
						UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
						UnpaidUnclaimedDevidendImpl.class,
						unpaidUnclaimedDevidend.getPrimaryKey()) == null) {
				cacheResult(unpaidUnclaimedDevidend);
			}
			else {
				unpaidUnclaimedDevidend.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all unpaid unclaimed devidends.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UnpaidUnclaimedDevidendImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the unpaid unclaimed devidend.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		entityCache.removeResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendImpl.class,
			unpaidUnclaimedDevidend.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<UnpaidUnclaimedDevidend> unpaidUnclaimedDevidends) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UnpaidUnclaimedDevidend unpaidUnclaimedDevidend : unpaidUnclaimedDevidends) {
			entityCache.removeResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
				UnpaidUnclaimedDevidendImpl.class,
				unpaidUnclaimedDevidend.getPrimaryKey());
		}
	}

	/**
	 * Creates a new unpaid unclaimed devidend with the primary key. Does not add the unpaid unclaimed devidend to the database.
	 *
	 * @param SRNO the primary key for the new unpaid unclaimed devidend
	 * @return the new unpaid unclaimed devidend
	 */
	@Override
	public UnpaidUnclaimedDevidend create(long SRNO) {
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend = new UnpaidUnclaimedDevidendImpl();

		unpaidUnclaimedDevidend.setNew(true);
		unpaidUnclaimedDevidend.setPrimaryKey(SRNO);

		return unpaidUnclaimedDevidend;
	}

	/**
	 * Removes the unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend that was removed
	 * @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidend remove(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendException {
		return remove((Serializable)SRNO);
	}

	/**
	 * Removes the unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend that was removed
	 * @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidend remove(Serializable primaryKey)
		throws NoSuchUnpaidUnclaimedDevidendException {
		Session session = null;

		try {
			session = openSession();

			UnpaidUnclaimedDevidend unpaidUnclaimedDevidend = (UnpaidUnclaimedDevidend)session.get(UnpaidUnclaimedDevidendImpl.class,
					primaryKey);

			if (unpaidUnclaimedDevidend == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUnpaidUnclaimedDevidendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(unpaidUnclaimedDevidend);
		}
		catch (NoSuchUnpaidUnclaimedDevidendException nsee) {
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
	protected UnpaidUnclaimedDevidend removeImpl(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		unpaidUnclaimedDevidend = toUnwrappedModel(unpaidUnclaimedDevidend);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(unpaidUnclaimedDevidend)) {
				unpaidUnclaimedDevidend = (UnpaidUnclaimedDevidend)session.get(UnpaidUnclaimedDevidendImpl.class,
						unpaidUnclaimedDevidend.getPrimaryKeyObj());
			}

			if (unpaidUnclaimedDevidend != null) {
				session.delete(unpaidUnclaimedDevidend);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (unpaidUnclaimedDevidend != null) {
			clearCache(unpaidUnclaimedDevidend);
		}

		return unpaidUnclaimedDevidend;
	}

	@Override
	public UnpaidUnclaimedDevidend updateImpl(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		unpaidUnclaimedDevidend = toUnwrappedModel(unpaidUnclaimedDevidend);

		boolean isNew = unpaidUnclaimedDevidend.isNew();

		Session session = null;

		try {
			session = openSession();

			if (unpaidUnclaimedDevidend.isNew()) {
				session.save(unpaidUnclaimedDevidend);

				unpaidUnclaimedDevidend.setNew(false);
			}
			else {
				unpaidUnclaimedDevidend = (UnpaidUnclaimedDevidend)session.merge(unpaidUnclaimedDevidend);
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

		entityCache.putResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			UnpaidUnclaimedDevidendImpl.class,
			unpaidUnclaimedDevidend.getPrimaryKey(), unpaidUnclaimedDevidend,
			false);

		unpaidUnclaimedDevidend.resetOriginalValues();

		return unpaidUnclaimedDevidend;
	}

	protected UnpaidUnclaimedDevidend toUnwrappedModel(
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		if (unpaidUnclaimedDevidend instanceof UnpaidUnclaimedDevidendImpl) {
			return unpaidUnclaimedDevidend;
		}

		UnpaidUnclaimedDevidendImpl unpaidUnclaimedDevidendImpl = new UnpaidUnclaimedDevidendImpl();

		unpaidUnclaimedDevidendImpl.setNew(unpaidUnclaimedDevidend.isNew());
		unpaidUnclaimedDevidendImpl.setPrimaryKey(unpaidUnclaimedDevidend.getPrimaryKey());

		unpaidUnclaimedDevidendImpl.setSRNO(unpaidUnclaimedDevidend.getSRNO());
		unpaidUnclaimedDevidendImpl.setFIRST_NAME(unpaidUnclaimedDevidend.getFIRST_NAME());
		unpaidUnclaimedDevidendImpl.setMIDDLE_NAME(unpaidUnclaimedDevidend.getMIDDLE_NAME());
		unpaidUnclaimedDevidendImpl.setLAST_NAME(unpaidUnclaimedDevidend.getLAST_NAME());
		unpaidUnclaimedDevidendImpl.setFATHER_HUSBAND_FIRST_NAME(unpaidUnclaimedDevidend.getFATHER_HUSBAND_FIRST_NAME());
		unpaidUnclaimedDevidendImpl.setFATHER_HUSBAND_MIDDLE_NAME(unpaidUnclaimedDevidend.getFATHER_HUSBAND_MIDDLE_NAME());
		unpaidUnclaimedDevidendImpl.setFATHER_HUSBAND_LAST_NAME(unpaidUnclaimedDevidend.getFATHER_HUSBAND_LAST_NAME());
		unpaidUnclaimedDevidendImpl.setADDRESS(unpaidUnclaimedDevidend.getADDRESS());
		unpaidUnclaimedDevidendImpl.setCOUNTRY(unpaidUnclaimedDevidend.getCOUNTRY());
		unpaidUnclaimedDevidendImpl.setSTATE(unpaidUnclaimedDevidend.getSTATE());
		unpaidUnclaimedDevidendImpl.setDISTRICT(unpaidUnclaimedDevidend.getDISTRICT());
		unpaidUnclaimedDevidendImpl.setPIN_CODE(unpaidUnclaimedDevidend.getPIN_CODE());
		unpaidUnclaimedDevidendImpl.setFOLIO_NO_OF_ITIES(unpaidUnclaimedDevidend.getFOLIO_NO_OF_ITIES());
		unpaidUnclaimedDevidendImpl.setINVESTMENT_TYPE(unpaidUnclaimedDevidend.getINVESTMENT_TYPE());
		unpaidUnclaimedDevidendImpl.setAMOUNT_DUE_IN_RS(unpaidUnclaimedDevidend.getAMOUNT_DUE_IN_RS());
		unpaidUnclaimedDevidendImpl.setPROPOSED_DATE_TRANSFER_IPEF(unpaidUnclaimedDevidend.getPROPOSED_DATE_TRANSFER_IPEF());
		unpaidUnclaimedDevidendImpl.setCREATEDATE(unpaidUnclaimedDevidend.getCREATEDATE());

		return unpaidUnclaimedDevidendImpl;
	}

	/**
	 * Returns the unpaid unclaimed devidend with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend
	 * @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidend findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUnpaidUnclaimedDevidendException {
		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend = fetchByPrimaryKey(primaryKey);

		if (unpaidUnclaimedDevidend == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUnpaidUnclaimedDevidendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return unpaidUnclaimedDevidend;
	}

	/**
	 * Returns the unpaid unclaimed devidend with the primary key or throws a {@link NoSuchUnpaidUnclaimedDevidendException} if it could not be found.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend
	 * @throws NoSuchUnpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws NoSuchUnpaidUnclaimedDevidendException {
		return findByPrimaryKey((Serializable)SRNO);
	}

	/**
	 * Returns the unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend, or <code>null</code> if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidend fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
				UnpaidUnclaimedDevidendImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UnpaidUnclaimedDevidend unpaidUnclaimedDevidend = (UnpaidUnclaimedDevidend)serializable;

		if (unpaidUnclaimedDevidend == null) {
			Session session = null;

			try {
				session = openSession();

				unpaidUnclaimedDevidend = (UnpaidUnclaimedDevidend)session.get(UnpaidUnclaimedDevidendImpl.class,
						primaryKey);

				if (unpaidUnclaimedDevidend != null) {
					cacheResult(unpaidUnclaimedDevidend);
				}
				else {
					entityCache.putResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
						UnpaidUnclaimedDevidendImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					UnpaidUnclaimedDevidendImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return unpaidUnclaimedDevidend;
	}

	/**
	 * Returns the unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend, or <code>null</code> if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public UnpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO) {
		return fetchByPrimaryKey((Serializable)SRNO);
	}

	@Override
	public Map<Serializable, UnpaidUnclaimedDevidend> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UnpaidUnclaimedDevidend> map = new HashMap<Serializable, UnpaidUnclaimedDevidend>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UnpaidUnclaimedDevidend unpaidUnclaimedDevidend = fetchByPrimaryKey(primaryKey);

			if (unpaidUnclaimedDevidend != null) {
				map.put(primaryKey, unpaidUnclaimedDevidend);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					UnpaidUnclaimedDevidendImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UnpaidUnclaimedDevidend)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND_WHERE_PKS_IN);

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

			for (UnpaidUnclaimedDevidend unpaidUnclaimedDevidend : (List<UnpaidUnclaimedDevidend>)q.list()) {
				map.put(unpaidUnclaimedDevidend.getPrimaryKeyObj(),
					unpaidUnclaimedDevidend);

				cacheResult(unpaidUnclaimedDevidend);

				uncachedPrimaryKeys.remove(unpaidUnclaimedDevidend.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					UnpaidUnclaimedDevidendImpl.class, primaryKey, nullModel);
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
	 * Returns all the unpaid unclaimed devidends.
	 *
	 * @return the unpaid unclaimed devidends
	 */
	@Override
	public List<UnpaidUnclaimedDevidend> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @return the range of unpaid unclaimed devidends
	 */
	@Override
	public List<UnpaidUnclaimedDevidend> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unpaid unclaimed devidends
	 */
	@Override
	public List<UnpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidend> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of unpaid unclaimed devidends
	 */
	@Override
	public List<UnpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<UnpaidUnclaimedDevidend> orderByComparator,
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

		List<UnpaidUnclaimedDevidend> list = null;

		if (retrieveFromCache) {
			list = (List<UnpaidUnclaimedDevidend>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND;

				if (pagination) {
					sql = sql.concat(UnpaidUnclaimedDevidendModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UnpaidUnclaimedDevidend>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UnpaidUnclaimedDevidend>)QueryUtil.list(q,
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
	 * Removes all the unpaid unclaimed devidends from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UnpaidUnclaimedDevidend unpaidUnclaimedDevidend : findAll()) {
			remove(unpaidUnclaimedDevidend);
		}
	}

	/**
	 * Returns the number of unpaid unclaimed devidends.
	 *
	 * @return the number of unpaid unclaimed devidends
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_UNPAIDUNCLAIMEDDEVIDEND);

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
		return UnpaidUnclaimedDevidendModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the unpaid unclaimed devidend persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UnpaidUnclaimedDevidendImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND = "SELECT unpaidUnclaimedDevidend FROM UnpaidUnclaimedDevidend unpaidUnclaimedDevidend";
	private static final String _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND_WHERE_PKS_IN =
		"SELECT unpaidUnclaimedDevidend FROM UnpaidUnclaimedDevidend unpaidUnclaimedDevidend WHERE SRNO IN (";
	private static final String _SQL_COUNT_UNPAIDUNCLAIMEDDEVIDEND = "SELECT COUNT(unpaidUnclaimedDevidend) FROM UnpaidUnclaimedDevidend unpaidUnclaimedDevidend";
	private static final String _ORDER_BY_ENTITY_ALIAS = "unpaidUnclaimedDevidend.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UnpaidUnclaimedDevidend exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(UnpaidUnclaimedDevidendPersistenceImpl.class);
}