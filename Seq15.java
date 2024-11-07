package com.capgemini.java.operartors;
import java.util.Scanner; 


public class Seq15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of numbers in sequence:");
		int count = sc.nextInt();
		int i =1;
		int seq = 1;
		
		while(i<=count)
		{
			
			System.out.print(seq + " ");
			seq += 3;
			i++;		
		}
		
	 sc.close();
				
	}

}
