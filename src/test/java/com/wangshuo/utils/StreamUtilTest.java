package com.wangshuo.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

import com.wangshuo.common.utils.StreamUtil;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String string = StreamUtil.readTextFile(new  FileInputStream("d:/test.txt"));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("d:/test.txt"));
		System.out.println(string);
	}

}
