package com.netfinworks.common.util;

import java.util.Date;

public class DateUtil {

	public static String shortFormat = "yyyy-MM-dd";
	public static String longFormat = "yyyy-MM-dd HH:mm:ss";

	public static String format(Date date, String shortFormat2) {
		return cn.hutool.core.date.DateUtil.format(date, shortFormat2);
	}

	public static Date parseDateLongFormat(String date) {
		return cn.hutool.core.date.DateUtil.parse(date, longFormat);
	}

}
