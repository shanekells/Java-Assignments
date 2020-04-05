import java.util.Scanner;	//import scanner class to use a scanner to get user input

public class c2a1q2_2019_shanekelly {

	public static void main(String[] args) {
		
		int strLen, firstIndex = 0, lastIndex;     //declaring variables
		boolean firstInt = true, lastInt = true;
		Scanner input = new Scanner(System.in); //declare scanner to get user input
		
		System.out.print("Enter a string: ");  //ask user to enter string
				
		String userStr = input.nextLine();  //get user input using the scanner 
		strLen = userStr.length(); //store user input length

		Scanner startIndex = new Scanner(System.in); //declare a scanner to get the start index frmo the user
		
		
		while(firstInt == true) { //while the user does't enter an index in range, do the following
			
			System.out.print("Enter the start index: "); //ask user to enter first index
			
			firstIndex = startIndex.nextInt(); //get user input using a scanner
			
			if(firstIndex >= strLen) {  //if user input is not in range show error message
				System.out.print("Index not in range, please try again\n");
			}
			else { //else break from asking the user to enter the start index
				firstInt = false;
			}
		}
		
		Scanner endIndex = new Scanner(System.in); //declare a scanner to get end index from the user
		
		while(lastInt == true) { //while the user does't enter an index in range, do the following
			
			System.out.print("Enter the end index: ");  //ask user to enter first index
			lastIndex = endIndex.nextInt(); //get user input using a scanner
				
			if(lastIndex < firstIndex) {   //if user input is less than start index then show error message  
				System.out.print("End index must be >= startIndex, please try again\n"); 
			}
			else if(lastIndex > strLen-1) {  //if user input is greater than the length of string show error message
				System.out.print("End index must be <= length of string\n");
			}
			else {  //otherwise print the substring using user inputs and break from while loop by setting lastInt to false
							
				System.out.println(userStr.substring(firstIndex, lastIndex+1));
				lastInt = false;
			}
		}
		
		endIndex.close();    //close scanners
		startIndex.close();
		input.close();

	}
}
	
	
