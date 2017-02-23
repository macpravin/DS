package com.pravin.test.stack.reverse;

public class StackX {
	int maxSize = 0;
	char[] stackArray;
	int top = -1;

	public StackX(int size) {
		stackArray = new char[size];
		maxSize = size;
	}
	
	public void push(char value){
		stackArray[++top]=value;
	}
	
	public char pop(){
		char value = stackArray[top--];
		return value;
	}
	
	public boolean isEmpty(){
		return top<0;
	}
	
	public boolean isFull(){
		return top==maxSize;
	}
	
	public char peek(){
		return stackArray[top];
	}
	
	
}