package problem.nailingplanks;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NailingPlanks {

	public int nailsNeeded(int[] a, int[] b, int[] c) {
		if (a == null || b == null || c == null) {
			throw new IllegalArgumentException();
		}
		int nailCount = 0;
		NavigableSet<Integer> usedNails = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			Integer nailCandidate = usedNails.ceiling(a[i]);
			boolean nailFound = nailCandidate != null ? nailCandidate <= b[i] : false;
			if (!nailFound) {
				int nailToAdd = 0;
				while (nailToAdd < a[i] || b[i] < nailToAdd) {
					if(nailCount==c.length){
						return -1;
					}
					nailToAdd = c[nailCount++];
					usedNails.add(nailToAdd);
				}
			}
		}
		return nailCount;
	}
}