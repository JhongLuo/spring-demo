package jhong.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Track Coach: " + fortuneService.getFortune();
	}
	
	public void init() {
		System.out.println("Track Coach: init");
	}
	
	public void destroy() {
		System.out.println("Track Coach: destroy");
	}
}
