package leetCodeProblems;

import leetCodeProblems.LinkedList.Node;

public class LinkedListCycleII {
	
	public static int detectCyclePos(LinkedList list){
		Node slow = list.head;
		Node fast = list.head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				slow = list.head;
				while(slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				//now slow node is the the pos where cycle begins
				Node temp = list.head;
				int pos = 0;
				while(temp != slow) {
					temp = temp.next;
					pos ++;
				}
				return pos;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertAtEnd(list, 3);
		list.insertAtEnd(list, 2);
		list.insertAtEnd(list, 0);
		list.insertAtEnd(list, -4);
		list.createCycle(list, 2);
		System.out.println("cycle detected at index : " + detectCyclePos(list));

	}

}
