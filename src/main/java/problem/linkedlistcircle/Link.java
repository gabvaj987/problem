package problem.linkedlistcircle;

/**
 * Represents one link in a linked list.
 */
public class Link {
	private Link next;

	/**
	 * Creates a link that does not have a following element set.
	 */
	public Link() {
	}

	/**
	 * Creates a link and sets its following element
	 * 
	 * @param next the reference to the next link that follows this one.
	 */
	public Link(Link next) {
		this.next = next;
	}

	/**
	 * @return returns the reference to the next link that follows this one.
	 */
	public Link getNext() {
		return next;
	}

	/**
	 * @param next sets the reference to the next link that follows this one.
	 */
	public void setNext(Link next) {
		this.next = next;
	}
}
