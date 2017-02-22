package step_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.*;

public class annotation {
	
	
	WebDriver driver;
	
	@假设("^打开google浏览器$")
	public void openBrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver = new ChromeDriver();
	}

	@当("^打开yoya\\.com网站$")
	public void goToYoya() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.navigate().to("http://www.yoya.com/");
	}

	@那么("^登录按键存在$")
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
	
	
	@当("^点击登录按键$")
	public void clicklgButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("_yoya_login")).click();
		Thread.sleep(3000);
	}

	@那么("^新的登录按键存在$")
	public void userlgButton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(driver.findElement(By.id("_pop_user_login")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
	}

	@假设("^输入用户和密码$")
	public void inputLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("_pop_user_name")).sendKeys("xiesj");
		driver.findElement(By.id("_pop_password")).sendKeys("123456");
		Thread.sleep(3000);
	}

	@当("^点击登录$")
	public void userLogin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("_pop_user_login")).click();
		Thread.sleep(3000);
	}

	@那么("^检查登录成功$")
	public void 检查登录成功() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		if(driver.findElement(By.id("lsmenu_head_img")).isEnabled()) { 
	         System.out.println("Test 2 Pass"); 
	      } else { 
	         System.out.println("Test 2 Fail"); 
	      } 
		
	}
	
	@那么("^最后关闭浏览器$")
	public void closeBrowser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.close();
	}

}
