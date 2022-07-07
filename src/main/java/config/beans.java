package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import beans.HelloWorldEn;
import beans.TestBean;
import beans.TestBean2;
import beans.TestBean4;
import beans.TestBean5;

@Configuration
public class beans {
	
	//@Bean(name="java2",initMethod="bean_init", destroyMethod="bean_destroy")
	//@Lazy
	//@Scope("prototype")
	public TestBean java1() {
		TestBean t1 = new TestBean();
		return t1;
		
	}
	
	//@Bean
	//@Primary
	public TestBean2 java2() {
		TestBean2 t1 = new TestBean2();
		return t1;
		
	}
	
	//@Bean
	public TestBean2 java3() {
		TestBean2 t1 = new TestBean2();
		return t1;
		
	}
	
	//생성자주입
	//@Bean
	public TestBean4 java4() {
		TestBean4 t1 = new TestBean4(200,"문자열",new HelloWorldEn());
		return t1;
		
	}
	//setter주입
	//@Bean
	public TestBean4 java5() {
		TestBean4 t1 = new TestBean4();
		t1.setData1(400);
		t1.setData2("문자열");
		t1.setData3(new HelloWorldEn());
		
		return t1;
		
	}
	
	@Bean
	public TestBean5 java6() {
		return new TestBean5();
		
	}
	
	

}
