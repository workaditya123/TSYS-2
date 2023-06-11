package test1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","G:\\Automation Data\\PATH\\Chrome Path\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement search=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	search.sendKeys("pushpa");
	search.sendKeys(Keys.ENTER);
	WebElement wikipedia=driver.findElement(By.xpath("//h3[text()='Pushpa: The Rise']"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView;",wikipedia );
	wikipedia.click();
	WebElement releaseDate=driver.findElement(By.xpath("//div[text()='Release date']"));
    //JavascriptExecutor js1=(JavascriptExecutor)driver;
    //js.executeScript("arguments[0].scrollIntoView;",releaseDate );
	WebElement wiki=driver.findElement(By.xpath("(//i[contains(text(),'Pushpa: The Rise')])[1]"));
	//String wiki1 = wiki.getText();
	System.out.println(wiki.getText());
	driver.close();
	WebElement wiki1=driver.findElement(By.xpath("(//i[contains(text(),'Pushpa: The Rise')])[1]"));
	Actions act= new Actions(driver);
	act.click();
	
	
	
	
	
	
}
}

