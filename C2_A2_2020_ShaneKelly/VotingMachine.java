
public class VotingMachine {               // voting machine class
	
	private int votesPartyA, votesPartyB;   //voting machine variables
	
	public VotingMachine() {        //voting machine constructor that initializes the variables to 0
		this.votesPartyA = 0;
		this.votesPartyB = 0;
	}
	
	public void clearVotes() {      // method to clear the votes and assign 0 to the variables
		this.votesPartyA = 0;
		this.votesPartyB = 0;
	}
	
	public int getPartyAVotes() {   //getter that returns party a votes
		return this.votesPartyA;
	}
	
	public int getPartyBVotes() {    //getter that returns party b votes
		return this.votesPartyB;
	}
	
	public void setPartyAVotes(int vote) {  //setter that assigns party A a value
		this.votesPartyA += vote;
	}
	
	public void setPartyBVotes(int vote) {   //setter that assigns party B a value
		this.votesPartyB += vote;
	}
}
