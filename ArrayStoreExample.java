package Excepton;

import java.util.Scanner;

public class ArrayStoreExample {
	
	public static void storeObjects()  {
		
		Object arr[]=new String[5];
		
			arr[0]="vikas";
			arr[1]="pawar";
			arr[2]=123;		
	}
	
	
public static void main(String[] args) {
	   
try {
	   storeObjects();
}catch(ArrayStoreException e) {
	System.out.println(e.getMessage());
	
}

				   
	  	
}
}
