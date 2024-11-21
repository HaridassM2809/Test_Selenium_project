package array_Basics;

import java.util.Scanner;

public class GettingArrayInputFromUser {

	public static void main(String[] args) {
		GettingArrayInputFromUser obj = new GettingArrayInputFromUser();
		obj.getIntArrayFromUser(5);

	}

	public void getIntArrayFromUser(int arrayLength) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter " + arrayLength + " numbers");

		int arr[] = new int[arrayLength];

		int i;
		for (i = 0; i < arrayLength; i++) {
			arr[i] = scan.nextInt();  // this loop will get input from user
			}
		for(i=0;i<arrayLength;i++) {
			System.out.println("Show arr ["+i+"] index value of: "+arr[i]); // this loop will show the array index values
		}
//		System.out.println(arr[i]);

	}
	
}