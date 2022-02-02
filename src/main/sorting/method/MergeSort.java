package main.sorting.method;

public class MergeSort implements SortingInterface {

	@Override
	public Integer[] sortArray(Integer[] array) {

		return mergeSort(array);
	}

	protected Integer[] mergeSort(Integer[] array) {

		if (array.length == 1) {
			return array;
		}

		// 0-5 3 0-3 3-5 0-middle, middle+1-end
		// 0-4 2 0-2 2-4 0-middle, middle+1-end
		// 0-2 1 0-1 1-2
		int halfLength = array.length / 2;

		Integer[] leftArray = new Integer[halfLength];
		Integer[] rightArray = new Integer[array.length - halfLength];

		for (int i = 0; i < halfLength; i++) {
			leftArray[i] = array[i];
		}

		for (int i = 0; i < rightArray.length; i++) {
			rightArray[i] = array[i + halfLength];
		}

		leftArray = mergeSort(leftArray);
		rightArray = mergeSort(rightArray);

		return mergeArray(array,leftArray, rightArray);
	}

	private Integer[] mergeArray(Integer[] oriArray,Integer[] leftArray, Integer[] rightArray) {

		int leftIndex = 0;
		int rightIndex = 0;
		int index = 0;

		while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
			if(leftArray[leftIndex]<=rightArray[rightIndex]) {
				oriArray[index++] = leftArray[leftIndex++]; 
			} else {
				oriArray[index++] = rightArray[rightIndex++]; 
			}
		}
		
		for(;leftIndex<leftArray.length;leftIndex++) {
			oriArray[index++]=leftArray[leftIndex]; 
		}
		
		for(;rightIndex<rightArray.length;rightIndex++) {
			oriArray[index++]=rightArray[rightIndex]; 
		}

		return oriArray;
	}

}
