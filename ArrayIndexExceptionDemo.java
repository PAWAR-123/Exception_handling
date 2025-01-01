package Excepton;

public class ArrayIndexExceptionDemo {

	public static void main(String[] args) {
		try {
			
		
		int a[] = new int[2];
		System.out.println(a[1]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("An ArrayIndexOutOfBoundsException occurred.");
		
			System.out.println(" "+e.getMessage());
		
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println(e);
			
		}
	}

}
