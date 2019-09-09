package com.wangshuo.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.wangshuo.common.utils.DateUtil;



 public class DateUtilTest {

	@Test
	public void testGetDateByInitMonth() {
	 
		Calendar c = Calendar.getInstance();
		c.set(2000, 5, 23);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(date));
		

	}
	
	@Test
	public void getDateByFullMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2000, 5, 23);
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(format.format(date));
	}
	
	@Test
	public void test1() {
		//获取月初
		Date date = DateUtil.getDateByInitMonth(new Date());
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		
		// 替换
		String string = sql.replace("{1}", df.format(date)).replace("{2}", df.format(date2));
		System.out.println(string);
		
	}

}
