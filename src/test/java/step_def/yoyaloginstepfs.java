package step_def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class yoyaloginstepfs {
	WebDriver driver;
	
	@Given("^打开yoya登录页面 \"([^\"]*)\"$")
	public void openYoya(String base) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver = new ChromeDriver();
		driver.get("http://www.yoya.com/");
		Thread.sleep(5000);
	}

	@Then("^检查yoya页面是否打开$")
	public void checkYoya() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("优芽网 帮您更优秀- www.yoya.com", driver.getTitle());
		Thread.sleep(5000);
	}

	@Given("^点击立刻登录按键$")
	public void loginYoya() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);
	    driver.findElement(By.id("_yoya_login")).click();
		Thread.sleep(5000);
	}

	@Then("^检查登录页面是否打开$")
	public void checkLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);
		if(driver.findElement(By.id("_pop_user_login")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
		Thread.sleep(5000);
	}

	@When("^输入用户名 \"([^\"]*)\" 密码 \"([^\"]*)\"$")
	public void loginIn(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		Thread.sleep(5000);
		driver.findElement(By.id("_pop_user_name")).sendKeys(username);
		driver.findElement(By.id("_pop_password")).sendKeys(password);
		driver.findElement(By.id("_pop_user_login")).click();
		Thread.sleep(5000);
	}

	@Then("^检查是否登录成功 \"([^\"]*)\"$")
	public void checkSignin(String exceptText) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Thread.sleep(5000);
		Assert.assertEquals(exceptText, driver.getTitle());
		driver.close();
		Thread.sleep(5000);
		
	}

}
