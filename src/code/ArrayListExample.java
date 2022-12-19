package code;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Collection (I) --> iList(I), ii.Set(I) iii.Queue(I) iv.Map(I)
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add("Vinoth");
		al.add(null);
		al.add(1,60);
		al.remove(2);
		System.out.println(al);
	}

}
