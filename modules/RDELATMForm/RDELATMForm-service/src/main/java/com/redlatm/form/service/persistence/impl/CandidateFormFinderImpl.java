package com.redlatm.form.service.persistence.impl;

import java.util.List;

import com.liferay.portal.dao.orm.custom.sql.CustomSQLUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.redlatm.form.model.CandidateForm;
import com.redlatm.form.model.impl.CandidateFormImpl;
import com.redlatm.form.service.persistence.CandidateFormFinder;

public class CandidateFormFinderImpl extends CandidateFormFinderBaseImpl implements CandidateFormFinder {

	public List validateCandidateUserLogin(String username, String password) {
		List result = null;
		Session session = null;
		try {
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "fetchcandidateLoginDetails");
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("CandidateApplicationForm", CandidateFormImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(username);
			queryPos.add(password);
			List<CandidateForm> userLogin = (List<CandidateForm>) sqlQuery.list();
			if (userLogin.isEmpty()) {
				result = null;
			} else {
				result = userLogin;
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = null;
			closeSession(session);
		}
		return result;
	}
	
	public String validateCandidateEmailFinder(String email){
		String result = "ERROR";
		Session session = null;
		try {
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "fetchcandidateEmailVerified");				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("CandidateApplicationForm", CandidateFormImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(email);				
			List<CandidateForm> candidateEmail=(List<CandidateForm>)sqlQuery.list();		
			System.out.println("CandidateApplicationForm || Finder || validateCandidateEmailFinder || Email List 1 : " + candidateEmail);
			if(candidateEmail.isEmpty()){				
				result = "ERROR";
			}else{				
				result = "SUCCESS";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "ERROR";			
		}finally {
			closeSession(session);
		}
		return result;
	}
	
	public List<CandidateForm> validateCandidateEmailFinderPersitence(String email){
		Session session = null;
		try {
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "fetchcandidateEmailVerified");				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("CandidateApplicationForm", CandidateFormImpl.class);
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);
			queryPos.add(email);
			return(List<CandidateForm>) sqlQuery.list();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeSession(session);
		}
		return null;
	}
	
	public String setCandidatePasswordFinderImpl(String password,String emailId){
		String result = "ERROR";
		Session session = null;
		try {
			session = openSession();
			String queryString = CustomSQLUtil.get(getClass(), "updatecandidatePassword");				
			SQLQuery sqlQuery = session.createSQLQuery(queryString);			
			sqlQuery.setCacheable(false);
			sqlQuery.addEntity("CandidateApplicationForm", CandidateFormImpl.class);			
			QueryPos queryPos = QueryPos.getInstance(sqlQuery);		
			queryPos.add(password);
			queryPos.add(emailId);					
			int updateStatus = sqlQuery.executeUpdate();							
			if(updateStatus == 0){				
				result = "ERROR";
			}else{				
				result = "SUCCESS";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "ERROR";			
		}finally {
			closeSession(session);
		}
		return result;
	}
}
