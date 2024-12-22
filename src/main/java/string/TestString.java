package string;

public class TestString {

	public static void main(String[] args) {

		// this loop will print the whole string in reverse
		String str = "I am Haridass";

		char[] strArr = str.toCharArray();
		System.out.println(strArr.length);
		String temp = "";
		for (int i = strArr.length - 1; i >= 0; i--) {
//			System.out.print(strArr[i]);
			temp = temp + strArr[i];
//			System.out.println(temp);
		}
		System.out.println(temp);

		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		// this loop will print eachword string in reverse
		String str1 = "OOPS stands for object oriented program language";
		String[] strArr1 = str1.split(" ");
		String temp1 = "";
		for (String eachword : strArr1) {
//			System.out.println(temp1);

			String temp2 = "";
			String[] eachletter = eachword.split("");
			for (int i = eachletter.length - 1; i >= 0; i--) {
				temp2 = temp2 + eachletter[i];
//				System.out.println(temp1);
			}
			temp1 = temp1 + temp2 + " ";
		}
		System.out.println(temp1);
	}

}
