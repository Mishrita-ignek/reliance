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

package com.rinfra.news.service.persistence.impl;

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
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.rinfra.news.exception.NoSuchPressNewsException;
import com.rinfra.news.model.PressNews;
import com.rinfra.news.model.impl.PressNewsImpl;
import com.rinfra.news.model.impl.PressNewsModelImpl;
import com.rinfra.news.service.persistence.PressNewsPersistence;

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
 * The persistence implementation for the press news service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vipin Singh
 * @see PressNewsPersistence
 * @see com.rinfra.news.service.persistence.PressNewsUtil
 * @generated
 */
@ProviderType
public class PressNewsPersistenceImpl extends BasePersistenceImpl<PressNews>
	implements PressNewsPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PressNewsUtil} to access the press news persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PressNewsImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, PressNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, PressNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEWSYEARANDMONTH =
		new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, PressNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNewsYearAndMonth",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEARANDMONTH =
		new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, PressNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByNewsYearAndMonth",
			new String[] { Integer.class.getName(), Integer.class.getName() },
			PressNewsModelImpl.YEAR_COLUMN_BITMASK |
			PressNewsModelImpl.MONTH_COLUMN_BITMASK |
			PressNewsModelImpl.DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEWSYEARANDMONTH = new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByNewsYearAndMonth",
			new String[] { Integer.class.getName(), Integer.class.getName() });

	/**
	 * Returns all the press newses where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @return the matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYearAndMonth(int year, int month) {
		return findByNewsYearAndMonth(year, month, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the press newses where year = &#63; and month = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param month the month
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @return the range of matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYearAndMonth(int year, int month,
		int start, int end) {
		return findByNewsYearAndMonth(year, month, start, end, null);
	}

	/**
	 * Returns an ordered range of all the press newses where year = &#63; and month = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param month the month
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYearAndMonth(int year, int month,
		int start, int end, OrderByComparator<PressNews> orderByComparator) {
		return findByNewsYearAndMonth(year, month, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the press newses where year = &#63; and month = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param month the month
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYearAndMonth(int year, int month,
		int start, int end, OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEARANDMONTH;
			finderArgs = new Object[] { year, month };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEWSYEARANDMONTH;
			finderArgs = new Object[] { year, month, start, end, orderByComparator };
		}

		List<PressNews> list = null;

		if (retrieveFromCache) {
			list = (List<PressNews>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PressNews pressNews : list) {
					if ((year != pressNews.getYear()) ||
							(month != pressNews.getMonth())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_PRESSNEWS_WHERE);

			query.append(_FINDER_COLUMN_NEWSYEARANDMONTH_YEAR_2);

			query.append(_FINDER_COLUMN_NEWSYEARANDMONTH_MONTH_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PressNewsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

				qPos.add(month);

				if (!pagination) {
					list = (List<PressNews>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PressNews>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first press news in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press news
	 * @throws NoSuchPressNewsException if a matching press news could not be found
	 */
	@Override
	public PressNews findByNewsYearAndMonth_First(int year, int month,
		OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException {
		PressNews pressNews = fetchByNewsYearAndMonth_First(year, month,
				orderByComparator);

		if (pressNews != null) {
			return pressNews;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(", month=");
		msg.append(month);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressNewsException(msg.toString());
	}

	/**
	 * Returns the first press news in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press news, or <code>null</code> if a matching press news could not be found
	 */
	@Override
	public PressNews fetchByNewsYearAndMonth_First(int year, int month,
		OrderByComparator<PressNews> orderByComparator) {
		List<PressNews> list = findByNewsYearAndMonth(year, month, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last press news in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press news
	 * @throws NoSuchPressNewsException if a matching press news could not be found
	 */
	@Override
	public PressNews findByNewsYearAndMonth_Last(int year, int month,
		OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException {
		PressNews pressNews = fetchByNewsYearAndMonth_Last(year, month,
				orderByComparator);

		if (pressNews != null) {
			return pressNews;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(", month=");
		msg.append(month);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressNewsException(msg.toString());
	}

	/**
	 * Returns the last press news in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press news, or <code>null</code> if a matching press news could not be found
	 */
	@Override
	public PressNews fetchByNewsYearAndMonth_Last(int year, int month,
		OrderByComparator<PressNews> orderByComparator) {
		int count = countByNewsYearAndMonth(year, month);

		if (count == 0) {
			return null;
		}

		List<PressNews> list = findByNewsYearAndMonth(year, month, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the press newses before and after the current press news in the ordered set where year = &#63; and month = &#63;.
	 *
	 * @param newsId the primary key of the current press news
	 * @param year the year
	 * @param month the month
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next press news
	 * @throws NoSuchPressNewsException if a press news with the primary key could not be found
	 */
	@Override
	public PressNews[] findByNewsYearAndMonth_PrevAndNext(long newsId,
		int year, int month, OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException {
		PressNews pressNews = findByPrimaryKey(newsId);

		Session session = null;

		try {
			session = openSession();

			PressNews[] array = new PressNewsImpl[3];

			array[0] = getByNewsYearAndMonth_PrevAndNext(session, pressNews,
					year, month, orderByComparator, true);

			array[1] = pressNews;

			array[2] = getByNewsYearAndMonth_PrevAndNext(session, pressNews,
					year, month, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PressNews getByNewsYearAndMonth_PrevAndNext(Session session,
		PressNews pressNews, int year, int month,
		OrderByComparator<PressNews> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_PRESSNEWS_WHERE);

		query.append(_FINDER_COLUMN_NEWSYEARANDMONTH_YEAR_2);

		query.append(_FINDER_COLUMN_NEWSYEARANDMONTH_MONTH_2);

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
			query.append(PressNewsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(year);

		qPos.add(month);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pressNews);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PressNews> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the press newses where year = &#63; and month = &#63; from the database.
	 *
	 * @param year the year
	 * @param month the month
	 */
	@Override
	public void removeByNewsYearAndMonth(int year, int month) {
		for (PressNews pressNews : findByNewsYearAndMonth(year, month,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(pressNews);
		}
	}

	/**
	 * Returns the number of press newses where year = &#63; and month = &#63;.
	 *
	 * @param year the year
	 * @param month the month
	 * @return the number of matching press newses
	 */
	@Override
	public int countByNewsYearAndMonth(int year, int month) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEWSYEARANDMONTH;

		Object[] finderArgs = new Object[] { year, month };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_PRESSNEWS_WHERE);

			query.append(_FINDER_COLUMN_NEWSYEARANDMONTH_YEAR_2);

			query.append(_FINDER_COLUMN_NEWSYEARANDMONTH_MONTH_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

				qPos.add(month);

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

	private static final String _FINDER_COLUMN_NEWSYEARANDMONTH_YEAR_2 = "pressNews.year = ? AND ";
	private static final String _FINDER_COLUMN_NEWSYEARANDMONTH_MONTH_2 = "pressNews.month = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NEWSYEAR = new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, PressNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNewsYear",
			new String[] {
				Integer.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEAR =
		new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, PressNewsImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNewsYear",
			new String[] { Integer.class.getName() },
			PressNewsModelImpl.YEAR_COLUMN_BITMASK |
			PressNewsModelImpl.DATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NEWSYEAR = new FinderPath(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNewsYear",
			new String[] { Integer.class.getName() });

	/**
	 * Returns all the press newses where year = &#63;.
	 *
	 * @param year the year
	 * @return the matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYear(int year) {
		return findByNewsYear(year, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the press newses where year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @return the range of matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYear(int year, int start, int end) {
		return findByNewsYear(year, start, end, null);
	}

	/**
	 * Returns an ordered range of all the press newses where year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYear(int year, int start, int end,
		OrderByComparator<PressNews> orderByComparator) {
		return findByNewsYear(year, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the press newses where year = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param year the year
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching press newses
	 */
	@Override
	public List<PressNews> findByNewsYear(int year, int start, int end,
		OrderByComparator<PressNews> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEAR;
			finderArgs = new Object[] { year };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NEWSYEAR;
			finderArgs = new Object[] { year, start, end, orderByComparator };
		}

		List<PressNews> list = null;

		if (retrieveFromCache) {
			list = (List<PressNews>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PressNews pressNews : list) {
					if ((year != pressNews.getYear())) {
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

			query.append(_SQL_SELECT_PRESSNEWS_WHERE);

			query.append(_FINDER_COLUMN_NEWSYEAR_YEAR_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PressNewsModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

				if (!pagination) {
					list = (List<PressNews>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PressNews>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first press news in the ordered set where year = &#63;.
	 *
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press news
	 * @throws NoSuchPressNewsException if a matching press news could not be found
	 */
	@Override
	public PressNews findByNewsYear_First(int year,
		OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException {
		PressNews pressNews = fetchByNewsYear_First(year, orderByComparator);

		if (pressNews != null) {
			return pressNews;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressNewsException(msg.toString());
	}

	/**
	 * Returns the first press news in the ordered set where year = &#63;.
	 *
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press news, or <code>null</code> if a matching press news could not be found
	 */
	@Override
	public PressNews fetchByNewsYear_First(int year,
		OrderByComparator<PressNews> orderByComparator) {
		List<PressNews> list = findByNewsYear(year, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last press news in the ordered set where year = &#63;.
	 *
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press news
	 * @throws NoSuchPressNewsException if a matching press news could not be found
	 */
	@Override
	public PressNews findByNewsYear_Last(int year,
		OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException {
		PressNews pressNews = fetchByNewsYear_Last(year, orderByComparator);

		if (pressNews != null) {
			return pressNews;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("year=");
		msg.append(year);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressNewsException(msg.toString());
	}

	/**
	 * Returns the last press news in the ordered set where year = &#63;.
	 *
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press news, or <code>null</code> if a matching press news could not be found
	 */
	@Override
	public PressNews fetchByNewsYear_Last(int year,
		OrderByComparator<PressNews> orderByComparator) {
		int count = countByNewsYear(year);

		if (count == 0) {
			return null;
		}

		List<PressNews> list = findByNewsYear(year, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the press newses before and after the current press news in the ordered set where year = &#63;.
	 *
	 * @param newsId the primary key of the current press news
	 * @param year the year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next press news
	 * @throws NoSuchPressNewsException if a press news with the primary key could not be found
	 */
	@Override
	public PressNews[] findByNewsYear_PrevAndNext(long newsId, int year,
		OrderByComparator<PressNews> orderByComparator)
		throws NoSuchPressNewsException {
		PressNews pressNews = findByPrimaryKey(newsId);

		Session session = null;

		try {
			session = openSession();

			PressNews[] array = new PressNewsImpl[3];

			array[0] = getByNewsYear_PrevAndNext(session, pressNews, year,
					orderByComparator, true);

			array[1] = pressNews;

			array[2] = getByNewsYear_PrevAndNext(session, pressNews, year,
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

	protected PressNews getByNewsYear_PrevAndNext(Session session,
		PressNews pressNews, int year,
		OrderByComparator<PressNews> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRESSNEWS_WHERE);

		query.append(_FINDER_COLUMN_NEWSYEAR_YEAR_2);

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
			query.append(PressNewsModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(year);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pressNews);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PressNews> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the press newses where year = &#63; from the database.
	 *
	 * @param year the year
	 */
	@Override
	public void removeByNewsYear(int year) {
		for (PressNews pressNews : findByNewsYear(year, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(pressNews);
		}
	}

	/**
	 * Returns the number of press newses where year = &#63;.
	 *
	 * @param year the year
	 * @return the number of matching press newses
	 */
	@Override
	public int countByNewsYear(int year) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NEWSYEAR;

		Object[] finderArgs = new Object[] { year };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRESSNEWS_WHERE);

			query.append(_FINDER_COLUMN_NEWSYEAR_YEAR_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(year);

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

	private static final String _FINDER_COLUMN_NEWSYEAR_YEAR_2 = "pressNews.year = ?";

	public PressNewsPersistenceImpl() {
		setModelClass(PressNews.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("date", "date_");
			dbColumnNames.put("show", "show_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the press news in the entity cache if it is enabled.
	 *
	 * @param pressNews the press news
	 */
	@Override
	public void cacheResult(PressNews pressNews) {
		entityCache.putResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsImpl.class, pressNews.getPrimaryKey(), pressNews);

		pressNews.resetOriginalValues();
	}

	/**
	 * Caches the press newses in the entity cache if it is enabled.
	 *
	 * @param pressNewses the press newses
	 */
	@Override
	public void cacheResult(List<PressNews> pressNewses) {
		for (PressNews pressNews : pressNewses) {
			if (entityCache.getResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
						PressNewsImpl.class, pressNews.getPrimaryKey()) == null) {
				cacheResult(pressNews);
			}
			else {
				pressNews.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all press newses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PressNewsImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the press news.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PressNews pressNews) {
		entityCache.removeResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsImpl.class, pressNews.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PressNews> pressNewses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PressNews pressNews : pressNewses) {
			entityCache.removeResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
				PressNewsImpl.class, pressNews.getPrimaryKey());
		}
	}

	/**
	 * Creates a new press news with the primary key. Does not add the press news to the database.
	 *
	 * @param newsId the primary key for the new press news
	 * @return the new press news
	 */
	@Override
	public PressNews create(long newsId) {
		PressNews pressNews = new PressNewsImpl();

		pressNews.setNew(true);
		pressNews.setPrimaryKey(newsId);

		return pressNews;
	}

	/**
	 * Removes the press news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param newsId the primary key of the press news
	 * @return the press news that was removed
	 * @throws NoSuchPressNewsException if a press news with the primary key could not be found
	 */
	@Override
	public PressNews remove(long newsId) throws NoSuchPressNewsException {
		return remove((Serializable)newsId);
	}

	/**
	 * Removes the press news with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the press news
	 * @return the press news that was removed
	 * @throws NoSuchPressNewsException if a press news with the primary key could not be found
	 */
	@Override
	public PressNews remove(Serializable primaryKey)
		throws NoSuchPressNewsException {
		Session session = null;

		try {
			session = openSession();

			PressNews pressNews = (PressNews)session.get(PressNewsImpl.class,
					primaryKey);

			if (pressNews == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPressNewsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pressNews);
		}
		catch (NoSuchPressNewsException nsee) {
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
	protected PressNews removeImpl(PressNews pressNews) {
		pressNews = toUnwrappedModel(pressNews);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pressNews)) {
				pressNews = (PressNews)session.get(PressNewsImpl.class,
						pressNews.getPrimaryKeyObj());
			}

			if (pressNews != null) {
				session.delete(pressNews);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pressNews != null) {
			clearCache(pressNews);
		}

		return pressNews;
	}

	@Override
	public PressNews updateImpl(PressNews pressNews) {
		pressNews = toUnwrappedModel(pressNews);

		boolean isNew = pressNews.isNew();

		PressNewsModelImpl pressNewsModelImpl = (PressNewsModelImpl)pressNews;

		Session session = null;

		try {
			session = openSession();

			if (pressNews.isNew()) {
				session.save(pressNews);

				pressNews.setNew(false);
			}
			else {
				pressNews = (PressNews)session.merge(pressNews);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!PressNewsModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					pressNewsModelImpl.getYear(), pressNewsModelImpl.getMonth()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_NEWSYEARANDMONTH, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEARANDMONTH,
				args);

			args = new Object[] { pressNewsModelImpl.getYear() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_NEWSYEAR, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEAR,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((pressNewsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEARANDMONTH.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pressNewsModelImpl.getOriginalYear(),
						pressNewsModelImpl.getOriginalMonth()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_NEWSYEARANDMONTH,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEARANDMONTH,
					args);

				args = new Object[] {
						pressNewsModelImpl.getYear(),
						pressNewsModelImpl.getMonth()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_NEWSYEARANDMONTH,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEARANDMONTH,
					args);
			}

			if ((pressNewsModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pressNewsModelImpl.getOriginalYear()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_NEWSYEAR, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEAR,
					args);

				args = new Object[] { pressNewsModelImpl.getYear() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_NEWSYEAR, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NEWSYEAR,
					args);
			}
		}

		entityCache.putResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
			PressNewsImpl.class, pressNews.getPrimaryKey(), pressNews, false);

		pressNews.resetOriginalValues();

		return pressNews;
	}

	protected PressNews toUnwrappedModel(PressNews pressNews) {
		if (pressNews instanceof PressNewsImpl) {
			return pressNews;
		}

		PressNewsImpl pressNewsImpl = new PressNewsImpl();

		pressNewsImpl.setNew(pressNews.isNew());
		pressNewsImpl.setPrimaryKey(pressNews.getPrimaryKey());

		pressNewsImpl.setNewsId(pressNews.getNewsId());
		pressNewsImpl.setHeadLine(pressNews.getHeadLine());
		pressNewsImpl.setPublication(pressNews.getPublication());
		pressNewsImpl.setDownloadUrl(pressNews.getDownloadUrl());
		pressNewsImpl.setFileName(pressNews.getFileName());
		pressNewsImpl.setDate(pressNews.getDate());
		pressNewsImpl.setYear(pressNews.getYear());
		pressNewsImpl.setMonth(pressNews.getMonth());
		pressNewsImpl.setShow(pressNews.getShow());

		return pressNewsImpl;
	}

	/**
	 * Returns the press news with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the press news
	 * @return the press news
	 * @throws NoSuchPressNewsException if a press news with the primary key could not be found
	 */
	@Override
	public PressNews findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPressNewsException {
		PressNews pressNews = fetchByPrimaryKey(primaryKey);

		if (pressNews == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPressNewsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pressNews;
	}

	/**
	 * Returns the press news with the primary key or throws a {@link NoSuchPressNewsException} if it could not be found.
	 *
	 * @param newsId the primary key of the press news
	 * @return the press news
	 * @throws NoSuchPressNewsException if a press news with the primary key could not be found
	 */
	@Override
	public PressNews findByPrimaryKey(long newsId)
		throws NoSuchPressNewsException {
		return findByPrimaryKey((Serializable)newsId);
	}

	/**
	 * Returns the press news with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the press news
	 * @return the press news, or <code>null</code> if a press news with the primary key could not be found
	 */
	@Override
	public PressNews fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
				PressNewsImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		PressNews pressNews = (PressNews)serializable;

		if (pressNews == null) {
			Session session = null;

			try {
				session = openSession();

				pressNews = (PressNews)session.get(PressNewsImpl.class,
						primaryKey);

				if (pressNews != null) {
					cacheResult(pressNews);
				}
				else {
					entityCache.putResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
						PressNewsImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
					PressNewsImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pressNews;
	}

	/**
	 * Returns the press news with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param newsId the primary key of the press news
	 * @return the press news, or <code>null</code> if a press news with the primary key could not be found
	 */
	@Override
	public PressNews fetchByPrimaryKey(long newsId) {
		return fetchByPrimaryKey((Serializable)newsId);
	}

	@Override
	public Map<Serializable, PressNews> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, PressNews> map = new HashMap<Serializable, PressNews>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			PressNews pressNews = fetchByPrimaryKey(primaryKey);

			if (pressNews != null) {
				map.put(primaryKey, pressNews);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
					PressNewsImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (PressNews)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRESSNEWS_WHERE_PKS_IN);

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

			for (PressNews pressNews : (List<PressNews>)q.list()) {
				map.put(pressNews.getPrimaryKeyObj(), pressNews);

				cacheResult(pressNews);

				uncachedPrimaryKeys.remove(pressNews.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PressNewsModelImpl.ENTITY_CACHE_ENABLED,
					PressNewsImpl.class, primaryKey, nullModel);
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
	 * Returns all the press newses.
	 *
	 * @return the press newses
	 */
	@Override
	public List<PressNews> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the press newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @return the range of press newses
	 */
	@Override
	public List<PressNews> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the press newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of press newses
	 */
	@Override
	public List<PressNews> findAll(int start, int end,
		OrderByComparator<PressNews> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the press newses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressNewsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of press newses
	 * @param end the upper bound of the range of press newses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of press newses
	 */
	@Override
	public List<PressNews> findAll(int start, int end,
		OrderByComparator<PressNews> orderByComparator,
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

		List<PressNews> list = null;

		if (retrieveFromCache) {
			list = (List<PressNews>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRESSNEWS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRESSNEWS;

				if (pagination) {
					sql = sql.concat(PressNewsModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PressNews>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PressNews>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the press newses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PressNews pressNews : findAll()) {
			remove(pressNews);
		}
	}

	/**
	 * Returns the number of press newses.
	 *
	 * @return the number of press newses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRESSNEWS);

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
		return PressNewsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the press news persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PressNewsImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PRESSNEWS = "SELECT pressNews FROM PressNews pressNews";
	private static final String _SQL_SELECT_PRESSNEWS_WHERE_PKS_IN = "SELECT pressNews FROM PressNews pressNews WHERE newsId IN (";
	private static final String _SQL_SELECT_PRESSNEWS_WHERE = "SELECT pressNews FROM PressNews pressNews WHERE ";
	private static final String _SQL_COUNT_PRESSNEWS = "SELECT COUNT(pressNews) FROM PressNews pressNews";
	private static final String _SQL_COUNT_PRESSNEWS_WHERE = "SELECT COUNT(pressNews) FROM PressNews pressNews WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pressNews.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PressNews exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PressNews exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(PressNewsPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"date", "show"
			});
}