package junitoct2023;

import java.io.IOException;

import org.basee.BaseClassJava;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import pomoct2023.LoginPageClass;

public class Login extends BaseClassJava{
	public static LoginPageClass pomoct2023;
	@BeforeClass
	public static void Browserlogin() throws IOException {
		getDriver(excelRead(1, 3));
		
			}
	
	@Before
	public  void Browserlaunched() {
	getUrl("https://adactinhotelapp.com/");
	}
	@Test
	public void Entevalidcredentials () {
		pomoct2023 =new LoginPageClass();
		WebElement username = pomoct2023.getUsername();
		username.sendKeys("saranmasskr");
		WebElement password = pomoct2023.getPassword();
		password.sendKeys("krsaran@143");
	}
	@After
	public  void Loginbuttonclick() throws InterruptedException, IOException {
		pomoct2023 =new LoginPageClass();
		WebElement login = pomoct2023.getLogin();
		login.click();
	}
	
	@AfterClass
    public static void LoginMessageClick() {
	System.out.println("login successful");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
