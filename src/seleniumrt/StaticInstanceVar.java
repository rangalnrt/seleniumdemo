package seleniumrt;

public class StaticInstanceVar extends Tempstatic{
	
	
	//local variable concept
//	void m1(){
//		int a=20;
//		int b=30;
//		System.out.println(a+b);
//	}
	//instance variables
	int a =30;
	int b=50;
	static int c=5;
	static int d=9;
	//instance method 
	void m2(){
		System.out.println(a);// direct access
		System.out.println(b);
		System.out.println(StaticInstanceVar.c);// static variables access using class name
		System.out.println(StaticInstanceVar.d);
		meanings();
	}
	
	//static method
	public static void main(String[] args) {
		StaticInstanceVar str = new StaticInstanceVar();
		str.m2();
		StaticInstanceVar.m3();
		meanings();
		m3();
		
	}
	
	static void m3(){
		StaticInstanceVar str = new StaticInstanceVar(); //access by using reference object
		System.out.println(str.a);
		System.out.println(str.b);
		System.out.println(StaticInstanceVar.c);
		System.out.println(StaticInstanceVar.d);
		meanings();
	}
	
	
}
