package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Calc calc = (Calc)context.getBean("calcAdd");
		calc.calculate(25, 36);
		
		calc = (Calc)context.getBean("calcMul");
		calc.calculate(25, 36);
	}

}
