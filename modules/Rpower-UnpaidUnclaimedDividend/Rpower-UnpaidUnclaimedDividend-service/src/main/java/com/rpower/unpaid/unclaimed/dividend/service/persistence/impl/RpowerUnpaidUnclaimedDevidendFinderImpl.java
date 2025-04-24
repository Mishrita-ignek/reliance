package com.rpower.unpaid.unclaimed.dividend.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend;
import com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendImpl;
import com.rpower.unpaid.unclaimed.dividend.service.persistence.RpowerUnpaidUnclaimedDividendFinder;

public class RpowerUnpaidUnclaimedDevidendFinderImpl extends RpowerUnpaidUnclaimedDevidendFinderBaseImpl
implements RpowerUnpaidUnclaimedDividendFinder{
	
	private final Log log = LogFactoryUtil.getLog(RpowerUnpaidUnclaimedDevidendFinderImpl.class);
	
	public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidend(String FOLIO_NO_OF_ITIES) {
		Session session = null;
		try {
			session = openSession();
			System.out.println("session" + session);
			System.out.println("FOLIO_NO_OF_ITIES 2018 " + FOLIO_NO_OF_ITIES);
			String sql = CustomSQLUtil.get(getClass(), "UnpaidUnclaimedDevidendSQLQuery");
			System.out.println("sql query ::" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("unpaidUnclaimedDevidend", RpowerUnpaidUnclaimedDevidendImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(FOLIO_NO_OF_ITIES);
			return sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception" + e);
		} finally {
			closeSession(session);
		}
		return null;
	}

	public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendNew(String FOLIO_NO_OF_ITIES) {
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM RPOWER_UNPAIDUNCLAIMEDDIVIDEND L WHERE L.FOLIO_NO_OF_ITIES LIKE '%"+FOLIO_NO_OF_ITIES+"%'";
			log.info(queryString);
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("AttendenceTransaction", RpowerUnpaidUnclaimedDevidendImpl.class);
			//QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return (List<RpowerUnpaidUnclaimedDevidend>) sqlQuery.list();

		} catch (Exception e) {
			log.error("exception in BYPLLocalityMasterFinderImpl" + e.getMessage());
		} finally {
			closeSession(session);
		}
		return null;
	}
	
}
