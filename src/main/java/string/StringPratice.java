package string;

public class StringPratice {
	
	String str = "Harish";
	String str1 = "Haridass";
	String str2 = "";
	String str3 = "   ";
	String str4 = "Harish";
	

	public static void main(String[] args) {
		StringPratice obj = new StringPratice();
		System.out.println("Print String lenght...");
		obj.lenghtMethod();
		System.out.println("Print String isempty or not method...");
		obj.isEmptyMethod();
		System.out.println("Print String charAt index value...");
		obj.charAtMethod();
		System.out.println("Print String equal method...");
		obj.equalMethod();
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

}
