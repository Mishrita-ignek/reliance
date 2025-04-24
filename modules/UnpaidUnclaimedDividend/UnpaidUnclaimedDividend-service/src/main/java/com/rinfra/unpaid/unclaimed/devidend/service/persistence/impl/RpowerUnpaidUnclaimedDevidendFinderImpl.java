package com.rinfra.unpaid.unclaimed.devidend.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.rinfra.unpaid.unclaimed.devidend.model.RpowerUnpaidUnclaimedDevidend;
import com.rinfra.unpaid.unclaimed.devidend.model.impl.RpowerUnpaidUnclaimedDevidendImpl;
import com.rinfra.unpaid.unclaimed.devidend.service.persistence.RpowerUnpaidUnclaimedDevidendFinder;

public class RpowerUnpaidUnclaimedDevidendFinderImpl extends RpowerUnpaidUnclaimedDevidendFinderBaseImpl 
implements RpowerUnpaidUnclaimedDevidendFinder{

	@Override
	public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendNew(String FOLIO_NO_OF_ITIES) {
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM RPOWER_UNPAIDUNCLAIMEDDIVIDEND L WHERE L.FOLIO_NO_OF_ITIES LIKE '%"+FOLIO_NO_OF_ITIES+"%'";
			System.out.println(queryString);
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			//log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("AttendenceTransaction", RpowerUnpaidUnclaimedDevidendImpl.class);
			//QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return (List<RpowerUnpaidUnclaimedDevidend>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("exception" + e);
		} finally {
			closeSession(session);
		}
		return null;
	}


}
