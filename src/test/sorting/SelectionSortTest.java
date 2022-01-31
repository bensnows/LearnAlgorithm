package test.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import common.util.PrintUtil;
import common.util.RandomGenerator;
import sorting.SelectionSort;
import sorting.SortingInterface;
import test.SortingValidator;

class SelectionSortTest {

	SortingInterface selectSort = new SelectionSort();

	@Test
	void test() {
		int[] array = RandomGenerator.generateNums(20);
		PrintUtil.printArray("Before select Sort: %s", array);
		selectSort.sortArray(array);
		PrintUtil.printArray("After select Sort: %s", array);

		assertEquals(true, SortingValidator.validateArrayIsSorted(array));

	}

}
