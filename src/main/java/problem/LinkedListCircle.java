package problem;

/**
 * Can be used for checking the existence of a loop in a one way linked list.
 */
public class LinkedListCircle {

	/**
	 * This function checks the given linked list whether there is a loop in it.
	 * 
	 * @param first the first link in the linked list to be tested.
	 * @return true if the linked list has a loop, false if there is an end
	 *         element in the linked list that's next reference points to null.
	 * @throws IllegalArgumentException if the given first link is null
	 */
	public boolean hasCircle(Link first) {
		if (first == null) {
			throw new IllegalArgumentException("first element should not be null");
		}
		Link oneStep = first; // LOCK
		Link twoSteps = oneStep.getNext();
		while (oneStep != twoSteps) {
			if (twoSteps == null) {
				return false;
			}
			twoSteps = twoSteps.getNext();
			if (twoSteps == null) {
				return false;
			}
			twoSteps = twoSteps.getNext(); // LOCK
			oneStep = oneStep.getNext();
		}
		return true;
	}
}
