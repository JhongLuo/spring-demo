package jhong.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;


@PropertySource("sport.properties")
public class SportConfig {
	@Bean
	public FortuneService sadFortuneService() {
		System.out.println("in config : sadFortuneService");
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		System.out.println("in config : swimCoach");
		return new SwimCoach(sadFortuneService());
	}
}
