package beans;

public class TestBean3{

	private int data1;
	private double data2;
	private String data3;
	private HelloWorldEn data4;
	
	public TestBean3() {
		System.out.println("TestBean3 기본 생성자");
		this.data1=0;
		this.data2=0.0;
		this.data3=null;
		this.data4=null;
	}
	
	public TestBean3(int data1,HelloWorldEn data4) {
		System.out.println("TestBean3 int,객체변수");
		this.data1=data1;
		this.data2=0.0;
		this.data3=null;
		this.data4=data4;
	}
	

	
	public void printData() {
		System.out.printf("data1:%d\n",data1);
		System.out.printf("data2:%f\n",data2);
		System.out.printf("data3:%s\n",data3);
		System.out.printf("data4:%s\n",data4);
	}
	
	

	
}
