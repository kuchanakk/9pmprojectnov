package pack1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import commonMethods.ExtntRep;
import commonMethods.Scshot;
import commonMethods.TestBase;
import exceldriven.ExcelData;
import objrep.Homepage;
import objrep.ProductDetails;

public class PoprItemsTest extends TestBase {
	
	static ExtntRep extentr;
	
	@BeforeTest
	public static void setup() {
		System.out.println("*******TEST START********");
		 extentr= new ExtntRep();
		extentr.extentsetup();
		
	}
	
	@BeforeMethod
	public static void launcbrowser() {
		
	TestBase tb = new TestBase();
	tb.Browser("chrome");
	}
	
	
	
	
	@Test
	public static void tabtest() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		Homepage hp =new Homepage(driver);
		ProductDetails pd = new ProductDetails(driver);
		Scshot sh= new Scshot();

		hp.popitem().click();
		Thread.sleep(5000);

		hp.tablink().click();
		Thread.sleep(5000);

		String actualtabtext=pd.itemstext().getText();
		ExcelData excel = new ExcelData();
		String expctedtabtext=excel.ReadData(1, 0);
		
		if(actualtabtext.contains(expctedtabtext)) {
			
			excel.writedata(1, 1, "valid data");
			extentr.pass();
			
		}else {
			
			excel.writedata(1, 1, "invalid data");
			sh.screensht();
			extentr.fail();
			
			
		}
		
		
	}
	
	@Test
	public static void laptoptest() throws InterruptedException, IOException{
		
		Thread.sleep(10000);
		Homepage hp =new Homepage(driver);
		ProductDetails pd = new ProductDetails(driver);
		Scshot sh= new Scshot();

		hp.popitem().click();
		Thread.sleep(5000);

		hp.laplink().click();
		Thread.sleep(5000);

		String actuallaptext=pd.itemstext().getText();
		ExcelData excel = new ExcelData();
		String expctedlaptext=excel.ReadData(2, 0);
		
		if(actuallaptext.contains(expctedlaptext)) {
			
			excel.writedata(2, 1, "valid data");
			extentr.pass();

			
		}else {
			
			excel.writedata(2, 1, "invalid data");
			sh.screensht();
			extentr.fail();

		}
		
		
	}
	
	@Test
	public static void spktest() throws InterruptedException, IOException {
		
		Thread.sleep(10000);
		Homepage hp =new Homepage(driver);
		ProductDetails pd = new ProductDetails(driver);
		Scshot sh= new Scshot();

		hp.popitem().click();
		Thread.sleep(5000);

		hp.spklink().click();
		Thread.sleep(5000);

		
		String actualspktext=pd.itemstext().getText();
		ExcelData excel = new ExcelData();
		String expctedspktext=excel.ReadData(3, 0);
		
		if(actualspktext.contains(expctedspktext)) {
			
			excel.writedata(3, 1, "valid data");
			extentr.pass();

			
		}else {
			
			excel.writedata(3, 1, "invalid data");
			sh.screensht();
			extentr.fail();

			
		}
		
	}
	
	@AfterMethod
	public static void closeb() {
		driver.close();
		
	}
	
	@AfterTest
	public static void tesend() {
		System.out.println("***Test Ended****");
		extentr.repgern();
	}
	

}
