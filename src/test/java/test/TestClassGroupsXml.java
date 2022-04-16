package test;

import org.testng.annotations.Test;

public class TestClassGroupsXml {
	@Test(groups={"BVT"})
	public void testOne()
	{
		System.out.println("Annotation-Test: in testoneMethod-TestClassGroupsXml-BVT");
	}
	@Test(timeOut=5000)
	public void testTwo()
	{
		System.out.println("Annotation-Test: in testoneMethod-TestClassGroupsXml");
	}

}
