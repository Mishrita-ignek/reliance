/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.redlatm.form.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.redlatm.form.model.CandidateForm;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for CandidateForm. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Mukesh,Vipin
 * @see CandidateFormLocalServiceUtil
 * @see com.redlatm.form.service.base.CandidateFormLocalServiceBaseImpl
 * @see com.redlatm.form.service.impl.CandidateFormLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface CandidateFormLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CandidateFormLocalServiceUtil} to access the candidate form local service. Add custom service methods to {@link com.redlatm.form.service.impl.CandidateFormLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the candidate form to the database. Also notifies the appropriate model listeners.
	*
	* @param candidateForm the candidate form
	* @return the candidate form that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CandidateForm addCandidateForm(CandidateForm candidateForm);

	/**
	* Creates a new candidate form with the primary key. Does not add the candidate form to the database.
	*
	* @param CaId the primary key for the new candidate form
	* @return the new candidate form
	*/
	public CandidateForm createCandidateForm(long CaId);

	/**
	* Deletes the candidate form from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateForm the candidate form
	* @return the candidate form that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public CandidateForm deleteCandidateForm(CandidateForm candidateForm);

	/**
	* Deletes the candidate form with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form that was removed
	* @throws PortalException if a candidate form with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public CandidateForm deleteCandidateForm(long CaId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CandidateForm fetchCandidateForm(long CaId);

	/**
	* Returns the candidate form with the primary key.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form
	* @throws PortalException if a candidate form with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public CandidateForm getCandidateForm(long CaId) throws PortalException;

	/**
	* Updates the candidate form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param candidateForm the candidate form
	* @return the candidate form that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public CandidateForm updateCandidateForm(CandidateForm candidateForm);

	/**
	* Returns the number of candidate forms.
	*
	* @return the number of candidate forms
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getCandidateFormsCount();

	public java.lang.Long saveCandidateForm(java.lang.Long caId,
		java.lang.String name, java.lang.String surname,
		java.lang.String fatherOrSpouse, java.lang.String AadharNo,
		java.lang.String panNumber, java.lang.String BankAcNo,
		java.lang.String EmpExResgnNo, java.lang.String dob,
		java.lang.String NativeLoc, java.lang.String motherTongue,
		java.lang.String identificationMark, java.lang.String domicile,
		java.lang.String languagesKnown, java.lang.String Company,
		java.lang.String location, java.lang.String Role,
		java.lang.String fromEx, java.lang.String toEx,
		java.lang.String reasonLeaving, java.lang.String ph_State,
		java.lang.String religion, java.lang.String caste,
		java.lang.String subCast, java.lang.String mrtOption,
		java.lang.String ableToJoin, java.lang.String npMonth,
		java.lang.String npDays, java.lang.String Address,
		java.lang.String city, java.lang.String InState,
		java.lang.String pinNumber, java.lang.String emailId,
		java.lang.String AlEmailId, java.lang.String mobNumberber,
		java.lang.String AlMobNumberber, java.lang.String ALPersonName,
		java.lang.String mainQualification, java.lang.String specialization,
		java.lang.String trade, java.lang.String totalExp,
		java.lang.String skillLevel, java.lang.String scFrom,
		java.lang.String ScvalidTill, java.lang.String docName,
		java.lang.String docAddres, java.lang.String docRegnNo,
		java.lang.String mFvalidTill, java.lang.String CEaddress,
		java.lang.String cCompany, java.lang.String workingSince,
		java.lang.String designation, java.lang.String ctcFixed,
		java.lang.String ctcVariable, java.lang.String ctcTotal,
		java.lang.String role, java.lang.String Location,
		java.lang.String npDuration, java.lang.String f_company_name_1,
		java.lang.String f_from_1, java.lang.String f_to_1,
		java.lang.String f_location_1, java.lang.String f_designation_1,
		java.lang.String f_ctc_fixed_1, java.lang.String f_ctc_variable_1,
		java.lang.String f_ctc_total_1, java.lang.String f_remark_1,
		java.lang.String f_company_name_2, java.lang.String f_from_2,
		java.lang.String f_to_2, java.lang.String f_location_2,
		java.lang.String f_designation_2, java.lang.String f_ctc_fixed_2,
		java.lang.String f_ctc_variable_2, java.lang.String f_ctc_total_2,
		java.lang.String f_remark_2, java.lang.String f_company_name_3,
		java.lang.String f_from_3, java.lang.String f_to_3,
		java.lang.String f_location_3, java.lang.String f_designation_3,
		java.lang.String f_ctc_fixed_3, java.lang.String f_ctc_variable_3,
		java.lang.String f_ctc_total_3, java.lang.String f_remark_3,
		java.lang.String f_company_name_4, java.lang.String f_from_4,
		java.lang.String f_to_4, java.lang.String f_location_4,
		java.lang.String f_designation_4, java.lang.String f_ctc_fixed_4,
		java.lang.String f_ctc_variable_4, java.lang.String f_ctc_total_4,
		java.lang.String f_remark_4, java.lang.String f_company_name_5,
		java.lang.String f_from_5, java.lang.String f_to_5,
		java.lang.String f_location_5, java.lang.String f_designation_5,
		java.lang.String f_ctc_fixed_5, java.lang.String f_ctc_variable_5,
		java.lang.String f_ctc_total_5, java.lang.String f_remark_5,
		java.lang.String f_qualification_1, java.lang.String f_Institute_1,
		java.lang.String f_year_1, java.lang.String f_grade_1,
		java.lang.String f_qualification_2, java.lang.String f_Institute_2,
		java.lang.String f_year_2, java.lang.String f_grade_2,
		java.lang.String f_qualification_3, java.lang.String f_Institute_3,
		java.lang.String f_year_3, java.lang.String f_grade_3,
		java.lang.String f_qualification_4, java.lang.String f_Institute_4,
		java.lang.String f_year_4, java.lang.String f_grade_4,
		java.lang.String f_qualification_5, java.lang.String f_Institute_5,
		java.lang.String f_year_5, java.lang.String f_grade_5,
		java.lang.String f_qualification_10, java.lang.String f_Institute_10,
		java.lang.String f_year_10, java.lang.String f_grade_10,
		java.lang.String f_qualification_7, java.lang.String f_Institute_7,
		java.lang.String f_year_7, java.lang.String f_grade_7,
		java.lang.String f_qualification_8, java.lang.String f_Institute_8,
		java.lang.String f_year_8, java.lang.String f_grade_8,
		java.lang.String fileName) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.lang.String getCandidateEmailId(java.lang.String email);

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	public java.lang.String saveCandidateRegistrationForm(
		CandidateForm candidateRegistrationForm);

	public java.lang.String setCandidatePasswordServiceImpl(
		java.lang.String oldpassword, java.lang.String password,
		java.lang.String emailId);

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.redlatm.form.model.impl.CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.redlatm.form.model.impl.CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	public List<CandidateForm> findCandidateEmailId(
		java.lang.String emailAddress);

	/**
	* Returns a range of all the candidate forms.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.redlatm.form.model.impl.CandidateFormModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidate forms
	* @param end the upper bound of the range of candidate forms (not inclusive)
	* @return the range of candidate forms
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CandidateForm> getCandidateForms(int start, int end);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<CandidateForm> getValidateCandidateEmailServiceImpl(
		java.lang.String email);

	public List validateUserLoginService(java.lang.String username,
		java.lang.String password);

	public List<CandidateForm> viewCandidateProfile(java.lang.String email);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	public void test();
}