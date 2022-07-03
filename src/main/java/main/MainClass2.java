package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloWorldEn;
import beans.TestBean;
import beans.TestBean3;

public class MainClass2 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");

		//1) 객체 생성 후 2) 값 삽입
		//그냥 일반적으로 아래와 방식으로 했던 객체 생성을 모두 bean객체 생성 방식으로 바꿀수 있다는 말이됨
		HelloWorldEn helloWorldEn = new HelloWorldEn();
		TestBean3 t1 = new TestBean3(100,helloWorldEn);
		t1.printData();

		//1) xml 파일에서 값 삽입 후 2)객체 생성
		TestBean3 obj2 = ctx.getBean("obj2",TestBean3.class);
		obj2.printData();
		

		ctx.close();
	}


}
