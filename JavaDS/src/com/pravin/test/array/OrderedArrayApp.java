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
		orderedArray.insertWithValue(35);
		orderedArray.display();
		
		
		System.out.println("Find :"+orderedArray.find(35));
		System.out.println("Find :"+orderedArray.find(7));
		System.out.println("Find :"+orderedArray.find(8));
	
	}
}
