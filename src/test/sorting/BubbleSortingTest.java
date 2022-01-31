package test.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import common.util.PrintUtil;
import common.util.RandomGenerator;
import sorting.BubbleSorting;
import sorting.SortingInterface;
import test.SortingValidator;

class BubbleSortingTest {

	SortingInterface sortInterface = new BubbleSorting();

	@Test
	void test() {

		int[] randomArray = RandomGenerator.generateNums(20);
		PrintUtil.printArray("Before BubbleSort:%s", randomArray);
		sortInterface.sortArray(randomArray);
		PrintUtil.printArray("After BubbleSort:%s", randomArray);
		
		assertEquals(true, SortingValidator.validateArrayIsSorted(randomArray));
	}
}
