package com.capgemini.java.operartors;
import java.util.Scanner; 

public class EvenNo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for X:");
		int X = sc.nextInt();
		System.out.println("Enter a number for Y:");
		int Y = sc.nextInt();
		System.out.print(" Even numbers between " + X + " and " + Y + " are :");
		
		for(int i=X; i<Y; i++)
		{
			if(i%2==0)
				System.out.print(i + " ");
			
			
		}
		sc.close();
		
    }

}
