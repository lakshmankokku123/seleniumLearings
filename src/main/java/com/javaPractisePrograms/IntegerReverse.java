package com.javaPractisePrograms;

public class IntegerReverse {

	public static void main(String[] args) {
		
		int num=12345;
		
		int temp=0,rem=0;
		
		while(num>0) {
			
			temp=num%10;//1
			rem=rem*10+temp;
			num=num/10;
		}
		
		System.out.println("the reseverseof the number is " +rem);
	}

}
   