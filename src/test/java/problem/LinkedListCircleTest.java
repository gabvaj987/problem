package problem;

import static org.testng.AssertJUnit.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkedListCircleTest {
	private LinkedListCircle underTest;

	@BeforeMethod
	public void init(){
		underTest = new LinkedListCircle();
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void callFindNullGivenThrowsIllegalArgumentException() {
		// GIVEN
		// WHEN
		underTest.find(null);
		// THEN
	}
	
	@Test
	public void callFindOneLinkNoCircleReturnsFalse() {
		// GIVEN
		Link link = new Link();
		// WHEN
		boolean returned = underTest.find(link);
		// THEN
		assertFalse(returned);
	}
	
	@Test
	public void callFindOneLinkCircledReturnsTrue() {
		// GIVEN
		Link link = new Link();
		link.setNext(link);
		// WHEN
		boolean returned = underTest.find(link);
		// THEN
		assertTrue(returned);
	}
	
	@Test
	public void callFindTwoLinksNoCircleReturnsFalse() {
		// GIVEN
		Link link1 = new Link();
		Link link2 = new Link();
		link1.setNext(link2);
		// WHEN
		boolean returned = underTest.find(link1);
		// THEN
		assertFalse(returned);
	}

	@Test
	public void callFindTwoLinksCircledReturnsTrue() {
		// GIVEN
		Link link1 = new Link();
		Link link2 = new Link();
		link1.setNext(link2);
		link2.setNext(link1);
		// WHEN
		boolean returned = underTest.find(link1);
		// THEN
		assertTrue(returned);
	}
}
