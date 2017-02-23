package com.pravin.test.stack;

public class StackX {
	
	int[] stackArray;
	int top;
	
	public StackX(int size){
		stackArray = new int[size];
		top =-1;
	}
	
	public void push(int value){
		stackArray[++top]=value;
	}
	
	public boolean isEmpty(){
		return (top==-1);
		
	}
	
	public int pop(){
		
		return stackArray[top--];
	}
	
	public int peek(){
		return stackArray[top];
		
	}
	

}
