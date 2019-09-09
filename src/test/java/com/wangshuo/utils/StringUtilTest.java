package com.wangshuo.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.wangshuo.common.utils.StringUtil;

public class StringUtilTest {

	@Test
	public void testHasLength() {
        String str=" ";
		
		System.out.println(StringUtil.hasLength(str));
	}

	@Test
	public void testHasText() {
		String str=" ";
		System.out.println(StringUtil.hasText(str));
	}

	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(10);
		System.out.println(string);
	}

	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(1000);
		System.out.println(string);
	}
	
	@Test
	public void testRandomChineseString2() {
		 for(int i=0;i<10;i++) {
			 String string = StringUtil.randomSimpleChinese();
			 System.out.print(string+" ");
		 }
	}

	@Test
	public void testGenerateChineseName() {
		for (int i=0;i<10; i++) {
			String string = StringUtil.generateChineseName();
			System.out.println(string);
		}
	}
	
	/**
	 * 编写一个Person类，里面有姓名(name)、年龄(age)、介绍(about)、注册日期(created)，共4个属性，然后批量生成1万个Person对象，要求：
姓名属性值调用StringUtil.generateChineseName()创建（4分）
年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
注册日期属性值模拟2010年1月1日至今任意随机时间（4分）。
批量生成1万个，并在控制台输出（4分）
	 * @Title: testGenerate 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testGenerate() {
		String name="";
		Integer age=null;
		String about="";
		Date regDate=null;
		for (int i = 0; i < 1000; i++) {
			name=StringUtil.generateChineseName();	
			new Person();
		}
		
	}
	

	
	
	

}
