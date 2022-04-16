package test;

import org.testng.annotations.Test;

public class DisablingEnablingTest {
@Test
public void testOne()
{
	System.out.println("Annotation-Test: in testoneMethod");
}

@Test(enabled=false)
public void testTwo()
{
	System.out.println("Annotation-Test: in testTwoMethod");
}
@Test(enabled=true)
public void testThree()
{
System.out.println("Annotation-Test: in testThreeMethod");	
}

}
