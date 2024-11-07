package com.capgemini.java.operartors;
import java.util.Scanner; 

public class ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int Num = sc.nextInt();
		int reversed_Num = 0;
		
		while(Num!=0)
		{
			int digit = Num % 10;
			reversed_Num = reversed_Num * 10 + digit;
			Num = Num/10;
		}
		System.out.print(reversed_Num);

		sc.close();
		

	}

}
