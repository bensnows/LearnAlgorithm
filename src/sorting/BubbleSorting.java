package sorting;

import common.util.PrintUtil;
import common.util.RandomGenerator;

public class BubbleSorting {

	public static void main(String[] args) {

		int size = 10;
		int[] randomArray = RandomGenerator.generateNums(size);

		System.out.println("原始資料:" + PrintUtil.printArray(randomArray));
		bubbleSorting(randomArray);
		System.out.println("最後結果:" + PrintUtil.printArray(randomArray));
	}

	private static void bubbleSorting(int[] array) {
		int size = array.length;
		// sorting times

		boolean revert = false;

		for (int times = 0; times < size - 1; times++) {
			revert = false;
			for (int index = 0; index < size - times - 1; index++) {
				
				int first = array[index];
				int next = array[index + 1];

				if (first > next) {
					array[index] = next;
					array[index + 1] = first;
					revert = true;
				}
			}

			if (!revert) {
				System.out.println("times: " + times);
				break;
			}
		}
	}

}
