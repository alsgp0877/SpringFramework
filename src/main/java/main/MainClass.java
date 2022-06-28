package main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import beans.HelloWorld;
import beans.TestBean;

public class MainClass {
	
	public static void main(String[] args) {
		
		test1();
		test2();
		test3();
		test4();
	}
	
	//스프링에서 제공하는 함수
	//ClassPathResource jar,war 내에서 찾는다. 주로 src/main/resources아래 파일을을 사용하는데 이용된다.
	//FileSystemResource 실제 파일 시스템 내에서 파일을 찾는다. 
	public static void test1(){
		//xml 파일만 생성하고 객체 생성안한다.
		ClassPathResource res = new ClassPathResource("config/beans.xml");
		XmlBeanFactory facotry = new XmlBeanFactory(res);

		//이렇게 따로 생성하고 주소가 만들어진다. 
		TestBean t1 = facotry.getBean("t1",TestBean.class);
		System.out.printf("t1:%s\n", t1);
	}
	
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory facotry = new XmlBeanFactory(res);

		TestBean t1 = facotry.getBean("t1",TestBean.class);
		System.out.printf("t1:%s\n", t1);
	}
	
	//패키지내부
	public static void test3() {
		//따로 설정하지 않으면 bean.xml에 설정되있는 bean 객체들이 자동으로 다 생성이된다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		//이미 만들어져 있는 주소값의 객체를 받아서 사용하는거다.
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t1:%s\n", t1);
		
		ctx.close();
	}
	
	//패키지외부
	public static void test4() {
		//따로 설정하지 않으면 bean.xml에 설정되있는 bean 객체들이 자동으로 다 생성이된다.
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		//이미 만들어져 있는 주소값의 객체를 받아서 사용하는거다.
		TestBean t1 = ctx.getBean("t1",TestBean.class);
		System.out.printf("t1:%s\n", t1);
		
		ctx.close();
	}

}
