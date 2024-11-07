package com.capgemini.java.operartors;
import java.util.Scanner; 

public class sumofDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int N = sc.nextInt();
		int i = 1;
		int sum =0;
		
		while(i<N)
		{
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
		
		
	}

}
