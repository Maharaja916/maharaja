package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import objects.basepage;
import objects.logobj;

public class logtest12 {
	basepage bp;
	logobj lg;

public logtest () {
	lg=new logobj();
	bp=new basepage();

	}
@Test
public void verifydress() {
	Assert.assertTrue(bp.elementFound(lg.getdress()),"Not found");
}
@Test
public void verifywomen() {
	Assert.assertTrue(bp.elementFound(lg.getWomen()), "not found");}
@Test
public void verifyshirts() {
	Assert.assertTrue(bp.elementFound(lg.getshirts()), "not found");
}


public void verifyWomen() {
	
	lg.getWomen().click();
	String tle=bp.driver.getTitle();
	System.out.println(tle);
	Assert.assertTrue(tle.contains("Women"),"Failed");
}
	
	




}


		

		

	
	
	
	


