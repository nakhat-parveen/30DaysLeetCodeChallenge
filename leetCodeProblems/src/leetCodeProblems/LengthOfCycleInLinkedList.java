package leetCodeProblems;

import leetCodeProblems.LinkedList.Node;

public class LengthOfCycleInLinkedList {
	
	static int lengthOfCycle(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				int length = 1;
				Node s = slow.next;
				while(s != slow) {
					length++;
					s = s.next;
				}
				return length;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 0);
		list.insertAtEnd(list, -4);
		list.createCycle(list, 1);
		System.out.println("length of cycle is : " + lengthOfCycle(list));


	}

}
