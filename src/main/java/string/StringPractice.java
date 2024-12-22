package string;

public class StringPractice {

	String str = "Harish";
	String str1 = "Haridass";
	String str2 = "";
	String str3 = "   ";
	String str4 = "Harish";

	public static void main(String[] args) {
		StringPractice obj = new StringPractice();
		System.out.println("Print String lenght...");
		obj.lenghtMethod();
		System.out.println("Print String isempty or not method...");
		obj.isEmptyMethod();
		System.out.println("Print String charAt index value...");
		obj.charAtMethod();
		System.out.println("Print String equal method...");
		obj.equalMethod();
		System.out.println("Print String equalIsIgnoreCase method...");
		obj.equalIsIgnoremethod();
		System.out.println("Print String contentequals method...");
		obj.contentequalsMethod();
	}

	public void lenghtMethod() {
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
	}

	public void isEmptyMethod() {
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());

	}

	public void charAtMethod() {
		System.out.println(str.charAt(3));
		System.out.println(str1.charAt(6));
	}

	public void equalMethod() {
		System.out.println(str.equals(str1));
		boolean equal = str.equals(str4);
		System.out.println(equal);
	}

	public void equalIsIgnoremethod() {
		boolean a = str.equalsIgnoreCase(str1);
		System.out.println(a);
		System.out.println(str.equalsIgnoreCase(str4));
	}

	public void contentequalsMethod() {
		System.out.println(str.contentEquals(str1));
		System.out.println(str.contentEquals(str4));
	}

}
