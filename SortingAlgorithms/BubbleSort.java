package SortingAlgorithms;

public class BubbleSort implements Sorter {
    @Override
	public int[] sort(int[] array) {
		int temp = 0;
	       int counter = 0; 
	       for (int i = 0; i < array.length; i++) {
	           counter = i + 1;
	           for (int j = 1; j < (array.length - i); j++) {

	               if (array[j - 1] > array[j]) {
	                   temp = array[j - 1];
	                   array[j - 1] = array[j];
	                   array[j] = temp;
	               }
	           }
	       }
	       System.out.println("Steps quantity, non optimized = " + counter);
	       return array;
	}
	public static int[] optimizedBubbleSort(int myArray[]) {
	       int temp;
	       boolean swapped;
	       int counter = 0;  
	       for (int i = 0; i < myArray.length - 1; i++) {
	           counter = i + 1;
	           swapped = false;
	           for (int j = 0; j < myArray.length - i - 1; j++) {
	               if (myArray[j] > myArray[j + 1]) {
	                   temp = myArray[j];
	                   myArray[j] = myArray[j + 1];
	                   myArray[j + 1] = temp;
	                   swapped = true;
	               }
	           }  
	           if (swapped == false) {

	               break;
	           }
	       }
	       System.out.println("steps quantity, optimized = " + counter);
	       return myArray;
	   }
}
