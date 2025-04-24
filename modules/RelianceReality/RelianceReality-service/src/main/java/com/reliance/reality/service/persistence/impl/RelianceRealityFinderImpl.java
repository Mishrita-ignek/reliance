package com.reliance.reality.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.reliance.reality.model.RelianceReality;
import com.reliance.reality.model.impl.RelianceRealityImpl;
import com.reliance.reality.service.persistence.RelianceRealityFinder;

public class RelianceRealityFinderImpl extends RelianceRealityFinderBaseImpl implements RelianceRealityFinder {

	private final Log log = LogFactoryUtil.getLog(RelianceRealityFinderImpl.class);

	public List<RelianceReality> getExistRecord(String empCode, String propertyId) {

		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM RELIANCE_REALITY R WHERE R.EMPCODE = ? AND R.PROPERTY_ID = ?";
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("PropertyMaster", RelianceRealityImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(empCode);
			queryPos.add(propertyId);
			return (List<RelianceReality>) sqlQuery.list();

		} catch (Exception e) {
			log.info("exception" + e.getMessage());
		} finally {
			closeSession(session);
		}

		return null;
	}

}
