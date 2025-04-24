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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for CandidateForm. This utility wraps
 * {@link com.redlatm.form.service.impl.CandidateFormLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Mukesh,Vipin
 * @see CandidateFormLocalService
 * @see com.redlatm.form.service.base.CandidateFormLocalServiceBaseImpl
 * @see com.redlatm.form.service.impl.CandidateFormLocalServiceImpl
 * @generated
 */
@ProviderType
public class CandidateFormLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.redlatm.form.service.impl.CandidateFormLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the candidate form to the database. Also notifies the appropriate model listeners.
	*
	* @param candidateForm the candidate form
	* @return the candidate form that was added
	*/
	public static com.redlatm.form.model.CandidateForm addCandidateForm(
		com.redlatm.form.model.CandidateForm candidateForm) {
		return getService().addCandidateForm(candidateForm);
	}

	/**
	* Creates a new candidate form with the primary key. Does not add the candidate form to the database.
	*
	* @param CaId the primary key for the new candidate form
	* @return the new candidate form
	*/
	public static com.redlatm.form.model.CandidateForm createCandidateForm(
		long CaId) {
		return getService().createCandidateForm(CaId);
	}

	/**
	* Deletes the candidate form from the database. Also notifies the appropriate model listeners.
	*
	* @param candidateForm the candidate form
	* @return the candidate form that was removed
	*/
	public static com.redlatm.form.model.CandidateForm deleteCandidateForm(
		com.redlatm.form.model.CandidateForm candidateForm) {
		return getService().deleteCandidateForm(candidateForm);
	}

	/**
	* Deletes the candidate form with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form that was removed
	* @throws PortalException if a candidate form with the primary key could not be found
	*/
	public static com.redlatm.form.model.CandidateForm deleteCandidateForm(
		long CaId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteCandidateForm(CaId);
	}

	public static com.redlatm.form.model.CandidateForm fetchCandidateForm(
		long CaId) {
		return getService().fetchCandidateForm(CaId);
	}

	/**
	* Returns the candidate form with the primary key.
	*
	* @param CaId the primary key of the candidate form
	* @return the candidate form
	* @throws PortalException if a candidate form with the primary key could not be found
	*/
	public static com.redlatm.form.model.CandidateForm getCandidateForm(
		long CaId) throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getCandidateForm(CaId);
	}

	/**
	* Updates the candidate form in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param candidateForm the candidate form
	* @return the candidate form that was updated
	*/
	public static com.redlatm.form.model.CandidateForm updateCandidateForm(
		com.redlatm.form.model.CandidateForm candidateForm) {
		return getService().updateCandidateForm(candidateForm);
	}

	/**
	* Returns the number of candidate forms.
	*
	* @return the number of candidate forms
	*/
	public static int getCandidateFormsCount() {
		return getService().getCandidateFormsCount();
	}

	public static java.lang.Long saveCandidateForm(java.lang.Long caId,
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
		java.lang.String fileName)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .saveCandidateForm(caId, name, surname, fatherOrSpouse,
			AadharNo, panNumber, BankAcNo, EmpExResgnNo, dob, NativeLoc,
			motherTongue, identificationMark, domicile, languagesKnown,
			Company, location, Role, fromEx, toEx, reasonLeaving, ph_State,
			religion, caste, subCast, mrtOption, ableToJoin, npMonth, npDays,
			Address, city, InState, pinNumber, emailId, AlEmailId,
			mobNumberber, AlMobNumberber, ALPersonName, mainQualification,
			specialization, trade, totalExp, skillLevel, scFrom, ScvalidTill,
			docName, docAddres, docRegnNo, mFvalidTill, CEaddress, cCompany,
			workingSince, designation, ctcFixed, ctcVariable, ctcTotal, role,
			Location, npDuration, f_company_name_1, f_from_1, f_to_1,
			f_location_1, f_designation_1, f_ctc_fixed_1, f_ctc_variable_1,
			f_ctc_total_1, f_remark_1, f_company_name_2, f_from_2, f_to_2,
			f_location_2, f_designation_2, f_ctc_fixed_2, f_ctc_variable_2,
			f_ctc_total_2, f_remark_2, f_company_name_3, f_from_3, f_to_3,
			f_location_3, f_designation_3, f_ctc_fixed_3, f_ctc_variable_3,
			f_ctc_total_3, f_remark_3, f_company_name_4, f_from_4, f_to_4,
			f_location_4, f_designation_4, f_ctc_fixed_4, f_ctc_variable_4,
			f_ctc_total_4, f_remark_4, f_company_name_5, f_from_5, f_to_5,
			f_location_5, f_designation_5, f_ctc_fixed_5, f_ctc_variable_5,
			f_ctc_total_5, f_remark_5, f_qualification_1, f_Institute_1,
			f_year_1, f_grade_1, f_qualification_2, f_Institute_2, f_year_2,
			f_grade_2, f_qualification_3, f_Institute_3, f_year_3, f_grade_3,
			f_qualification_4, f_Institute_4, f_year_4, f_grade_4,
			f_qualification_5, f_Institute_5, f_year_5, f_grade_5,
			f_qualification_10, f_Institute_10, f_year_10, f_grade_10,
			f_qualification_7, f_Institute_7, f_year_7, f_grade_7,
			f_qualification_8, f_Institute_8, f_year_8, f_grade_8, fileName);
	}

	public static java.lang.String getCandidateEmailId(java.lang.String email) {
		return getService().getCandidateEmailId(email);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static java.lang.String saveCandidateRegistrationForm(
		com.redlatm.form.model.CandidateForm candidateRegistrationForm) {
		return getService()
				   .saveCandidateRegistrationForm(candidateRegistrationForm);
	}

	public static java.lang.String setCandidatePasswordServiceImpl(
		java.lang.String oldpassword, java.lang.String password,
		java.lang.String emailId) {
		return getService()
				   .setCandidatePasswordServiceImpl(oldpassword, password,
			emailId);
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.redlatm.form.model.CandidateForm> findCandidateEmailId(
		java.lang.String emailAddress) {
		return getService().findCandidateEmailId(emailAddress);
	}

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
	public static java.util.List<com.redlatm.form.model.CandidateForm> getCandidateForms(
		int start, int end) {
		return getService().getCandidateForms(start, end);
	}

	public static java.util.List<com.redlatm.form.model.CandidateForm> getValidateCandidateEmailServiceImpl(
		java.lang.String email) {
		return getService().getValidateCandidateEmailServiceImpl(email);
	}

	public static java.util.List validateUserLoginService(
		java.lang.String username, java.lang.String password) {
		return getService().validateUserLoginService(username, password);
	}

	public static java.util.List<com.redlatm.form.model.CandidateForm> viewCandidateProfile(
		java.lang.String email) {
		return getService().viewCandidateProfile(email);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static void test() {
		getService().test();
	}

	public static CandidateFormLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CandidateFormLocalService, CandidateFormLocalService> _serviceTracker =
		ServiceTrackerFactory.open(CandidateFormLocalService.class);
}