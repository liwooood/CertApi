package com.cssweb.pki.caapi;

import org.springframework.context.support.ClassPathXmlApplicationContext;import java.lang.Exception;import java.lang.String;import java.lang.System;


public class Consumer {

public static void main(String[] args) throws Exception {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
	context.start();

	DemoService demoService = (DemoService)context.getBean("demoService"); // ��ȡԶ�̷������
	String hello = demoService.sayHello("world"); // ִ��Զ�̷���

	System.out.println(hello);
}
}