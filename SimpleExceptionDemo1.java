package Excepton;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExceptionDemo1 {
	public static void main(String[] args) {
		 Scanner sc=null;
		try {
			 sc=new Scanner(System.in);
			 System.out.println("Enter the number a ");
			 int a=sc.nextInt();
			 System.out.println("enter the number b ");
			 int b=sc.nextInt();
			 int division=a/b;
			 System.out.println("result is "+division);
		}catch(ArithmeticException e) {
			System.out.println("invalid input type sir please check once again  ");
		System.out.println(e.getMessage()+e.getSuppressed());
	e.printStackTrace();
	e.toString();
			
		}
		catch(InputMismatchException e) {
			System.out.println("missmatch type ");
			e.getMessage();
			e.printStackTrace();
			e.toString();
		}
		finally {
			sc.close();
		}
	}
	

}
