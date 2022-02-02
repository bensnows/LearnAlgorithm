package test.sorting.method;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import main.sorting.method.BubbleSorting;
import main.sorting.method.SortingInterface;
import main.sorting.util.PrintUtil;
import main.sorting.util.RandomGenerator;
import test.sorting.util.SortingValidator;

class BubbleSortingTest {

	SortingInterface sortInterface = new BubbleSorting();

	@Test
	void test() {

		Integer[] randomArray = RandomGenerator.generateRandomNums(20);
		PrintUtil.printArray("Before BubbleSort:%s", randomArray);
		sortInterface.sortArray(randomArray);
		PrintUtil.printArray("After BubbleSort:%s", randomArray);
		
		assertTrue(SortingValidator.validateArrayIsSorted(randomArray));
	}
}
