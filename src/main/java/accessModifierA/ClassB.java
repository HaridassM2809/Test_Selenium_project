package accessModifierA;

public class ClassB extends ClassA{
	public void method3() {
		
		
//		We are calling/using non static variable from ClassA
//		So we need to create object for ClassA
		ClassA obj = new ClassA();
		System.out.println(obj.a);
		System.out.println(obj.b);
//		System.out.println(obj.c); - WE CAN'T CALL PRIVATE VAR
		System.out.println(obj.d);
//		or
//		Since ClassB follows ClassA, 
//		ClassB can use variables/methods of ClassA directly except Private variable
//		No need to create object
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
		System.out.println(d);
		
//		Since ClassB follows ClassA, 
//		ClassB can use variables/methods of ClassA directly except Private variable
//		No need to create object
		System.out.println(aa);
		System.out.println(bb);
//		System.out.println(cc);
		System.out.println(dd);		
	
	}
	public static void method4() {

//		We are calling/using non static variable from ClassA, 
//		Although ClassB follows ClassA we can't call non static variable in static method without object creation
//		So we need to create object for ClassA 
		ClassA ist = new ClassA();
		System.out.println(ist.a);
		System.out.println(ist.b);
//		System.out.println(ist.c);
		System.out.println(ist.d);

//		Since ClassB follows ClassA, 
//      Static class var we can directly call in static method without object creation. 
		System.out.println(aa);
		System.out.println(bb);
//		System.out.println(cc);
		System.out.println(dd);	

	}

}
