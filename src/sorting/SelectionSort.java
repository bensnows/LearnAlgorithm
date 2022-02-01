package sorting;

import common.util.PrintUtil;

public class SelectionSort implements SortingInterface {

	@Override
	public Integer[] sortArray(Integer[] array) {

		for (int index = 0; index < array.length - 1; index++) {
			int currentNum = array[index];
			int nextIndex = index + 1;
			int nextNum = array[nextIndex];

			for (int i = nextIndex + 1; i < array.length; i++) {
				if (nextNum > array[i]) {
					nextIndex = i;
					nextNum = array[i];
				}
			}
			if (currentNum > nextNum) {
				array[index] = nextNum;
				array[nextIndex] = currentNum;
			}
		}
		return array;
	}
}
