package OCCModuleNew.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import OCCModuleNew.model.OccMessageNew;
import OCCModuleNew.model.impl.OccMessageNewImpl;
import OCCModuleNew.service.persistence.OccMessageNewFinder;

public class OccMessageNewFinderImpl extends OccMessageNewFinderBaseImpl implements OccMessageNewFinder{

	public List<OccMessageNew> getMsgs(String listName){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM OCCMESSAGENEW";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query for Web service Msg List :: "+queryString);
			sqlQuery.addEntity("OccMessageNew", OccMessageNewImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(listName);
			return(List<OccMessageNew>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
	
	public List<OccMessageNew> getMsgsAlert(){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM OCCMESSAGENEW ORDER BY CREATEDATE DESC";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query for Web service Msg List :: "+queryString);
			sqlQuery.addEntity("OccMessageNew", OccMessageNewImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return(List<OccMessageNew>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
	public List<OccMessageNew> getMsgList(String listName){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM OCCMESSAGENEW WHERE LISTNAME=? ORDER BY CREATEDATE ASC";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query :: "+queryString);
			sqlQuery.addEntity("OccMessageNew", OccMessageNewImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(listName);
			return(List<OccMessageNew>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
	
	public List<OccMessageNew> getMsg(String listName){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM OCCMESSAGENEW";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query :: "+queryString);
			sqlQuery.addEntity("OccMessageNew", OccMessageNewImpl.class);
			return(List<OccMessageNew>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}

	
}
