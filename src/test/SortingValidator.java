package test;

public class SortingValidator {

	public static boolean validateArrayIsSorted(int[] array) {

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}

		return true;
	}

}