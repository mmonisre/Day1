package com.capgemini.java.operartors;
import java.util.Scanner; 

public class MovieTicketCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cost_king = 75;
		int cost_queen = 150;
		//double ticket_cost = 0;
		double discount = 0.1;
		double copdisc = 0.02;
		int ref_cost = 50;
		double total_cost = 0;
	
		
		System.out.println("Enter no.of tickets:");
		int tickets = sc.nextInt();
		sc.nextLine();
		
		if(tickets <5 || tickets >40)	
		{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
			return;
		}	
			
		System.out.println("Do you want refreshment:");
		String  ref = sc.nextLine();
		
		System.out.println("Do you have coupon code:");
		String  couponcode = sc.nextLine();
		
		System.out.println("Enter the circle:");
		String  circle = sc.nextLine();
		
		if( circle.equals("K"))
			total_cost = tickets * cost_king;
		else if(circle.equals("Q"))
			total_cost = tickets * cost_queen;
		else 
		 {
			System.out.println("Invalid input");
			return;
		 }

		if(couponcode.equals("Y"))
			total_cost -= total_cost * copdisc;
		if(tickets>20)
			total_cost -= total_cost * discount;
		
		if(ref.equals("Y"))
			total_cost += tickets * ref_cost;
			
		else 
			return;
		
		System.out.printf("ticketcost : %10.2f%n", total_cost);
		 

	}

}
