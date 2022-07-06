package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.TestBean;
import beans.TestBean2;
import config.beans;

public class MainClass4 {
	
	public static void main(String[] args) {
		//xml을 사용하는 방식
		//ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("config/beans.xml");
		//ctx1.close();
		
		
		//ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(pageContext.getServletContext()); 
		//java 파일을 사용하는 방식
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(beans.class);
		TestBean java1 = ctx2.getBean("java2",TestBean.class);
		System.out.printf("java1:%s\n", java1);
		
		TestBean2 java2 = ctx2.getBean(TestBean2.class);
		System.out.printf("java2:%s\n", java2);
		
		ctx2.close();
				
	}
	
}
