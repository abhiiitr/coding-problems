package com.practice.arrays;

public class ListTest {
	public static void main(String[] args) {
		IList<Integer> list = new ListImpl<>(2);
		list.add(1);
		list.add(2);
		// Resizing happens
		list.add(3);
		list.add(4);
		// Resizing happens
		list.add(5);

		System.out.println("Before removal");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		// throws exception for out of bounds
		// System.out.println("Element at index 6:" + list.get(5));
		System.out.println("Total size before removal:" + list.size());
		System.out.println("Total capacity:" + list.capacity());
		System.out.println("Element at index 3:" + list.get(2));
		System.out.println("Removing Element at index 3:" + list.remove(3));
		System.out.println("Element at index 3 after removal:" + list.get(2) + "\n");
		
		System.out.println("Total size after removal:" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
