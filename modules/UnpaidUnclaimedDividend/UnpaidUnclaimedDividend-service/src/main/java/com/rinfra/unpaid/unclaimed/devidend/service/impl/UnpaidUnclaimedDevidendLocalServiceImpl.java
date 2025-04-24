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

package com.rinfra.unpaid.unclaimed.devidend.service.impl;

import aQute.bnd.annotation.ProviderType;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.util.Validator;
import com.rinfra.unpaid.unclaimed.devidend.model.RpowerUnpaidUnclaimedDevidend;
import com.rinfra.unpaid.unclaimed.devidend.model.UnpaidUnclaimedDevidend;
import com.rinfra.unpaid.unclaimed.devidend.model.impl.RpowerUnpaidUnclaimedDevidendImpl;
import com.rinfra.unpaid.unclaimed.devidend.model.impl.UnpaidUnclaimedDevidendImpl;
import com.rinfra.unpaid.unclaimed.devidend.service.base.UnpaidUnclaimedDevidendLocalServiceBaseImpl;

/**
 * The implementation of the unpaid unclaimed devidend local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rinfra.unpaid.unclaimed.devidend.service.UnpaidUnclaimedDevidendLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UnpaidUnclaimedDevidendLocalServiceBaseImpl
 * @see com.rinfra.unpaid.unclaimed.devidend.service.UnpaidUnclaimedDevidendLocalServiceUtil
 */
@ProviderType
public class UnpaidUnclaimedDevidendLocalServiceImpl
	extends UnpaidUnclaimedDevidendLocalServiceBaseImpl {
	public List<UnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidendData(String FOLIO_NO_OF_ITIES)
	  {
		System.out.println("UnpaidUnclaimedDevidendLocalServiceImpl.getUnpaidUnclaimedDevidendData()");
	    List<UnpaidUnclaimedDevidend> devidendsRecords = this.unpaidUnclaimedDevidendFinder.getUnpaidUnclaimedDevidend(FOLIO_NO_OF_ITIES);
	    System.out.println("devidendsRecords - "+devidendsRecords);
	    List<UnpaidUnclaimedDevidend> devidendsRecord = new ArrayList<>();
	    if (Validator.isNotNull(devidendsRecords)) {
	      for (UnpaidUnclaimedDevidend unpaidUnclaimedDevidend : devidendsRecords)
	      {
	    	UnpaidUnclaimedDevidend unclaimedDevidend = new UnpaidUnclaimedDevidendImpl();
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
	
}