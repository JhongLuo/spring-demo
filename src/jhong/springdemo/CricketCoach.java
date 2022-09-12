package jhong.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: setemailAddress");
		this.emailAddress = emailAddress;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		System.out.println("CricketCoach: setTeam");
		this.team = team;
	}


	public CricketCoach() {
		System.out.println("CricketCoach: no arg constructor");
	}
	
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}


	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling with " + team + " for 15 minutes, contact me if neccessary: " + emailAddress;
	}
	
}
