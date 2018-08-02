package Tournament;

public class Bracket {
	private String bracketName;
	private int numOfTeams;
	private String bracketID;
	private int roundNum;
	// comment
	
	Bracket(String bracketID, int numOfTeams, int roundNum) {
		this.numOfTeams = numOfTeams;
		this.bracketID = bracketID;
		this.roundNum = roundNum;
		}
	
	public boolean buildBracket(int numOfTeams) {
		ArrayList String bracket = new Array[numOfTeams[]; /*even uitzoeken hoe arrays */
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
		return roundNum;
	}
	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
	

}
