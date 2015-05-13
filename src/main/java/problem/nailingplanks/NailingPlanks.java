package problem.nailingplanks;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NailingPlanks {

	public int nailsNeeded(int[] a, int[] b, int[] c) {
		if (a == null || b == null || c == null) {
			throw new IllegalArgumentException();
		}
		NavigableSet<Integer> usedNails = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			Integer nailLeftBound = usedNails.ceiling(a[i]);
			if (nailLeftBound == null || b[i] < nailLeftBound) {
				int nailAdded = 0;
				while (nailAdded < a[i] || b[i] < nailAdded) {
					if (usedNails.size() == c.length) {
						return -1;
					}
					nailAdded = c[usedNails.size()];
					usedNails.add(nailAdded);
				}
			}
		}
		return usedNails.size();
	}
}
