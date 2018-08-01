package Tournament;
import java.util.*;

public class Tournament {
	private int tournamentType = 1;
	private int numOfRounds = 4;
	private int numOfTeams = 16;
	private int numOfParticipants;
	private String name = "TestTournament" ;  
	private int sportsType = 1;  // definieren we later wel als basketbal

	public Tournament(int type, int rounds, int numOfTeams, String name) {
			this.tournamentType = type;
			this.numOfRounds = rounds;
			this.numOfTeams = numOfTeams;
			this.name = name;
		
		}
		
	}
