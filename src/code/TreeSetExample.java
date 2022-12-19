package code;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet al = new TreeSet();
		al.add(10);
		al.add(20);
		al.add(8);
		al.add(67);
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
