package SortingAlgorithms;

import java.util.*;

public class SortingMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] array = arrayGenerator(scan);

        Map<Integer, Sorter> strategies = new HashMap<>();
        strategies.put(1, new BubbleSort());
        strategies.put(2, new SelectionSort());
        strategies.put(3, new InsertionSort());

        System.out.println("Choose Sort Algorithm:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        int choice = scan.nextInt();

        Sorter sorter = strategies.get(choice);

        if (sorter == null) {
            System.out.println("Invalid choice!");
            return;
        }
        int[] sorted = sorter.sort(array.clone());
        System.out.println("Sorted Array: " + Arrays.toString(sorted));

        if (sorter instanceof BubbleSort) {
            int[] optimized = BubbleSort.optimizedBubbleSort(array.clone());
            System.out.println("Optimized Bubble Sort: " + Arrays.toString(optimized));
        }
    }

    public static int[] arrayGenerator(Scanner scan) {
       System.out.println("Enter array size:");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ":");
            arr[i] = scan.nextInt();
        }
        return arr;
    }
}

