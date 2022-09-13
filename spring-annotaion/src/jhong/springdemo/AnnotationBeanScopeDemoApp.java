package jhong.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get bean from spring container
		Coach firstCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach secondCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on bean
		System.out.println(firstCoach == secondCoach);
		
		context.close();
	}
}
