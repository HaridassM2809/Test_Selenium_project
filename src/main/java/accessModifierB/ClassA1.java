package accessModifierB;

import accessModifierA.ClassA;

public class ClassA1 extends ClassA{
	
	public void method7() {
		
//		We are calling/using non static variable from ClassA
//		So we need to create object for ClassA

//		ClassA obj = new ClassA();
		
//		Since ClassA1 follows ClassA, 
//		ClassA1 can use variables/methods of ClassA directly.
//		No need to create object

//		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
		System.out.println(d);
		
		
//		System.out.println(aa);
		System.out.println(bb);
//		System.out.println(cc);
		System.out.println(dd);	
	}
	public static void method8() {

//		We are calling/using non static variable from Class10
//		So we need to create object for Class10

	ClassA obj = new ClassA();

//	System.out.println(obj.a);
	System.out.println(obj.b);
//	System.out.println(obj.c);
//	System.out.println(obj.d);
	
//	System.out.println(aa);
	System.out.println(bb);
//	System.out.println(cc);
	System.out.println(dd);		
	}
}
