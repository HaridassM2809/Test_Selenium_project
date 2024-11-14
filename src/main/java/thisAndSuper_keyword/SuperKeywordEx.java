package thisAndSuper_keyword;

public class SuperKeywordEx extends Parent_super{
	
	int a1 = 20;
	String str ="Hari";
	
//	this is like a method override from parent_super class
	@Override
	public void method1() {
		System.out.println("method1 from SuperKeywordEx class");
	}
	public void methodEX() {
		System.out.println(a1);
		System.out.println(str); //this will print class var from superkeywordex but I want Parent_super

//		we can use super keyword to call non static method/vari on parent class
		System.out.println("*******************************");
		System.out.println(super.a1);
		System.out.println(super.str);
		super.method1();
		super.methodA1();
	}

	public static void main(String[] args) {
	
		SuperKeywordEx obj = new SuperKeywordEx();
		obj.methodEX();		
	}

}
class Parent_super{
	int a1 = 200;
	String str ="Harish";
	
	public void method1() {
		System.out.println("method1 from Parent_super class");
	}
	public void methodA1() {
		System.out.println("methodA1 from Parent_super class");
	}
}
