package testNG_AnnotationsAndAttributes;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test
	public static void method1() {
		System.out.println(1/0);
	}
	
	@Test (dependsOnMethods = "method1")
	public static void method2() {
		System.out.println("Hello");
	}
	@Test
	public static void method3() {
		System.out.println("World");
	}

}
