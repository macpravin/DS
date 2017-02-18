package com.pravin.test.array;

public class OrderedArrayApp {
	public static void main(String[] args){
		OrderedArray orderedArray= new OrderedArray(10);
		orderedArray.insertWithValue(5);
		orderedArray.display();
		orderedArray.insertWithValue(7);
		orderedArray.display();
		orderedArray.insertWithValue(14);
		orderedArray.display();
		orderedArray.insertWithValue(24);
		orderedArray.display();
		orderedArray.insertWithValue(4);
		orderedArray.display();
	
	}
}
