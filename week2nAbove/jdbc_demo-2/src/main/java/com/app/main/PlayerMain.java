package com.app.main;

import java.util.List;

import com.app.dao.PlayerCrudDAO;
import com.app.dao.PlayerSearchDAO;
import com.app.dao.impl.PlayerCrudDAOimpl;
import com.app.dao.impl.PlayerSearchDAOimpl;
import com.app.exception.BusinessException;
import com.app.model.Player;

public class PlayerMain {

	public static void main(String[] args) {
		
		PlayerCrudDAO dao = new PlayerCrudDAOimpl();
		PlayerSearchDAO sdao = new PlayerSearchDAOimpl();
		
//		Player p3 = new Player(1009,"Tommy",9003,5002,5003, 34, 4448882222L);
//		
//		try {
//			if(dao.createPlayer(p3)!=0) {
//				System.out.println("Player created successfully");
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
		try {
			Player player = dao.getPlayerById(1009);
			
			if(player!=null) {
				System.out.println("Details of player with id "+player.getPlayer_id());
				System.out.println(player);
			}
		} catch (BusinessException e) {
			System.out.println(e);
		}
		
//		try {
//			List<Player> playerList = dao.getAllPlayers();
//			
//			if(playerList.size()!=0) {
//				System.out.println("Found "+ playerList.size()+" no of player in Db.... Printing them all");
//				for(Player p:playerList) {
//					System.out.println(p);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			dao.deletePlayerById(1009);
//			System.out.println("player "+1009+" is deleted");
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			List<Player> playerList2 = dao.getAllPlayers();
//			
//			if(playerList2.size()!=0) {
//				System.out.println("Found "+ playerList2.size()+" no of player in Db.... Printing them all");
//				for(Player p2:playerList2) {
//					System.out.println(p2);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
//		try {
//			dao.updatePlayerTeam(1002, 9003);
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			List<Player> playerList2 = dao.getAllPlayers();
//			
//			if(playerList2.size()!=0) {
//				System.out.println("Found "+ playerList2.size()+" no of player in Db.... Printing them all");
//				for(Player p2:playerList2) {
//					System.out.println(p2);
//				}
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		long contact = 3125556666L;
//		
//		try {
//			Player playerByContact = sdao.getPlayerByContact(contact);
//			System.out.println("Player with contact("+contact+") is found.");
//			System.out.println("Printing the info of the player found:"+"\n"+playerByContact.toString());
//			if (playerByContact!=null) {
//				System.out.println();
//			}
//		} catch (BusinessException e) {
//			System.out.println(e.getMessage());
//		}
		
//		int age = 18;
//		
//		try {
//			List<Player> listByAge = sdao.getPlayersByAge(age);
//			System.out.println(listByAge.size()+" players with age("+age+") is found.");
//			System.out.println("Printing the info of the players found:");
//			for(Player p:listByAge) {
//				System.out.println(p.toString());
//			}
//			
//		} catch (BusinessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
