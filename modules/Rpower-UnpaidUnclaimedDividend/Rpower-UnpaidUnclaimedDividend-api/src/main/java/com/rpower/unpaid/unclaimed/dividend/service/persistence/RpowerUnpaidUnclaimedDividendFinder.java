package com.rpower.unpaid.unclaimed.dividend.service.persistence;

import java.util.List;

import com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public interface RpowerUnpaidUnclaimedDividendFinder {

	public java.util.List<com.rpower.unpaid.unclaimed.dividend.model.RpowerUnpaidUnclaimedDevidend> getUnpaidUnclaimedDevidend(
			java.lang.String FOLIO_NO_OF_ITIES);
}
