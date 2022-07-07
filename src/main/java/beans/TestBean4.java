package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Configuration;


public class TestBean4{

	private int data1;
	private String data2;
	private HelloWorldEn data3;
	
	
	public TestBean4(int data1, String data2,HelloWorldEn data3) {
		System.out.println("TestBean3 기본 생성자");
		this.data1=data1;
		this.data2=data2;
		this.data3=data3;
	}
	
	public TestBean4() {
		System.out.println("TestBean3 기본 생성자");
		this.data1=0;
		this.data2=null;
		this.data3=null;
	}
	public int getData1() {
		return data1;
	}
	
	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}
	
	public HelloWorldEn getData3() {
		return data3;
	}
	
	public void setData3(HelloWorldEn data3) {
		this.data3 = data3;
	}
	public void printData() {
		System.out.printf("data1:%d\n",data1);
		System.out.printf("data2:%f\n",data2);
		System.out.printf("data3:%s\n",data3);
	}
	
	

	
}
