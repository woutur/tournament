package Tournament;

public class Bracket {
	private int numOfTeams;
	ArrayList<Bracket> bracket;
	private int bracketID;
	private int roundNum;
	// comment
	
	Bracket(int bracketID, int numOfTeams, int roundNum) {
		public void setNumOfTeams(int numOfTeams) {
			this.numOfTeams = numOfTeams;
		}
		public void setBracketID(int bracketID) {
			this.bracketID = bracketID;
		}
		public void setRoundNum(int roundNum) {
			this.roundNum = roundNum;
		}
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
	public int getBracketID() {
		return bracketID;
	}
	public void setBracketID(int bracketID) {
		this.bracketID = bracketID;
	}
	public int getRoundNum() {
		return roundNum;
	}
	public void setRoundNum(int roundNum) {
		this.roundNum = roundNum;
	}
	

}
