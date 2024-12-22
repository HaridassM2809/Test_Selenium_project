package thisAndSuper_keyword;

public class ThisMethodEX {

//	this();
	public ThisMethodEX() {
		this('B');
//		this("a");  // this keyword needs to use in first line on constructor, we can't use in second line
		System.out.println("I am the default constructor");
//		this();
	}

	public ThisMethodEX(char a) {
		this(1000);
		System.out.println("I am the int parameterized constructor");
	}

	public ThisMethodEX(int a) {
		System.out.println("I am the String parameterized constructor");
	}

	public static void main(String[] args) {
		ThisMethodEX obj = new ThisMethodEX();
		obj.buybike();
//		this.ThisMethodEX();
//		this();	

	}

	public void buybike() {
		System.out.println("I am buybike from ThisMethodEX class");
//		this();
	}

}
