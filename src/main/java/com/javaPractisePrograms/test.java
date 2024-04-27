package com.javaPractisePrograms;

public class test {
	
	//String is immutable 
	//There is no reverse method in String
	
	//String buffer is mutable class

	public static void main(String[] args) {
		
		String s1="Selenium";
		
		String s2="";
		
		String s3="";
		
		StringBuffer s4=new StringBuffer(s1);
		
		System.out.println(s4.reverse());
		
		char c1[]=s1.toCharArray();
		
		int len=s1.length();
		
		System.out.println(len);
		
		for(int i=len-1;i>=0;i--) {
			
			s2=s2+c1[i];
			s3=s3+s1.charAt(i);
			
		}
		
		System.out.println("The reverse of the string is " +s2);
		System.out.println("The reverse of the string is " +s3);

	}

}
