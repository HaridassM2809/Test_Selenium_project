package interfaceDetail_InJava;

public interface InterfaceA1 {
	int a = 20;
	static char b = 'c';

	public void buyPen();

	static public void buySoap() {
		System.out.println("Static method from A1");
	}

	default int buybike() {
		System.out.println("Non-Static method from A1");
		return 0;
	}

}
