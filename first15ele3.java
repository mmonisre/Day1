package com.capgemini.java.operartors;

import java.util.Scanner;

public class first15ele3 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		int N = 15;
		int fib[]= new int[N];
		 fib[0] =0;
		 fib[1] = 1;
		System.out.println("Print the fibonacci series upto " + N + " numbers:\n");

		 System.out.print(fib[0] + " " + fib[1] + " ");
		
	   for(int i =2; i<N; i++)
		{
			
			fib[i] = fib[i-1] + fib[i-2];
			System.out.print(fib[i] + " ");
					
		}
		
	// sc.close();

	}

}
