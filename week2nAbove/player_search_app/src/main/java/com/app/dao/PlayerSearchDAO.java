package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerById(int id) throws BusinessException;
	public Player getPlayerbyContact(long contact) throws BusinessException;
	public List<Player> getAllPlayers() throws BusinessException;
	public List<Player> getAllPlayersByAge(int age) throws BusinessException;
	public List<Player> getAllPlayersByTeamId(int teamId) throws BusinessException;
	public List<Player> getAllPlayersByName(String name) throws BusinessException;
	public List<Player> getAllPlayersByMainWeaponId(int mainWeaponId) throws BusinessException;
	public List<Player> getAllPlayersBySecondWeaponId(int secondWeaponId) throws BusinessException;

}
