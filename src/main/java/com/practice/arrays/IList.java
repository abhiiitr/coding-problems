package com.practice.arrays;

public interface IList<T> {

	void add(T t);

	T remove(int index);

	int size();

	T get(int i);
	
	int capacity();
	
	boolean isEmpty();

}
