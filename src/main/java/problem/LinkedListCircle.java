package problem;

public class LinkedListCircle {

	public boolean find(Link first) {
		if (first == null) {
			throw new IllegalArgumentException("first element should not be null");
		}
		Link next = first;
		Link secondNext = next.getNext();
		while (next != secondNext) {
			if (secondNext == null) {
				return false;
			}
			secondNext = secondNext.getNext();
			if (secondNext == null) {
				return false;
			}
			secondNext = secondNext.getNext();
			next = next.getNext();
		}
		return true;
	}
}
