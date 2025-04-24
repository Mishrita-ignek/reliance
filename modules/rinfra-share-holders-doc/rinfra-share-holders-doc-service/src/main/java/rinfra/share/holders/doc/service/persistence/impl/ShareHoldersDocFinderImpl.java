package rinfra.share.holders.doc.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import rinfra.share.holders.doc.model.ShareHoldersDoc;
import rinfra.share.holders.doc.model.impl.ShareHoldersDocImpl;
import rinfra.share.holders.doc.service.persistence.ShareHoldersDocFinder;

public class ShareHoldersDocFinderImpl extends ShareHoldersDocFinderBaseImpl implements ShareHoldersDocFinder {

	public List<ShareHoldersDoc> getRinfraDocList(){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM SHARE_HOLDERS_DOC";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println(" ShareHoldersDoc Sql Query :: "+queryString);
			sqlQuery.addEntity("ShareHoldersDoc", ShareHoldersDocImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return(List<ShareHoldersDoc>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
}
