package OCCModuleNew.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;

import OCCModuleNew.model.OccNew;
import OCCModuleNew.model.impl.OccNewImpl;
import OCCModuleNew.service.persistence.OccNewFinder;

public class OccNewFinderImpl extends OccNewFinderBaseImpl implements OccNewFinder{ 

	@SuppressWarnings("unchecked")
	public List<OccNew> getList1(String listName){
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * from OCCNEW where LISTNAME=?";				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			System.out.println("Sql Query :: "+queryString);
			sqlQuery.addEntity("OccNew", OccNewImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(listName);
			return(List<OccNew>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
}
