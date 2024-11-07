package com.capgemini.java.operartors;
import java.util.Scanner; 

public class FirstNno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value:");
		int N = sc.nextInt();
		for(int i=0; i<N; i++)
		{
			if(i%2!=0)
				System.out.print(i + " ");
			
		}
		
		sc.close();
	}

}
