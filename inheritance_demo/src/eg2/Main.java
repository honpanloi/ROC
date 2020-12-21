package eg2;

public class Main {

	public static void main(String[] args) {
		
		Project p1 = new Project(9000, "Abc Crop", "Abc Corp Some Client");
		Employee e1 = new Employee(100, "Sarah", "Manager", 23333.44, p1);
		System.out.println("Printing e1 information: ");
		System.out.println(e1.toString());
		Address a1 = new Address(1111, "Some Street", "Chicago", 60616);
		Address a2 = new Address(2222, "Some Street", "New York City", 10001);
		e1.setPermanetAddress(a1);
		e1.setPresentAddress(a2);
		System.out.println("e1.permanetAddress = " + e1.getPermanetAddress());
		System.out.println("e1.presentAddress = "+e1.getPresentAddress());
		
		System.out.println("\nRegistering e1 as player1...");
		Player player1 = new Player(e1.getId(), e1.getName());
		player1.setSportName("Basket Ball");
		player1.setPostion("Center");
		Team t1 = new Team(1001, "Chicago Bulls", "Michael Jordan");
		player1.setTeam(t1);
		player1.setRating(4.19d);
		t1.addPlayer(player1);
		
		System.out.println("player1 information: \n"+player1.toString());
		
		
		
		Project p2 = new Project(9001, "SMS", "Revature");
		Employee e2 = new Employee(101, "John", "Associate", 3000.44, p2);
		System.out.println("\nPrinting e2 information");
		System.out.println(e2.toString());
		
		e2.setPermanetAddress(a1);
		e2.setPresentAddress(a2);
		System.out.println("e2.permanetAddress = " + e2.getPermanetAddress());
		System.out.println("e2.presentAddress = "+e2.getPresentAddress());
		
		System.out.println("\nRegistering e2 as player2...");
		Player player2 = new Player(e2.getId(), e2.getName());
		player2.setSportName("Basket Ball");
		player2.setPostion("Point Guard");

		player2.setTeam(t1);
		player2.setRating(3.99d);
		t1.addPlayer(player2);
		
		System.out.println("player2 information: \n"+player2.toString());
		
		System.out.println("\nThe members of Chicago Bulls:");
		t1.printAllmembers();
	}

}
