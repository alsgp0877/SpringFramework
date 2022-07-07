package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;


public class TestBean5{

	private int data1;
	private HelloWorldKo data2;
	
	public TestBean5() {
		this.data1=0;
		this.data2=null;
	}
	
	public TestBean5(int data1,HelloWorldKo data2) {
		this.data1=data1;
		this.data2=data2;
	}
	
	public HelloWorldKo getData2() {
		return data2;
	}
	
	
	@Autowired
	public void setData2(HelloWorldKo data2) {
		this.data2 = data2;
	}


	public int getData1() {
		return data1;
	}

	
	public void setData1(int data1) {
		this.data1 = data1;
	}
	

	

	
}
