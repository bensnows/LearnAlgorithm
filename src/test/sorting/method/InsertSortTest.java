package test.sorting.method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.sorting.method.InsertSort;
import main.sorting.method.SortingInterface;
import main.sorting.util.PrintUtil;
import main.sorting.util.RandomGenerator;
import test.sorting.util.SortingValidator;

public class InsertSortTest {

	SortingInterface sortInterface = new InsertSort();

	@Test
	void test() {

		Integer[] randomArray = RandomGenerator.generateRandomNums(5000);
		PrintUtil.printArray("Before insertSort:%s", randomArray);
		Integer[] sortedArray = sortInterface.sortArray(randomArray);
		PrintUtil.printArray("After insertSort:%s", sortedArray);
		
		assertEquals(true, SortingValidator.validateArrayIsSorted(sortedArray));
	}
}
