package loop_if_And_for;

//for(initialize; condition; increment/decrement) {
//content
//}
//
//for(initialize; condition;) {
//	**content*****
//increment/decrement;
//}

public class ExForLoop {

	public static void main(String[] args) {
		
		System.out.println("Normal simple for loop");
		for (int i=1;i<=5;i++) {
			System.out.println("Value of i was "+i);
		}
		
//		***************************************************
		System.out.println("Nested for loop");
		
		for (int i=1;i<=5;i++) {
			for(int j=1; j<=5; j++) {
				System.out.println("Value of i was "+i);
				System.out.println("Value of j was "+j);
				System.out.println("******************");
			}
		System.out.println("Value of i was "+i);	
		}	
		
//		***********************************************
		System.out.println("for loop with if loop and break");		
		for (int i = 1; i <= 5; i++) {
		if(i==4) {  /// it will print upto 3 only then if i value reach 4 it break the loop 
		break;
		}
		System.out.println(i);
	}
		
//		**********************************
		System.out.println("for nested loop with if loop and break");
		for (int i = 1; i <= 5; i++) {
			System.out.println("i value is " + i);
		for (int j = 1; j <= 5; j++) {
			if (i == j) {
				break;
			}
			System.out.println("j value is " + j);
		}
	}

		System.out.println("for nested loop with if loop and continue");
		for (int i = 1; i <= 5; i++) {
			if (i == 2) {
				continue; // this means if condition passes then it will not print remain code it incre/decrement value and go to for loop
			} else {
				System.out.println("*" + i);
			}
			System.out.println("Hii");
		}

	}

}
