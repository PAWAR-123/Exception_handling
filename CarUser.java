package Excepton;

public class CarUser {

	public static void main(String[] args) {
		
		try {
			CarTest.stop("stop");
			CarTest.puncture("puncture");
			CarTest.carHeat(60);
	
		}catch(CarStoppedException e) {
			System.out.println(e.getMessage());				}
		catch(CarPunctureException e) {
			System.out.println(e.getMessage());
		}catch(CarHeatException e) {
		System.out.println(e.getMessage());		}

	}

}
