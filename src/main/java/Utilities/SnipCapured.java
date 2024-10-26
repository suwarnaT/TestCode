package Utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class SnipCapured 
{
	 public static void captiredScreenshot(WebDriver driver, String screenshotName,String testCaseId) throws Exception
	  {
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  File DestFile=new File("C:\\Users\\Shree\\eclipse-workspace\\Project\\ScreenshotStore"+testCaseId+screenshotName+".png");
		  FileUtils.copyFile(SrcFile, DestFile);
	  }

}
