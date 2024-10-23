package accessModifierA;

public class ClassA {

	int a = 10;
	public char b = 'B';
	private int c = 30;
	protected String d = "Hello World";

	static char aa = 'A';
	static public int bb = 20;
	static private String cc = "Forgot Pswd";
	static protected int dd = 40;

	public void method1() {
		
//Non-static class var we can directly call in non static method
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
//Static class var we can directly call in non static method		
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);		

	}

	public static void method2() {

//Non-static class var we can't directly call in static method without object creation. 
		ClassA ist = new ClassA();
		System.out.println(ist.a);
		System.out.println(ist.b);
		System.out.println(ist.c);
		System.out.println(ist.d);

//Static class var we can directly call in static method without object creation. 
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(dd);	

	}

}

