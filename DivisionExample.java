package Excepton;

public class DivisionExample {
	
	public static int   performDivision ( int  dividend  , int  divisor) {
		if(divisor==0) {
			throw new ArithmeticException();
		}else {
			return ( dividend/divisor);
		}
		
		
	}
public static void main(String[] args) {
	
	try {
		System.out.println(performDivision(12, 1));
		
	}catch(ArithmeticException e){
		System.out.println(e);
		System.err.println("number not divided by zero sir please check once again ");
		System.out.println(e.toString());
		e.printStackTrace();
	}
	
	
	
}
}
