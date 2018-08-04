package Tournament;
import java.util.*;

public class MenuTournament {
		int numOfRounds;
		int numOfTeams;
		String tournamentName;
		int tournamentType;
		String bracket;
		String game;

		public void menu() {
			Scanner in = new Scanner(System.in);
			// print menu
			for (int i = 0; i <40;i++) {
				System.out.println("\n");
				}
			System.out.println("1. Set tournament name");
			System.out.println("2. Set tournament type (1)");
			System.out.println("3. Set # of rounds");
			System.out.println("4. Set # of teams");
			System.out.println("5. Generate Tournament");
			System.out.println("0. Exit to main menu");
			// handle user commands
			boolean quit = false;
			int menuItem;
			do {
				System.out.print("Choose menu item: ");
				menuItem = in.nextInt();
				switch (menuItem) {
				
				case 1:
					// add code to set a team name calling team.
					tournamentName = in.next();
					this.tournamentName = tournamentName;
					break;
				
				case 2:
				    tournamentType = in.nextInt();
					this.tournamentType = tournamentType;		
					break;
				
				case 3:
					numOfRounds = in.nextInt();
				    this.numOfRounds = numOfRounds;
					break;
					
				case 4:
					numOfTeams = in.nextInt();
					this.numOfTeams = numOfTeams;
					break;
					
				case 5:
					if (tournamentType != 0 && numOfRounds != 0 && numOfTeams != 0 && tournamentName != null) {
						Tournament tournament = new Tournament(tournamentType, numOfRounds, numOfTeams, tournamentName);
					}else {
						System.out.println("Not all things are set. please check by pressing 6");
					}
					break;
					
				case 6:
					System.out.println(tournamentName);
					System.out.println(tournamentType);
					System.out.println(numOfRounds);
					System.out.println(numOfTeams);
					break;
					
				case 0:
					quit = true;
					break;
					
				default:
					System.out.println("Invalid choice.");
				}
			} while (!quit);
			System.out.println("Returning to main menu");
			
			}	
}

