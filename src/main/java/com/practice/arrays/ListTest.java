package com.practice.arrays;

public class ListTest {
	public static void main(String[] args) {
		IList<Integer> list = new ListImpl(2);
		list.add(1);
		list.add(2);
		// Resizing happens
		list.add(3);
		list.add(4);
		// Resizing happens
		list.add(5);

		System.out.println("Total elements:" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
