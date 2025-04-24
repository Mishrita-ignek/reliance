package rpower.shareholders.doc.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import rpower.shareholders.doc.model.RpowerShareHolders;
import rpower.shareholders.doc.model.RpowerShareHoldersDoc;
import rpower.shareholders.doc.model.impl.RpowerShareHoldersDocImpl;
import rpower.shareholders.doc.model.impl.RpowerShareHoldersImpl;
import rpower.shareholders.doc.service.persistence.RpowerShareHoldersFinder;

public class RpowerShareHoldersFinderImpl extends RpowerShareHoldersFinderBaseImpl implements RpowerShareHoldersFinder {

	public List<RpowerShareHolders> getList(String no){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM RPOWER_SHARE_HOLDERS WHERE FOLIO_NO=?";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println(" RpowerShareHolders Sql Query :: "+queryString);
			sqlQuery.addEntity("RpowerShareHolders", RpowerShareHoldersImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(no);
			return(List<RpowerShareHolders>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
	
}
