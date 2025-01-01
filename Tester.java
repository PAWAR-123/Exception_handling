package Excepton;

import Excepton.ParentClass.ChildClass;

public class Tester {

	public static void main(String[] args) {
		ChildClass obj=new ChildClass();
		try {
			obj.loadingClass("");
		
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		

	}

}
