package com.javaPractisePrograms;

public class RemoveJunkCharacters {

	public static void main(String[] args) {
		
		//Regular expression [^a-zA-Z0-9]
		
		String s1 ="@@@%%^^&(%$123456lakshmanKokku@#$%";
		
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);

	}

}
