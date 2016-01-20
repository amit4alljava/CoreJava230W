import org.testng.Assert;
import org.testng.annotations.Test;


public class TestLogic {
	@Test
	public void testAddTwoIntegers(){
		Logic logic = new Logic();
		int expected= 30;
		int result = logic.add(10, 20);
		Assert.assertEquals(result, expected);
	}
	@Test
	public void testAddTwoString(){
		Logic logic = new Logic();
		int expected= 30;
		int result = logic.add("10", "20");
		Assert.assertEquals(result, expected);
	}
	@Test
	public void testAddTwoStringChars(){
		Logic logic = new Logic();
		int expected= 10;
		int result = logic.add("ten", "twenty");
		Assert.assertEquals(result, expected);
	}
}
