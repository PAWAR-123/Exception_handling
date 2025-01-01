package Excepton;

import java.util.Scanner;
import java.util.*;

public class SimpleExceptionDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		 try {
	        
	            System.out.print("Enter the first integer (a): ");
	            int a = scanner.nextInt();

	            System.out.print("Enter the second integer (b): ");
	            int b = scanner.nextInt();

	   
	            System.out.println("You entered a = " + a + " and b = " + b);
	}catch(java.util.InputMismatchException e) {
		System.out.println(e);
	    System.out.println("Message: " + e.getMessage());
	    System.out.println("String representation: " + e.toString());
	    e.printStackTrace();
		
	}
		 finally{
			 scanner.close();
			}
		 System.out.println("program end");
	
		 
	}


}
