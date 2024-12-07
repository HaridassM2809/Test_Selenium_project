package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class A3ArrayListClass {
	
/*	ArrayList can be declared as below
	ArrayList li = new ArrayList(); //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
	List list = new ArrayList();  //since it is a non-generic ArrayList, we can add any object such as Integer, String etc.,
	List<Integer> list1 = new ArrayList<Integer>(); //Generic ArrayList, we can only add Integer
//	int[] arr =new int[3];
	ArrayList<Integer> AI = new ArrayList<Integer>();
	ArrayList<String> AS = new ArrayList<String>(10); //Generic ArrayList, we can only add String
	ArrayList<String> AS1 = new ArrayList<String>(AS);
	ArrayList<String> AS2 = new ArrayList<String>(Set<String> s);
*/

	public static void main(String[] args) {
		ArrayList<Integer> AI = new ArrayList<Integer>();
		
		System.out.println("&&&&Add the values in the Arraylist&&&&");
		AI.add(20);
		AI.add(1, 40);
		AI.add(null);
		AI.add(20);
		AI.add(4, null);
		
		System.out.println(AI.size());
		System.out.println(AI);
		
		System.out.println("&&&&To get the values from the arraylist&&&&");
		System.out.println(AI.getLast());
		System.out.println(AI.getFirst());
		System.out.println(AI.get(1));
		
		System.out.println("Iterating ArrayList using basic for loop");
		for(int i=0; i<=AI.size()-1;i++) {
			System.out.println(AI.get(i));
		}
		
		System.out.println("Iterating ArrayList using for each loop");
		for(Integer foreach: AI) {
			System.out.println(foreach);
		}
		
		System.out.println("Iterating ArrayList using Iterator");
		Iterator<Integer> ite = AI.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("Iterate Arraylist using List Iterator");
		ListIterator<Integer> lite = AI.listIterator();
		System.out.println("List Iterator Has Previous method");
//		System.out.println(lite.hasPrevious());
//		System.out.println(lite.previous());
		System.out.println(lite.hasPrevious());
		while(lite.hasNext()) {
			System.out.println(lite.next());
		}
		
		while(lite.hasPrevious()) {
			System.out.println(lite.previous());
		}
		
		ArrayList<Integer> AI1 = new ArrayList<Integer>();
		
		System.out.println("&&&&Add the values in the Arraylist&&&&");
		AI1=(ArrayList<Integer>) AI.clone();
		for(Integer foreach: AI1) {
			System.out.println(foreach);
		}
		System.out.println("&&&&&");
		System.out.println(AI1.addAll(2, AI));
		for(Integer foreach1: AI1) {
			System.out.println(foreach1);
		}
		
		System.out.println("&&&&&&&&&&&&& String Array list &&&&&&&&&&&&&&");
		ArrayList<String> AIS = new ArrayList<String>();
		AIS.add("Harish");
		AIS.add(null);
		AIS.add("Hari");
		AIS.add("Dass");
		AIS.add("Harish");
		for(int i=0;i<AIS.size();i++) {
			System.out.println(AIS.get(i));
		}

	}

}
