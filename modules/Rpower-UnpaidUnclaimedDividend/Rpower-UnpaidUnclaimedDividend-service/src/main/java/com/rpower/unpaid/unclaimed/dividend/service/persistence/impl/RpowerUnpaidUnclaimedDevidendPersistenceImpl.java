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

package com.rpower.unpaid.unclaimed.dividend.service.persistence.impl;

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

import com.rpower.unpaid.unclaimed.dividend.exception.NoSuchRpowerUnpaidUnclaimedDevidendException;
import com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend;
import com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendImpl;
import com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendModelImpl;
import com.rpower.unpaid.unclaimed.dividend.service.persistence.RpowerUnpaidUnclaimedDevidendPersistence;

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
 * The persistence implementation for the rpower unpaid unclaimed devidend service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerUnpaidUnclaimedDevidendPersistence
 * @see com.rpower.unpaid.unclaimed.dividend.service.persistence.RpowerUnpaidUnclaimedDevidendUtil
 * @generated
 */
@ProviderType
public class RpowerUnpaidUnclaimedDevidendPersistenceImpl
	extends BasePersistenceImpl<RpowerUnpaidUnclaimedDevidend>
	implements RpowerUnpaidUnclaimedDevidendPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RpowerUnpaidUnclaimedDevidendUtil} to access the rpower unpaid unclaimed devidend persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RpowerUnpaidUnclaimedDevidendImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES =
		new FinderPath(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFOLIO_NO_OF_ITIES",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES =
		new FinderPath(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByFOLIO_NO_OF_ITIES", new String[] { String.class.getName() },
			RpowerUnpaidUnclaimedDevidendModelImpl.FOLIO_NO_OF_ITIES_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FOLIO_NO_OF_ITIES = new FinderPath(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendModelImpl.FINDER_CACHE_ENABLED,
			Long.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFOLIO_NO_OF_ITIES", new String[] { String.class.getName() });

	/**
	 * Returns all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @return the matching rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		String FOLIO_NO_OF_ITIES) {
		return findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param start the lower bound of the range of rpower unpaid unclaimed devidends
	 * @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	 * @return the range of matching rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		String FOLIO_NO_OF_ITIES, int start, int end) {
		return findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES, start, end, null);
	}

	/**
	 * Returns an ordered range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param start the lower bound of the range of rpower unpaid unclaimed devidends
	 * @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		String FOLIO_NO_OF_ITIES, int start, int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		return findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param start the lower bound of the range of rpower unpaid unclaimed devidends
	 * @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findByFOLIO_NO_OF_ITIES(
		String FOLIO_NO_OF_ITIES, int start, int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES;
			finderArgs = new Object[] { FOLIO_NO_OF_ITIES };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES;
			finderArgs = new Object[] {
					FOLIO_NO_OF_ITIES,
					
					start, end, orderByComparator
				};
		}

		List<RpowerUnpaidUnclaimedDevidend> list = null;

		if (retrieveFromCache) {
			list = (List<RpowerUnpaidUnclaimedDevidend>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend : list) {
					if (!Objects.equals(FOLIO_NO_OF_ITIES,
								rpowerUnpaidUnclaimedDevidend.getFOLIO_NO_OF_ITIES())) {
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

			query.append(_SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND_WHERE);

			boolean bindFOLIO_NO_OF_ITIES = false;

			if (FOLIO_NO_OF_ITIES == null) {
				query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_1);
			}
			else if (FOLIO_NO_OF_ITIES.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_3);
			}
			else {
				bindFOLIO_NO_OF_ITIES = true;

				query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(RpowerUnpaidUnclaimedDevidendModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFOLIO_NO_OF_ITIES) {
					qPos.add(FOLIO_NO_OF_ITIES);
				}

				if (!pagination) {
					list = (List<RpowerUnpaidUnclaimedDevidend>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RpowerUnpaidUnclaimedDevidend>)QueryUtil.list(q,
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
	 * Returns the first rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rpower unpaid unclaimed devidend
	 * @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a matching rpower unpaid unclaimed devidend could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend findByFOLIO_NO_OF_ITIES_First(
		String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException {
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = fetchByFOLIO_NO_OF_ITIES_First(FOLIO_NO_OF_ITIES,
				orderByComparator);

		if (rpowerUnpaidUnclaimedDevidend != null) {
			return rpowerUnpaidUnclaimedDevidend;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FOLIO_NO_OF_ITIES=");
		msg.append(FOLIO_NO_OF_ITIES);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRpowerUnpaidUnclaimedDevidendException(msg.toString());
	}

	/**
	 * Returns the first rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching rpower unpaid unclaimed devidend, or <code>null</code> if a matching rpower unpaid unclaimed devidend could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend fetchByFOLIO_NO_OF_ITIES_First(
		String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		List<RpowerUnpaidUnclaimedDevidend> list = findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES,
				0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rpower unpaid unclaimed devidend
	 * @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a matching rpower unpaid unclaimed devidend could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend findByFOLIO_NO_OF_ITIES_Last(
		String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException {
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = fetchByFOLIO_NO_OF_ITIES_Last(FOLIO_NO_OF_ITIES,
				orderByComparator);

		if (rpowerUnpaidUnclaimedDevidend != null) {
			return rpowerUnpaidUnclaimedDevidend;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FOLIO_NO_OF_ITIES=");
		msg.append(FOLIO_NO_OF_ITIES);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchRpowerUnpaidUnclaimedDevidendException(msg.toString());
	}

	/**
	 * Returns the last rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching rpower unpaid unclaimed devidend, or <code>null</code> if a matching rpower unpaid unclaimed devidend could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend fetchByFOLIO_NO_OF_ITIES_Last(
		String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		int count = countByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);

		if (count == 0) {
			return null;
		}

		List<RpowerUnpaidUnclaimedDevidend> list = findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the rpower unpaid unclaimed devidends before and after the current rpower unpaid unclaimed devidend in the ordered set where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * @param SRNO the primary key of the current rpower unpaid unclaimed devidend
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next rpower unpaid unclaimed devidend
	 * @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend[] findByFOLIO_NO_OF_ITIES_PrevAndNext(
		long SRNO, String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException {
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = findByPrimaryKey(SRNO);

		Session session = null;

		try {
			session = openSession();

			RpowerUnpaidUnclaimedDevidend[] array = new RpowerUnpaidUnclaimedDevidendImpl[3];

			array[0] = getByFOLIO_NO_OF_ITIES_PrevAndNext(session,
					rpowerUnpaidUnclaimedDevidend, FOLIO_NO_OF_ITIES,
					orderByComparator, true);

			array[1] = rpowerUnpaidUnclaimedDevidend;

			array[2] = getByFOLIO_NO_OF_ITIES_PrevAndNext(session,
					rpowerUnpaidUnclaimedDevidend, FOLIO_NO_OF_ITIES,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected RpowerUnpaidUnclaimedDevidend getByFOLIO_NO_OF_ITIES_PrevAndNext(
		Session session,
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend,
		String FOLIO_NO_OF_ITIES,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator,
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

		query.append(_SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND_WHERE);

		boolean bindFOLIO_NO_OF_ITIES = false;

		if (FOLIO_NO_OF_ITIES == null) {
			query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_1);
		}
		else if (FOLIO_NO_OF_ITIES.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_3);
		}
		else {
			bindFOLIO_NO_OF_ITIES = true;

			query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_2);
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
			query.append(RpowerUnpaidUnclaimedDevidendModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFOLIO_NO_OF_ITIES) {
			qPos.add(FOLIO_NO_OF_ITIES);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(rpowerUnpaidUnclaimedDevidend);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<RpowerUnpaidUnclaimedDevidend> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63; from the database.
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 */
	@Override
	public void removeByFOLIO_NO_OF_ITIES(String FOLIO_NO_OF_ITIES) {
		for (RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend : findByFOLIO_NO_OF_ITIES(
				FOLIO_NO_OF_ITIES, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(rpowerUnpaidUnclaimedDevidend);
		}
	}

	/**
	 * Returns the number of rpower unpaid unclaimed devidends where FOLIO_NO_OF_ITIES = &#63;.
	 *
	 * @param FOLIO_NO_OF_ITIES the folio_no_of_ities
	 * @return the number of matching rpower unpaid unclaimed devidends
	 */
	@Override
	public int countByFOLIO_NO_OF_ITIES(String FOLIO_NO_OF_ITIES) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FOLIO_NO_OF_ITIES;

		Object[] finderArgs = new Object[] { FOLIO_NO_OF_ITIES };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_RPOWERUNPAIDUNCLAIMEDDEVIDEND_WHERE);

			boolean bindFOLIO_NO_OF_ITIES = false;

			if (FOLIO_NO_OF_ITIES == null) {
				query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_1);
			}
			else if (FOLIO_NO_OF_ITIES.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_3);
			}
			else {
				bindFOLIO_NO_OF_ITIES = true;

				query.append(_FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFOLIO_NO_OF_ITIES) {
					qPos.add(FOLIO_NO_OF_ITIES);
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

	private static final String _FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_1 =
		"rpowerUnpaidUnclaimedDevidend.FOLIO_NO_OF_ITIES IS NULL";
	private static final String _FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_2 =
		"rpowerUnpaidUnclaimedDevidend.FOLIO_NO_OF_ITIES = ?";
	private static final String _FINDER_COLUMN_FOLIO_NO_OF_ITIES_FOLIO_NO_OF_ITIES_3 =
		"(rpowerUnpaidUnclaimedDevidend.FOLIO_NO_OF_ITIES IS NULL OR rpowerUnpaidUnclaimedDevidend.FOLIO_NO_OF_ITIES = '')";

	public RpowerUnpaidUnclaimedDevidendPersistenceImpl() {
		setModelClass(RpowerUnpaidUnclaimedDevidend.class);
	}

	/**
	 * Caches the rpower unpaid unclaimed devidend in the entity cache if it is enabled.
	 *
	 * @param rpowerUnpaidUnclaimedDevidend the rpower unpaid unclaimed devidend
	 */
	@Override
	public void cacheResult(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		entityCache.putResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendImpl.class,
			rpowerUnpaidUnclaimedDevidend.getPrimaryKey(),
			rpowerUnpaidUnclaimedDevidend);

		rpowerUnpaidUnclaimedDevidend.resetOriginalValues();
	}

	/**
	 * Caches the rpower unpaid unclaimed devidends in the entity cache if it is enabled.
	 *
	 * @param rpowerUnpaidUnclaimedDevidends the rpower unpaid unclaimed devidends
	 */
	@Override
	public void cacheResult(
		List<RpowerUnpaidUnclaimedDevidend> rpowerUnpaidUnclaimedDevidends) {
		for (RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend : rpowerUnpaidUnclaimedDevidends) {
			if (entityCache.getResult(
						RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
						RpowerUnpaidUnclaimedDevidendImpl.class,
						rpowerUnpaidUnclaimedDevidend.getPrimaryKey()) == null) {
				cacheResult(rpowerUnpaidUnclaimedDevidend);
			}
			else {
				rpowerUnpaidUnclaimedDevidend.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rpower unpaid unclaimed devidends.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpowerUnpaidUnclaimedDevidendImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the rpower unpaid unclaimed devidend.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		entityCache.removeResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendImpl.class,
			rpowerUnpaidUnclaimedDevidend.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(
		List<RpowerUnpaidUnclaimedDevidend> rpowerUnpaidUnclaimedDevidends) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend : rpowerUnpaidUnclaimedDevidends) {
			entityCache.removeResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
				RpowerUnpaidUnclaimedDevidendImpl.class,
				rpowerUnpaidUnclaimedDevidend.getPrimaryKey());
		}
	}

	/**
	 * Creates a new rpower unpaid unclaimed devidend with the primary key. Does not add the rpower unpaid unclaimed devidend to the database.
	 *
	 * @param SRNO the primary key for the new rpower unpaid unclaimed devidend
	 * @return the new rpower unpaid unclaimed devidend
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend create(long SRNO) {
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = new RpowerUnpaidUnclaimedDevidendImpl();

		rpowerUnpaidUnclaimedDevidend.setNew(true);
		rpowerUnpaidUnclaimedDevidend.setPrimaryKey(SRNO);

		return rpowerUnpaidUnclaimedDevidend;
	}

	/**
	 * Removes the rpower unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SRNO the primary key of the rpower unpaid unclaimed devidend
	 * @return the rpower unpaid unclaimed devidend that was removed
	 * @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend remove(long SRNO)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException {
		return remove((Serializable)SRNO);
	}

	/**
	 * Removes the rpower unpaid unclaimed devidend with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rpower unpaid unclaimed devidend
	 * @return the rpower unpaid unclaimed devidend that was removed
	 * @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend remove(Serializable primaryKey)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException {
		Session session = null;

		try {
			session = openSession();

			RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = (RpowerUnpaidUnclaimedDevidend)session.get(RpowerUnpaidUnclaimedDevidendImpl.class,
					primaryKey);

			if (rpowerUnpaidUnclaimedDevidend == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpowerUnpaidUnclaimedDevidendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(rpowerUnpaidUnclaimedDevidend);
		}
		catch (NoSuchRpowerUnpaidUnclaimedDevidendException nsee) {
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
	protected RpowerUnpaidUnclaimedDevidend removeImpl(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		rpowerUnpaidUnclaimedDevidend = toUnwrappedModel(rpowerUnpaidUnclaimedDevidend);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpowerUnpaidUnclaimedDevidend)) {
				rpowerUnpaidUnclaimedDevidend = (RpowerUnpaidUnclaimedDevidend)session.get(RpowerUnpaidUnclaimedDevidendImpl.class,
						rpowerUnpaidUnclaimedDevidend.getPrimaryKeyObj());
			}

			if (rpowerUnpaidUnclaimedDevidend != null) {
				session.delete(rpowerUnpaidUnclaimedDevidend);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (rpowerUnpaidUnclaimedDevidend != null) {
			clearCache(rpowerUnpaidUnclaimedDevidend);
		}

		return rpowerUnpaidUnclaimedDevidend;
	}

	@Override
	public RpowerUnpaidUnclaimedDevidend updateImpl(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		rpowerUnpaidUnclaimedDevidend = toUnwrappedModel(rpowerUnpaidUnclaimedDevidend);

		boolean isNew = rpowerUnpaidUnclaimedDevidend.isNew();

		RpowerUnpaidUnclaimedDevidendModelImpl rpowerUnpaidUnclaimedDevidendModelImpl =
			(RpowerUnpaidUnclaimedDevidendModelImpl)rpowerUnpaidUnclaimedDevidend;

		Session session = null;

		try {
			session = openSession();

			if (rpowerUnpaidUnclaimedDevidend.isNew()) {
				session.save(rpowerUnpaidUnclaimedDevidend);

				rpowerUnpaidUnclaimedDevidend.setNew(false);
			}
			else {
				rpowerUnpaidUnclaimedDevidend = (RpowerUnpaidUnclaimedDevidend)session.merge(rpowerUnpaidUnclaimedDevidend);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!RpowerUnpaidUnclaimedDevidendModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					rpowerUnpaidUnclaimedDevidendModelImpl.getFOLIO_NO_OF_ITIES()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FOLIO_NO_OF_ITIES,
				args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((rpowerUnpaidUnclaimedDevidendModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						rpowerUnpaidUnclaimedDevidendModelImpl.getOriginalFOLIO_NO_OF_ITIES()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FOLIO_NO_OF_ITIES,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES,
					args);

				args = new Object[] {
						rpowerUnpaidUnclaimedDevidendModelImpl.getFOLIO_NO_OF_ITIES()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FOLIO_NO_OF_ITIES,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FOLIO_NO_OF_ITIES,
					args);
			}
		}

		entityCache.putResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
			RpowerUnpaidUnclaimedDevidendImpl.class,
			rpowerUnpaidUnclaimedDevidend.getPrimaryKey(),
			rpowerUnpaidUnclaimedDevidend, false);

		rpowerUnpaidUnclaimedDevidend.resetOriginalValues();

		return rpowerUnpaidUnclaimedDevidend;
	}

	protected RpowerUnpaidUnclaimedDevidend toUnwrappedModel(
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend) {
		if (rpowerUnpaidUnclaimedDevidend instanceof RpowerUnpaidUnclaimedDevidendImpl) {
			return rpowerUnpaidUnclaimedDevidend;
		}

		RpowerUnpaidUnclaimedDevidendImpl rpowerUnpaidUnclaimedDevidendImpl = new RpowerUnpaidUnclaimedDevidendImpl();

		rpowerUnpaidUnclaimedDevidendImpl.setNew(rpowerUnpaidUnclaimedDevidend.isNew());
		rpowerUnpaidUnclaimedDevidendImpl.setPrimaryKey(rpowerUnpaidUnclaimedDevidend.getPrimaryKey());

		rpowerUnpaidUnclaimedDevidendImpl.setSRNO(rpowerUnpaidUnclaimedDevidend.getSRNO());
		rpowerUnpaidUnclaimedDevidendImpl.setFIRST_NAME(rpowerUnpaidUnclaimedDevidend.getFIRST_NAME());
		rpowerUnpaidUnclaimedDevidendImpl.setMIDDLE_NAME(rpowerUnpaidUnclaimedDevidend.getMIDDLE_NAME());
		rpowerUnpaidUnclaimedDevidendImpl.setLAST_NAME(rpowerUnpaidUnclaimedDevidend.getLAST_NAME());
		rpowerUnpaidUnclaimedDevidendImpl.setFATHER_HUSBAND_FIRST_NAME(rpowerUnpaidUnclaimedDevidend.getFATHER_HUSBAND_FIRST_NAME());
		rpowerUnpaidUnclaimedDevidendImpl.setFATHER_HUSBAND_MIDDLE_NAME(rpowerUnpaidUnclaimedDevidend.getFATHER_HUSBAND_MIDDLE_NAME());
		rpowerUnpaidUnclaimedDevidendImpl.setFATHER_HUSBAND_LAST_NAME(rpowerUnpaidUnclaimedDevidend.getFATHER_HUSBAND_LAST_NAME());
		rpowerUnpaidUnclaimedDevidendImpl.setADDRESS(rpowerUnpaidUnclaimedDevidend.getADDRESS());
		rpowerUnpaidUnclaimedDevidendImpl.setCOUNTRY(rpowerUnpaidUnclaimedDevidend.getCOUNTRY());
		rpowerUnpaidUnclaimedDevidendImpl.setSTATE(rpowerUnpaidUnclaimedDevidend.getSTATE());
		rpowerUnpaidUnclaimedDevidendImpl.setDISTRICT(rpowerUnpaidUnclaimedDevidend.getDISTRICT());
		rpowerUnpaidUnclaimedDevidendImpl.setPIN_CODE(rpowerUnpaidUnclaimedDevidend.getPIN_CODE());
		rpowerUnpaidUnclaimedDevidendImpl.setFOLIO_NO_OF_ITIES(rpowerUnpaidUnclaimedDevidend.getFOLIO_NO_OF_ITIES());
		rpowerUnpaidUnclaimedDevidendImpl.setINVESTMENT_TYPE(rpowerUnpaidUnclaimedDevidend.getINVESTMENT_TYPE());
		rpowerUnpaidUnclaimedDevidendImpl.setAMOUNT_DUE_IN_RS(rpowerUnpaidUnclaimedDevidend.getAMOUNT_DUE_IN_RS());
		rpowerUnpaidUnclaimedDevidendImpl.setPROPOSED_DATE_TRANSFER_IPEF(rpowerUnpaidUnclaimedDevidend.getPROPOSED_DATE_TRANSFER_IPEF());
		rpowerUnpaidUnclaimedDevidendImpl.setCREATEDATE(rpowerUnpaidUnclaimedDevidend.getCREATEDATE());

		return rpowerUnpaidUnclaimedDevidendImpl;
	}

	/**
	 * Returns the rpower unpaid unclaimed devidend with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the rpower unpaid unclaimed devidend
	 * @return the rpower unpaid unclaimed devidend
	 * @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend findByPrimaryKey(
		Serializable primaryKey)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException {
		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = fetchByPrimaryKey(primaryKey);

		if (rpowerUnpaidUnclaimedDevidend == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpowerUnpaidUnclaimedDevidendException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return rpowerUnpaidUnclaimedDevidend;
	}

	/**
	 * Returns the rpower unpaid unclaimed devidend with the primary key or throws a {@link NoSuchRpowerUnpaidUnclaimedDevidendException} if it could not be found.
	 *
	 * @param SRNO the primary key of the rpower unpaid unclaimed devidend
	 * @return the rpower unpaid unclaimed devidend
	 * @throws NoSuchRpowerUnpaidUnclaimedDevidendException if a rpower unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend findByPrimaryKey(long SRNO)
		throws NoSuchRpowerUnpaidUnclaimedDevidendException {
		return findByPrimaryKey((Serializable)SRNO);
	}

	/**
	 * Returns the rpower unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rpower unpaid unclaimed devidend
	 * @return the rpower unpaid unclaimed devidend, or <code>null</code> if a rpower unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend fetchByPrimaryKey(
		Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
				RpowerUnpaidUnclaimedDevidendImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = (RpowerUnpaidUnclaimedDevidend)serializable;

		if (rpowerUnpaidUnclaimedDevidend == null) {
			Session session = null;

			try {
				session = openSession();

				rpowerUnpaidUnclaimedDevidend = (RpowerUnpaidUnclaimedDevidend)session.get(RpowerUnpaidUnclaimedDevidendImpl.class,
						primaryKey);

				if (rpowerUnpaidUnclaimedDevidend != null) {
					cacheResult(rpowerUnpaidUnclaimedDevidend);
				}
				else {
					entityCache.putResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
						RpowerUnpaidUnclaimedDevidendImpl.class, primaryKey,
						nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					RpowerUnpaidUnclaimedDevidendImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return rpowerUnpaidUnclaimedDevidend;
	}

	/**
	 * Returns the rpower unpaid unclaimed devidend with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SRNO the primary key of the rpower unpaid unclaimed devidend
	 * @return the rpower unpaid unclaimed devidend, or <code>null</code> if a rpower unpaid unclaimed devidend with the primary key could not be found
	 */
	@Override
	public RpowerUnpaidUnclaimedDevidend fetchByPrimaryKey(long SRNO) {
		return fetchByPrimaryKey((Serializable)SRNO);
	}

	@Override
	public Map<Serializable, RpowerUnpaidUnclaimedDevidend> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, RpowerUnpaidUnclaimedDevidend> map = new HashMap<Serializable, RpowerUnpaidUnclaimedDevidend>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend = fetchByPrimaryKey(primaryKey);

			if (rpowerUnpaidUnclaimedDevidend != null) {
				map.put(primaryKey, rpowerUnpaidUnclaimedDevidend);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					RpowerUnpaidUnclaimedDevidendImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey,
						(RpowerUnpaidUnclaimedDevidend)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND_WHERE_PKS_IN);

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

			for (RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend : (List<RpowerUnpaidUnclaimedDevidend>)q.list()) {
				map.put(rpowerUnpaidUnclaimedDevidend.getPrimaryKeyObj(),
					rpowerUnpaidUnclaimedDevidend);

				cacheResult(rpowerUnpaidUnclaimedDevidend);

				uncachedPrimaryKeys.remove(rpowerUnpaidUnclaimedDevidend.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RpowerUnpaidUnclaimedDevidendModelImpl.ENTITY_CACHE_ENABLED,
					RpowerUnpaidUnclaimedDevidendImpl.class, primaryKey,
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
	 * Returns all the rpower unpaid unclaimed devidends.
	 *
	 * @return the rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rpower unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower unpaid unclaimed devidends
	 * @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	 * @return the range of rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rpower unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower unpaid unclaimed devidends
	 * @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rpower unpaid unclaimed devidends.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RpowerUnpaidUnclaimedDevidendModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of rpower unpaid unclaimed devidends
	 * @param end the upper bound of the range of rpower unpaid unclaimed devidends (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of rpower unpaid unclaimed devidends
	 */
	@Override
	public List<RpowerUnpaidUnclaimedDevidend> findAll(int start, int end,
		OrderByComparator<RpowerUnpaidUnclaimedDevidend> orderByComparator,
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

		List<RpowerUnpaidUnclaimedDevidend> list = null;

		if (retrieveFromCache) {
			list = (List<RpowerUnpaidUnclaimedDevidend>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND;

				if (pagination) {
					sql = sql.concat(RpowerUnpaidUnclaimedDevidendModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<RpowerUnpaidUnclaimedDevidend>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<RpowerUnpaidUnclaimedDevidend>)QueryUtil.list(q,
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
	 * Removes all the rpower unpaid unclaimed devidends from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend : findAll()) {
			remove(rpowerUnpaidUnclaimedDevidend);
		}
	}

	/**
	 * Returns the number of rpower unpaid unclaimed devidends.
	 *
	 * @return the number of rpower unpaid unclaimed devidends
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RPOWERUNPAIDUNCLAIMEDDEVIDEND);

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
		return RpowerUnpaidUnclaimedDevidendModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rpower unpaid unclaimed devidend persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RpowerUnpaidUnclaimedDevidendImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND = "SELECT rpowerUnpaidUnclaimedDevidend FROM RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend";
	private static final String _SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND_WHERE_PKS_IN =
		"SELECT rpowerUnpaidUnclaimedDevidend FROM RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend WHERE SRNO IN (";
	private static final String _SQL_SELECT_RPOWERUNPAIDUNCLAIMEDDEVIDEND_WHERE = "SELECT rpowerUnpaidUnclaimedDevidend FROM RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend WHERE ";
	private static final String _SQL_COUNT_RPOWERUNPAIDUNCLAIMEDDEVIDEND = "SELECT COUNT(rpowerUnpaidUnclaimedDevidend) FROM RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend";
	private static final String _SQL_COUNT_RPOWERUNPAIDUNCLAIMEDDEVIDEND_WHERE = "SELECT COUNT(rpowerUnpaidUnclaimedDevidend) FROM RpowerUnpaidUnclaimedDevidend rpowerUnpaidUnclaimedDevidend WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "rpowerUnpaidUnclaimedDevidend.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RpowerUnpaidUnclaimedDevidend exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No RpowerUnpaidUnclaimedDevidend exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(RpowerUnpaidUnclaimedDevidendPersistenceImpl.class);
}