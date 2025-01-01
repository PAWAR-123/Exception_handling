package Excepton;

public class ParentClass   {
	
	public static void loadingClass(String name) throws ClassNotFoundException {
		if(name.isEmpty()) {
		Class c=Class.forName(name);
		System.out.println("loadind suceesufull"+name);
	}
	
}
class ChildClass extends ParentClass{
	public static void loadingClass( String msg)  {
		if(msg==null || msg.isEmpty()) {
			throw new IllegalArgumentException("class not empty");
		}
	}
	
	
	}
    
		
	}

	



