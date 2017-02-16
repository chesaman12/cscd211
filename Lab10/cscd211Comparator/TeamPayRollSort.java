package cscd211Comparator;

import java.util.Comparator;

import cscd211Inheritance.Team.Team;

public class TeamPayRollSort implements Comparator<Team> {

	@Override
	public int compare(Team t1, Team t2) {

		if (t1 == null || t2 == null)
			throw new IllegalArgumentException("team is null");
		Integer s1 = t1.getPayroll();
		Integer s2 = t2.getPayroll();

		return s1.compareTo(s2);
	}

}
