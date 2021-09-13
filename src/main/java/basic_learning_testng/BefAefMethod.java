package basic_learning_testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BefAefMethod {
	@BeforeMethod
	public void UserRegistration() {
		System.out.println("user is able to register");
	}
	@Test(priority=1,enabled=true)
	public void Userlogin() {
		System.out.println("user is able to login");
	}
	@Test(priority=2,enabled=false)
	public void Amount() {
		System.out.println("user is able to transfer amount");
	}
	
	
	
	@AfterMethod
	public void Useriogout() {
		System.out.println("user is able to logout");
	}
}
