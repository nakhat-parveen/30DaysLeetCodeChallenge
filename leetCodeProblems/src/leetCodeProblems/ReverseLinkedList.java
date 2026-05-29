package leetCodeProblems;

import leetCodeProblems.LinkedList.Node;

public class ReverseLinkedList {
	
	public static LinkedList reverseLinkedList(LinkedList list) {
		Node curr = list.head;
		Node prev = null;
		Node next = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		list.head = prev;
		return list;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 1);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 4);
		System.out.print("Original list : ");
	    list.printList();
		reverseLinkedList(list);	
		System.out.print("reverse linked list : " );
		list.printList();

	}

}
