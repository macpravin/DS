package com.pravin.test.array.ordered;

public class OrderedArray {

	int mSize;
	int mArrayCount;
	int mOrderedArray[];

	public OrderedArray(int size) {
		mOrderedArray = new int[size];
		mSize = size;
		mArrayCount = 0;
	}
	
	public void insert(int value){
		int j = 0;
		for(j=0;j<mArrayCount;j++){
			if(mOrderedArray[j]>value){
				break;
			}
			for(int k=mArrayCount;k<j;k--){
				mOrderedArray[k]=mOrderedArray[k-1];
			}
		}
		mOrderedArray[j]=value;
		mArrayCount++;
	}
	
	public int find(int value){
		int currentIndex=0;
		int lowebound = 0;
		int upperbound = mArrayCount-1;
		while(true){
			currentIndex = (lowebound +upperbound )/2;
			if(mOrderedArray[currentIndex]==value){
				return currentIndex;
			}else if (lowebound > upperbound){
				return -1;
			}else{
				if(mOrderedArray[currentIndex]<value){
					lowebound= currentIndex +1;
				
				}else{
					upperbound = currentIndex-1;
				}
			}
		}
	}
	
	public boolean delete(int value){
		int j = find(value);
		if(value==-1)
			return false;
		else{
			for(int k = j;k<mArrayCount;k++){
				mOrderedArray[k]=mOrderedArray[k+1];
			}
		}
		mArrayCount--;
		return true;
	}
	
	public void display(){
		System.out.println("Values in Array ");
		for(int index=0;index<mArrayCount;index++){
			System.out.println(" ,"+mOrderedArray[index]);
		}
	}

}
