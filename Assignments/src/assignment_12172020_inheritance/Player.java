package assignment_12172020_inheritance;

public class Player extends Person{
	
	private double rating;
	private Team team;
	private String sportName;
	private String position;
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	
	
	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public String getPostion() {
		return position;
	}

	public void setPostion(String postion) {
		this.position = postion;
	}

	public Player() {
		
	}
	
	public Player(int id, String name) {
		super(id, name);
	}
	
	
	
	public Player(int id, String name, double rating, Team team, String sportName, String postion) {
		super(id, name);
		this.rating = rating;
		this.team = team;
		this.sportName = sportName;
		this.position = postion;
	}

	@Override
	public String toString() {
		return super.toString()+ " Player [sportName=" + sportName + ", " + team.toString()+  ", position=" + position  +", rating=" + rating
				+ "]";
	}

	

	
}
