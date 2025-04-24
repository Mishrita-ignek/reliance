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

package com.rinfra.news.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.liferay.portal.kernel.util.Validator;
import com.rinfra.news.model.PressNews;
import com.rinfra.news.model.PressNewsWrapper;
import com.rinfra.news.model.impl.PressNewsImpl;
import com.rinfra.news.service.PressNewsLocalServiceUtil;
import com.rinfra.news.service.base.PressNewsLocalServiceBaseImpl;
import com.rinfra.news.service.persistence.PressNewsFinder;
import com.rinfra.news.service.persistence.PressNewsUtil;

import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the press news local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rinfra.news.service.PressNewsLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Vipin Singh
 * @see PressNewsLocalServiceBaseImpl
 * @see com.rinfra.news.service.PressNewsLocalServiceUtil
 */
@ProviderType
public class PressNewsLocalServiceImpl extends PressNewsLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.rinfra.news.service.PressNewsLocalServiceUtil} to access the press news local service.
	 */
	
	
	public Set<Integer> getSetOfYear()
	  {
	    Set<Integer> years = new TreeSet(Collections.reverseOrder());
	    List<PressNews> pressNews=PressNewsLocalServiceUtil.getPressNewses(-1, -1);
	    if ((Validator.isNotNull(pressNews)) && (!pressNews.isEmpty())) {
	      for (PressNews _pressNews : pressNews)
	      {
	        Calendar calendar = Calendar.getInstance();
	        calendar.setTime(_pressNews.getDate());
	        years.add(Integer.valueOf(calendar.get(1)));
	      }
	    }
	    System.out.println("years"+years);
	    return years;
	  }
	
	public List<PressNews> filterNewsByYearAndMonth(int year,int month) {
		 List<PressNews> newsRoom = new ArrayList<PressNews>();
		 List<PressNews> newsRooms =PressNewsLocalServiceUtil.findByNewsYearAndMonth(year, month);
		 for(PressNews pressNews:newsRooms){
		    	PressNews pressNews1=new PressNewsImpl();
		    	pressNews1.setDate(pressNews.getDate());
		    	pressNews1.setHeadLine(pressNews.getHeadLine());
		    	pressNews1.setPublication(pressNews.getPublication());
		    	pressNews1.setFileName(pressNews.getFileName());
		    	newsRoom.add((PressNews) pressNews);
		    }
		return newsRoom;
		
	}
	
	public List<PressNews> filterNewsByYearsAndMonth(int year,int month) {
		return (List<PressNews>) getPressNewsLocalService();
		
	}

	@Override
	public List<PressNews> filterNewsByYearAndMonth(String year, String month) {
		 List<PressNews> newRoomWrappers = new ArrayList<PressNews>();
		    List<PressNews> newsRooms =PressNewsLocalServiceUtil.findByNewsYearAndMonth(year, month);
		    for(PressNews pressNews:newsRooms){
		    	PressNews pressNews1=new PressNewsImpl();
		    	pressNews1.setDate(pressNews1.getDate());
		    	pressNews1.setHeadLine(pressNews1.getHeadLine());
		    	pressNews1.setPublication(pressNews1.getPublication());
		    	pressNews1.setFileName(pressNews1.getFileName());
		    	newRoomWrappers.add((PressNews) newsRooms);
		    }
		    return newRoomWrappers;
	}
	
	public List<PressNews> getNewsByYear(int year){
		 List<PressNews> newsRoom = new ArrayList<PressNews>();
		 List<PressNews> newsRooms=PressNewsLocalServiceUtil.findByNewsYear(year);
		 for(PressNews pressNews:newsRooms){
		    	PressNews pressNews1=new PressNewsImpl();
		    	pressNews1.setDate(pressNews.getDate());
		    	pressNews1.setHeadLine(pressNews.getHeadLine());
		    	pressNews1.setPublication(pressNews.getPublication());
		    	pressNews1.setFileName(pressNews.getFileName());
		    	newsRoom.add((PressNews) pressNews);
		    }
		return newsRoom;
	}
	
	public List<PressNews> fetchNewsTickerRecord(){
		return pressNewsFinder.getNewsTickerRecord();
	}
	
	public  List<PressNews> findByNewsYearAndMonth(int year, int month) {
		return PressNewsUtil.findByNewsYearAndMonth(year, month);
	}

	@Override
	public List<PressNewsWrapper> filterNewsByYearAndMonth(int year, Integer month) {
		// TODO Auto-generated method stub
		return null;
	}
	
	


	@Override
	public List<PressNews> findByNewsYearAndMonth(String year, String month) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<PressNewsWrapper> filterNewsByYearAndMonth(Integer year, Integer month) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<PressNews> filterNewsByYearsAndMonth(String year, String month) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<PressNews> findByNewsYear(int year) {
		return PressNewsUtil.findByNewsYear(year);
	}
	
	
}