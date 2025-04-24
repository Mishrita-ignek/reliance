package com.news.media.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import com.news.media.model.NewsAndMedia;
import com.news.media.model.impl.NewsAndMediaImpl;
import com.news.media.service.persistence.NewsAndMediaFinder;

public class NewsAndMediaFinderImpl extends NewsAndMediaFinderBaseImpl implements NewsAndMediaFinder{
	
	public List<NewsAndMedia> getPublicationList(String monthYear){
		Session session = null;
		try { 
			//monthYear = "2017-05-%";
			System.out.println("monthYear---getPublicationList--"+monthYear);
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "getPublication");				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query :: "+queryString);
			sqlQuery.addEntity("NewsandMedia", NewsAndMediaImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(monthYear);
			return(List<NewsAndMedia>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
/*	public List<NewsAndMedia> getAllNewsList(String monthYear){
		Session session = null;
		try { 
			//monthYear = "2017-05-%";
			System.out.println("monthYear-----"+monthYear);
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "getAllNewsNew");				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query :: "+queryString);
			sqlQuery.addEntity("NewsandMedia", NewsAndMediaImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			//queryPos.add(publication);
			queryPos.add(monthYear);
			return(List<NewsAndMedia>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}*/
	
	public List<NewsAndMedia> getNewsList(String monthYear, String publication){
		Session session = null;
		try { 
			//monthYear = "2017-05-%";
			System.out.println("monthYear--getNewsList---"+monthYear);
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "getNews");				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query :: "+queryString);
			sqlQuery.addEntity("NewsandMedia", NewsAndMediaImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(publication);
			queryPos.add(monthYear);
			return(List<NewsAndMedia>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}

}



