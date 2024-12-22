package string;

public class StringImmutable {

	/*
	 * 
	 * Immutable concept It happens with String literals
	 * 
	 * String str = "Sathya"; String str1 = "Sathya"; String str2 = "Ranjith";
	 * 
	 * stack SCP str "Sathya" - str1 str2 Ranjith
	 * 
	 * str1 = str1 + str2; str1 = SathyaRanjith
	 * 
	 * str - Sathya - SathyaRanjith
	 * 
	 * 
	 * stack SCP str "Sathya" - str1 SathyaRanjith str2 Ranjith
	 * 
	 * str = str + "abc"
	 * 
	 * stack SCP str "Sathyaabc" ("Sathya" obj is left alone in SCP) str1
	 * SathyaRanjith str2 Ranjith
	 * 
	 * 
	 * String a = "new"; a = a+"10"; a = new10;
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String str = "Hari";
		String str1 = "Hari";
		String str2 = "Harish";

		System.out.println(str == str1);

		str1 = "Hari" + "dass";
		System.out.println(str == str1);

		String str3 = "hari";
		System.out.println("Hari".equals("hari"));
		System.out.println(str.equals(str3));
		System.out.println(str.equals("Hari"));

	}

}
