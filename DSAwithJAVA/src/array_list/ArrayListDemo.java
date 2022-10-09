package array_list;

import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
//		To create an ArrayList
		ArrayList <Integer> list1 = new ArrayList <> (); 
		
//		To check or print size of the ArrayList
		System.out.println(list1.size());
		
//		To add element in the ArrayList
		list1.add(15);
		list1.add(20);
		list1.add(25);
		
		System.out.println(list1.size());
		
//		To read values
		System.out.println(list1.get(2));
		
//		Another option to add elements in the ArrayList
		//	list1.add(index, element);
		list1.add(2, 50);
		
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		
//		To print all the elements of the ArrayList
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		
		System.out.println();
		
//		To remove element
		list1.remove(1);
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) +" ");
		}
		
		System.out.println();
//		To set element in the ArrayList
		list1.set(1, 100);
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		
		System.out.println();
		
		
//		System.out.println(list1.get(4));// java.lang.IndexOutOfBoundsException
		//valid range of indices -> [0 to list1.size() - 1]
		
//		for each loop
		for(int element: list1) {//for each integer element in list1
			System.out.print(element + " ");
		}
		
		System.out.println();
		
//		To create an ArrayList of String
		ArrayList<String> list2 = new ArrayList <> ();
		
//		To check or print size of the ArrayList
		System.out.println(list2.size());
//		To add element in the ArrayList
		list2.add("I");
		list2.add("Myself.");
		
//		To read values
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
//		Another option to add elements in the ArrayList
		//	list1.add(index, element);
		list2.add(1, "Love");
		
//		To print all the elements of the ArrayList
		for(int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		
		System.out.println();
		
//		To remove element
//		list2.remove(1);
//		list2.remove(3);
		
//		To set element in the ArrayList
		list2.add("I am");
		list2.add("Ceo");
		list2.set(4,"a Coder.");
		
		for(int i = 0; i < list2.size(); i++) {
			if(i >= list2.size()-2) {
				System.out.print(list2.get(i) + " ");
			}
		}
		
		
		
	}
}

