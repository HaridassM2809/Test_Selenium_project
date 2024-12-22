package thisAndSuper_keyword;

public class SuperMethodEx extends ParentSuperMethod {

	public SuperMethodEx() {
		super();
		System.out.println("I am child class default constructor");
	}

	public SuperMethodEx(int a) {
		super(a);
		System.out.println("I am child class int parameterized constructor");
	}

	public SuperMethodEx(char ab) {
//		super();  //this super() was implicit(hidden) in constructor
		System.out.println("I am child class char parameterized constructor");
	}

	public static void main(String[] args) {
		SuperMethodEx obj = new SuperMethodEx();
		obj.method1();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");

		SuperMethodEx obj1 = new SuperMethodEx(10);
		obj1.method1();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&");

		SuperMethodEx obj2 = new SuperMethodEx('R');
		obj2.method1();
	}

	public void method1() {
		System.out.println("I am method1 from child class");
	}

}

class ParentSuperMethod {

	public ParentSuperMethod() {
		System.out.println("I am parent class default constructor");
	}

	public ParentSuperMethod(int a) {
		System.out.println("I am parent class int parameterized constructor");
	}

}
