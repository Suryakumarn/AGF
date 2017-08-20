package Libraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common extends Driver 
{ 

	public static void openbw()
	{
		try
		{

			Browser.OpenBrowser("chrome", "http://chatbotui.eu-gb.mybluemix.net/");
			Result.takescreenshot("check");
			Browser.testGooglePageTitleInIEBrowser();
			Browser.tearDown();
			
		/*	setUp();
			Browser.testGooglePageTitleInIEBrowser();
			tearDown();*/
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	
//	static String driverPath = "D:\\Chrome_Drivers\\chromedriver2.31\\";
	//public static RemoteWebDriver driver;
	/*public static void setUp() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", Driver.basepth.get()+"//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void testGooglePageTitleInIEBrowser() throws InterruptedException {

		driver.navigate().to("http://chatbotui.eu-gb.mybluemix.net/");
		driver.get("http://chatbotui.eu-gb.mybluemix.net/");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@target='_blank' and text()='Tour of Heroes']")));
		if((driver.findElement(By.xpath("//a[@target='_blank' and text()='Tour of Heroes']")).isDisplayed()) && 
				(driver.findElement(By.xpath("//a[@target='_blank' and text()='CLI Documentation']")).isDisplayed()) && 
				(driver.findElement(By.xpath("//a[@target='_blank' and text()='Angular blog']")).isDisplayed())){
			System.out.println("The Links are Displayed");
			Result.takescreenshot("check");
		}else{
			System.out.println("The Links are not Displayed");
		}
	}*/

/*	public static void tearDown() {
		if(cDriver!=null) {
			System.out.println("Closing Chrome browser");
			((WebDriver) cDriver).quit();
		}
	}*/
	
	
}
