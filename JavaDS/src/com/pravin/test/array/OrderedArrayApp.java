package com.pravin.test.array;

public class OrderedArrayApp {
	public static void main(String[] args){
		OrderedArray orderedArray= new OrderedArray(10);
		orderedArray.display();
		orderedArray.insert(10);
		orderedArray.insert(5);
		orderedArray.display();
	}
}
