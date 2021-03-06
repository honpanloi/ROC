package com.app.service.impl;

import java.util.List;

import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerSearchDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.validation.Validation;


public class PlayerSearchServiceImpl implements PlayerSearchService{

	private PlayerSearchDAO playerSearchDAO = new PlayerSearchDAOImpl();
	
	@Override
	public Player getPlayerById(int id) throws BusinessException {
		Player player = null;
		
		if(id>1000 && id<=1999) {
			
			player = playerSearchDAO.getPlayerById(id);
		}else {
			throw new BusinessException("Entered Player Id"+id+" is invalid......");
		}
		
		return player;
	}

	@Override
	public Player getPlayerbyContact(long contact) throws BusinessException {
		Player player = null;
		
		if(Validation.contactValiation(contact)) {
			player = playerSearchDAO.getPlayerbyContact(contact);
		}else {
			throw new BusinessException("Entered Player contact("+contact+") is invalid......Please enter a 10 digit contact number");
		}
		
		return player;
		
	}

	@Override
	public List<Player> getAllPlayers() throws BusinessException {
		
		List<Player> playerList = playerSearchDAO.getAllPlayers();
		
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByAge(int age) throws BusinessException {
		List<Player> playerList = null;
		if(age>0 && age<130) {
			playerList = playerSearchDAO.getAllPlayersByAge(age);
		}else {
			throw new BusinessException("Please enter an age between 0 and 130.");
		}
		return playerList;
	}


	@Override
	public List<Player> getAllPlayersByTeamId(int teamId) throws BusinessException {
		List<Player> playerList = null;
		if(teamId>9000 && teamId<10000) {
			playerList = playerSearchDAO.getAllPlayersByTeamId(teamId);
		}else {
			throw new BusinessException("Please enter a weapon id between 9000 and 9999.");
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByName(String name) throws BusinessException {
		List<Player> playerList = null;
		if(name.length()<=20) {
			playerList = playerSearchDAO.getAllPlayersByName(name);
		}else {
			throw new BusinessException("Please enter a name with less than 20 characters.");
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersByMainWeaponId(int mainWeaponId) throws BusinessException {
		List<Player> playerList = null;
		if(mainWeaponId>5000 && mainWeaponId<6000) {
			playerList = playerSearchDAO.getAllPlayersByMainWeaponId(mainWeaponId);
		}else {
			throw new BusinessException("Please enter a weapon id between 5000 and 5999.");
		}
		return playerList;
	}

	@Override
	public List<Player> getAllPlayersBySecondWeaponId(int secondWeaponId) throws BusinessException {
		List<Player> playerList = null;
		if(secondWeaponId>5000 && secondWeaponId<6000) {
			playerList = playerSearchDAO.getAllPlayersBySecondWeaponId(secondWeaponId);
		}else {
			throw new BusinessException("Please enter a weapon id between 5000 and 5999.");
		}
		return playerList;
	}

}
