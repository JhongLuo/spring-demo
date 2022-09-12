package jhong.springdemo;

import java.util.Random;

public class TellFortuneService implements FortuneService {

	private String[] fortunes = {"calm down", "hold on", "have fun"};
	
	private Random rd = new Random();
	
	
	public String[] getFortunes() {
		return fortunes;
	}


	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}


	public Random getRd() {
		return rd;
	}


	public void setRd(Random rd) {
		this.rd = rd;
	}


	public String getFortune() {
		return fortunes[rd.nextInt(3)];
	}

}
