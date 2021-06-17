package com.atguigu.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testHello(){
		Hello hello = new Hello();
		String results = hello.sayHello("litingwei");
		assertEquals("Hello litingwei!",results);	 //╤оят
		System.out.print(results);
		
	}

}
