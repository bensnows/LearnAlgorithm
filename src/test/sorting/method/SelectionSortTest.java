package test.sorting.method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.sorting.method.SelectionSort;
import main.sorting.method.SortingInterface;
import main.sorting.util.PrintUtil;
import main.sorting.util.RandomGenerator;
import test.sorting.util.SortingValidator;

class SelectionSortTest {

	SortingInterface selectSort = new SelectionSort();

	@Test
	void test() {
		Integer[] array = RandomGenerator.generateRandomNums(20);
		PrintUtil.printArray("Before select Sort: %s", array);
		selectSort.sortArray(array);
		PrintUtil.printArray("After select Sort: %s", array);

		assertEquals(true, SortingValidator.validateArrayIsSorted(array));

	}

}
