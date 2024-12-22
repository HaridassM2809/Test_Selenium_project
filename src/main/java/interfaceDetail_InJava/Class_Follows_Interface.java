package interfaceDetail_InJava;

public class Class_Follows_Interface implements InterfaceA2_followsAnotherInterface {

//	if any class follows any interface, whatever the inherited Abstract/Boby less method will be automatically create inside class
	@Override
	public void buyPen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void buyEgg21() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bugGift22() {
		// TODO Auto-generated method stub

	}

	public void calling_MethodAndVariabe() {
		System.out.println(InterfaceA1.b);

		Class_Follows_Interface obj = new Class_Follows_Interface();
		obj.buybike(); // calling default method from InterfaceA1 with object creation
		obj.buyPen(); // calling non-static method from class_follows_Interfce with object creation
		InterfaceA1.buySoap(); // calling static method from InterfaceA1 with Interface_Name

		InterfaceA2_followsAnotherInterface.buyCar23(); // calling static method from InterfaceA2followsInterface with
														// Interface_Name
		obj.buyMobile24(); // calling default method from InterfaceA2followsInterface with object creation
		obj.buyEgg21(); // calling non-static method from class_follows_Interfce with object creation
		obj.bugGift22(); // calling non-static method from class_follows_Interfce with object creation

	}

	public void applePhone() {
		System.out.println("Apple showroom");

	}
}

class SuperMarket {
	public static void main(String[] args) {

		Class_Follows_Interface obj1 = new Class_Follows_Interface();
		obj1.applePhone();
		obj1.calling_MethodAndVariabe();
	}

}