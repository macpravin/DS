package com.pravin.test.array;

public class LowArray {
	private double a[];
	
	private int size;
	
	public LowArray(int size){
		a =new double[size]; 
	}
	
	public void setElement(int index,double value){
		a[index]=value;
	}
	
	public double getElement(int index){
		return a[index];
	}
}
