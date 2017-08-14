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
			
			/*Browser.OpenBrowser("chrome", "https://www.google.co.in/");
			Result.takescreenshot("check");*/
			setUp();
			testGooglePageTitleInIEBrowser();
			tearDown();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	
//	static String driverPath = "D:\\Chrome_Drivers\\chromedriver2.31\\";
	//public static RemoteWebDriver driver;
	public static ThreadLocal<RemoteWebDriver> cDriver = new ThreadLocal<RemoteWebDriver>();
	public static void setUp() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", Driver.basepth.get()+"\\chromedriver.exe");
		Driver.cDriver.set(new ChromeDriver());
		((WebDriver) Driver.cDriver).manage().window().maximize();
	}
	
	public static void testGooglePageTitleInIEBrowser() throws InterruptedException {
		
		((WebDriver) Driver.cDriver).navigate().to("http://chatbotui.eu-gb.mybluemix.net/");
		((WebDriver) Driver.cDriver).get("http://chatbotui.eu-gb.mybluemix.net/");
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait((WebDriver) cDriver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@target='_blank' and text()='Tour of Heroes']")));
		if((((WebDriver) Driver.cDriver).findElement(By.xpath("//a[@target='_blank' and text()='Tour of Heroes']")).isDisplayed())){
			System.out.println("The Links are Displayed");
			Result.takescreenshot("check");
		}else{
			System.out.println("The Links are not Displayed");
			//Result.takescreenshot("check");
		}
	}

	public static void tearDown() {
		if((WebDriver) Driver.cDriver!=null) {
			System.out.println("Closing Chrome browser");
			((WebDriver) Driver.cDriver).quit();
		}
	}
	
	
}
