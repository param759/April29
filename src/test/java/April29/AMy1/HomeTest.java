package April29.AMy1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeTest {
public WebDriver driver;
	@Test
	public void goal()
	{
		System.out.println("workto be done");
	}
	
	@Test
	public void goal2()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\15199\\Desktop\\latestchrome\\chromedriver.exe");
		 driver=new ChromeDriver();	
		 driver.get("https://www.salesforce.com/ca/?ir=1");
	}
	
	@Test
	public void goal3()
	{
		System.out.println("driver not done");
	}
	
	@Test
	public void goal4()
	{
		System.out.println("home work");
	}
}
