package Excepton;

import java.util.Scanner;

public class AreaCalculator {
	
	public  static double  calculateArea (double length, double width) {
	
		if(length<=0 || width<=0)
		{
			throw new IllegalArgumentException();
		}
        	 double result =length * width;
        	 return result; 
	 }
public static void main(String[] args) {
	
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle ");
		double length=sc.nextDouble();
		System.out.println("enter the width of the rectangle sir ");
		double width=sc.nextDouble();
	   System.out.println(" rectangle Area is : "+calculateArea(length,width ));
	}
	catch(IllegalArgumentException e) {
		System.out.println(e);
		System.out.println(e.getMessage());
		System.out.println(e.toString());
		e.printStackTrace();
		
	}
}
}
