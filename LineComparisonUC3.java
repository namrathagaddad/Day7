package com.bl.uc1;

import java.util.Scanner;

public class LineComparisonUC3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values: x1, x2, y1, y2, a1, a2, b1, b2");
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double a1 = scan.nextDouble();
		double a2 = scan.nextDouble();
		double b1 = scan.nextDouble();
		double b2 = scan.nextDouble();
		double len1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double len2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
		System.out.println("length is:" + len1);
		System.out.println("length is:" + len2);
		if (len1 == len2) {
			System.out.println("len1s are equal");
		} else {
			System.out.println("both lines are not equal");
		}	
	}

	public void compare ( double line1, double line2 ) {
	        if (line1 == line2) {
	            System.out.println ( "\nBoth lines are Equal" );
	        } else if (line1 > line2) {
	            System.out.println ( "\n line 1 is greater than line 2 " );
	        } else {
	            System.out.println ( "\nline 2 is greater than line 1" );
	        }
	    }
	

}
