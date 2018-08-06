package Tournament;
import java.util.*;

public class Tournament {
	private int tournamentType = 1;
	private int numOfRounds = 4;
	private int numOfTeams = 16;
	private int numOfParticipants;
	private String name = "TestTournament" ;  
	private int sportsType = 1;  // definieren we later wel als basketbal
	private String bracketID;
	private String tournamentID;
	private static int tournamentCounter;
	private int tournamentCounterID;

	public Tournament(int tournamentType, int numOfRounds, int numOfTeams, String name) {
		this.tournamentType = tournamentType;
		this.numOfRounds = numOfRounds;
		this.numOfTeams = numOfTeams;
		this.name = name;
		tournamentCounter++;		
		this.tournamentCounterID = this.tournamentCounter;
		GenerateUUID tournamentID = new GenerateUUID();
		this.tournamentID = tournamentID.generateID();
		this.createBracket();
		System.out.println("Tournament name: " + name);
		System.out.println("Tournament type: " + tournamentType);
		System.out.println("Tournament number of rounds: " + numOfRounds);	
		System.out.println("Tournament number of teams: " + numOfTeams);
		System.out.println("Tournament sport: " + sportsType);
		System.out.println("Tournament readable ID: " + tournamentCounterID);
		System.out.println("Tournament UUID: " + tournamentID);
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public 
	
	public void createBracket(){ 
		GenerateUUID bracketID = new GenerateUUID();
		this.bracketID = bracketID.generateID();
		//Bracket bracket = new Bracket(this.bracketID, this.numOfTeams, this.numOfRounds);
		}
	}
