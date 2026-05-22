package leetCodeProblems;

import leetCodeProblems.LinkedList.Node;

/* Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false. */


public class LinkedListCycle {
	
	public static boolean hasCycle(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while(fast != null && fast.next !=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow ==  fast) {
				return true;
			}
		}
		return false ;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 0);
		list.insertAtEnd(list, 4);
		list.createCycle(list, 3);
		boolean hasCycle = hasCycle(list);
		System.out.println("Cycle Detected ? : " + hasCycle);

	}

}
