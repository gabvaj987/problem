package problem.nailingplanks;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NailingPlanksTest {
	private NailingPlanks underTest;

	@BeforeMethod
	public void init(){
		underTest = new NailingPlanks();
	}
	
	@Test(expectedExceptions=IllegalArgumentException.class)
	public void callWithNullsExpectedIAE(){
		underTest.nailsNeeded(null,null,null);
	}
}
