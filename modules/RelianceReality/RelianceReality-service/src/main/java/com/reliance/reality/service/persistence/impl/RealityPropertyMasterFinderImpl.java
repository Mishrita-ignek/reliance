package com.reliance.reality.service.persistence.impl;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.reliance.reality.model.RealityPropertyMaster;
import com.reliance.reality.model.impl.RealityPropertyMasterImpl;
import com.reliance.reality.service.persistence.RealityPropertyMasterFinder;

public class RealityPropertyMasterFinderImpl extends RealityPropertyMasterFinderBaseImpl
		implements RealityPropertyMasterFinder {
	private final Log log = LogFactoryUtil.getLog(RealityPropertyMasterFinderImpl.class);

	public List<RealityPropertyMaster> getPropertyRecord(String city) {
		//log.info("RealityPropertyMasterFinderImpl.getPropertyRecord() for City - " + city);
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM REALITY_PROPERTY_MSTR R WHERE R.CITY = ? ";
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("PropertyMaster", RealityPropertyMasterImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(city);
			return (List<RealityPropertyMaster>) sqlQuery.list();

		} catch (Exception e) {
			log.info("exception" + e.getMessage());
		} finally {
			closeSession(session);
		}

		return null;
	}
	
	public List<RealityPropertyMaster> getProperty(String location) {
		//log.info("RealityPropertyMasterFinderImpl.getPropertyRecord() for City - " + city);
		Session session = null;
		try {
			session = openSession();
			String queryString = "SELECT * FROM REALITY_PROPERTY_MSTR R WHERE R.LOCATION = = ? ";
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			log.info("Sql Query :: " + queryString);
			sqlQuery.addEntity("PropertyMaster", RealityPropertyMasterImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(location);
			return (List<RealityPropertyMaster>) sqlQuery.list();

		} catch (Exception e) {
			log.info("exception" + e.getMessage());
		} finally {
			closeSession(session);
		}

		return null;
	}

}
