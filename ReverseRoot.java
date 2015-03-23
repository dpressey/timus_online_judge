package timus_online_judge;
import java.util.Scanner;
import java.lang.Math;

public class ReverseRoot {
	
	public static void processUserInput(String input){
		
		String[] split_user_string = input.split(" ");
		
		for(int i=0; i < split_user_string.length; i++){
			// convert each string in the array to a double and print the results
			
			int converted_result = Integer.parseInt(split_user_string[i]);
			
			double square_root_result = Math.sqrt(converted_result);
			
			System.out.println( square_root_result );
		}
	}
	
	
	public static void main(String[] args){
		
		// Get the users input and pass the result into the processUserInput function
		
		Scanner ui = new Scanner(System.in);
		System.out.print("Enter any amount of numbers seperated by spaces to find out their square root");
		String full_user_string = ui.next();
		processUserInput(full_user_string);
		
	}

}
