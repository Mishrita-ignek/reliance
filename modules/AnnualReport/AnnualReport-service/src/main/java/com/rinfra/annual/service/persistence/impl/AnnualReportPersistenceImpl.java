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

package com.rinfra.annual.service.persistence.impl;

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

import com.rinfra.annual.exception.NoSuchAnnualReportException;
import com.rinfra.annual.model.AnnualReport;
import com.rinfra.annual.model.impl.AnnualReportImpl;
import com.rinfra.annual.model.impl.AnnualReportModelImpl;
import com.rinfra.annual.service.persistence.AnnualReportPersistence;

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
 * The persistence implementation for the annual report service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author MukeshPatidar
 * @see AnnualReportPersistence
 * @see com.rinfra.annual.service.persistence.AnnualReportUtil
 * @generated
 */
@ProviderType
public class AnnualReportPersistenceImpl extends BasePersistenceImpl<AnnualReport>
	implements AnnualReportPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AnnualReportUtil} to access the annual report persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AnnualReportImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportModelImpl.FINDER_CACHE_ENABLED, AnnualReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportModelImpl.FINDER_CACHE_ENABLED, AnnualReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FINANCIAL_YEARS =
		new FinderPath(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportModelImpl.FINDER_CACHE_ENABLED, AnnualReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFINANCIAL_YEARS",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINANCIAL_YEARS =
		new FinderPath(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportModelImpl.FINDER_CACHE_ENABLED, AnnualReportImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFINANCIAL_YEARS",
			new String[] { String.class.getName() },
			AnnualReportModelImpl.FINANCIAL_YEARS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FINANCIAL_YEARS = new FinderPath(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByFINANCIAL_YEARS", new String[] { String.class.getName() });

	/**
	 * Returns all the annual reports where FINANCIAL_YEARS = &#63;.
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @return the matching annual reports
	 */
	@Override
	public List<AnnualReport> findByFINANCIAL_YEARS(String FINANCIAL_YEARS) {
		return findByFINANCIAL_YEARS(FINANCIAL_YEARS, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the annual reports where FINANCIAL_YEARS = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @param start the lower bound of the range of annual reports
	 * @param end the upper bound of the range of annual reports (not inclusive)
	 * @return the range of matching annual reports
	 */
	@Override
	public List<AnnualReport> findByFINANCIAL_YEARS(String FINANCIAL_YEARS,
		int start, int end) {
		return findByFINANCIAL_YEARS(FINANCIAL_YEARS, start, end, null);
	}

	/**
	 * Returns an ordered range of all the annual reports where FINANCIAL_YEARS = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @param start the lower bound of the range of annual reports
	 * @param end the upper bound of the range of annual reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching annual reports
	 */
	@Override
	public List<AnnualReport> findByFINANCIAL_YEARS(String FINANCIAL_YEARS,
		int start, int end, OrderByComparator<AnnualReport> orderByComparator) {
		return findByFINANCIAL_YEARS(FINANCIAL_YEARS, start, end,
			orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the annual reports where FINANCIAL_YEARS = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @param start the lower bound of the range of annual reports
	 * @param end the upper bound of the range of annual reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching annual reports
	 */
	@Override
	public List<AnnualReport> findByFINANCIAL_YEARS(String FINANCIAL_YEARS,
		int start, int end, OrderByComparator<AnnualReport> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINANCIAL_YEARS;
			finderArgs = new Object[] { FINANCIAL_YEARS };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FINANCIAL_YEARS;
			finderArgs = new Object[] {
					FINANCIAL_YEARS,
					
					start, end, orderByComparator
				};
		}

		List<AnnualReport> list = null;

		if (retrieveFromCache) {
			list = (List<AnnualReport>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AnnualReport annualReport : list) {
					if (!Objects.equals(FINANCIAL_YEARS,
								annualReport.getFINANCIAL_YEARS())) {
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

			query.append(_SQL_SELECT_ANNUALREPORT_WHERE);

			boolean bindFINANCIAL_YEARS = false;

			if (FINANCIAL_YEARS == null) {
				query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_1);
			}
			else if (FINANCIAL_YEARS.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_3);
			}
			else {
				bindFINANCIAL_YEARS = true;

				query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(AnnualReportModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFINANCIAL_YEARS) {
					qPos.add(FINANCIAL_YEARS);
				}

				if (!pagination) {
					list = (List<AnnualReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AnnualReport>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annual report
	 * @throws NoSuchAnnualReportException if a matching annual report could not be found
	 */
	@Override
	public AnnualReport findByFINANCIAL_YEARS_First(String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator)
		throws NoSuchAnnualReportException {
		AnnualReport annualReport = fetchByFINANCIAL_YEARS_First(FINANCIAL_YEARS,
				orderByComparator);

		if (annualReport != null) {
			return annualReport;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FINANCIAL_YEARS=");
		msg.append(FINANCIAL_YEARS);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnnualReportException(msg.toString());
	}

	/**
	 * Returns the first annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching annual report, or <code>null</code> if a matching annual report could not be found
	 */
	@Override
	public AnnualReport fetchByFINANCIAL_YEARS_First(String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator) {
		List<AnnualReport> list = findByFINANCIAL_YEARS(FINANCIAL_YEARS, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annual report
	 * @throws NoSuchAnnualReportException if a matching annual report could not be found
	 */
	@Override
	public AnnualReport findByFINANCIAL_YEARS_Last(String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator)
		throws NoSuchAnnualReportException {
		AnnualReport annualReport = fetchByFINANCIAL_YEARS_Last(FINANCIAL_YEARS,
				orderByComparator);

		if (annualReport != null) {
			return annualReport;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("FINANCIAL_YEARS=");
		msg.append(FINANCIAL_YEARS);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchAnnualReportException(msg.toString());
	}

	/**
	 * Returns the last annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching annual report, or <code>null</code> if a matching annual report could not be found
	 */
	@Override
	public AnnualReport fetchByFINANCIAL_YEARS_Last(String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator) {
		int count = countByFINANCIAL_YEARS(FINANCIAL_YEARS);

		if (count == 0) {
			return null;
		}

		List<AnnualReport> list = findByFINANCIAL_YEARS(FINANCIAL_YEARS,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the annual reports before and after the current annual report in the ordered set where FINANCIAL_YEARS = &#63;.
	 *
	 * @param SRNO the primary key of the current annual report
	 * @param FINANCIAL_YEARS the financial_years
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next annual report
	 * @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	 */
	@Override
	public AnnualReport[] findByFINANCIAL_YEARS_PrevAndNext(long SRNO,
		String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator)
		throws NoSuchAnnualReportException {
		AnnualReport annualReport = findByPrimaryKey(SRNO);

		Session session = null;

		try {
			session = openSession();

			AnnualReport[] array = new AnnualReportImpl[3];

			array[0] = getByFINANCIAL_YEARS_PrevAndNext(session, annualReport,
					FINANCIAL_YEARS, orderByComparator, true);

			array[1] = annualReport;

			array[2] = getByFINANCIAL_YEARS_PrevAndNext(session, annualReport,
					FINANCIAL_YEARS, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected AnnualReport getByFINANCIAL_YEARS_PrevAndNext(Session session,
		AnnualReport annualReport, String FINANCIAL_YEARS,
		OrderByComparator<AnnualReport> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ANNUALREPORT_WHERE);

		boolean bindFINANCIAL_YEARS = false;

		if (FINANCIAL_YEARS == null) {
			query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_1);
		}
		else if (FINANCIAL_YEARS.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_3);
		}
		else {
			bindFINANCIAL_YEARS = true;

			query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_2);
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
			query.append(AnnualReportModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindFINANCIAL_YEARS) {
			qPos.add(FINANCIAL_YEARS);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(annualReport);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<AnnualReport> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the annual reports where FINANCIAL_YEARS = &#63; from the database.
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 */
	@Override
	public void removeByFINANCIAL_YEARS(String FINANCIAL_YEARS) {
		for (AnnualReport annualReport : findByFINANCIAL_YEARS(
				FINANCIAL_YEARS, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(annualReport);
		}
	}

	/**
	 * Returns the number of annual reports where FINANCIAL_YEARS = &#63;.
	 *
	 * @param FINANCIAL_YEARS the financial_years
	 * @return the number of matching annual reports
	 */
	@Override
	public int countByFINANCIAL_YEARS(String FINANCIAL_YEARS) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FINANCIAL_YEARS;

		Object[] finderArgs = new Object[] { FINANCIAL_YEARS };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ANNUALREPORT_WHERE);

			boolean bindFINANCIAL_YEARS = false;

			if (FINANCIAL_YEARS == null) {
				query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_1);
			}
			else if (FINANCIAL_YEARS.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_3);
			}
			else {
				bindFINANCIAL_YEARS = true;

				query.append(_FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindFINANCIAL_YEARS) {
					qPos.add(FINANCIAL_YEARS);
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

	private static final String _FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_1 =
		"annualReport.FINANCIAL_YEARS IS NULL";
	private static final String _FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_2 =
		"annualReport.FINANCIAL_YEARS = ?";
	private static final String _FINDER_COLUMN_FINANCIAL_YEARS_FINANCIAL_YEARS_3 =
		"(annualReport.FINANCIAL_YEARS IS NULL OR annualReport.FINANCIAL_YEARS = '')";

	public AnnualReportPersistenceImpl() {
		setModelClass(AnnualReport.class);
	}

	/**
	 * Caches the annual report in the entity cache if it is enabled.
	 *
	 * @param annualReport the annual report
	 */
	@Override
	public void cacheResult(AnnualReport annualReport) {
		entityCache.putResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportImpl.class, annualReport.getPrimaryKey(), annualReport);

		annualReport.resetOriginalValues();
	}

	/**
	 * Caches the annual reports in the entity cache if it is enabled.
	 *
	 * @param annualReports the annual reports
	 */
	@Override
	public void cacheResult(List<AnnualReport> annualReports) {
		for (AnnualReport annualReport : annualReports) {
			if (entityCache.getResult(
						AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
						AnnualReportImpl.class, annualReport.getPrimaryKey()) == null) {
				cacheResult(annualReport);
			}
			else {
				annualReport.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all annual reports.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AnnualReportImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the annual report.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AnnualReport annualReport) {
		entityCache.removeResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportImpl.class, annualReport.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<AnnualReport> annualReports) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AnnualReport annualReport : annualReports) {
			entityCache.removeResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
				AnnualReportImpl.class, annualReport.getPrimaryKey());
		}
	}

	/**
	 * Creates a new annual report with the primary key. Does not add the annual report to the database.
	 *
	 * @param SRNO the primary key for the new annual report
	 * @return the new annual report
	 */
	@Override
	public AnnualReport create(long SRNO) {
		AnnualReport annualReport = new AnnualReportImpl();

		annualReport.setNew(true);
		annualReport.setPrimaryKey(SRNO);

		return annualReport;
	}

	/**
	 * Removes the annual report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param SRNO the primary key of the annual report
	 * @return the annual report that was removed
	 * @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	 */
	@Override
	public AnnualReport remove(long SRNO) throws NoSuchAnnualReportException {
		return remove((Serializable)SRNO);
	}

	/**
	 * Removes the annual report with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the annual report
	 * @return the annual report that was removed
	 * @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	 */
	@Override
	public AnnualReport remove(Serializable primaryKey)
		throws NoSuchAnnualReportException {
		Session session = null;

		try {
			session = openSession();

			AnnualReport annualReport = (AnnualReport)session.get(AnnualReportImpl.class,
					primaryKey);

			if (annualReport == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAnnualReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(annualReport);
		}
		catch (NoSuchAnnualReportException nsee) {
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
	protected AnnualReport removeImpl(AnnualReport annualReport) {
		annualReport = toUnwrappedModel(annualReport);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(annualReport)) {
				annualReport = (AnnualReport)session.get(AnnualReportImpl.class,
						annualReport.getPrimaryKeyObj());
			}

			if (annualReport != null) {
				session.delete(annualReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (annualReport != null) {
			clearCache(annualReport);
		}

		return annualReport;
	}

	@Override
	public AnnualReport updateImpl(AnnualReport annualReport) {
		annualReport = toUnwrappedModel(annualReport);

		boolean isNew = annualReport.isNew();

		AnnualReportModelImpl annualReportModelImpl = (AnnualReportModelImpl)annualReport;

		Session session = null;

		try {
			session = openSession();

			if (annualReport.isNew()) {
				session.save(annualReport);

				annualReport.setNew(false);
			}
			else {
				annualReport = (AnnualReport)session.merge(annualReport);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!AnnualReportModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					annualReportModelImpl.getFINANCIAL_YEARS()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_FINANCIAL_YEARS, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINANCIAL_YEARS,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((annualReportModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINANCIAL_YEARS.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						annualReportModelImpl.getOriginalFINANCIAL_YEARS()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FINANCIAL_YEARS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINANCIAL_YEARS,
					args);

				args = new Object[] { annualReportModelImpl.getFINANCIAL_YEARS() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_FINANCIAL_YEARS,
					args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FINANCIAL_YEARS,
					args);
			}
		}

		entityCache.putResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
			AnnualReportImpl.class, annualReport.getPrimaryKey(), annualReport,
			false);

		annualReport.resetOriginalValues();

		return annualReport;
	}

	protected AnnualReport toUnwrappedModel(AnnualReport annualReport) {
		if (annualReport instanceof AnnualReportImpl) {
			return annualReport;
		}

		AnnualReportImpl annualReportImpl = new AnnualReportImpl();

		annualReportImpl.setNew(annualReport.isNew());
		annualReportImpl.setPrimaryKey(annualReport.getPrimaryKey());

		annualReportImpl.setSRNO(annualReport.getSRNO());
		annualReportImpl.setFINANCIAL_YEARS(annualReport.getFINANCIAL_YEARS());
		annualReportImpl.setFINANCIALDATA(annualReport.getFINANCIALDATA());
		annualReportImpl.setFINANCIAL_DATALINK(annualReport.getFINANCIAL_DATALINK());

		return annualReportImpl;
	}

	/**
	 * Returns the annual report with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the annual report
	 * @return the annual report
	 * @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	 */
	@Override
	public AnnualReport findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAnnualReportException {
		AnnualReport annualReport = fetchByPrimaryKey(primaryKey);

		if (annualReport == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAnnualReportException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return annualReport;
	}

	/**
	 * Returns the annual report with the primary key or throws a {@link NoSuchAnnualReportException} if it could not be found.
	 *
	 * @param SRNO the primary key of the annual report
	 * @return the annual report
	 * @throws NoSuchAnnualReportException if a annual report with the primary key could not be found
	 */
	@Override
	public AnnualReport findByPrimaryKey(long SRNO)
		throws NoSuchAnnualReportException {
		return findByPrimaryKey((Serializable)SRNO);
	}

	/**
	 * Returns the annual report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the annual report
	 * @return the annual report, or <code>null</code> if a annual report with the primary key could not be found
	 */
	@Override
	public AnnualReport fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
				AnnualReportImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AnnualReport annualReport = (AnnualReport)serializable;

		if (annualReport == null) {
			Session session = null;

			try {
				session = openSession();

				annualReport = (AnnualReport)session.get(AnnualReportImpl.class,
						primaryKey);

				if (annualReport != null) {
					cacheResult(annualReport);
				}
				else {
					entityCache.putResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
						AnnualReportImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
					AnnualReportImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return annualReport;
	}

	/**
	 * Returns the annual report with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param SRNO the primary key of the annual report
	 * @return the annual report, or <code>null</code> if a annual report with the primary key could not be found
	 */
	@Override
	public AnnualReport fetchByPrimaryKey(long SRNO) {
		return fetchByPrimaryKey((Serializable)SRNO);
	}

	@Override
	public Map<Serializable, AnnualReport> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AnnualReport> map = new HashMap<Serializable, AnnualReport>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AnnualReport annualReport = fetchByPrimaryKey(primaryKey);

			if (annualReport != null) {
				map.put(primaryKey, annualReport);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
					AnnualReportImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AnnualReport)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ANNUALREPORT_WHERE_PKS_IN);

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

			for (AnnualReport annualReport : (List<AnnualReport>)q.list()) {
				map.put(annualReport.getPrimaryKeyObj(), annualReport);

				cacheResult(annualReport);

				uncachedPrimaryKeys.remove(annualReport.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AnnualReportModelImpl.ENTITY_CACHE_ENABLED,
					AnnualReportImpl.class, primaryKey, nullModel);
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
	 * Returns all the annual reports.
	 *
	 * @return the annual reports
	 */
	@Override
	public List<AnnualReport> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the annual reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of annual reports
	 * @param end the upper bound of the range of annual reports (not inclusive)
	 * @return the range of annual reports
	 */
	@Override
	public List<AnnualReport> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the annual reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of annual reports
	 * @param end the upper bound of the range of annual reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of annual reports
	 */
	@Override
	public List<AnnualReport> findAll(int start, int end,
		OrderByComparator<AnnualReport> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the annual reports.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AnnualReportModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of annual reports
	 * @param end the upper bound of the range of annual reports (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of annual reports
	 */
	@Override
	public List<AnnualReport> findAll(int start, int end,
		OrderByComparator<AnnualReport> orderByComparator,
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

		List<AnnualReport> list = null;

		if (retrieveFromCache) {
			list = (List<AnnualReport>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ANNUALREPORT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ANNUALREPORT;

				if (pagination) {
					sql = sql.concat(AnnualReportModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AnnualReport>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AnnualReport>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the annual reports from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AnnualReport annualReport : findAll()) {
			remove(annualReport);
		}
	}

	/**
	 * Returns the number of annual reports.
	 *
	 * @return the number of annual reports
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ANNUALREPORT);

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
		return AnnualReportModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the annual report persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AnnualReportImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ANNUALREPORT = "SELECT annualReport FROM AnnualReport annualReport";
	private static final String _SQL_SELECT_ANNUALREPORT_WHERE_PKS_IN = "SELECT annualReport FROM AnnualReport annualReport WHERE SRNO IN (";
	private static final String _SQL_SELECT_ANNUALREPORT_WHERE = "SELECT annualReport FROM AnnualReport annualReport WHERE ";
	private static final String _SQL_COUNT_ANNUALREPORT = "SELECT COUNT(annualReport) FROM AnnualReport annualReport";
	private static final String _SQL_COUNT_ANNUALREPORT_WHERE = "SELECT COUNT(annualReport) FROM AnnualReport annualReport WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "annualReport.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AnnualReport exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AnnualReport exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AnnualReportPersistenceImpl.class);
}