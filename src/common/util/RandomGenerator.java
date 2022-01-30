package common.util;

import java.util.Random;

public class RandomGenerator {

	public static int[] generateNums(int size) {

		int[] array = new int[size];

		Random random = new Random();
		for (int i = 0; i < size; i++)
			array[i] = random.nextInt(size);

		return array;
	}
}
