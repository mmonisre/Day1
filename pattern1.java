package com.capgemini.java.operartors;
import java.util.Scanner;

class pattern1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int N = sc.nextInt();
		for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
