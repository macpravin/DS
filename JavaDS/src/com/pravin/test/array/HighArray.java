package com.pravin.test.array;

public class HighArray {
	
	private int mArrayItems[];
	
	private int itemSize=0;
	
	public HighArray(int max){
		itemSize = max;
		mArrayItems = new int[max];
	}
	
	public void insert(int index,int value){
		mArrayItems[index]=value;
		itemSize++;
	}
	
	public boolean delete(int value){
		for (int index = 0; index < mArrayItems.length; index++) {
			if (mArrayItems[index] == value) {

				for (int k = index; k < mArrayItems.length; k++) {
					mArrayItems[k] = mArrayItems[k + 1];
				}
				return true;
			}
		}
		return false;
	}
	
	public boolean deleteAsPerBook(int value){
		int j;
		for(j=0;j<itemSize;j++){
			if(value==mArrayItems[j]){
				break;
			}
			if(j==itemSize)
				return false;
			else{
			for(int k=j;k<itemSize;k++){
				mArrayItems[k]=mArrayItems[k+1];
			}
			itemSize--;
			return true;
			}
		
		}
		return false;
	}
	
	
	
	public boolean search(int value){
		for(int index=0;index<mArrayItems.length;index++){
			if(mArrayItems[index]==value){
				return true;
			}
		}
		return false;
	}
	
	public void display(){
		System.out.println("Data in Array ");
		for(int index=0;index<mArrayItems.length;index++){
			System.out.print("index : "+ mArrayItems[index]+ " , ");
		}
	}
	
	
	
	
	

}
