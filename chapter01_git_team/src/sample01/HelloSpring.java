package sample01;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean = new MessageBean();
		messageBean.sayHello("Spting");
		
		System.out.println("깃 연결 성공");
		System.out.println("박연수: commit conflict 테스트");
		System.out.println("이원형: 오늘 점심은 생선까스");
		
		
		System.out.println("김대일: 오류 있나?");
		HelloSpring helloSpring = new HelloSpring();
		helloSpring.daeil();
	}
	public void daeil() {
		System.out.println("김대일");
	}
}
