package calculator;

import org.junit.Test;
import org.junit.Assert;



public class TestStringCalculator {
	
	StringCalculator calculator=new StringCalculator();
	@Test 
	public void returnEmptyString()
	{
		
		Assert.assertEquals(calculator.calculate(""), 0);
	}
	
	@Test
	public void nonEmptyStringReturnsValue()
	{
		Assert.assertEquals(calculator.calculate("5"), 5);
		 
	}
	
	@Test
	public void twoNumbersCommaDelemited()
	{
		Assert.assertEquals(calculator.calculate("100,5"), 105);
		 
	}
	
	@Test
	public void twoNumbersNewLineDelemited()
	{
		Assert.assertEquals(calculator.calculate("100\n5"), 105);
		 
	}
	
	@Test
	public void threeNumbersDelimation()
	{
		Assert.assertEquals(calculator.calculate("100,5,10"), 115);
		 
	}
	
	@Test(expected=NagativeNumberException.class)
	public void nagativeNumberNotAllowed()
	{
		calculator.calculate("-5");
		 
	}
	@Test
	public void ignoreGreaterThan1000()
	{
		Assert.assertEquals(calculator.calculate("100,1005,4"),104);
		 
	}
}
