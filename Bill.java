package com.capgemini.java.operartors;
import java.util.Scanner; 

public class Bill {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		double prize_Pizza = 100;
		double prize_puff = 20;
		double prize_drinks = 10;
		
		System.out.println("Enter the no.of pizzas:");
		int qty_Pizza = sc.nextInt();
		System.out.println("Enter the no.of puffs:");
		int qty_Puffs = sc.nextInt();
		System.out.println("Enter the no.of drinks:");
		int qty_drinks = sc.nextInt();
		
		double cost_Pizza = qty_Pizza * prize_Pizza ;
		double cost_Puffs = qty_Puffs * prize_puff ;
		double cost_drinks = qty_drinks * prize_drinks ;
		double Total_cost = cost_Pizza + cost_Puffs + cost_drinks ;
			
		System.out.println("\nBill Details");
		System.out.println("-------------------------------------------------");
		System.out.printf("%-5s %-12s %-10s %5s %-10s%n", "SiNo", "Particulars", "Unit_Prize", "Qty", "Cost");		
		System.out.println("-------------------------------------------------");
		
		System.out.printf("%-5d %-12s %-10.2f %5d %6.2f%n", 01, "Pizza", prize_Pizza, qty_Pizza, cost_Pizza);
		System.out.printf("%-5d %-12s %-10.2f %5d %6.2f%n", 02, "Puff", prize_puff, qty_Puffs, cost_Puffs);
		System.out.printf("%-5d %-12s %-10.2f %5d %6.2f%n", 03, "drinks", prize_drinks, qty_drinks, cost_drinks);
		
		System.out.println("-------------------------------------------------");
		System.out.printf("%-5s %-15s %21.2f%n ", " ", "Total", Total_cost);
		System.out.println("-------------------------------------------------");

		System.out.println("Enjoy the SHOW!!!");	
		

		//System.out.printf("%d" ); 
		
		
		
	}

}
