package basic_learning_testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_annotations {
	
	
@BeforeSuite
	public void beforesuite() {
System.out.println("this is before annotation");
}

@BeforeTest
public void beforetest() {
	System.out.println("this is beforetest annotation");
}

@BeforeClass
public void beforeclass() {
	System.out.println("this is beforeclass annotation");
}

@BeforeMethod
public void beforemethod() {
	System.out.println("this is beforemethod annotation");
}

@Test
public void test() {
	System.out.println("this test case is executed");
}

@AfterMethod
public void aftermethod() {
	System.out.println("this is aftermethod annotation");
}

@AfterClass
public void afterclass() {
	System.out.println("this is afterclass annotation");
}

@AfterTest
public void aftertest() {
	System.out.println("this is aftertest annotation");
}

@AfterSuite
public void aftersuite() {
	System.out.println("this is aftersuite annotation");
}



}
	
	


