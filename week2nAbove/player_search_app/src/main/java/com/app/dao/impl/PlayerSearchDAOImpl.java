package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerSearchDAOImpl implements PlayerSearchDAO{

	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select player_name, team_id, main_weapon, second_weapon, age, contact from test1222.player where player_id =?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player(); 
				player.setPlayer_id(id);
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setMain_weapon(resultSet.getInt("main_weapon"));
				player.setSecond_weapon(resultSet.getInt("second_weapon"));
				player.setAge(resultSet.getInt("age"));
				player.setContact(resultSet.getLong("contact"));
				
			}else {
				throw new BusinessException("No Player found with Id "+id);
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return player;
	}

	@Override
	public Player getPlayerbyContact(long contact) throws BusinessException {
		Player player = null;
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select player_id, player_name, team_id, main_weapon, second_weapon, age from test1222.player where contact =?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1,contact);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				player = new Player(); 
				player.setPlayer_id(resultSet.getInt("player_id"));
				player.setPlayer_name(resultSet.getString("player_name"));
				player.setTeam_id(resultSet.getInt("team_id"));
				player.setMain_weapon(resultSet.getInt("main_weapon"));
				player.setSecond_weapon(resultSet.getInt("second_weapon"));
				player.setAge(resultSet.getInt("age"));
				player.setContact(contact);
				
			}else {
				throw new BusinessException("No Player found with contact "+contact);
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return player;
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList =  new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select * from test1222.player order by player_id";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player(
						resultSet.getInt("player_id"),
						resultSet.getString("player_name"), 
						resultSet.getInt("team_id"), 
						resultSet.getInt("main_weapon"), 
						resultSet.getInt("second_weapon"), 
						resultSet.getInt("age"),
						resultSet.getLong("contact")
						); 

				playerList.add(player);
			}
			
			if(playerList.size() == 0) {
				throw new BusinessException("No players are in the DB yet");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByAge(int age) throws BusinessException {
		List<Player> playerList =  new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select player_id, player_name, team_id, main_weapon, second_weapon, age, contact from test1222.player where age = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,age);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player(
						resultSet.getInt("player_id"),
						resultSet.getString("player_name"), 
						resultSet.getInt("team_id"), 
						resultSet.getInt("main_weapon"), 
						resultSet.getInt("second_weapon"), 
						age,
						resultSet.getLong("contact")
						); 

				playerList.add(player);
			}
			
			if(playerList.size() == 0) {
				throw new BusinessException("No players with age("+age+") found in the DB");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}


	@Override
	public List<Player> getAllPlayersByTeamId(int teamId) throws BusinessException {
		List<Player> playerList =  new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select player_id, player_name, main_weapon, second_weapon, age, contact from test1222.player where team_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,teamId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player(
						resultSet.getInt("player_id"),
						resultSet.getString("player_name"), 
						teamId, 
						resultSet.getInt("main_weapon"), 
						resultSet.getInt("second_weapon"), 
						resultSet.getInt("age"),
						resultSet.getLong("contact")
						); 

				playerList.add(player);
			}
			
			if(playerList.size() == 0) {
				throw new BusinessException("No players with team id("+teamId+") found in the DB");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByName(String name) throws BusinessException {
		List<Player> playerList =  new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select player_id, team_id, main_weapon, second_weapon, age, contact from test1222.player where player_name = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,name);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player(
						resultSet.getInt("player_id"),
						name, 
						resultSet.getInt("team_id"), 
						resultSet.getInt("main_weapon"), 
						resultSet.getInt("second_weapon"), 
						resultSet.getInt("age"),
						resultSet.getLong("contact")
						); 

				playerList.add(player);
			}
			
			if(playerList.size() == 0) {
				throw new BusinessException("No players with the name("+name+") found in the DB");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByMainWeaponId(int mainWeaponId) throws BusinessException {
		List<Player> playerList =  new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select p.player_id, p.player_name, p.team_id, p.second_weapon, p.age, p.contact, w.weapon_name from test1222.player p join test1222.weapon w on p.main_weapon = w.weapon_id where p.main_weapon = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,mainWeaponId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player(
						resultSet.getInt("player_id"),
						resultSet.getString("player_name"), 
						resultSet.getInt("team_id"), 
						mainWeaponId, 
						resultSet.getInt("second_weapon"), 
						resultSet.getInt("age"),
						resultSet.getLong("contact")
						); 

				playerList.add(player);
			}
			
			if(playerList.size() == 0) {
				throw new BusinessException("No players with main weapon("+mainWeaponId+") found in the DB");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersBySecondWeaponId(int secondWeaponId) throws BusinessException {
		List<Player> playerList =  new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select p.player_id, p.player_name, p.team_id, p.main_weapon, p.age, p.contact, w.weapon_name from test1222.player p join test1222.weapon w on p.second_weapon = w.weapon_id where p.second_weapon = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,secondWeaponId);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Player player = new Player(
						resultSet.getInt("player_id"),
						resultSet.getString("player_name"), 
						resultSet.getInt("team_id"), 
						resultSet.getInt("main_weapon"), 
						secondWeaponId, 
						resultSet.getInt("age"),
						resultSet.getLong("contact")
						); 

				playerList.add(player);
			}
			
			if(playerList.size() == 0) {
				throw new BusinessException("No players with second weapon("+secondWeaponId+") found in the DB");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}

}
