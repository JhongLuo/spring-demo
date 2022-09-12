package jhong.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycleApplicationContext.xml");
		
		Coach Coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(Coach.getDailyFortune());
		System.out.println(Coach.getDailyWorkout());
		context.close();

	}

}
