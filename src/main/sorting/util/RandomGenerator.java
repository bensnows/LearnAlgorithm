package main.sorting.util;

import java.util.Random;

public class RandomGenerator {

	/**
	 * generate array with random nums, the pool of random nums is size*5
	 * @param size
	 * @return
	 */
	public static Integer[] generateRandomNums(int size) {

		Integer[] array = new Integer[size];

		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(size * 5);

		return array;
	}

	/**
	 * generate sequenced number array
	 * @param size
	 * @return
	 */
	public static Integer[] generateSeqnum(int size) {
		Integer[] array = new Integer[size];

		for (int i = 0; i < size; i++)
			array[i] = i;

		return array;
	}
}
