package common.util;

import java.util.Random;

public class RandomGenerator {

	public static Integer[] generateNums(int size) {

		Integer[] array = new Integer[size];

		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(size*5);

		return array;
	}
}
