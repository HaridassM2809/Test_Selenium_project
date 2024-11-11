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

		String str1 = "* if my String is "+"Sathya"+", length - 6, index starts with 0. Then last index is 5 or I can say length -1;";
		String str3 = "* if my String is \"Sathya\", length - 6, index starts with 0. Then last index is 5 or I can say length -1;";
		System.out.println(str1);
		System.out.println(str3);
	}	
}  
//	  Immutable concept 
//	  It happens with String literals
//	 
//	String str = "Sathya";
//	String str1 = "Sathya";
//	String str2 = "Ranjith";
//
//	stack 		SCP
//	str			"Sathya" 
//	str1 		
//	str2 		Ranjith
//
//	str1 = str1 + str2;
//	str1 = SathyaRanjith
//
//	str - Sathya - SathyaRanjith
//
//
//	stack 		SCP
//	str			"Sathya" - 
//	str1 		SathyaRanjith
//	str2 		Ranjith
//
//	str = str + "abc"
//
//	stack 		SCP
//	str			"Sathyaabc" ("Sathya" obj is left alone in SCP)
//	str1 		SathyaRanjith
//	str2 		Ranjith
//
//				
//	String a = "new"; // memory location of new in SCP is 00;
//	a = a+"10";
//	a = new10; //memory location of new10 in SCP is 01; and "a" from Stack memory will point to this location.
//
//	* Now the "new" in SCP is not assigned to any variable in stack. 
//	* "new" - String object is not used by anyone;
//	* Unused objects in java is cleared by Garbage collector.
