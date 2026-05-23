package leetCodeProblems;

public class LinkedList {
    Node head;
    static class Node{
    	int val;
    	Node next;
    	Node(int val){
    		this.val = val;
    		next= null;
    	}
    }
    
    //insert an element at the end
    public static LinkedList insertAtEnd(LinkedList list, int value) {
    	Node newNode = new Node(value);
    	if(list.head == null) {
    		list.head = newNode;
    	}
    	else {
    		Node last = list.head;
    		while(last.next != null) {
    			last = last.next;
    		}
    		last.next = newNode;
    				
    	}
    	return list;
    }
    
    //to create a cycle in a linkedlist at certain position
    public static void createCycle(LinkedList list, int position) {
    	if(list.head ==  null) return;
    	Node temp = list.head;
    	Node cycleNode = null;
    	int count = 0;
    	while(temp.next != null) {
    		if(count == position) {
    			cycleNode = temp;
    		}
    		temp = temp.next;
    		count ++;
    	}
    	// Connecting last node to cycleNode
    	temp.next = cycleNode;
    	
    }

}
