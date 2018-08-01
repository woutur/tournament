package Tournament;

//Testclass om alle klassen eens te initialiseren. 
import java.util.*;

public class MenuTeam {

	String team;
	String player;
	String tournament;
	String bracket;
	String game;

	public static void menu() {
		Scanner in = new Scanner(System.in);
		// print menu
		System.out.println("1. Set team name");
		System.out.println("2. Add player to team ");
		System.out.println("3. Print teams");
		System.out.println("4. Doesn't do anything yet");
		System.out.println("5. Doesn't do anthing yet");
		System.out.println("0. Exit to main menu");
		// handle user commands
		boolean quit = false;
		int menuItem;
		String teamName;
		do {
			System.out.print("Choose menu item: ");
			menuItem = in.nextInt();
			switch (menuItem) {
			case 1:
				// add code to set a team name calling team.
				teamName = in.next();
				Team team = new Team(teamName);
				break;
			
			case 2:
			
				// do something...
				break;
			case 3:
				// System.out.println(team.printTeams());
				// do something...
				break;
			case 4:
				
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
		System.out.println("Bye-bye!");
		
		}	
	}


//		Team localTeam = new Team(team, 1);
//		
//		
//1. maak een standaard tournooi aan.
//2. Maak teams aan
//3. Maak spelers aan
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
