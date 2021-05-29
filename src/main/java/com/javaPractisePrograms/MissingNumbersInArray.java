package com.javaPractisePrograms;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7};
		
		int len=a.length;
		System.out.println(len);
		int sum=0,temp=0;
		
		//trSystem.out.println(len);
		
		for(int i=0;i<len;i++) {
			
			sum=sum+a[i];
		}
		
		for(int i=1;i<=a[len-1];i++) {
			
			temp=temp+i;
		}
		
		System.out.println("missing number is " +(temp-sum));
		

	}

}
