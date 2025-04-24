package com.rinfra.news.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.rinfra.news.model.PressNews;
import com.rinfra.news.model.impl.PressNewsImpl;
import com.rinfra.news.service.persistence.PressNewsFinder;

public class PressNewsFinderImpl extends PressNewsFinderBaseImpl implements PressNewsFinder{
public List<PressNews> getNewsTickerRecord(){
	Session session=null;
	try {
		session=openSession();
		String sqlString=CustomSQLUtil.get(getClass(), "NewsTickerSQLQuery");
		System.out.println("Sql "+sqlString);
		SQLQuery query=session.createSQLQuery(sqlString);
		query.setCacheable(false);
		query.addEntity("PressNews",PressNewsImpl.class);
		return (List<PressNews>) query.list();
		
	} catch (Exception e) {
		 e.printStackTrace();
		   System.out.println("exception"+e);
	}finally {
		closeSession(session);
	}
	
	return null;
}
}
