package javaBasic;

public class V2VarAsReturnType {

	public static void main(String[] args) {
 
		V2VarAsReturnType obj = new V2VarAsReturnType();
		String pen = obj.buyPenReturnPen("Black");
		System.out.println(pen+ " Pen");
		
		//or
		System.out.println(obj.buyPenReturnPen("Black")+ " Pen"); //without declare string var we can call like this also
		
		//another method
		System.out.println("***");
		String a = obj.buyPenReturnPen(5);
		System.out.println(a);
		System.out.println("***");
		//or
		System.out.println(obj.buyPenReturnPen("5")+ " Pen");
		
		//another method
		int c = obj.buyPenReturnBalanceAmt(20);
		System.out.println(c);
		String b= obj.buyPenReturnPen(obj.buyPenReturnBalanceAmt(100)); //Calling 3rd and 4th method
		System.out.println(b);
		
		
	}
	public String buyPenReturnPen(String penName) { // String datatype and var as parameterize
		System.out.println("Buy "+penName+" Pen ");
		String pen = "Black";
		System.out.println("Buy "+pen+" pen");
		return pen;
		
	}
	public String buyPenReturnPen(int penRuppes) { // String datatype and var as parameterize
		System.out.println("Buy "+penRuppes+" Pen ");
		String pen = "Black";
		System.out.println("Buy "+pen+" pen");
		return pen;
	}
	public int buyPenReturnBalanceAmt(int penAmount) {
		System.out.println("Buy 5 rupee Black pen");
		int a = penAmount - 5;
		System.out.println("Return me Balance "+a+" ruppes");
		return a;
		
	}
}
