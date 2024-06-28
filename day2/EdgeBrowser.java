package week1.day2;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		Browser browser2 = new Browser();
		String str2 = browser2.launchBrowser("IE");
		System.out.println(str2);
		browser2.loadUrl();

	}

}
