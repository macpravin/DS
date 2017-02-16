package com.pravin.test.array;

public class HighArrayApp {
	
	public static void main(String[] args){
		HighArray highArray = new HighArray(10);
		highArray.insert(0, 10);
		highArray.insert(1, 20);
		highArray.insert(2, 30);
		highArray.insert(3, 40);
		highArray.insert(4, 50);
		highArray.insert(5, 60);
		highArray.insert(6, 70);
		highArray.insert(7, 80);
		highArray.insert(8, 90);
		highArray.insert(9, 100);
		
		System.out.println("Does the Device has 50 "+highArray.search(50));
		highArray.display();
		System.out.println("Does the Device has 110 "+highArray.search(110));
		highArray.deleteAsPerBook(50);
		highArray.display();
		
	}

}
