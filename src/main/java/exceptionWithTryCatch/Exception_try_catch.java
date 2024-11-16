package exceptionWithTryCatch;

public class Exception_try_catch {

	public static void main(String[] args) {

		Exception_try_catch obj = new Exception_try_catch();


		try {
			obj.method1();
			
		} 
		catch (ArithmeticException d) {
			System.out.println(d.getMessage());

		}
		System.out.println("Hari");

	}
	public void method1() {
		int a = 10;
		int b = 0;
		int c;
		c = a / b; //exception occurs here, so it will not print below line 
		System.out.println("In c exception will occur");
		System.out.println(c);
	}

}
