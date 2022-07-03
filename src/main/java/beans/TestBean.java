package beans;

public class TestBean{

	public TestBean() {
		System.out.println("TestBean생성자");
	}
	
	public void bean_init() {
		System.out.println("TestBean의 init 메서드");
	}
	
	public void bean_destroy() {
		System.out.println("TestBean의 destroy 메서드");
	}

	
}
