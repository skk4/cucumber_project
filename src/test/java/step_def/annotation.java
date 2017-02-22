package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;

public class annotation {
	
	
	WebDriver driver;
	
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
	     // driver.close(); 
	}
	
	
	@��("^�����¼����$")
	public void clicklgButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("_yoya_login")).click();
		Thread.sleep(3000);
	}

	@��ô("^�µĵ�¼��������$")
	public void userlgButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(driver.findElement(By.id("_pop_user_login")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	}

	@����("^�����û�������$")
	public void inputLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("_pop_user_name")).sendKeys("xiesj");
		driver.findElement(By.id("_pop_password")).sendKeys("123456");
		Thread.sleep(3000);
	}

	@��("^�����¼$")
	public void userLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("_pop_user_login")).click();
		Thread.sleep(3000);
	}

	@��ô("^����¼�ɹ�$")
	public void ����¼�ɹ�() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		if(driver.findElement(By.id("lsmenu_head_img")).isEnabled()) { 
	         System.out.println("Test 2 Pass"); 
	      } else { 
	         System.out.println("Test 2 Fail"); 
	      } 
		
	}
	
	@��ô("^���ر������$")
	public void closeBrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.close();
	}

}
