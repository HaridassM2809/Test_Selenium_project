package javaBasic;

public interface V9Variables_Interface {

// whatever the class and static variable we mention in interface will be final variable in nature. we can't just declare the var,need to initiate 	

//	public int a;
	public int a = 10;
//	protected char b='H';  we can't use protected variable
//	private String c="Hari"; we can't use private variable
	Boolean d = true;

	static int e = 20;
	static public int f = 10;
//	static private char g=10;

	final int h = 10;

	public static void main(String args[]) {

		int a1 = 30;
		char b1;
//		a = 11; //we can't change final variable value 

//		a=a1; //we can't assign local variable value to a final class level variable
		System.out.println(a1);

	}

}
