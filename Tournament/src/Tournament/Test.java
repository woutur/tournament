package Tournament;

// Testclass om alle klassen eens te initialiseren. 
import java.util.*;

public class Test {

	String team;
	String player;
	String tournament;
	String bracket;
	String game;
	String UUID = null;

	public void menu() {
		Scanner in = new Scanner(System.in);
		
		// handle user commands
		boolean quit = false;
		int menuItem;
		do {
			for (int i = 0; i <40;i++) {
				System.out.println("\n");
				}
			
			// print menu
			if (this.UUID != null) {
				System.out.println("There is an UUID: " + UUID);
			}
			if (this.team != null) {
				System.out.println("Current Teamname: " + team);
			}
			System.out.println("1. Go to the Tournament menu");
			System.out.println("2. Go to the Team menu");
			System.out.println("3. Go the Player menu");
			System.out.println("4. Test ID");
			System.out.println("5. Doesn't do anthing yet");
			System.out.println("0. Quit");
			System.out.print("Choose menu item: ");
			menuItem = in.nextInt();
		
			switch (menuItem) {
			case 1:				
				MenuTournament menutournament = new MenuTournament();
				menutournament.menu();
				break;
			
			case 2:
				MenuTeam menuteam = new MenuTeam();
				menuteam.menu();
				
				break;
			case 3:
				
				// do something...
				break;
			case 4:
				GenerateUUID testID = new GenerateUUID();
				this.UUID = testID.generateID();
				System.out.println(UUID);
				
				// do something...
				break;
			case 5:
				
				// do something...
				break;
			case 0:
				quit = true;
				break;
			default:
				System.out.println("Invalid choice.");
			}
		} while (!quit);
		System.out.println("Thanks for using this program!");
		
		}	
	}


//		Team localTeam = new Team(team, 1);
//		
//		
// 1. maak een standaard tournooi aan.
// 2. Maak teams aan
// 3. Maak spelers aan
//		Team[] teams;
//		teams = new Team[] {"Lakers", Celtics, Bulls, Sixers, Heat, Wizards, Raptors, Pistons, Pacers, Warriors, Rockets, Spurs, Kings, Trailblazers, Jazz, Suns§};
//		
//		// Adding a team
//		// System.out.println("Test has made a team");	
//		// Team Lakers = new Team(("Lakers"), 1);
//		// Adding a player
//		System.out.println("Test has made a player");
//		Player johnson = new Player("Magic Johnson");
//		// Adding a player to a team
//		System.out.println("Test is adding a player");
//		johnson.addPlayerToTeam(johnson, Lakers);
