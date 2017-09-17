package com.gaet.formacion.testingAgile.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gfiSteps {
	
	 WebDriver driver = null; 
	
	@Given("^I visit YouTube home page$")
	public void i_visit_YouTube_home_page() throws Throwable {
	    
		driver = new FirefoxDriver(); 
		driver.navigate().to("https://www.youtube.com/");  
	}

	@When("^I search for \"(.*?)\"$")
	public void i_search_for(String arg1) throws Throwable {
		driver.findElement(By.name("search_query")).sendKeys(arg1);
		driver.findElement(By.id("search-icon-legacy")).click();
	}

	@Then("^I click on element Sobre Gfi$")
	public void i_click_on_element_Sobre_Gfi() throws Throwable {
		
		driver.findElement((By.xpath("//span[@title='Sobre Gfi']"))).click();
		
	}

	@Then("^I wait (\\d+) seconds$")
	public void i_wait_seconds(int arg1) throws Throwable {
	    
		int numMiliseconds = arg1*1000;
		TimeUnit.MILLISECONDS.sleep(numMiliseconds);
		driver.close();

	}

}
