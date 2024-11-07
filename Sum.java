package com.capgemini.java.operartors;
import java.util.Scanner; 

public class Sum {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			
			
			System.out.print("enter first no:");
			int a = sc.nextInt();
			System.out.print("enter second no :");
			int b = sc.nextInt();
			
			int sum = a+b;
			System.out.println("sum : " + sum);
			System.out.println(a + "+" + b  + "=" + sum);	
			
		}

	}
