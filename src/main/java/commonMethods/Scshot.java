package commonMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Scshot extends TestBase{
	
	public void screensht() throws IOException {
		File scfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scfile, new  File("C:\\Users\\kiran\\eclipse-workspace\\9pmprojectnew\\resources\\scrnshot\\error12.png"));
		
		
	}

}
