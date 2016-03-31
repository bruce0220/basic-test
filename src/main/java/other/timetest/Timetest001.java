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
 * @date 2015Äê10ÔÂ21ÈÕ
 * @version 1.0.0
 */
public class Timetest001 {

	/**
	 * 
	 */
	public Timetest001() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 String[] zones = TimeZone.getAvailableIDs();
		 for (String zone : zones) {
			System.out.println(zone);
		}
		 
		 Date at = new Date(1446090760931L);
		 System.out.println(at);
		 
//		 TimeZone tz = TimeZone.getDefault();
//		 TimeZone tz = TimeZone.getTimeZone("Asia/Chongqing");
//		 TimeZone tz = TimeZone.getTimeZone("Asia/Hong_Kong");
		 TimeZone tz = TimeZone.getTimeZone("America/Fortaleza");
//		 TimeZone tz = TimeZone.getTimeZone("Etc/GMT-4");
		 System.out.println(tz);
		 System.out.println(tz.getID());
		 System.out.println(tz.getRawOffset());
		 System.out.println(tz.getOffset(System.currentTimeMillis()));
		 
		 Calendar cal = Calendar.getInstance();
		 System.out.println(cal);
		 System.out.println(cal.getTime().getTime());
		 cal.setTimeInMillis(0L);
		 System.out.println(cal);
		 System.out.println(cal.getTime().getTime());
		 cal.setTimeZone(tz);
		 System.out.println(cal);
		 System.out.println(cal.getTime().getTime());
		 
		 
		 DateFormat df = new SimpleDateFormat(); 
		 df.setTimeZone(tz);
		 System.out.println(df.format(cal.getTime()));;
	}

}
