package com.giobertox.service;

import org.joda.time.DateTime;

public interface TimeService {

	// ISO-8610 standard
	public String formatISO_8610 = " yyyy-MM-dd";

	// DateTime now();

	DateTime now();

}
