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

public class PlayerSearchDAOimpl implements PlayerSearchDAO{

	@Override
	public Player getPlayerByContact(long contact) throws BusinessException {
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
				
			}else {
				throw new BusinessException("No Player found with contact "+ contact);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return player;
	}

	@Override
	public List<Player> getPlayersByAge(int age) throws BusinessException {
		List<Player> playerList = new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select player_id, player_name, team_id, main_weapon, second_weapon, contact from test1222.player where age = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, age);
			
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
				throw new BusinessException("No players in the DB so far");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}

}
