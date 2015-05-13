package problem.nailingplanks;

import static org.testng.Assert.assertEquals;
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
	@Test
	public void callWithExerciseCase(){
		int result = underTest.nailsNeeded(new int[]{1,4,5,8},new int[]{4,5,9,10},new int[]{4,6,7,10,2});
		assertEquals(result,4);
	}
	
	@Test
	public void callWithComplexCase(){
		int result = underTest.nailsNeeded(new int[]{1,4,5,8,1},new int[]{4,5,9,10,2},new int[]{4,6,7,10,2});
		assertEquals(result,5);
	}
}
