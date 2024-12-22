package switchCase;

public class TestSwitchCase {

//switch(intCondition) {
//case 1:
//content
//content
//case 2:
//diff content
//diff content
//case 3: 
//another diff content
//another diff content 
//
//}

	public static void main(String[] args) {
		TestSwitchCase obj = new TestSwitchCase();
		obj.yamahaBike("");
		obj.yamahaBike("FZ_version4");
		obj.yamahaBike("FZ_version2");

	}

	public void yamahaBike(String bikeversion) {
		switch (bikeversion) {
		case ("FZ_version2"):
			System.out.println("Yamaha FZ version 2");
		case ("FZ_version3"):
			System.out.println("Yamaha FZ version 3");
		case ("FZ_version4"):
			System.out.println("Yamaha FZ version 4");
		default:
			System.out.println("Yamaha RX 100");
		}

	}

}
