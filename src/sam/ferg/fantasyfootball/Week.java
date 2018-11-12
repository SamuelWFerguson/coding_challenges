package sam.ferg.fantasyfootball;

import java.util.ArrayList;
import java.util.List;

public class Week {
	private List<Matchup> matchups;
	private String weekName;
	private boolean isWeekOver = false;
	
	Week(String name, boolean isWeekOver) {
		weekName = name;
		matchups = new ArrayList<Matchup>();
		this.isWeekOver = isWeekOver;
	}
	
	public void add(Matchup matchup) {
		matchups.add(matchup);
	}
	
	public List<Matchup> getMatchups() {
		return matchups;
	}
	
	public void setWeekName(String name) {
		weekName = name;
	}
	
	public String getWeekName() {
		return weekName;
	}
	
	public boolean isWeekOver() {
		return isWeekOver;
	}
}

