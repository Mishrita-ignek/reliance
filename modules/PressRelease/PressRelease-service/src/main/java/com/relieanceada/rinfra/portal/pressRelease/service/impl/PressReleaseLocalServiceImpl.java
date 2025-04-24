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

package com.relieanceada.rinfra.portal.pressRelease.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import com.relieanceada.rinfra.portal.pressRelease.model.PressRelease;
import com.relieanceada.rinfra.portal.pressRelease.model.impl.PressReleaseImpl;
import com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil;
import com.relieanceada.rinfra.portal.pressRelease.service.base.PressReleaseLocalServiceBaseImpl;
import com.relieanceada.rinfra.portal.pressRelease.service.persistence.PressReleaseFinder;
import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the press release local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vipin Singh
 * @see PressReleaseLocalServiceBaseImpl
 * @see com.relieanceada.rinfra.portal.pressRelease.service.PressReleaseLocalServiceUtil
 */
@ProviderType
public class PressReleaseLocalServiceImpl
	extends PressReleaseLocalServiceBaseImpl {
	private static final Log _log = LogFactoryUtil.getLog(PressReleaseLocalServiceImpl.class);
	
	public List<String> getNewsYearList()
	  {
		
	    _log.info("getNewsYearList Called...test ");
	    List<PressRelease> pressReleaseList = PressReleaseLocalServiceUtil.getPressReleases(-1, -1);
	    System.out.println("pressReleaseList"+pressReleaseList);
	    List<String> newsYearList = new ArrayList();
	    Set<Integer> uniqKeys;
	    if (Validator.isNotNull(pressReleaseList))
	    {
	      uniqKeys = new TreeSet();
	      for (PressRelease pressRelease : pressReleaseList)
	      {
	    	  //Date newsDate = pressRelease.getNewDate();
	        Date newsDate = pressRelease.getNewsDate();
	        Calendar cal = Calendar.getInstance();
	        cal.setTime(newsDate);
	        if (!uniqKeys.contains(Integer.valueOf(cal.get(1))))
	        {
	          uniqKeys.add(Integer.valueOf(cal.get(1)));
	          newsYearList.add(Integer.toString(cal.get(1)));
	        }
	      }
	    }
	    Collections.sort(newsYearList);
	    Collections.reverse(newsYearList);
	    

	    return newsYearList;
	  }
	
	
	public List<PressRelease> fetchPressReleases(String selectedNewsYear)
	  {
		_log.info("fetchPressReleases called..");
		List<PressRelease> pressReleasesList = PressReleaseLocalServiceUtil.findByselectedNewsYear(selectedNewsYear);
		List<PressRelease> PressReleaseList = new ArrayList();
		 _log.info("PressRelease list size :::   " + pressReleasesList.size());
		    if (Validator.isNotNull(pressReleasesList)) {
		      for (PressRelease pressRelease : pressReleasesList)
		      {
		        PressRelease PressRelease = new PressReleaseImpl();
		        PressRelease.setNewsDate(pressRelease.getNewsDate());
		        PressRelease.setData(pressRelease.getData());
		        PressRelease.setDescription(pressRelease.getDescription());
		        PressRelease.setFileName(pressRelease.getFileName());
		        PressRelease.setHeading(pressRelease.getHeading());
		        PressReleaseList.add(PressRelease);
		      }
		    }
		    return PressReleaseList;

	  }
	
	public List<PressRelease> fetchNewsTickerRecord(){
		return pressReleaseFinder.getNewsTickerRecord();
	}
	
	public List<PressRelease> findByselectedNewsYear(String newsYear) {
		return getPressReleasePersistence().findByselectedNewsYear(newsYear);
	}
	
}