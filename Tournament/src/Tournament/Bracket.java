package Tournament;

public class Bracket {
	private String bracketName;
	private int numOfTeams;
	private String bracketID;
	private int numOfRounds;
	// comment
	
	Bracket(String bracketID, int numOfTeams, int numOfRounds) {
		this.numOfTeams = numOfTeams;
		this.bracketID = bracketID;
		this.numOfRounds = numOfRounds;
		}
	
	public boolean buildBracket(int numOfTeams) {
		// ArrayList String bracket = new Array[numOfTeams[]; /*even uitzoeken hoe arrays */
		}
	public int getNumOfTeams() {
		return numOfTeams;
	}
	public void setNumOfTeams(int numOfTeams) {
		this.numOfTeams = numOfTeams;
	}
	public String getBracketID() {
		return bracketID;
	}
	public void setBracketID(String bracketID) {
		this.bracketID = bracketID;
	}
	public int getRoundNum() {
		return numOfRounds;
	}
	public void setRoundNum(int numOfRounds) {
		this.numOfRounds = numOfRounds;
	}
	

}
