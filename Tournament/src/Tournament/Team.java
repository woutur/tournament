package Tournament;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Team {
	private String teamName;
	ArrayList<Integer> tournaments = new ArrayList<Integer>();
	ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<Team> teams = new ArrayList<Team>();
	
	public Team(String teamName){
		this.teamName = teamName;
		teams.add(this);
		System.out.println("[Team]: " + teamName);
		}
	
	public Team(String teamName, int tournamentID){
		this.teamName = teamName;
		tournaments.add(tournamentID);
		teams.add(this);
		System.out.println("[Team]: " + teamName);
		System.out.println("TournamentID: " + tournamentID);
		}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void addPlayer(Player player, Team team) {
		team.players.add(player);
		System.out.println("[Team] Added: " + player);
		}
	@Override
	public String toString() {
		return teamName;
		}
	public static void printTeams() {
		System.out.print(teams);
		try {
		    Thread.sleep(2000);
		} 
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
			}
		}
}
