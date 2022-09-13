package jhong.springdemo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	private ArrayList<String> data = new ArrayList<String>();
	
	private Random myRandom = new Random();
	
	@PostConstruct
	public void getDataFromFile() {		
		try (FileReader fr = new FileReader(System.getProperty("user.dir") + "/src/fortuneCookies.txt")) {
			while (true) {
	        	StringBuilder sb = new StringBuilder();
	        	while (true) {
	        		int c = fr.read();
	        		if (c == -1 || c == (int)'\n')
	        			break;
	        		sb.append((char) c);
	        	}
	        	if (sb.toString().equals(""))
	        		break;
	        	data.add(sb.toString());
	        }	
		} catch (Exception e) {
			System.out.println("failed to load the fortune cookies.");
		}
	}
	
	
	
	@Override
	public String getFortune() {
		return data.get(myRandom.nextInt(data.size()));
	}

}
