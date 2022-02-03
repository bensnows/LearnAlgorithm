package main.sorting.method;

import main.sorting.bean.LinkNode;

public class InsertSort implements SortingInterface {

	@Override
	public Integer[] sortArray(Integer[] array) {
		// sort by using linknode
//		return sortArrayByLinkNode(array);

		return sortArrayInArray(array);
	}

	private Integer[] sortArrayInArray(Integer[] array) {

		for (int i = 0; i < array.length; i++) {

			int temp = array[i];
			int tempIndex = i;
			int currentIndex = i + 1;
			while (currentIndex < array.length) {
				if (temp > array[currentIndex]) {
					temp = array[currentIndex];
					tempIndex = currentIndex;
				}
				currentIndex++;
			}
			
			//shift
			while(tempIndex>i) {
				array[tempIndex]=array[tempIndex-1];
				tempIndex--;
			}
			
			array[i] = temp;
		}

		return array;
	}

	private Integer[] sortArrayByLinkNode(Integer[] array) {
		LinkNode<Integer> firstNode = new LinkNode<Integer>(array[0]);

		for (int i = 1; i < array.length; i++) {
			Integer currentVal = array[i];
			// 幫新資料建立 node
			LinkNode<Integer> newNode = new LinkNode<Integer>(currentVal);

			LinkNode<Integer> tempNode = firstNode;
			while (true) {
				int tempVal = tempNode.getValue().intValue();

				// 1. current< tempNode
				// 2. temp<=currentVal, nextNode=null
				// 3. temp<current, next<current, find next
				if (currentVal < tempVal) {
					// 如果本次資料比第一個節點還小，代表要變成第一個節點
					newNode.setNext(tempNode);
					// 將起始節點變成新的節點
					firstNode = newNode;
					break;
				} else {
					LinkNode<Integer> nextNode = tempNode.getNext();
					if (nextNode == null) {
						tempNode.setNext(newNode);
						break;
					} else if (tempVal <= currentVal) {
						int nextVal = nextNode.getValue().intValue();
						if (currentVal < nextVal) {
							tempNode.setNext(newNode);
							newNode.setNext(nextNode);
							break;
						} else {
							tempNode = nextNode;
						}
					}
				}

			}
		}

		return LinkNode.asArray(firstNode);
	}

}
