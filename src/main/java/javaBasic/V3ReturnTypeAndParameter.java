package javaBasic;

public class V3ReturnTypeAndParameter {

	public static void main(String[] args) {
		V3ReturnTypeAndParameter obj = new V3ReturnTypeAndParameter();
		System.out.println(obj.Method1(obj.Method2(null)));

//		Calling a non-static method into a static method and taking a parameter from another class non-static method
		ClassAA obj2 = new ClassAA();
		obj.Method1(obj2.Method3());

//		Calling a non-static method into a static method and taking a parameter from another class static method with string return type
		char z = obj.Method2(ClassAA.Method4());
		System.out.println(z);

	}

	public String Method1(char a) {
		String b = "Hari";
		System.out.println(b);
		return b;
	}

	public char Method2(String d) {
		return 'M';
	}

	public ClassAA Method2A() {
		return null;

	}
}

class ClassAA {

	int y = 10;

	public char Method3() {
		char c = 'M';
		return c;
	}

	public static String Method4() {
		return "Dass";

	}
}
