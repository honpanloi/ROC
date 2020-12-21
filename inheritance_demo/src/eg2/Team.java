package eg2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Team {
	
	private int teamId;
	private String teamName;
	private String coachName;
	private LinkedList<Player> members = new LinkedList<Player>();
			
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	
	public void addPlayer(Player p) {
		this.members.add(p);
	}
	
	public void printAllmembers() {
		ListIterator<Player> plir = this.members.listIterator();
		while(plir.hasNext()) {
			System.out.println(plir.next().toString());
		}

	}
	
	public Team() {}
	
	public Team(int teamId, String teamName, String coachName) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachName = coachName;
	}
	@Override
	public String toString() {
		return "Team [teamId=" + 
				teamId + ", team name=" + teamName + ", coach name=" + coachName +
				"]";
	}
	
}
