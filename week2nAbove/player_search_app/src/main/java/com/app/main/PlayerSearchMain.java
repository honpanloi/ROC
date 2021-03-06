package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to PlayerDearch App V1.0");
		int ch = 0;
		
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		
		do {
			System.out.println("Player Search Menu");
			System.out.println("---------------------------------");
			System.out.println("1) by Id");
			System.out.println("2) by contact #");
			System.out.println("3) by Age");
			System.out.println("4) by Main Weapon");
			System.out.println("5) by Second Weapon");
			System.out.println("6) by Team Id");
			System.out.println("7) by Player Name");
			System.out.println("8) Show All players");
			System.out.println("9) Close app");
			System.out.println("Enter the corresponding number 1-9 to choose a function");
			
			try {
				ch= Integer.parseInt(scanner.nextLine());
			}catch(NumberFormatException e) {
				
			}
			
			switch (ch) {
			case 1:
				System.out.println("Enter Player Id to get Player details...");
				try {
					int id = Integer.parseInt(scanner.nextLine());
					//code to service layer
					Player player = playerSearchService.getPlayerById(id);
					if(player!=null) {
						System.out.println("Player found with id("+id+")...Details of the player is: \n"+player.toString());
					}
				}catch(NumberFormatException e) {
					System.out.println("Player id cannot be special charactors or symbols or white spaces");
				}catch (BusinessException e) {
					System.out.println(e.toString());
				}
				break;
			case 2:
				System.out.println("Enter a contact number to get Player details...");
				
				try {
					long contact = Long.parseLong(scanner.nextLine());
					Player player = playerSearchService.getPlayerbyContact(contact);
					if(player!=null) {
						System.out.println("Player found with contact("+contact+")..Details of the player is: \n"+player.toString());
					}
				}catch (NumberFormatException e) {
					System.out.println("Invalid contact number. Please enter a 10 digit number without spaces and special charcators in between");
				}catch (BusinessException e) {
					System.out.println(e.toString());
				}
				break;
			case 3:
				System.out.println("Enter an age to search player(s) in that age");
				
				try {
					int age = Integer.parseInt(scanner.nextLine());
					List<Player> playerList = playerSearchService.getAllPlayersByAge(age);
					System.out.println(playerList.size()+" player(s) found with age "+age);
					if(playerList.size()>0) {
						System.out.println("Printing the details of the player(s) found:");
						for(Player p :playerList) {
							System.out.println(p.toString());
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid age. Please enter an age without spaces and special charcators");
				} catch (BusinessException e) {
					System.out.println(e.toString());
				}
				
				break;
			case 4:
				System.out.println("Enter a weapon id to search player(s) who equiped it as main weapon");
				
				try {
					int weaponId = Integer.parseInt(scanner.nextLine());
					List<Player> playerList = playerSearchService.getAllPlayersByMainWeaponId(weaponId);
					
					if(playerList.size()>0) {
						System.out.println("Printing the details of the player(s) found:");
						for(Player p :playerList) {
							System.out.println(p.toString());
						}
					}
					
				} catch (NumberFormatException e) {
					System.out.println("Invalid weapon id. Please enter a weapon id without spaces and special charcators");
				} catch (BusinessException e) {
					System.out.println(e.toString());
				}
				
				break;
			case 5:
				System.out.println("Enter a weapon id to search player(s) who equiped it as second weapon");
				
				try {
					int weaponId = Integer.parseInt(scanner.nextLine());
					List<Player> playerList = playerSearchService.getAllPlayersBySecondWeaponId(weaponId);
					
					if(playerList.size()>0) {
						System.out.println("Printing the details of the player(s) found:");
						for(Player p :playerList) {
							System.out.println(p.toString());
						}
					}
					
				} catch (NumberFormatException e) {
					System.out.println("Invalid weapon id. Please enter a weapon id without spaces and special charcators");
				} catch (BusinessException e) {
					System.out.println(e.toString());
				}
				break;
			case 6:
				System.out.println("Enter a team id to search player(s) who are in that team");
				
				try {
					int teamId = Integer.parseInt(scanner.nextLine());
					List<Player> playerList = playerSearchService.getAllPlayersByTeamId(teamId);
					
					if(playerList.size()>0) {
						System.out.println("Printing the details of the player(s) found:");
						for(Player p :playerList) {
							System.out.println(p.toString());
						}
					}
					
				} catch (NumberFormatException e) {
					System.out.println("Invalid weapon id. Please enter a weapon id without spaces and special charcators");
				} catch (BusinessException e) {
					System.out.println(e.toString());
				}
				
				break;
			case 7:
				System.out.println("Enter a name to search player(s) with that name(case sensitive)");
				
				try {
					String name = scanner.nextLine();
					List<Player> playerList = playerSearchService.getAllPlayersByName(name);
					
					if(playerList.size()>0) {
						System.out.println("Printing the details of the player(s) found:");
						for(Player p :playerList) {
							System.out.println(p.toString());
						}
					}
					
				} catch (NumberFormatException e) {
					System.out.println("Invalid weapon id. Please enter a weapon id without spaces and special charcators");
				} catch (BusinessException e) {
					System.out.println(e.toString());
				}
				break;
			case 8:
				System.out.println("Printing all players in the DB....");
				try {
					
					List<Player> playerList = playerSearchService.getAllPlayers();
					
					if(playerList.size()>0) {
						System.out.println("Printing the details of the player(s) found:");
						for(Player p :playerList) {
							System.out.println(p.toString());
						}
					}
					
				
				} catch (BusinessException e) {
					System.out.println(e.toString());
				}
				break;
			case 9:
				System.out.println("Thank you for using our PlayerSearch app v1.0... Have a good one!");
				scanner.close();
				break;

			default:
				System.out.println("Invalid menu option... Please retry");
				break;
			}
			
		}while(ch!=9);

	}

}
