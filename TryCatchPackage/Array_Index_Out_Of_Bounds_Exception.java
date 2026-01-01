package TryCatchPackage;

import java.util.*;

public class Array_Index_Out_Of_Bounds_Exception {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int [] array = arrayGenerator(scan);
        while(true) {
        	try 
        	{
        	System.out.println("Please enter the index of the number you want to view : ");
        	int index = scan.nextInt();
        	System.out.println(array[index]);
        	break;
        }catch(ArrayIndexOutOfBoundsException exception)
        {
        	System.out.println("You have exceeded the array size!");
        	System.out.println(exception);
        }catch (InputMismatchException e) {
            System.out.println("Please enter a valid number!");
            System.out.println(e);
            scan.nextLine();
        }
        } 
	}
	public static int[] arrayGenerator(Scanner scan) {
		   System.out.println("Please enter the number of staff : "); 
			int staff=scan.nextInt(); 
			int[] array = new int[staff];
			for(int i=0;i<array.length;i++) {
				System.out.println("Please "+(i+1)+" enter the numbered element :");
				array[i]=scan.nextInt();
			}	
			return array;
	   }
}
