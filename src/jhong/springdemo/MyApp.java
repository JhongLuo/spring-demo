package jhong.springdemo;

public class MyApp {
	public static void main(String[] args) {
		Coach theCoath = new TrackCoach(new HappyFortuneService());
		System.out.println(theCoath.getDailyWorkout());
	}
}
