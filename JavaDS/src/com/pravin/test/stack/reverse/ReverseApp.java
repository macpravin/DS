package com.pravin.test.stack.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {
	
	
	
	public static void main(String[] args){
		 String mInput="";
		
		String mOutput;
		System.out.println("Enter the String to Reverse:");
		try {
			mInput = getString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Reverse reverse = new Reverse();
		String output = reverse.doReverse(mInput);
		System.out.println("Output "+output);
		
		
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
