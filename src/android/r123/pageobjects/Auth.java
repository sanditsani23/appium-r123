package android.r123.pageobjects;
import org.openqa.selenium.By;

import android.r123.util.Base_Test;
import android.r123.util.GeneralUtilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Auth extends Base_Test {
	GeneralUtilities function;
	public Auth(AndroidDriver<AndroidElement> driver){
		this.driver = driver;
		function = new GeneralUtilities(driver);
	}
	
	By Email = By.xpath("//*[@id='etEmail']");
	By Password = By.xpath("//*[@id='etPassword']");
	By Login_BtMasuk = By.xpath("//*[@text='MASUK']");
	
	
	//Logout Flow
	By Saya_BtKeluar = By.xpath("//*[@text='Keluar']");
	By Keluar_Confirm = By.xpath("//*[@id='textYes']");
	
	//Login
	//method below for input email
	public void InputEmail(String email) throws Exception {
		function.input(Email, email);
	}
	
	//method below for input password
	public void InputPassword(String pass) throws Exception {
		function.input(Password, pass);
	}
		
	//method below for click login in Saya
	public void Click_BtMasuk() throws Exception{
		function.click(Login_BtMasuk);
	}
	
	//method below for click logout in setting
	public void Click_BtKeluar() throws Exception{
		function.click(Saya_BtKeluar);
	}		

	//method below for click confirm logout
	public void Click_ConfirmKeluar() throws Exception{
		function.click(Keluar_Confirm);
	}		
}
