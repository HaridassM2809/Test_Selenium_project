package blocks;

public class Static_Block {

	String str1;
	static {
		int a;
		a = 10;
		System.out.println(a);
		System.out.println("I'm static block");

		Static_Block obj = new Static_Block();
		obj.buyBike();
		System.out.println(obj.str1); // printed class level var

	}

	public static void main(String[] args) {
		System.out.println("I'm main method from Static_block class");

		Static_Block obj1 = new Static_Block();
		obj1.buyBike();

	}

	public void buyBike() {
		System.out.println("I'm non-static buybike method");
		String str = "Hari";
		System.out.println(str.toUpperCase());
		str1 = str; // assigned local var value to class var
	}

}
