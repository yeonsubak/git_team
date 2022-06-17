package sample01;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean = new MessageBean();
		messageBean.sayHello("Spting");
		
		HelloSpring helloSpring = new HelloSpring();
		helloSpring.yeonsu();
		
	}

	public void yeonsu() {
		System.out.println("박연수입니다.");
	}
	
}
