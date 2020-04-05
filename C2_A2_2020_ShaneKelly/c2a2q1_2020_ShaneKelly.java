import java.util.Scanner;

public class c2a2q1_2020_ShaneKelly {

	public static void main(String[] args) {
		boolean input = false, passwordCorrect = false;
        int i=0;										//declare and initialize variables
		char userLetter1 = ' ', userLetter2 = ' ', userLetter3 = ' ';

		Scanner letterInput = new Scanner(System.in); //declare a scanner object to get input from the user 
		
		do {   //do while loop that executes the below code until password is correct
			do {     // do while loop that is executed while the users input is incorrect 
				System.out.print("Please enter a letter of the alphabet: ");    //print to screen to get user input
				 
				if(i==0) {     //if the input from the user is the first letter we are looking for
					userLetter1 = letterInput.next().charAt(0); //use scanner to get the user input and store in variable
					if ((Character.isLetter(userLetter1))) {
						i++; 			//check to see if users input is a letter
					}
					else {
						System.out.print("Invalid entry. ");	//if so increment i and if not display error message	
					}
				}
				else if (i == 1) {     //if the input is the second letter
					userLetter2 = letterInput.next().charAt(0); //use scanner to get the user input and store in variabvle
					if ((Character.isLetter(userLetter2))) {
						i++; //check to see if the input is a letter
					}
					else {
						System.out.print("Invalid entry. ");     //if so increment i and if not display error message
					}
				}
				else {
					userLetter3 = letterInput.next().charAt(0); //use scanner to get the user input 
					if ((Character.isLetter(userLetter3))) {
						input=true; //check to see if the input is a letter
					}
					else {
						System.out.print("Invalid entry. "); //if so set input to true and if not display error message
					}
				}	
			}while(input != true);
			
			System.out.println("You entered: " + "[" + userLetter1 + "," + userLetter2 + "," + userLetter3 + "]");    // print result
			
			int total = sumLetters(userLetter1,userLetter2,userLetter3);   //call sumLetters passing letters and store return value in total
			
			System.out.println("The sum of the values is " + total);   //print total
			
			if(total % 5 == 0) {       // check if the total is divisible by 5 if so set passwordCorrect variable to true to break the loop.
				System.out.println("Password unlocked");
				passwordCorrect = true;
			}
			else {
				System.out.println("Incorrect password");
				i = 0;          //if not divisible by 5 then start again. 
				input = false;
			}		
		}while(passwordCorrect != true);
			
		letterInput.close();  //close scanners
	}
	
	
	public static int sumLetters(char let1, char let2, char let3) {  //start of method that takes in 3 parameters to add up the sum of the letters
        // returns a double
		int total = 0;
		
		if((let1 >= 'A' && let1 <= 'Z')) {
			total = total + let1 + 36;  //a = 97(ascii code for a) - 96 which equals 1.
		}
		else {
			total = total + let1 - 96;  //a = 97(ascii code for a) - 96 which equals 1.
		}
		
		if((let2 >= 'A' && let2 <= 'Z')) {
			total = total + let2 + 36;  //a = 97(ascii code for a) - 96 which equals 1.	
		}
		else {
			total = total + let2 - 96;  //a = 97(ascii code for a) - 96 which equals 1.
		}
		
		if((let3 >= 'A' && let3 <= 'Z')) {
			total = total + let3 + 36;  //a = 97(ascii code for a) - 96 which equals 1.
		}
		else {
			total = total + let3 - 96;  //a = 97(ascii code for a) - 96 which equals 1.
		}
		
		return total; //return total
	}	
}
