package com.pravin.test.array.ordered;

public class OrderedArrayApp {
	
	public static void main(String[] args){
		OrderedArray array = new OrderedArray(10);
		array.insert(50);
		array.insert(60);
		array.insert(70);
		array.insert(80);
		System.out.println("Binary Seach 40"+array.find(40));
		System.out.println("Binary Seach 80"+array.find(80));
		array.delete(70);
		array.display();
	}

}
