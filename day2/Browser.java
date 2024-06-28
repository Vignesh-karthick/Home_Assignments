package week1.day2;

public class Browser {
	
	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		
		return browserName;
	}
      
	public void loadUrl() {
		System.out.println("Application URL loaded successfully");
	}
       
	public static void main(String[] args) {
		
		Browser browser = new Browser();
		String str = browser.launchBrowser("Chrome");
		System.out.println(str);
		browser.loadUrl();
		
		
		

	}

}
