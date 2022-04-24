package abstracts.Interface.Practice;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClientMachine {
	
	public static void main(String[] args) throws InterruptedException {
		String homePage="https://www.flipkart.com";
		String url="";
		int respCode=200;
		HttpURLConnection huc=null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(homePage);
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext()) {
			url=it.next().getAttribute("href");
			System.out.println(url);
			/*
			 * if(url==null || url.isEmpty()) {
			 * System.out.println("URL is either not configure for a tag"); continue; }
			 * if(!url.startsWith(homePage)) {
			 * System.out.println("URL belongs to another domain,skipping it."); continue; }
			 */
		
		try {
			huc=(HttpURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			respCode=huc.getResponseCode();
				if(respCode>=400) {
					System.out.println(url+"is a broken Link");
				}
				/*
				 * else System.out.println(url+"is a valid link");
				 */
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		}
		driver.quit();

	}
}
