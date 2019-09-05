package com.practice.arrays;

public class ListImpl<T> implements IList<T> {

	private Object[] arr;
	private int currentIndex;
	private int size;

	public ListImpl() {
		this.size = 16;
		this.currentIndex = 0;
		arr = new Object[size];
	}

	public ListImpl(int size) {
		if (size < 1) {
			throw new RuntimeException();
		}
		this.size = size;
		this.currentIndex = 0;
		arr = new Object[size];
	}

	@Override
	public void add(T element) {
		if (currentIndex >= size) {
			size = 2 * size;
			Object temp[] = new Object[size];
			for (int i = 0; i < currentIndex; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
		arr[currentIndex++] = element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) {
		if (index < 0)
			throw new IllegalArgumentException("Index cannot be negative");
		Object temp[] = new Object[size];
		int j = 0;
		Object removedElement = null;
		for (int i = 0; i < currentIndex; i++) {
			if (i == index - 1) {
				removedElement = arr[i];
				continue;
			}
			temp[j++] = arr[i];
		}
		arr = temp;
		currentIndex--;
		return (T) removedElement;
	}

	@Override
	public int size() {
		return currentIndex;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		if (index >= currentIndex)
			throw new ArrayIndexOutOfBoundsException(index);
		return (T) arr[index];
	}

	@Override
	public int capacity() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return currentIndex == 0;
	}

}
