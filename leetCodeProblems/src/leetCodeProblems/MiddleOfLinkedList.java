package leetCodeProblems;

import leetCodeProblems.LinkedList.Node;

/* Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node. */

public class MiddleOfLinkedList {
	
	public static Node middleNode(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while(fast != null && fast.next != null) {
			slow =slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);
		list.insertAtEnd(list, 5);
		list.insertAtEnd(list, 6);
		System.out.println("Middle node of the linked list is : " + middleNode(list));

	}

}
