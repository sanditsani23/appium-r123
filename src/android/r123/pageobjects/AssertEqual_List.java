package android.r123.pageobjects;
import org.openqa.selenium.By;

import android.r123.util.Base_Test;
import android.r123.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AssertEqual_List extends Base_Test {
	GeneralUtilities function;
	public AssertEqual_List(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	
	By Beranda_Logo = By.xpath("//*[@id='logo']");
	
	//Beranda logo
	public boolean Verify_HomepageLogo() {
		boolean verify=false;
		verify=driver.findElement(Beranda_Logo).isDisplayed();
		return verify;
	}
	

	
	
		
		
}
	

	