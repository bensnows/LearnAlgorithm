package test.sorting.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SortingValidator {

	public static boolean validateArrayIsSorted(Integer[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}

		return true;
	}
	
	public static boolean validateArrayDataIsCoped(Integer[] oriArray, Integer[] newArray) {
		List<Integer> oriData = Arrays.asList(oriArray);
		List<Integer> newData = Arrays.asList(newArray);
		
		return new HashSet<>(oriData).equals(new HashSet<>(newData));
	}

}
