package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.zh_cn.*;

public class annotation {
	
	
	WebDriver driver = null;
	@����("^��google�����$")
	public void openBrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver = new ChromeDriver();
	}

	@��("^��yoya\\.com��վ$")
	public void goToYoya() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.navigate().to("http://www.yoya.com/");
	}

	@��ô("^��¼��������$")
	public void loginButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(driver.findElement(By.id("_yoya_login")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	      driver.close(); 
	}

}
