package step_def;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class yoyaloginstepfs {
	WebDriver driver;
	
	@Given("^��yoya��¼ҳ�� \"([^\"]*)\"$")
	public void ��yoya��¼ҳ��(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver = new ChromeDriver();
		driver.get("http://www.yoya.com/");
		Thread.sleep(3000);
	}

	@Then("^���yoyaҳ���Ƿ��$")
	public void ���yoyaҳ���Ƿ��() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals("��ѿ�� ����������- www.yoya.com", driver.getTitle());
		Thread.sleep(3000);
	}

	@Given("^������̵�¼����$")
	public void ������̵�¼����() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	    driver.findElement(By.id("_yoya_login")).click();
		Thread.sleep(3000);
	}

	@Then("^����¼ҳ���Ƿ��$")
	public void ����¼ҳ���Ƿ��() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(driver.findElement(By.id("_pop_user_login")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail"); 
	      } 
		Thread.sleep(3000);
	}

	@When("^�����û��� \"([^\"]*)\" ���� \"([^\"]*)\"$")
	public void �����û���_����(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		driver.findElement(By.id("_pop_user_name")).sendKeys(username);
		driver.findElement(By.id("_pop_password")).sendKeys(password);
		driver.findElement(By.id("_pop_user_login")).click();
		Thread.sleep(3000);
	}

	@Then("^����Ƿ��¼�ɹ� \"([^\"]*)\"$")
	public void ����Ƿ��¼�ɹ�(String exceptText) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals(exceptText, driver.getTitle());
		driver.close();
		
	}

}
