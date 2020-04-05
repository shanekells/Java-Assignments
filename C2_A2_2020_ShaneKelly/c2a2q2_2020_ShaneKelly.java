import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;   //import classes
import java.util.Scanner;


public class c2a2q2_2020_ShaneKelly {

	public static void main(String[] args) throws IOException{   //main class that throws IOException
		
		File inputFile = new File(args[0]);   //take first file inputed from command prompt as the input file and store in variable 
		String[] lineArray = new String[4];   //declare variables
		int i = 0;
		
		Scanner in = new Scanner(inputFile);
	
		
		while(in.hasNextLine() && i < 4){   //while there is a line in the file
		   	
			String line = in.nextLine();
			
			lineArray[i] = line; //store string in an array
			
			i++;   //increment i to go to the next element of the array
		}		
		
		PrintWriter out = new PrintWriter(args[1]);  //take second file inputed from command prompt as the output file and store in variable
		
		for(int x=3; x>=0; x--) {
			out.println(lineArray[x]);       //print the information stored in the array to the output file starting with the last line first
		}
	
		in.close();
		out.close();   //close scanners
	}
}



