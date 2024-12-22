package array_Basics;

//* Arrays is a utility class to manipulate array or arrays
//* Arrays class has only one constructor which is private. So we cant create object for this class.
//* Since Arrays constructor is private, all the methods in this class are created as static
//* Important methods of Arrays Class
//		* sort(arrayName);
//		* sort(arrayName, startIndex, endIndex);
//		* parallelSort();
//		* equals(array1, array2);
//		* compare(array1, array2);
//		* copyOf(arrayName, length);
//		* copyOfRange(arrayName, startIndex, endIndex);
//		* fill(arrayName, valueToBeFilled);
//		* mismatch(array1, array2);

public class Ex_array {

	public static void main(String[] args) {

		Ex_array obj = new Ex_array();
		obj.arrayMethod1();

	}

	public void arrayMethod1() {

		Ex_array obj1 = new Ex_array();

		int arr[] = new int[4];

		arr[0] = 10;
		arr[1] = 20;
		arr[3] = 50;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		System.out.println("Length of the array was :" + arr.length);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");

		char arr1[] = new char[4];
		arr1[0] = 'a';
		arr1[3] = 'd';
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Show arr [" + i + "] index value of: " + arr1[i]); // this loop will show the array
																					// index values
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//		Array cloned
		System.out.println("Clonned arr to arr2");
		int arr2[] = arr.clone();
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Show arr2 [" + i + "] index value of: " + arr2[i]); // this loop will show the array
																					// index values
		}

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("giving array as a parameter and printing array values");
		obj1.printArrayValuesUsingBasicForLoop(arr2);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
//		obj1.getGivenIndexValueFromArray(arr, 5);	 // it will exception because we have only index as 4 for arr.	

	}

	public void printArrayValuesUsingBasicForLoop(int[] arrayName) {
		System.out.println("Values in the array are: ");
		for (int i = 0; i < arrayName.length; i++) {
			System.out.println(arrayName[i]);
		}
	}

	public void getGivenIndexValueFromArray(int[] arrayName, int index) {
		System.out.println(arrayName[index]);

	}

}
