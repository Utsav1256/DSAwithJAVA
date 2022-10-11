package linked_list_intro;

import java.util.Scanner;
public class Taking_LinkedList_Input {
	
	public static Node <Integer> takeInput() {
		
		Node <Integer> head = null;
		
		Scanner scan = new Scanner(System.in);
		
		int data = scan.nextInt();
		
		while(data != -1) {
			
			Node <Integer> newNode = new Node <Integer> (data);
			
			if(head == null) {
				head = newNode;
			}
			else {
				Node <Integer> temp = head;
				
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
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
