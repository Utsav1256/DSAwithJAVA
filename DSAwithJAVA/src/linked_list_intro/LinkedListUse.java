package linked_list_intro;

public class LinkedListUse {

	public static void main(String[] args) {
//		creating 1st node
		Node <Integer> node1 = new Node <Integer> (10);
		
		System.out.println(node1.data);
		System.out.println(node1.next);
		System.out.println(node1);
		
		
//		creating 2nd node
		Node <Integer> node2 = new Node <Integer> (20);
		
		System.out.println(node2.data);
		System.out.println(node2.next);
		System.out.println(node2);
		
		
//		linking node1 and node2
		node1.next = node2;
		System.out.println(node1.next);
		
		Node <Integer> node3 = new Node <Integer> (30);
		
		System.out.println(node3.data);
		node2.next = node3;
		
		System.out.println(node2.next);
		System.out.println(node3);
		
//		Node <Integer> head;  // this is just a reference it is not referring anything now, it is empty.
		
		Node <Integer> head = node1;
		
		
		
		
//		Printing linked list
//		while(head != null) {
//			System.out.print(head.data + " ");
////			System.out.println(head.next);
//			head = head.next;
//		}

		
		print(head);
		print(head);
//		head of print fn. is different from head of main function
	}
	
	public static void print(Node <Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
//			System.out.println(head.next);
			head = head.next;
		}
		System.out.println();
	}
	
	
	
	

}
