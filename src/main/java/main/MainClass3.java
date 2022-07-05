package main;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
		
		List<Object> list = obj2.getList();
		for(Object value : list) {
			System.out.printf("obj2.list:%s\n", value);
		}
		
		Set<Object> set = obj2.getSet();
		for(Object value : set) {
			System.out.printf("obj2.set:%s\n", value);
		}
		
		Map<String,Object> map = obj2.getMap();
		String a1=  (String) map.get("a1");
		HelloWorldEn a2 = (HelloWorldEn) map.get("a2");
		
		System.out.printf("obj2.map:%s\n", a1);
		System.out.printf("obj2.map:%s\n", a2);
		
		Properties properties = obj2.getProperties();
		String p1 = properties.getProperty("p1");
		System.out.printf("obj2.properties:%s\n", p1);
		
		
		TestBean3 obj3 = ctx.getBean("obj3",TestBean3.class);
		System.out.printf("obj3.data4:%s\n", obj3.getData4());
		System.out.printf("obj3.data5:%s\n", obj3.getData5());
		
		TestBean3 obj4 = ctx.getBean("obj4",TestBean3.class);
		System.out.printf("obj4.data6:%s\n", obj4.getData6());


		ctx.close();
	}


}
