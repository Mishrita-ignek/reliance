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

package com.relieanceada.rinfra.portal.pressRelease.service.persistence.impl;

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

import com.relieanceada.rinfra.portal.pressRelease.exception.NoSuchPressReleaseException;
import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;
import com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl;
import com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseModelImpl;
import com.relieanceada.rinfra.portal.pressRelease.service.persistence.PressReleasePersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the press release service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Vipin Singh
 * @see PressReleasePersistence
 * @see com.relieanceada.rinfra.portal.pressRelease.service.persistence.PressReleaseUtil
 * @generated
 */
@ProviderType
public class PressReleasePersistenceImpl extends BasePersistenceImpl<PressRelease>
	implements PressReleasePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PressReleaseUtil} to access the press release persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PressReleaseImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, PressReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, PressReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SELECTEDNEWSYEAR =
		new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, PressReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByselectedNewsYear",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SELECTEDNEWSYEAR =
		new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, PressReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByselectedNewsYear", new String[] { String.class.getName() },
			PressReleaseModelImpl.NEWSYEAR_COLUMN_BITMASK |
			PressReleaseModelImpl.NEWSDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SELECTEDNEWSYEAR = new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByselectedNewsYear", new String[] { String.class.getName() });

	/**
	 * Returns all the press releases where newsYear = &#63;.
	 *
	 * @param newsYear the news year
	 * @return the matching press releases
	 */
	@Override
	public List<PressRelease> findByselectedNewsYear(String newsYear) {
		return findByselectedNewsYear(newsYear, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the press releases where newsYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param newsYear the news year
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @return the range of matching press releases
	 */
	@Override
	public List<PressRelease> findByselectedNewsYear(String newsYear,
		int start, int end) {
		return findByselectedNewsYear(newsYear, start, end, null);
	}

	/**
	 * Returns an ordered range of all the press releases where newsYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param newsYear the news year
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching press releases
	 */
	@Override
	public List<PressRelease> findByselectedNewsYear(String newsYear,
		int start, int end, OrderByComparator<PressRelease> orderByComparator) {
		return findByselectedNewsYear(newsYear, start, end, orderByComparator,
			true);
	}

	/**
	 * Returns an ordered range of all the press releases where newsYear = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param newsYear the news year
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching press releases
	 */
	@Override
	public List<PressRelease> findByselectedNewsYear(String newsYear,
		int start, int end, OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SELECTEDNEWSYEAR;
			finderArgs = new Object[] { newsYear };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SELECTEDNEWSYEAR;
			finderArgs = new Object[] { newsYear, start, end, orderByComparator };
		}

		List<PressRelease> list = null;

		if (retrieveFromCache) {
			list = (List<PressRelease>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PressRelease pressRelease : list) {
					if (!Objects.equals(newsYear, pressRelease.getNewsYear())) {
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

			query.append(_SQL_SELECT_PRESSRELEASE_WHERE);

			boolean bindNewsYear = false;

			if (newsYear == null) {
				query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_1);
			}
			else if (newsYear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_3);
			}
			else {
				bindNewsYear = true;

				query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PressReleaseModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNewsYear) {
					qPos.add(newsYear);
				}

				if (!pagination) {
					list = (List<PressRelease>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PressRelease>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first press release in the ordered set where newsYear = &#63;.
	 *
	 * @param newsYear the news year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press release
	 * @throws NoSuchPressReleaseException if a matching press release could not be found
	 */
	@Override
	public PressRelease findByselectedNewsYear_First(String newsYear,
		OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException {
		PressRelease pressRelease = fetchByselectedNewsYear_First(newsYear,
				orderByComparator);

		if (pressRelease != null) {
			return pressRelease;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("newsYear=");
		msg.append(newsYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressReleaseException(msg.toString());
	}

	/**
	 * Returns the first press release in the ordered set where newsYear = &#63;.
	 *
	 * @param newsYear the news year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press release, or <code>null</code> if a matching press release could not be found
	 */
	@Override
	public PressRelease fetchByselectedNewsYear_First(String newsYear,
		OrderByComparator<PressRelease> orderByComparator) {
		List<PressRelease> list = findByselectedNewsYear(newsYear, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last press release in the ordered set where newsYear = &#63;.
	 *
	 * @param newsYear the news year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press release
	 * @throws NoSuchPressReleaseException if a matching press release could not be found
	 */
	@Override
	public PressRelease findByselectedNewsYear_Last(String newsYear,
		OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException {
		PressRelease pressRelease = fetchByselectedNewsYear_Last(newsYear,
				orderByComparator);

		if (pressRelease != null) {
			return pressRelease;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("newsYear=");
		msg.append(newsYear);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressReleaseException(msg.toString());
	}

	/**
	 * Returns the last press release in the ordered set where newsYear = &#63;.
	 *
	 * @param newsYear the news year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press release, or <code>null</code> if a matching press release could not be found
	 */
	@Override
	public PressRelease fetchByselectedNewsYear_Last(String newsYear,
		OrderByComparator<PressRelease> orderByComparator) {
		int count = countByselectedNewsYear(newsYear);

		if (count == 0) {
			return null;
		}

		List<PressRelease> list = findByselectedNewsYear(newsYear, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the press releases before and after the current press release in the ordered set where newsYear = &#63;.
	 *
	 * @param pressId the primary key of the current press release
	 * @param newsYear the news year
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next press release
	 * @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease[] findByselectedNewsYear_PrevAndNext(long pressId,
		String newsYear, OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException {
		PressRelease pressRelease = findByPrimaryKey(pressId);

		Session session = null;

		try {
			session = openSession();

			PressRelease[] array = new PressReleaseImpl[3];

			array[0] = getByselectedNewsYear_PrevAndNext(session, pressRelease,
					newsYear, orderByComparator, true);

			array[1] = pressRelease;

			array[2] = getByselectedNewsYear_PrevAndNext(session, pressRelease,
					newsYear, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected PressRelease getByselectedNewsYear_PrevAndNext(Session session,
		PressRelease pressRelease, String newsYear,
		OrderByComparator<PressRelease> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRESSRELEASE_WHERE);

		boolean bindNewsYear = false;

		if (newsYear == null) {
			query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_1);
		}
		else if (newsYear.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_3);
		}
		else {
			bindNewsYear = true;

			query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_2);
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
			query.append(PressReleaseModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNewsYear) {
			qPos.add(newsYear);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pressRelease);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PressRelease> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the press releases where newsYear = &#63; from the database.
	 *
	 * @param newsYear the news year
	 */
	@Override
	public void removeByselectedNewsYear(String newsYear) {
		for (PressRelease pressRelease : findByselectedNewsYear(newsYear,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(pressRelease);
		}
	}

	/**
	 * Returns the number of press releases where newsYear = &#63;.
	 *
	 * @param newsYear the news year
	 * @return the number of matching press releases
	 */
	@Override
	public int countByselectedNewsYear(String newsYear) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SELECTEDNEWSYEAR;

		Object[] finderArgs = new Object[] { newsYear };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRESSRELEASE_WHERE);

			boolean bindNewsYear = false;

			if (newsYear == null) {
				query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_1);
			}
			else if (newsYear.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_3);
			}
			else {
				bindNewsYear = true;

				query.append(_FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNewsYear) {
					qPos.add(newsYear);
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

	private static final String _FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_1 = "pressRelease.newsYear IS NULL";
	private static final String _FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_2 = "pressRelease.newsYear = ?";
	private static final String _FINDER_COLUMN_SELECTEDNEWSYEAR_NEWSYEAR_3 = "(pressRelease.newsYear IS NULL OR pressRelease.newsYear = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_HEADING = new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, PressReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByheading",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HEADING =
		new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, PressReleaseImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByheading",
			new String[] { String.class.getName() },
			PressReleaseModelImpl.HEADING_COLUMN_BITMASK |
			PressReleaseModelImpl.NEWSDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_HEADING = new FinderPath(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByheading",
			new String[] { String.class.getName() });

	/**
	 * Returns all the press releases where heading = &#63;.
	 *
	 * @param heading the heading
	 * @return the matching press releases
	 */
	@Override
	public List<PressRelease> findByheading(String heading) {
		return findByheading(heading, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the press releases where heading = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param heading the heading
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @return the range of matching press releases
	 */
	@Override
	public List<PressRelease> findByheading(String heading, int start, int end) {
		return findByheading(heading, start, end, null);
	}

	/**
	 * Returns an ordered range of all the press releases where heading = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param heading the heading
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching press releases
	 */
	@Override
	public List<PressRelease> findByheading(String heading, int start, int end,
		OrderByComparator<PressRelease> orderByComparator) {
		return findByheading(heading, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the press releases where heading = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param heading the heading
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching press releases
	 */
	@Override
	public List<PressRelease> findByheading(String heading, int start, int end,
		OrderByComparator<PressRelease> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HEADING;
			finderArgs = new Object[] { heading };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_HEADING;
			finderArgs = new Object[] { heading, start, end, orderByComparator };
		}

		List<PressRelease> list = null;

		if (retrieveFromCache) {
			list = (List<PressRelease>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (PressRelease pressRelease : list) {
					if (!Objects.equals(heading, pressRelease.getHeading())) {
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

			query.append(_SQL_SELECT_PRESSRELEASE_WHERE);

			boolean bindHeading = false;

			if (heading == null) {
				query.append(_FINDER_COLUMN_HEADING_HEADING_1);
			}
			else if (heading.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HEADING_HEADING_3);
			}
			else {
				bindHeading = true;

				query.append(_FINDER_COLUMN_HEADING_HEADING_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(PressReleaseModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindHeading) {
					qPos.add(heading);
				}

				if (!pagination) {
					list = (List<PressRelease>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PressRelease>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first press release in the ordered set where heading = &#63;.
	 *
	 * @param heading the heading
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press release
	 * @throws NoSuchPressReleaseException if a matching press release could not be found
	 */
	@Override
	public PressRelease findByheading_First(String heading,
		OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException {
		PressRelease pressRelease = fetchByheading_First(heading,
				orderByComparator);

		if (pressRelease != null) {
			return pressRelease;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("heading=");
		msg.append(heading);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressReleaseException(msg.toString());
	}

	/**
	 * Returns the first press release in the ordered set where heading = &#63;.
	 *
	 * @param heading the heading
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching press release, or <code>null</code> if a matching press release could not be found
	 */
	@Override
	public PressRelease fetchByheading_First(String heading,
		OrderByComparator<PressRelease> orderByComparator) {
		List<PressRelease> list = findByheading(heading, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last press release in the ordered set where heading = &#63;.
	 *
	 * @param heading the heading
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press release
	 * @throws NoSuchPressReleaseException if a matching press release could not be found
	 */
	@Override
	public PressRelease findByheading_Last(String heading,
		OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException {
		PressRelease pressRelease = fetchByheading_Last(heading,
				orderByComparator);

		if (pressRelease != null) {
			return pressRelease;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("heading=");
		msg.append(heading);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchPressReleaseException(msg.toString());
	}

	/**
	 * Returns the last press release in the ordered set where heading = &#63;.
	 *
	 * @param heading the heading
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching press release, or <code>null</code> if a matching press release could not be found
	 */
	@Override
	public PressRelease fetchByheading_Last(String heading,
		OrderByComparator<PressRelease> orderByComparator) {
		int count = countByheading(heading);

		if (count == 0) {
			return null;
		}

		List<PressRelease> list = findByheading(heading, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the press releases before and after the current press release in the ordered set where heading = &#63;.
	 *
	 * @param pressId the primary key of the current press release
	 * @param heading the heading
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next press release
	 * @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease[] findByheading_PrevAndNext(long pressId,
		String heading, OrderByComparator<PressRelease> orderByComparator)
		throws NoSuchPressReleaseException {
		PressRelease pressRelease = findByPrimaryKey(pressId);

		Session session = null;

		try {
			session = openSession();

			PressRelease[] array = new PressReleaseImpl[3];

			array[0] = getByheading_PrevAndNext(session, pressRelease, heading,
					orderByComparator, true);

			array[1] = pressRelease;

			array[2] = getByheading_PrevAndNext(session, pressRelease, heading,
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

	protected PressRelease getByheading_PrevAndNext(Session session,
		PressRelease pressRelease, String heading,
		OrderByComparator<PressRelease> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_PRESSRELEASE_WHERE);

		boolean bindHeading = false;

		if (heading == null) {
			query.append(_FINDER_COLUMN_HEADING_HEADING_1);
		}
		else if (heading.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_HEADING_HEADING_3);
		}
		else {
			bindHeading = true;

			query.append(_FINDER_COLUMN_HEADING_HEADING_2);
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
			query.append(PressReleaseModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindHeading) {
			qPos.add(heading);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(pressRelease);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<PressRelease> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the press releases where heading = &#63; from the database.
	 *
	 * @param heading the heading
	 */
	@Override
	public void removeByheading(String heading) {
		for (PressRelease pressRelease : findByheading(heading,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(pressRelease);
		}
	}

	/**
	 * Returns the number of press releases where heading = &#63;.
	 *
	 * @param heading the heading
	 * @return the number of matching press releases
	 */
	@Override
	public int countByheading(String heading) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_HEADING;

		Object[] finderArgs = new Object[] { heading };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_PRESSRELEASE_WHERE);

			boolean bindHeading = false;

			if (heading == null) {
				query.append(_FINDER_COLUMN_HEADING_HEADING_1);
			}
			else if (heading.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_HEADING_HEADING_3);
			}
			else {
				bindHeading = true;

				query.append(_FINDER_COLUMN_HEADING_HEADING_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindHeading) {
					qPos.add(heading);
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

	private static final String _FINDER_COLUMN_HEADING_HEADING_1 = "pressRelease.heading IS NULL";
	private static final String _FINDER_COLUMN_HEADING_HEADING_2 = "pressRelease.heading = ?";
	private static final String _FINDER_COLUMN_HEADING_HEADING_3 = "(pressRelease.heading IS NULL OR pressRelease.heading = '')";

	public PressReleasePersistenceImpl() {
		setModelClass(PressRelease.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("data", "data_");
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
	 * Caches the press release in the entity cache if it is enabled.
	 *
	 * @param pressRelease the press release
	 */
	@Override
	public void cacheResult(PressRelease pressRelease) {
		entityCache.putResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseImpl.class, pressRelease.getPrimaryKey(), pressRelease);

		pressRelease.resetOriginalValues();
	}

	/**
	 * Caches the press releases in the entity cache if it is enabled.
	 *
	 * @param pressReleases the press releases
	 */
	@Override
	public void cacheResult(List<PressRelease> pressReleases) {
		for (PressRelease pressRelease : pressReleases) {
			if (entityCache.getResult(
						PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
						PressReleaseImpl.class, pressRelease.getPrimaryKey()) == null) {
				cacheResult(pressRelease);
			}
			else {
				pressRelease.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all press releases.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PressReleaseImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the press release.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(PressRelease pressRelease) {
		entityCache.removeResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseImpl.class, pressRelease.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<PressRelease> pressReleases) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (PressRelease pressRelease : pressReleases) {
			entityCache.removeResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
				PressReleaseImpl.class, pressRelease.getPrimaryKey());
		}
	}

	/**
	 * Creates a new press release with the primary key. Does not add the press release to the database.
	 *
	 * @param pressId the primary key for the new press release
	 * @return the new press release
	 */
	@Override
	public PressRelease create(long pressId) {
		PressRelease pressRelease = new PressReleaseImpl();

		pressRelease.setNew(true);
		pressRelease.setPrimaryKey(pressId);

		return pressRelease;
	}

	/**
	 * Removes the press release with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param pressId the primary key of the press release
	 * @return the press release that was removed
	 * @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease remove(long pressId) throws NoSuchPressReleaseException {
		return remove((Serializable)pressId);
	}

	/**
	 * Removes the press release with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the press release
	 * @return the press release that was removed
	 * @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease remove(Serializable primaryKey)
		throws NoSuchPressReleaseException {
		Session session = null;

		try {
			session = openSession();

			PressRelease pressRelease = (PressRelease)session.get(PressReleaseImpl.class,
					primaryKey);

			if (pressRelease == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPressReleaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pressRelease);
		}
		catch (NoSuchPressReleaseException nsee) {
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
	protected PressRelease removeImpl(PressRelease pressRelease) {
		pressRelease = toUnwrappedModel(pressRelease);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pressRelease)) {
				pressRelease = (PressRelease)session.get(PressReleaseImpl.class,
						pressRelease.getPrimaryKeyObj());
			}

			if (pressRelease != null) {
				session.delete(pressRelease);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pressRelease != null) {
			clearCache(pressRelease);
		}

		return pressRelease;
	}

	@Override
	public PressRelease updateImpl(PressRelease pressRelease) {
		pressRelease = toUnwrappedModel(pressRelease);

		boolean isNew = pressRelease.isNew();

		PressReleaseModelImpl pressReleaseModelImpl = (PressReleaseModelImpl)pressRelease;

		Session session = null;

		try {
			session = openSession();

			if (pressRelease.isNew()) {
				session.save(pressRelease);

				pressRelease.setNew(false);
			}
			else {
				pressRelease = (PressRelease)session.merge(pressRelease);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!PressReleaseModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { pressReleaseModelImpl.getNewsYear() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SELECTEDNEWSYEAR, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SELECTEDNEWSYEAR,
				args);

			args = new Object[] { pressReleaseModelImpl.getHeading() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_HEADING, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HEADING,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((pressReleaseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SELECTEDNEWSYEAR.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pressReleaseModelImpl.getOriginalNewsYear()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SELECTEDNEWSYEAR,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SELECTEDNEWSYEAR,
					args);

				args = new Object[] { pressReleaseModelImpl.getNewsYear() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SELECTEDNEWSYEAR,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SELECTEDNEWSYEAR,
					args);
			}

			if ((pressReleaseModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HEADING.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						pressReleaseModelImpl.getOriginalHeading()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_HEADING, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HEADING,
					args);

				args = new Object[] { pressReleaseModelImpl.getHeading() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_HEADING, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_HEADING,
					args);
			}
		}

		entityCache.putResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
			PressReleaseImpl.class, pressRelease.getPrimaryKey(), pressRelease,
			false);

		pressRelease.resetOriginalValues();

		return pressRelease;
	}

	protected PressRelease toUnwrappedModel(PressRelease pressRelease) {
		if (pressRelease instanceof PressReleaseImpl) {
			return pressRelease;
		}

		PressReleaseImpl pressReleaseImpl = new PressReleaseImpl();

		pressReleaseImpl.setNew(pressRelease.isNew());
		pressReleaseImpl.setPrimaryKey(pressRelease.getPrimaryKey());

		pressReleaseImpl.setPressId(pressRelease.getPressId());
		pressReleaseImpl.setNewsYear(pressRelease.getNewsYear());
		pressReleaseImpl.setNewsDate(pressRelease.getNewsDate());
		pressReleaseImpl.setHeading(pressRelease.getHeading());
		pressReleaseImpl.setData(pressRelease.getData());
		pressReleaseImpl.setDescription(pressRelease.getDescription());
		pressReleaseImpl.setShow(pressRelease.getShow());
		pressReleaseImpl.setCreatedDate(pressRelease.getCreatedDate());
		pressReleaseImpl.setFileName(pressRelease.getFileName());
		pressReleaseImpl.setFileURL(pressRelease.getFileURL());

		return pressReleaseImpl;
	}

	/**
	 * Returns the press release with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the press release
	 * @return the press release
	 * @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPressReleaseException {
		PressRelease pressRelease = fetchByPrimaryKey(primaryKey);

		if (pressRelease == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPressReleaseException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pressRelease;
	}

	/**
	 * Returns the press release with the primary key or throws a {@link NoSuchPressReleaseException} if it could not be found.
	 *
	 * @param pressId the primary key of the press release
	 * @return the press release
	 * @throws NoSuchPressReleaseException if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease findByPrimaryKey(long pressId)
		throws NoSuchPressReleaseException {
		return findByPrimaryKey((Serializable)pressId);
	}

	/**
	 * Returns the press release with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the press release
	 * @return the press release, or <code>null</code> if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
				PressReleaseImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		PressRelease pressRelease = (PressRelease)serializable;

		if (pressRelease == null) {
			Session session = null;

			try {
				session = openSession();

				pressRelease = (PressRelease)session.get(PressReleaseImpl.class,
						primaryKey);

				if (pressRelease != null) {
					cacheResult(pressRelease);
				}
				else {
					entityCache.putResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
						PressReleaseImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
					PressReleaseImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pressRelease;
	}

	/**
	 * Returns the press release with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param pressId the primary key of the press release
	 * @return the press release, or <code>null</code> if a press release with the primary key could not be found
	 */
	@Override
	public PressRelease fetchByPrimaryKey(long pressId) {
		return fetchByPrimaryKey((Serializable)pressId);
	}

	@Override
	public Map<Serializable, PressRelease> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, PressRelease> map = new HashMap<Serializable, PressRelease>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			PressRelease pressRelease = fetchByPrimaryKey(primaryKey);

			if (pressRelease != null) {
				map.put(primaryKey, pressRelease);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
					PressReleaseImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (PressRelease)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PRESSRELEASE_WHERE_PKS_IN);

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

			for (PressRelease pressRelease : (List<PressRelease>)q.list()) {
				map.put(pressRelease.getPrimaryKeyObj(), pressRelease);

				cacheResult(pressRelease);

				uncachedPrimaryKeys.remove(pressRelease.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PressReleaseModelImpl.ENTITY_CACHE_ENABLED,
					PressReleaseImpl.class, primaryKey, nullModel);
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
	 * Returns all the press releases.
	 *
	 * @return the press releases
	 */
	@Override
	public List<PressRelease> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the press releases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @return the range of press releases
	 */
	@Override
	public List<PressRelease> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the press releases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of press releases
	 */
	@Override
	public List<PressRelease> findAll(int start, int end,
		OrderByComparator<PressRelease> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the press releases.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PressReleaseModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of press releases
	 * @param end the upper bound of the range of press releases (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of press releases
	 */
	@Override
	public List<PressRelease> findAll(int start, int end,
		OrderByComparator<PressRelease> orderByComparator,
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

		List<PressRelease> list = null;

		if (retrieveFromCache) {
			list = (List<PressRelease>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PRESSRELEASE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PRESSRELEASE;

				if (pagination) {
					sql = sql.concat(PressReleaseModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<PressRelease>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<PressRelease>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the press releases from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (PressRelease pressRelease : findAll()) {
			remove(pressRelease);
		}
	}

	/**
	 * Returns the number of press releases.
	 *
	 * @return the number of press releases
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PRESSRELEASE);

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
		return PressReleaseModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the press release persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PressReleaseImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PRESSRELEASE = "SELECT pressRelease FROM PressRelease pressRelease";
	private static final String _SQL_SELECT_PRESSRELEASE_WHERE_PKS_IN = "SELECT pressRelease FROM PressRelease pressRelease WHERE pressId IN (";
	private static final String _SQL_SELECT_PRESSRELEASE_WHERE = "SELECT pressRelease FROM PressRelease pressRelease WHERE ";
	private static final String _SQL_COUNT_PRESSRELEASE = "SELECT COUNT(pressRelease) FROM PressRelease pressRelease";
	private static final String _SQL_COUNT_PRESSRELEASE_WHERE = "SELECT COUNT(pressRelease) FROM PressRelease pressRelease WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pressRelease.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PressRelease exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PressRelease exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(PressReleasePersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"data", "show"
			});
}