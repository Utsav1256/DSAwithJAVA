package linked_list_intro;

import java.util.Scanner;
public class Taking_LinkedList_Input {
	
//	public static Node <Integer> takeInput() {
//		
//		Node <Integer> head = null;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int data = scan.nextInt();
//		
//		while(data != -1) {
//			
//			Node <Integer> newNode = new Node <Integer> (data);
//			
//			if(head == null) {
//				head = newNode;
//			}
//			else {
//				Node <Integer> temp = head;
//				
//				while(temp.next != null) {
//					temp = temp.next;
//				}
//				temp.next = newNode;
//			}
//			data = scan.nextInt();
//		}
//		return head;
//	} // It's Time Complexity is O(n^2)
////	Bcz. here to reach the last node, we have to travel from all previous nodes
//	
	
	
//	Decreasing the Time Complexity
	public static Node <Integer> takeInput() {
		
		Node <Integer> head = null, tail = null;
		
		Scanner scan = new Scanner(System.in);
		int data = scan.nextInt();
		
		while(data != -1) {
			
//			making new node
			Node <Integer> newNode = new Node <Integer> (data);
			
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode; //tail = tail.next
			}
			
			data = scan.nextInt();	
		}
		return head;
		
		
	}
 	public static void print(Node <Integer> head) {
 		
 		while(head != null) {
 			System.out.print(head.data + " ");
 			head = head.next;
 		}
 		System.out.println();
 	}
 	

	public static void main(String[] args) {

		// Taking Input
		Node <Integer> head = takeInput();
		
		//Printing LinkedList
		print(head);
			
	}
	
	
	

}
