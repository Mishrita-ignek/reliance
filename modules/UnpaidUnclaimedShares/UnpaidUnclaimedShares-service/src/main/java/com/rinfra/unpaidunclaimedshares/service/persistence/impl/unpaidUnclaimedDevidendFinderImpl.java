package com.rinfra.unpaidunclaimedshares.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.rinfra.unpaidunclaimedshares.model.unpaidUnclaimedDevidend;
import com.rinfra.unpaidunclaimedshares.model.impl.unpaidUnclaimedDevidendImpl;
import com.rinfra.unpaidunclaimedshares.service.persistence.unpaidUnclaimedDevidendFinder;

public class unpaidUnclaimedDevidendFinderImpl extends unpaidUnclaimedDevidendFinderBaseImpl implements unpaidUnclaimedDevidendFinder {

	@SuppressWarnings("unchecked")
	public List<unpaidUnclaimedDevidend> getFolioDetailsList(String FOLIO_NO)
	  {
	    Session session = null;
	    try
	    {
	      session = openSession();
	      //String sqlString = CustomSQLUtil.get(getClass(), "folioDetailsSQLQuery");
	      String sqlString = "SELECT * FROM UNPAID_DIVIDEND_SHARE WHERE FOLIO_NO = ?";
	      System.out.println("Sql " + sqlString);
	      SQLQuery query = session.createSQLQuery(sqlString);
	      query.setCacheable(false);
	      query.addEntity("unpaidUnclaimedDevidend", unpaidUnclaimedDevidendImpl.class);
	      //query.addEntity("unpaidUnclaimedDevidend", unpaidUnclaimedDevidendImpl.class);
	      QueryPos queryPos = QueryPos.getInstance(query);
	      queryPos.add(FOLIO_NO);
	      return query.list();
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	      System.out.println("exception" + e);
	    }
	    finally
	    {
	      closeSession(session);
	    }
	    return null;
	  }
}
