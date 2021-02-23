package android.r123.pageobjects;
import org.openqa.selenium.By;

import android.r123.util.Base_Test;
import android.r123.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Beranda extends Base_Test {
	GeneralUtilities function;
	public Beranda(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	

	
	By Beranda_Saya = By.xpath("//*[@id='icon' and ./parent::*[@id='menu_profile']]");
	By Beranda_Saya_Setting = By.xpath("//*[@id='layoutSettings']");
	By Saya_Masuk = By.xpath("//*[@id='loginOrSignUp']");
	
	//method below for click srp search button agent
		public void Click_Beranda_Saya() throws Exception{
			function.click(Beranda_Saya);
		}
	
		//method below for click srp search button agent
				public void Click_Beranda_SayaSetting() throws Exception{
					function.click(Beranda_Saya_Setting);
				}
			
				//method below for click srp search button agent
				public void Click_SayaMasuk() throws Exception{
					function.click(Saya_Masuk);
				}
		
}
