package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpting {

	public static void main(String[] args) {
//		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		MessageBean messageBean = (MessageBean)context.getBean("messageBean");
	
		messageBean.sayHello("Spring");
		System.out.println("----------------");
		
		MessageBean messageBean2 = context.getBean("messageBean",MessageBean.class);
		messageBean2.sayHello("Spring");
		System.out.println("----------------");
		
		MessageBean messageBean3 = (MessageBean)context.getBean("messageBean");
		messageBean3.sayHello("Spring");
		System.out.println("----------------");
		
		//싱글 톤
	}

}
