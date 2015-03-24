package timus_online_judge;
import java.util.Scanner;
import java.lang.Math;

public class ReverseRoot {
	
	public static void processUserInput(int input){
			
		double square_root_result = Math.sqrt(input);
		
		System.out.println( square_root_result );
	}
	
	
	public static void main(String[] args){
		
		// Get the users input and pass the result into the processUserInput function
		
		Scanner ui = new Scanner(System.in);
		System.out.print("Enter any amount of numbers seperated by spaces to find out their square root");
		int full_user_string = ui.nextInt();
		processUserInput(full_user_string);
		
	}

}
