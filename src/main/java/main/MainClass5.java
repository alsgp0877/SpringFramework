package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.TestBean;
import beans.TestBean2;
import beans.TestBean4;
import beans.TestBean5;
import config.beans;

public class MainClass5 {
	
	public static void main(String[] args) {
		//xml을 사용하는 방식
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config/beansA.xml");
		
		TestBean5 xml6 = ctx1.getBean("xml6",TestBean5.class);
		System.out.printf("xml6:%d\n", xml6.getData1());		
		System.out.printf("xml6:%s\n", xml6.getData2());		

		ctx1.close();
		
		System.out.println("=================================");

		
		//java 파일을 사용하는 방식
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(beans.class);
		
		TestBean5 java6 = ctx2.getBean("java6",TestBean5.class);
		System.out.printf("java6:%d\n", java6.getData1());		
		System.out.printf("java6:%d\n", java6.getData2());		

		ctx2.close();
				
	}
	
}
