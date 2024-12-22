package javaBasic;

public class StaticVariable {
	// Static variable always declared and initialized within class but outside the
	// method

	// Static var in a non-static method
	static char a1 = 'B';
	static short b1 = 10;

	public void main(String[] args) {
		System.out.println(a1);
		System.out.println(b1);
	}

	// Static var in a non-static method
	static char a2 = 'B';
	static short b2 = 10;

	private static void method1() {
		System.out.println(a2);
		System.out.println(b2);
	}
}
