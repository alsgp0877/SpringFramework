package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloWorld;

public class MainClass {
	
	public static void main(String[] args) {
		
		//beans.xml 파일을 로딩한다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");
		
		//xml에 정의한 bean 객체의 주소값을 가져온다.
		HelloWorld hello1 = (HelloWorld) ctx.getBean("hello");
		callMethod(hello1);
		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}