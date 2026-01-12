package SortingAlgorithms;

public class InsertionSort implements Sorter{
    @Override
	public int[] sort(int[] array) {
		int n = array.length;
        for (int i = 1; i < n; ++i) {
            int k = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > k) {
                array[j + 1] = array[j];
                j = j - 1;
            }
          
            array[j + 1] = k;
        }
        return array;
	}
}
