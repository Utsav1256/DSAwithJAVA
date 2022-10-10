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
		

	}

}
