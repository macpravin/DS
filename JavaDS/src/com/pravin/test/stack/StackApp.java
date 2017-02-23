package com.pravin.test.stack;

public class StackApp {
	public static void main(String[] args){
		StackX stackX = new StackX(10);
		stackX.push(10);
		stackX.push(20);
		stackX.push(30);
		stackX.push(40);
		stackX.push(50);
		stackX.push(60);	
		stackX.push(70);
		while(!stackX.isEmpty()){
			System.out.print("Stack X"+stackX.pop());
		}
	}

}
