package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.model.Player;

public interface PlayerSearchDAO {
	
	public Player getPlayerByContact(long contact) throws BusinessException;
	
	public List<Player> getPlayersByAge(int age) throws BusinessException;
	
	

}
