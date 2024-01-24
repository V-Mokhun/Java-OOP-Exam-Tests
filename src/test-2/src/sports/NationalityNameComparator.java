package sports;

import java.util.Comparator;

public class NationalityNameComparator implements Comparator<Athlete> {
	@Override
	public int compare(Athlete o1, Athlete o2) {
		int result = o2.getNationality().compareTo(o1.getNationality());
		if (result == 0) {
			result = o2.getName().compareTo(o1.getName());
		}
		return result;
	}
}
