package attendence.rinfra.services.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import attendence.rinfra.services.model.AttendenceTransaction;
import attendence.rinfra.services.model.impl.AttendenceTransactionImpl;
import attendence.rinfra.services.service.persistence.AttendenceTransactionFinder;

public class AttendenceTransactionFinderImpl extends AttendenceTransactionFinderBaseImpl implements AttendenceTransactionFinder{
	
	private final Log log = LogFactoryUtil.getLog(AttendenceTransactionFinderImpl.class);

	public List<AttendenceTransaction> getEmp(String code) {
		//log.info("RealityPropertyMasterFinderImpl.getPropertyRecord() for City - " + city);
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM ATTENDENCE_TRANSACTION_TABLE A WHERE A.EMPLOYEE_CODE= ? ";
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			//log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("AttendenceTransaction", AttendenceTransactionImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(code);
			return (List<AttendenceTransaction>) sqlQuery.list();

		} catch (Exception e) {
			log.info("exception" + e.getMessage());
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	public List<AttendenceTransaction> getAttendenceTrann(String date) {
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM ATTENDENCE_TRANSACTION_TABLE A WHERE A.ATTENDENCE_DATETIME like '"+date+"%'";
			log.info(queryString);
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			//log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("AttendenceTransaction", AttendenceTransactionImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return (List<AttendenceTransaction>) sqlQuery.list();

		} catch (Exception e) {
			log.info("exception" + e.getMessage());
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	public List<AttendenceTransaction> getAttendenceTrann(String code, String date) {
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM ATTENDENCE_TRANSACTION_TABLE A WHERE A.EMPLOYEE_CODE ='"+code+"' AND A.ATTENDENCE_DATETIME like '"+date+"%'";
			log.info(queryString);
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			//log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("AttendenceTransaction", AttendenceTransactionImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			return (List<AttendenceTransaction>) sqlQuery.list();

		} catch (Exception e) {
			log.info("exception" + e.getMessage());
		} finally {
			closeSession(session);
		}

		return null;
	}

}
