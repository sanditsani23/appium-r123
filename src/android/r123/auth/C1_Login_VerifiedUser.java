package android.r123.auth;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.Test;
import android.r123.util.Base_Test;
import android.r123.util.GeneralUtilities;
import android.r123.pageobjects.*;

public class C1_Login_VerifiedUser extends Base_Test {
	
	private Beranda beranda;
	private GeneralUtilities util;
	private Auth auth;
	private AssertEqual_List asl;
	
	@Test
	public void C1_Login_Verified_User() throws Exception {
		CONFIG = new Properties();
		FileInputStream fsconf = new FileInputStream(test_data);
		CONFIG.load(fsconf);
		beranda = new Beranda(driver);
		util = new GeneralUtilities(driver);
		auth = new Auth(driver);
		asl = new AssertEqual_List(driver);
			
		
		 System.out.println("=========");
		 System.out.println("TestCase : C1");	
		 System.out.println("Login Verified User");	
		 System.out.println("---------");		 
		 System.out.println("#Given I am a logged-out, has verified user");

		 wait_Long();	
		 beranda.Click_Beranda_Saya();
					
			if (util.verifyLogout()) {
				
				 System.out.println("State : Logged out");

					//Login flow 
					beranda.Click_SayaMasuk(); 	  
				    wait_Long();		    
					System.out.println("#And user input Email and Password using verified account");
					auth.InputEmail(CONFIG.getProperty("VerAcc_Email"));
					auth.InputPassword(CONFIG.getProperty("VerAcc_Pass"));
					auth.Click_BtMasuk();
				    wait_Long();
				     
				    
				    //Assert equal for checking if the user already on Beranda after login
				 	try {
						assertEquals(asl.Verify_HomepageLogo(), true, "Verify the logo on Beranda");
						System.out.println("Logo on Beranda appear as expected ");
						
					} catch (Exception e){
								
						System.out.println("Logo on Beranda not appear");
						
					}
				 
		
			} else {
				
			   
				 
				 System.out.println("State : Logged in");		
						
				//Logout flow
					beranda.Click_Beranda_SayaSetting();
					auth.Click_BtKeluar();
					auth.Click_ConfirmKeluar();
					
					
					//Login flow
					wait_Med();						
					beranda.Click_SayaMasuk(); 	  
					wait_Long();		    
					System.out.println("#And user input Email and Password using verified account");
					auth.InputEmail(CONFIG.getProperty("VerAcc_Email"));
					auth.InputPassword(CONFIG.getProperty("VerAcc_Pass"));
					auth.Click_BtMasuk();
					wait_Long();	
					    
				    //Assert equal for checking if the user already on Beranda after login
					 try {
							assertEquals(asl.Verify_HomepageLogo(), true, "Verify the logo on Beranda");
							System.out.println("Logo on Beranda appear as expected ");
							
					} catch (Exception e){
									
							System.out.println("Logo on Beranda not appear");
							
					}
				 

			     
				
			}
			wait_Med();
			System.out.println("=========");
			System.out.println("=========");

	}

}
