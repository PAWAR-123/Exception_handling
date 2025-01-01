package Excepton;

import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void handleExceptions( String str) {
		try {
			System.out.println("length of the nput strng "+str.length());
			
			int len=Integer.parseInt(str);
			System.out.println("convertng to number"+len);
			String nullCheck=null;
			System.out.println("Attempting to call method on a null string "+nullCheck.length());
		}catch(NullPointerException e) {
			System.out.println("numberformation exception  invalid  not a number ");
			e.printStackTrace();
	
		}catch(NumberFormatException e)
		{
			System.out.println("nullpointer attempted to operate on a null object");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a string to convert an integer ");
		String input=sc.nextLine();
		handleExceptions(input);

	}

}
