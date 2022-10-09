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
	}
}

