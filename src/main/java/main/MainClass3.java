package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.HelloWorldEn;
import beans.TestBean;
import beans.TestBean3;

public class MainClass3 {
	
	public static void main(String[] args) {		
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config/beans.xml");

		TestBean3 obj2 = ctx.getBean("obj2",TestBean3.class);
		System.out.printf("obj2.data2:%f\n", obj2.getData2());
		System.out.printf("obj2.data3:%s\n", obj2.getData3());
		System.out.printf("obj2.data5:%s\n", obj2.getData5());

		ctx.close();
	}


}
