package com.demo.bean;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;






public class AspectTest {

	
	public void beforeMethod(JoinPoint joinpoint){	
		System.out.println(Arrays.asList(joinpoint.getArgs()));
		System.out.println("���÷���֮ǰ");
	}
	
	public void afterMethod(){
		System.out.println("���÷���֮��");
	}
	
}
