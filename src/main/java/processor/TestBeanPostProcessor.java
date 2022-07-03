package processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor{
	
	//init-method가 호출되는걸 가로채는거기 때문에 init-method가 설정되어 있는 bean이름을 가져와서 설정할 수있다. 
	//bean마다 다르게 설정하고 싶으면 beanName(id)을 이용해서 하면됨
	public Object postProcessBeforeInitialization(Object bean,String beanName) throws BeansException{
		System.out.println("------------------------");
		switch(beanName) {
		case "t1":
			System.out.println("id가 t1인 bean 객체 생성");
			break;
		
		case "t2":
			System.out.println("id가 t2인 bean 객체 생성");
			break;
		}
		System.out.println("------------------------");
		return bean;
	}
	

}
