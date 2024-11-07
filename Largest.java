package com.capgemini.java.operartors;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int a = 250;
		int b = 540;
		int c = 3600;
		
		int lar = 0;
	//	lar = (a>b) ? a : b  ;
	//	lar = (lar > c) ? lar : c;
		
		lar = (a>b) ? (a>c) ? a : c : (b>c) ? b : c;
		
		System.out.printf("largest of (%d, %d, %d) = %d", a,b,c,lar);
		
		

	}

}
