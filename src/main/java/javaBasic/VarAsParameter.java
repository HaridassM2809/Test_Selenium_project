package javaBasic;

public class VarAsParameter {

	public static void main(String[] args) {

		VarAsParameter ABC = new VarAsParameter();
		ABC.buyPen("Black", "Blue");
		ABC.fancyStore("Hamam",10,"Unruled",10);

	}
	public void buyPen(String penName, String pen) { // String datatype and var as parameterize
		System.out.println("Buy "+penName+" Pen and "+pen+" Pen");
	}
	public void fancyStore(String soapName, int soapAmt, String paper, int paperRuppes) { // String datatype and var as parameterize
		System.out.println("Buy "+soapAmt+" ruppes "+soapName+" soap and "+paper+" paper for "+paperRuppes+ " ruppes");
	}
	
}
