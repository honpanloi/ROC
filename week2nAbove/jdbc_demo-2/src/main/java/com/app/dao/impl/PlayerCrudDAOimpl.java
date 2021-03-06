package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.dbutil.PostgresqlConnection;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerCrudDAOimpl implements PlayerCrudDAO {

	@Override
	public int createPlayer(Player player) throws BusinessException {
		int c =0;
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "insert into test1222.player(player_id, player_name, team_id, main_weapon, second_weapon, age, contact) values (?,?,?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, player.getPlayer_id());
			preparedStatement.setString(2, player.getPlayer_name());
			preparedStatement.setInt(3, player.getTeam_id());
			preparedStatement.setInt(4, player.getMain_weapon());
			preparedStatement.setInt(5, player.getSecond_weapon());
			preparedStatement.setInt(6, player.getAge());
			preparedStatement.setLong(7, player.getContact());
			
			c = preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		return c;
	}

	@Override
	public void deletePlayerById(int id) throws BusinessException{
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "delete from test1222.player where player_id = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
	}

	@Override
	public int updatePlayerTeam(int id, int team_id) throws BusinessException{
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			String sql = "update test1222.player set team_id = ? where player_id = ?";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,team_id);
			preparedStatement.setInt(2,id);
			
			preparedStatement.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return 0;
	}

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
	public List<Player> getAllPlayers() throws BusinessException {
		List<Player> playerList = new ArrayList<Player>();
		
		try(Connection connection = PostgresqlConnection.getConnection()){
			
			
			String sql = "select player_id, player_name, team_id, main_weapon, second_weapon, age, contact from test1222.player order by player_id";
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
				throw new BusinessException("No players in the DB so far");
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println("e");
			throw new BusinessException("Internal error occured contact sysadmin");
		}
		
		return playerList;
	}

}
