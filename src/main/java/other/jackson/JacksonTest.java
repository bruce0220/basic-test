/*
 * Copyright (c) 2015 by XuanWu Wireless Technology Co.Ltd. 
 *             All rights reserved                         
 */
package other.jackson;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 
 * @author <a href="xiangshaoxu@wxchina.com">xiangshaoxu</a>
 * @date 2015Äê12ÔÂ8ÈÕ
 * @version 1.0.0
 */
public class JacksonTest {

	/**
	 * 
	 */
	public JacksonTest() {
	
	}
	
	public static void main(String[] args) {
		JacksonTest self = new JacksonTest();
		self.m1();
	}
	
	public void m1() {
		ObjectMapper mapper = new ObjectMapper();
		
		TestJsonObj obj = new TestJsonObj();
		obj.setAint(1);
		obj.setBint(2);
		obj.setBll(true);
		obj.setDate(new Date());
		
		File f = new File("d:\\a.json");
		try {
			mapper.writeValue(f, obj);
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	class TestJsonObj {
		private int aint;
		private Integer bint;
		private String str;
		private Date date;
		private Boolean bll;
		
		
		public Boolean getBll() {
			return bll;
		}
		public void setBll(Boolean bll) {
			this.bll = bll;
		}
		public int getAint() {
			return aint;
		}
		public void setAint(int aint) {
			this.aint = aint;
		}
		public Integer getBint() {
			return bint;
		}
		public void setBint(Integer bint) {
			this.bint = bint;
		}
		public String getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		
		
		
	}

}
