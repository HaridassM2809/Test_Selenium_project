package javaBasic;

public class V6BasicString {

	static String a ="10"; //declaration and initialization
	String b = "Hi"; //declaration and initialization
	static String c; //declaration
	String d; //declaration
	V6BasicString e; //declaration
	
	public static void main(String[] args) {
		V6BasicString obj = new V6BasicString ();
		
		obj.e = new V6BasicString(); //initialization
		System.out.println(a);
		System.out.println(obj.b);
		
		String f = "Hello"+ " World"; //initialized and declared local variable 
		obj.b =f; //Assigned local var value to class variable
		System.out.println(obj.b);
		
		String g = " Hello, Welcome to this new World! 'Thanks'..., @#\"EOM\"";
		c=g;
		System.out.println(c);

	}

}
