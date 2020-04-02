package com.qa.main;

public class arrayMethods {

	int testArray[] = {1,2,3,4,5,6,7,8,9,10}; //chunkyboiiiiiiii
	int filledByLoop[]= new int[10];
	int count=1;
	int count2=1;
	
	

	
	public int[] timeToFillArray(){
		int multiplesOfTen[] = new int[10];
		
		for(int i = 0; i <= filledByLoop.length -1; i++){
				
				filledByLoop[i] = count++;
				System.out.println(filledByLoop[i]);

				
				for(int j = 0; j <= filledByLoop.length-1; j++){
					count2=count-1;
					filledByLoop[i] = count2 * 10;
					multiplesOfTen[i] = filledByLoop[i] * 10;
					
				}
				
				
				System.out.println(filledByLoop[i]);
				//System.out.println("And if you multiply that by 10 then you get: " + multiplesOfTen[i]);
		}
	
		return filledByLoop;
	}
	
}
