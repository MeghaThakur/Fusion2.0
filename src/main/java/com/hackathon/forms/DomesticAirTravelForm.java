package com.hackathon.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.hackathon.BaseSetup;
import com.hackathon.bean.Data;

public class DomesticAirTravelForm extends BaseSetup {

	public DomesticAirTravelForm() {
		PageFactory.initElements(BaseSetup.driver, this);
	}

	public void clickSearch(String test, String message) {
		WebElement SearchButton = driver.findElement(By.id(test));
		SearchButton.click();
		SearchButton.sendKeys(" " + message);
	}

	public void fillForm() throws InterruptedException {
		for (Data model : BaseSetup.dataArray) {
			Thread.sleep(1000);
			System.out.println("Elements inside dataArray in DomesticAirTravelForm");
			System.out.println(model.getId() + "=" + model.getValue());
			WebElement SearchButton = driver.findElement(By.id(model.getId()));
			SearchButton.click();
			SearchButton.sendKeys(model.getValue());
		}
		// WebElement SearchButton = driver.findElement(By.id(test));
		// SearchButton.click();
		// SearchButton.sendKeys(" " + message);
	}

	public void submit() {
		WebElement SearchButton = driver.findElement(By.linkText("submit"));
		SearchButton.click();
	}

}
