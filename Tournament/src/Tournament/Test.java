package Tournament;

// Testclass om alle klassen eens te initialiseren. 
import java.util.*;

public class Test {

	String team;
	String player;
	String tournament;
	String bracket;
	String game;

	public static void menu() {
		Scanner in = new Scanner(System.in);
		// print menu
		System.out.println("1. Go to the Tournament menu");
		System.out.println("2. Go to the Team menu");
		System.out.println("3. Go the Player menu");
		System.out.println("4. Doesn't do anything yet");
		System.out.println("5. Doesn't do anthing yet");
		System.out.println("0. Quit");
		// handle user commands
		boolean quit = false;
		int menuItem;
		do {
			System.out.print("Choose menu item: ");
			menuItem = in.nextInt();
			switch (menuItem) {
			case 1:				
//				Scanner inTour = new Scanner(System.in);
//				do {
//					System.out.print("Choose menu item: ");
//					menuItem = inTour.nextInt();
//					switch (menuItem) {
//				// print menu
//				System.out.println("1. Create new Tournament");
//				System.out.println("2. Set Tournament type");
//				System.out.println("3. Set number of rounds");
//				System.out.println("4. Set number of teams");
//				System.out.println("0. Back to the main menu");
//				case 11:
				
					
//				case 0:
//					quit = true;
//					break;
//					
//				default:
//					System.out.println("Invalid choice.");
//					}
//				} while (!quit);
//				System.out.println("Back to the main menu");
//				// 
//				// do something...
				break;
			
			case 2:
				MenuTeam menuteam = new MenuTeam();
				menuteam.menu();
				
				break;
			case 3:
				
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
