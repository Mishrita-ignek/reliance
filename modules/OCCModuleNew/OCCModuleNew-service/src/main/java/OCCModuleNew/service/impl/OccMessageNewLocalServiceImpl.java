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

package OCCModuleNew.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;

import OCCModuleNew.model.OccMessageNew;
import OCCModuleNew.model.impl.OccMessageNewImpl;
import OCCModuleNew.service.base.OccMessageNewLocalServiceBaseImpl;
import aQute.bnd.annotation.ProviderType;

/**
 * The implementation of the occ message new local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link OCCModuleNew.service.OccMessageNewLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Harshal Gadkari
 * @see OccMessageNewLocalServiceBaseImpl
 * @see OCCModuleNew.service.OccMessageNewLocalServiceUtil
 */
@ProviderType
public class OccMessageNewLocalServiceImpl
	extends OccMessageNewLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link OCCModuleNew.service.OccMessageNewLocalServiceUtil} to access the occ message new local service.
	 */


	public int saveMsg(String msg, String listName,String severity) {
		System.out.println("OccMessageNewLocalServiceImpl.saveMsg()");
		Long MSG_ID = CounterLocalServiceUtil.increment();
		OccMessageNew occMessage = new OccMessageNewImpl();

		occMessage.setMSG_ID(MSG_ID);
		occMessage.setListName(listName);
		occMessage.setMessage(msg);
		occMessage.setSeverity(severity);
		
		occMessage.setMSgSendDate(getDate());
		System.out.println("OccMessageNewLocalServiceImpl.saveMsg()");
		updateOccMessageNew(occMessage);
		System.out.println("OccMessageNewLocalServiceImpl.saveMsg()");
		return 1;
	}
	
	public List<OccMessageNew> getMsgList(String listName){
		
		System.out.println("OccMessageLocalServiceImpl.getMsgList(): "+listName);
		List<OccMessageNew> list = occMessageNewFinder.getMsgList(listName);
		System.out.println("MSG List :: "+list);
		return list;
	}
	
	
	public List<OccMessageNew> getMsgsAlert(){
		System.out.println("OccMessageNewLocalServiceImpl.getMsgsAlert()");
		List<OccMessageNew> list = occMessageNewFinder.getMsgsAlert();
		System.out.println("MSG List :: "+list);
		return list;
	}
	
	
	
	public String getDate(){
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		// Get the date today using Calendar object.
		Date dateNew = new Date();
        System.out.println(dateFormat.format(dateNew));
		/*Date today = Calendar.getInstance().getTime();    
		// Using DateFormat format method we can create a string 
		// representation of a date with the defined format.
		String cDate = dateFormat.format(today);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date;
		long millis = 0;
		long hm =19800000;
		try {
			date = sdf.parse(cDate);
			millis = date.getTime();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long currentDateTime = millis + hm;
		//creating Date from millisecond
	       Date currentDate = new Date(currentDateTime);
	       DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	       
	     //Converting milliseconds to Date using Calendar
	       Calendar cal = Calendar.getInstance();
	       cal.setTimeInMillis(currentDateTime);
	       String sysdate =  df.format(cal.getTime());
		
		System.out.println("Date => "+millis);
		System.out.println(" sysdate => "+sysdate);
		
		return sysdate;*/
        return dateFormat.format(dateNew);
	}



	
	
}