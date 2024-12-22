package inheritance_In_Java;

public class InheritanceBasic extends ParentClass {

	String str = "Hari";
	static char a = 'M';

	public void method1() {
		System.out.println("Non-static method from method1 in InheritanceBasic");
	}

	public static int method2() {
		System.out.println("static method from method2 in InheritanceBasic with int return type");
		return 0;
	}

	public static void main(String[] args) {

//		Calling static and non-static methods from ParentClass without relation
		ParentClass obj = new ParentClass();
		System.out.println(obj.a1);

		obj.method11();

		System.out.println(ParentClass.str1);
		ParentClass.method22();

//	****************************************************

//		Calling static and non-static methods from InheritanceBasic class without relation
		InheritanceBasic obj1 = new InheritanceBasic();
		System.out.println(obj1.str);

		obj1.method1();

		System.out.println(a);
		method2();

//		***************************************************
//		When ParentClass and InheritanceBasic are in a relationship, means inheritance
		InheritanceBasic obj2 = new InheritanceBasic();
		System.out.println(obj2.str);

		obj2.method1();

		System.out.println(obj2.a1);

		obj2.method11();

	}

}

class ParentClass {

	static String str1 = "Dass";
	int a1 = 10;

	public void method11() {
		System.out.println("Non-static method from method11 in ParentClass");
	}

	public static void method22() {
		System.out.println("static method from method22 in ParentClass");
	}
}
