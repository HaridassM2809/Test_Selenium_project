package thisAndSuper_keyword;

public class ThisKeywordEx {

	int ab = 10;
	static String str = "Hari";

	public static void main(String[] args) {
//		this.method1();  // can't use this keyword in static method

		ThisKeywordEx obj1 = new ThisKeywordEx();
		obj1.method1();
	}

	public void method1() {
		System.out.println("Method1 in ThisKeywordEx");
//		here we have 3 options to call the non-static method
		ThisKeywordEx obj = new ThisKeywordEx();
		obj.method2(0);
		System.out.println(obj.ab);
		System.out.println("$$$$$$$$$$$$$$$$$$$");
//		calling non-static method in non static method, so we can call directly
		method2(0);

		System.out.println("$$$$$$$$$$$$$$$$$$$");
//		we can use this keyword to call non-static method
		this.method2(0);
	}

	public void method2(int ab) {
		System.out.println(ab); // this will print local variable only but i need class vari with same vari name

//		here we can use this keyword
		System.out.println(this.ab);
	}
}
