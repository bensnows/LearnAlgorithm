package test.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import bean.LinkNode;

class LinkNodeTest {

	@Test
	void testGetLength() {
		LinkNode<Integer> node = new LinkNode<Integer>(1);
		LinkNode<Integer> newNode = new LinkNode<Integer>(1);
		node.setNext(newNode);

		assertEquals(2, node.size());

		newNode.setNext(new LinkNode<Integer>(300));

		assertEquals(3, node.size());

	}

	private final static LinkNode getDefaultLinkNode() {
		LinkNode<Integer> node = new LinkNode<Integer>(1);
		node.setNext(new LinkNode<Integer>(2));

		return node;
	}

	@Test
	void testConvertArrayToLinkList() {
		Integer[] array = new Integer[] { 500, 300 };

		LinkNode<Integer> linkList = LinkNode.asLinkList(array);
		assertEquals(array[0].intValue(), linkList.getValue().intValue());
		assertEquals(array[1].intValue(), linkList.getNext().getValue().intValue());
		assertEquals(array.length, linkList.size());
	}

	@Test
	void testConvertLinkListToArray() {
		Integer[] array = new Integer[] { 500, 300 };
		LinkNode<Integer> linkList = LinkNode.asLinkList(array);

		Integer[] newArray = LinkNode.asArray(linkList);

		assertEquals(array.length, newArray.length);

		assertEquals(array[0].intValue(), newArray[0].intValue());
		assertEquals(array[1].intValue(), newArray[1].intValue());

	}
}
