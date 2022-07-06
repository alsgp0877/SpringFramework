package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import beans.TestBean;
import beans.TestBean2;

@Configuration
public class beans {
	
	@Bean(name="java2")
	@Lazy
	@Scope("prototype")
	//@Primary
	public TestBean java1() {
		TestBean t1 = new TestBean();
		return t1;
		
	}
	
	@Bean
	@Primary
	public TestBean2 java2() {
		TestBean2 t1 = new TestBean2();
		return t1;
		
	}
	
	@Bean
	public TestBean2 java3() {
		TestBean2 t1 = new TestBean2();
		return t1;
		
	}

}
