package problem;

public class LinkedListCircle {

	public boolean find(Link first) {
		if(first==null){
			throw new IllegalArgumentException("first element should not be null");
		}
		if(first.getNext()==null){
			return false;
		}
		return true;
	}
}
