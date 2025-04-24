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

package attendence.rinfra.services.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import attendence.rinfra.services.exception.NoSuchAttendenceTransactionException;
import attendence.rinfra.services.model.AttendenceTransaction;
import attendence.rinfra.services.model.impl.AttendenceTransactionImpl;
import attendence.rinfra.services.model.impl.AttendenceTransactionModelImpl;
import attendence.rinfra.services.service.persistence.AttendenceTransactionPersistence;

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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

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
 * The persistence implementation for the attendence transaction service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttendenceTransactionPersistence
 * @see attendence.rinfra.services.service.persistence.AttendenceTransactionUtil
 * @generated
 */
@ProviderType
public class AttendenceTransactionPersistenceImpl extends BasePersistenceImpl<AttendenceTransaction>
	implements AttendenceTransactionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link AttendenceTransactionUtil} to access the attendence transaction persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = AttendenceTransactionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionModelImpl.FINDER_CACHE_ENABLED,
			AttendenceTransactionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionModelImpl.FINDER_CACHE_ENABLED,
			AttendenceTransactionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_FETCH_BY_EMPLOYEECODE = new FinderPath(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionModelImpl.FINDER_CACHE_ENABLED,
			AttendenceTransactionImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByemployeeCode", new String[] { String.class.getName() },
			AttendenceTransactionModelImpl.EMPLOYEECODE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_EMPLOYEECODE = new FinderPath(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByemployeeCode",
			new String[] { String.class.getName() });

	/**
	 * Returns the attendence transaction where employeeCode = &#63; or throws a {@link NoSuchAttendenceTransactionException} if it could not be found.
	 *
	 * @param employeeCode the employee code
	 * @return the matching attendence transaction
	 * @throws NoSuchAttendenceTransactionException if a matching attendence transaction could not be found
	 */
	@Override
	public AttendenceTransaction findByemployeeCode(String employeeCode)
		throws NoSuchAttendenceTransactionException {
		AttendenceTransaction attendenceTransaction = fetchByemployeeCode(employeeCode);

		if (attendenceTransaction == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("employeeCode=");
			msg.append(employeeCode);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchAttendenceTransactionException(msg.toString());
		}

		return attendenceTransaction;
	}

	/**
	 * Returns the attendence transaction where employeeCode = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param employeeCode the employee code
	 * @return the matching attendence transaction, or <code>null</code> if a matching attendence transaction could not be found
	 */
	@Override
	public AttendenceTransaction fetchByemployeeCode(String employeeCode) {
		return fetchByemployeeCode(employeeCode, true);
	}

	/**
	 * Returns the attendence transaction where employeeCode = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param employeeCode the employee code
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching attendence transaction, or <code>null</code> if a matching attendence transaction could not be found
	 */
	@Override
	public AttendenceTransaction fetchByemployeeCode(String employeeCode,
		boolean retrieveFromCache) {
		Object[] finderArgs = new Object[] { employeeCode };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE,
					finderArgs, this);
		}

		if (result instanceof AttendenceTransaction) {
			AttendenceTransaction attendenceTransaction = (AttendenceTransaction)result;

			if (!Objects.equals(employeeCode,
						attendenceTransaction.getEmployeeCode())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_ATTENDENCETRANSACTION_WHERE);

			boolean bindEmployeeCode = false;

			if (employeeCode == null) {
				query.append(_FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_1);
			}
			else if (employeeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_3);
			}
			else {
				bindEmployeeCode = true;

				query.append(_FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmployeeCode) {
					qPos.add(employeeCode);
				}

				List<AttendenceTransaction> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"AttendenceTransactionPersistenceImpl.fetchByemployeeCode(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AttendenceTransaction attendenceTransaction = list.get(0);

					result = attendenceTransaction;

					cacheResult(attendenceTransaction);

					if ((attendenceTransaction.getEmployeeCode() == null) ||
							!attendenceTransaction.getEmployeeCode()
													  .equals(employeeCode)) {
						finderCache.putResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE,
							finderArgs, attendenceTransaction);
					}
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (AttendenceTransaction)result;
		}
	}

	/**
	 * Removes the attendence transaction where employeeCode = &#63; from the database.
	 *
	 * @param employeeCode the employee code
	 * @return the attendence transaction that was removed
	 */
	@Override
	public AttendenceTransaction removeByemployeeCode(String employeeCode)
		throws NoSuchAttendenceTransactionException {
		AttendenceTransaction attendenceTransaction = findByemployeeCode(employeeCode);

		return remove(attendenceTransaction);
	}

	/**
	 * Returns the number of attendence transactions where employeeCode = &#63;.
	 *
	 * @param employeeCode the employee code
	 * @return the number of matching attendence transactions
	 */
	@Override
	public int countByemployeeCode(String employeeCode) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPLOYEECODE;

		Object[] finderArgs = new Object[] { employeeCode };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ATTENDENCETRANSACTION_WHERE);

			boolean bindEmployeeCode = false;

			if (employeeCode == null) {
				query.append(_FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_1);
			}
			else if (employeeCode.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_3);
			}
			else {
				bindEmployeeCode = true;

				query.append(_FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindEmployeeCode) {
					qPos.add(employeeCode);
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

	private static final String _FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_1 = "attendenceTransaction.employeeCode IS NULL";
	private static final String _FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_2 = "attendenceTransaction.employeeCode = ?";
	private static final String _FINDER_COLUMN_EMPLOYEECODE_EMPLOYEECODE_3 = "(attendenceTransaction.employeeCode IS NULL OR attendenceTransaction.employeeCode = '')";

	public AttendenceTransactionPersistenceImpl() {
		setModelClass(AttendenceTransaction.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("srNo", "SRNO");
			dbColumnNames.put("employeeCode", "EMPLOYEE_CODE");
			dbColumnNames.put("employeeName", "EMPLOYEE_NAME");
			dbColumnNames.put("mobile", "MOBILE_NUMBER");
			dbColumnNames.put("userDefined1", "USER_DEFINED_1");
			dbColumnNames.put("userDefined2", "USER_DEFINED_2");
			dbColumnNames.put("attendenceMode", "ATTENDENCE_MODE");
			dbColumnNames.put("attendenceDateTime", "ATTENDENCE_DATETIME");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the attendence transaction in the entity cache if it is enabled.
	 *
	 * @param attendenceTransaction the attendence transaction
	 */
	@Override
	public void cacheResult(AttendenceTransaction attendenceTransaction) {
		entityCache.putResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionImpl.class,
			attendenceTransaction.getPrimaryKey(), attendenceTransaction);

		finderCache.putResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE,
			new Object[] { attendenceTransaction.getEmployeeCode() },
			attendenceTransaction);

		attendenceTransaction.resetOriginalValues();
	}

	/**
	 * Caches the attendence transactions in the entity cache if it is enabled.
	 *
	 * @param attendenceTransactions the attendence transactions
	 */
	@Override
	public void cacheResult(List<AttendenceTransaction> attendenceTransactions) {
		for (AttendenceTransaction attendenceTransaction : attendenceTransactions) {
			if (entityCache.getResult(
						AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
						AttendenceTransactionImpl.class,
						attendenceTransaction.getPrimaryKey()) == null) {
				cacheResult(attendenceTransaction);
			}
			else {
				attendenceTransaction.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all attendence transactions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AttendenceTransactionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the attendence transaction.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AttendenceTransaction attendenceTransaction) {
		entityCache.removeResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionImpl.class,
			attendenceTransaction.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((AttendenceTransactionModelImpl)attendenceTransaction,
			true);
	}

	@Override
	public void clearCache(List<AttendenceTransaction> attendenceTransactions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (AttendenceTransaction attendenceTransaction : attendenceTransactions) {
			entityCache.removeResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
				AttendenceTransactionImpl.class,
				attendenceTransaction.getPrimaryKey());

			clearUniqueFindersCache((AttendenceTransactionModelImpl)attendenceTransaction,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		AttendenceTransactionModelImpl attendenceTransactionModelImpl) {
		Object[] args = new Object[] {
				attendenceTransactionModelImpl.getEmployeeCode()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_EMPLOYEECODE, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE, args,
			attendenceTransactionModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		AttendenceTransactionModelImpl attendenceTransactionModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					attendenceTransactionModelImpl.getEmployeeCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEECODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE, args);
		}

		if ((attendenceTransactionModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_EMPLOYEECODE.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					attendenceTransactionModelImpl.getOriginalEmployeeCode()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_EMPLOYEECODE, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_EMPLOYEECODE, args);
		}
	}

	/**
	 * Creates a new attendence transaction with the primary key. Does not add the attendence transaction to the database.
	 *
	 * @param srNo the primary key for the new attendence transaction
	 * @return the new attendence transaction
	 */
	@Override
	public AttendenceTransaction create(String srNo) {
		AttendenceTransaction attendenceTransaction = new AttendenceTransactionImpl();

		attendenceTransaction.setNew(true);
		attendenceTransaction.setPrimaryKey(srNo);

		return attendenceTransaction;
	}

	/**
	 * Removes the attendence transaction with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param srNo the primary key of the attendence transaction
	 * @return the attendence transaction that was removed
	 * @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	 */
	@Override
	public AttendenceTransaction remove(String srNo)
		throws NoSuchAttendenceTransactionException {
		return remove((Serializable)srNo);
	}

	/**
	 * Removes the attendence transaction with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the attendence transaction
	 * @return the attendence transaction that was removed
	 * @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	 */
	@Override
	public AttendenceTransaction remove(Serializable primaryKey)
		throws NoSuchAttendenceTransactionException {
		Session session = null;

		try {
			session = openSession();

			AttendenceTransaction attendenceTransaction = (AttendenceTransaction)session.get(AttendenceTransactionImpl.class,
					primaryKey);

			if (attendenceTransaction == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAttendenceTransactionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(attendenceTransaction);
		}
		catch (NoSuchAttendenceTransactionException nsee) {
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
	protected AttendenceTransaction removeImpl(
		AttendenceTransaction attendenceTransaction) {
		attendenceTransaction = toUnwrappedModel(attendenceTransaction);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(attendenceTransaction)) {
				attendenceTransaction = (AttendenceTransaction)session.get(AttendenceTransactionImpl.class,
						attendenceTransaction.getPrimaryKeyObj());
			}

			if (attendenceTransaction != null) {
				session.delete(attendenceTransaction);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (attendenceTransaction != null) {
			clearCache(attendenceTransaction);
		}

		return attendenceTransaction;
	}

	@Override
	public AttendenceTransaction updateImpl(
		AttendenceTransaction attendenceTransaction) {
		attendenceTransaction = toUnwrappedModel(attendenceTransaction);

		boolean isNew = attendenceTransaction.isNew();

		AttendenceTransactionModelImpl attendenceTransactionModelImpl = (AttendenceTransactionModelImpl)attendenceTransaction;

		Session session = null;

		try {
			session = openSession();

			if (attendenceTransaction.isNew()) {
				session.save(attendenceTransaction);

				attendenceTransaction.setNew(false);
			}
			else {
				attendenceTransaction = (AttendenceTransaction)session.merge(attendenceTransaction);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!AttendenceTransactionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
			AttendenceTransactionImpl.class,
			attendenceTransaction.getPrimaryKey(), attendenceTransaction, false);

		clearUniqueFindersCache(attendenceTransactionModelImpl, false);
		cacheUniqueFindersCache(attendenceTransactionModelImpl);

		attendenceTransaction.resetOriginalValues();

		return attendenceTransaction;
	}

	protected AttendenceTransaction toUnwrappedModel(
		AttendenceTransaction attendenceTransaction) {
		if (attendenceTransaction instanceof AttendenceTransactionImpl) {
			return attendenceTransaction;
		}

		AttendenceTransactionImpl attendenceTransactionImpl = new AttendenceTransactionImpl();

		attendenceTransactionImpl.setNew(attendenceTransaction.isNew());
		attendenceTransactionImpl.setPrimaryKey(attendenceTransaction.getPrimaryKey());

		attendenceTransactionImpl.setSrNo(attendenceTransaction.getSrNo());
		attendenceTransactionImpl.setEmployeeCode(attendenceTransaction.getEmployeeCode());
		attendenceTransactionImpl.setEmployeeName(attendenceTransaction.getEmployeeName());
		attendenceTransactionImpl.setMobile(attendenceTransaction.getMobile());
		attendenceTransactionImpl.setUserDefined1(attendenceTransaction.getUserDefined1());
		attendenceTransactionImpl.setUserDefined2(attendenceTransaction.getUserDefined2());
		attendenceTransactionImpl.setAttendenceMode(attendenceTransaction.getAttendenceMode());
		attendenceTransactionImpl.setAttendenceDateTime(attendenceTransaction.getAttendenceDateTime());

		return attendenceTransactionImpl;
	}

	/**
	 * Returns the attendence transaction with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the attendence transaction
	 * @return the attendence transaction
	 * @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	 */
	@Override
	public AttendenceTransaction findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAttendenceTransactionException {
		AttendenceTransaction attendenceTransaction = fetchByPrimaryKey(primaryKey);

		if (attendenceTransaction == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAttendenceTransactionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return attendenceTransaction;
	}

	/**
	 * Returns the attendence transaction with the primary key or throws a {@link NoSuchAttendenceTransactionException} if it could not be found.
	 *
	 * @param srNo the primary key of the attendence transaction
	 * @return the attendence transaction
	 * @throws NoSuchAttendenceTransactionException if a attendence transaction with the primary key could not be found
	 */
	@Override
	public AttendenceTransaction findByPrimaryKey(String srNo)
		throws NoSuchAttendenceTransactionException {
		return findByPrimaryKey((Serializable)srNo);
	}

	/**
	 * Returns the attendence transaction with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the attendence transaction
	 * @return the attendence transaction, or <code>null</code> if a attendence transaction with the primary key could not be found
	 */
	@Override
	public AttendenceTransaction fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
				AttendenceTransactionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		AttendenceTransaction attendenceTransaction = (AttendenceTransaction)serializable;

		if (attendenceTransaction == null) {
			Session session = null;

			try {
				session = openSession();

				attendenceTransaction = (AttendenceTransaction)session.get(AttendenceTransactionImpl.class,
						primaryKey);

				if (attendenceTransaction != null) {
					cacheResult(attendenceTransaction);
				}
				else {
					entityCache.putResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
						AttendenceTransactionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
					AttendenceTransactionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return attendenceTransaction;
	}

	/**
	 * Returns the attendence transaction with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param srNo the primary key of the attendence transaction
	 * @return the attendence transaction, or <code>null</code> if a attendence transaction with the primary key could not be found
	 */
	@Override
	public AttendenceTransaction fetchByPrimaryKey(String srNo) {
		return fetchByPrimaryKey((Serializable)srNo);
	}

	@Override
	public Map<Serializable, AttendenceTransaction> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, AttendenceTransaction> map = new HashMap<Serializable, AttendenceTransaction>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			AttendenceTransaction attendenceTransaction = fetchByPrimaryKey(primaryKey);

			if (attendenceTransaction != null) {
				map.put(primaryKey, attendenceTransaction);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
					AttendenceTransactionImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (AttendenceTransaction)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ATTENDENCETRANSACTION_WHERE_PKS_IN);

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

			for (AttendenceTransaction attendenceTransaction : (List<AttendenceTransaction>)q.list()) {
				map.put(attendenceTransaction.getPrimaryKeyObj(),
					attendenceTransaction);

				cacheResult(attendenceTransaction);

				uncachedPrimaryKeys.remove(attendenceTransaction.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(AttendenceTransactionModelImpl.ENTITY_CACHE_ENABLED,
					AttendenceTransactionImpl.class, primaryKey, nullModel);
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
	 * Returns all the attendence transactions.
	 *
	 * @return the attendence transactions
	 */
	@Override
	public List<AttendenceTransaction> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the attendence transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attendence transactions
	 * @param end the upper bound of the range of attendence transactions (not inclusive)
	 * @return the range of attendence transactions
	 */
	@Override
	public List<AttendenceTransaction> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the attendence transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attendence transactions
	 * @param end the upper bound of the range of attendence transactions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of attendence transactions
	 */
	@Override
	public List<AttendenceTransaction> findAll(int start, int end,
		OrderByComparator<AttendenceTransaction> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the attendence transactions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link AttendenceTransactionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of attendence transactions
	 * @param end the upper bound of the range of attendence transactions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of attendence transactions
	 */
	@Override
	public List<AttendenceTransaction> findAll(int start, int end,
		OrderByComparator<AttendenceTransaction> orderByComparator,
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

		List<AttendenceTransaction> list = null;

		if (retrieveFromCache) {
			list = (List<AttendenceTransaction>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ATTENDENCETRANSACTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ATTENDENCETRANSACTION;

				if (pagination) {
					sql = sql.concat(AttendenceTransactionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<AttendenceTransaction>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<AttendenceTransaction>)QueryUtil.list(q,
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
	 * Removes all the attendence transactions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AttendenceTransaction attendenceTransaction : findAll()) {
			remove(attendenceTransaction);
		}
	}

	/**
	 * Returns the number of attendence transactions.
	 *
	 * @return the number of attendence transactions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ATTENDENCETRANSACTION);

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
		return AttendenceTransactionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the attendence transaction persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(AttendenceTransactionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ATTENDENCETRANSACTION = "SELECT attendenceTransaction FROM AttendenceTransaction attendenceTransaction";
	private static final String _SQL_SELECT_ATTENDENCETRANSACTION_WHERE_PKS_IN = "SELECT attendenceTransaction FROM AttendenceTransaction attendenceTransaction WHERE SRNO IN (";
	private static final String _SQL_SELECT_ATTENDENCETRANSACTION_WHERE = "SELECT attendenceTransaction FROM AttendenceTransaction attendenceTransaction WHERE ";
	private static final String _SQL_COUNT_ATTENDENCETRANSACTION = "SELECT COUNT(attendenceTransaction) FROM AttendenceTransaction attendenceTransaction";
	private static final String _SQL_COUNT_ATTENDENCETRANSACTION_WHERE = "SELECT COUNT(attendenceTransaction) FROM AttendenceTransaction attendenceTransaction WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "attendenceTransaction.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No AttendenceTransaction exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No AttendenceTransaction exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(AttendenceTransactionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"srNo", "employeeCode", "employeeName", "mobile", "userDefined1",
				"userDefined2", "attendenceMode", "attendenceDateTime"
			});
}