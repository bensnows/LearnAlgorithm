package test.sorting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import common.util.PrintUtil;
import common.util.RandomGenerator;
import sorting.InsertSort;
import sorting.SortingInterface;
import test.SortingValidator;

public class InsertSortTest {

	SortingInterface sortInterface = new InsertSort();

	@Test
	void test() {

		Integer[] randomArray = RandomGenerator.generateNums(5);
		PrintUtil.printArray("Before insertSort:%s", randomArray);
		Integer[] sortedArray = sortInterface.sortArray(randomArray);
		PrintUtil.printArray("After insertSort:%s", sortedArray);
		
		assertEquals(true, SortingValidator.validateArrayIsSorted(sortedArray));
	}
}
