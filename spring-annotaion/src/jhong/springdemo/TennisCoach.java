package jhong.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
//	public FortuneService getFortuneService() {
//		return fortuneService;
//	}

//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		System.out.println("TennisCoach: doSomeCrazyStuff");
//		this.fortuneService = fortuneService;
//	}
//	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("TennisCoach: settet for FortuneService");
//		this.fortuneService = fortuneService;
//	}

	public TennisCoach() {
		System.out.println("TennisCoach: constructor with no args");
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: post constructor");
		
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: pre destroy");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
