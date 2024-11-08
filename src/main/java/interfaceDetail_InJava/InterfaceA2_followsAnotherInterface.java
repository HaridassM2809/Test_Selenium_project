package interfaceDetail_InJava;

public interface InterfaceA2_followsAnotherInterface extends InterfaceA1 {
	
	public void buyEgg21();
	
	void bugGift22();
	
	public static int buyCar23() {
		System.out.println("Static method from A2 interface");
		return 0;
	}
	default char buyMobile24() {
		System.out.println("default method from A2 interface");
		return 0;
	}
}
