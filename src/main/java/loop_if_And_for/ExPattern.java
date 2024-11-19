package loop_if_And_for;

public class ExPattern {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
//				System.out.print("*"); //*****
				System.out.print("* "); // * * * * *
			}
			System.out.println();
		}
		
		System.out.println("########################");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i<j) {
					break;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("########################");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("########################");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" "); 
			}
			System.out.println();
			}
		
		System.out.println("########################");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" "); 
			}
			System.out.println();
			}
			
		System.out.println("########################");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i==j) 
					System.out.print("# ");
				else
					System.out.print(j+" "); 
			}
			System.out.println();
		}		
	}
}

