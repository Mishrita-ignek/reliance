package com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.rinfra.unpaid.unclaimed.devidend.model.RpowerUnpaidUnclaimedDevidend;
import com.rinfra.unpaid.unclaimed.devidend.model.UnpaidUnclaimedDevidend;
import com.rinfra.unpaid.unclaimed.devidend.model.impl.RpowerUnpaidUnclaimedDevidendImpl;
import com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendImpl;
import com.rinfra.unpaid.unclaimed.devidend.service.persistence.UnpaidUnclaimedDevidendFinder;

public class UnpaidUnclaimedDevidendFinderImpl extends UnpaidUnclaimedDevidendFinderBaseImpl
		implements UnpaidUnclaimedDevidendFinder {
	public List<UnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidend(String FOLIO_NO_OF_ITIES) {
		Session session = null;
		try {
			session = openSession();
			System.out.println("session" + session);
			System.out.println("FOLIO_NO_OF_ITIES 2018 " + FOLIO_NO_OF_ITIES);
			String sql = CustomSQLUtil.get(getClass(), "UnpaidUnclaimedDevidendSQLQuery");
			System.out.println("sql query ::" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("unpaidUnclaimedDevidend", UnpaidUnclaimedDevidendImpl.class);
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

	public List<String> getUnpaidUnclaimed(String FOLIO_NO_OF_ITIES) {
		return null;
	}
	
   
}
