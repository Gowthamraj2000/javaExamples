package code;

import java.util.HashSet;
import java.util.Iterator;
// Set(I) --> * No duplicate values.  *Insertion order is not preserved.
// HashSet(c),SortSet(c),LinkedHashSet(c),NavigableSet(c),TreeSet(c).
public class SetExamples {

	public static void main(String[] args) {
		/*LinkedHashSet(c) --> 
		 * * no dup values 
		 * * Insertion order is preserved.
	(it is combination of linklist abd set.)*/
		// TODO Auto-generated method stub
		HashSet al = new HashSet();
		al.add(10);
		al.add(20);
		al.add("palu");
		al.add(null);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
