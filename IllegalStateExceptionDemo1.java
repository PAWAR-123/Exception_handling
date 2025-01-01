package Excepton;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class IllegalStateExceptionDemo1 {
	
	
	public static void throwIllegalException( ) {
		try {
			throw new IllegalStateException("MyException");	
		}
		catch(IllegalStateException objA) {
			System.out.println("cautht exception "+objA);
			
		}
		
		
	}

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	try {
		Connection con=DriverManager.getConnection("");	
	}catch(Exception e) {
		
	}
		
		
	throwIllegalException();	

	}


}
