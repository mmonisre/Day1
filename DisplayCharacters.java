package com.capgemini.java.operartors;
import java.util.Scanner; 

public class DisplayCharacters {

	public static void main(String[] args) {
		System.out.println("Enter 4 values:");
		Scanner sc = new Scanner(System.in);
		
		// System.out.println();
		
		for(int i=0; i<4; i++) {
			int value = sc.nextInt();
			
			char ch = (char)(value);
			System.out.println(value +  "-" + ch);	

		}
		
		sc.close();

	}

}
