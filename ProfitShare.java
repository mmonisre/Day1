package com.capgemini.java.operartors;
import java.util.Scanner; 

public class ProfitShare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int share,total_ratio;
		
		System.out.println("profit_amt");
		int profit =sc.nextInt();
		System.out.println();
		int Ramratio = sc.nextInt();
		System.out.println();
		int Gopratio = sc.nextInt();
		System.out.println();
		
		
		int Samratio = sc.nextInt();
		
		
		total_ratio = Ramratio+Gopratio+Samratio;
		share = profit/total_ratio;
		double ram = share*Ramratio;
		double gop = share*Gopratio;
		double sam = share*Samratio;
		
		System.out.printf("%.2f %n", ram);
		System.out.printf("%.2f %n",gop);
		System.out.printf("%.2f %n",sam);
	
		
		
 
	}

}
