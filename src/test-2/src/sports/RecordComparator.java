package sports;

import java.util.Comparator;

public class RecordComparator implements Comparator<Athlete> {
	@Override
	public int compare(Athlete o1, Athlete o2) {
		return Double.compare(o1.getBestRecord(), o2.getBestRecord());
	}
}
