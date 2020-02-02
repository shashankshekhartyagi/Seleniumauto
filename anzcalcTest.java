package anz.anz1;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import anz.anz1.anzCalculatorScenario1;
import anz.anz1.anzCalculatorScenario2;

public class anzcalcTest {
	
	anzCalculatorScenario1 calc= new anzCalculatorScenario1();
	anzCalculatorScenario2 calc2= new anzCalculatorScenario2(); 
	
	@Test
	public void calcTest() throws InterruptedException, IOException{
		
		Assert.assertEquals(calc.verifyLoanEligibility(), true);
		
		
	}
	@Test
    public void calcTest2() throws InterruptedException, IOException{
		
		Assert.assertEquals(calc2.verifyLoanEligibility2(), true);
		
		
	}
/*	@AfterTest
	public void quitDriver(){
		
		calc.quitdriver(); 
	} */
	

}
