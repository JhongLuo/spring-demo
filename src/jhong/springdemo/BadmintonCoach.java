package jhong.springdemo;

public class BadmintonCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Play badminton for 2 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
