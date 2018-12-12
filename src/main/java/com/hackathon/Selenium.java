package com.hackathon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(Selenium.class, args);

		// JUnitCore junit = new JUnitCore();
		// junit.addListener(new TextListener(System.out));
		// Result result = junit.run(PopulateFusionPage.class);
		// Result result = junit.run(PopulateFusionPage.class);
		// Thread.sleep(7000);
		// System.out.println("Test case results" + result.getRunCount());
	}
}
