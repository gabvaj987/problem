package problem;

/**
 * Represents one link in a linked list.
 */
public class Link {
	private Link next;
	
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
