package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions jUnit=new jUnitFunctions();
		String res=jUnit.addString("Pranjay","Guleria");
		assertEquals("PranjayGuleria",res);
		
	}
	

}
