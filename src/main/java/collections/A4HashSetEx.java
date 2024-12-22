package collections;

import java.util.HashSet;

//*HashSet is an unordered collection and doesn't maintain any order
//	*but we can predict it in LinkedHashSet
/* HashSet
	 * 	It implements Set Interface. 
	 *  It is backed by a hash table, (actually a HashMapPractice instance).
	 *  This class permits only one null element.
	 * 	Its not synchronized
	 * 	Does not maintain order
	 * 	Declaring HashSet
	  		HashSet set = new HashSet();
			Set set0 = new HashSet();
			HashSet<String> set1 = new HashSet<String>();
			HashSet<String> set2 = new HashSet<String>(12);
			HashSet<String> set3 = new HashSet<String>(set2);
			HashSet<String> set3 = new HashSet<String>(new ArrayList<String> AL);
			HashSet<String> set4 = new HashSet<String>(12, 0.75f);
			Set s = Collections.synchronizedSet(new HashSet(...));
	 *	Useful methods in Hashset
	 * 		All the methods declared in Collection and Set interfaces are implemented in this class and along with that we have below methods
	 *  * 		clone();
	 * 			Since CLone() method returns Objects, we need to cast Object to HashSet
Useful methods in Collection interface
	* size();
	* isEmpty();
	* contains(Object o)
	* toArray();
	* toArray(T[] a);
	* add(E e);
	* remove(Object o);
	* containsAll(Collection<?> c)
	* addAll(Collection<? extends E> c);
	* removeAll(Collection<?> c);
	* removeIf(Predicate<? super E> filter)
	* retainAll(Collection<?> c);
	* clear();
	* equals(Object o);
	* Spliterator<E> spliterator();
	* Stream<E> parallelStream();
Useful methods in Set Interface
	* DOES NOT ALLOW DUPLICATE ELEMENTS
	* Only one Null is allowed
	* Classes which extends SET Interface are HashSet, LinkedHashSet, TreeSet(Also implements SortedSet)
	* Useful methods 
	* 	includes all methods in Collection interface
	* 	of()
	* 	of(E e1)
	* 	of(E e1, E e2)
	* 	of(E... elements)
	* 	copyOf(Collection<? extends E> coll)
	* 
	* Classes which implements Set interface does not have many inbuilt methods
	* So in order to do various operations on Set, we need to convert them into List
	 */

public class A4HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> hst = new HashSet<Integer>();

		hst.add(10);
		hst.add(20);
		hst.add(null);
		hst.add(30);
		hst.add(10);
		hst.add(0);
		System.out.println(hst);

		System.out.println("&&&this contain method will check the value present or not in the set&&&");
		System.out.println(hst.contains(null));
		System.out.println(hst.contains(20));
		System.out.println(hst.contains(22));

		HashSet<String> hsts = new HashSet<String>();
		hsts.add("Hari");
		hsts.add("100");
		hsts.add(null);
		System.out.println(hsts);
		System.out.println(hst.equals(hsts));
		System.out.println(hst.equals(hst));
		System.out.println(hsts.remove(null));
		System.out.println(hsts);

	}

}
