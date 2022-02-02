package test.sorting.method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.sorting.method.MergeSort;
import main.sorting.method.SortingInterface;
import main.sorting.util.PrintUtil;
import main.sorting.util.RandomGenerator;
import test.sorting.util.SortingValidator;

public class MergeSortTest {
	SortingInterface sortInterface = new MergeSort();

	@Test
	void test() {

		Integer[] randomArray = RandomGenerator.generateSeqnum(5);
		PrintUtil.printArray("Before BubbleSort:%s", randomArray);
		sortInterface.sortArray(randomArray);
		PrintUtil.printArray("After BubbleSort:%s", randomArray);

		assertEquals(true, SortingValidator.validateArrayIsSorted(randomArray));
	}
	
	@Test
	void testForRandomNums() {

		Integer[] randomArray = RandomGenerator.generateRandomNums(100000);
		PrintUtil.printArray("Before BubbleSort:%s", randomArray);
		Integer[] newArray = sortInterface.sortArray(randomArray);
		PrintUtil.printArray("After BubbleSort:%s", newArray);

		assertEquals(true, SortingValidator.validateArrayIsSorted(newArray));
		assertEquals(true, SortingValidator.validateArrayDataIsCoped(randomArray, newArray));
	}
}
