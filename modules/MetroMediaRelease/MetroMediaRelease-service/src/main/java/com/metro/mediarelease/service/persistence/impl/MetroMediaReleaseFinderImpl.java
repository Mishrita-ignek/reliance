package com.metro.mediarelease.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.metro.mediarelease.model.MetroMediaRelease;
import com.metro.mediarelease.model.impl.MetroMediaReleaseImpl;
import com.metro.mediarelease.service.persistence.MetroMediaReleaseFinder;

public class MetroMediaReleaseFinderImpl extends MetroMediaReleaseFinderBaseImpl implements MetroMediaReleaseFinder {
	
	public List<MetroMediaRelease> getList(String monthYear){
		Session session = null;
		try { 
			//monthYear = "2017-05-%";
			System.out.println("monthYear-----"+monthYear);
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "getMediaRelease");				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query :: "+queryString);
			sqlQuery.addEntity("NewsandMedia", MetroMediaReleaseImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(monthYear);
			return(List<MetroMediaRelease>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
}
