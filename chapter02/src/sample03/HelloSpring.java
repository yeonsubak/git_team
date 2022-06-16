package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SungJuk sungJuk = (SungJuk) context.getBean("sungJukImpl");
		sungJuk.calcTot();
		sungJuk.calcAvg();
		System.out.println("SungJukImpl - Constructor Injection");
		sungJuk.display();
		System.out.println();
		sungJuk.modify();
		System.out.println();
		
		sungJuk = (SungJuk) context.getBean("sungJukDTO");
		System.out.println("SungJukDTO - Setter Injection");
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		System.out.println();
		sungJuk.modify();
	}

}
