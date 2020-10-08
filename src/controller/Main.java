package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		TeamDAO teamdao = new TeamDAO();
		CityDAO citydao = new CityDAO();

		System.out.println("Enter Team Name:");
		String name = br.readLine();
		System.out.println("Enter Team ID");
		long teamId = Long.parseLong(br.readLine());
		System.out.println("Enter Coach");
		String coach = br.readLine();
		System.out.println("Enter Captain Name:");
		String captain = br.readLine();
		System.out.println("City Name");
		String cityName = br.readLine();
		System.out.println("Enrer City ID");
		int cityId = Integer.parseInt(br.readLine());

		City city = new City(cityId, cityName);
		Team team = new Team(name, teamId, coach, captain, city);

		citydao.createCity(city);
		teamdao.createTeam(team);

		System.out.println("Enter the City Name to search");
		String cName = br.readLine();

		City city1 = citydao.getCityByName(cName);

		System.out.println(city1.getCityName());

	}
}
