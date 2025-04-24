package com.unpaid.unclaimed.dividend.holders.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.unpaid.unclaimed.dividend.holders.model.UnpaidUnclaimedDevidendHolders;
import com.unpaid.unclaimed.dividend.holders.model.impl.UnpaidUnclaimedDevidendHoldersImpl;
import com.unpaid.unclaimed.dividend.holders.service.persistence.UnpaidUnclaimedDevidendHoldersFinder;

public class UnpaidUnclaimedDevidendHoldersFinderImpl extends
UnpaidUnclaimedDevidendHoldersFinderBaseImpl implements UnpaidUnclaimedDevidendHoldersFinder{
	
	public List<UnpaidUnclaimedDevidendHolders> getUnpaidUnclaimedDevidend(String FOLIO_NO_OF_ITIES) {
		Session session = null;
		try {
			session = openSession();
			System.out.println("session" + session);
			System.out.println("FOLIO_NO_OF_ITIES 2018 " + FOLIO_NO_OF_ITIES);
			String sql = CustomSQLUtil.get(getClass(), "UnpaidUnclaimedDevidendHoldersSQLQuery");
			System.out.println("sql query ::" + sql);
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("unpaidUnclaimedDevidend", UnpaidUnclaimedDevidendHoldersImpl.class);
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
