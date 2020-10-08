package model;

public class Team {

	String name;
	long teamId;
	String coach;
	City city;
	String captain;

	public Team(String name, long teamId, String coach, String captain, City city) {
		super();
		this.name = name;
		this.teamId = teamId;
		this.coach = coach;
		this.captain = captain;
		this.city = city;
	}

	public long getTeamId() {
		return teamId;
	}

	public void setTeamId(long teamId) {
		this.teamId = teamId;
	}

	public String getCaptain() {
		return captain;
	}

	public void setCaptain(String captain) {
		this.captain = captain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

}
