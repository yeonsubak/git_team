package sample01;

public class HelloSpring {

	public static void main(String[] args) {
		MessageBean messageBean = new MessageBean();
		messageBean.sayHello("Spting");
		HelloSpring helloSpring = new HelloSpring();
		System.out.println("깃 연결 성공");
		System.out.println("박연수: commit conflict 테스트");
		System.out.println("이원형: 오늘 점심은 생선까스");
		
		System.out.println("이원형: 10분남았다");
		

		helloSpring.wonhyung();
		System.out.println("김대일: 오류 있나?");

	}
	
	public void wonhyung() {
		System.out.println("이원형");
	}

}
