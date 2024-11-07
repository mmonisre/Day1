package com.capgemini.java.operartors;
import java.util.Scanner;

public class adddigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int Num = sc.nextInt();
		int sum = 0;
		while(Num!=0)
		{
			int digit = Num % 10;
			Num = Num/10;
			sum = sum + digit;
		}
		System.out.println(sum);
		
	}

}
