package sorting;

public class BubbleSorting implements SortingInterface {

	@Override
	public Integer[] sortArray(Integer[] array) {
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
		return array;
	}

}
