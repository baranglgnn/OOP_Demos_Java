package TryCatchPackage;

import java.util.*;

public class Input_Mismatch_Exception{

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num;
	    while (true) {
	        try {
	            System.out.println("Please enter number : ");
	            num = scan.nextInt();
	            break; 
	        } catch (InputMismatchException exception) {
	            System.out.println("Please enter a valid number!");
	            scan.nextLine(); 
	        }
	    }
	    System.out.println("Your number is: " + num);
	}
}
