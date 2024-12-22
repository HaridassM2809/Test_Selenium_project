package multiDim_Array;

public class MultiDim_Array {

//	* Nested arrays are nothing but multi dimensional array
//	* 2D array - array of arrays
//	* 3D array - array of 2D arrays
//	* In Multidimensional array, length is nothing but "row size".
//	* To print multidimensional array, we rely on for loops. We can not use simple sysout and Arrays class methods
//	* While printing multi-dimensional/jagged array using for loop, column size is rely on row of array

	public static void main(String[] args) {
		String str[][] = { { "Hari", "Dass", "Harish" }, { "Raxlin", "Sharala", "RaxSha" }, { "Avi", "John", "Jane" } };

//		or

//		int a1[]= {10,20,30};
//		int a2[]= {11,22,33};
//		int a3[]= {21,31,41};
//		
//		int a[][]= {a1,a2,a3};

//		for (String[] each: str) {
//			System.out.println(each);    // we can't print array value using for each
//		}
		for (int i = 0; i <= str.length - 1; i++) {
			for (int j = 0; j <= str[i].length - 1; j++) {
				System.out.println(str[i][j]);

			}
		}

		System.out.println("Print multi dim array using method");
		MultiDim_Array obj = new MultiDim_Array();
		obj.printMultiDimArray(str);

	}

	public void printMultiDimArray(String[][] array) {
		for (String[] eachArr : array) {
			for (String eachVal : eachArr) {
				System.out.println(eachVal);
			}
		}
	}

}
