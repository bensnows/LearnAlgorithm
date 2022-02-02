package main.sorting.bean;

import javax.print.attribute.standard.MediaSize.Other;

public class LinkNode<T> {

	private T value;
	private LinkNode<T> next;

	public LinkNode(T value) {
		super();
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public LinkNode<T> getNext() {
		return next;
	}

	public void setNext(LinkNode<T> next) {
		this.next = next;
	}

	public static <T> LinkNode<T> asLinkList(T[] array) {
		LinkNode<T> firstNode = new LinkNode<>(array[0]);
		for (int i = 1; i < array.length; i++) {
			firstNode.next = new LinkNode<>(array[i]);
		}

		return firstNode;
	}

	public static <T> T[] asArray(LinkNode<T> node) {
		int length = node.size();
		T val = node.getValue();
		T[] array = (T[]) java.lang.reflect.Array.newInstance(val.getClass(), length);
		LinkNode<T> nextNode = node;
		for (int i = 0; i < length; i++) {
			val = nextNode.getValue();
			array[i] = val;
			if (node.next != null) {
				nextNode = nextNode.next;
			}
		}

		return array;
	}

	public int size() {
		int otherNum = next == null ? 0 : next.size();
		return 1 + otherNum;
	}

}
