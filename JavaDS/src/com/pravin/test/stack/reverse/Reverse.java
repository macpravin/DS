package com.pravin.test.stack.reverse;



public class Reverse {
    
	StackX stackX;
	private String mInput;
	
	private String mOutput;
	public void Reverse(String input){
		mInput = input;
	}
	
	public String doReverse(String input){
		mInput =input;
		int stackSize = mInput.length();
		stackX = new StackX(stackSize);
		for(int index = 0 ;index<mInput.length();index++){
			stackX.push(mInput.charAt(index));
		}
		mOutput="";
		while(!stackX.isEmpty()){
			char ch  = stackX.pop();
			mOutput = mOutput+ch;
		}
		return mOutput;
	}
	
}
