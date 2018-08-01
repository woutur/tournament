package Tournament;

public class Game {
private int sportsType;
private int score1;
private int score2;
private String contestant1;
private String contestant2;
private String date;
private int round;
private int roundGame;
private int gameID;

// default constructor for setting up games
	Game(int type, String contestant1, String contestant2, int round, int gameID){
	

}

	public int getSportsType() {
		return sportsType;
	}

	public void setSportsType(int sportsType) {
		this.sportsType = sportsType;
	}

	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}

	public String getContestant1() {
		return contestant1;
	}

	public void setContestant1(String contestant1) {
		this.contestant1 = contestant1;
	}

	public String getContestant2() {
		return contestant2;
	}

	public void setContestant2(String contestant2) {
		this.contestant2 = contestant2;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getRoundGame() {
		return roundGame;
	}

	public void setRoundGame(int roundGame) {
		this.roundGame = roundGame;
	}

	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}
}
