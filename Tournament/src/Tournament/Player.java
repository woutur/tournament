package Tournament;
import java.util.*;

public class Player extends Person {
	private String name;
	private int playerNumber;
	private Team team;
	private String gender;
	private int playerID;
	
	public int getPlayerID() {
		return playerID;
	}


	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}


	Player(String name){
		this.name = name;
		System.out.println("[Player] has made a player " + name);
	}
	
	
	Player(String name, Team team) {
		// TODO Auto-generate constructor stub
		this.team = team;
		this.name = name;
		System.out.println("Player: " + name + " created. He plays for: " + team);
		addPlayerToTeam(team);
	}
	public void addPlayerToTeam(Player player, Team team) {
		if(Team.teams.contains(team)) {
			System.out.println("[Player] Adding " + player + " to " + team);
			team.addPlayer(player, team);
			}
	}
	
	public Team getTeam() {
		return team;
	}
	public void setTeam(Object team) {
		// this.team = team;
		//team.addPlayer(this.Player);
	}
	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}
	@Override
	public String toString() {
		return getClass().getSimpleName() + "[name=" + name + "]";
	}
	
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setPersonType() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSportsType() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setGender() {
		// TODO Auto-generated method stub
		
	}

}
