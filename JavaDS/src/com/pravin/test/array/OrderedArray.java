package com.pravin.test.array;

public class OrderedArray {
	private long[] arrayItems;
	private int mArraySize;
	
	public int size(){
		return mArraySize;
	}

public OrderedArray(int size){
		mArraySize =size;
		arrayItems = new long[size];
		
	}
	public void insert(long value){
		int j;
		for(j=0;j<mArraySize;j++){
			if(arrayItems[j]>value){
				break;
			}
			System.out.println("");
			for(int k=mArraySize;k>j;k--){
				System.out.println("K Value "+k +"J value"+j);
				arrayItems[k]=arrayItems[k-1];
			}
			arrayItems[j]=value;
		}
		mArraySize++;
	}
	
	public void display(){
		System.out.println("Values in Array");
		for(int index=0;index<mArraySize;index++){
		System.out.print("Index :"+index + "- >" + arrayItems[index]);
		}
	}
}
