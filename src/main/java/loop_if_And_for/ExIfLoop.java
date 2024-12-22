package loop_if_And_for;

public class ExIfLoop {

	int a = 200;
	String str = "HaRi";

	public static void main(String[] args) {

		ExIfLoop obj = new ExIfLoop();
		if (obj.a % 2 == 0) {
			System.out.println(obj.a + " is a even number");
		} else {
			System.out.println(obj.a + " is a odd number");
		}

		if (obj.str == "Hari") {
			System.out.println("String was matching");
		} else {
			System.out.println("String was not matching");
		}

	}
}
