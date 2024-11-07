package com.capgemini.java.operartors;
import java.util.Scanner; 

public class NumberinWords {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");

		int n = sc.nextInt();
		
		if(n==0)
			System.out.println("zero");
		else 
			//System.out.println("output: ");
		    numbers(n);
		    
			sc.close();
		    
	}
		    
	public static void numbers(int n)		
	{
		
		if(n==0)
			return;
		else if(n<10)
		{
			
		  switch(n) {
		  
		    case 0:
			   System.out.println("zero");
			break;
			case 1:
				System.out.println("one");
			break;
			case 2:
				System.out.println("two");
			break;
			case 3:
				System.out.println("three");
			break;
			case 4:
				System.out.println("four");
			break;
			case 5:
				System.out.println("five");
			break;
			case 6:
				System.out.println("six");
			break;
			case 7:
				System.out.println("seven");
			break;
			case 8:
				System.out.println("eight");
			break;
			case 9:
				System.out.println("nine");
			break;
		   }
		}
		  else
		  {
			  numbers(n/10);
			  int digit = n % 10;
			  
			  switch(digit)
			  {
			  case 0:
				   System.out.println("zero");
				break;
				case 1:
					System.out.println("one");
				break;
				case 2:
					System.out.println("two");
				break;
				case 3:
					System.out.println("three");
				break;
				case 4:
					System.out.println("four");
				break;
				case 5:
					System.out.println("five");
				break;
				case 6:
					System.out.println("six");
				break;
				case 7:
					System.out.println("seven");
				break;
				case 8:
					System.out.println("eight");
				break;
				case 9:
					System.out.println("nine");
				break;
			   }
			  }
		  }
		
		
	}


