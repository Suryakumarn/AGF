package Libraries;


public class Common extends Driver 
{
	public static void openbw()
	{
		try
		{
			
			Browser.OpenBrowser("chrome", "https://www.google.co.in/");
			Result.takescreenshot("check");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}	
	
	
}
