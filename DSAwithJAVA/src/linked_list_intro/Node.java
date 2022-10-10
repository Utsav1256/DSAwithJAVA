package linked_list_intro;

//public class Node {
//	int data;
//	Node next;
//	
////	constructor
//	Node(int data) {//name of the constructor must be same as name of the class
//		this.data = data;
//		next = null;
//	}
//}
////But this is only for integers

//	Making a generic node class [using generics]
public class Node<T> {
	T data;
	Node<T> next;
	
	Node(T data) {
		this.data = data;
		next = null;
	}
}
//next is going to refer to only node whose type is same as the type of the present node

