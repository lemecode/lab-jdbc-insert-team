package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Team;
import utility.ConnectionManager;

public class TeamDAO {

	ConnectionManager cm = new ConnectionManager();

	public void createTeam(Team team) throws ClassNotFoundException, SQLException, IOException {

		String name = team.getName();
		long id = team.getTeamId();
		String coach = team.getCoach();
		long city = team.getCity().getCityId();
		String captain = team.getCaptain();

		String sql = "INSERT INTO TEAM(id,name,coach,city,captain) values (?,?,?,?,?)";

		PreparedStatement st = cm.getConnection().prepareStatement(sql);

		st.setLong(1, id);
		st.setString(2, name);
		st.setString(3, coach);
		st.setLong(4, city);
		st.setString(5, captain);

		st.executeUpdate();
		cm.getConnection().close();

	}
}
