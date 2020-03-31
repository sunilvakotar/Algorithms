package com.sunil.pack;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class DateWithTimeZone extends Date {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1682688627798117988L;

	private static Map<Integer, TimeZone> timeZoneMap = new HashMap<Integer, TimeZone>();

	private TimeZone timeZone;

	public DateWithTimeZone(long time) {
		super(time);
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public static TimeZone getTimeZoneFromGMTOffset(int offset) {
		if (timeZoneMap.containsKey(offset)) {
			return timeZoneMap.get(offset);
		}
		TimeZone tZone = null;
		for (String id : TimeZone.getAvailableIDs()) {
			TimeZone tz = TimeZone.getTimeZone(id);
			// System.out.println(tz.getDisplayName() + ":" +
			// tz.getRawOffset()/1000/60);
			if (tz.getOffset(new Date().getTime()) == offset) {
				tZone = tz;
				timeZoneMap.put(offset, tz);
				break;
			}
		}

		return tZone;
	}
}
