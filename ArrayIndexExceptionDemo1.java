package Excepton;

import java.util.Scanner;

public class ArrayIndexExceptionDemo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try(sc) {
			int arr[]=new int [2];
			System.out.println("print the value of index number "+arr[3]);
			System.out.println("try bloc end there ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
System.out.println(e.toString());			
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("any other error occured ");
		}
		
	}

}
