package rpower.shareholders.doc.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import rpower.shareholders.doc.model.RpowerShareHoldersDoc;
import rpower.shareholders.doc.model.impl.RpowerShareHoldersDocImpl;
import rpower.shareholders.doc.service.persistence.RpowerShareHoldersDocFinder;

public class RpowerShareHoldersDocFinderImpl extends RpowerShareHoldersDocFinderBaseImpl implements RpowerShareHoldersDocFinder{
	
	public List<RpowerShareHoldersDoc> getDocList(){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM RPOWER_SHARE_HOLDERS_DOC";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println(" RpowerShareHoldersDoc Sql Query :: "+queryString);
			sqlQuery.addEntity("RpowerShareHoldersDoc", RpowerShareHoldersDocImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return(List<RpowerShareHoldersDoc>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	

}
