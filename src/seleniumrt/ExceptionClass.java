package seleniumrt;

import java.util.Scanner;

public class ExceptionClass {

	static void status(int age) throws AgeException
	{
		if(age>21){
			System.out.println("eligible for marriage");
		}else
		{
			throw new AgeException("not eligible to marry");
		}
	}
	
	public static void main(String[] args) throws AgeException{
	
		Scanner s = new Scanner(System.in);
		System.out.println("enter u r age");
		int age = s.nextInt();
		ExceptionClass.status(age); 
	}

}
