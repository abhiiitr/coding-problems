package com.practice.arrays;

public interface IList<T> {

	void add(T t);

	boolean remove(int index);

	int size();

	T get(int i);

}
