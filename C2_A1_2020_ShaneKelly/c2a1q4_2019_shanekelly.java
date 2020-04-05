import java.util.Scanner; //import scanner class

public class c2a1q4_2019_shanekelly {

	public static void main(String[] args) {
		int personNum = 1;        //declare variables
		String userAnswers[] = new String[3];
		int result[] = new int[3];
		
		for(int i = 0; i < 4; i++) {   //for loop to ask the questions for the 4 people
			
			System.out.println("\nPerson " + personNum);  //print person number
			
			userAnswers = askQuestions();  //call method askQuestions and return result to userAnswers
			
			for(int x = 0; x < 3; x++) {  //loop through each of the answers and if answer is 'yes' then 
				if(userAnswers[x].equalsIgnoreCase("yes")) {
					result[x] = result[x] + 25;   //add 25 to the result array where the answers to that question are stored.
				}                                 //result[0] stores the marks for question 1 and so on
			}
			
			personNum++;  //increase the person number by 1
		}
		
		System.out.println("\nSurvey Results: ");  //print results of the questions/survey
		System.out.println("Do you play football?: " + result[0]);  //football results stored in result[0]
		System.out.println("Do you swim?: " + result[1]);  //swim results stored in result[1]
		System.out.println("Do you watch movies?: " + result[2]);   //movies results stored in result[0]
		
		
	}

	public static String[] askQuestions() {   //askQuestions method
		
		String userInput[] = new String[3];  //declare variables
		Scanner input = new Scanner(System.in);    //declare scanner
		boolean checkInput = false, checkInput2 = false, checkInput3 = false;  //booleans used to check user answer 
				
		while(checkInput == false) {    //while user answer is not 'yes' or 'no' then do the following
			System.out.print("Do you play football?: ");	//ask user the question
			userInput[0] = input.nextLine();   //get user input using scanner
			userInput[0] = userInput[0].toLowerCase();	//change to lowercase
			userInput[0] = userInput[0].strip();  //strip all leading and trailing white spaces
			
			if(userInput[0].equalsIgnoreCase("yes") || userInput[0].equalsIgnoreCase("no")) { //if user input is 'yes' or 'no' 
				checkInput = true;    //break the while loop by setting checkInput to true
			}
			else {
				System.out.println("Please enter Yes or No!");  //else print error 
			}
		}
		
		while(checkInput2 == false) {	//while user answer is not 'yes' or 'no' then do the following
			System.out.print("Do you swim?: ");	//ask user the question
			userInput[1] = input.nextLine();	//get user input using scanner
			userInput[1] = userInput[1].toLowerCase();	//change to lowercase
			userInput[1] = userInput[1].strip();	 //strip all leading and trailing white spaces
			
			if(userInput[1].equalsIgnoreCase("yes") || userInput[1].equalsIgnoreCase("no")) {	//if user input is 'yes' or 'no'
				checkInput2 = true;	//break the while loop by setting checkInput to true
			}
			else {
				System.out.println("Please enter Yes or No!");	//else print error 
			}
		}
		
		while(checkInput3 == false) {	//while user answer is not 'yes' or 'no' then do the following
			System.out.print("Do you watch movies?: ");	//ask user the question
			userInput[2] = input.nextLine();	//get user input using scanner
			userInput[2] = userInput[2].toLowerCase();	//change to lowercase
			userInput[2] = userInput[2].strip();	 //strip all leading and trailing white spaces
			
			if(userInput[2].equalsIgnoreCase("yes") || userInput[2].equalsIgnoreCase("no")) {	//if user input is 'yes' or 'no'
				checkInput3 = true;	//break the while loop by setting checkInput to true
			}
			else {
				System.out.println("Please enter Yes or No!");	//else print error 
			}
		}
		
		
		return userInput;   //return array with results
	}
}
