package com.capgemini.java.operartors;
import java.util.Scanner; 

public class DiceGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter value1:");
		int value1 = sc.nextInt();
		System.out.println("Enter value2:");
		int value2 = sc.nextInt();
		int output = (8-(value1+value2));
		
		if(value1 > 6 && value2 > 6)
			System.out.println("Invalid Input");
		else if(output < 8)
			System.out.println(Math.abs(output));
		else 
			System.out.println(2*output);
	}

}
