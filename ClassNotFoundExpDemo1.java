package Excepton;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClassNotFoundExpDemo1 {
	
	public ClassNotFoundExpDemo1(String msg)  {
		try {
			
			 Class cl=Class.forName(msg);
			System.out.println(cl.getName());
			
		
		}catch(ClassNotFoundException e){
			System.out.println(e);
			System.out.println(e.toString());
		
			
		}
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the class name sir ");
	String name=sc.nextLine();
	ClassNotFoundExpDemo1 obj=new ClassNotFoundExpDemo1(name);
	System.out.println(obj);
	
	
	
	
}
}
