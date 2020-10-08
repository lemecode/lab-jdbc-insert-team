package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

public class CityDAO {

	City city;
	ConnectionManager cm = new ConnectionManager();

	public City getCityByName(String name) throws ClassNotFoundException, SQLException, IOException {

		Statement st = cm.getConnection().createStatement();

		String sql = "select * from team";
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {

			if (name.equals(rs.getString("name"))) {
				city.setCityName(name);
			} else
				System.out.println("City Not available in the database");
		}

		return city;
	}

	public void createCity(City c) throws ClassNotFoundException, SQLException, IOException {

		long id = c.getCityId();
		String name = c.getCityName();

		String sql = "Insert into city(id,name) values (?,?)";

		PreparedStatement st = cm.getConnection().prepareStatement(sql);

		st.setLong(1, id);
		st.setString(2, name);

		st.executeUpdate();
		cm.getConnection().close();
	}

}
