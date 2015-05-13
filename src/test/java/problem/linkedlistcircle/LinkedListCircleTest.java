package problem.linkedlistcircle;

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
		underTest.hasCircle(null);
		// THEN
	}
	
	@Test
	public void callFindOneLinkNoCircleReturnsFalse() {
		// GIVEN
		Link link = new Link();
		// WHEN
		boolean returned = underTest.hasCircle(link);
		// THEN
		assertFalse(returned);
	}
	
	@Test
	public void callFindOneLinkCircledReturnsTrue() {
		// GIVEN
		Link link = new Link();
		link.setNext(link);
		// WHEN
		boolean returned = underTest.hasCircle(link);
		// THEN
		assertTrue(returned);
	}
	
	@Test
	public void callFindTwoLinksNoCircleReturnsFalse() {
		// GIVEN
		Link link1 = new Link(new Link());
		// WHEN
		boolean returned = underTest.hasCircle(link1);
		// THEN
		assertFalse(returned);
	}

	@Test
	public void callFindTwoLinksCircledReturnsTrue() {
		// GIVEN
		Link link2 = new Link();
		Link link1 = new Link(link2);
		link2.setNext(link1);
		// WHEN
		boolean returned = underTest.hasCircle(link1);
		// THEN
		assertTrue(returned);
	}
	
	@Test
	public void callFindThreeLinksNoCircleReturnsFalse() {
		// GIVEN
		Link link1 = new Link(new Link(new Link()));
		// WHEN
		boolean returned = underTest.hasCircle(link1);
		// THEN
		assertFalse(returned);
	}

	@Test
	public void callFindThreeLinksCircledReturnsTrue() {
		// GIVEN
		Link link3 = new Link();
		Link link1 = new Link(new Link(link3));
		link3.setNext(link1);
		// WHEN
		boolean returned = underTest.hasCircle(link1);
		// THEN
		assertTrue(returned);
	}
	
	@Test
	public void callFindThreeLinksCircledIntoMiddleReturnsTrue() {
		// GIVEN
		Link link2 = new Link();
		Link link1 = new Link(link2);
		Link link3 = new Link(link2);
		link2.setNext(link3);
		// WHEN
		boolean returned = underTest.hasCircle(link1);
		// THEN
		assertTrue(returned);
	}
	
	@Test
	public void callFindFourLinksNoCircleReturnsFalse() {
		// GIVEN
		Link link1 = new Link(new Link(new Link(new Link())));
		// WHEN
		boolean returned = underTest.hasCircle(link1);
		// THEN
		assertFalse(returned);
	}

	@Test
	public void callFindFourLinksCircledReturnsTrue() {
		// GIVEN
		Link link4 = new Link();
		Link link1 = new Link(new Link(new Link(link4)));
		link4.setNext(link1);
		// WHEN
		boolean returned = underTest.hasCircle(link1);
		// THEN
		assertTrue(returned);
	}
}
