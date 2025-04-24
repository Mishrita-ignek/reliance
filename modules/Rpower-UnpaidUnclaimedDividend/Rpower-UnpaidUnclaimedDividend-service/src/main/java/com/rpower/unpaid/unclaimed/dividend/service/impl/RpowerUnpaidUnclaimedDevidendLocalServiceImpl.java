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

package com.rpower.unpaid.unclaimed.dividend.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend;
import com.rpower.unpaid.unclaimed.dividend.model.impl.RpowerUnpaidUnclaimedDevidendImpl;
import com.rpower.unpaid.unclaimed.dividend.service.base.RpowerUnpaidUnclaimedDevidendLocalServiceBaseImpl;
import com.rpower.unpaid.unclaimed.dividend.service.persistence.RpowerUnpaidUnclaimedDividendFinder;

/**
 * The implementation of the rpower unpaid unclaimed devidend local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rpower.unpaid.unclaimed.dividend.service.RpowerUnpaidUnclaimedDevidendLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RpowerUnpaidUnclaimedDevidendLocalServiceBaseImpl
 * @see com.rpower.unpaid.unclaimed.dividend.service.RpowerUnpaidUnclaimedDevidendLocalServiceUtil
 */
public class RpowerUnpaidUnclaimedDevidendLocalServiceImpl
	extends RpowerUnpaidUnclaimedDevidendLocalServiceBaseImpl {
	
		public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendData(String FOLIO_NO_OF_ITIES)
	  {
		System.out.println("RpowerUserUnpaidUnclaimedDevidendLocalServiceImpl.getUnpaidUnclaimedDevidendData()");
	  List<RpowerUnpaidUnclaimedDevidend> devidendsRecords = this.rpowerUnpaidUnclaimedDevidendFinder.getUnpaidUnclaimedDevidend(FOLIO_NO_OF_ITIES);
	    System.out.println("devidendsRecords - "+devidendsRecords);
	    List<RpowerUnpaidUnclaimedDevidend> devidendsRecord = new ArrayList<>();
	    if (Validator.isNotNull(devidendsRecords)) {
	      for (RpowerUnpaidUnclaimedDevidend unpaidUnclaimedDevidend : devidendsRecords)
	      {
	    	  RpowerUnpaidUnclaimedDevidend unclaimedDevidend = new RpowerUnpaidUnclaimedDevidendImpl();
	        unclaimedDevidend.setFOLIO_NO_OF_ITIES(unpaidUnclaimedDevidend.getFOLIO_NO_OF_ITIES());
	        unclaimedDevidend.setPROPOSED_DATE_TRANSFER_IPEF(unpaidUnclaimedDevidend.getPROPOSED_DATE_TRANSFER_IPEF());
	        unclaimedDevidend.setAMOUNT_DUE_IN_RS(unpaidUnclaimedDevidend.getAMOUNT_DUE_IN_RS());
	        unclaimedDevidend.setFIRST_NAME(unpaidUnclaimedDevidend.getFIRST_NAME());
	        unclaimedDevidend.setMIDDLE_NAME(unpaidUnclaimedDevidend.getMIDDLE_NAME());
	        unclaimedDevidend.setLAST_NAME(unpaidUnclaimedDevidend.getLAST_NAME());
	        devidendsRecord.add(unclaimedDevidend);
	      }
	    }
	    return devidendsRecord;
	  }

	
		public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendNew(String FOLIO_NO_OF_ITIES) {
			return rpowerUnpaidUnclaimedDevidendFinder.getUnpaidUnclaimedDevidendNew(FOLIO_NO_OF_ITIES);
			}
	
		public List<RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendNewFinder(String FOLIO_NO_OF_ITIES){
			return this.rpowerUnpaidUnclaimedDevidendPersistence.findByFOLIO_NO_OF_ITIES(FOLIO_NO_OF_ITIES);
											}
}