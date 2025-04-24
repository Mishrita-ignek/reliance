package com.relieanceada.rinfra.portal.pressRelease.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;
import com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl;
import com.relieanceada.rinfra.portal.pressRelease.service.persistence.PressReleaseFinder;

public class PressReleaseFinderImpl extends PressReleaseFinderBaseImpl implements PressReleaseFinder{
	public List<PressRelease> getNewsTickerRecord(){
		Session session=null;
		try {
			session=openSession();
			String sqlString=CustomSQLUtil.get(getClass(), "NewsTickerSQLQuery");
			System.out.println("Sql "+sqlString);
			SQLQuery query=session.createSQLQuery(sqlString);
			query.setCacheable(false);
			query.addEntity("PressRelease",PressReleaseImpl.class);
			return (List<PressRelease>) query.list();
			
		} catch (Exception e) {
			 e.printStackTrace();
			   System.out.println("exception"+e);
		}finally {
			closeSession(session);
		}
		
		return null;
	}
}
