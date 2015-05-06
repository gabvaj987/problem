package problem;

public class LinkedListCircle {

	public boolean find(Link first) {
		if(first==null){
			throw new IllegalArgumentException("first element should not be null");
		}
		Link next = first.getNext();
		if(next==null){
			return false;
		}
		Link secondNext = next.getNext();
		if(secondNext==null){
			return false;
		}
		return true;
	}
}
