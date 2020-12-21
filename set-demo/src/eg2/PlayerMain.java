package eg2;

import java.util.HashSet;
import java.util.Set;

public class PlayerMain {

	public static void main(String[] args) {
		
		Player p1 = new Player(100, "John");
		System.out.println("p1 =" + p1);
		
		Player p2 = new Player(101, "Sara");
		System.out.println("p2 =" + p2);
		
		System.out.println(p1.equals(p2));
		
		
		Set<Player> players = new HashSet<>();
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		players.add(new Player(100, "Dinesh"));
		
		System.out.println("Printing all the players");
		for(Player p:players) {
			System.out.println(p);
		}
		
	}

}
