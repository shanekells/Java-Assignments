import java.util.Random;           //imports for use of the Random class

public class VotingMachineTest {    // VotingMachineTest class

	public static void main(String[] args) {
		
		VotingMachine election = new VotingMachine();   // create an object of the VotingMachine class.
		Random random = new Random();     //create a random object of the Random class
		
		for(int x=0; x<3; x++) {    //loop 3 times to get 3 sets of votes
				
			for(int i=0; i<578; i++) {  //get 578 votes
				
			    int vote = random.nextInt(2);  //get random number either 0 or 1
				
				if(vote == 0) {  //if the vote is 0 then give party A a vote 
					election.setPartyAVotes(1);
				}
				else {    //else vote is 1 and give party B a vote
					election.setPartyBVotes(1);
				}
			}
			
			System.out.println("Results of election:");         //print the results of the election
			System.out.println("Party A Votes: " + election.getPartyAVotes());   //print results by calling the get methods
			System.out.println("Party B Votes: " + election.getPartyBVotes());
			
			if(election.getPartyAVotes() < election.getPartyBVotes()) { 	//calculate who the winner is using an if statement
				System.out.println("Party B wins!"); 				//if B is greater than A then B is the winer
				election.clearVotes();     // clear votes
			}
			else if(election.getPartyAVotes() > election.getPartyBVotes()) {	//if A votes is greater than B then A is the winner
				System.out.println("Party A wins!");
				election.clearVotes();
			}
			else {
				System.out.println("It's a draw!");     //else it's a draw
				election.clearVotes();
			}
		}
	}
}