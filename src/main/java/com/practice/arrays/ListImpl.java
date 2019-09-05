package com.practice.arrays;

public class ListImpl implements IList<Integer> {

	private int[] arr;
	private int currentIndex;
	private int size;

	public ListImpl() {
		this.size = 16;
		this.currentIndex = 0;
		arr = new int[size];
	}

	public ListImpl(int size) {
		if (size < 1) {
			throw new RuntimeException();
		}
		this.size = size;
		this.currentIndex = 0;
		arr = new int[size];
	}

	@Override
	public void add(Integer element) {
		if (currentIndex >= size) {
			size = 2 * size;
			int temp[] = new int[size];
			for (int i = 0; i < currentIndex; i++) {
				temp[i] = arr[i];
			}
			arr = temp;
		}
		arr[currentIndex++] = element;
	}

	@Override
	public boolean remove(int index) {
		return false;
	}

	@Override
	public int size() {
		return currentIndex;
	}

	@Override
	public Integer get(int i) {
		return arr[i];
	}

}
