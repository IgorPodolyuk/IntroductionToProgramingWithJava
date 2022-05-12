package Lesson07_masivi_arrays_exercises;

import java.util.Arrays;

public class Ex15 {
	
	// Потърсете в интернет информация за алгоритъма "quick sort"
	// и негови реализации.

	public static void main(String[] args) {
		int[] array = {5,4,3,2,1, 10, 14, 34, 23, 0 , 1, 2, 5, 1, -100};
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
	static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int partition = partition(array, low, high);
			quickSort(array, low, partition-1);
			quickSort(array, partition+1, high);
		}
	}
	
	static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = low - 1;
		for (int j = low ; j < high ; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}

}
