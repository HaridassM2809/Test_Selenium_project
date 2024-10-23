package accessModifierA;

public class ClassC {

	public void method5() {
		
//		We are calling/using non static variable from ClassA
//		So we need to create object for ClassA
		
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
//    	System.out.println(obj.c);
		System.out.println(obj.d);
		
//		We are calling/using static variable from ClassA and ClassC is not a sub class for ClassA
//		So we need to create object for ClassA
//    	Although we are calling Static class var we can't directly call in non static method because ClassC is not a sub class for ClassA 
		ClassA ist = new ClassA();
		System.out.println(ist.aa);
		System.out.println(ist.bb);
//		System.out.println(ist.cc);
		System.out.println(ist.dd);	
	}
	static public void method6() {

//		We are calling/using non static variable from ClassA
//		So we need to create object for ClassA
		
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
//   	System.out.println(obj.c);
		System.out.println(obj.d);
		
//		We are calling/using static variable from ClassA and ClassC is not a sub class for ClassA
//		So we need to create object for ClassA
//    	Although we are calling Static class var we can't directly call in non static method because ClassC is not a sub class for ClassA 
		ClassA ist = new ClassA();
		System.out.println(ist.aa);
		System.out.println(ist.bb);
//		System.out.println(ist.cc);
		System.out.println(ist.dd);
	}
}
