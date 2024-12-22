package scannerEx;

import java.util.Scanner;

public class TestScannerEx {

	public static void main(String[] args) {
		TestScannerEx obj = new TestScannerEx();
		obj.bikeshowroom();

	}

	public void bikeshowroom() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello.., Welcome to RK bike showroom");
		System.out.print("Please Enter the bike which you want:");
		String str = sc.next();
		if ("Duke".equalsIgnoreCase(str)) {
			System.out.println("Show duke bike and price details");
		} else if ("RoyalEnfield".equalsIgnoreCase(str)) {
			System.out.println("Show RoyalEnfield bike and price details");
		} else {
			System.out.println("Show Hero and Yamaha bike and price details");
		}
	}

}
