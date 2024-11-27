package fitPeoAssignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/"); 
		driver.findElement(By.xpath("(//div[@class='satoshi MuiBox-root css-5ty6tm'])[5]")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//span[@class=\"MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh\"]"));
		act.dragAndDropBy(element, 94,0).perform();
		Thread.sleep(2000); 
        WebElement element1=driver.findElement(By.xpath("//input[@type='number']"));
        element1.sendKeys("560");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("560");
		Thread.sleep(2000);
	    boolean b=driver.findElement(By.xpath("//input[@type='number']")).isDisplayed();
	    System.out.println(b);
	    jse.executeScript("window.scrollBy(0,400);");
	    Thread.sleep(3000); 
	    WebElement CPT99091=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	    CPT99091.click();
	    Thread.sleep(1000); 
	    WebElement CPT99453=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	    CPT99453.click();
	    Thread.sleep(1000); 
	    WebElement CPT99454=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	    CPT99454.click();
	    Thread.sleep(1000); 
	    WebElement CPT99474=driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
	    CPT99474.click();
	    WebElement TotalRecurringReimbursement=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[4]"));
	    String value=TotalRecurringReimbursement.getText();
	    System.out.println(value);
	    //driver.close();
	}

}
