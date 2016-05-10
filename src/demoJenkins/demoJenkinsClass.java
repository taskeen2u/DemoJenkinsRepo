package demoJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demoJenkinsClass {

	@Test
	public void testJenkins(){
		
		System.out.println("Jenkins");
		System.out.println("Welcome");
		System.out.println("Welcome to Jenkins world");
		System.out.println("New script line");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
	    driver.quit();
	}
}
