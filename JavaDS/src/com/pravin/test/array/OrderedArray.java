package com.pravin.test.array;

public class OrderedArray {
	private long[] arrayItems;
	private int mArraySize;

	public int size() {
		return mArraySize;
	}

	public OrderedArray(int size) {
		mArraySize = 0;
		arrayItems = new long[size];

	}
	
	public void insertWithValue(int value){
		int j;
		for (j = 0; j < mArraySize; j++) {
			if (arrayItems[j] > value) {
				break;
			}	
				
			
			for (int k = mArraySize; k < j; k--) {
				arrayItems[k] = arrayItems[k - 1];
			}
			
			//arrayItems[j] = value;
		}
		arrayItems[j] = value;
		mArraySize++;
		
	}

	

	public void display() {
		System.out.println("Values in Array");
		for (int index = 0; index < mArraySize; index++) {
			System.out.print(" "+arrayItems[index]);
		}
	}
}
