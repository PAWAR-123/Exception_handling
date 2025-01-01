package Excepton;

import java.util.Objects;

public class ClassCastExceptionDemo {
	
	
	public static void  handleClassCastException() {
		Object arr[]= {"Hello", true, "Java"};
		for(Object ar: arr) {
			String s=(String) ar;
		
				String str=  s;
				System.out.println(str);
			
				
				
			}	
		}
		
		
		
	
	public static void main(String[] args) {
		
		try {
		handleClassCastException();
		}catch(ClassCastException e) {
			System.out.println("invalid sir ");
			System.out.println("only string are valid sir ");
		
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
