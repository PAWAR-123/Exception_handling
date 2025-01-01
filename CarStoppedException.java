package Excepton;

public class CarStoppedException extends RuntimeException {
	
	public CarStoppedException() {
		
		
	}
	
	public CarStoppedException(String message) {
		super(message);
	}

}
class CarPunctureException extends Exception{
	
	public CarPunctureException() {
		
	}
	public CarPunctureException(String message) {
		
		super(message);
	}
	
}
class  CarHeatException extends  Exception{
public 	 CarHeatException() {
	
}

public  CarHeatException( String message ) {
	super(message);
}
	
}
class CarTest {
	public static void   stop(String name) throws CarStoppedException{
		
		if(name.equals("stop")) {
			throw new CarStoppedException("Car stopped for some reason.");
		}
			System.out.println("Car not stalled");
			
		
		
		
	}
	
 public static void puncture(String name) throws CarPunctureException {
	
	 if(name.equalsIgnoreCase("puncture")) {
		 throw new CarPunctureException("car is puncture "); 
	 }
		 System.out.println("car not puncture ");
		 
	 }
	
	 
 
 public static void carHeat( Integer  degree) throws CarHeatException {
	 if(degree.equals(60)) {
		 throw new CarHeatException("car is heat"); 
	 }
	  
		 System.out.println(" normal car heat");
	 
	 
 }
	
	
	
}
