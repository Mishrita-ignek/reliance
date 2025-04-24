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

package com.media.query.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.media.query.service.http.MediaQueryServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.media.query.service.http.MediaQueryServiceSoap
 * @generated
 */
@ProviderType
public class MediaQuerySoap implements Serializable {
	public static MediaQuerySoap toSoapModel(MediaQuery model) {
		MediaQuerySoap soapModel = new MediaQuerySoap();

		soapModel.setSrNo(model.getSrNo());
		soapModel.setJournalistName(model.getJournalistName());
		soapModel.setNewsOrganisationName(model.getNewsOrganisationName());
		soapModel.setOrganisationType(model.getOrganisationType());
		soapModel.setMobile(model.getMobile());
		soapModel.setEmail(model.getEmail());
		soapModel.setSubject(model.getSubject());
		soapModel.setMediaQuery(model.getMediaQuery());

		return soapModel;
	}

	public static MediaQuerySoap[] toSoapModels(MediaQuery[] models) {
		MediaQuerySoap[] soapModels = new MediaQuerySoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static MediaQuerySoap[][] toSoapModels(MediaQuery[][] models) {
		MediaQuerySoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new MediaQuerySoap[models.length][models[0].length];
		}
		else {
			soapModels = new MediaQuerySoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static MediaQuerySoap[] toSoapModels(List<MediaQuery> models) {
		List<MediaQuerySoap> soapModels = new ArrayList<MediaQuerySoap>(models.size());

		for (MediaQuery model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new MediaQuerySoap[soapModels.size()]);
	}

	public MediaQuerySoap() {
	}

	public long getPrimaryKey() {
		return _srNo;
	}

	public void setPrimaryKey(long pk) {
		setSrNo(pk);
	}

	public long getSrNo() {
		return _srNo;
	}

	public void setSrNo(long srNo) {
		_srNo = srNo;
	}

	public String getJournalistName() {
		return _journalistName;
	}

	public void setJournalistName(String journalistName) {
		_journalistName = journalistName;
	}

	public String getNewsOrganisationName() {
		return _newsOrganisationName;
	}

	public void setNewsOrganisationName(String newsOrganisationName) {
		_newsOrganisationName = newsOrganisationName;
	}

	public String getOrganisationType() {
		return _organisationType;
	}

	public void setOrganisationType(String organisationType) {
		_organisationType = organisationType;
	}

	public String getMobile() {
		return _mobile;
	}

	public void setMobile(String mobile) {
		_mobile = mobile;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getSubject() {
		return _subject;
	}

	public void setSubject(String subject) {
		_subject = subject;
	}

	public String getMediaQuery() {
		return _mediaQuery;
	}

	public void setMediaQuery(String mediaQuery) {
		_mediaQuery = mediaQuery;
	}

	private long _srNo;
	private String _journalistName;
	private String _newsOrganisationName;
	private String _organisationType;
	private String _mobile;
	private String _email;
	private String _subject;
	private String _mediaQuery;
}