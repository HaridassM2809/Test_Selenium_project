package multiDim_Array;

public class Jagged_Array {

//	* Jagged array is nothing but, arrays of arrays but each arrays can have different column values
//	* In Jagged array, length is nothing but total rows
//	* We can not declare Jagged array as same as MultiDimentional array. We need to initialize jagged array while declaring itself.
//		* Because in multiDimentional array, column size is same across the arrays
//		* But in Jagged array, column size of each array may vary
//	* We can print jagged array by using for loops only. 
//	* We can not simply use sysout or Arrays class methods to print jagged array

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 50 };
		int b[] = { 21, 31, 42 };
		int c[] = { 54, 98 };

		int d[][] = { a, b, c };

//		for (int[] each : d) {
//			System.out.println(each);  // from this foreach loop we can't print the array value.
//		}

		System.out.println("Jagged array length will be always row size of that array ");
		System.out.println(d.length); // for jagged array row size is lenght ..,3
		System.out.println(d[0].length); // 4
		System.out.println(d[2].length); // 2

		System.out.println("To print Jagged array values using normal for loop");
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.println(d[i][j]);
			}

		}

	}

}
