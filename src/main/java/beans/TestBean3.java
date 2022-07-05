package beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean3{

	private int data1;
	private double data2;
	private String data3;
	private HelloWorldEn data4;
	private HelloWorldKo data5;
	private HelloWorldJp data6;
	private HelloWorldUk data7;
	private List<Object> list;
	private Set<Object> set;
	private Map<String,Object> map;
	private Properties properties;
	
	public TestBean3() {
		System.out.println("TestBean3 기본 생성자");
		this.data1=0;
		this.data2=0.0;
		this.data3=null;
		this.data4=null;
		this.data5=null;
	}
	
	public TestBean3(int data1,HelloWorldEn data4) {
		System.out.println("TestBean3 int,객체변수");
		this.data1=data1;
		this.data2=0.0;
		this.data3=null;
		this.data4=data4;
	}
	
	public TestBean3(HelloWorldUk data7) {
		this.data7=data7;
	}

	public double getData2() {
		return data2;
	}

	public void setData2(double data2) {
		this.data2 = data2;
	}

	public String getData3() {
		return data3;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}
	
	
	
	public HelloWorldEn getData4() {
		return data4;
	}

	public void setData4(HelloWorldEn data4) {
		this.data4 = data4;
	}

	public HelloWorldKo getData5() {
		return data5;
	}

	public void setData5(HelloWorldKo data5) {
		this.data5 = data5;
	}
	
	public HelloWorldJp getData6() {
		return data6;
	}

	public void setData6(HelloWorldJp data6) {
		this.data6 = data6;
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}

	
	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	
	

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void printData() {
		System.out.printf("data1:%d\n",data1);
		System.out.printf("data2:%f\n",data2);
		System.out.printf("data3:%s\n",data3);
		System.out.printf("data4:%s\n",data4);
		System.out.printf("data5:%s\n",data5);
	}
	
	

	
}
