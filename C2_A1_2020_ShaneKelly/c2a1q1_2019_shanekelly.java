import java.util.Scanner;   // import the scanner class to use in the program

public class c2a1q1_2019_shanekelly {

	public static void main(String[] args) {
			
			String input = new String(); //declaring String class
			Scanner userInput = new Scanner(System.in);  //declaring scanner
			
			boolean result = false; //declaring a boolean to use to check if the user enters 'exit'
			
			while(!result){ //while the user doesn't enter 'exit', ask the user to enter a string to reverse 
				
				System.out.print("\nEnter a sentence to be reversed: ");  //ask the user to enter a sentence
				input = userInput.nextLine(); // use the scanner to get the imput from the user
				
				int len = input.length(); //declare an int to store the length of the users input
				
				while(len != 0) //while loop to loop through the characters of the uers input
				{
					System.out.print(input.charAt(len-1));  //printing the characters in reverse order
					len = len-1; //move to the next character 
				}
				
				result = input.equalsIgnoreCase("exit"); //check if user input equals 'exit' and if so set result to true. 
														 // this will break the while loop
			}	
			userInput.close(); //close scanner
			
		}

}
