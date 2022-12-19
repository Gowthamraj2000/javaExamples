package code;

import java.util.Iterator;
import java.util.LinkedList;
// List(I) --> *Allows duplicate values *Isertion order is preserved
public class LinkedListExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList al = new LinkedList();
		al.add(20);
		al.add(10);
		al.add("palu");
		al.add(null);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
