package jhong.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		
		Coach firstCoach = context.getBean("myCoach", Coach.class);
		
		Coach secondCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println(firstCoach == secondCoach);
		
		System.out.println(firstCoach);
		
		System.out.println(secondCoach);
		
		context.close();
	}
}
