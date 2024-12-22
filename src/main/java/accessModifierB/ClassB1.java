package accessModifierB;

import accessModifierA.ClassA;

public class ClassB1 {

	public void method9() {

		ClassA obj = new ClassA();

//		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);

//		System.out.println(ClassA.aa);
		System.out.println(ClassA.bb);
//		System.out.println(ClassA.cc);
//		System.out.println(ClassA.dd);	
	}

	static public void method10() {

		ClassA obj = new ClassA();

//		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c);
//		System.out.println(obj.d);

//		ClassA ist = new ClassA();
//		System.out.println(ClassA.aa);
		System.out.println(ClassA.bb);
//		System.out.println(ClassA.cc);
//		System.out.println(ClassA.dd);			
	}
}
