package rinfra.share.holders.doc.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import rinfra.share.holders.doc.model.ShareHolders;
import rinfra.share.holders.doc.model.impl.ShareHoldersImpl;
import rinfra.share.holders.doc.service.persistence.ShareHoldersFinder;

public class ShareHoldersFinderImpl extends ShareHoldersFinderBaseImpl implements ShareHoldersFinder {

	public List<ShareHolders> getShareHolders(String no){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM SHARE_HOLDERS WHERE FOLIO_NO=?";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println(" ShareHolders Sql Query :: "+queryString);
			sqlQuery.addEntity("ShareHolders", ShareHoldersImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(no);
			return(List<ShareHolders>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
}
