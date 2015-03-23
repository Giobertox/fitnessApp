package com.giobertox.service;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class TimeServiceImpl implements TimeService {

	@Override
	public DateTime now() {

		return new DateTime(DateTimeZone.UTC);
	}

}
