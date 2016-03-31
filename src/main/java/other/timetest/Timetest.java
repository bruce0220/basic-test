/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.timetest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê10ÔÂ15ÈÕ
 * @version 1.0.0
 */
public class Timetest {

	/**
	 * 
	 */
	public Timetest() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());
		
//		cal.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
//		System.out.println(cal);
//		System.out.println(cal.getTime());
//		System.out.println(cal.getTimeZone());
		
		DateFormat df = new SimpleDateFormat();
//		df.setTimeZone(TimeZone.getDefault());
		df.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println(df.format(cal.getTime()));
		
		Long l = Long.MAX_VALUE;
		Date max = new Date(l);
		System.out.println(max);
	}

}
