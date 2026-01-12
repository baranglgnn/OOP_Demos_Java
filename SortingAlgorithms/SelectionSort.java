package SortingAlgorithms;

public class SelectionSort implements Sorter {
    
	@Override
	public int[] sort(int[] array) {
		int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;           
        }
        return array;
	}
}
