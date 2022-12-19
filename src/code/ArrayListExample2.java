package code;
//AraayList with Iterator examples.
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
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
