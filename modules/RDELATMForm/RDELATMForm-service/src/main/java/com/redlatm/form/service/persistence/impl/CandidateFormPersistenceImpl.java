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

package com.redlatm.form.service.persistence.impl;

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

import com.redlatm.form.exception.NoSuchCandidateFormException;
import com.redlatm.form.model.CandidateForm;
import com.redlatm.form.model.impl.CandidateFormImpl;
import com.redlatm.form.model.impl.CandidateFormModelImpl;
import com.redlatm.form.service.persistence.CandidateFormPersistence;

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
 * The persistence implementation for the candidate form service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Mukesh,Vipin
 * @see CandidateFormPersistence
 * @see com.redlatm.form.service.persistence.CandidateFormUtil
 * @generated
 */
@ProviderType
public class CandidateFormPersistenceImpl extends BasePersistenceImpl<CandidateForm>
	implements CandidateFormPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link CandidateFormUtil} to access the candidate form persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = CandidateFormImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormModelImpl.FINDER_CACHE_ENABLED,
			CandidateFormImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormModelImpl.FINDER_CACHE_ENABLED,
			CandidateFormImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAILID = new FinderPath(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormModelImpl.FINDER_CACHE_ENABLED,
			CandidateFormImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByemailId",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILID =
		new FinderPath(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormModelImpl.FINDER_CACHE_ENABLED,
			CandidateFormImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByemailId", new String[] { String.class.getName() },
			CandidateFormModelImpl.EMAILADDRESS_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMAILID = new FinderPath(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByemailId",
			new String[] { String.class.getName() });

	/**
	 * Returns all the candidate forms where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @return the matching candidate forms
	 */
	@Override
	public List<CandidateForm> findByemailId(String emailAddress) {
		return findByemailId(emailAddress, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the candidate forms where emailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emailAddress the email address
	 * @param start the lower bound of the range of candidate forms
	 * @param end the upper bound of the range of candidate forms (not inclusive)
	 * @return the range of matching candidate forms
	 */
	@Override
	public List<CandidateForm> findByemailId(String emailAddress, int start,
		int end) {
		return findByemailId(emailAddress, start, end, null);
	}

	/**
	 * Returns an ordered range of all the candidate forms where emailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emailAddress the email address
	 * @param start the lower bound of the range of candidate forms
	 * @param end the upper bound of the range of candidate forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching candidate forms
	 */
	@Override
	public List<CandidateForm> findByemailId(String emailAddress, int start,
		int end, OrderByComparator<CandidateForm> orderByComparator) {
		return findByemailId(emailAddress, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the candidate forms where emailAddress = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param emailAddress the email address
	 * @param start the lower bound of the range of candidate forms
	 * @param end the upper bound of the range of candidate forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of matching candidate forms
	 */
	@Override
	public List<CandidateForm> findByemailId(String emailAddress, int start,
		int end, OrderByComparator<CandidateForm> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILID;
			finderArgs = new Object[] { emailAddress };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMAILID;
			finderArgs = new Object[] {
					emailAddress,
					
					start, end, orderByComparator
				};
		}

		List<CandidateForm> list = null;

		if (retrieveFromCache) {
			list = (List<CandidateForm>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CandidateForm candidateForm : list) {
					if (!Objects.equals(emailAddress,
								candidateForm.getEmailAddress())) {
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

			query.append(_SQL_SELECT_CANDIDATEFORM_WHERE);

			boolean bindEmailAddress = false;

			if (emailAddress == null) {
				query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_1);
			}
			else if (emailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_3);
			}
			else {
				bindEmailAddress = true;

				query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(CandidateFormModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmailAddress) {
					qPos.add(emailAddress);
				}

				if (!pagination) {
					list = (List<CandidateForm>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CandidateForm>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first candidate form in the ordered set where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching candidate form
	 * @throws NoSuchCandidateFormException if a matching candidate form could not be found
	 */
	@Override
	public CandidateForm findByemailId_First(String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator)
		throws NoSuchCandidateFormException {
		CandidateForm candidateForm = fetchByemailId_First(emailAddress,
				orderByComparator);

		if (candidateForm != null) {
			return candidateForm;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emailAddress=");
		msg.append(emailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCandidateFormException(msg.toString());
	}

	/**
	 * Returns the first candidate form in the ordered set where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching candidate form, or <code>null</code> if a matching candidate form could not be found
	 */
	@Override
	public CandidateForm fetchByemailId_First(String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator) {
		List<CandidateForm> list = findByemailId(emailAddress, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last candidate form in the ordered set where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching candidate form
	 * @throws NoSuchCandidateFormException if a matching candidate form could not be found
	 */
	@Override
	public CandidateForm findByemailId_Last(String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator)
		throws NoSuchCandidateFormException {
		CandidateForm candidateForm = fetchByemailId_Last(emailAddress,
				orderByComparator);

		if (candidateForm != null) {
			return candidateForm;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("emailAddress=");
		msg.append(emailAddress);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchCandidateFormException(msg.toString());
	}

	/**
	 * Returns the last candidate form in the ordered set where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching candidate form, or <code>null</code> if a matching candidate form could not be found
	 */
	@Override
	public CandidateForm fetchByemailId_Last(String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator) {
		int count = countByemailId(emailAddress);

		if (count == 0) {
			return null;
		}

		List<CandidateForm> list = findByemailId(emailAddress, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the candidate forms before and after the current candidate form in the ordered set where emailAddress = &#63;.
	 *
	 * @param CaId the primary key of the current candidate form
	 * @param emailAddress the email address
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next candidate form
	 * @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	 */
	@Override
	public CandidateForm[] findByemailId_PrevAndNext(long CaId,
		String emailAddress, OrderByComparator<CandidateForm> orderByComparator)
		throws NoSuchCandidateFormException {
		CandidateForm candidateForm = findByPrimaryKey(CaId);

		Session session = null;

		try {
			session = openSession();

			CandidateForm[] array = new CandidateFormImpl[3];

			array[0] = getByemailId_PrevAndNext(session, candidateForm,
					emailAddress, orderByComparator, true);

			array[1] = candidateForm;

			array[2] = getByemailId_PrevAndNext(session, candidateForm,
					emailAddress, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected CandidateForm getByemailId_PrevAndNext(Session session,
		CandidateForm candidateForm, String emailAddress,
		OrderByComparator<CandidateForm> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_CANDIDATEFORM_WHERE);

		boolean bindEmailAddress = false;

		if (emailAddress == null) {
			query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_1);
		}
		else if (emailAddress.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_3);
		}
		else {
			bindEmailAddress = true;

			query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_2);
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
			query.append(CandidateFormModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindEmailAddress) {
			qPos.add(emailAddress);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(candidateForm);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<CandidateForm> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the candidate forms where emailAddress = &#63; from the database.
	 *
	 * @param emailAddress the email address
	 */
	@Override
	public void removeByemailId(String emailAddress) {
		for (CandidateForm candidateForm : findByemailId(emailAddress,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(candidateForm);
		}
	}

	/**
	 * Returns the number of candidate forms where emailAddress = &#63;.
	 *
	 * @param emailAddress the email address
	 * @return the number of matching candidate forms
	 */
	@Override
	public int countByemailId(String emailAddress) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMAILID;

		Object[] finderArgs = new Object[] { emailAddress };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_CANDIDATEFORM_WHERE);

			boolean bindEmailAddress = false;

			if (emailAddress == null) {
				query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_1);
			}
			else if (emailAddress.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_3);
			}
			else {
				bindEmailAddress = true;

				query.append(_FINDER_COLUMN_EMAILID_EMAILADDRESS_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmailAddress) {
					qPos.add(emailAddress);
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

	private static final String _FINDER_COLUMN_EMAILID_EMAILADDRESS_1 = "candidateForm.emailAddress IS NULL";
	private static final String _FINDER_COLUMN_EMAILID_EMAILADDRESS_2 = "candidateForm.emailAddress = ?";
	private static final String _FINDER_COLUMN_EMAILID_EMAILADDRESS_3 = "(candidateForm.emailAddress IS NULL OR candidateForm.emailAddress = '')";

	public CandidateFormPersistenceImpl() {
		setModelClass(CandidateForm.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("CaId", "CA_ID");
			dbColumnNames.put("password", "password_");
			dbColumnNames.put("state", "state_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the candidate form in the entity cache if it is enabled.
	 *
	 * @param candidateForm the candidate form
	 */
	@Override
	public void cacheResult(CandidateForm candidateForm) {
		entityCache.putResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormImpl.class, candidateForm.getPrimaryKey(),
			candidateForm);

		candidateForm.resetOriginalValues();
	}

	/**
	 * Caches the candidate forms in the entity cache if it is enabled.
	 *
	 * @param candidateForms the candidate forms
	 */
	@Override
	public void cacheResult(List<CandidateForm> candidateForms) {
		for (CandidateForm candidateForm : candidateForms) {
			if (entityCache.getResult(
						CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
						CandidateFormImpl.class, candidateForm.getPrimaryKey()) == null) {
				cacheResult(candidateForm);
			}
			else {
				candidateForm.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all candidate forms.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CandidateFormImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the candidate form.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CandidateForm candidateForm) {
		entityCache.removeResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormImpl.class, candidateForm.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<CandidateForm> candidateForms) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (CandidateForm candidateForm : candidateForms) {
			entityCache.removeResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
				CandidateFormImpl.class, candidateForm.getPrimaryKey());
		}
	}

	/**
	 * Creates a new candidate form with the primary key. Does not add the candidate form to the database.
	 *
	 * @param CaId the primary key for the new candidate form
	 * @return the new candidate form
	 */
	@Override
	public CandidateForm create(long CaId) {
		CandidateForm candidateForm = new CandidateFormImpl();

		candidateForm.setNew(true);
		candidateForm.setPrimaryKey(CaId);

		return candidateForm;
	}

	/**
	 * Removes the candidate form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CaId the primary key of the candidate form
	 * @return the candidate form that was removed
	 * @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	 */
	@Override
	public CandidateForm remove(long CaId) throws NoSuchCandidateFormException {
		return remove((Serializable)CaId);
	}

	/**
	 * Removes the candidate form with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the candidate form
	 * @return the candidate form that was removed
	 * @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	 */
	@Override
	public CandidateForm remove(Serializable primaryKey)
		throws NoSuchCandidateFormException {
		Session session = null;

		try {
			session = openSession();

			CandidateForm candidateForm = (CandidateForm)session.get(CandidateFormImpl.class,
					primaryKey);

			if (candidateForm == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCandidateFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(candidateForm);
		}
		catch (NoSuchCandidateFormException nsee) {
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
	protected CandidateForm removeImpl(CandidateForm candidateForm) {
		candidateForm = toUnwrappedModel(candidateForm);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(candidateForm)) {
				candidateForm = (CandidateForm)session.get(CandidateFormImpl.class,
						candidateForm.getPrimaryKeyObj());
			}

			if (candidateForm != null) {
				session.delete(candidateForm);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (candidateForm != null) {
			clearCache(candidateForm);
		}

		return candidateForm;
	}

	@Override
	public CandidateForm updateImpl(CandidateForm candidateForm) {
		candidateForm = toUnwrappedModel(candidateForm);

		boolean isNew = candidateForm.isNew();

		CandidateFormModelImpl candidateFormModelImpl = (CandidateFormModelImpl)candidateForm;

		Session session = null;

		try {
			session = openSession();

			if (candidateForm.isNew()) {
				session.save(candidateForm);

				candidateForm.setNew(false);
			}
			else {
				candidateForm = (CandidateForm)session.merge(candidateForm);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!CandidateFormModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					candidateFormModelImpl.getEmailAddress()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EMAILID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((candidateFormModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						candidateFormModelImpl.getOriginalEmailAddress()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMAILID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILID,
					args);

				args = new Object[] { candidateFormModelImpl.getEmailAddress() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_EMAILID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMAILID,
					args);
			}
		}

		entityCache.putResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
			CandidateFormImpl.class, candidateForm.getPrimaryKey(),
			candidateForm, false);

		candidateForm.resetOriginalValues();

		return candidateForm;
	}

	protected CandidateForm toUnwrappedModel(CandidateForm candidateForm) {
		if (candidateForm instanceof CandidateFormImpl) {
			return candidateForm;
		}

		CandidateFormImpl candidateFormImpl = new CandidateFormImpl();

		candidateFormImpl.setNew(candidateForm.isNew());
		candidateFormImpl.setPrimaryKey(candidateForm.getPrimaryKey());

		candidateFormImpl.setCaId(candidateForm.getCaId());
		candidateFormImpl.setFirstName(candidateForm.getFirstName());
		candidateFormImpl.setSurname(candidateForm.getSurname());
		candidateFormImpl.setPassword(candidateForm.getPassword());
		candidateFormImpl.setFather_SpouseName(candidateForm.getFather_SpouseName());
		candidateFormImpl.setAadharCardNo(candidateForm.getAadharCardNo());
		candidateFormImpl.setPanCardNo(candidateForm.getPanCardNo());
		candidateFormImpl.setBankAccountNo(candidateForm.getBankAccountNo());
		candidateFormImpl.setEmploymentExRegnNo(candidateForm.getEmploymentExRegnNo());
		candidateFormImpl.setDateOfBirth(candidateForm.getDateOfBirth());
		candidateFormImpl.setNativeLocation(candidateForm.getNativeLocation());
		candidateFormImpl.setMotherTongue(candidateForm.getMotherTongue());
		candidateFormImpl.setIdentificationMark(candidateForm.getIdentificationMark());
		candidateFormImpl.setDomicile(candidateForm.getDomicile());
		candidateFormImpl.setLanguagesKnown(candidateForm.getLanguagesKnown());
		candidateFormImpl.setRelCompany(candidateForm.getRelCompany());
		candidateFormImpl.setRelLocation(candidateForm.getRelLocation());
		candidateFormImpl.setRelRole(candidateForm.getRelRole());
		candidateFormImpl.setRelFromDate(candidateForm.getRelFromDate());
		candidateFormImpl.setRelToDate(candidateForm.getRelToDate());
		candidateFormImpl.setRelLeavingReason(candidateForm.getRelLeavingReason());
		candidateFormImpl.setHandicapDetail(candidateForm.getHandicapDetail());
		candidateFormImpl.setReligion(candidateForm.getReligion());
		candidateFormImpl.setCaste(candidateForm.getCaste());
		candidateFormImpl.setSubCaste(candidateForm.getSubCaste());
		candidateFormImpl.setMaritalStatus(candidateForm.getMaritalStatus());
		candidateFormImpl.setAbleToJoin(candidateForm.getAbleToJoin());
		candidateFormImpl.setAbleToDays(candidateForm.getAbleToDays());
		candidateFormImpl.setAbleToMonth(candidateForm.getAbleToMonth());
		candidateFormImpl.setAddress(candidateForm.getAddress());
		candidateFormImpl.setCity(candidateForm.getCity());
		candidateFormImpl.setState(candidateForm.getState());
		candidateFormImpl.setPin(candidateForm.getPin());
		candidateFormImpl.setEmailAddress(candidateForm.getEmailAddress());
		candidateFormImpl.setAlternateEmailID(candidateForm.getAlternateEmailID());
		candidateFormImpl.setMobile(candidateForm.getMobile());
		candidateFormImpl.setAlternateMobile(candidateForm.getAlternateMobile());
		candidateFormImpl.setPersonAlternateNoGiven(candidateForm.getPersonAlternateNoGiven());
		candidateFormImpl.setMainQualification(candidateForm.getMainQualification());
		candidateFormImpl.setSpecialization(candidateForm.getSpecialization());
		candidateFormImpl.setTrade(candidateForm.getTrade());
		candidateFormImpl.setTotalYrExperience(candidateForm.getTotalYrExperience());
		candidateFormImpl.setSkill_Proficiency(candidateForm.getSkill_Proficiency());
		candidateFormImpl.setSECURITYCLEARFROM(candidateForm.getSECURITYCLEARFROM());
		candidateFormImpl.setSECURITYCLEARTILL(candidateForm.getSECURITYCLEARTILL());
		candidateFormImpl.setMEDICALFITDOCNAME(candidateForm.getMEDICALFITDOCNAME());
		candidateFormImpl.setMEDICALFITDOCADDR(candidateForm.getMEDICALFITDOCADDR());
		candidateFormImpl.setMEDICALFITDOCREGNNO(candidateForm.getMEDICALFITDOCREGNNO());
		candidateFormImpl.setMEDICALFITDOCTILL(candidateForm.getMEDICALFITDOCTILL());
		candidateFormImpl.setCurrentCompanyName(candidateForm.getCurrentCompanyName());
		candidateFormImpl.setCurrentCompanyAddress(candidateForm.getCurrentCompanyAddress());
		candidateFormImpl.setWorkingSinceDate(candidateForm.getWorkingSinceDate());
		candidateFormImpl.setDesignation(candidateForm.getDesignation());
		candidateFormImpl.setCTCFixed(candidateForm.getCTCFixed());
		candidateFormImpl.setCTCVariable(candidateForm.getCTCVariable());
		candidateFormImpl.setCTCTotal(candidateForm.getCTCTotal());
		candidateFormImpl.setRole(candidateForm.getRole());
		candidateFormImpl.setLocation(candidateForm.getLocation());
		candidateFormImpl.setNoticePeriod(candidateForm.getNoticePeriod());
		candidateFormImpl.setFirstCompanyName(candidateForm.getFirstCompanyName());
		candidateFormImpl.setFirstFromDate(candidateForm.getFirstFromDate());
		candidateFormImpl.setFirstToDate(candidateForm.getFirstToDate());
		candidateFormImpl.setFirstCLocation(candidateForm.getFirstCLocation());
		candidateFormImpl.setFirstCDesignation(candidateForm.getFirstCDesignation());
		candidateFormImpl.setFirstFixedCTC(candidateForm.getFirstFixedCTC());
		candidateFormImpl.setFirstVariableCTC(candidateForm.getFirstVariableCTC());
		candidateFormImpl.setFirstTotalCTC(candidateForm.getFirstTotalCTC());
		candidateFormImpl.setFirstRemarkIfAny(candidateForm.getFirstRemarkIfAny());
		candidateFormImpl.setSecoundCompanyName(candidateForm.getSecoundCompanyName());
		candidateFormImpl.setSecoundFromDate(candidateForm.getSecoundFromDate());
		candidateFormImpl.setSecoundToDate(candidateForm.getSecoundToDate());
		candidateFormImpl.setSecoundCLocation(candidateForm.getSecoundCLocation());
		candidateFormImpl.setSecoundCDesignation(candidateForm.getSecoundCDesignation());
		candidateFormImpl.setSecoundFixedCTC(candidateForm.getSecoundFixedCTC());
		candidateFormImpl.setSecoundVariableCTC(candidateForm.getSecoundVariableCTC());
		candidateFormImpl.setSecoundTotalCTC(candidateForm.getSecoundTotalCTC());
		candidateFormImpl.setSecoundRemarkIfAny(candidateForm.getSecoundRemarkIfAny());
		candidateFormImpl.setThirdCompanyName(candidateForm.getThirdCompanyName());
		candidateFormImpl.setThirdFromDate(candidateForm.getThirdFromDate());
		candidateFormImpl.setThirdToDate(candidateForm.getThirdToDate());
		candidateFormImpl.setThirdCLocation(candidateForm.getThirdCLocation());
		candidateFormImpl.setThirdCDesignation(candidateForm.getThirdCDesignation());
		candidateFormImpl.setThirdFixedCTC(candidateForm.getThirdFixedCTC());
		candidateFormImpl.setThirdVariableCTC(candidateForm.getThirdVariableCTC());
		candidateFormImpl.setThirdTotalCTC(candidateForm.getThirdTotalCTC());
		candidateFormImpl.setThirdRemarkIfAny(candidateForm.getThirdRemarkIfAny());
		candidateFormImpl.setForthCompanyName(candidateForm.getForthCompanyName());
		candidateFormImpl.setForthFromDate(candidateForm.getForthFromDate());
		candidateFormImpl.setForthToDate(candidateForm.getForthToDate());
		candidateFormImpl.setForthCLocation(candidateForm.getForthCLocation());
		candidateFormImpl.setForthCDesignation(candidateForm.getForthCDesignation());
		candidateFormImpl.setForthFixedCTC(candidateForm.getForthFixedCTC());
		candidateFormImpl.setForthVariableCTC(candidateForm.getForthVariableCTC());
		candidateFormImpl.setForthTotalCTC(candidateForm.getForthTotalCTC());
		candidateFormImpl.setForthRemarkIfAny(candidateForm.getForthRemarkIfAny());
		candidateFormImpl.setFifthCompanyName(candidateForm.getFifthCompanyName());
		candidateFormImpl.setFifthFromDate(candidateForm.getFifthFromDate());
		candidateFormImpl.setFifthToDate(candidateForm.getFifthToDate());
		candidateFormImpl.setFifthCLocation(candidateForm.getFifthCLocation());
		candidateFormImpl.setFifthCDesignation(candidateForm.getFifthCDesignation());
		candidateFormImpl.setFifthFixedCTC(candidateForm.getFifthFixedCTC());
		candidateFormImpl.setFifthVariableCTC(candidateForm.getFifthVariableCTC());
		candidateFormImpl.setFifthTotalCTC(candidateForm.getFifthTotalCTC());
		candidateFormImpl.setFifthRemarkIfAny(candidateForm.getFifthRemarkIfAny());
		candidateFormImpl.setSSCQualification(candidateForm.getSSCQualification());
		candidateFormImpl.setSSCUniversityInstitute(candidateForm.getSSCUniversityInstitute());
		candidateFormImpl.setSSCYearOfPassing(candidateForm.getSSCYearOfPassing());
		candidateFormImpl.setSSCGrade(candidateForm.getSSCGrade());
		candidateFormImpl.setHSCUniversityInstitute(candidateForm.getHSCUniversityInstitute());
		candidateFormImpl.setHSCQualification(candidateForm.getHSCQualification());
		candidateFormImpl.setHSCYearOfPassing(candidateForm.getHSCYearOfPassing());
		candidateFormImpl.setHSCGrade(candidateForm.getHSCGrade());
		candidateFormImpl.setGradUniversityInstitute(candidateForm.getGradUniversityInstitute());
		candidateFormImpl.setGradQualification(candidateForm.getGradQualification());
		candidateFormImpl.setGradYearOfPassing(candidateForm.getGradYearOfPassing());
		candidateFormImpl.setGradGrade(candidateForm.getGradGrade());
		candidateFormImpl.setPGUniversityInstitute(candidateForm.getPGUniversityInstitute());
		candidateFormImpl.setPGQualification(candidateForm.getPGQualification());
		candidateFormImpl.setPGYearOfPassing(candidateForm.getPGYearOfPassing());
		candidateFormImpl.setPGGrade(candidateForm.getPGGrade());
		candidateFormImpl.setPhDUniversityInstitute(candidateForm.getPhDUniversityInstitute());
		candidateFormImpl.setPhDQualification(candidateForm.getPhDQualification());
		candidateFormImpl.setPhDYearOfPassing(candidateForm.getPhDYearOfPassing());
		candidateFormImpl.setPhDGrade(candidateForm.getPhDGrade());
		candidateFormImpl.setOther1UniversityInstitute(candidateForm.getOther1UniversityInstitute());
		candidateFormImpl.setOther1Qualification(candidateForm.getOther1Qualification());
		candidateFormImpl.setOther1YearOfPassing(candidateForm.getOther1YearOfPassing());
		candidateFormImpl.setOther1Grade(candidateForm.getOther1Grade());
		candidateFormImpl.setOther2UniversityInstitute(candidateForm.getOther2UniversityInstitute());
		candidateFormImpl.setOther2Qualification(candidateForm.getOther2Qualification());
		candidateFormImpl.setOther2YearOfPassing(candidateForm.getOther2YearOfPassing());
		candidateFormImpl.setOther2Grade(candidateForm.getOther2Grade());
		candidateFormImpl.setOther3UniversityInstitute(candidateForm.getOther3UniversityInstitute());
		candidateFormImpl.setOther3Qualification(candidateForm.getOther3Qualification());
		candidateFormImpl.setOther3YearOfPassing(candidateForm.getOther3YearOfPassing());
		candidateFormImpl.setOther3Grade(candidateForm.getOther3Grade());
		candidateFormImpl.setUPLOADFILE(candidateForm.getUPLOADFILE());

		return candidateFormImpl;
	}

	/**
	 * Returns the candidate form with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the candidate form
	 * @return the candidate form
	 * @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	 */
	@Override
	public CandidateForm findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCandidateFormException {
		CandidateForm candidateForm = fetchByPrimaryKey(primaryKey);

		if (candidateForm == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCandidateFormException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return candidateForm;
	}

	/**
	 * Returns the candidate form with the primary key or throws a {@link NoSuchCandidateFormException} if it could not be found.
	 *
	 * @param CaId the primary key of the candidate form
	 * @return the candidate form
	 * @throws NoSuchCandidateFormException if a candidate form with the primary key could not be found
	 */
	@Override
	public CandidateForm findByPrimaryKey(long CaId)
		throws NoSuchCandidateFormException {
		return findByPrimaryKey((Serializable)CaId);
	}

	/**
	 * Returns the candidate form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the candidate form
	 * @return the candidate form, or <code>null</code> if a candidate form with the primary key could not be found
	 */
	@Override
	public CandidateForm fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
				CandidateFormImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		CandidateForm candidateForm = (CandidateForm)serializable;

		if (candidateForm == null) {
			Session session = null;

			try {
				session = openSession();

				candidateForm = (CandidateForm)session.get(CandidateFormImpl.class,
						primaryKey);

				if (candidateForm != null) {
					cacheResult(candidateForm);
				}
				else {
					entityCache.putResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
						CandidateFormImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
					CandidateFormImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return candidateForm;
	}

	/**
	 * Returns the candidate form with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CaId the primary key of the candidate form
	 * @return the candidate form, or <code>null</code> if a candidate form with the primary key could not be found
	 */
	@Override
	public CandidateForm fetchByPrimaryKey(long CaId) {
		return fetchByPrimaryKey((Serializable)CaId);
	}

	@Override
	public Map<Serializable, CandidateForm> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, CandidateForm> map = new HashMap<Serializable, CandidateForm>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			CandidateForm candidateForm = fetchByPrimaryKey(primaryKey);

			if (candidateForm != null) {
				map.put(primaryKey, candidateForm);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
					CandidateFormImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (CandidateForm)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_CANDIDATEFORM_WHERE_PKS_IN);

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

			for (CandidateForm candidateForm : (List<CandidateForm>)q.list()) {
				map.put(candidateForm.getPrimaryKeyObj(), candidateForm);

				cacheResult(candidateForm);

				uncachedPrimaryKeys.remove(candidateForm.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(CandidateFormModelImpl.ENTITY_CACHE_ENABLED,
					CandidateFormImpl.class, primaryKey, nullModel);
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
	 * Returns all the candidate forms.
	 *
	 * @return the candidate forms
	 */
	@Override
	public List<CandidateForm> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the candidate forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of candidate forms
	 * @param end the upper bound of the range of candidate forms (not inclusive)
	 * @return the range of candidate forms
	 */
	@Override
	public List<CandidateForm> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the candidate forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of candidate forms
	 * @param end the upper bound of the range of candidate forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of candidate forms
	 */
	@Override
	public List<CandidateForm> findAll(int start, int end,
		OrderByComparator<CandidateForm> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the candidate forms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of candidate forms
	 * @param end the upper bound of the range of candidate forms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of candidate forms
	 */
	@Override
	public List<CandidateForm> findAll(int start, int end,
		OrderByComparator<CandidateForm> orderByComparator,
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

		List<CandidateForm> list = null;

		if (retrieveFromCache) {
			list = (List<CandidateForm>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_CANDIDATEFORM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_CANDIDATEFORM;

				if (pagination) {
					sql = sql.concat(CandidateFormModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<CandidateForm>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<CandidateForm>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the candidate forms from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CandidateForm candidateForm : findAll()) {
			remove(candidateForm);
		}
	}

	/**
	 * Returns the number of candidate forms.
	 *
	 * @return the number of candidate forms
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_CANDIDATEFORM);

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
		return CandidateFormModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the candidate form persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(CandidateFormImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_CANDIDATEFORM = "SELECT candidateForm FROM CandidateForm candidateForm";
	private static final String _SQL_SELECT_CANDIDATEFORM_WHERE_PKS_IN = "SELECT candidateForm FROM CandidateForm candidateForm WHERE CA_ID IN (";
	private static final String _SQL_SELECT_CANDIDATEFORM_WHERE = "SELECT candidateForm FROM CandidateForm candidateForm WHERE ";
	private static final String _SQL_COUNT_CANDIDATEFORM = "SELECT COUNT(candidateForm) FROM CandidateForm candidateForm";
	private static final String _SQL_COUNT_CANDIDATEFORM_WHERE = "SELECT COUNT(candidateForm) FROM CandidateForm candidateForm WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "candidateForm.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CandidateForm exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CandidateForm exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(CandidateFormPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"CaId", "password", "state"
			});
}