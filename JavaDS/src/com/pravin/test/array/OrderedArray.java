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
	
	public int find(long searchKey){
		int lowerbound =0;
		int upperBound = mArraySize-1;
		int currentIndex=0;
		while(true){
			System.out.println("Current Index"+currentIndex +"Lower :"+lowerbound + "Upper Bound "+upperBound);
			currentIndex = (lowerbound + upperBound)/2;
		
			if(arrayItems[currentIndex]==searchKey){
				return currentIndex;
			}
			else if (lowerbound>upperBound){
				return mArraySize;
			} else{
				if(arrayItems[currentIndex]<searchKey){
					lowerbound =currentIndex+1;	
				}else{
					upperBound = currentIndex-1;
				}
			}
		}
	}

	

	public void display() {
		System.out.println("Values in Array");
		for (int index = 0; index < mArraySize; index++) {
			System.out.print(" "+arrayItems[index]);
		}
	}
}
