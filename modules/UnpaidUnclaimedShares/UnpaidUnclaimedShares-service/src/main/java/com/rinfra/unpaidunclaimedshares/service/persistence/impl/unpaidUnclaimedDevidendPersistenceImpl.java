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

package com.rinfra.unpaidunclaimedshares.service.persistence.impl;

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

import com.rinfra.unpaidunclaimedshares.exception.NoSuchunpaidUnclaimedDevidendException;
import com.rinfra.unpaidunclaimedshares.model.impl.unpaidUnclaimedDevidendImpl;
import com.rinfra.unpaidunclaimedshares.model.impl.unpaidUnclaimedDevidendModelImpl;
import com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend;
import com.rinfra.unpaidunclaimedshares.service.persistence.unpaidUnclaimedDevidendPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the unpaid unclaimed devidend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh Patidar
 * @see unpaidUnclaimedDevidendPersistence
 * @see com.rinfra.unpaidunclaimedshares.service.persistence.unpaidUnclaimedDevidendUtil
 * @generated
 */
@ProviderType
public class unpaidUnclaimedDevidendPersistenceImpl extends BasePersistenceImpl<unpaidUnclaimedDevidend>
	implements unpaidUnclaimedDevidendPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link unpaidUnclaimedDevidendUtil} to access the unpaid unclaimed devidend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = unpaidUnclaimedDevidendImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			unpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			unpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FOLIONO = new FinderPath(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			unpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByfolioNo",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIONO =
		new FinderPath(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			unpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByfolioNo",
			new String[] { String.class.getName() },
			unpaidUnclaimedDevidendModelImpl.FOLIO_NO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FOLIONO = new FinderPath(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByfolioNo",
			new String[] { String.class.getName() });

	/**
	 * Returns all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	 *
	 * @param FOLIO_NO the folio_no
	 * @return the matching unpaid unclaimed devidends
	 */
	@Override
	public List<unpaidUnclaimedDevidend> findByfolioNo(String FOLIO_NO) {
		return findByfolioNo(FOLIO_NO, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FOLIO_NO the folio_no
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @return the range of matching unpaid unclaimed devidends
	 */
	@Override
	public List<unpaidUnclaimedDevidend> findByfolioNo(String FOLIO_NO,
		int start, int end) {
		return findByfolioNo(FOLIO_NO, start, end, null);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FOLIO_NO the folio_no
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching unpaid unclaimed devidends
	 */
	@Override
	public List<unpaidUnclaimedDevidend> findByfolioNo(String FOLIO_NO,
		int start, int end,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator) {
		return findByfolioNo(FOLIO_NO, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidends where FOLIO_NO = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FOLIO_NO the folio_no
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching unpaid unclaimed devidends
	 */
	@Override
	public List<unpaidUnclaimedDevidend> findByfolioNo(String FOLIO_NO,
		int start, int end,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIONO;
			finderArgs = new Object[] { FOLIO_NO };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FOLIONO;
			finderArgs = new Object[] { FOLIO_NO, start, end, orderByComparator };
		}

		List<unpaidUnclaimedDevidend> list = null;

		if (retrieveFromCache) {
			list = (List<unpaidUnclaimedDevidend>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (unpaidUnclaimedDevidend unpaidUnclaimedDevidend : list) {
					if (!Objects.equals(FOLIO_NO,
								unpaidUnclaimedDevidend.getFOLIO_NO())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND_WHERE);

			boolean bindFOLIO_NO = false;

			if (FOLIO_NO == null) {
				query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_1);
			}
			else if (FOLIO_NO.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_3);
			}
			else {
				bindFOLIO_NO = true;

				query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(unpaidUnclaimedDevidendModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFOLIO_NO) {
					qPos.add(FOLIO_NO);
				}

				if (!pagination) {
					list = (List<unpaidUnclaimedDevidend>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<unpaidUnclaimedDevidend>)QueryUtil.list(q,
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
	 * Returns the first unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	 *
	 * @param FOLIO_NO the folio_no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unpaid unclaimed devidend
	 * @throws NoSuchunpaidUnclaimedDevidendException if a matching unpaid unclaimed devidend could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend findByfolioNo_First(String FOLIO_NO,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchunpaidUnclaimedDevidendException {
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend = fetchByfolioNo_First(FOLIO_NO,
				orderByComparator);

		if (unpaidUnclaimedDevidend != null) {
			return unpaidUnclaimedDevidend;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FOLIO_NO=");
		msg.append(FOLIO_NO);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchunpaidUnclaimedDevidendException(msg.toString());
	}

	/**
	 * Returns the first unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	 *
	 * @param FOLIO_NO the folio_no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching unpaid unclaimed devidend, or <code>null</code> if a matching unpaid unclaimed devidend could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend fetchByfolioNo_First(String FOLIO_NO,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator) {
		List<unpaidUnclaimedDevidend> list = findByfolioNo(FOLIO_NO, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	 *
	 * @param FOLIO_NO the folio_no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unpaid unclaimed devidend
	 * @throws NoSuchunpaidUnclaimedDevidendException if a matching unpaid unclaimed devidend could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend findByfolioNo_Last(String FOLIO_NO,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchunpaidUnclaimedDevidendException {
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend = fetchByfolioNo_Last(FOLIO_NO,
				orderByComparator);

		if (unpaidUnclaimedDevidend != null) {
			return unpaidUnclaimedDevidend;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FOLIO_NO=");
		msg.append(FOLIO_NO);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchunpaidUnclaimedDevidendException(msg.toString());
	}

	/**
	 * Returns the last unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	 *
	 * @param FOLIO_NO the folio_no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching unpaid unclaimed devidend, or <code>null</code> if a matching unpaid unclaimed devidend could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend fetchByfolioNo_Last(String FOLIO_NO,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator) {
		int count = countByfolioNo(FOLIO_NO);

		if (count == 0) {
			return null;
		}

		List<unpaidUnclaimedDevidend> list = findByfolioNo(FOLIO_NO, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the unpaid unclaimed devidends before and after the current unpaid unclaimed devidend in the ordered set where FOLIO_NO = &#63;.
	 *
	 * @param SRNO the primary key of the current unpaid unclaimed devidend
	 * @param FOLIO_NO the folio_no
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next unpaid unclaimed devidend
	 * @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend[] findByfolioNo_PrevAndNext(long SRNO,
		String FOLIO_NO,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchunpaidUnclaimedDevidendException {
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend = findByPrimaryKey(SRNO);

		Session session = null;

		try {
			session = openSession();

			unpaidUnclaimedDevidend[] array = new unpaidUnclaimedDevidendImpl[3];

			array[0] = getByfolioNo_PrevAndNext(session,
					unpaidUnclaimedDevidend, FOLIO_NO, orderByComparator, true);

			array[1] = unpaidUnclaimedDevidend;

			array[2] = getByfolioNo_PrevAndNext(session,
					unpaidUnclaimedDevidend, FOLIO_NO, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected unpaidUnclaimedDevidend getByfolioNo_PrevAndNext(
		Session session, unpaidUnclaimedDevidend unpaidUnclaimedDevidend,
		String FOLIO_NO,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND_WHERE);

		boolean bindFOLIO_NO = false;

		if (FOLIO_NO == null) {
			query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_1);
		}
		else if (FOLIO_NO.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_3);
		}
		else {
			bindFOLIO_NO = true;

			query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(unpaidUnclaimedDevidendModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFOLIO_NO) {
			qPos.add(FOLIO_NO);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(unpaidUnclaimedDevidend);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<unpaidUnclaimedDevidend> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the unpaid unclaimed devidends where FOLIO_NO = &#63; from the database.
	 *
	 * @param FOLIO_NO the folio_no
	 */
	@Override
	public void removeByfolioNo(String FOLIO_NO) {
		for (unpaidUnclaimedDevidend unpaidUnclaimedDevidend : findByfolioNo(
				FOLIO_NO, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(unpaidUnclaimedDevidend);
		}
	}

	/**
	 * Returns the number of unpaid unclaimed devidends where FOLIO_NO = &#63;.
	 *
	 * @param FOLIO_NO the folio_no
	 * @return the number of matching unpaid unclaimed devidends
	 */
	@Override
	public int countByfolioNo(String FOLIO_NO) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FOLIONO;

		Object[] finderArgs = new Object[] { FOLIO_NO };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_UNPAIDUNCLAIMEDDEVIDEND_WHERE);

			boolean bindFOLIO_NO = false;

			if (FOLIO_NO == null) {
				query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_1);
			}
			else if (FOLIO_NO.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_3);
			}
			else {
				bindFOLIO_NO = true;

				query.append(_FINDER_COLUMN_FOLIONO_FOLIO_NO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFOLIO_NO) {
					qPos.add(FOLIO_NO);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FOLIONO_FOLIO_NO_1 = "unpaidUnclaimedDevidend.FOLIO_NO IS NULL";
	private static final String _FINDER_COLUMN_FOLIONO_FOLIO_NO_2 = "unpaidUnclaimedDevidend.FOLIO_NO = ?";
	private static final String _FINDER_COLUMN_FOLIONO_FOLIO_NO_3 = "(unpaidUnclaimedDevidend.FOLIO_NO IS NULL OR unpaidUnclaimedDevidend.FOLIO_NO = '')";

	public unpaidUnclaimedDevidendPersistenceImpl() {
		setModelClass(unpaidUnclaimedDevidend.class);
	}

	/**
	 * Caches the unpaid unclaimed devidend in the entity cache if it is enabled.
	 *
	 * @param unpaidUnclaimedDevidend the unpaid unclaimed devidend
	 */
	@Override
	public void cacheResult(unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		entityCache.putResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendImpl.class,
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
		List<unpaidUnclaimedDevidend> unpaidUnclaimedDevidends) {
		for (unpaidUnclaimedDevidend unpaidUnclaimedDevidend : unpaidUnclaimedDevidends) {
			if (entityCache.getResult(
						unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
						unpaidUnclaimedDevidendImpl.class,
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
		entityCache.clearCache(unpaidUnclaimedDevidendImpl.class);

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
	public void clearCache(unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		entityCache.removeResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendImpl.class,
			unpaidUnclaimedDevidend.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<unpaidUnclaimedDevidend> unpaidUnclaimedDevidends) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (unpaidUnclaimedDevidend unpaidUnclaimedDevidend : unpaidUnclaimedDevidends) {
			entityCache.removeResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
				unpaidUnclaimedDevidendImpl.class,
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
	public unpaidUnclaimedDevidend create(long SRNO) {
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend = new unpaidUnclaimedDevidendImpl();

		unpaidUnclaimedDevidend.setNew(true);
		unpaidUnclaimedDevidend.setPrimaryKey(SRNO);

		return unpaidUnclaimedDevidend;
	}

	/**
	 * Removes the unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend that was removed
	 * @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend remove(long SRNO)
		throws NoSuchunpaidUnclaimedDevidendException {
		return remove((Serializable)SRNO);
	}

	/**
	 * Removes the unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend that was removed
	 * @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend remove(Serializable primaryKey)
		throws NoSuchunpaidUnclaimedDevidendException {
		Session session = null;

		try {
			session = openSession();

			unpaidUnclaimedDevidend unpaidUnclaimedDevidend = (unpaidUnclaimedDevidend)session.get(unpaidUnclaimedDevidendImpl.class,
					primaryKey);

			if (unpaidUnclaimedDevidend == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchunpaidUnclaimedDevidendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(unpaidUnclaimedDevidend);
		}
		catch (NoSuchunpaidUnclaimedDevidendException nsee) {
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
	protected unpaidUnclaimedDevidend removeImpl(
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		unpaidUnclaimedDevidend = toUnwrappedModel(unpaidUnclaimedDevidend);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(unpaidUnclaimedDevidend)) {
				unpaidUnclaimedDevidend = (unpaidUnclaimedDevidend)session.get(unpaidUnclaimedDevidendImpl.class,
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
	public unpaidUnclaimedDevidend updateImpl(
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		unpaidUnclaimedDevidend = toUnwrappedModel(unpaidUnclaimedDevidend);

		boolean isNew = unpaidUnclaimedDevidend.isNew();

		unpaidUnclaimedDevidendModelImpl unpaidUnclaimedDevidendModelImpl = (unpaidUnclaimedDevidendModelImpl)unpaidUnclaimedDevidend;

		Session session = null;

		try {
			session = openSession();

			if (unpaidUnclaimedDevidend.isNew()) {
				session.save(unpaidUnclaimedDevidend);

				unpaidUnclaimedDevidend.setNew(false);
			}
			else {
				unpaidUnclaimedDevidend = (unpaidUnclaimedDevidend)session.merge(unpaidUnclaimedDevidend);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!unpaidUnclaimedDevidendModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					unpaidUnclaimedDevidendModelImpl.getFOLIO_NO()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FOLIONO, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIONO,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((unpaidUnclaimedDevidendModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIONO.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						unpaidUnclaimedDevidendModelImpl.getOriginalFOLIO_NO()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FOLIONO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIONO,
					args);

				args = new Object[] {
						unpaidUnclaimedDevidendModelImpl.getFOLIO_NO()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FOLIONO, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIONO,
					args);
			}
		}

		entityCache.putResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			unpaidUnclaimedDevidendImpl.class,
			unpaidUnclaimedDevidend.getPrimaryKey(), unpaidUnclaimedDevidend,
			false);

		unpaidUnclaimedDevidend.resetOriginalValues();

		return unpaidUnclaimedDevidend;
	}

	protected unpaidUnclaimedDevidend toUnwrappedModel(
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend) {
		if (unpaidUnclaimedDevidend instanceof unpaidUnclaimedDevidendImpl) {
			return unpaidUnclaimedDevidend;
		}

		unpaidUnclaimedDevidendImpl unpaidUnclaimedDevidendImpl = new unpaidUnclaimedDevidendImpl();

		unpaidUnclaimedDevidendImpl.setNew(unpaidUnclaimedDevidend.isNew());
		unpaidUnclaimedDevidendImpl.setPrimaryKey(unpaidUnclaimedDevidend.getPrimaryKey());

		unpaidUnclaimedDevidendImpl.setSRNO(unpaidUnclaimedDevidend.getSRNO());
		unpaidUnclaimedDevidendImpl.setFOLIO_NO(unpaidUnclaimedDevidend.getFOLIO_NO());
		unpaidUnclaimedDevidendImpl.setNAME(unpaidUnclaimedDevidend.getNAME());
		unpaidUnclaimedDevidendImpl.setADD1(unpaidUnclaimedDevidend.getADD1());
		unpaidUnclaimedDevidendImpl.setADD2(unpaidUnclaimedDevidend.getADD2());
		unpaidUnclaimedDevidendImpl.setADD3(unpaidUnclaimedDevidend.getADD3());
		unpaidUnclaimedDevidendImpl.setADD4(unpaidUnclaimedDevidend.getADD4());
		unpaidUnclaimedDevidendImpl.setADD5(unpaidUnclaimedDevidend.getADD5());
		unpaidUnclaimedDevidendImpl.setADD6(unpaidUnclaimedDevidend.getADD6());
		unpaidUnclaimedDevidendImpl.setJT1(unpaidUnclaimedDevidend.getJT1());
		unpaidUnclaimedDevidendImpl.setJT2(unpaidUnclaimedDevidend.getJT2());
		unpaidUnclaimedDevidendImpl.setJT3(unpaidUnclaimedDevidend.getJT3());
		unpaidUnclaimedDevidendImpl.setSHARES(unpaidUnclaimedDevidend.getSHARES());

		return unpaidUnclaimedDevidendImpl;
	}

	/**
	 * Returns the unpaid unclaimed devidend with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend
	 * @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend findByPrimaryKey(Serializable primaryKey)
		throws NoSuchunpaidUnclaimedDevidendException {
		unpaidUnclaimedDevidend unpaidUnclaimedDevidend = fetchByPrimaryKey(primaryKey);

		if (unpaidUnclaimedDevidend == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchunpaidUnclaimedDevidendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return unpaidUnclaimedDevidend;
	}

	/**
	 * Returns the unpaid unclaimed devidend with the primary key or throws a {@link NoSuchunpaidUnclaimedDevidendException} if it could not be found.
	 *
	 * @param SRNO the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend
	 * @throws NoSuchunpaidUnclaimedDevidendException if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws NoSuchunpaidUnclaimedDevidendException {
		return findByPrimaryKey((Serializable)SRNO);
	}

	/**
	 * Returns the unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the unpaid unclaimed devidend
	 * @return the unpaid unclaimed devidend, or <code>null</code> if a unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public unpaidUnclaimedDevidend fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
				unpaidUnclaimedDevidendImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		unpaidUnclaimedDevidend unpaidUnclaimedDevidend = (unpaidUnclaimedDevidend)serializable;

		if (unpaidUnclaimedDevidend == null) {
			Session session = null;

			try {
				session = openSession();

				unpaidUnclaimedDevidend = (unpaidUnclaimedDevidend)session.get(unpaidUnclaimedDevidendImpl.class,
						primaryKey);

				if (unpaidUnclaimedDevidend != null) {
					cacheResult(unpaidUnclaimedDevidend);
				}
				else {
					entityCache.putResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
						unpaidUnclaimedDevidendImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					unpaidUnclaimedDevidendImpl.class, primaryKey);

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
	public unpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO) {
		return fetchByPrimaryKey((Serializable)SRNO);
	}

	@Override
	public Map<Serializable, unpaidUnclaimedDevidend> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, unpaidUnclaimedDevidend> map = new HashMap<Serializable, unpaidUnclaimedDevidend>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			unpaidUnclaimedDevidend unpaidUnclaimedDevidend = fetchByPrimaryKey(primaryKey);

			if (unpaidUnclaimedDevidend != null) {
				map.put(primaryKey, unpaidUnclaimedDevidend);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					unpaidUnclaimedDevidendImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (unpaidUnclaimedDevidend)serializable);
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

			for (unpaidUnclaimedDevidend unpaidUnclaimedDevidend : (List<unpaidUnclaimedDevidend>)q.list()) {
				map.put(unpaidUnclaimedDevidend.getPrimaryKeyObj(),
					unpaidUnclaimedDevidend);

				cacheResult(unpaidUnclaimedDevidend);

				uncachedPrimaryKeys.remove(unpaidUnclaimedDevidend.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(unpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					unpaidUnclaimedDevidendImpl.class, primaryKey, nullModel);
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
	public List<unpaidUnclaimedDevidend> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @return the range of unpaid unclaimed devidends
	 */
	@Override
	public List<unpaidUnclaimedDevidend> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of unpaid unclaimed devidends
	 */
	@Override
	public List<unpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link unpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of unpaid unclaimed devidends
	 * @param end the upper bound of the range of unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of unpaid unclaimed devidends
	 */
	@Override
	public List<unpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<unpaidUnclaimedDevidend> orderByComparator,
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

		List<unpaidUnclaimedDevidend> list = null;

		if (retrieveFromCache) {
			list = (List<unpaidUnclaimedDevidend>)finderCache.getResult(finderPath,
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
					sql = sql.concat(unpaidUnclaimedDevidendModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<unpaidUnclaimedDevidend>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<unpaidUnclaimedDevidend>)QueryUtil.list(q,
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
		for (unpaidUnclaimedDevidend unpaidUnclaimedDevidend : findAll()) {
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
		return unpaidUnclaimedDevidendModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the unpaid unclaimed devidend persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(unpaidUnclaimedDevidendImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND = "SELECT unpaidUnclaimedDevidend FROM unpaidUnclaimedDevidend unpaidUnclaimedDevidend";
	private static final String _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND_WHERE_PKS_IN =
		"SELECT unpaidUnclaimedDevidend FROM unpaidUnclaimedDevidend unpaidUnclaimedDevidend WHERE SRNO IN (";
	private static final String _SQL_SELECT_UNPAIDUNCLAIMEDDEVIDEND_WHERE = "SELECT unpaidUnclaimedDevidend FROM unpaidUnclaimedDevidend unpaidUnclaimedDevidend WHERE ";
	private static final String _SQL_COUNT_UNPAIDUNCLAIMEDDEVIDEND = "SELECT COUNT(unpaidUnclaimedDevidend) FROM unpaidUnclaimedDevidend unpaidUnclaimedDevidend";
	private static final String _SQL_COUNT_UNPAIDUNCLAIMEDDEVIDEND_WHERE = "SELECT COUNT(unpaidUnclaimedDevidend) FROM unpaidUnclaimedDevidend unpaidUnclaimedDevidend WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "unpaidUnclaimedDevidend.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No unpaidUnclaimedDevidend exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No unpaidUnclaimedDevidend exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(unpaidUnclaimedDevidendPersistenceImpl.class);
}