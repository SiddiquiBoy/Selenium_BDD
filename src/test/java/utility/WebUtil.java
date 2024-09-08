package utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebUtil {

	// enter data into the field 
	public static void enterString(WebElement ele, String string)
	{
		ele.clear();
		ele.sendKeys(string);
	}
	// click on any button 
	public void click(WebElement ele)
	{
		ele.click();
	}
	// handle drop down - by Value
	public void selectByValue(WebElement ele,String value)
	{
		Select sc= new Select(ele);
		sc.selectByValue(value);
	}
	// handle drop down - by index
	public void selectByIndex(WebElement ele, int index)
	{
		Select sc= new Select(ele);
		sc.selectByIndex(index);
	}
	// take screenshot 
	public void takeScreenshot()
	{
		
	}
	
}
