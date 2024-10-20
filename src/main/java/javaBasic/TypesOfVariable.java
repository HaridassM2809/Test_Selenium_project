package javaBasic;

public class TypesOfVariable {
	
//local variable
	public static void main(String[] args) {
		int a =10; //local variable
		System.out.println(a);
	}
	
//Class variable //mostly class var is non-static variable
    int a1 = 10;  //class variable
    String b = "Hello"; //class variable
    private static void main2(String[] args) {
//    	System.out.println(a1); //you can't call class non-static var in a static method without object creation
    }
    
//how to call class variable inside a non-static method
    boolean a2 = true;
    char b2 = 'H';
    protected void main3(String[] args) {
    	System.out.println(a2);
    	System.out.println(b2);
    }
    
//how to call class variable inside a static method
    
}