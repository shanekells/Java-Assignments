import java.util.Scanner;   //import scanner class to use scanner to get user input

public class c2a1q3_2019_shanekelly {

	public static void main(String[] args) {
		
		System.out.print("Please enter a string: ");    //print to screen to get user input
		Scanner strInput = new Scanner(System.in);  //declare scanner to use
		String userStr = strInput.nextLine(); //use scanner to get the user input
		
		System.out.print("Please enter an integer: ");   //print to screen to get integer
		Scanner intInput = new Scanner(System.in);   //declare scanner to use
		int userInt = intInput.nextInt();  //get int from user using scanner
		
		System.out.print("Please enter a decimal number: "); //print to screen and ask user to enter decimal 
		Scanner dblInput = new Scanner(System.in);  //declare scanner to get input
		double userDouble = dblInput.nextDouble();  //use scanner to get the user input
		
		double result = convertString(userStr);  //call convertString method. Pass 3 parameters and store  
		                                                              // value returned in the variable called result
		result = result + userDouble + userInt;
		
		System.out.println("Result is: " + result);    // print result
		
		strInput.close();  //close scanners
		intInput.close();
		dblInput.close();
	}
	

	public static double convertString(String str) {  //start of method that takes in 3 parameters
		                                                                     // returns a double
		int count, len;    //declare variables to use
		double total = 0;
		
		String strLower = str.toLowerCase();   //convert string to lower case using the toLowerCase method
		char[] charString = strLower.toCharArray();  //then change the string to a char array
		
		len = str.length();  //get the length of str and store in the variable len
		
		for(count = 0; count < len; count++) {  //loop through each characters of the array
			
			if(charString[count] < 97 || charString[count] > 122) {   //using ascii values for each character
				if(charString[count] > 47 && charString[count] < 58) {  //if char is a number between 0-9
					total = total + charString[count] - 48; //take 48 away from the ascii value to get a required value
				}                                           //for that character. Where 1 = 49(acsii code for 1) - 48.
				else {
					total = total + 0;  // else it's special char where we add 0 to the total.
				}
									
			}
			else {  //if it's not a number and it's not a special char then it's a letter
				total = total + charString[count] - 96; //a = 97(ascii code for a) - 96 which equals 1.
			}          									//b = 98(ascii code for b) - 96 which equals 2.
		} 
		return total; //return total
	
	}	
}
	


